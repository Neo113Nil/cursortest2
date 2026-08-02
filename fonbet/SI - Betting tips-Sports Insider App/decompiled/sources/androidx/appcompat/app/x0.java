package androidx.appcompat.app;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends n.b implements androidx.appcompat.view.menu.l {

    /* renamed from: c, reason: collision with root package name */
    public final Context f373c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.view.menu.n f374d;

    /* renamed from: e, reason: collision with root package name */
    public l1.a f375e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0 f377g;

    public x0(y0 y0Var, Context context, l1.a aVar) {
        this.f377g = y0Var;
        this.f373c = context;
        this.f375e = aVar;
        androidx.appcompat.view.menu.n defaultShowAsAction = new androidx.appcompat.view.menu.n(context).setDefaultShowAsAction(1);
        this.f374d = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // n.b
    public final void a() {
        y0 y0Var = this.f377g;
        if (y0Var.f390i != this) {
            return;
        }
        if (y0Var.f396p) {
            y0Var.j = this;
            y0Var.f391k = this.f375e;
        } else {
            this.f375e.v(this);
        }
        this.f375e = null;
        y0Var.a(false);
        ActionBarContextView actionBarContextView = y0Var.f387f;
        if (actionBarContextView.f580k == null) {
            actionBarContextView.e();
        }
        y0Var.f384c.setHideOnContentScrollEnabled(y0Var.f400u);
        y0Var.f390i = null;
    }

    @Override // n.b
    public final View b() {
        WeakReference weakReference = this.f376f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.b
    public final androidx.appcompat.view.menu.n c() {
        return this.f374d;
    }

    @Override // n.b
    public final MenuInflater d() {
        return new n.i(this.f373c);
    }

    @Override // n.b
    public final CharSequence e() {
        return this.f377g.f387f.getSubtitle();
    }

    @Override // n.b
    public final CharSequence f() {
        return this.f377g.f387f.getTitle();
    }

    @Override // n.b
    public final void g() {
        if (this.f377g.f390i != this) {
            return;
        }
        androidx.appcompat.view.menu.n nVar = this.f374d;
        nVar.stopDispatchingItemsChanged();
        try {
            this.f375e.w(this, nVar);
        } finally {
            nVar.startDispatchingItemsChanged();
        }
    }

    @Override // n.b
    public final boolean h() {
        return this.f377g.f387f.f587s;
    }

    @Override // n.b
    public final void i(View view) {
        this.f377g.f387f.setCustomView(view);
        this.f376f = new WeakReference(view);
    }

    @Override // n.b
    public final void j(int i5) {
        k(this.f377g.f382a.getResources().getString(i5));
    }

    @Override // n.b
    public final void k(CharSequence charSequence) {
        this.f377g.f387f.setSubtitle(charSequence);
    }

    @Override // n.b
    public final void l(int i5) {
        m(this.f377g.f382a.getResources().getString(i5));
    }

    @Override // n.b
    public final void m(CharSequence charSequence) {
        this.f377g.f387f.setTitle(charSequence);
    }

    @Override // n.b
    public final void n(boolean z5) {
        this.f20760b = z5;
        this.f377g.f387f.setTitleOptional(z5);
    }

    @Override // androidx.appcompat.view.menu.l
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.n nVar, MenuItem menuItem) {
        l1.a aVar = this.f375e;
        if (aVar != null) {
            return ((com.google.firebase.messaging.x) aVar.f19314b).E(this, menuItem);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.l
    public final void onMenuModeChange(androidx.appcompat.view.menu.n nVar) {
        if (this.f375e == null) {
            return;
        }
        g();
        androidx.appcompat.widget.n nVar2 = this.f377g.f387f.f574d;
        if (nVar2 != null) {
            nVar2.d();
        }
    }
}
