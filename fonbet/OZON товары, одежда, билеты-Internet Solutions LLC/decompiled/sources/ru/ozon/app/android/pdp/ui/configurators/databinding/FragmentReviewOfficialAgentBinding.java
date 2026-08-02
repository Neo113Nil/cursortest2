package ru.ozon.app.android.pdp.ui.configurators.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.pdp.ui.configurators.R$id;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;

/* loaded from: classes13.dex */
public final class FragmentReviewOfficialAgentBinding implements a {

    @NonNull
    public final TextView officialAgentSubtitleTv;

    @NonNull
    public final TextView officialAgentTitleTv;

    @NonNull
    private final NestedScrollView rootView;

    private FragmentReviewOfficialAgentBinding(@NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = nestedScrollView;
        this.officialAgentSubtitleTv = textView;
        this.officialAgentTitleTv = textView2;
    }

    @NonNull
    public static FragmentReviewOfficialAgentBinding bind(@NonNull View view) {
        int i11 = R$id.officialAgentSubtitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.officialAgentTitleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new FragmentReviewOfficialAgentBinding((NestedScrollView) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentReviewOfficialAgentBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_review_official_agent, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }
}
