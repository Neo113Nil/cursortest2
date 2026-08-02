package io.seon.androidsdk.service;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    public SensorManager f53029a;

    /* renamed from: b, reason: collision with root package name */
    public Sensor f53030b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f53031c;

    /* renamed from: d, reason: collision with root package name */
    public Sensor f53032d;

    /* renamed from: e, reason: collision with root package name */
    public Sensor f53033e;

    /* renamed from: f, reason: collision with root package name */
    public Sensor f53034f;

    /* renamed from: h, reason: collision with root package name */
    public long f53036h;

    /* renamed from: i, reason: collision with root package name */
    public long f53037i;

    /* renamed from: j, reason: collision with root package name */
    public X f53038j;

    /* renamed from: k, reason: collision with root package name */
    public X f53039k;

    /* renamed from: l, reason: collision with root package name */
    public O6 f53040l;

    /* renamed from: m, reason: collision with root package name */
    public C4978m3 f53041m;

    /* renamed from: n, reason: collision with root package name */
    public C4934h f53042n;

    /* renamed from: g, reason: collision with root package name */
    public boolean f53035g = false;

    /* renamed from: o, reason: collision with root package name */
    public final C5028s6 f53043o = new C5028s6(this, 0);

    public L6(final Context context) {
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.G6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.q(context);
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.H6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.s();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.I6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.t();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.J6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.u();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.K6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.v();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.v6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.w();
            }
        });
        V.h(new Runnable() { // from class: io.seon.androidsdk.service.w6
            @Override // java.lang.Runnable
            public final void run() {
                L6.this.C();
            }
        });
    }

    public static HashMap m(C4958k c4958k) {
        c4958k.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("med", Float.valueOf(c4958k.f53403a));
        hashMap.put("max", Float.valueOf(c4958k.f53404b));
        hashMap.put("min", Float.valueOf(c4958k.f53405c));
        hashMap.put("p95", Float.valueOf(c4958k.f53406d));
        hashMap.put("sample", Integer.valueOf(c4958k.f53407e));
        return hashMap;
    }

    public static HashMap n(X0 x02) {
        x02.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("topDiffs", x02.f53201d);
        hashMap.put("bc", Integer.valueOf(x02.f53198a));
        hashMap.put("sc", Integer.valueOf(x02.f53199b));
        hashMap.put("sample", Integer.valueOf(x02.f53200c));
        return hashMap;
    }

    public static HashMap o(C4931g4 c4931g4) {
        c4931g4.getClass();
        HashMap hashMap = new HashMap();
        float[][] fArr = c4931g4.f53315a;
        ArrayList arrayList = new ArrayList();
        for (float[] fArr2 : fArr) {
            ArrayList arrayList2 = new ArrayList();
            for (float f10 : fArr2) {
                arrayList2.add(Float.valueOf(f10));
            }
            arrayList.add(arrayList2);
        }
        hashMap.put("elems", arrayList);
        hashMap.put("sample", Integer.valueOf(c4931g4.f53316b));
        return hashMap;
    }

    public static HashMap p(Q6 q62) {
        q62.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("min", Float.valueOf(q62.f53119c));
        hashMap.put("max", Float.valueOf(q62.f53118b));
        hashMap.put("med", Float.valueOf(q62.f53117a));
        hashMap.put("p95", Float.valueOf(q62.f53120d));
        hashMap.put("sample", Integer.valueOf(q62.f53121e));
        return hashMap;
    }

    public static HashMap r(X0 x02) {
        x02.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("topDiffs", x02.f53201d);
        hashMap.put("bc", Integer.valueOf(x02.f53198a));
        hashMap.put("sc", Integer.valueOf(x02.f53199b));
        hashMap.put("sample", Integer.valueOf(x02.f53200c));
        return hashMap;
    }

    public final /* synthetic */ void A() {
        this.f53029a.registerListener(this.f53043o, this.f53032d, 3);
    }

    public final /* synthetic */ void B() {
        this.f53029a.registerListener(this.f53043o, this.f53034f, 3);
    }

    public final void C() {
        this.f53038j = new X();
        this.f53039k = new X();
        this.f53040l = new O6();
        this.f53041m = new C4978m3();
        this.f53042n = new C4934h();
        this.f53036h = -1L;
        this.f53037i = -2L;
    }

    public final void D() {
        try {
            if (this.f53035g) {
                return;
            }
            C();
            this.f53035g = true;
            this.f53036h = System.currentTimeMillis();
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.u6
                    @Override // java.lang.Runnable
                    public final void run() {
                        L6.this.x();
                    }
                }.run();
            } catch (Throwable unused) {
            }
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.C6
                    @Override // java.lang.Runnable
                    public final void run() {
                        L6.this.y();
                    }
                }.run();
            } catch (Throwable unused2) {
            }
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.D6
                    @Override // java.lang.Runnable
                    public final void run() {
                        L6.this.z();
                    }
                }.run();
            } catch (Throwable unused3) {
            }
            try {
                new Runnable() { // from class: io.seon.androidsdk.service.E6
                    @Override // java.lang.Runnable
                    public final void run() {
                        L6.this.A();
                    }
                }.run();
            } catch (Throwable unused4) {
            }
            new Runnable() { // from class: io.seon.androidsdk.service.F6
                @Override // java.lang.Runnable
                public final void run() {
                    L6.this.B();
                }
            }.run();
        } catch (Throwable unused5) {
        }
    }

    public final void E() {
        try {
            if (!this.f53035g) {
                throw new Kh.a("You have to start monitoring before collecting the results!");
            }
            this.f53035g = false;
            this.f53037i = System.currentTimeMillis();
            this.f53029a.unregisterListener(this.f53043o);
        } catch (Kh.a e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public final HashMap l() {
        HashMap hashMap = new HashMap();
        try {
            final Q6 e10 = this.f53040l.e();
            C4978m3 c4978m3 = this.f53041m;
            final C4931g4 c4931g4 = new C4931g4(c4978m3.d(), c4978m3.f53083d);
            final X0 e11 = this.f53038j.e();
            final X0 e12 = this.f53039k.e();
            final C4958k e13 = this.f53042n.e();
            hashMap.put("light", V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.x6
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    return L6.p(Q6.this);
                }
            }));
            hashMap.put("prox", V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.y6
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    return L6.o(C4931g4.this);
                }
            }));
            hashMap.put("acc", V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.z6
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    return L6.n(X0.this);
                }
            }));
            hashMap.put("gyro", V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.A6
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    return L6.r(X0.this);
                }
            }));
            hashMap.put("mag", V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.B6
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    return L6.m(C4958k.this);
                }
            }));
            hashMap.put("duration", Long.valueOf(this.f53037i - this.f53036h));
            return hashMap;
        } catch (Exception e14) {
            hashMap.put("error", e14.getClass().getSimpleName());
            V.j("bhvr", e14);
            return hashMap;
        }
    }

    public final /* synthetic */ void q(Context context) {
        this.f53029a = (SensorManager) context.getApplicationContext().getSystemService("sensor");
    }

    public final /* synthetic */ void s() {
        this.f53030b = this.f53029a.getDefaultSensor(1);
    }

    public final /* synthetic */ void t() {
        this.f53031c = this.f53029a.getDefaultSensor(4);
    }

    public final /* synthetic */ void u() {
        this.f53032d = this.f53029a.getDefaultSensor(5);
    }

    public final /* synthetic */ void v() {
        this.f53033e = this.f53029a.getDefaultSensor(8);
    }

    public final /* synthetic */ void w() {
        this.f53034f = this.f53029a.getDefaultSensor(2);
    }

    public final /* synthetic */ void x() {
        this.f53029a.registerListener(this.f53043o, this.f53030b, 3);
    }

    public final /* synthetic */ void y() {
        this.f53029a.registerListener(this.f53043o, this.f53031c, 3);
    }

    public final /* synthetic */ void z() {
        this.f53029a.registerListener(this.f53043o, this.f53033e, 3);
    }
}
