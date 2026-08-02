package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.ComposeView;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockDangerousTextBinding implements a {

    @NonNull
    public final LinearLayout dangerousTextRootCl;

    @NonNull
    public final ComposeView dangerousTextView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TimeStatusView timeStatusView;

    private MBlockDangerousTextBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ComposeView composeView, @NonNull TimeStatusView timeStatusView) {
        this.rootView = linearLayout;
        this.dangerousTextRootCl = linearLayout2;
        this.dangerousTextView = composeView;
        this.timeStatusView = timeStatusView;
    }

    @NonNull
    public static MBlockDangerousTextBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.dangerousTextView;
        ComposeView composeView = (ComposeView) C2548q.d(i11, view);
        if (composeView != null) {
            i11 = R$id.timeStatusView;
            TimeStatusView timeStatusView = (TimeStatusView) C2548q.d(i11, view);
            if (timeStatusView != null) {
                return new MBlockDangerousTextBinding(linearLayout, linearLayout, composeView, timeStatusView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockDangerousTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_dangerous_text, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
