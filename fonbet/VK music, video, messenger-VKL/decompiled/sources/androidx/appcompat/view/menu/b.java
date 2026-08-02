package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
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
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b820;
import xsna.p720;
import xsna.xy9;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes11.dex */
public final class b extends b820 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public final Context c;
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
    public j.a x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final a j = new a();
    public final ViewOnAttachStateChangeListenerC0001b k = new ViewOnAttachStateChangeListenerC0001b();
    public final c l = new c();
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    /* compiled from: CascadingMenuPopup.java */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            ArrayList arrayList = bVar.i;
            if (!bVar.isShowing() || arrayList.size() <= 0 || ((d) arrayList.get(0)).a.isModal()) {
                return;
            }
            View view = bVar.p;
            if (view == null || !view.isShown()) {
                bVar.dismiss();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a.show();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public class c implements p720 {
        public c() {
        }

        @Override // xsna.p720
        public final void b(@NonNull f fVar, @NonNull MenuItem menuItem) {
            b.this.g.removeCallbacksAndMessages(fVar);
        }

        @Override // xsna.p720
        public final void c(@NonNull f fVar, @NonNull h hVar) {
            b bVar = b.this;
            Handler handler = bVar.g;
            handler.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            handler.postAtTime(new androidx.appcompat.view.menu.c(this, i2 < arrayList.size() ? (d) arrayList.get(i2) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    public static class d {
        public final androidx.appcompat.widget.b a;
        public final f b;
        public final int c;

        public d(@NonNull androidx.appcompat.widget.b bVar, @NonNull f fVar, int i) {
            this.a = bVar;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i, boolean z) {
        this.c = context;
        this.o = view;
        this.e = i;
        this.f = z;
        this.q = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (fVar == ((d) arrayList.get(i)).b) {
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
            ((d) arrayList.get(i2)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i);
        f fVar2 = dVar.b;
        androidx.appcompat.widget.b bVar = dVar.a;
        fVar2.r(this);
        if (this.A) {
            bVar.h(null);
            bVar.setAnimationStyle(0);
        }
        bVar.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q = ((d) arrayList.get(size2 - 1)).c;
        } else {
            this.q = this.o.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.a(fVar, true);
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

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable b() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).a.getListView().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // xsna.sjj0
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.a.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(m mVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.b) {
                dVar.a.getListView().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        k(mVar);
        j.a aVar = this.x;
        if (aVar != null) {
            aVar.b(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        return false;
    }

    @Override // xsna.sjj0
    public final ListView getListView() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) xy9.b(1, arrayList)).a.getListView();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(j.a aVar) {
        this.x = aVar;
    }

    @Override // xsna.sjj0
    public final boolean isShowing() {
        ArrayList arrayList = this.i;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.isShowing();
    }

    @Override // xsna.b820
    public final void k(f fVar) {
        fVar.b(this, this.c);
        if (isShowing()) {
            t(fVar);
        } else {
            this.h.add(fVar);
        }
    }

    @Override // xsna.b820
    public final void m(@NonNull View view) {
        if (this.o != view) {
            this.o = view;
            this.n = Gravity.getAbsoluteGravity(this.m, view.getLayoutDirection());
        }
    }

    @Override // xsna.b820
    public final void n(boolean z) {
        this.v = z;
    }

    @Override // xsna.b820
    public final void o(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = Gravity.getAbsoluteGravity(i, this.o.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i);
            if (!dVar.a.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
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
        this.r = true;
        this.t = i;
    }

    @Override // xsna.b820
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // xsna.b820
    public final void r(boolean z) {
        this.w = z;
    }

    @Override // xsna.b820
    public final void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // xsna.sjj0
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t((f) it.next());
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

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0140, code lost:
    
        if (((r6.getWidth() + r7[r16]) + r5) > r11.right) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0142, code lost:
    
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0146, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014b, code lost:
    
        if ((r7[r16] - r5) < 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(@NonNull f fVar) {
        boolean z;
        int i;
        int i2;
        View view;
        d dVar;
        int i3;
        MenuItem menuItem;
        e eVar;
        int i4;
        int firstVisiblePosition;
        Context context = this.c;
        LayoutInflater from = LayoutInflater.from(context);
        e eVar2 = new e(fVar, from, this.f, R.layout.abc_cascading_menu_item_layout);
        int i5 = 0;
        if (!isShowing() && this.v) {
            eVar2.d = true;
        } else if (isShowing()) {
            int size = fVar.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = fVar.getItem(i6);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i6++;
            }
            eVar2.d = z;
        }
        int l = b820.l(eVar2, context, this.d);
        androidx.appcompat.widget.b bVar = new androidx.appcompat.widget.b(context, null, this.e, 0);
        bVar.b = this.l;
        bVar.setOnItemClickListener(this);
        bVar.setOnDismissListener(this);
        bVar.setAnchorView(this.o);
        bVar.setDropDownGravity(this.n);
        bVar.setModal(true);
        bVar.setInputMethodMode(2);
        bVar.setAdapter(eVar2);
        bVar.setContentWidth(l);
        bVar.setDropDownGravity(this.n);
        ArrayList arrayList = this.i;
        if (arrayList.size() > 0) {
            dVar = (d) xy9.b(1, arrayList);
            f fVar2 = dVar.b;
            int size2 = fVar2.f.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = fVar2.getItem(i7);
                if (menuItem.hasSubMenu() && fVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i7++;
                }
            }
            if (menuItem == null) {
                i = 1;
                i2 = 0;
            } else {
                ListView listView = dVar.a.getListView();
                ListAdapter adapter = listView.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i4 = 0;
                }
                int count = eVar.getCount();
                i = 1;
                i2 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == eVar.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i4) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) {
                    view = listView.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            i = 1;
            i2 = 0;
            view = null;
            dVar = null;
        }
        if (view != null) {
            bVar.i();
            bVar.g(null);
            ListView listView2 = ((d) arrayList.get(arrayList.size() - 1)).a.getListView();
            int[] iArr = new int[2];
            listView2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect);
            if (this.q == i) {
            }
            int i8 = i3 == 1 ? 1 : i2;
            this.q = i3;
            bVar.setAnchorView(view);
            if ((this.n & 5) != 5) {
                l = i8 != 0 ? view.getWidth() : 0 - l;
            } else if (i8 == 0) {
                l = 0 - view.getWidth();
            }
            bVar.setHorizontalOffset(l);
            bVar.setOverlapAnchor(true);
            bVar.setVerticalOffset(i2);
        } else {
            if (this.r) {
                bVar.setHorizontalOffset(this.t);
            }
            if (this.s) {
                bVar.setVerticalOffset(this.u);
            }
            bVar.setEpicenterBounds(this.b);
        }
        arrayList.add(new d(bVar, fVar, this.q));
        bVar.show();
        ListView listView3 = bVar.getListView();
        listView3.setOnKeyListener(this);
        if (dVar == null && this.w && fVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(fVar.m);
            listView3.addHeaderView(frameLayout, null, false);
            bVar.show();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0001b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0001b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.y = view.getViewTreeObserver();
                }
                bVar.y.removeGlobalOnLayoutListener(bVar.j);
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
}
