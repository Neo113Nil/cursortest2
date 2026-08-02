package g70;

import android.content.Context;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class g implements Jb.e<f> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f63963a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f63964b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<d70.d> f63965c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<V60.a> f63966d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f63967e;

    public g(Pc.a<Context> aVar, Pc.a<S80.b> aVar2, Pc.a<d70.d> aVar3, Pc.a<V60.a> aVar4, Pc.a<InterfaceC6618a> aVar5) {
        this.f63963a = aVar;
        this.f63964b = aVar2;
        this.f63965c = aVar3;
        this.f63966d = aVar4;
        this.f63967e = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new f(this.f63963a.get(), this.f63964b.get(), this.f63965c.get(), this.f63966d.get(), this.f63967e.get());
    }
}
