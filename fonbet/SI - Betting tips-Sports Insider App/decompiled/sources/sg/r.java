package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r f23678a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23679b = new y0("kotlin.Double", qg.e.f22160h);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.E());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.e(doubleValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23679b;
    }
}
