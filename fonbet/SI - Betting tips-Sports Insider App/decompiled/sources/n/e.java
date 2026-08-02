package n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.x;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends b implements androidx.appcompat.view.menu.l {

    /* renamed from: c, reason: collision with root package name */
    public Context f20767c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f20768d;

    /* renamed from: e, reason: collision with root package name */
    public l1.a f20769e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f20770f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20771g;

    /* renamed from: h, reason: collision with root package name */
    public n f20772h;

    @Override // n.b
    public final void a() {
        if (this.f20771g) {
            return;
        }
        this.f20771g = true;
        this.f20769e.v(this);
    }

    @Override // n.b
    public final View b() {
        WeakReference weakReference = this.f20770f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // n.b
    public final n c() {
        return this.f20772h;
    }

    @Override // n.b
    public final MenuInflater d() {
        return new i(this.f20768d.getContext());
    }

    @Override // n.b
    public final CharSequence e() {
        return this.f20768d.getSubtitle();
    }

    @Override // n.b
    public final CharSequence f() {
        return this.f20768d.getTitle();
    }

    @Override // n.b
    public final void g() {
        this.f20769e.w(this, this.f20772h);
    }

    @Override // n.b
    public final boolean h() {
        return this.f20768d.f587s;
    }

    @Override // n.b
    public final void i(View view) {
        this.f20768d.setCustomView(view);
        this.f20770f = view != null ? new WeakReference(view) : null;
    }

    @Override // n.b
    public final void j(int i5) {
        k(this.f20767c.getString(i5));
    }

    @Override // n.b
    public final void k(CharSequence charSequence) {
        this.f20768d.setSubtitle(charSequence);
    }

    @Override // n.b
    public final void l(int i5) {
        m(this.f20767c.getString(i5));
    }

    @Override // n.b
    public final void m(CharSequence charSequence) {
        this.f20768d.setTitle(charSequence);
    }

    @Override // n.b
    public final void n(boolean z5) {
        this.f20760b = z5;
        this.f20768d.setTitleOptional(z5);
    }

    @Override // androidx.appcompat.view.menu.l
    public final boolean onMenuItemSelected(n nVar, MenuItem menuItem) {
        return ((x) this.f20769e.f19314b).E(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.l
    public final void onMenuModeChange(n nVar) {
        g();
        androidx.appcompat.widget.n nVar2 = this.f20768d.f574d;
        if (nVar2 != null) {
            nVar2.d();
        }
    }
}
