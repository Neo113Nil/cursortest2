package e;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import dj.C6204a;
import g.AbstractC6595g;
import g.C6598j;
import h.C6763i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6228c extends AbstractC7737t implements Function1<N, M> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6226a<Object> f61682b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6595g f61683c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f61684d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C6763i f61685e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f61686f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6228c(C6226a c6226a, AbstractC6595g abstractC6595g, String str, C6763i c6763i, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f61682b = c6226a;
        this.f61683c = abstractC6595g;
        this.f61684d = str;
        this.f61685e = c6763i;
        this.f61686f = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N n11) {
        C6204a c6204a = new C6204a(this.f61686f, 1);
        C6598j j11 = this.f61683c.j(this.f61684d, this.f61685e, c6204a);
        C6226a<Object> c6226a = this.f61682b;
        c6226a.b(j11);
        return new C6227b(c6226a);
    }
}
