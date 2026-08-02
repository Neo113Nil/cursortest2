package d7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d7.InterfaceC4012a;

/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4013b implements InterfaceC4012a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC4012a f45008a;

    /* renamed from: b, reason: collision with root package name */
    public int f45009b = -1;

    /* renamed from: c, reason: collision with root package name */
    public ColorFilter f45010c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f45011d;

    public AbstractC4013b(InterfaceC4012a interfaceC4012a) {
        this.f45008a = interfaceC4012a;
    }

    @Override // d7.InterfaceC4015d
    public int a() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.a();
    }

    @Override // d7.InterfaceC4015d
    public int b() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.b();
    }

    @Override // d7.InterfaceC4015d
    public int c() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.c();
    }

    @Override // d7.InterfaceC4012a
    public void clear() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a != null) {
            interfaceC4012a.clear();
        }
    }

    @Override // d7.InterfaceC4012a
    public int d() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return -1;
        }
        return interfaceC4012a.d();
    }

    @Override // d7.InterfaceC4012a
    public void e(Rect rect) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a != null) {
            interfaceC4012a.e(rect);
        }
        this.f45011d = rect;
    }

    @Override // d7.InterfaceC4012a
    public int f() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return -1;
        }
        return interfaceC4012a.f();
    }

    @Override // d7.InterfaceC4012a
    public void g(ColorFilter colorFilter) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a != null) {
            interfaceC4012a.g(colorFilter);
        }
        this.f45010c = colorFilter;
    }

    @Override // d7.InterfaceC4015d
    public int h() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.h();
    }

    @Override // d7.InterfaceC4012a
    public void i(InterfaceC4012a.InterfaceC0654a interfaceC0654a) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a != null) {
            interfaceC4012a.i(interfaceC0654a);
        }
    }

    @Override // d7.InterfaceC4012a
    public boolean j(Drawable drawable, Canvas canvas, int i10) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        return interfaceC4012a != null && interfaceC4012a.j(drawable, canvas, i10);
    }

    @Override // d7.InterfaceC4015d
    public int l(int i10) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.l(i10);
    }

    @Override // d7.InterfaceC4012a
    public void m(int i10) {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a != null) {
            interfaceC4012a.m(i10);
        }
        this.f45009b = i10;
    }

    @Override // d7.InterfaceC4015d
    public int n() {
        InterfaceC4012a interfaceC4012a = this.f45008a;
        if (interfaceC4012a == null) {
            return 0;
        }
        return interfaceC4012a.n();
    }
}
