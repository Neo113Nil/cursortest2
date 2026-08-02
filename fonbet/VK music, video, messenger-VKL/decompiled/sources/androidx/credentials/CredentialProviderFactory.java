package androidx.credentials;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;
import xsna.zcl;

/* compiled from: CredentialProviderFactory.kt */
/* loaded from: classes.dex */
public final class CredentialProviderFactory {
    private static final String CREDENTIAL_PROVIDER_KEY = "androidx.credentials.CREDENTIAL_PROVIDER_KEY";
    public static final Companion Companion = new Companion(null);
    private static final int MAX_CRED_MAN_PRE_FRAMEWORK_API_LEVEL = 33;
    private static final String TAG = "CredProviderFactory";
    private final Context context;
    private boolean testMode;
    private CredentialProvider testPostUProvider;
    private CredentialProvider testPreUProvider;

    /* compiled from: CredentialProviderFactory.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CredentialProviderFactory(Context context) {
        this.context = context;
    }

    private final List<String> getAllowedProvidersFromManifest(Context context) {
        String string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString(CREDENTIAL_PROVIDER_KEY)) != null) {
                    arrayList.add(string);
                }
            }
        }
        return j5g.O0(arrayList);
    }

    public static /* synthetic */ CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(obj, z);
    }

    private final CredentialProvider instantiatePreUProvider(List<String> list, Context context) {
        Iterator<String> it = list.iterator();
        CredentialProvider credentialProvider = null;
        while (it.hasNext()) {
            try {
                CredentialProvider credentialProvider2 = (CredentialProvider) Class.forName(it.next()).getConstructor(Context.class).newInstance(context);
                if (!credentialProvider2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (credentialProvider != null) {
                        return null;
                    }
                    credentialProvider = credentialProvider2;
                }
            } catch (Throwable unused) {
            }
        }
        return credentialProvider;
    }

    private final CredentialProvider tryCreatePostUProvider() {
        if (!this.testMode) {
            CredentialProviderFrameworkImpl credentialProviderFrameworkImpl = new CredentialProviderFrameworkImpl(this.context);
            if (credentialProviderFrameworkImpl.isAvailableOnDevice()) {
                return credentialProviderFrameworkImpl;
            }
            return null;
        }
        CredentialProvider credentialProvider = this.testPostUProvider;
        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
            return this.testPostUProvider;
        }
        return null;
    }

    private final CredentialProvider tryCreatePreUOemProvider() {
        if (!this.testMode) {
            List<String> allowedProvidersFromManifest = getAllowedProvidersFromManifest(this.context);
            if (allowedProvidersFromManifest.isEmpty()) {
                return null;
            }
            return instantiatePreUProvider(allowedProvidersFromManifest, this.context);
        }
        CredentialProvider credentialProvider = this.testPreUProvider;
        if (credentialProvider != null && credentialProvider.isAvailableOnDevice()) {
            return this.testPreUProvider;
        }
        return null;
    }

    public final CredentialProvider getBestAvailableProvider(Object obj, boolean z) {
        if ((obj instanceof CreateRestoreCredentialRequest) || obj.equals(ClearCredentialStateRequest.TYPE_CLEAR_RESTORE_CREDENTIAL)) {
            return tryCreatePreUOemProvider();
        }
        if (obj instanceof GetCredentialRequest) {
            for (CredentialOption credentialOption : ((GetCredentialRequest) obj).getCredentialOptions()) {
                if ((credentialOption instanceof GetRestoreCredentialOption) || (credentialOption instanceof GetDigitalCredentialOption)) {
                    return tryCreatePreUOemProvider();
                }
            }
        }
        return getBestAvailableProvider(z);
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean getTestMode() {
        return this.testMode;
    }

    public final CredentialProvider getTestPostUProvider() {
        return this.testPostUProvider;
    }

    public final CredentialProvider getTestPreUProvider() {
        return this.testPreUProvider;
    }

    public final void setTestMode(boolean z) {
        this.testMode = z;
    }

    public final void setTestPostUProvider(CredentialProvider credentialProvider) {
        this.testPostUProvider = credentialProvider;
    }

    public final void setTestPreUProvider(CredentialProvider credentialProvider) {
        this.testPreUProvider = credentialProvider;
    }

    public static /* synthetic */ CredentialProvider getBestAvailableProvider$default(CredentialProviderFactory credentialProviderFactory, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return credentialProviderFactory.getBestAvailableProvider(z);
    }

    public final CredentialProvider getBestAvailableProvider(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CredentialProvider tryCreatePostUProvider = tryCreatePostUProvider();
            return (tryCreatePostUProvider == null && z) ? tryCreatePreUOemProvider() : tryCreatePostUProvider;
        }
        if (i <= 33) {
            return tryCreatePreUOemProvider();
        }
        return null;
    }
}
