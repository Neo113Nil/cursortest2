package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class v implements d0, z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Rect f550a;

    public static int c(ListAdapter listAdapter, Context context, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i10 = 0;
        int i11 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = listAdapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i12, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i5) {
                return i5;
            }
            if (measuredWidth > i10) {
                i10 = measuredWidth;
            }
        }
        return i10;
    }

    public abstract void b(n nVar);

    @Override // androidx.appcompat.view.menu.z
    public final boolean collapseItemActionView(n nVar, p pVar) {
        return false;
    }

    public abstract void d(View view);

    public abstract void e(boolean z5);

    @Override // androidx.appcompat.view.menu.z
    public final boolean expandItemActionView(n nVar, p pVar) {
        return false;
    }

    public abstract void g(int i5);

    @Override // androidx.appcompat.view.menu.z
    public final int getId() {
        return 0;
    }

    public abstract void h(int i5);

    public abstract void i(PopupWindow.OnDismissListener onDismissListener);

    public abstract void j(boolean z5);

    public abstract void k(int i5);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (k) listAdapter).f508a.performItemAction((MenuItem) listAdapter.getItem(i5), this, !(this instanceof h) ? 0 : 4);
    }

    @Override // androidx.appcompat.view.menu.z
    public final void initForMenu(Context context, n nVar) {
    }
}
