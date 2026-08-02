package sg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class r0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23680a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.collections.e0 f23681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23682c;

    public r0(Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f23680a = objectInstance;
        this.f23681b = kotlin.collections.e0.f19204a;
        this.f23682c = gf.k.a(gf.l.f10027a, new me.a(17, this));
    }

    @Override // og.a
    public final Object a(rg.b decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qg.g d10 = d();
        rg.a w10 = decoder.w(d10);
        int z5 = w10.z(d());
        if (z5 != -1) {
            throw new og.f(androidx.appcompat.widget.c1.i(z5, "Unexpected index "));
        }
        Unit unit = Unit.f19194a;
        w10.g(d10);
        return this.f23680a;
    }

    @Override // og.a
    public final void c(ug.s encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.a(d()).t(d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.i, java.lang.Object] */
    @Override // og.a
    public final qg.g d() {
        return (qg.g) this.f23682c.getValue();
    }
}
