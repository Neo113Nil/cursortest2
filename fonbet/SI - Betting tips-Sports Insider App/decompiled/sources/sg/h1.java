package sg;

import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final h1 f23638a = new h1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f23639b;

    static {
        Intrinsics.checkNotNullParameter(ByteCompanionObject.INSTANCE, "<this>");
        f23639b = s0.a("kotlin.UByte", j.f23644a);
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new gf.w(decoder.i(f23639b).B());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        byte b10 = ((gf.w) obj).f10043a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f23639b).c(b10);
    }

    @Override // og.a
    public final qg.g d() {
        return f23639b;
    }
}
