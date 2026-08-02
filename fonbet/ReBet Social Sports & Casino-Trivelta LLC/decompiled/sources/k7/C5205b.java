package k7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.C3013d;
import d7.InterfaceC4012a;
import m7.C5563a;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5205b extends Drawable implements Animatable, R6.a {

    /* renamed from: r, reason: collision with root package name */
    public static final Class f54295r = C5205b.class;

    /* renamed from: s, reason: collision with root package name */
    public static final InterfaceC5207d f54296s = new C5208e();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4012a f54297a;

    /* renamed from: b, reason: collision with root package name */
    public m7.b f54298b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f54299c;

    /* renamed from: d, reason: collision with root package name */
    public long f54300d;

    /* renamed from: e, reason: collision with root package name */
    public long f54301e;

    /* renamed from: f, reason: collision with root package name */
    public long f54302f;

    /* renamed from: g, reason: collision with root package name */
    public int f54303g;

    /* renamed from: h, reason: collision with root package name */
    public long f54304h;

    /* renamed from: i, reason: collision with root package name */
    public long f54305i;

    /* renamed from: j, reason: collision with root package name */
    public int f54306j;

    /* renamed from: m, reason: collision with root package name */
    public int f54309m;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC4012a.InterfaceC0654a f54311o;

    /* renamed from: p, reason: collision with root package name */
    public C3013d f54312p;

    /* renamed from: q, reason: collision with root package name */
    public final Runnable f54313q;

    /* renamed from: k, reason: collision with root package name */
    public long f54307k = 8;

    /* renamed from: l, reason: collision with root package name */
    public long f54308l = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile InterfaceC5207d f54310n = f54296s;

    /* renamed from: k7.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5205b c5205b = C5205b.this;
            c5205b.unscheduleSelf(c5205b.f54313q);
            C5205b.this.invalidateSelf();
        }
    }

    public C5205b(InterfaceC4012a interfaceC4012a) {
        InterfaceC4012a.InterfaceC0654a interfaceC0654a = new InterfaceC4012a.InterfaceC0654a() { // from class: k7.a
        };
        this.f54311o = interfaceC0654a;
        this.f54313q = new a();
        this.f54297a = interfaceC4012a;
        this.f54298b = c(interfaceC4012a);
        if (interfaceC4012a != null) {
            interfaceC4012a.i(interfaceC0654a);
        }
    }

    public static m7.b c(InterfaceC4012a interfaceC4012a) {
        if (interfaceC4012a == null) {
            return null;
        }
        return new C5563a(interfaceC4012a);
    }

    @Override // R6.a
    public void a() {
        InterfaceC4012a interfaceC4012a = this.f54297a;
        if (interfaceC4012a != null) {
            interfaceC4012a.clear();
        }
    }

    public int d() {
        InterfaceC4012a interfaceC4012a = this.f54297a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f54297a == null || this.f54298b == null) {
            return;
        }
        long f10 = f();
        long max = this.f54299c ? (f10 - this.f54300d) + this.f54308l : Math.max(this.f54301e, 0L);
        int b10 = this.f54298b.b(max, this.f54301e);
        if (b10 == -1) {
            b10 = this.f54297a.a() - 1;
            this.f54310n.c(this);
            this.f54299c = false;
        } else if (b10 == 0 && this.f54303g != -1 && f10 >= this.f54302f) {
            this.f54310n.a(this);
        }
        boolean j10 = this.f54297a.j(this, canvas, b10);
        if (j10) {
            this.f54310n.d(this, b10);
            this.f54303g = b10;
        }
        if (!j10) {
            g();
        }
        long f11 = f();
        if (this.f54299c) {
            long a10 = this.f54298b.a(f11 - this.f54300d);
            if (a10 != -1) {
                h(a10 + this.f54307k);
            } else {
                this.f54310n.c(this);
                this.f54299c = false;
            }
        }
        this.f54301e = max;
    }

    public long e() {
        if (this.f54297a == null) {
            return 0L;
        }
        m7.b bVar = this.f54298b;
        if (bVar != null) {
            return bVar.c();
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f54297a.a(); i11++) {
            i10 += this.f54297a.l(i11);
        }
        return i10;
    }

    public final long f() {
        return SystemClock.uptimeMillis();
    }

    public final void g() {
        this.f54309m++;
        if (E6.a.w(2)) {
            E6.a.y(f54295r, "Dropped a frame. Count: %s", Integer.valueOf(this.f54309m));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        InterfaceC4012a interfaceC4012a = this.f54297a;
        return interfaceC4012a == null ? super.getIntrinsicHeight() : interfaceC4012a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        InterfaceC4012a interfaceC4012a = this.f54297a;
        return interfaceC4012a == null ? super.getIntrinsicWidth() : interfaceC4012a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(long j10) {
        long j11 = this.f54300d + j10;
        this.f54302f = j11;
        scheduleSelf(this.f54313q, j11);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f54299c;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        InterfaceC4012a interfaceC4012a = this.f54297a;
        if (interfaceC4012a != null) {
            interfaceC4012a.e(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.f54299c) {
            return false;
        }
        long j10 = i10;
        if (this.f54301e == j10) {
            return false;
        }
        this.f54301e = j10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f54312p == null) {
            this.f54312p = new C3013d();
        }
        this.f54312p.b(i10);
        InterfaceC4012a interfaceC4012a = this.f54297a;
        if (interfaceC4012a != null) {
            interfaceC4012a.m(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f54312p == null) {
            this.f54312p = new C3013d();
        }
        this.f54312p.c(colorFilter);
        InterfaceC4012a interfaceC4012a = this.f54297a;
        if (interfaceC4012a != null) {
            interfaceC4012a.g(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        InterfaceC4012a interfaceC4012a;
        if (this.f54299c || (interfaceC4012a = this.f54297a) == null || interfaceC4012a.a() <= 1) {
            return;
        }
        this.f54299c = true;
        long f10 = f();
        long j10 = f10 - this.f54304h;
        this.f54300d = j10;
        this.f54302f = j10;
        this.f54301e = f10 - this.f54305i;
        this.f54303g = this.f54306j;
        invalidateSelf();
        this.f54310n.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f54299c) {
            long f10 = f();
            this.f54304h = f10 - this.f54300d;
            this.f54305i = f10 - this.f54301e;
            this.f54306j = this.f54303g;
            this.f54299c = false;
            this.f54300d = 0L;
            this.f54302f = 0L;
            this.f54301e = -1L;
            this.f54303g = -1;
            unscheduleSelf(this.f54313q);
            this.f54310n.c(this);
        }
    }
}
