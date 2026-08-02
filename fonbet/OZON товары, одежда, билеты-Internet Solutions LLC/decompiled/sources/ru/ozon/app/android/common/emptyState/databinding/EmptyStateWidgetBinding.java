package ru.ozon.app.android.common.emptyState.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.common.emptyState.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes11.dex */
public final class EmptyStateWidgetBinding implements a {

    @NonNull
    public final SmallButtonView emptyStateActionTv;

    @NonNull
    public final ImageView emptyStateIv;

    @NonNull
    public final TextView emptyStateMessageTv;

    @NonNull
    public final TextView emptyStateTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private EmptyStateWidgetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.emptyStateActionTv = smallButtonView;
        this.emptyStateIv = imageView;
        this.emptyStateMessageTv = textView;
        this.emptyStateTitleTv = textView2;
    }

    @NonNull
    public static EmptyStateWidgetBinding bind(@NonNull View view) {
        int i11 = R$id.emptyStateActionTv;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.emptyStateIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.emptyStateMessageTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.emptyStateTitleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new EmptyStateWidgetBinding((ConstraintLayout) view, smallButtonView, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
