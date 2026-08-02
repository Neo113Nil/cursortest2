package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.g2;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.u2;
import androidx.appcompat.widget.v2;
import androidx.appcompat.widget.x2;
import com.sports.insider.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f477b;

    /* renamed from: c, reason: collision with root package name */
    public final int f478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f479d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f480e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f481f;

    /* renamed from: n, reason: collision with root package name */
    public View f488n;

    /* renamed from: o, reason: collision with root package name */
    public View f489o;

    /* renamed from: p, reason: collision with root package name */
    public int f490p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f491r;

    /* renamed from: s, reason: collision with root package name */
    public int f492s;

    /* renamed from: t, reason: collision with root package name */
    public int f493t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f495v;

    /* renamed from: w, reason: collision with root package name */
    public y f496w;

    /* renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f497x;

    /* renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f498y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f499z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f482g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f483h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final d f484i = new d(this, 0);
    public final e j = new e(0, this);

    /* renamed from: k, reason: collision with root package name */
    public final h9.c f485k = new h9.c(5, this);

    /* renamed from: l, reason: collision with root package name */
    public int f486l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f487m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f494u = false;

    public h(Context context, View view, int i5, boolean z5) {
        this.f477b = context;
        this.f488n = view;
        this.f479d = i5;
        this.f480e = z5;
        this.f490p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f478c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f481f = new Handler();
    }

    @Override // androidx.appcompat.view.menu.d0
    public final boolean a() {
        ArrayList arrayList = this.f483h;
        return arrayList.size() > 0 && ((g) arrayList.get(0)).f474a.f940z.isShowing();
    }

    @Override // androidx.appcompat.view.menu.v
    public final void b(n nVar) {
        nVar.addMenuPresenter(this, this.f477b);
        if (a()) {
            l(nVar);
        } else {
            this.f482g.add(nVar);
        }
    }

    @Override // androidx.appcompat.view.menu.v
    public final void d(View view) {
        if (this.f488n != view) {
            this.f488n = view;
            this.f487m = Gravity.getAbsoluteGravity(this.f486l, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void dismiss() {
        ArrayList arrayList = this.f483h;
        int size = arrayList.size();
        if (size > 0) {
            g[] gVarArr = (g[]) arrayList.toArray(new g[size]);
            for (int i5 = size - 1; i5 >= 0; i5--) {
                g gVar = gVarArr[i5];
                if (gVar.f474a.f940z.isShowing()) {
                    gVar.f474a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.v
    public final void e(boolean z5) {
        this.f494u = z5;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final g2 f() {
        ArrayList arrayList = this.f483h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g) arrayList.get(arrayList.size() - 1)).f474a.f919c;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void g(int i5) {
        if (this.f486l != i5) {
            this.f486l = i5;
            this.f487m = Gravity.getAbsoluteGravity(i5, this.f488n.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.v
    public final void h(int i5) {
        this.q = true;
        this.f492s = i5;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f498y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void j(boolean z5) {
        this.f495v = z5;
    }

    @Override // androidx.appcompat.view.menu.v
    public final void k(int i5) {
        this.f491r = true;
        this.f493t = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(n nVar) {
        boolean z5;
        boolean z7;
        View view;
        g gVar;
        int i5;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        k kVar;
        int i12;
        int firstVisiblePosition;
        Context context = this.f477b;
        LayoutInflater from = LayoutInflater.from(context);
        k kVar2 = new k(nVar, from, this.f480e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f494u) {
            kVar2.f510c = true;
        } else if (a()) {
            int size = nVar.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z5 = false;
                    break;
                }
                MenuItem item = nVar.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z5 = true;
                    break;
                }
                i13++;
            }
            kVar2.f510c = z5;
        }
        int c2 = v.c(kVar2, context, this.f478c);
        x2 x2Var = new x2(context, null, this.f479d, 0);
        x2Var.D = this.f485k;
        x2Var.f931p = this;
        j0 j0Var = x2Var.f940z;
        j0Var.setOnDismissListener(this);
        x2Var.f930o = this.f488n;
        x2Var.f927l = this.f487m;
        x2Var.f939y = true;
        j0Var.setFocusable(true);
        j0Var.setInputMethodMode(2);
        x2Var.m(kVar2);
        x2Var.o(c2);
        x2Var.f927l = this.f487m;
        ArrayList arrayList = this.f483h;
        if (arrayList.size() > 0) {
            gVar = (g) arrayList.get(arrayList.size() - 1);
            n nVar2 = gVar.f475b;
            int size2 = nVar2.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = nVar2.getItem(i14);
                if (menuItem.hasSubMenu() && nVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (menuItem == null) {
                z7 = 0;
                view = null;
            } else {
                g2 g2Var = gVar.f474a.f919c;
                ListAdapter adapter = g2Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    kVar = (k) headerViewListAdapter.getWrappedAdapter();
                } else {
                    kVar = (k) adapter;
                    i12 = 0;
                }
                int count = kVar.getCount();
                int i15 = 0;
                boolean z10 = false;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (menuItem == kVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 != -1 && (firstVisiblePosition = (i15 + i12) - g2Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < g2Var.getChildCount()) {
                    view = g2Var.getChildAt(firstVisiblePosition);
                    z7 = z10;
                } else {
                    view = null;
                    z7 = z10;
                }
            }
        } else {
            z7 = 0;
            view = null;
            gVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = x2.E;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z7] = Boolean.FALSE;
                        method.invoke(j0Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                v2.a(j0Var, z7);
            }
            u2.a(j0Var, null);
            g2 g2Var2 = ((g) arrayList.get(arrayList.size() - 1)).f474a.f919c;
            int[] iArr = new int[2];
            g2Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f489o.getWindowVisibleDisplayFrame(rect);
            if (this.f490p == 1) {
                if (g2Var2.getWidth() + iArr[0] + c2 > rect.right) {
                    i5 = 0;
                    boolean z11 = i5 != 1;
                    this.f490p = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                        x2Var.f930o = view;
                        i10 = 0;
                        i11 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.f488n.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.f487m & 7) == 5) {
                            iArr2[0] = this.f488n.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i16 = iArr3[0] - iArr2[0];
                        i10 = iArr3[1] - iArr2[1];
                        i11 = i16;
                    }
                    if ((this.f487m & 5) == 5) {
                        if (z11) {
                            width = i11 + view.getWidth();
                            x2Var.f922f = width;
                            x2Var.f926k = true;
                            x2Var.j = true;
                            x2Var.i(i10);
                        }
                        width = i11 - c2;
                        x2Var.f922f = width;
                        x2Var.f926k = true;
                        x2Var.j = true;
                        x2Var.i(i10);
                    } else if (z11) {
                        width = i11 + c2;
                        x2Var.f922f = width;
                        x2Var.f926k = true;
                        x2Var.j = true;
                        x2Var.i(i10);
                    } else {
                        c2 = view.getWidth();
                        width = i11 - c2;
                        x2Var.f922f = width;
                        x2Var.f926k = true;
                        x2Var.j = true;
                        x2Var.i(i10);
                    }
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f490p = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f487m & 5) == 5) {
                }
            } else {
                if (iArr[0] - c2 >= 0) {
                    i5 = 0;
                    if (i5 != 1) {
                    }
                    this.f490p = i5;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.f487m & 5) == 5) {
                    }
                }
                i5 = 1;
                if (i5 != 1) {
                }
                this.f490p = i5;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.f487m & 5) == 5) {
                }
            }
        } else {
            if (this.q) {
                x2Var.f922f = this.f492s;
            }
            if (this.f491r) {
                x2Var.i(this.f493t);
            }
            Rect rect2 = this.f550a;
            x2Var.f938x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new g(x2Var, nVar, this.f490p));
        x2Var.show();
        g2 g2Var3 = x2Var.f919c;
        g2Var3.setOnKeyListener(this);
        if (gVar == null && this.f495v && nVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) g2Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(nVar.getHeaderTitle());
            g2Var3.addHeaderView(frameLayout, null, false);
            x2Var.show();
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onCloseMenu(n nVar, boolean z5) {
        ArrayList arrayList = this.f483h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i5 = -1;
                break;
            } else if (nVar == ((g) arrayList.get(i5)).f475b) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            return;
        }
        int i10 = i5 + 1;
        if (i10 < arrayList.size()) {
            ((g) arrayList.get(i10)).f475b.close(false);
        }
        g gVar = (g) arrayList.remove(i5);
        n nVar2 = gVar.f475b;
        x2 x2Var = gVar.f474a;
        j0 j0Var = x2Var.f940z;
        nVar2.removeMenuPresenter(this);
        if (this.f499z) {
            u2.b(j0Var, null);
            j0Var.setAnimationStyle(0);
        }
        x2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f490p = ((g) arrayList.get(size2 - 1)).f476c;
        } else {
            this.f490p = this.f488n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z5) {
                ((g) arrayList.get(0)).f475b.close(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.f496w;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f497x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f497x.removeGlobalOnLayoutListener(this.f484i);
            }
            this.f497x = null;
        }
        this.f489o.removeOnAttachStateChangeListener(this.j);
        this.f498y.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g gVar;
        ArrayList arrayList = this.f483h;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                gVar = null;
                break;
            }
            gVar = (g) arrayList.get(i5);
            if (!gVar.f474a.f940z.isShowing()) {
                break;
            } else {
                i5++;
            }
        }
        if (gVar != null) {
            gVar.f475b.close(false);
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
        Iterator it = this.f483h.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (f0Var == gVar.f475b) {
                gVar.f474a.f919c.requestFocus();
                return true;
            }
        }
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        b(f0Var);
        y yVar = this.f496w;
        if (yVar != null) {
            yVar.c(f0Var);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void setCallback(y yVar) {
        this.f496w = yVar;
    }

    @Override // androidx.appcompat.view.menu.d0
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f482g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l((n) it.next());
        }
        arrayList.clear();
        View view = this.f488n;
        this.f489o = view;
        if (view != null) {
            boolean z5 = this.f497x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f497x = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f484i);
            }
            this.f489o.addOnAttachStateChangeListener(this.j);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void updateMenuView(boolean z5) {
        Iterator it = this.f483h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((g) it.next()).f474a.f919c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((k) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }
}
