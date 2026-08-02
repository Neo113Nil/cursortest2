package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w2 extends g2 {

    /* renamed from: m, reason: collision with root package name */
    public final int f989m;

    /* renamed from: n, reason: collision with root package name */
    public final int f990n;

    /* renamed from: o, reason: collision with root package name */
    public t2 f991o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.p f992p;

    public w2(Context context, boolean z5) {
        super(context, z5);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f989m = 21;
            this.f990n = 22;
        } else {
            this.f989m = 22;
            this.f990n = 21;
        }
    }

    @Override // androidx.appcompat.widget.g2, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        androidx.appcompat.view.menu.k kVar;
        int i5;
        int pointToPosition;
        int i10;
        if (this.f991o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i5 = headerViewListAdapter.getHeadersCount();
                kVar = (androidx.appcompat.view.menu.k) headerViewListAdapter.getWrappedAdapter();
            } else {
                kVar = (androidx.appcompat.view.menu.k) adapter;
                i5 = 0;
            }
            androidx.appcompat.view.menu.p item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = pointToPosition - i5) < 0 || i10 >= kVar.getCount()) ? null : kVar.getItem(i10);
            androidx.appcompat.view.menu.p pVar = this.f992p;
            if (pVar != item) {
                androidx.appcompat.view.menu.n nVar = kVar.f508a;
                if (pVar != null) {
                    this.f991o.g(nVar, pVar);
                }
                this.f992p = item;
                if (item != null) {
                    this.f991o.c(nVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i5 == this.f989m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i5 != this.f990n) {
            return super.onKeyDown(i5, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.k) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.k) adapter).f508a.close(false);
        return true;
    }

    public void setHoverListener(t2 t2Var) {
        this.f991o = t2Var;
    }

    @Override // androidx.appcompat.widget.g2, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
