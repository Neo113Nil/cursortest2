package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

/* loaded from: classes9.dex */
public final class IntercomActivityArticleSearchBinding implements ViewBinding {
    public final ComposeView articleSearchComposeView;
    public final ConstraintLayout intercomSearchScreenRoot;
    private final ConstraintLayout rootView;

    private IntercomActivityArticleSearchBinding(ConstraintLayout constraintLayout, ComposeView composeView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.articleSearchComposeView = composeView;
        this.intercomSearchScreenRoot = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IntercomActivityArticleSearchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.intercom_activity_article_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntercomActivityArticleSearchBinding bind(View view) {
        int i = R.id.article_search_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new IntercomActivityArticleSearchBinding(constraintLayout, composeView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
