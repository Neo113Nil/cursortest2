package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m9i extends ofc implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context b;
    public final vec c;
    public final sec d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final ufc i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public xfc o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final jc0 j = new jc0(this, 6);
    public final y00 k = new y00(this, 7);
    public int t = 0;

    public m9i(int i, int i2, vec vecVar, Context context, View view, boolean z) {
        this.b = context;
        this.c = vecVar;
        this.e = z;
        this.d = new sec(vecVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.g = i;
        this.h = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new ufc(context, null, i, i2);
        vecVar.b(this, context);
    }

    @Override // defpackage.wfh
    public final boolean a() {
        return !this.q && this.i.z.isShowing();
    }

    @Override // defpackage.yfc
    public final void b(vec vecVar, boolean z) {
        if (vecVar != this.c) {
            return;
        }
        dismiss();
        xfc xfcVar = this.o;
        if (xfcVar != null) {
            xfcVar.b(vecVar, z);
        }
    }

    @Override // defpackage.yfc
    public final boolean c(sji sjiVar) {
        boolean z;
        if (sjiVar.hasVisibleItems()) {
            qfc qfcVar = new qfc(this.g, this.h, sjiVar, this.b, this.n, this.e);
            xfc xfcVar = this.o;
            qfcVar.i = xfcVar;
            ofc ofcVar = qfcVar.j;
            if (ofcVar != null) {
                ofcVar.e(xfcVar);
            }
            int size = sjiVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = sjiVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            qfcVar.h = z;
            ofc ofcVar2 = qfcVar.j;
            if (ofcVar2 != null) {
                ofcVar2.m(z);
            }
            qfcVar.k = this.l;
            this.l = null;
            this.c.c(false);
            ufc ufcVar = this.i;
            int i2 = ufcVar.f;
            int l = ufcVar.l();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                i2 += this.m.getWidth();
            }
            if (!qfcVar.b()) {
                if (qfcVar.f != null) {
                    qfcVar.d(i2, l, true, true);
                }
            }
            xfc xfcVar2 = this.o;
            if (xfcVar2 != null) {
                xfcVar2.k(sjiVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.wfh
    public final void dismiss() {
        if (a()) {
            this.i.dismiss();
        }
    }

    @Override // defpackage.yfc
    public final void e(xfc xfcVar) {
        this.o = xfcVar;
    }

    @Override // defpackage.yfc
    public final void f() {
        this.r = false;
        sec secVar = this.d;
        if (secVar != null) {
            secVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.yfc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ofc
    public final void l(View view) {
        this.m = view;
    }

    @Override // defpackage.ofc
    public final void m(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.wfh
    public final qc5 n() {
        return this.i.c;
    }

    @Override // defpackage.ofc
    public final void o(int i) {
        this.t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener onDismissListener = this.l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ofc
    public final void p(int i) {
        this.i.f = i;
    }

    @Override // defpackage.ofc
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // defpackage.ofc
    public final void r(boolean z) {
        this.u = z;
    }

    @Override // defpackage.ofc
    public final void s(int i) {
        this.i.i(i);
    }

    @Override // defpackage.wfh
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.q || (view = this.m) == null) {
            a70.r("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.n = view;
        ufc ufcVar = this.i;
        ec0 ec0Var = ufcVar.z;
        ec0 ec0Var2 = ufcVar.z;
        ec0Var.setOnDismissListener(this);
        ufcVar.p = this;
        ufcVar.y = true;
        ec0Var2.setFocusable(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        ufcVar.o = view2;
        ufcVar.l = this.t;
        boolean z2 = this.r;
        Context context = this.b;
        sec secVar = this.d;
        if (!z2) {
            this.s = ofc.k(secVar, context, this.f);
            this.r = true;
        }
        ufcVar.q(this.s);
        ec0Var2.setInputMethodMode(2);
        Rect rect = this.a;
        ufcVar.x = rect != null ? new Rect(rect) : null;
        ufcVar.show();
        qc5 qc5Var = ufcVar.c;
        qc5Var.setOnKeyListener(this);
        if (this.u) {
            vec vecVar = this.c;
            if (vecVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) qc5Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(vecVar.m);
                }
                frameLayout.setEnabled(false);
                qc5Var.addHeaderView(frameLayout, null, false);
            }
        }
        ufcVar.m(secVar);
        ufcVar.show();
    }

    @Override // defpackage.ofc
    public final void j(vec vecVar) {
    }
}
