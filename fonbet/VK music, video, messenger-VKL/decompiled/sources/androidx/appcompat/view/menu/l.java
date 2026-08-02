package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.vkontakte.android.R;
import xsna.b820;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes11.dex */
public final class l extends b820 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context c;
    public final f d;
    public final e e;
    public final boolean f;
    public final int g;
    public final int h;
    public final androidx.appcompat.widget.b i;
    public PopupWindow.OnDismissListener l;
    public View m;
    public View n;
    public j.a o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public boolean u;
    public final a j = new a();
    public final b k = new b();
    public int t = 0;

    /* compiled from: StandardMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (!lVar.isShowing() || lVar.i.isModal()) {
                return;
            }
            View view = lVar.n;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                lVar.i.show();
            }
        }
    }

    public l(Context context, f fVar, View view, int i, boolean z) {
        this.c = context;
        this.d = fVar;
        this.f = z;
        this.e = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.h = i;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = view;
        this.i = new androidx.appcompat.widget.b(context, null, i, 0);
        fVar.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z) {
        if (fVar != this.d) {
            return;
        }
        dismiss();
        j.a aVar = this.o;
        if (aVar != null) {
            aVar.a(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable b() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        this.r = false;
        e eVar = this.e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // xsna.sjj0
    public final void dismiss() {
        if (isShowing()) {
            this.i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.c, mVar, this.n, this.f, this.h, 0);
            j.a aVar = this.o;
            iVar.h = aVar;
            b820 b820Var = iVar.i;
            if (b820Var != null) {
                b820Var.i(aVar);
            }
            int size = mVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            iVar.g = z;
            b820 b820Var2 = iVar.i;
            if (b820Var2 != null) {
                b820Var2.n(z);
            }
            iVar.j = this.l;
            this.l = null;
            this.d.c(false);
            androidx.appcompat.widget.b bVar = this.i;
            int horizontalOffset = bVar.getHorizontalOffset();
            int verticalOffset = bVar.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                horizontalOffset += this.m.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.e != null) {
                    iVar.d(horizontalOffset, verticalOffset, true, true);
                }
            }
            j.a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        return false;
    }

    @Override // xsna.sjj0
    public final ListView getListView() {
        return this.i.getListView();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(j.a aVar) {
        this.o = aVar;
    }

    @Override // xsna.sjj0
    public final boolean isShowing() {
        return !this.q && this.i.isShowing();
    }

    @Override // xsna.b820
    public final void m(View view) {
        this.m = view;
    }

    @Override // xsna.b820
    public final void n(boolean z) {
        this.e.d = z;
    }

    @Override // xsna.b820
    public final void o(int i) {
        this.t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.d.c(true);
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

    @Override // xsna.b820
    public final void p(int i) {
        this.i.setHorizontalOffset(i);
    }

    @Override // xsna.b820
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    @Override // xsna.b820
    public final void r(boolean z) {
        this.u = z;
    }

    @Override // xsna.b820
    public final void s(int i) {
        this.i.setVerticalOffset(i);
    }

    @Override // xsna.sjj0
    public final void show() {
        View view;
        if (isShowing()) {
            return;
        }
        if (this.q || (view = this.m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.n = view;
        androidx.appcompat.widget.b bVar = this.i;
        bVar.setOnDismissListener(this);
        bVar.setOnItemClickListener(this);
        bVar.setModal(true);
        View view2 = this.n;
        boolean z = this.p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.p = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.j);
        }
        view2.addOnAttachStateChangeListener(this.k);
        bVar.setAnchorView(view2);
        bVar.setDropDownGravity(this.t);
        boolean z2 = this.r;
        Context context = this.c;
        e eVar = this.e;
        if (!z2) {
            this.s = b820.l(eVar, context, this.g);
            this.r = true;
        }
        bVar.setContentWidth(this.s);
        bVar.setInputMethodMode(2);
        bVar.setEpicenterBounds(this.b);
        bVar.show();
        ListView listView = bVar.getListView();
        listView.setOnKeyListener(this);
        if (this.u) {
            f fVar = this.d;
            if (fVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.m);
                }
                frameLayout.setEnabled(false);
                listView.addHeaderView(frameLayout, null, false);
            }
        }
        bVar.setAdapter(eVar);
        bVar.show();
    }

    /* compiled from: StandardMenuPopup.java */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.p = view.getViewTreeObserver();
                }
                lVar.p.removeGlobalOnLayoutListener(lVar.j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(Parcelable parcelable) {
    }

    @Override // xsna.b820
    public final void k(f fVar) {
    }
}
