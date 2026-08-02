package sg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class q1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f23676a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f23677b;

    static {
        Intrinsics.checkNotNullParameter(ShortCompanionObject.INSTANCE, "<this>");
        f23677b = s0.a("kotlin.UShort", d1.f23618a);
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new gf.h0(decoder.i(f23677b).C());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        short s8 = ((gf.h0) obj).f10023a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f23677b).q(s8);
    }

    @Override // og.a
    public final qg.g d() {
        return f23677b;
    }
}
