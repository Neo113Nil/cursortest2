package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q8l extends hc implements tec {
    public final Context c;
    public final vec d;
    public f4a e;
    public WeakReference f;
    public final /* synthetic */ r8l g;

    public q8l(r8l r8lVar, Context context, f4a f4aVar) {
        this.g = r8lVar;
        this.c = context;
        this.e = f4aVar;
        vec vecVar = new vec(context);
        vecVar.l = 1;
        this.d = vecVar;
        vecVar.e = this;
    }

    @Override // defpackage.hc
    public final void a() {
        r8l r8lVar = this.g;
        if (r8lVar.v != this) {
            return;
        }
        if (r8lVar.C) {
            r8lVar.w = this;
            r8lVar.x = this.e;
        } else {
            this.e.q(this);
        }
        this.e = null;
        r8lVar.z0(false);
        ActionBarContextView actionBarContextView = r8lVar.s;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        r8lVar.p.setHideOnContentScrollEnabled(r8lVar.H);
        r8lVar.v = null;
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
        return this.d;
    }

    @Override // defpackage.hc
    public final MenuInflater d() {
        return new ani(this.c);
    }

    @Override // defpackage.hc
    public final CharSequence e() {
        return this.g.s.getSubtitle();
    }

    @Override // defpackage.hc
    public final CharSequence f() {
        return this.g.s.getTitle();
    }

    @Override // defpackage.hc
    public final void g() {
        if (this.g.v != this) {
            return;
        }
        vec vecVar = this.d;
        vecVar.w();
        try {
            this.e.r(this, vecVar);
        } finally {
            vecVar.v();
        }
    }

    @Override // defpackage.hc
    public final boolean h() {
        return this.g.s.s;
    }

    @Override // defpackage.hc
    public final void i(View view) {
        this.g.s.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.tec
    public final void j(vec vecVar) {
        if (this.e == null) {
            return;
        }
        g();
        dc dcVar = this.g.s.d;
        if (dcVar != null) {
            dcVar.l();
        }
    }

    @Override // defpackage.hc
    public final void k(int i) {
        l(this.g.m.getResources().getString(i));
    }

    @Override // defpackage.hc
    public final void l(CharSequence charSequence) {
        this.g.s.setSubtitle(charSequence);
    }

    @Override // defpackage.hc
    public final void m(int i) {
        n(this.g.m.getResources().getString(i));
    }

    @Override // defpackage.hc
    public final void n(CharSequence charSequence) {
        this.g.s.setTitle(charSequence);
    }

    @Override // defpackage.hc
    public final void o(boolean z) {
        this.b = z;
        this.g.s.setTitleOptional(z);
    }

    @Override // defpackage.tec
    public final boolean p(vec vecVar, MenuItem menuItem) {
        f4a f4aVar = this.e;
        if (f4aVar != null) {
            return ((g7h) f4aVar.b).x(this, menuItem);
        }
        return false;
    }
}
