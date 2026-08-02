package androidx.recyclerview.widget;

import android.app.Activity;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.s0;
import xsna.mh40;
import xsna.s3q0;

/* compiled from: NoPrefetchingViewPoolProvider.kt */
/* loaded from: classes12.dex */
public final class b0 implements s0 {
    public final k0 a;
    public final LayoutInflater b;

    public b0(h0 h0Var) {
        this.a = new k0(h0Var.d, h0Var.e, h0Var.g instanceof i0.f ? new mh40(this, 2) : null);
        this.b = LayoutInflater.from(h0Var.c);
    }

    @Override // androidx.recyclerview.widget.s0
    public final void j() {
        k();
    }

    @Override // androidx.recyclerview.widget.s0
    public final void k() {
        this.a.clear();
    }

    @Override // androidx.recyclerview.widget.s0
    public final s3q0 l(Activity activity) {
        return s0.a.a(this, activity);
    }

    @Override // androidx.recyclerview.widget.s0
    public final RecyclerView.e0 n(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.s0
    public final k0 o() {
        return this.a;
    }

    @Override // androidx.recyclerview.widget.s0
    public final LayoutInflater p() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.s0
    public final void q(int i) {
        k();
        p().getContext().setTheme(i);
    }

    @Override // androidx.recyclerview.widget.s0
    public final void m() {
    }

    @Override // androidx.recyclerview.widget.s0
    public final void r() {
    }
}
