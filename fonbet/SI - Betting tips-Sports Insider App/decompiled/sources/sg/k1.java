package sg;

import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class k1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f23650a = new k1();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f23651b;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        f23651b = s0.a("kotlin.UInt", f0.f23626a);
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new gf.a0(decoder.i(f23651b).l());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        int i5 = ((gf.a0) obj).f10011a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.h(f23651b).j(i5);
    }

    @Override // og.a
    public final qg.g d() {
        return f23651b;
    }
}
