package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f9i extends hc implements tec {
    public Context c;
    public ActionBarContextView d;
    public f4a e;
    public WeakReference f;
    public boolean g;
    public vec h;

    @Override // defpackage.hc
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.q(this);
    }

    @Override // defpackage.hc
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.hc
    public final vec c() {
        return this.h;
    }

    @Override // defpackage.hc
    public final MenuInflater d() {
        return new ani(this.d.getContext());
    }

    @Override // defpackage.hc
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.hc
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // defpackage.hc
    public final void g() {
        this.e.r(this, this.h);
    }

    @Override // defpackage.hc
    public final boolean h() {
        return this.d.s;
    }

    @Override // defpackage.hc
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.tec
    public final void j(vec vecVar) {
        g();
        dc dcVar = this.d.d;
        if (dcVar != null) {
            dcVar.l();
        }
    }

    @Override // defpackage.hc
    public final void k(int i) {
        l(this.c.getString(i));
    }

    @Override // defpackage.hc
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.hc
    public final void m(int i) {
        n(this.c.getString(i));
    }

    @Override // defpackage.hc
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.hc
    public final void o(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }

    @Override // defpackage.tec
    public final boolean p(vec vecVar, MenuItem menuItem) {
        return ((g7h) this.e.b).x(this, menuItem);
    }
}
