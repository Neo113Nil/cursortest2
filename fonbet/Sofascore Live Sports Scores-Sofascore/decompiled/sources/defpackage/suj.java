package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class suj {
    public final int a;
    public final osj b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        nik.N(0);
        nik.N(1);
        nik.N(3);
        nik.N(4);
    }

    public suj(osj osjVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = osjVar.a;
        this.a = i;
        boolean z2 = false;
        z1a.s(i == iArr.length && i == zArr.length);
        this.b = osjVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i) {
        return this.d[i] == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || suj.class != obj.getClass()) {
            return false;
        }
        suj sujVar = (suj) obj;
        return this.c == sujVar.c && this.b.equals(sujVar.b) && Arrays.equals(this.d, sujVar.d) && Arrays.equals(this.e, sujVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
