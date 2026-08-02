package l5;

import Ph.P;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import f5.C4260a;
import f5.MobileVitalsSnapshot;
import f5.i;
import f5.k;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import s5.C6339a;

/* loaded from: classes2.dex */
public final class d extends k {

    /* renamed from: h, reason: collision with root package name */
    public final Application f55588h;

    /* renamed from: i, reason: collision with root package name */
    public final double f55589i;

    /* renamed from: j, reason: collision with root package name */
    public final double f55590j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f55591k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumMap f55592l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f55593m;

    /* renamed from: n, reason: collision with root package name */
    public float f55594n;

    /* renamed from: o, reason: collision with root package name */
    public double f55595o;

    /* renamed from: p, reason: collision with root package name */
    public Choreographer f55596p;

    /* renamed from: q, reason: collision with root package name */
    public final b f55597q;

    /* renamed from: r, reason: collision with root package name */
    public final Lazy f55598r;

    /* renamed from: s, reason: collision with root package name */
    public final a f55599s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f55600t;

    /* renamed from: u, reason: collision with root package name */
    public int f55601u;

    /* renamed from: v, reason: collision with root package name */
    public int f55602v;

    public static final class a implements DisplayManager.DisplayListener {
        public a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
            d.this.j2();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            d.this.j2();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
            d.this.j2();
        }
    }

    public static final class b implements Choreographer.FrameCallback {
        public b() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            if (d.this.B().get()) {
                d.this.f2(j10);
                Choreographer choreographer = d.this.f55596p;
                if (choreographer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("choreographer");
                    choreographer = null;
                }
                choreographer.postFrameCallback(this);
            }
        }
    }

    public /* synthetic */ d(Application application, double d10, double d11, long j10, P p10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i10 & 2) != 0 ? 700.0d : d10, (i10 & 4) != 0 ? 0.03d : d11, (i10 & 8) != 0 ? 1000L : j10, (i10 & 16) != 0 ? C6339a.f64787a.a() : p10);
    }

    public static final DisplayManager c2(d dVar) {
        return (DisplayManager) dVar.f55588h.getSystemService(DisplayManager.class);
    }

    public static final void e2(d dVar) {
        Choreographer choreographer = dVar.f55596p;
        if (choreographer != null) {
            if (choreographer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("choreographer");
                choreographer = null;
            }
            choreographer.removeFrameCallback(dVar.f55597q);
        }
        DisplayManager d22 = dVar.d2();
        if (d22 != null) {
            d22.unregisterDisplayListener(dVar.f55599s);
        }
    }

    public static final void g2(d dVar) {
        dVar.f55596p = Choreographer.getInstance();
        dVar.j2();
        DisplayManager d22 = dVar.d2();
        if (d22 != null) {
            d22.registerDisplayListener(dVar.f55599s, dVar.f55591k);
        }
        dVar.f55593m = 0L;
        synchronized (dVar.f55600t) {
            dVar.f55601u = 0;
            dVar.f55602v = 0;
            Unit unit = Unit.INSTANCE;
        }
        Choreographer choreographer = dVar.f55596p;
        if (choreographer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("choreographer");
            choreographer = null;
        }
        choreographer.postFrameCallback(dVar.f55597q);
    }

    public static final void i2(LinkedHashMap linkedHashMap, d dVar, i iVar) {
        Object obj = dVar.f55592l.get(iVar);
        Intrinsics.checkNotNull(obj);
        MobileVitalsSnapshot c10 = ((C4260a) obj).c(iVar.getUnits());
        if (Double.isNaN(c10.getAvg())) {
            return;
        }
        linkedHashMap.put(iVar, c10);
    }

    @Override // f5.k
    public void A0() {
        this.f55591k.post(new Runnable() { // from class: l5.c
            @Override // java.lang.Runnable
            public final void run() {
                d.g2(d.this);
            }
        });
    }

    @Override // f5.k
    public void U() {
        this.f55591k.post(new Runnable() { // from class: l5.a
            @Override // java.lang.Runnable
            public final void run() {
                d.e2(d.this);
            }
        });
        Collection values = this.f55592l.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
        this.f55593m = 0L;
        this.f55594n = 60.0f;
        this.f55595o = 1000.0d / 60.0f;
        this.f55601u = 0;
        this.f55602v = 0;
    }

    public void a2() {
        Collection values = this.f55592l.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C4260a) it.next()).b();
        }
        synchronized (this.f55600t) {
            this.f55601u = 0;
            this.f55602v = 0;
            Unit unit = Unit.INSTANCE;
        }
        this.f55593m = 0L;
    }

    public final Float b2(Application application) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) application.getSystemService(DisplayManager.class);
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            float refreshRate = display.getMode().getRefreshRate();
            if (refreshRate > 0.0f) {
                return Float.valueOf(refreshRate);
            }
            return null;
        } catch (Throwable unused) {
            E5.b.f3006a.k("Failed to read refresh rate, defaulting to 60Hz");
            return null;
        }
    }

    public final DisplayManager d2() {
        return (DisplayManager) this.f55598r.getValue();
    }

    public final void f2(long j10) {
        if (this.f55593m != 0) {
            double d10 = (j10 - this.f55593m) / 1000000.0d;
            synchronized (this.f55600t) {
                try {
                    double d11 = this.f55595o;
                    double d12 = this.f55590j * d11;
                    if (d10 >= this.f55589i) {
                        this.f55602v++;
                        E5.b.f3006a.a("frozen frame detected: " + d10);
                    } else if (d10 > d11 + d12) {
                        this.f55601u++;
                        E5.b.f3006a.a("slow frame detected: " + d10);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f55593m = j10;
    }

    public Map h2(boolean z10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        i2(linkedHashMap, this, i.f46413c);
        i2(linkedHashMap, this, i.f46414d);
        if (z10) {
            a2();
        }
        return linkedHashMap;
    }

    public final void j2() {
        Float b22 = b2(this.f55588h);
        float floatValue = b22 != null ? b22.floatValue() : 60.0f;
        this.f55594n = floatValue;
        this.f55595o = 1000.0d / floatValue;
    }

    @Override // k5.InterfaceC5199a
    public void k1() {
        Pair pair;
        if (B().get()) {
            synchronized (this.f55600t) {
                int i10 = this.f55601u;
                int i11 = this.f55602v;
                this.f55601u = 0;
                this.f55602v = 0;
                pair = TuplesKt.to(Integer.valueOf(i10), Integer.valueOf(i11));
            }
            int intValue = ((Number) pair.component1()).intValue();
            int intValue2 = ((Number) pair.component2()).intValue();
            C4260a c4260a = (C4260a) this.f55592l.get(i.f46413c);
            if (c4260a != null) {
                c4260a.a(intValue);
            }
            C4260a c4260a2 = (C4260a) this.f55592l.get(i.f46414d);
            if (c4260a2 != null) {
                c4260a2.a(intValue2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application application, double d10, double d11, long j10, P detectorScope) {
        super(j10, detectorScope, null, 4, null);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(detectorScope, "detectorScope");
        this.f55588h = application;
        this.f55589i = d10;
        this.f55590j = d11;
        this.f55591k = new Handler(Looper.getMainLooper());
        EnumMap enumMap = new EnumMap(i.class);
        enumMap.put((EnumMap) i.f46413c, (i) new C4260a(0, 1, null));
        enumMap.put((EnumMap) i.f46414d, (i) new C4260a(0, 1, null));
        this.f55592l = enumMap;
        this.f55594n = 60.0f;
        this.f55595o = 16.7d;
        this.f55597q = new b();
        this.f55598r = LazyKt.lazy(new Function0() { // from class: l5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DisplayManager c22;
                c22 = d.c2(d.this);
                return c22;
            }
        });
        this.f55599s = new a();
        this.f55600t = new Object();
    }
}
