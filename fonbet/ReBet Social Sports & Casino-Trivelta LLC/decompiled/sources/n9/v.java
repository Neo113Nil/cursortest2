package n9;

import java.util.Iterator;
import java.util.concurrent.Executor;
import o9.InterfaceC5842d;
import p9.InterfaceC6058b;

/* loaded from: classes2.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f57145a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5842d f57146b;

    /* renamed from: c, reason: collision with root package name */
    public final x f57147c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC6058b f57148d;

    public v(Executor executor, InterfaceC5842d interfaceC5842d, x xVar, InterfaceC6058b interfaceC6058b) {
        this.f57145a = executor;
        this.f57146b = interfaceC5842d;
        this.f57147c = xVar;
        this.f57148d = interfaceC6058b;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f57146b.Q().iterator();
        while (it.hasNext()) {
            vVar.f57147c.b((g9.o) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f57145a.execute(new Runnable() { // from class: n9.t
            @Override // java.lang.Runnable
            public final void run() {
                r0.f57148d.d(new InterfaceC6058b.a() { // from class: n9.u
                    @Override // p9.InterfaceC6058b.a
                    public final Object execute() {
                        return v.a(v.this);
                    }
                });
            }
        });
    }
}
