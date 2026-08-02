package Z6;

import D6.k;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public a f14713a = a.BITMAP_ONLY;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14714b = false;
    private float[] mCornersRadii = null;

    /* renamed from: c, reason: collision with root package name */
    public int f14715c = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f14716d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f14717e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f14718f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14719g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14720h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14721i = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static e a(float f10) {
        return new e().p(f10);
    }

    public int b() {
        return this.f14717e;
    }

    public float c() {
        return this.f14716d;
    }

    public float[] d() {
        return this.mCornersRadii;
    }

    public final float[] e() {
        if (this.mCornersRadii == null) {
            this.mCornersRadii = new float[8];
        }
        return this.mCornersRadii;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f14714b == eVar.f14714b && this.f14715c == eVar.f14715c && Float.compare(eVar.f14716d, this.f14716d) == 0 && this.f14717e == eVar.f14717e && Float.compare(eVar.f14718f, this.f14718f) == 0 && this.f14713a == eVar.f14713a && this.f14719g == eVar.f14719g && this.f14720h == eVar.f14720h) {
            return Arrays.equals(this.mCornersRadii, eVar.mCornersRadii);
        }
        return false;
    }

    public int f() {
        return this.f14715c;
    }

    public float g() {
        return this.f14718f;
    }

    public boolean h() {
        return this.f14720h;
    }

    public int hashCode() {
        a aVar = this.f14713a;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f14714b ? 1 : 0)) * 31;
        float[] fArr = this.mCornersRadii;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f14715c) * 31;
        float f10 = this.f14716d;
        int floatToIntBits = (((hashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f14717e) * 31;
        float f11 = this.f14718f;
        return ((((floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f14719g ? 1 : 0)) * 31) + (this.f14720h ? 1 : 0);
    }

    public boolean i() {
        return this.f14721i;
    }

    public boolean j() {
        return this.f14714b;
    }

    public a k() {
        return this.f14713a;
    }

    public boolean l() {
        return this.f14719g;
    }

    public e m(int i10) {
        this.f14717e = i10;
        return this;
    }

    public e n(float f10) {
        k.c(f10 >= 0.0f, "the border width cannot be < 0");
        this.f14716d = f10;
        return this;
    }

    public e o(float f10, float f11, float f12, float f13) {
        float[] e10 = e();
        e10[1] = f10;
        e10[0] = f10;
        e10[3] = f11;
        e10[2] = f11;
        e10[5] = f12;
        e10[4] = f12;
        e10[7] = f13;
        e10[6] = f13;
        return this;
    }

    public e p(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public e q(int i10) {
        this.f14715c = i10;
        this.f14713a = a.OVERLAY_COLOR;
        return this;
    }

    public e r(float f10) {
        k.c(f10 >= 0.0f, "the padding cannot be < 0");
        this.f14718f = f10;
        return this;
    }

    public e s(boolean z10) {
        this.f14720h = z10;
        return this;
    }

    public e t(boolean z10) {
        this.f14714b = z10;
        return this;
    }

    public e u(a aVar) {
        this.f14713a = aVar;
        return this;
    }
}
