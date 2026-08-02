package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class y implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final y f23717a = new y();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23718b = new y0("kotlin.Float", qg.e.f22161i);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.D());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.g(floatValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23718b;
    }
}
