package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f23618a = new d1();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23619b = new y0("kotlin.Short", qg.e.f22163l);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.C());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        short shortValue = ((Number) obj).shortValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.q(shortValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23619b;
    }
}
