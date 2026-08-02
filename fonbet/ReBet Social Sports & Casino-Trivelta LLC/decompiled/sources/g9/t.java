package g9;

import android.content.Context;
import d9.C4040c;
import d9.InterfaceC4046i;
import d9.InterfaceC4047j;
import java.util.Collections;
import java.util.Set;
import m9.InterfaceC5569e;
import q9.InterfaceC6129a;

/* loaded from: classes2.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile u f47216e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6129a f47217a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6129a f47218b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5569e f47219c;

    /* renamed from: d, reason: collision with root package name */
    public final n9.r f47220d;

    public t(InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, InterfaceC5569e interfaceC5569e, n9.r rVar, n9.v vVar) {
        this.f47217a = interfaceC6129a;
        this.f47218b = interfaceC6129a2;
        this.f47219c = interfaceC5569e;
        this.f47220d = rVar;
        vVar.c();
    }

    public static t c() {
        u uVar = f47216e;
        if (uVar != null) {
            return uVar.k();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C4040c.b("proto"));
    }

    public static void f(Context context) {
        if (f47216e == null) {
            synchronized (t.class) {
                try {
                    if (f47216e == null) {
                        f47216e = e.r().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // g9.s
    public void a(n nVar, InterfaceC4047j interfaceC4047j) {
        this.f47219c.a(nVar.f().f(nVar.c().c()), b(nVar), interfaceC4047j);
    }

    public final i b(n nVar) {
        return i.a().i(this.f47217a.a()).k(this.f47218b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public n9.r e() {
        return this.f47220d;
    }

    public InterfaceC4046i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
