package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sofascore.results.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ql2 extends ofc implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public xfc x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final jc0 j = new jc0(this, 3);
    public final y00 k = new y00(this, 1);
    public final de0 l = new de0(this, 12);
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    public ql2(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.q = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // defpackage.wfh
    public final boolean a() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((pl2) arrayList.get(0)).a.z.isShowing();
    }

    @Override // defpackage.yfc
    public final void b(vec vecVar, boolean z) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (vecVar == ((pl2) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((pl2) arrayList.get(i2)).b.c(false);
        }
        pl2 pl2Var = (pl2) arrayList.remove(i);
        vec vecVar2 = pl2Var.b;
        ufc ufcVar = pl2Var.a;
        ec0 ec0Var = ufcVar.z;
        vecVar2.r(this);
        if (this.A) {
            rfc.b(ec0Var, null);
            ec0Var.setAnimationStyle(0);
        }
        ufcVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q = ((pl2) arrayList.get(size2 - 1)).c;
        } else {
            this.q = this.o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((pl2) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        xfc xfcVar = this.x;
        if (xfcVar != null) {
            xfcVar.b(vecVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.y.removeGlobalOnLayoutListener(this.j);
            }
            this.y = null;
        }
        this.p.removeOnAttachStateChangeListener(this.k);
        this.z.onDismiss();
    }

    @Override // defpackage.yfc
    public final boolean c(sji sjiVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            pl2 pl2Var = (pl2) it.next();
            if (sjiVar == pl2Var.b) {
                pl2Var.a.c.requestFocus();
                return true;
            }
        }
        if (!sjiVar.hasVisibleItems()) {
            return false;
        }
        j(sjiVar);
        xfc xfcVar = this.x;
        if (xfcVar != null) {
            xfcVar.k(sjiVar);
        }
        return true;
    }

    @Override // defpackage.wfh
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            pl2[] pl2VarArr = (pl2[]) arrayList.toArray(new pl2[size]);
            for (int i = size - 1; i >= 0; i--) {
                pl2 pl2Var = pl2VarArr[i];
                if (pl2Var.a.z.isShowing()) {
                    pl2Var.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.yfc
    public final void e(xfc xfcVar) {
        this.x = xfcVar;
    }

    @Override // defpackage.yfc
    public final void f() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((pl2) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((sec) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.yfc
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ofc
    public final void j(vec vecVar) {
        vecVar.b(this, this.b);
        if (a()) {
            t(vecVar);
        } else {
            this.h.add(vecVar);
        }
    }

    @Override // defpackage.ofc
    public final void l(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = Gravity.getAbsoluteGravity(this.m, view.getLayoutDirection());
        }
    }

    @Override // defpackage.ofc
    public final void m(boolean z) {
        this.v = z;
    }

    @Override // defpackage.wfh
    public final qc5 n() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((pl2) mz1.h(arrayList, 1)).a.c;
    }

    @Override // defpackage.ofc
    public final void o(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        pl2 pl2Var;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pl2Var = null;
                break;
            }
            pl2Var = (pl2) arrayList.get(i);
            if (!pl2Var.a.z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (pl2Var != null) {
            pl2Var.b.c(false);
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
        this.r = true;
        this.t = i;
    }

    @Override // defpackage.ofc
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.ofc
    public final void r(boolean z) {
        this.w = z;
    }

    @Override // defpackage.ofc
    public final void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.wfh
    public final void show() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t((vec) it.next());
        }
        arrayList.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(vec vecVar) {
        boolean z;
        boolean z2;
        View view;
        pl2 pl2Var;
        int i;
        int i2;
        MenuItem menuItem;
        sec secVar;
        int i3;
        int firstVisiblePosition;
        Context context = this.b;
        ?? from = LayoutInflater.from(context);
        sec secVar2 = new sec(vecVar, from, this.f, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.v) {
            secVar2.c = true;
        } else if (a()) {
            int size = vecVar.f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = vecVar.getItem(i4);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            secVar2.c = z;
        }
        int k = ofc.k(secVar2, context, this.c);
        ufc ufcVar = new ufc(context, null, this.d, this.e);
        ufcVar.C = this.l;
        ufcVar.p = this;
        ec0 ec0Var = ufcVar.z;
        ec0Var.setOnDismissListener(this);
        ufcVar.o = this.o;
        ufcVar.l = this.n;
        ufcVar.y = true;
        ec0Var.setFocusable(true);
        ec0Var.setInputMethodMode(2);
        ufcVar.m(secVar2);
        ufcVar.q(k);
        ufcVar.l = this.n;
        ArrayList arrayList = this.i;
        if (arrayList.size() > 0) {
            pl2Var = (pl2) mz1.h(arrayList, 1);
            vec vecVar2 = pl2Var.b;
            int size2 = vecVar2.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = vecVar2.getItem(i5);
                if (menuItem.hasSubMenu() && vecVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                qc5 qc5Var = pl2Var.a.c;
                ListAdapter adapter = qc5Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    secVar = (sec) headerViewListAdapter.getWrappedAdapter();
                } else {
                    secVar = (sec) adapter;
                    i3 = 0;
                }
                int count = secVar.getCount();
                int i6 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (menuItem == secVar.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                view = (i6 != -1 && (firstVisiblePosition = (i6 + i3) - qc5Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < qc5Var.getChildCount()) ? qc5Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z2 = 0;
            view = null;
            pl2Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = ufc.D;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(ec0Var, objArr);
                    } catch (Exception unused) {
                    }
                }
            } else {
                sfc.a(ec0Var, z2);
            }
            rfc.a(ec0Var, null);
            qc5 qc5Var2 = ((pl2) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            qc5Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect);
            if (this.q == 1) {
                if (qc5Var2.getWidth() + iArr[0] + k > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.q = i;
                    ufcVar.o = view;
                    if ((this.n & 5) == 5) {
                        i2 = 0;
                        k = z3 ? view.getWidth() : 0 - k;
                    } else if (z3) {
                        i2 = 0;
                    } else {
                        i2 = 0;
                        k = 0 - view.getWidth();
                    }
                    ufcVar.f = k;
                    ufcVar.k = true;
                    ufcVar.j = true;
                    ufcVar.i(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.q = i;
                ufcVar.o = view;
                if ((this.n & 5) == 5) {
                }
                ufcVar.f = k;
                ufcVar.k = true;
                ufcVar.j = true;
                ufcVar.i(i2);
            } else {
                if (iArr[0] - k >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.q = i;
                    ufcVar.o = view;
                    if ((this.n & 5) == 5) {
                    }
                    ufcVar.f = k;
                    ufcVar.k = true;
                    ufcVar.j = true;
                    ufcVar.i(i2);
                }
                i = 1;
                if (i != 1) {
                }
                this.q = i;
                ufcVar.o = view;
                if ((this.n & 5) == 5) {
                }
                ufcVar.f = k;
                ufcVar.k = true;
                ufcVar.j = true;
                ufcVar.i(i2);
            }
        } else {
            if (this.r) {
                ufcVar.f = this.t;
            }
            if (this.s) {
                ufcVar.i(this.u);
            }
            Rect rect2 = this.a;
            ufcVar.x = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new pl2(ufcVar, vecVar, this.q));
        ufcVar.show();
        qc5 qc5Var3 = ufcVar.c;
        qc5Var3.setOnKeyListener(this);
        if (pl2Var == null && this.w && vecVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, qc5Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(vecVar.m);
            qc5Var3.addHeaderView(frameLayout, null, false);
            ufcVar.show();
        }
    }
}
