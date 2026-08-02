package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yd2 implements sd2 {
    public final boolean a;
    public final String b;

    public yd2(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.sd2
    public final boolean a(umg umgVar) {
        int i;
        boolean z = this.a;
        String str = this.b;
        if (z && str == null) {
            str = umgVar.o();
        }
        smg smgVar = umgVar.b;
        if (smgVar != null) {
            Iterator it = smgVar.a().iterator();
            i = 0;
            while (it.hasNext()) {
                umg umgVar2 = (umg) ((wmg) it.next());
                if (str == null || umgVar2.o().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? lnb.o("only-of-type <", this.b, ">") : "only-child";
    }
}
