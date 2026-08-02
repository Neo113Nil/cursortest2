package O;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8200e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String name, int i10) {
        super(name, b.f8149a.a(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // O.c
    public float c(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // O.c
    public float d(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // O.c
    public long h(float f10, float f11, float f12) {
        float coerceIn = (RangesKt.coerceIn(f10, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float coerceIn2 = (RangesKt.coerceIn(f10, -128.0f, 128.0f) * 0.002f) + coerceIn;
        float f13 = coerceIn2 > 0.20689656f ? coerceIn2 * coerceIn2 * coerceIn2 : (coerceIn2 - 0.13793103f) * 0.12841855f;
        float f14 = coerceIn > 0.20689656f ? coerceIn * coerceIn * coerceIn : (coerceIn - 0.13793103f) * 0.12841855f;
        j jVar = j.f8190a;
        return (Float.floatToIntBits(f13 * jVar.c()[0]) << 32) | (Float.floatToIntBits(f14 * jVar.c()[1]) & BodyPartID.bodyIdMax);
    }

    @Override // O.c
    public float i(float f10, float f11, float f12) {
        float coerceIn = ((RangesKt.coerceIn(f10, 0.0f, 100.0f) + 16.0f) / 116.0f) - (RangesKt.coerceIn(f12, -128.0f, 128.0f) * 0.005f);
        return (coerceIn > 0.20689656f ? coerceIn * coerceIn * coerceIn : 0.12841855f * (coerceIn - 0.13793103f)) * j.f8190a.c()[2];
    }

    @Override // O.c
    public long j(float f10, float f11, float f12, float f13, c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        j jVar = j.f8190a;
        float f14 = f10 / jVar.c()[0];
        float f15 = f11 / jVar.c()[1];
        float f16 = f12 / jVar.c()[2];
        float pow = f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f;
        float pow2 = f15 > 0.008856452f ? (float) Math.pow(f15, 0.33333334f) : (f15 * 7.787037f) + 0.13793103f;
        return N.f.a(RangesKt.coerceIn((116.0f * pow2) - 16.0f, 0.0f, 100.0f), RangesKt.coerceIn((pow - pow2) * 500.0f, -128.0f, 128.0f), RangesKt.coerceIn((pow2 - (f16 > 0.008856452f ? (float) Math.pow(f16, 0.33333334f) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f13, colorSpace);
    }
}
