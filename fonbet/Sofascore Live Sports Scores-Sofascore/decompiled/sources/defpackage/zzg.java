package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzg {
    public final f0h a;
    public final f0h b;

    public zzg(f0h f0hVar, f0h f0hVar2) {
        this.a = f0hVar;
        this.b = f0hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzg.class != obj.getClass()) {
            return false;
        }
        zzg zzgVar = (zzg) obj;
        return this.a.equals(zzgVar.a) && this.b.equals(zzgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(U3.j.d);
        f0h f0hVar = this.a;
        sb.append(f0hVar);
        f0h f0hVar2 = this.b;
        if (f0hVar.equals(f0hVar2)) {
            str = "";
        } else {
            str = ", " + f0hVar2;
        }
        return mz1.o(sb, str, U3.j.e);
    }
}
