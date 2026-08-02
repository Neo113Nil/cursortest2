package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
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
import androidx.appcompat.widget.g2;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.x2;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 extends v implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f452b;

    /* renamed from: c, reason: collision with root package name */
    public final n f453c;

    /* renamed from: d, reason: collision with root package name */
    public final k f454d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f455e;

    /* renamed from: f, reason: collision with root package name */
    public final int f456f;

    /* renamed from: g, reason: collision with root package name */
    public final int f457g;

    /* renamed from: h, reason: collision with root package name */
    public final x2 f458h;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f460k;

    /* renamed from: l, reason: collision with root package name */
    public View f461l;

    /* renamed from: m, reason: collision with root package name */
    public View f462m;

    /* renamed from: n, reason: collision with root package name */
    public y f463n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f464o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f465p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public int f466r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f468t;

    /* renamed from: i, reason: collision with root package name */
    public final d f459i = new d(this, 1);
    public final e j = new e(1, this);

    /* renamed from: s, reason: collision with root package name */
    public int f467s = 0;

    public e0(Context context, n nVar, View view, int i5, boolean z5) {
        this.f452b = context;
        this.f453c = nVar;
        this.f455e = z5;
        this.f454d = new k(nVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f457g = i5;
        Resources resources = context.getResources();
        this.f456f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f461l = view;
        this.f458h = new x2(context, null, i5, 0);
        nVar.addMenuPresenter(this, context);
    }

    @Override // androidx.appcompat.view.menu.d0
    public final boolean a() {
        return !this.f465p && this.f458h.f940z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.v
    public final void d(View view) {
        this.f461l = view;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void dismiss() {
        if (a()) {
            this.f458h.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.v
    public final void e(boolean z5) {
        this.f454d.f510c = z5;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final g2 f() {
        return this.f458h.f919c;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void g(int i5) {
        this.f467s = i5;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void h(int i5) {
        this.f458h.f922f = i5;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f460k = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void j(boolean z5) {
        this.f468t = z5;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void k(int i5) {
        this.f458h.i(i5);
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onCloseMenu(n nVar, boolean z5) {
        if (nVar != this.f453c) {
            return;
        }
        dismiss();
        y yVar = this.f463n;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, z5);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f465p = true;
        this.f453c.close();
        ViewTreeObserver viewTreeObserver = this.f464o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f464o = this.f462m.getViewTreeObserver();
            }
            this.f464o.removeGlobalOnLayoutListener(this.f459i);
            this.f464o = null;
        }
        this.f462m.removeOnAttachStateChangeListener(this.j);
        PopupWindow.OnDismissListener onDismissListener = this.f460k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean onSubMenuSelected(f0 f0Var) {
        boolean z5;
        if (f0Var.hasVisibleItems()) {
            x xVar = new x(this.f452b, f0Var, this.f462m, this.f455e, this.f457g, 0);
            y yVar = this.f463n;
            xVar.f559h = yVar;
            v vVar = xVar.f560i;
            if (vVar != null) {
                vVar.setCallback(yVar);
            }
            int size = f0Var.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = f0Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i5++;
            }
            xVar.f558g = z5;
            v vVar2 = xVar.f560i;
            if (vVar2 != null) {
                vVar2.e(z5);
            }
            xVar.j = this.f460k;
            this.f460k = null;
            this.f453c.close(false);
            x2 x2Var = this.f458h;
            int i10 = x2Var.f922f;
            int l6 = x2Var.l();
            if ((Gravity.getAbsoluteGravity(this.f467s, this.f461l.getLayoutDirection()) & 7) == 5) {
                i10 += this.f461l.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f556e != null) {
                    xVar.d(i10, l6, true, true);
                }
            }
            y yVar2 = this.f463n;
            if (yVar2 != null) {
                yVar2.c(f0Var);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void setCallback(y yVar) {
        this.f463n = yVar;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void show() {
        View view;
        if (a()) {
            return;
        }
        if (this.f465p || (view = this.f461l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f462m = view;
        x2 x2Var = this.f458h;
        j0 j0Var = x2Var.f940z;
        j0 j0Var2 = x2Var.f940z;
        j0Var.setOnDismissListener(this);
        x2Var.f931p = this;
        x2Var.f939y = true;
        j0Var2.setFocusable(true);
        View view2 = this.f462m;
        boolean z5 = this.f464o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f464o = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f459i);
        }
        view2.addOnAttachStateChangeListener(this.j);
        x2Var.f930o = view2;
        x2Var.f927l = this.f467s;
        boolean z7 = this.q;
        Context context = this.f452b;
        k kVar = this.f454d;
        if (!z7) {
            this.f466r = v.c(kVar, context, this.f456f);
            this.q = true;
        }
        x2Var.o(this.f466r);
        j0Var2.setInputMethodMode(2);
        Rect rect = this.f550a;
        x2Var.f938x = rect != null ? new Rect(rect) : null;
        x2Var.show();
        g2 g2Var = x2Var.f919c;
        g2Var.setOnKeyListener(this);
        if (this.f468t) {
            n nVar = this.f453c;
            if (nVar.getHeaderTitle() != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g2Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(nVar.getHeaderTitle());
                }
                frameLayout.setEnabled(false);
                g2Var.addHeaderView(frameLayout, null, false);
            }
        }
        x2Var.m(kVar);
        x2Var.show();
    }

    @Override // androidx.appcompat.view.menu.z
    public final void updateMenuView(boolean z5) {
        this.q = false;
        k kVar = this.f454d;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.v
    public final void b(n nVar) {
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
