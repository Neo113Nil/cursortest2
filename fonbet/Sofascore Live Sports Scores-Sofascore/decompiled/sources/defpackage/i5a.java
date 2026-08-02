package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i5a extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i5a(int i) {
        super(new Status(i, String.format(r1, "Install Error(%d): %s", r2, r3), null, null));
        String str;
        Locale locale = Locale.getDefault();
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = y3n.a;
        Integer valueOf2 = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf2)) {
            HashMap hashMap2 = y3n.b;
            if (hashMap2.containsKey(valueOf2)) {
                str = dmi.r((String) hashMap.get(valueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) hashMap2.get(valueOf2), ")");
                if (i == 0) {
                    return;
                }
                a70.p("errorCode should not be 0.");
                throw null;
            }
        }
        str = "";
        if (i == 0) {
        }
    }
}
