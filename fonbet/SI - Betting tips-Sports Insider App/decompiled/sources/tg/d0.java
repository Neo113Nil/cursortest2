package tg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f23940a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final qg.h f23941b = y4.a.d("kotlinx.serialization.json.JsonPrimitive", qg.e.f22164m, new qg.g[0], new k2.d0(16));

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        m j = y4.a.c(decoder).j();
        if (j instanceof c0) {
            return (c0) j;
        }
        throw ug.j.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(j.getClass()), j.toString());
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        c0 value = (c0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        if (value instanceof v) {
            encoder.p(w.f23961a, v.INSTANCE);
        } else {
            encoder.p(t.f23959a, (s) value);
        }
    }

    @Override // og.a
    public final qg.g d() {
        return f23941b;
    }
}
