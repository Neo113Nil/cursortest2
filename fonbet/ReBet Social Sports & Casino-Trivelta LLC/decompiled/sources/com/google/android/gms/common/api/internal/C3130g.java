package com.google.android.gms.common.api.internal;

import ai.verisoul.sdk.Core;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3140l;
import com.google.android.gms.common.internal.AbstractC3182f;
import com.google.android.gms.common.internal.C3192p;
import com.google.android.gms.common.internal.InterfaceC3194s;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import z.C6901b;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3130g implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f32483p = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: q, reason: collision with root package name */
    public static final Status f32484q = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: r, reason: collision with root package name */
    public static final Object f32485r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static C3130g f32486s;

    /* renamed from: c, reason: collision with root package name */
    public TelemetryData f32489c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC3194s f32490d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f32491e;

    /* renamed from: f, reason: collision with root package name */
    public final GoogleApiAvailability f32492f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.common.internal.H f32493g;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f32500n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f32501o;

    /* renamed from: a, reason: collision with root package name */
    public long f32487a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32488b = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f32494h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f32495i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final Map f32496j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    public E f32497k = null;

    /* renamed from: l, reason: collision with root package name */
    public final Set f32498l = new C6901b();

    /* renamed from: m, reason: collision with root package name */
    public final Set f32499m = new C6901b();

    public C3130g(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f32501o = true;
        this.f32491e = context;
        zau zauVar = new zau(looper, this);
        this.f32500n = zauVar;
        this.f32492f = googleApiAvailability;
        this.f32493g = new com.google.android.gms.common.internal.H(googleApiAvailability);
        if (K9.i.a(context)) {
            this.f32501o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f32485r) {
            try {
                C3130g c3130g = f32486s;
                if (c3130g != null) {
                    c3130g.f32495i.incrementAndGet();
                    Handler handler = c3130g.f32500n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(C3120b c3120b, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + c3120b.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    public static C3130g u(Context context) {
        C3130g c3130g;
        synchronized (f32485r) {
            try {
                if (f32486s == null) {
                    f32486s = new C3130g(context.getApplicationContext(), AbstractC3182f.c().getLooper(), GoogleApiAvailability.r());
                }
                c3130g = f32486s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3130g;
    }

    public final void D(com.google.android.gms.common.api.e eVar, int i10, AbstractC3124d abstractC3124d) {
        this.f32500n.sendMessage(this.f32500n.obtainMessage(4, new E0(new W0(i10, abstractC3124d), this.f32495i.get(), eVar)));
    }

    public final void E(com.google.android.gms.common.api.e eVar, int i10, AbstractC3163x abstractC3163x, TaskCompletionSource taskCompletionSource, InterfaceC3159v interfaceC3159v) {
        k(taskCompletionSource, abstractC3163x.d(), eVar);
        this.f32500n.sendMessage(this.f32500n.obtainMessage(4, new E0(new Y0(i10, abstractC3163x, taskCompletionSource, interfaceC3159v), this.f32495i.get(), eVar)));
    }

    public final void F(MethodInvocation methodInvocation, int i10, long j10, int i11) {
        this.f32500n.sendMessage(this.f32500n.obtainMessage(18, new D0(methodInvocation, i10, j10, i11)));
    }

    public final void G(ConnectionResult connectionResult, int i10) {
        if (f(connectionResult, i10)) {
            return;
        }
        Handler handler = this.f32500n;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, connectionResult));
    }

    public final void H() {
        Handler handler = this.f32500n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void I(com.google.android.gms.common.api.e eVar) {
        Handler handler = this.f32500n;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void b(E e10) {
        synchronized (f32485r) {
            try {
                if (this.f32497k != e10) {
                    this.f32497k = e10;
                    this.f32498l.clear();
                }
                this.f32498l.addAll(e10.i());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(E e10) {
        synchronized (f32485r) {
            try {
                if (this.f32497k == e10) {
                    this.f32497k = null;
                    this.f32498l.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e() {
        if (this.f32488b) {
            return false;
        }
        RootTelemetryConfiguration a10 = C3192p.b().a();
        if (a10 != null && !a10.i()) {
            return false;
        }
        int a11 = this.f32493g.a(this.f32491e, 203400000);
        return a11 == -1 || a11 == 0;
    }

    public final boolean f(ConnectionResult connectionResult, int i10) {
        return this.f32492f.C(this.f32491e, connectionResult, i10);
    }

    public final C3147o0 h(com.google.android.gms.common.api.e eVar) {
        Map map = this.f32496j;
        C3120b apiKey = eVar.getApiKey();
        C3147o0 c3147o0 = (C3147o0) map.get(apiKey);
        if (c3147o0 == null) {
            c3147o0 = new C3147o0(this, eVar);
            this.f32496j.put(apiKey, c3147o0);
        }
        if (c3147o0.a()) {
            this.f32499m.add(apiKey);
        }
        c3147o0.E();
        return c3147o0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C3120b c3120b;
        boolean r10;
        C3120b c3120b2;
        C3120b c3120b3;
        C3120b c3120b4;
        C3120b c3120b5;
        int i10 = message.what;
        C3147o0 c3147o0 = null;
        long j10 = Core.sensorDataTimeout;
        switch (i10) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j10 = 10000;
                }
                this.f32487a = j10;
                this.f32500n.removeMessages(12);
                for (C3120b c3120b6 : this.f32496j.keySet()) {
                    Handler handler = this.f32500n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c3120b6), this.f32487a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (C3147o0 c3147o02 : this.f32496j.values()) {
                    c3147o02.D();
                    c3147o02.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                E0 e02 = (E0) message.obj;
                C3147o0 c3147o03 = (C3147o0) this.f32496j.get(e02.f32350c.getApiKey());
                if (c3147o03 == null) {
                    c3147o03 = h(e02.f32350c);
                }
                if (!c3147o03.a() || this.f32495i.get() == e02.f32349b) {
                    c3147o03.F(e02.f32348a);
                } else {
                    e02.f32348a.a(f32483p);
                    c3147o03.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.f32496j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3147o0 c3147o04 = (C3147o0) it.next();
                        if (c3147o04.s() == i11) {
                            c3147o0 = c3147o04;
                        }
                    }
                }
                if (c3147o0 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.h() == 13) {
                    c3147o0.f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f32492f.g(connectionResult.h()) + ": " + connectionResult.i()));
                } else {
                    c3120b = c3147o0.f32543c;
                    c3147o0.f(g(c3120b, connectionResult));
                }
                return true;
            case 6:
                if (this.f32491e.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3122c.c((Application) this.f32491e.getApplicationContext());
                    ComponentCallbacks2C3122c.b().a(new C3137j0(this));
                    if (!ComponentCallbacks2C3122c.b().e(true)) {
                        this.f32487a = Core.sensorDataTimeout;
                    }
                }
                return true;
            case 7:
                h((com.google.android.gms.common.api.e) message.obj);
                return true;
            case 9:
                if (this.f32496j.containsKey(message.obj)) {
                    ((C3147o0) this.f32496j.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f32499m.iterator();
                while (it2.hasNext()) {
                    C3147o0 c3147o05 = (C3147o0) this.f32496j.remove((C3120b) it2.next());
                    if (c3147o05 != null) {
                        c3147o05.K();
                    }
                }
                this.f32499m.clear();
                return true;
            case 11:
                if (this.f32496j.containsKey(message.obj)) {
                    ((C3147o0) this.f32496j.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f32496j.containsKey(message.obj)) {
                    ((C3147o0) this.f32496j.get(message.obj)).b();
                }
                return true;
            case 14:
                F f10 = (F) message.obj;
                C3120b a10 = f10.a();
                if (this.f32496j.containsKey(a10)) {
                    r10 = ((C3147o0) this.f32496j.get(a10)).r(false);
                    f10.b().setResult(Boolean.valueOf(r10));
                } else {
                    f10.b().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                C3151q0 c3151q0 = (C3151q0) message.obj;
                Map map = this.f32496j;
                c3120b2 = c3151q0.f32559a;
                if (map.containsKey(c3120b2)) {
                    Map map2 = this.f32496j;
                    c3120b3 = c3151q0.f32559a;
                    C3147o0.B((C3147o0) map2.get(c3120b3), c3151q0);
                }
                return true;
            case 16:
                C3151q0 c3151q02 = (C3151q0) message.obj;
                Map map3 = this.f32496j;
                c3120b4 = c3151q02.f32559a;
                if (map3.containsKey(c3120b4)) {
                    Map map4 = this.f32496j;
                    c3120b5 = c3151q02.f32559a;
                    C3147o0.C((C3147o0) map4.get(c3120b5), c3151q02);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                D0 d02 = (D0) message.obj;
                if (d02.f32344c == 0) {
                    i().a(new TelemetryData(d02.f32343b, Arrays.asList(d02.f32342a)));
                } else {
                    TelemetryData telemetryData = this.f32489c;
                    if (telemetryData != null) {
                        List h10 = telemetryData.h();
                        if (telemetryData.g() != d02.f32343b || (h10 != null && h10.size() >= d02.f32345d)) {
                            this.f32500n.removeMessages(17);
                            j();
                        } else {
                            this.f32489c.i(d02.f32342a);
                        }
                    }
                    if (this.f32489c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(d02.f32342a);
                        this.f32489c = new TelemetryData(d02.f32343b, arrayList);
                        Handler handler2 = this.f32500n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), d02.f32344c);
                    }
                }
                return true;
            case 19:
                this.f32488b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final InterfaceC3194s i() {
        if (this.f32490d == null) {
            this.f32490d = com.google.android.gms.common.internal.r.a(this.f32491e);
        }
        return this.f32490d;
    }

    public final void j() {
        TelemetryData telemetryData = this.f32489c;
        if (telemetryData != null) {
            if (telemetryData.g() > 0 || e()) {
                i().a(telemetryData);
            }
            this.f32489c = null;
        }
    }

    public final void k(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.e eVar) {
        C0 a10;
        if (i10 == 0 || (a10 = C0.a(this, i10, eVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f32500n;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.i0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, a10);
    }

    public final int l() {
        return this.f32494h.getAndIncrement();
    }

    public final C3147o0 t(C3120b c3120b) {
        return (C3147o0) this.f32496j.get(c3120b);
    }

    public final Task w(com.google.android.gms.common.api.e eVar) {
        F f10 = new F(eVar.getApiKey());
        this.f32500n.sendMessage(this.f32500n.obtainMessage(14, f10));
        return f10.b().getTask();
    }

    public final Task x(com.google.android.gms.common.api.e eVar, AbstractC3150q abstractC3150q, AbstractC3167z abstractC3167z, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, abstractC3150q.e(), eVar);
        this.f32500n.sendMessage(this.f32500n.obtainMessage(8, new E0(new X0(new F0(abstractC3150q, abstractC3167z, runnable), taskCompletionSource), this.f32495i.get(), eVar)));
        return taskCompletionSource.getTask();
    }

    public final Task y(com.google.android.gms.common.api.e eVar, C3140l.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, i10, eVar);
        this.f32500n.sendMessage(this.f32500n.obtainMessage(13, new E0(new Z0(aVar, taskCompletionSource), this.f32495i.get(), eVar)));
        return taskCompletionSource.getTask();
    }
}
