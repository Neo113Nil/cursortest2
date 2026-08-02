package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.i;
import eb.C4196f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import mb.w;
import wb.InterfaceC6736b;
import xb.C6818b;
import xb.C6819c;
import yb.AbstractC6870d;
import yb.AbstractC6872f;
import yb.C6869c;

/* loaded from: classes3.dex */
public class g implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f37803m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f37804n = new a();

    /* renamed from: a, reason: collision with root package name */
    public final C4196f f37805a;

    /* renamed from: b, reason: collision with root package name */
    public final C6869c f37806b;

    /* renamed from: c, reason: collision with root package name */
    public final C6819c f37807c;

    /* renamed from: d, reason: collision with root package name */
    public final p f37808d;

    /* renamed from: e, reason: collision with root package name */
    public final w f37809e;

    /* renamed from: f, reason: collision with root package name */
    public final n f37810f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f37811g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f37812h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f37813i;

    /* renamed from: j, reason: collision with root package name */
    public String f37814j;

    /* renamed from: k, reason: collision with root package name */
    public Set f37815k;

    /* renamed from: l, reason: collision with root package name */
    public final List f37816l;

    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f37817a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f37817a.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        static {
            int[] iArr = new int[AbstractC6872f.b.values().length];
            $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = iArr;
            try {
                iArr[AbstractC6872f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[AbstractC6872f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[AbstractC6872f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC6870d.b.values().length];
            $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = iArr2;
            try {
                iArr2[AbstractC6870d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[AbstractC6870d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public g(final C4196f c4196f, InterfaceC6736b interfaceC6736b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c4196f, new C6869c(c4196f.l(), interfaceC6736b), new C6819c(c4196f), p.c(), new w(new InterfaceC6736b() { // from class: com.google.firebase.installations.c
            @Override // wb.InterfaceC6736b
            public final Object get() {
                return g.e(C4196f.this);
            }
        }), new n());
    }

    public static /* synthetic */ C6818b e(C4196f c4196f) {
        return new C6818b(c4196f);
    }

    public static g p() {
        return q(C4196f.n());
    }

    public static g q(C4196f c4196f) {
        AbstractC3191o.b(c4196f != null, "Null is not a valid value of FirebaseApp.");
        return (g) c4196f.j(h.class);
    }

    public final synchronized void A(String str) {
        this.f37814j = str;
    }

    public final synchronized void B(xb.d dVar, xb.d dVar2) {
        if (this.f37815k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f37815k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    @Override // com.google.firebase.installations.h
    public Task a(final boolean z10) {
        v();
        Task f10 = f();
        this.f37812h.execute(new Runnable() { // from class: com.google.firebase.installations.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(z10);
            }
        });
        return f10;
    }

    public final Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new k(this.f37808d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new l(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.firebase.installations.h
    public Task getId() {
        v();
        String n10 = n();
        if (n10 != null) {
            return Tasks.forResult(n10);
        }
        Task g10 = g();
        this.f37812h.execute(new Runnable() { // from class: com.google.firebase.installations.d
            @Override // java.lang.Runnable
            public final void run() {
                g.this.j(false);
            }
        });
        return g10;
    }

    public final void h(o oVar) {
        synchronized (this.f37811g) {
            this.f37816l.add(oVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z10) {
        xb.d x10;
        xb.d r10 = r();
        try {
            if (!r10.i() && !r10.l()) {
                if (!z10 && !this.f37808d.f(r10)) {
                    return;
                }
                x10 = k(r10);
                u(x10);
                B(r10, x10);
                if (x10.k()) {
                    A(x10.d());
                }
                if (!x10.i()) {
                    y(new i(i.a.BAD_CONFIG));
                    return;
                } else if (x10.j()) {
                    y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    return;
                } else {
                    z(x10);
                    return;
                }
            }
            x10 = x(r10);
            u(x10);
            B(r10, x10);
            if (x10.k()) {
            }
            if (!x10.i()) {
            }
        } catch (i e10) {
            y(e10);
        }
    }

    public final void j(final boolean z10) {
        xb.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        z(s10);
        this.f37813i.execute(new Runnable() { // from class: com.google.firebase.installations.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.i(z10);
            }
        });
    }

    public final xb.d k(xb.d dVar) {
        AbstractC6872f e10 = this.f37806b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f37808d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    public String l() {
        return this.f37805a.q().b();
    }

    public String m() {
        return this.f37805a.q().c();
    }

    public final synchronized String n() {
        return this.f37814j;
    }

    public final C6818b o() {
        return (C6818b) this.f37809e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final xb.d r() {
        xb.d d10;
        synchronized (f37803m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f37805a.l(), "generatefid.lock");
                try {
                    d10 = this.f37807c.d();
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return d10;
    }

    /* JADX WARN: Finally extract failed */
    public final xb.d s() {
        xb.d d10;
        synchronized (f37803m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f37805a.l(), "generatefid.lock");
                try {
                    d10 = this.f37807c.d();
                    if (d10.j()) {
                        d10 = this.f37807c.b(d10.t(w(d10)));
                    }
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return d10;
    }

    public String t() {
        return this.f37805a.q().g();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(xb.d dVar) {
        synchronized (f37803m) {
            try {
                com.google.firebase.installations.b a10 = com.google.firebase.installations.b.a(this.f37805a.l(), "generatefid.lock");
                try {
                    this.f37807c.b(dVar);
                    if (a10 != null) {
                        a10.b();
                    }
                } catch (Throwable th2) {
                    if (a10 != null) {
                        a10.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void v() {
        AbstractC3191o.h(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3191o.h(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3191o.h(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3191o.b(p.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC3191o.b(p.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(xb.d dVar) {
        if ((!this.f37805a.p().equals("CHIME_ANDROID_SDK") && !this.f37805a.x()) || !dVar.m()) {
            return this.f37810f.a();
        }
        String f10 = o().f();
        return TextUtils.isEmpty(f10) ? this.f37810f.a() : f10;
    }

    public final xb.d x(xb.d dVar) {
        AbstractC6870d d10 = this.f37806b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i10 = b.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f37808d.b(), d10.b().c(), d10.b().d());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.f37811g) {
            try {
                Iterator it = this.f37816l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(xb.d dVar) {
        synchronized (this.f37811g) {
            try {
                Iterator it = this.f37816l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g(ExecutorService executorService, Executor executor, C4196f c4196f, C6869c c6869c, C6819c c6819c, p pVar, w wVar, n nVar) {
        this.f37811g = new Object();
        this.f37815k = new HashSet();
        this.f37816l = new ArrayList();
        this.f37805a = c4196f;
        this.f37806b = c6869c;
        this.f37807c = c6819c;
        this.f37808d = pVar;
        this.f37809e = wVar;
        this.f37810f = nVar;
        this.f37812h = executorService;
        this.f37813i = executor;
    }
}
