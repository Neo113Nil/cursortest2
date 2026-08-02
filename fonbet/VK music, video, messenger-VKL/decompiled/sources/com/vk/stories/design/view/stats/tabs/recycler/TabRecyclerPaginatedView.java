package com.vk.stories.design.view.stats.tabs.recycler;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.gxp;
import xsna.ltn0;
import xsna.whp;

/* compiled from: TabRecyclerPaginatedView.kt */
/* loaded from: classes6.dex */
public final class TabRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public TabRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void A() {
        super.Fe();
    }

    public final void B() {
        super.lb();
    }

    public final void C() {
        super.f0();
    }

    public final void D() {
        super.e0();
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        return LayoutInflater.from(context).inflate(R.layout.pds_story_statistics_empty_view, (ViewGroup) this, false);
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new ltn0(context);
    }

    public final View getLoadingView() {
        return this.b;
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final View h(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.pds_story_statistics_loading_view, (ViewGroup) this, false);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        RecyclerView recyclerView = new RecyclerView(context);
        this.x = recyclerView;
        return recyclerView;
    }

    public final void setEmptyTextRes(int i) {
        ((TextView) this.d.findViewById(R.id.empty_text)).setText(i);
    }

    public final void setErrorTextRes(int i) {
        ((TextView) this.c.findViewById(R.id.error_text)).setText(i);
    }

    public final void x() {
        super.qg(null);
    }

    public final void z() {
        super.fj(null, null);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void Fe() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void Mk() {
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
    public final void lb() {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void qg(whp whpVar) {
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void r(Throwable th) {
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public void setSwipeRefreshEnabled(boolean z) {
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
    }
}
