package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fkj extends o02 {
    public final okj m;
    public final Window.Callback n;
    public final yia o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final ArrayList s = new ArrayList();
    public final kac t;

    public fkj(Toolbar toolbar, CharSequence charSequence, qb0 qb0Var) {
        int i = 23;
        this.t = new kac(this, i);
        by9 by9Var = new by9(this);
        toolbar.getClass();
        okj okjVar = new okj(toolbar, false);
        this.m = okjVar;
        qb0Var.getClass();
        this.n = qb0Var;
        okjVar.k = qb0Var;
        toolbar.setOnMenuItemClickListener(by9Var);
        if (!okjVar.g) {
            okjVar.h = charSequence;
            if ((okjVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (okjVar.g) {
                    bsk.r(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.o = new yia(this, i);
    }

    @Override // defpackage.o02
    public final boolean M() {
        dc dcVar;
        ActionMenuView actionMenuView = this.m.a.a;
        return (actionMenuView == null || (dcVar = actionMenuView.e) == null || !dcVar.j()) ? false : true;
    }

    @Override // defpackage.o02
    public final boolean N() {
        efc efcVar;
        ckj ckjVar = this.m.a.M;
        if (ckjVar == null || (efcVar = ckjVar.b) == null) {
            return false;
        }
        if (ckjVar == null) {
            efcVar = null;
        }
        if (efcVar == null) {
            return true;
        }
        efcVar.collapseActionView();
        return true;
    }

    @Override // defpackage.o02
    public final void O(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        ArrayList arrayList = this.s;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        pvd.j();
    }

    @Override // defpackage.o02
    public final int S() {
        return this.m.b;
    }

    @Override // defpackage.o02
    public final Context Y() {
        return this.m.a.getContext();
    }

    @Override // defpackage.o02
    public final boolean b0() {
        okj okjVar = this.m;
        Toolbar toolbar = okjVar.a;
        kac kacVar = this.t;
        toolbar.removeCallbacks(kacVar);
        Toolbar toolbar2 = okjVar.a;
        WeakHashMap weakHashMap = bsk.a;
        toolbar2.postOnAnimation(kacVar);
        return true;
    }

    @Override // defpackage.o02
    public final void e0() {
        this.m.a.removeCallbacks(this.t);
    }

    @Override // defpackage.o02
    public final boolean f0(int i, KeyEvent keyEvent) {
        Menu z0 = z0();
        if (z0 == null) {
            return false;
        }
        z0.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return z0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.o02
    public final boolean g0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            i0();
        }
        return true;
    }

    @Override // defpackage.o02
    public final boolean i0() {
        return this.m.a.u();
    }

    @Override // defpackage.o02
    public final void n0(boolean z) {
        int i = z ? 4 : 0;
        okj okjVar = this.m;
        okjVar.a((i & 4) | (okjVar.b & (-5)));
    }

    @Override // defpackage.o02
    public final void o0() {
        okj okjVar = this.m;
        okjVar.a(okjVar.b & (-9));
    }

    @Override // defpackage.o02
    public final void p0(int i) {
        this.m.b(i);
    }

    @Override // defpackage.o02
    public final void q0() {
        okj okjVar = this.m;
        Toolbar toolbar = okjVar.a;
        Drawable d0 = td4.d0(2131232812, toolbar.getContext());
        okjVar.f = d0;
        if ((okjVar.b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (d0 == null) {
            d0 = okjVar.o;
        }
        toolbar.setNavigationIcon(d0);
    }

    @Override // defpackage.o02
    public final void r0(Drawable drawable) {
        okj okjVar = this.m;
        okjVar.f = drawable;
        int i = okjVar.b & 4;
        Toolbar toolbar = okjVar.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = okjVar.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.o02
    public final void t0(String str) {
        this.m.c(str);
    }

    @Override // defpackage.o02
    public final void u0(String str) {
        okj okjVar = this.m;
        okjVar.g = true;
        Toolbar toolbar = okjVar.a;
        okjVar.h = str;
        if ((okjVar.b & 8) != 0) {
            toolbar.setTitle(str);
            if (okjVar.g) {
                bsk.r(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.o02
    public final void v0(CharSequence charSequence) {
        okj okjVar = this.m;
        if (okjVar.g) {
            return;
        }
        Toolbar toolbar = okjVar.a;
        okjVar.h = charSequence;
        if ((okjVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (okjVar.g) {
                bsk.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu z0() {
        boolean z = this.q;
        okj okjVar = this.m;
        if (!z) {
            fjg fjgVar = new fjg(this);
            cqa cqaVar = new cqa(this);
            Toolbar toolbar = okjVar.a;
            toolbar.N = fjgVar;
            toolbar.O = cqaVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f = fjgVar;
                actionMenuView.g = cqaVar;
            }
            this.q = true;
        }
        return okjVar.a.getMenu();
    }

    @Override // defpackage.o02
    public final void d0() {
    }

    @Override // defpackage.o02
    public final void m0(boolean z) {
    }

    @Override // defpackage.o02
    public final void s0(boolean z) {
    }
}
