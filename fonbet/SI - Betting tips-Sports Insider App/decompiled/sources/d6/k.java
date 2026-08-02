package d6;

import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(int i5) {
        super(new Status(i5, String.format(r1, "Install Error(%d): %s", r2, r3), null, null));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i5);
        HashMap hashMap = a8.a.f84a;
        Integer valueOf2 = Integer.valueOf(i5);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = a8.a.f85b;
            if (hashMap2.containsKey(valueOf2)) {
                str = ((String) hashMap.get(valueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) hashMap2.get(valueOf2)) + ")";
                if (i5 != 0) {
                    throw new IllegalArgumentException("errorCode should not be 0.");
                }
                return;
            }
        }
        str = "";
        if (i5 != 0) {
        }
    }
}
