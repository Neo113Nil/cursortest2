package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.ArrayList;
import java.util.List;
import xsna.lhg;
import xsna.zcl;

/* compiled from: BeginGetCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class BeginGetCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final List<BeginGetCredentialOption> beginGetCredentialOptions;
    private final CallingAppInfo callingAppInfo;

    /* compiled from: BeginGetCredentialRequest.kt */
    public static final class Api21Impl {
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_";
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialRequest beginGetCredentialRequest) {
            int size = beginGetCredentialRequest.getBeginGetCredentialOptions().size();
            bundle.putInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, size);
            for (int i = 0; i < size; i++) {
                bundle.putString(lhg.a(i, EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX), beginGetCredentialRequest.getBeginGetCredentialOptions().get(i).getId());
                bundle.putString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX + i, beginGetCredentialRequest.getBeginGetCredentialOptions().get(i).getType());
                bundle.putBundle(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i, beginGetCredentialRequest.getBeginGetCredentialOptions().get(i).getCandidateQueryData());
                CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
                if (callingAppInfo != null) {
                    CallingAppInfo.Companion.setCallingAppInfo$credentials_release(bundle, callingAppInfo);
                }
            }
        }

        public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.Companion.extractCallingAppInfo$credentials_release(bundle);
            int i = bundle.getInt(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE, -1);
            if (i < 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                String string = bundle.getString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_PREFIX + i2);
                if (string == null) {
                    return null;
                }
                String string2 = bundle.getString(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_PREFIX + i2);
                if (string2 == null) {
                    return null;
                }
                Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i2);
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                arrayList.add(BeginGetCredentialOption.Companion.createFrom$credentials_release(string, string2, bundle2));
            }
            return new BeginGetCredentialRequest(arrayList, extractCallingAppInfo$credentials_release);
        }
    }

    /* compiled from: BeginGetCredentialRequest.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginGetCredentialRequest";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginGetCredentialRequest beginGetCredentialRequest) {
            bundle.putParcelable(REQUEST_KEY, BeginGetCredentialUtil.Companion.convertToFrameworkRequest(beginGetCredentialRequest));
        }

        public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
            }
            return null;
        }
    }

    /* compiled from: BeginGetCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(BeginGetCredentialRequest beginGetCredentialRequest) {
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginGetCredentialRequest);
                return bundle;
            }
            Api21Impl.asBundle(bundle, beginGetCredentialRequest);
            return bundle;
        }

        public final BeginGetCredentialRequest fromBundle(Bundle bundle) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(List<? extends BeginGetCredentialOption> list) {
        this(list, null, 2, 0 == true ? 1 : 0);
    }

    public static final Bundle asBundle(BeginGetCredentialRequest beginGetCredentialRequest) {
        return Companion.asBundle(beginGetCredentialRequest);
    }

    public static final BeginGetCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final List<BeginGetCredentialOption> getBeginGetCredentialOptions() {
        return this.beginGetCredentialOptions;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(List<? extends BeginGetCredentialOption> list, CallingAppInfo callingAppInfo) {
        this.beginGetCredentialOptions = list;
        this.callingAppInfo = callingAppInfo;
    }

    public /* synthetic */ BeginGetCredentialRequest(List list, CallingAppInfo callingAppInfo, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : callingAppInfo);
    }
}
