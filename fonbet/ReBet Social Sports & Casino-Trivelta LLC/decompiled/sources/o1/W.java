package o1;

import H1.AbstractC1185s;
import e1.AbstractC4134a;
import java.math.RoundingMode;
import o1.P;

/* loaded from: classes.dex */
public class W implements P.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f58767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58768c;

    /* renamed from: d, reason: collision with root package name */
    public final int f58769d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58770e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58771f;

    /* renamed from: g, reason: collision with root package name */
    public final int f58772g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58773h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f58774a = 250000;

        /* renamed from: b, reason: collision with root package name */
        public int f58775b = 750000;

        /* renamed from: c, reason: collision with root package name */
        public int f58776c = 4;

        /* renamed from: d, reason: collision with root package name */
        public int f58777d = 250000;

        /* renamed from: e, reason: collision with root package name */
        public int f58778e = 50000000;

        /* renamed from: f, reason: collision with root package name */
        public int f58779f = 2;

        /* renamed from: g, reason: collision with root package name */
        public int f58780g = 4;

        public W h() {
            return new W(this);
        }
    }

    public W(a aVar) {
        this.f58767b = aVar.f58774a;
        this.f58768c = aVar.f58775b;
        this.f58769d = aVar.f58776c;
        this.f58770e = aVar.f58777d;
        this.f58771f = aVar.f58778e;
        this.f58772g = aVar.f58779f;
        this.f58773h = aVar.f58780g;
    }

    public static int b(int i10, int i11, int i12) {
        return com.google.common.primitives.f.e(((i10 * i11) * i12) / 1000000);
    }

    public static int d(int i10) {
        int b10 = AbstractC1185s.b(i10);
        AbstractC4134a.g(b10 != -2147483647);
        return b10;
    }

    @Override // o1.P.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    public int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i10) {
        return com.google.common.primitives.f.e((this.f58771f * d(i10)) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int f(int i10, int i11) {
        int i12;
        int i13 = this.f58770e;
        if (i10 != 5) {
            if (i10 == 8) {
                i12 = this.f58773h;
            }
            return com.google.common.primitives.f.e((i13 * (i11 == -1 ? com.google.common.math.d.b(i11, 8, RoundingMode.CEILING) : d(i10))) / 1000000);
        }
        i12 = this.f58772g;
        i13 *= i12;
        return com.google.common.primitives.f.e((i13 * (i11 == -1 ? com.google.common.math.d.b(i11, 8, RoundingMode.CEILING) : d(i10))) / 1000000);
    }

    public int g(int i10, int i11, int i12) {
        return e1.Z.o(i10 * this.f58769d, b(this.f58767b, i11, i12), b(this.f58768c, i11, i12));
    }
}
