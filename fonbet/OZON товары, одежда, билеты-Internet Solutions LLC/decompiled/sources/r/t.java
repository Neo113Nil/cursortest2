package r;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class t {
    @NonNull
    static String a(int i11, Context context) {
        if (context == null) {
            return "";
        }
        if (i11 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i11 != 7) {
            switch (i11) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i11);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }
}
