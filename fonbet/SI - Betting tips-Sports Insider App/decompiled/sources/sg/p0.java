package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f23670a = new p0();

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f23671b = o0.f23665a;

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new og.f("'kotlin.Nothing' does not have instances");
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new og.f("'kotlin.Nothing' cannot be serialized");
    }

    @Override // og.a
    public final qg.g d() {
        return f23671b;
    }
}
