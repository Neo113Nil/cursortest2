package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes12.dex */
public final class MBlockPaginationErrorBinding implements a {

    @NonNull
    public final SmallButtonView paginationErrorBtn;

    @NonNull
    public final LinearLayout paginationErrorLl;

    @NonNull
    public final TextView paginationErrorTv;

    @NonNull
    private final LinearLayout rootView;

    private MBlockPaginationErrorBinding(@NonNull LinearLayout linearLayout, @NonNull SmallButtonView smallButtonView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.paginationErrorBtn = smallButtonView;
        this.paginationErrorLl = linearLayout2;
        this.paginationErrorTv = textView;
    }

    @NonNull
    public static MBlockPaginationErrorBinding bind(@NonNull View view) {
        int i11 = R$id.paginationErrorBtn;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.paginationErrorTv;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new MBlockPaginationErrorBinding(linearLayout, smallButtonView, linearLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockPaginationErrorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_pagination_error, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
