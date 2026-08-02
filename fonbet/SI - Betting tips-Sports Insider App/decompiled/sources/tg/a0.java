package tg;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import sg.e1;
import sg.h0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f23934a = new a0();

    /* renamed from: b, reason: collision with root package name */
    public static final z f23935b = z.f23964b;

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y4.a.c(decoder);
        ci.c.X(StringCompanionObject.INSTANCE);
        e1 e1Var = e1.f23623a;
        o oVar = o.f23954a;
        e1 keySerializer = e1.f23623a;
        o valueSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        h0 h0Var = new h0();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new y((Map) h0Var.i(decoder));
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        y value = (y) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        ci.c.X(StringCompanionObject.INSTANCE);
        e1 e1Var = e1.f23623a;
        o oVar = o.f23954a;
        e1 keySerializer = e1.f23623a;
        o valueSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        new h0().c(encoder, value);
    }

    @Override // og.a
    public final qg.g d() {
        return f23935b;
    }
}
