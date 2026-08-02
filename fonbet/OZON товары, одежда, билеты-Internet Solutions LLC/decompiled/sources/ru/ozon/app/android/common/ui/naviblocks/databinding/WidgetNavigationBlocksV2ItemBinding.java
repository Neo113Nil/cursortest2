package ru.ozon.app.android.common.ui.naviblocks.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.common.ui.naviblocks.R$id;

/* loaded from: classes11.dex */
public final class WidgetNavigationBlocksV2ItemBinding implements a {

    @NonNull
    public final AppCompatImageView ivIcon;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatTextView tvSubtitle;

    @NonNull
    public final AppCompatTextView tvTitle;

    private WidgetNavigationBlocksV2ItemBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayout;
        this.ivIcon = appCompatImageView;
        this.tvSubtitle = appCompatTextView;
        this.tvTitle = appCompatTextView2;
    }

    @NonNull
    public static WidgetNavigationBlocksV2ItemBinding bind(@NonNull View view) {
        int i11 = R$id.ivIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.tvSubtitle;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.tvTitle;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    return new WidgetNavigationBlocksV2ItemBinding((LinearLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
