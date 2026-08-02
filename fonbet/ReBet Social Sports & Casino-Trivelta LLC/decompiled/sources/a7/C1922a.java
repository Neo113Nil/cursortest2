package a7;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1922a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0318a f15095a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15096b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15097c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15098d;

    /* renamed from: e, reason: collision with root package name */
    public long f15099e;

    /* renamed from: f, reason: collision with root package name */
    public float f15100f;

    /* renamed from: g, reason: collision with root package name */
    public float f15101g;

    /* renamed from: a7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0318a {
        boolean a();
    }

    public C1922a(Context context) {
        this.f15096b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static C1922a c(Context context) {
        return new C1922a(context);
    }

    public void a() {
        this.f15095a = null;
        e();
    }

    public boolean b() {
        return this.f15097c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0318a interfaceC0318a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15097c = true;
            this.f15098d = true;
            this.f15099e = motionEvent.getEventTime();
            this.f15100f = motionEvent.getX();
            this.f15101g = motionEvent.getY();
        } else if (action == 1) {
            this.f15097c = false;
            if (Math.abs(motionEvent.getX() - this.f15100f) > this.f15096b || Math.abs(motionEvent.getY() - this.f15101g) > this.f15096b) {
                this.f15098d = false;
            }
            if (this.f15098d && motionEvent.getEventTime() - this.f15099e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0318a = this.f15095a) != null) {
                interfaceC0318a.a();
            }
            this.f15098d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f15097c = false;
                this.f15098d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f15100f) > this.f15096b || Math.abs(motionEvent.getY() - this.f15101g) > this.f15096b) {
            this.f15098d = false;
        }
        return true;
    }

    public void e() {
        this.f15097c = false;
        this.f15098d = false;
    }

    public void f(InterfaceC0318a interfaceC0318a) {
        this.f15095a = interfaceC0318a;
    }
}
