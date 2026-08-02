package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.zcl;

/* compiled from: Credential.kt */
/* loaded from: classes12.dex */
public abstract class Credential {
    public static final Companion Companion = new Companion(null);
    private final Bundle data;
    private final String type;

    /* compiled from: Credential.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final Credential createFrom(String str, Bundle bundle) {
            try {
                switch (str.hashCode()) {
                    case -1678407252:
                        if (str.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                            return DigitalCredential.Companion.createFrom$credentials_release(bundle);
                        }
                        break;
                    case -1072734346:
                        if (str.equals(RestoreCredential.TYPE_RESTORE_CREDENTIAL)) {
                            return RestoreCredential.Companion.createFrom$credentials_release(bundle);
                        }
                        break;
                    case -543568185:
                        if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                            return PasswordCredential.Companion.createFrom$credentials_release(bundle);
                        }
                        break;
                    case -95037569:
                        if (str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            return PublicKeyCredential.Companion.createFrom$credentials_release(bundle);
                        }
                        break;
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CustomCredential(str, bundle);
            }
        }

        private Companion() {
        }

        public final Credential createFrom(android.credentials.Credential credential) {
            String type;
            Bundle data;
            type = credential.getType();
            data = credential.getData();
            return createFrom(type, data);
        }
    }

    public Credential(String str, Bundle bundle) {
        this.type = str;
        this.data = bundle;
    }

    public static final Credential createFrom(android.credentials.Credential credential) {
        return Companion.createFrom(credential);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public static final Credential createFrom(String str, Bundle bundle) {
        return Companion.createFrom(str, bundle);
    }
}
