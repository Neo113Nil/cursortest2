package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f23660a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23661b = new y0("kotlin.Char", qg.e.f22159g);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.d());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        char charValue = ((Character) obj).charValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.d(charValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23661b;
    }
}
