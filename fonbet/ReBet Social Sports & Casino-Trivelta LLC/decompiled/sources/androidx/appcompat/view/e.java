package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    public Context f16545c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f16546d;

    /* renamed from: e, reason: collision with root package name */
    public b.a f16547e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f16548f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16549g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16550h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f16551i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f16545c = context;
        this.f16546d = actionBarContextView;
        this.f16547e = aVar;
        androidx.appcompat.view.menu.e X10 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f16551i = X10;
        X10.W(this);
        this.f16550h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f16547e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f16546d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f16549g) {
            return;
        }
        this.f16549g = true;
        this.f16547e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f16548f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f16551i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f16546d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f16546d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f16546d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f16547e.d(this, this.f16551i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f16546d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f16546d.setCustomView(view);
        this.f16548f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f16545c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f16546d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f16545c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f16546d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f16546d.setTitleOptional(z10);
    }
}
