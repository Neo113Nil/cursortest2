package com.vk.photos.root.albums.presentation.views;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import xsna.bga0;
import xsna.cn70;
import xsna.ee;
import xsna.f4m;
import xsna.fnj;
import xsna.gxp;
import xsna.iah0;
import xsna.jm1;
import xsna.whp;
import xsna.yb3;

/* compiled from: AlbumsRecyclerPaginatedView.kt */
/* loaded from: classes4.dex */
public final class AlbumsRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public AlbumsRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setPlaceholdersIcon(context.getResources().getConfiguration());
    }

    private final bga0 getPhotosErrorView() {
        return (bga0) getErrorView();
    }

    private final void setPlaceholdersIcon(Configuration configuration) {
        Context context = getContext();
        HashSet hashSet = iah0.a;
        boolean z = true;
        if (!fnj.d(context) && configuration.orientation != 1) {
            z = false;
        }
        getAlbumsEmptyView().setIconVisible(z);
        getPhotosErrorView().setIconVisible(z);
    }

    public final void A() {
        super.f0();
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        jm1 jm1Var = new jm1(context);
        f4m.y(cn70.b(33), jm1Var);
        f4m.a(jm1Var, new yb3(this, (Object) null, jm1Var, 8));
        return jm1Var;
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        bga0 bga0Var = new bga0(context, attributeSet, 4);
        bga0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bga0Var.setErrorText(context.getString(R.string.albums_loading_error));
        f4m.a(bga0Var, new yb3(this, (Object) null, bga0Var, 8));
        return bga0Var;
    }

    public final jm1 getAlbumsEmptyView() {
        return (jm1) getEmptyView();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setPlaceholdersIcon(configuration);
    }

    public final void x() {
        super.j();
        p(1, this.d, this.e, this.c, this.b);
    }

    public final void z() {
        super.fj(null, null);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void e0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void f0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void g0() {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void r(Throwable th) {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
    }
}
