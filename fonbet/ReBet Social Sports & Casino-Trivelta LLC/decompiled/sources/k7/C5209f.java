package k7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C3013d;
import d7.InterfaceC4012a;
import kotlin.jvm.internal.Intrinsics;
import m7.C5563a;

/* renamed from: k7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5209f extends Drawable implements Animatable, R6.a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4012a f54327a;

    /* renamed from: b, reason: collision with root package name */
    public final C5206c f54328b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC5207d f54329c;

    /* renamed from: d, reason: collision with root package name */
    public final C3013d f54330d;

    /* renamed from: e, reason: collision with root package name */
    public final a f54331e;

    /* renamed from: k7.f$a */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5209f.this.unscheduleSelf(this);
            C5209f.this.invalidateSelf();
        }
    }

    public C5209f(InterfaceC4012a animationBackend) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        this.f54327a = animationBackend;
        this.f54328b = new C5206c(new C5563a(this.f54327a));
        this.f54329c = new C5208e();
        C3013d c3013d = new C3013d();
        c3013d.a(this);
        this.f54330d = c3013d;
        this.f54331e = new a();
    }

    @Override // R6.a
    public void a() {
        this.f54327a.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int a10 = this.f54328b.a();
        if (a10 == -1) {
            a10 = this.f54327a.a() - 1;
            this.f54328b.g(false);
            this.f54329c.c(this);
        } else if (a10 == 0 && this.f54328b.h()) {
            this.f54329c.a(this);
        }
        if (this.f54327a.j(this, canvas, a10)) {
            this.f54329c.d(this, a10);
            this.f54328b.f(a10);
        } else {
            this.f54328b.e();
        }
        long c10 = this.f54328b.c();
        if (c10 != -1) {
            scheduleSelf(this.f54331e, c10);
        } else {
            this.f54329c.c(this);
            this.f54328b.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f54327a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f54327a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f54328b.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f54327a.e(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f54330d.b(i10);
        this.f54327a.m(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f54330d.c(colorFilter);
        this.f54327a.g(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f54327a.a() <= 0) {
            return;
        }
        this.f54328b.i();
        this.f54329c.b(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f54328b.j();
        this.f54329c.c(this);
        unscheduleSelf(this.f54331e);
    }
}
