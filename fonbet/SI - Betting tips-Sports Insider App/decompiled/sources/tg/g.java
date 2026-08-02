package tg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f23946a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f23947b = f.f23943b;

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y4.a.c(decoder);
        o elementSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        sg.d dVar = new sg.d(elementSerializer);
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new e((List) dVar.i(decoder));
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        e value = (e) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y4.a.b(encoder);
        o elementSerializer = o.f23954a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        new sg.d(elementSerializer).c(encoder, value);
    }

    @Override // og.a
    public final qg.g d() {
        return f23947b;
    }
}
