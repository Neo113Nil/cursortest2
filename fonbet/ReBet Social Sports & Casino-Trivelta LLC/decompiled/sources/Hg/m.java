package Hg;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f4948a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f4949a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4950b;

        /* renamed from: c, reason: collision with root package name */
        public final float f4951c;

        public a(int i10, int i11, float f10) {
            this.f4949a = i10;
            this.f4950b = i11;
            this.f4951c = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f4949a == aVar.f4949a && this.f4950b == aVar.f4950b && Float.compare(aVar.f4951c, this.f4951c) == 0) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f4949a * 31) + this.f4950b) * 31;
            float f10 = this.f4951c;
            return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f4949a + ", height=" + this.f4950b + ", scaleFactor=" + this.f4951c + '}';
        }
    }

    public m(float f10) {
        this.f4948a = f10;
    }

    public final int a(float f10) {
        return (int) Math.ceil(f10 / this.f4948a);
    }

    public boolean b(int i10, int i11) {
        return a((float) i11) == 0 || a((float) i10) == 0;
    }

    public final int c(int i10) {
        int i11 = i10 % 64;
        return i11 == 0 ? i10 : (i10 - i11) + 64;
    }

    public a d(int i10, int i11) {
        float f10 = i10;
        int c10 = c(a(f10));
        return new a(c10, (int) Math.ceil(i11 / r4), f10 / c10);
    }
}
