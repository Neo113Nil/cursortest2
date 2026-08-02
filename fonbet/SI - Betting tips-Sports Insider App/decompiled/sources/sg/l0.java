package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f23654a = new l0();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23655b = new y0("kotlin.Long", qg.e.f22162k);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.v());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.l(longValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23655b;
    }
}
