package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yzg {
    public final e0h a;
    public final e0h b;

    public yzg(e0h e0hVar, e0h e0hVar2) {
        this.a = e0hVar;
        this.b = e0hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yzg.class != obj.getClass()) {
            return false;
        }
        yzg yzgVar = (yzg) obj;
        return this.a.equals(yzgVar.a) && this.b.equals(yzgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(U3.j.d);
        e0h e0hVar = this.a;
        sb.append(e0hVar);
        e0h e0hVar2 = this.b;
        if (e0hVar.equals(e0hVar2)) {
            str = "";
        } else {
            str = ", " + e0hVar2;
        }
        return mz1.o(sb, str, U3.j.e);
    }
}
