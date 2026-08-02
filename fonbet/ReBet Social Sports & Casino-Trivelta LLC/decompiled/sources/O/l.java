package O;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l extends c {

    @NotNull
    private static final float[] InverseM1;

    @NotNull
    private static final float[] InverseM2;

    /* renamed from: M1, reason: collision with root package name */
    @NotNull
    private static final float[] f8201M1;

    /* renamed from: M2, reason: collision with root package name */
    @NotNull
    private static final float[] f8202M2;

    /* renamed from: e, reason: collision with root package name */
    public static final a f8203e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    static {
        float[] b10 = O.a.f8145a.a().b();
        j jVar = j.f8190a;
        float[] k10 = d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, d.e(b10, jVar.b().c(), jVar.e().c()));
        f8201M1 = k10;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f8202M2 = fArr;
        InverseM1 = d.j(k10);
        InverseM2 = d.j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String name, int i10) {
        super(name, b.f8149a.a(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // O.c
    public float c(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // O.c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
    }

    @Override // O.c
    public long h(float f10, float f11, float f12) {
        float coerceIn = RangesKt.coerceIn(f10, 0.0f, 1.0f);
        float coerceIn2 = RangesKt.coerceIn(f11, -0.5f, 0.5f);
        float coerceIn3 = RangesKt.coerceIn(f12, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float n10 = d.n(fArr, coerceIn, coerceIn2, coerceIn3);
        float o10 = d.o(fArr, coerceIn, coerceIn2, coerceIn3);
        float p10 = d.p(fArr, coerceIn, coerceIn2, coerceIn3);
        float f13 = n10 * n10 * n10;
        float f14 = o10 * o10 * o10;
        float f15 = p10 * p10 * p10;
        float[] fArr2 = InverseM1;
        float n11 = d.n(fArr2, f13, f14, f15);
        float o11 = d.o(fArr2, f13, f14, f15);
        return (Float.floatToIntBits(n11) << 32) | (Float.floatToIntBits(o11) & BodyPartID.bodyIdMax);
    }

    @Override // O.c
    public float i(float f10, float f11, float f12) {
        float coerceIn = RangesKt.coerceIn(f10, 0.0f, 1.0f);
        float coerceIn2 = RangesKt.coerceIn(f11, -0.5f, 0.5f);
        float coerceIn3 = RangesKt.coerceIn(f12, -0.5f, 0.5f);
        float[] fArr = InverseM2;
        float n10 = d.n(fArr, coerceIn, coerceIn2, coerceIn3);
        float o10 = d.o(fArr, coerceIn, coerceIn2, coerceIn3);
        float p10 = d.p(fArr, coerceIn, coerceIn2, coerceIn3);
        float f13 = p10 * p10 * p10;
        return d.p(InverseM1, n10 * n10 * n10, o10 * o10 * o10, f13);
    }

    @Override // O.c
    public long j(float f10, float f11, float f12, float f13, c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float[] fArr = f8201M1;
        float n10 = d.n(fArr, f10, f11, f12);
        float o10 = d.o(fArr, f10, f11, f12);
        float p10 = d.p(fArr, f10, f11, f12);
        double d10 = 0.33333334f;
        float signum = Math.signum(n10) * ((float) Math.pow(Math.abs(n10), d10));
        float signum2 = Math.signum(o10) * ((float) Math.pow(Math.abs(o10), d10));
        float signum3 = Math.signum(p10) * ((float) Math.pow(Math.abs(p10), d10));
        float[] fArr2 = f8202M2;
        return N.f.a(d.n(fArr2, signum, signum2, signum3), d.o(fArr2, signum, signum2, signum3), d.p(fArr2, signum, signum2, signum3), f13, colorSpace);
    }
}
