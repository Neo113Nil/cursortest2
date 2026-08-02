package g9;

import d9.AbstractC4041d;
import d9.C4040c;
import d9.InterfaceC4044g;
import d9.InterfaceC4045h;
import d9.InterfaceC4047j;

/* loaded from: classes2.dex */
public final class r implements InterfaceC4045h {

    /* renamed from: a, reason: collision with root package name */
    public final o f47211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47212b;

    /* renamed from: c, reason: collision with root package name */
    public final C4040c f47213c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4044g f47214d;

    /* renamed from: e, reason: collision with root package name */
    public final s f47215e;

    public r(o oVar, String str, C4040c c4040c, InterfaceC4044g interfaceC4044g, s sVar) {
        this.f47211a = oVar;
        this.f47212b = str;
        this.f47213c = c4040c;
        this.f47214d = interfaceC4044g;
        this.f47215e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // d9.InterfaceC4045h
    public void a(AbstractC4041d abstractC4041d) {
        c(abstractC4041d, new InterfaceC4047j() { // from class: g9.q
            @Override // d9.InterfaceC4047j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(AbstractC4041d abstractC4041d, InterfaceC4047j interfaceC4047j) {
        this.f47215e.a(n.a().e(this.f47211a).c(abstractC4041d).f(this.f47212b).d(this.f47214d).b(this.f47213c).a(), interfaceC4047j);
    }
}
