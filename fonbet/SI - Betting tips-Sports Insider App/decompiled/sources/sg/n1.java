package sg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class n1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f23662a = new n1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f23663b;

    static {
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "<this>");
        f23663b = s0.a("kotlin.ULong", l0.f23654a);
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new gf.d0(decoder.i(f23663b).v());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        long j = ((gf.d0) obj).f10018a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f23663b).l(j);
    }

    @Override // og.a
    public final qg.g d() {
        return f23663b;
    }
}
