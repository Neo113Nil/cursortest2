package og;

import gf.k;
import gf.l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends sg.b {

    /* renamed from: a, reason: collision with root package name */
    public final ag.c f21222a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f21223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21224c;

    public d(ag.c baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f21222a = baseClass;
        this.f21223b = e0.f19204a;
        this.f21224c = k.a(l.f10027a, new me.a(6, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gf.i, java.lang.Object] */
    @Override // og.a
    public final qg.g d() {
        return (qg.g) this.f21224c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f21222a + ')';
    }
}
