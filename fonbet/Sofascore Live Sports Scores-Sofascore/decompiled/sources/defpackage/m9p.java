package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class m9p {
    @Deprecated
    public m9p() {
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            f7n f7nVar = new f7n(new ihi(2, sb));
            f7nVar.h = 1;
            aep.a.getClass();
            aep.a(f7nVar, this);
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }
}
