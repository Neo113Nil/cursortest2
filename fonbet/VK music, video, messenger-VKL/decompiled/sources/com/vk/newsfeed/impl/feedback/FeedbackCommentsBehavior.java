package com.vk.newsfeed.impl.feedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.views.ModalCommentsPaginatedView;
import com.vkontakte.android.R;
import xsna.f4m;

/* compiled from: FeedbackCommentsBehavior.kt */
/* loaded from: classes4.dex */
public final class FeedbackCommentsBehavior extends CoordinatorLayout.c<View> {
    public FeedbackCommentsBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(View view, View view2) {
        return view2.getId() == R.id.news_entry_feedback_comments_order_button;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        RecyclerView recyclerView;
        ModalCommentsPaginatedView modalCommentsPaginatedView = view instanceof ModalCommentsPaginatedView ? (ModalCommentsPaginatedView) view : null;
        if (modalCommentsPaginatedView != null && (recyclerView = modalCommentsPaginatedView.getRecyclerView()) != null) {
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = view2.getVisibility() == 0 ? view2.getMeasuredHeight() : 0;
            if (paddingTop != measuredHeight) {
                f4m.y(measuredHeight, recyclerView);
                recyclerView.scrollBy(0, paddingTop - measuredHeight);
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0 || size <= 536870911) {
            return false;
        }
        coordinatorLayout.U(view, i, i2, View.MeasureSpec.makeMeasureSpec(0, mode));
        return true;
    }
}
