package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f23626a = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23627b = new y0("kotlin.Int", qg.e.j);

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.l());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        int intValue = ((Number) obj).intValue();
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.j(intValue);
    }

    @Override // og.a
    public final qg.g d() {
        return f23627b;
    }
}
