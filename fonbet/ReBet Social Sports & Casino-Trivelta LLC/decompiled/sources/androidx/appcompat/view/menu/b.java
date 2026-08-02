package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.O;
import androidx.core.view.AbstractC2112t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends r.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B, reason: collision with root package name */
    public static final int f16645B = l.g.f55126e;

    /* renamed from: A, reason: collision with root package name */
    public boolean f16646A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16647b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16648c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16649d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16651f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f16652g;

    /* renamed from: o, reason: collision with root package name */
    public View f16660o;

    /* renamed from: p, reason: collision with root package name */
    public View f16661p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16663r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16664s;

    /* renamed from: t, reason: collision with root package name */
    public int f16665t;

    /* renamed from: u, reason: collision with root package name */
    public int f16666u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16668w;

    /* renamed from: x, reason: collision with root package name */
    public i.a f16669x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f16670y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f16671z;

    /* renamed from: h, reason: collision with root package name */
    public final List f16653h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final List f16654i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f16655j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f16656k = new ViewOnAttachStateChangeListenerC0341b();

    /* renamed from: l, reason: collision with root package name */
    public final N f16657l = new c();

    /* renamed from: m, reason: collision with root package name */
    public int f16658m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f16659n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16667v = false;

    /* renamed from: q, reason: collision with root package name */
    public int f16662q = D();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.isShowing() || b.this.f16654i.size() <= 0 || ((d) b.this.f16654i.get(0)).f16679a.z()) {
                return;
            }
            View view = b.this.f16661p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f16654i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f16679a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0341b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0341b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f16670y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f16670y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f16670y.removeGlobalOnLayoutListener(bVar.f16655j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements N {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f16675a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f16676b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f16677c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f16675a = dVar;
                this.f16676b = menuItem;
                this.f16677c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f16675a;
                if (dVar != null) {
                    b.this.f16646A = true;
                    dVar.f16680b.e(false);
                    b.this.f16646A = false;
                }
                if (this.f16676b.isEnabled() && this.f16676b.hasSubMenu()) {
                    this.f16677c.O(this.f16676b, 4);
                }
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.widget.N
        public void c(e eVar, MenuItem menuItem) {
            b.this.f16652g.removeCallbacksAndMessages(null);
            int size = b.this.f16654i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f16654i.get(i10)).f16680b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f16652g.postAtTime(new a(i11 < b.this.f16654i.size() ? (d) b.this.f16654i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.N
        public void m(e eVar, MenuItem menuItem) {
            b.this.f16652g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final O f16679a;

        /* renamed from: b, reason: collision with root package name */
        public final e f16680b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16681c;

        public d(O o10, e eVar, int i10) {
            this.f16679a = o10;
            this.f16680b = eVar;
            this.f16681c = i10;
        }

        public ListView a() {
            return this.f16679a.n();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f16647b = context;
        this.f16660o = view;
        this.f16649d = i10;
        this.f16650e = i11;
        this.f16651f = z10;
        Resources resources = context.getResources();
        this.f16648c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(l.d.f55022b));
        this.f16652g = new Handler();
    }

    public final int A(e eVar) {
        int size = this.f16654i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f16654i.get(i10)).f16680b) {
                return i10;
            }
        }
        return -1;
    }

    public final MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem B10 = B(dVar.f16680b, eVar);
        if (B10 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (B10 == dVar2.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return this.f16660o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int E(int i10) {
        List list = this.f16654i;
        ListView a10 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f16661p.getWindowVisibleDisplayFrame(rect);
        return this.f16662q == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void F(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f16647b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f16651f, f16645B);
        if (!isShowing() && this.f16667v) {
            dVar2.d(true);
        } else if (isShowing()) {
            dVar2.d(r.d.x(eVar));
        }
        int o10 = r.d.o(dVar2, null, this.f16647b, this.f16648c);
        O z10 = z();
        z10.l(dVar2);
        z10.D(o10);
        z10.E(this.f16659n);
        if (this.f16654i.size() > 0) {
            List list = this.f16654i;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z10.U(false);
            z10.R(null);
            int E10 = E(o10);
            boolean z11 = E10 == 1;
            this.f16662q = E10;
            if (Build.VERSION.SDK_INT >= 26) {
                z10.B(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f16660o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f16659n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f16660o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f16659n & 5) == 5) {
                if (!z11) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z11) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z10.d(i12);
            z10.M(true);
            z10.h(i11);
        } else {
            if (this.f16663r) {
                z10.d(this.f16665t);
            }
            if (this.f16664s) {
                z10.h(this.f16666u);
            }
            z10.F(m());
        }
        this.f16654i.add(new d(z10, eVar, this.f16662q));
        z10.show();
        ListView n10 = z10.n();
        n10.setOnKeyListener(this);
        if (dVar == null && this.f16668w && eVar.z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(l.g.f55133l, (ViewGroup) n10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.z());
            n10.addHeaderView(frameLayout, null, false);
            z10.show();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(e eVar, boolean z10) {
        int A10 = A(eVar);
        if (A10 < 0) {
            return;
        }
        int i10 = A10 + 1;
        if (i10 < this.f16654i.size()) {
            ((d) this.f16654i.get(i10)).f16680b.e(false);
        }
        d dVar = (d) this.f16654i.remove(A10);
        dVar.f16680b.R(this);
        if (this.f16646A) {
            dVar.f16679a.S(null);
            dVar.f16679a.C(0);
        }
        dVar.f16679a.dismiss();
        int size = this.f16654i.size();
        if (size > 0) {
            this.f16662q = ((d) this.f16654i.get(size - 1)).f16681c;
        } else {
            this.f16662q = D();
        }
        if (size != 0) {
            if (z10) {
                ((d) this.f16654i.get(0)).f16680b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f16669x;
        if (aVar != null) {
            aVar.a(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f16670y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f16670y.removeGlobalOnLayoutListener(this.f16655j);
            }
            this.f16670y = null;
        }
        this.f16661p.removeOnAttachStateChangeListener(this.f16656k);
        this.f16671z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(i.a aVar) {
        this.f16669x = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(Parcelable parcelable) {
    }

    @Override // r.f
    public void dismiss() {
        int size = this.f16654i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f16654i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f16679a.isShowing()) {
                    dVar.f16679a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f16654i) {
            if (lVar == dVar.f16680b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        k(lVar);
        i.a aVar = this.f16669x;
        if (aVar != null) {
            aVar.b(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        Iterator it = this.f16654i.iterator();
        while (it.hasNext()) {
            r.d.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h() {
        return false;
    }

    @Override // r.f
    public boolean isShowing() {
        return this.f16654i.size() > 0 && ((d) this.f16654i.get(0)).f16679a.isShowing();
    }

    @Override // r.d
    public void k(e eVar) {
        eVar.c(this, this.f16647b);
        if (isShowing()) {
            F(eVar);
        } else {
            this.f16653h.add(eVar);
        }
    }

    @Override // r.d
    public boolean l() {
        return false;
    }

    @Override // r.f
    public ListView n() {
        if (this.f16654i.isEmpty()) {
            return null;
        }
        return ((d) this.f16654i.get(r0.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f16654i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f16654i.get(i10);
            if (!dVar.f16679a.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f16680b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // r.d
    public void p(View view) {
        if (this.f16660o != view) {
            this.f16660o = view;
            this.f16659n = AbstractC2112t.b(this.f16658m, view.getLayoutDirection());
        }
    }

    @Override // r.d
    public void r(boolean z10) {
        this.f16667v = z10;
    }

    @Override // r.d
    public void s(int i10) {
        if (this.f16658m != i10) {
            this.f16658m = i10;
            this.f16659n = AbstractC2112t.b(i10, this.f16660o.getLayoutDirection());
        }
    }

    @Override // r.f
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator it = this.f16653h.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f16653h.clear();
        View view = this.f16660o;
        this.f16661p = view;
        if (view != null) {
            boolean z10 = this.f16670y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f16670y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f16655j);
            }
            this.f16661p.addOnAttachStateChangeListener(this.f16656k);
        }
    }

    @Override // r.d
    public void t(int i10) {
        this.f16663r = true;
        this.f16665t = i10;
    }

    @Override // r.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f16671z = onDismissListener;
    }

    @Override // r.d
    public void v(boolean z10) {
        this.f16668w = z10;
    }

    @Override // r.d
    public void w(int i10) {
        this.f16664s = true;
        this.f16666u = i10;
    }

    public final O z() {
        O o10 = new O(this.f16647b, null, this.f16649d, this.f16650e);
        o10.T(this.f16657l);
        o10.K(this);
        o10.J(this);
        o10.B(this.f16660o);
        o10.E(this.f16659n);
        o10.I(true);
        o10.H(2);
        return o10;
    }
}
