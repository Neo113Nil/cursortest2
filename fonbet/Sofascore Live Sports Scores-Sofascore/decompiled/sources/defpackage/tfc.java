package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tfc extends qc5 {
    public final int m;
    public final int n;
    public dfc o;
    public efc p;

    public tfc(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.qc5, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        sec secVar;
        int i;
        int pointToPosition;
        int i2;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                secVar = (sec) headerViewListAdapter.getWrappedAdapter();
            } else {
                secVar = (sec) adapter;
                i = 0;
            }
            efc item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= secVar.getCount()) ? null : secVar.getItem(i2);
            efc efcVar = this.p;
            if (efcVar != item) {
                vec vecVar = secVar.a;
                if (efcVar != null) {
                    this.o.c(vecVar, efcVar);
                }
                this.p = item;
                if (item != null) {
                    this.o.h(vecVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (sec) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (sec) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(dfc dfcVar) {
        this.o = dfcVar;
    }

    @Override // defpackage.qc5, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
