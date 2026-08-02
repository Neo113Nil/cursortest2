package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23630a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23631b = new y0("kotlin.Boolean", qg.e.f22157e);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.c());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.b(booleanValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23631b;
    }
}
