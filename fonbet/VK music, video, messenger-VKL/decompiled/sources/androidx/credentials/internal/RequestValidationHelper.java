package androidx.credentials.internal;

import org.json.JSONObject;
import xsna.zcl;

/* compiled from: RequestValidationHelper.kt */
/* loaded from: classes12.dex */
public final class RequestValidationHelper {
    public static final Companion Companion = new Companion(null);

    /* compiled from: RequestValidationHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final boolean isValidJSON(String str) {
            if (str.length() == 0) {
                return false;
            }
            try {
                new JSONObject(str);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    public static final boolean isValidJSON(String str) {
        return Companion.isValidJSON(str);
    }
}
