package h4;

import j3.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class g {
    public static String a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z11 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((r) it.next()).f64944a.f64916g.f69127o;
            if (u.l(str2)) {
                return "video/mp4";
            }
            if (u.i(str2)) {
                z11 = true;
            } else if (u.j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z11 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
