package r;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
final class s {
    static boolean a(@NonNull Context context) {
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(@NonNull Context context) {
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT == 28 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes)) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
