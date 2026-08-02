package Tb;

import android.view.View;
import com.henninghall.date_picker.n;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final n f11400a;

    /* renamed from: b, reason: collision with root package name */
    public final View f11401b;

    /* renamed from: c, reason: collision with root package name */
    public i f11402c;

    /* renamed from: d, reason: collision with root package name */
    public h f11403d = new h();

    /* renamed from: e, reason: collision with root package name */
    public g f11404e;

    public e(n nVar, View view) {
        this.f11400a = nVar;
        this.f11401b = view;
        this.f11402c = new i(nVar, view);
        a();
    }

    public final void a() {
        g gVar = new g(this.f11402c, this.f11400a, this, this.f11401b);
        this.f11404e = gVar;
        this.f11402c.j(new Ub.a(gVar));
    }

    public void b(d dVar) {
        this.f11404e.c(dVar);
    }

    public void c(Calendar calendar) {
        this.f11402c.k(new Ub.d(calendar));
        this.f11402c.l(new Ub.b(calendar));
    }

    public SimpleDateFormat d() {
        return new SimpleDateFormat(this.f11402c.u(), this.f11400a.u());
    }

    public String e() {
        return this.f11402c.t();
    }

    public void f(String str) {
        this.f11402c.j(new Ub.e(str));
    }

    public void g() {
        this.f11402c.j(new Ub.d(this.f11400a.A()));
    }

    public void h() {
        this.f11402c.j(new Ub.c());
    }

    public void i(Calendar calendar) {
        this.f11400a.E(calendar);
    }

    public void j() {
        this.f11402c.j(new Ub.f(this.f11400a.C()));
    }

    public void k() {
        this.f11402c.B();
    }

    public void l() {
        this.f11402c.j(new Ub.g());
    }
}
