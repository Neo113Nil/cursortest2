package tg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class o implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final o f23954a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final qg.h f23955b = y4.a.d("kotlinx.serialization.json.JsonElement", qg.c.f22156f, new qg.g[0], new k2.d0(28));

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return y4.a.c(decoder).j();
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        m value = (m) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        if (value instanceof c0) {
            encoder.p(d0.f23940a, value);
        } else if (value instanceof y) {
            encoder.p(a0.f23934a, value);
        } else {
            if (!(value instanceof e)) {
                throw new gf.m();
            }
            encoder.p(g.f23946a, value);
        }
    }

    @Override // og.a
    public final qg.g d() {
        return f23955b;
    }
}
