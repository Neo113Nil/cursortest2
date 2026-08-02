package com.vk.clips.design.view.camera.widgets;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import java.util.Iterator;

/* compiled from: TabsRecycler.kt */
/* loaded from: classes.dex */
public final class a extends RecyclerView.t {
    public final /* synthetic */ TabsRecycler b;

    public a(TabsRecycler tabsRecycler) {
        this.b = tabsRecycler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        TabsRecycler tabsRecycler = this.b;
        tabsRecycler.a(false);
        if (i == 0) {
            tabsRecycler.post(new io.reactivex.rxjava3.android.a(tabsRecycler, 16));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        TabsRecycler tabsRecycler = this.b;
        tabsRecycler.a(false);
        if (tabsRecycler.getInited()) {
            Iterator<TabsRecycler.b> it = tabsRecycler.getScrollListners().iterator();
            while (it.hasNext()) {
                it.next().e(tabsRecycler.j, tabsRecycler.k, tabsRecycler.l);
            }
        }
    }
}
