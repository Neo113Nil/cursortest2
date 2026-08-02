package p1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f21417a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21418b;

    /* renamed from: c, reason: collision with root package name */
    public float f21419c;

    /* renamed from: d, reason: collision with root package name */
    public float f21420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f21421e;

    public i(j jVar, c cubic, float f6, float f10) {
        Intrinsics.checkNotNullParameter(cubic, "cubic");
        this.f21421e = jVar;
        this.f21417a = cubic;
        if (f10 < f6) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.f21418b = jVar.f21423a.a(cubic);
        this.f21419c = f6;
        this.f21420d = f10;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, p1.a] */
    public final Pair a(float f6) {
        float f10 = this.f21419c;
        float f11 = this.f21420d;
        if (f10 > f11) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
        }
        if (f6 < f10) {
            f6 = f10;
        } else if (f6 > f11) {
            f6 = f11;
        }
        float f12 = (f6 - f10) / (f11 - f10);
        j jVar = this.f21421e;
        final androidx.dynamicanimation.animation.g gVar = jVar.f21423a;
        final float f13 = f12 * this.f21418b;
        gVar.getClass();
        final c c2 = this.f21417a;
        Intrinsics.checkNotNullParameter(c2, "c");
        float[] fArr = c2.f21410a;
        final float a7 = p.a(fArr[0] - gVar.f1783a, fArr[1] - gVar.f1784b);
        ?? f14 = new Object() { // from class: p1.a
            public final float a(float f15) {
                c c8 = c.this;
                Intrinsics.checkNotNullParameter(c8, "$c");
                androidx.dynamicanimation.animation.g this$0 = gVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long c10 = c8.c(f15);
                return Math.abs(p.d(p.a(ci.c.y(c10) - this$0.f1783a, ci.c.z(c10) - this$0.f1784b) - a7, p.f21445c) - f13);
            }
        };
        Intrinsics.checkNotNullParameter(f14, "f");
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (f15 - f16 > 1.0E-5f) {
            float f17 = 2;
            float f18 = 3;
            float f19 = ((f17 * f16) + f15) / f18;
            float f20 = ((f17 * f15) + f16) / f18;
            if (f14.a(f19) < f14.a(f20)) {
                f15 = f20;
            } else {
                f16 = f19;
            }
        }
        float f21 = (f16 + f15) / 2;
        if (0.0f > f21 || f21 > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        Pair d10 = c2.d(f21);
        return new Pair(new i(jVar, (c) d10.f19192a, this.f21419c, f6), new i(jVar, (c) d10.f19193b, f6, this.f21420d));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.f21419c + " .. " + this.f21420d + "], size=" + this.f21418b + ", cubic=" + this.f21417a + ')';
    }
}
