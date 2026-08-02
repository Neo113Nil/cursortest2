package defpackage;

import android.view.View;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzga;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xl0 implements wl0, i12, kpd, ygn {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public xl0(q80 q80Var, long j) {
        this.a = 2;
        String str = q80Var.b;
        j12 j12Var = new j12((byte) 0, 3);
        j12Var.d = str;
        j12Var.b = -1;
        j12Var.c = -1;
        this.f = j12Var;
        this.b = pej.g(j);
        this.c = pej.f(j);
        this.d = -1;
        this.e = -1;
        int g = pej.g(j);
        int f = pej.f(j);
        if (g < 0 || g > str.length()) {
            pvd.m(str.length(), lnb.t(g, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (f < 0 || f > str.length()) {
            pvd.m(str.length(), lnb.t(f, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (g <= f) {
            return;
        }
        a70.p(dmi.k(g, f, "Do not set reversed range: ", " > "));
        throw null;
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        View view2 = (View) this.f;
        u4a i = x9lVar.a.i(519);
        int i2 = this.b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + i.a, this.d + i.b, this.e + i.c, view2.getPaddingBottom());
        return x9lVar;
    }

    @Override // defpackage.wl0, defpackage.i12
    public int a() {
        switch (this.a) {
        }
        return -1;
    }

    public void b(int i) {
        int i2 = this.d;
        int[] iArr = (int[]) this.f;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                zzl.s();
                return;
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.b;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.f, 0, iArr2, i4, i3);
            this.b = 0;
            int i5 = this.d;
            this.c = i5 - 1;
            this.f = iArr2;
            this.e = length - 1;
            i2 = i5;
            iArr = iArr2;
        }
        int i6 = (this.c + 1) & this.e;
        this.c = i6;
        iArr[i6] = i;
        this.d = i2 + 1;
    }

    public void c(int i, int i2) {
        long g = t6a.g(i, i2);
        ((j12) this.f).O(i, i2, "");
        long i0 = kik.i0(t6a.g(this.b, this.c), g);
        l(pej.g(i0));
        k(pej.f(i0));
        int i3 = this.d;
        if (i3 != -1) {
            long i02 = kik.i0(t6a.g(i3, this.e), g);
            if (pej.d(i02)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = pej.g(i02);
                this.e = pej.f(i02);
            }
        }
    }

    public char d(int i) {
        j12 j12Var = (j12) this.f;
        wu8 wu8Var = (wu8) j12Var.e;
        if (wu8Var == null) {
            return ((String) j12Var.d).charAt(i);
        }
        if (i < j12Var.b) {
            return ((String) j12Var.d).charAt(i);
        }
        int a = wu8Var.b - wu8Var.a();
        int i2 = j12Var.b;
        if (i >= a + i2) {
            return ((String) j12Var.d).charAt(i - ((a - j12Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = wu8Var.d;
        char[] cArr = wu8Var.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + wu8Var.e];
    }

    public pej e() {
        int i = this.d;
        if (i != -1) {
            return new pej(t6a.g(i, this.e));
        }
        return null;
    }

    public int f() {
        int i = this.d;
        if (i == 0) {
            yhk.d();
            return 0;
        }
        int[] iArr = (int[]) this.f;
        int i2 = this.b;
        int i3 = iArr[i2];
        this.b = (i2 + 1) & this.e;
        this.d = i - 1;
        return i3;
    }

    public long g() {
        int i = this.d;
        if (i == 0) {
            yhk.d();
            return 0L;
        }
        long[] jArr = (long[]) this.f;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.e & (i2 + 1);
        this.d = i - 1;
        return j;
    }

    @Override // defpackage.wl0, defpackage.i12
    public int getSampleCount() {
        switch (this.a) {
        }
        return this.b;
    }

    public void h(int i, int i2, String str) {
        j12 j12Var = (j12) this.f;
        if (i < 0 || i > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                a70.p(dmi.k(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            j12Var.O(i, i2, str);
            l(str.length() + i);
            k(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public void i(int i, int i2) {
        j12 j12Var = (j12) this.f;
        if (i < 0 || i > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            a70.p(dmi.k(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public void j(int i, int i2) {
        j12 j12Var = (j12) this.f;
        if (i < 0 || i > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > j12Var.s()) {
            pvd.m(j12Var.s(), lnb.t(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            a70.p(dmi.k(i, i2, "Do not set reversed range: ", " > "));
        } else {
            l(i);
            k(i2);
        }
    }

    public void k(int i) {
        if (!(i >= 0)) {
            s3a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void l(int i) {
        if (!(i >= 0)) {
            s3a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    @Override // defpackage.wl0, defpackage.i12
    public int readNextSampleSize() {
        switch (this.a) {
            case 0:
                nkk nkkVar = (nkk) this.f;
                int i = this.c;
                if (i != 8) {
                    if (i != 16) {
                        int i2 = this.d;
                        this.d = i2 + 1;
                        if (i2 % 2 != 0) {
                            break;
                        } else {
                            int s = nkkVar.s();
                            this.e = s;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                j9e j9eVar = (j9e) this.f;
                int i3 = this.c;
                if (i3 != 8) {
                    if (i3 != 16) {
                        int i4 = this.d;
                        this.d = i4 + 1;
                        if (i4 % 2 != 0) {
                            break;
                        } else {
                            int A = j9eVar.A();
                            this.e = A;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return this.e & 15;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((j12) this.f).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ygn
    public int zza() {
        return this.b;
    }

    @Override // defpackage.ygn
    public int zzb() {
        return -1;
    }

    @Override // defpackage.ygn
    public int zzc() {
        zzeu zzeuVar = (zzeu) this.f;
        int i = this.c;
        if (i == 8) {
            return zzeuVar.I();
        }
        if (i == 16) {
            return zzeuVar.J();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int I = zzeuVar.I();
        this.e = I;
        return (I & 240) >> 4;
    }

    public xl0(zzga zzgaVar) {
        this.a = 7;
        zzeu zzeuVar = zzgaVar.b;
        this.f = zzeuVar;
        zzeuVar.D(12);
        this.c = zzeuVar.h() & 255;
        this.b = zzeuVar.h();
    }

    public /* synthetic */ xl0(int i) {
        this.a = i;
    }

    public xl0() {
        this.a = 3;
        this.b = 0;
        this.c = -1;
        this.d = 0;
        this.f = new int[16];
        this.e = r0.length - 1;
    }

    public xl0(View view, int i, int i2, int i3, int i4) {
        this.a = 5;
        this.b = i;
        this.f = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public xl0(sl0 sl0Var) {
        this.a = 0;
        nkk nkkVar = sl0Var.g;
        this.f = nkkVar;
        nkkVar.E(12);
        this.c = nkkVar.v() & 255;
        this.b = nkkVar.v();
    }

    public xl0(bxc bxcVar) {
        this.a = 1;
        j9e j9eVar = bxcVar.g;
        this.f = j9eVar;
        j9eVar.N(12);
        this.c = j9eVar.E() & 255;
        this.b = j9eVar.E();
    }
}
