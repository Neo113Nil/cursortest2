package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f23623a = new e1();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23624b = new y0("kotlin.String", qg.e.f22164m);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.s();
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.r(value);
    }

    @Override // og.a
    public final qg.g d() {
        return f23624b;
    }
}
