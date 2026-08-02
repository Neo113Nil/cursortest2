package m9;

import d9.InterfaceC4047j;
import g9.o;
import g9.t;
import h9.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import n9.x;
import o9.InterfaceC5842d;
import p9.InterfaceC6058b;

/* renamed from: m9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5567c implements InterfaceC5569e {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f56397f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final x f56398a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f56399b;

    /* renamed from: c, reason: collision with root package name */
    public final h9.e f56400c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC5842d f56401d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC6058b f56402e;

    public C5567c(Executor executor, h9.e eVar, x xVar, InterfaceC5842d interfaceC5842d, InterfaceC6058b interfaceC6058b) {
        this.f56399b = executor;
        this.f56400c = eVar;
        this.f56398a = xVar;
        this.f56401d = interfaceC5842d;
        this.f56402e = interfaceC6058b;
    }

    public static /* synthetic */ Object b(C5567c c5567c, o oVar, g9.i iVar) {
        c5567c.f56401d.L0(oVar, iVar);
        c5567c.f56398a.b(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final C5567c c5567c, final o oVar, InterfaceC4047j interfaceC4047j, g9.i iVar) {
        c5567c.getClass();
        try {
            m mVar = c5567c.f56400c.get(oVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f56397f.warning(format);
                interfaceC4047j.a(new IllegalArgumentException(format));
            } else {
                final g9.i a10 = mVar.a(iVar);
                c5567c.f56402e.d(new InterfaceC6058b.a() { // from class: m9.b
                    @Override // p9.InterfaceC6058b.a
                    public final Object execute() {
                        return C5567c.b(C5567c.this, oVar, a10);
                    }
                });
                interfaceC4047j.a(null);
            }
        } catch (Exception e10) {
            f56397f.warning("Error scheduling event " + e10.getMessage());
            interfaceC4047j.a(e10);
        }
    }

    @Override // m9.InterfaceC5569e
    public void a(final o oVar, final g9.i iVar, final InterfaceC4047j interfaceC4047j) {
        this.f56399b.execute(new Runnable() { // from class: m9.a
            @Override // java.lang.Runnable
            public final void run() {
                C5567c.c(C5567c.this, oVar, interfaceC4047j, iVar);
            }
        });
    }
}
