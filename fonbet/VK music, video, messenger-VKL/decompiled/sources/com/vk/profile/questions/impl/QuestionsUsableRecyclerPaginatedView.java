package com.vk.profile.questions.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.c98;
import xsna.gzs;
import xsna.he40;
import xsna.i0q0;
import xsna.s3q0;
import xsna.vqe0;
import xsna.w100;

/* compiled from: QuestionsUsableRecyclerPaginatedView.kt */
/* loaded from: classes5.dex */
public final class QuestionsUsableRecyclerPaginatedView extends UsableRecyclerPaginatedView {
    public static final /* synthetic */ int U = 0;
    public gzs<s3q0> T;

    /* compiled from: QuestionsUsableRecyclerPaginatedView.kt */
    public static final class a extends SwipeDrawableRefreshLayout {
        @Override // android.view.View
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (view != this || i == 0) {
                return;
            }
            setRefreshing(false);
        }
    }

    public QuestionsUsableRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.T = new vqe0(0);
    }

    @Override // me.grishka.appkit.views.UsableRecyclerPaginatedView, com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View c(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.pds_empty_questions_view, (ViewGroup) this, false);
        inflate.findViewById(R.id.questions_empty_share).setOnClickListener(new c98(this, 10));
        a aVar = new a(context, null);
        i0q0.f(new w100(aVar, 27));
        aVar.addView(inflate);
        aVar.setOnRefreshListener(new he40(this, 7));
        setEmptyViewRefreshLayout(aVar);
        return aVar;
    }

    public final gzs<s3q0> getOnClickInviteFriends() {
        return this.T;
    }

    public final void setOnClickInviteFriends(gzs<s3q0> gzsVar) {
        this.T = gzsVar;
    }
}
