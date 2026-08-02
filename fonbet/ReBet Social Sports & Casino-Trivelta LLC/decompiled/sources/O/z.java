package O;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class z extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String name, int i10) {
        super(name, b.f8149a.c(), i10, null);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // O.c
    public float c(int i10) {
        return 2.0f;
    }

    @Override // O.c
    public float d(int i10) {
        return -2.0f;
    }

    @Override // O.c
    public long h(float f10, float f11, float f12) {
        float k10 = k(f10);
        float k11 = k(f11);
        return (Float.floatToIntBits(k11) & BodyPartID.bodyIdMax) | (Float.floatToIntBits(k10) << 32);
    }

    @Override // O.c
    public float i(float f10, float f11, float f12) {
        return k(f12);
    }

    @Override // O.c
    public long j(float f10, float f11, float f12, float f13, c colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        return N.f.a(k(f10), k(f11), k(f12), f13, colorSpace);
    }

    public final float k(float f10) {
        return RangesKt.coerceIn(f10, -2.0f, 2.0f);
    }
}
