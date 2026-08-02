package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ruj implements i72 {
    public final int a;
    public final nsj b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    public ruj(nsj nsjVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = nsjVar.a;
        this.a = i;
        boolean z2 = false;
        qx9.r(i == iArr.length && i == zArr.length);
        this.b = nsjVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ruj.class != obj.getClass()) {
            return false;
        }
        ruj rujVar = (ruj) obj;
        return this.c == rujVar.c && this.b.equals(rujVar.b) && Arrays.equals(this.d, rujVar.d) && Arrays.equals(this.e, rujVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
