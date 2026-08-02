package io.sentry.cache;

import io.sentry.C4743e3;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4730c0;
import io.sentry.O1;
import io.sentry.a4;
import io.sentry.cache.tape.c;
import io.sentry.cache.tape.d;
import io.sentry.protocol.C4802d;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import io.sentry.util.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t extends O1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f51954c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public F3 f51955a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.util.p f51956b = new io.sentry.util.p(new p.a() { // from class: io.sentry.cache.k
        @Override // io.sentry.util.p.a
        public final Object a() {
            return t.v(t.this);
        }
    });

    public class a implements c.a {
        public a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C4744f b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), t.f51954c));
                try {
                    C4744f c4744f = (C4744f) t.this.f51955a.getSerializer().c(bufferedReader, C4744f.class);
                    bufferedReader.close();
                    return c4744f;
                } finally {
                }
            } catch (Throwable th2) {
                t.this.f51955a.getLogger().a(EnumC4788n3.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(C4744f c4744f, OutputStream outputStream) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, t.f51954c));
            try {
                t.this.f51955a.getSerializer().a(c4744f, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public t(F3 f32) {
        this.f51955a = f32;
    }

    public static void G(F3 f32, Object obj, String str) {
        d.d(f32, obj, ".scope-cache", str);
    }

    public static /* synthetic */ void o(t tVar, a4 a4Var, InterfaceC4730c0 interfaceC4730c0) {
        if (a4Var != null) {
            tVar.H(a4Var, "trace.json");
        } else {
            tVar.getClass();
            tVar.H(interfaceC4730c0.O().i(), "trace.json");
        }
    }

    public static /* synthetic */ void p(t tVar, F f10) {
        if (f10 == null) {
            tVar.B("user.json");
        } else {
            tVar.H(f10, "user.json");
        }
    }

    public static /* synthetic */ void t(t tVar) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f51956b.a()).clear();
        } catch (IOException e10) {
            tVar.f51955a.getLogger().b(EnumC4788n3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
    }

    public static /* synthetic */ void u(t tVar, String str) {
        if (str == null) {
            tVar.B("transaction.json");
        } else {
            tVar.H(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c v(t tVar) {
        io.sentry.cache.tape.d a10;
        File b10 = d.b(tVar.f51955a, ".scope-cache");
        if (b10 == null) {
            tVar.f51955a.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.A0();
        }
        File file = new File(b10, "breadcrumbs.json");
        try {
            try {
                a10 = new d.a(file).b(tVar.f51955a.getMaxBreadcrumbs()).a();
            } catch (IOException e10) {
                tVar.f51955a.getLogger().b(EnumC4788n3.ERROR, "Failed to create breadcrumbs queue", e10);
                return io.sentry.cache.tape.c.A0();
            }
        } catch (IOException unused) {
            file.delete();
            a10 = new d.a(file).b(tVar.f51955a.getMaxBreadcrumbs()).a();
        }
        return io.sentry.cache.tape.c.B(a10, tVar.new a());
    }

    public static /* synthetic */ void y(t tVar, C4744f c4744f) {
        tVar.getClass();
        try {
            ((io.sentry.cache.tape.c) tVar.f51956b.a()).k(c4744f);
        } catch (IOException e10) {
            tVar.f51955a.getLogger().b(EnumC4788n3.ERROR, "Failed to add breadcrumb to file queue", e10);
        }
    }

    public final void B(String str) {
        d.a(this.f51955a, ".scope-cache", str);
    }

    public Object C(F3 f32, String str, Class cls) {
        if (!str.equals("breadcrumbs.json")) {
            return d.c(f32, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(((io.sentry.cache.tape.c) this.f51956b.a()).r());
        } catch (IOException unused) {
            f32.getLogger().c(EnumC4788n3.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void D() {
        try {
            ((io.sentry.cache.tape.c) this.f51956b.a()).clear();
        } catch (IOException e10) {
            this.f51955a.getLogger().b(EnumC4788n3.ERROR, "Failed to clear breadcrumbs from file queue", e10);
        }
        B("user.json");
        B("level.json");
        B("request.json");
        B("fingerprint.json");
        B("contexts.json");
        B("extras.json");
        B("tags.json");
        B("trace.json");
        B("transaction.json");
    }

    public final void E(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            this.f51955a.getLogger().b(EnumC4788n3.ERROR, "Serialization task failed", th2);
        }
    }

    public final void F(final Runnable runnable) {
        if (this.f51955a.isEnableScopePersistence()) {
            if (C4743e3.d()) {
                E(runnable);
                return;
            }
            try {
                this.f51955a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        t.this.E(runnable);
                    }
                });
            } catch (Throwable th2) {
                this.f51955a.getLogger().b(EnumC4788n3.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public final void H(Object obj, String str) {
        G(this.f51955a, obj, str);
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void b(final Map map) {
        F(new Runnable() { // from class: io.sentry.cache.m
            @Override // java.lang.Runnable
            public final void run() {
                t.this.H(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.InterfaceC4735d0
    public void d(final C4744f c4744f) {
        F(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                t.y(t.this, c4744f);
            }
        });
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void h(Collection collection) {
        if (collection.isEmpty()) {
            F(new Runnable() { // from class: io.sentry.cache.q
                @Override // java.lang.Runnable
                public final void run() {
                    t.t(t.this);
                }
            });
        }
    }

    @Override // io.sentry.InterfaceC4735d0
    public void i(final a4 a4Var, final InterfaceC4730c0 interfaceC4730c0) {
        F(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                t.o(t.this, a4Var, interfaceC4730c0);
            }
        });
    }

    @Override // io.sentry.InterfaceC4735d0
    public void j(final F f10) {
        F(new Runnable() { // from class: io.sentry.cache.i
            @Override // java.lang.Runnable
            public final void run() {
                t.p(t.this, f10);
            }
        });
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void k(final C4802d c4802d) {
        F(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                t.this.H(c4802d, "contexts.json");
            }
        });
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void l(final Map map) {
        F(new Runnable() { // from class: io.sentry.cache.p
            @Override // java.lang.Runnable
            public final void run() {
                t.this.H(map, "extras.json");
            }
        });
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void m(final String str) {
        F(new Runnable() { // from class: io.sentry.cache.s
            @Override // java.lang.Runnable
            public final void run() {
                t.u(t.this, str);
            }
        });
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void s(final u uVar) {
        F(new Runnable() { // from class: io.sentry.cache.r
            @Override // java.lang.Runnable
            public final void run() {
                t.this.H(uVar, "replay.json");
            }
        });
    }
}
