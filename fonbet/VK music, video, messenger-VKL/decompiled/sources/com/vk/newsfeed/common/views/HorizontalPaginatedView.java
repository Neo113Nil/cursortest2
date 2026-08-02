package com.vk.newsfeed.common.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.p160;

/* compiled from: HorizontalPaginatedView.kt */
/* loaded from: classes4.dex */
public final class HorizontalPaginatedView extends RecyclerPaginatedView {

    /* compiled from: HorizontalPaginatedView.kt */
    public static final class a extends AbstractPaginatedView.h {
    }

    public HorizontalPaginatedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        p160 p160Var = new p160(context, attributeSet);
        p160Var.setId(R.id.recycler);
        this.x = p160Var;
        this.w = new a();
        return this.x;
    }

    public HorizontalPaginatedView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.e.setClipChildren(false);
    }
}
