package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import java.lang.reflect.Method;
import xsna.dmo;
import xsna.p720;

/* compiled from: MenuPopupWindow.java */
/* loaded from: classes11.dex */
public final class b extends ListPopupWindow implements p720 {
    public static final Method c;
    public b.c b;

    /* compiled from: MenuPopupWindow.java */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.b$b, reason: collision with other inner class name */
    public static class C0002b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* compiled from: MenuPopupWindow.java */
    public static class c extends dmo {
        public final int n;
        public final int o;
        public p720 p;
        public h q;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.n = 21;
                this.o = 22;
            } else {
                this.n = 22;
                this.o = 21;
            }
        }

        @Override // xsna.dmo, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            e eVar;
            int i;
            int pointToPosition;
            int i2;
            if (this.p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i = 0;
                }
                h item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= eVar.getCount()) ? null : eVar.getItem(i2);
                h hVar = this.q;
                if (hVar != item) {
                    f fVar = eVar.b;
                    if (hVar != null) {
                        this.p.b(fVar, hVar);
                    }
                    this.q = item;
                    if (item != null) {
                        this.p.c(fVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.o) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).b.c(false);
            return true;
        }

        public void setHoverListener(p720 p720Var) {
            this.p = p720Var;
        }

        @Override // xsna.dmo, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                c = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // xsna.p720
    public final void b(@NonNull f fVar, @NonNull MenuItem menuItem) {
        b.c cVar = this.b;
        if (cVar != null) {
            cVar.b(fVar, menuItem);
        }
    }

    @Override // xsna.p720
    public final void c(@NonNull f fVar, @NonNull h hVar) {
        b.c cVar = this.b;
        if (cVar != null) {
            cVar.c(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    public final dmo createDropDownListView(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }

    public final void g(Object obj) {
        a.a(this.mPopup, null);
    }

    public final void h(Object obj) {
        a.b(this.mPopup, null);
    }

    public final void i() {
        if (Build.VERSION.SDK_INT > 28) {
            C0002b.a(this.mPopup, false);
            return;
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.FALSE);
            } catch (Exception unused) {
            }
        }
    }
}
