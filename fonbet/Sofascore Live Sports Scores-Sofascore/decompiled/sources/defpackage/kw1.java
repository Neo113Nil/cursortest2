package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class kw1 implements Cloneable {
    public int b = 0;
    public int[] a = new int[1];

    public final void a(boolean z) {
        c(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            a70.p("Num bits must be between 0 and 32");
            return;
        }
        c(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void c(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.a.clone();
        int i = this.b;
        kw1 kw1Var = new kw1();
        kw1Var.a = iArr;
        kw1Var.b = i;
        return kw1Var;
    }

    public final boolean d(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int e() {
        return (this.b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kw1)) {
            return false;
        }
        kw1 kw1Var = (kw1) obj;
        return this.b == kw1Var.b && Arrays.equals(this.a, kw1Var.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + (this.b * 31);
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
