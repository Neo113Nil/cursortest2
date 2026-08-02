package Ic;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5720a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5721b;

    /* renamed from: c, reason: collision with root package name */
    public float f5722c;

    /* renamed from: d, reason: collision with root package name */
    public float f5723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5724e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5725f;

    /* renamed from: g, reason: collision with root package name */
    public float f5726g;

    /* renamed from: h, reason: collision with root package name */
    public float f5727h;

    /* renamed from: i, reason: collision with root package name */
    public float f5728i;

    /* renamed from: j, reason: collision with root package name */
    public float f5729j;

    /* renamed from: k, reason: collision with root package name */
    public float f5730k;

    /* renamed from: l, reason: collision with root package name */
    public float f5731l;

    /* renamed from: m, reason: collision with root package name */
    public float f5732m;

    /* renamed from: n, reason: collision with root package name */
    public long f5733n;

    /* renamed from: o, reason: collision with root package name */
    public long f5734o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5735p;

    /* renamed from: q, reason: collision with root package name */
    public int f5736q;

    /* renamed from: r, reason: collision with root package name */
    public int f5737r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f5738s;

    /* renamed from: t, reason: collision with root package name */
    public float f5739t;

    /* renamed from: u, reason: collision with root package name */
    public float f5740u;

    /* renamed from: v, reason: collision with root package name */
    public int f5741v;

    /* renamed from: w, reason: collision with root package name */
    public GestureDetector f5742w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5743x;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            y.this.f5739t = motionEvent.getX();
            y.this.f5740u = motionEvent.getY();
            y.this.f5741v = 1;
            return true;
        }
    }

    public interface b {
        boolean a(y yVar);

        void b(y yVar);

        boolean c(y yVar);
    }

    public y(Context context, b bVar) {
        this(context, bVar, null);
    }

    public float d() {
        return this.f5726g;
    }

    public float e() {
        return this.f5722c;
    }

    public float f() {
        return this.f5723d;
    }

    public float g() {
        if (!j()) {
            float f10 = this.f5727h;
            if (f10 > 0.0f) {
                return this.f5726g / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.f5743x;
        boolean z11 = (z10 && this.f5726g < this.f5727h) || (!z10 && this.f5726g > this.f5727h);
        float abs = Math.abs(1.0f - (this.f5726g / this.f5727h)) * 0.5f;
        if (this.f5727h <= this.f5736q) {
            return 1.0f;
        }
        return z11 ? abs + 1.0f : 1.0f - abs;
    }

    public long h() {
        return this.f5733n - this.f5734o;
    }

    public double i() {
        return h() / 1000.0d;
    }

    public final boolean j() {
        return this.f5741v != 0;
    }

    public boolean k(MotionEvent motionEvent) {
        float f10;
        float f11;
        this.f5733n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5724e) {
            this.f5742w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z10 = (motionEvent.getButtonState() & 32) != 0;
        boolean z11 = this.f5741v == 2 && !z10;
        boolean z12 = actionMasked == 1 || actionMasked == 3 || z11;
        float f12 = 0.0f;
        if (actionMasked == 0 || z12) {
            if (this.f5735p) {
                this.f5721b.b(this);
                this.f5735p = false;
                this.f5728i = 0.0f;
                this.f5741v = 0;
            } else if (j() && z12) {
                this.f5735p = false;
                this.f5728i = 0.0f;
                this.f5741v = 0;
            }
            if (z12) {
                return true;
            }
        }
        if (!this.f5735p && this.f5725f && !j() && !z12 && z10) {
            this.f5739t = motionEvent.getX();
            this.f5740u = motionEvent.getY();
            this.f5741v = 2;
            this.f5728i = 0.0f;
        }
        boolean z13 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z11;
        boolean z14 = actionMasked == 6;
        int actionIndex = z14 ? motionEvent.getActionIndex() : -1;
        int i10 = z14 ? pointerCount - 1 : pointerCount;
        if (j()) {
            f11 = this.f5739t;
            f10 = this.f5740u;
            if (motionEvent.getY() < f10) {
                this.f5743x = true;
            } else {
                this.f5743x = false;
            }
        } else {
            float f13 = 0.0f;
            float f14 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    f13 += motionEvent.getX(i11);
                    f14 += motionEvent.getY(i11);
                }
            }
            float f15 = i10;
            float f16 = f13 / f15;
            f10 = f14 / f15;
            f11 = f16;
        }
        float f17 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                f12 += Math.abs(motionEvent.getX(i12) - f11);
                f17 += Math.abs(motionEvent.getY(i12) - f10);
            }
        }
        float f18 = i10;
        float f19 = (f12 / f18) * 2.0f;
        float f20 = (f17 / f18) * 2.0f;
        float hypot = j() ? f20 : (float) Math.hypot(f19, f20);
        boolean z15 = this.f5735p;
        this.f5722c = f11;
        this.f5723d = f10;
        if (!j() && this.f5735p && (hypot < this.f5737r || z13)) {
            this.f5721b.b(this);
            this.f5735p = false;
            this.f5728i = hypot;
        }
        if (z13) {
            this.f5729j = f19;
            this.f5731l = f19;
            this.f5730k = f20;
            this.f5732m = f20;
            this.f5726g = hypot;
            this.f5727h = hypot;
            this.f5728i = hypot;
        }
        int i13 = j() ? this.f5736q : this.f5737r;
        if (!this.f5735p && hypot >= i13 && (z15 || Math.abs(hypot - this.f5728i) > this.f5736q)) {
            this.f5729j = f19;
            this.f5731l = f19;
            this.f5730k = f20;
            this.f5732m = f20;
            this.f5726g = hypot;
            this.f5727h = hypot;
            this.f5734o = this.f5733n;
            this.f5735p = this.f5721b.c(this);
        }
        if (actionMasked == 2) {
            this.f5729j = f19;
            this.f5730k = f20;
            this.f5726g = hypot;
            if (this.f5735p ? this.f5721b.a(this) : true) {
                this.f5731l = this.f5729j;
                this.f5732m = this.f5730k;
                this.f5727h = this.f5726g;
                this.f5734o = this.f5733n;
            }
        }
        return true;
    }

    public void l(boolean z10) {
        this.f5724e = z10;
        if (z10 && this.f5742w == null) {
            this.f5742w = new GestureDetector(this.f5720a, new a(), this.f5738s);
        }
    }

    public void m(boolean z10) {
        this.f5725f = z10;
    }

    public y(Context context, b bVar, Handler handler) {
        this.f5741v = 0;
        this.f5720a = context;
        this.f5721b = bVar;
        this.f5736q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f5737r = 0;
        this.f5738s = handler;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 > 18) {
            l(true);
        }
        if (i10 > 22) {
            m(true);
        }
    }
}
