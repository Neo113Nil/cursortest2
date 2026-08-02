package q1;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class P {
    public static long a(Map map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    public static Pair b(InterfaceC6104m interfaceC6104m) {
        Map g10 = interfaceC6104m.g();
        if (g10 == null) {
            return null;
        }
        return new Pair(Long.valueOf(a(g10, "LicenseDurationRemaining")), Long.valueOf(a(g10, "PlaybackDurationRemaining")));
    }
}
