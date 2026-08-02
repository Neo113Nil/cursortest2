package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2171v {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2173x f20233a;

    public C2171v(AbstractC2173x abstractC2173x) {
        this.f20233a = abstractC2173x;
    }

    public static C2171v b(AbstractC2173x abstractC2173x) {
        return new C2171v((AbstractC2173x) x0.f.h(abstractC2173x, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        FragmentManager g10 = this.f20233a.g();
        AbstractC2173x abstractC2173x = this.f20233a;
        g10.q(abstractC2173x, abstractC2173x, fragment);
    }

    public void c() {
        this.f20233a.g().D();
    }

    public boolean d(MenuItem menuItem) {
        return this.f20233a.g().G(menuItem);
    }

    public void e() {
        this.f20233a.g().H();
    }

    public void f() {
        this.f20233a.g().J();
    }

    public void g() {
        this.f20233a.g().S();
    }

    public void h() {
        this.f20233a.g().W();
    }

    public void i() {
        this.f20233a.g().X();
    }

    public void j() {
        this.f20233a.g().Z();
    }

    public boolean k() {
        return this.f20233a.g().g0(true);
    }

    public FragmentManager l() {
        return this.f20233a.g();
    }

    public void m() {
        this.f20233a.g().c1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f20233a.g().E0().onCreateView(view, str, context, attributeSet);
    }
}
