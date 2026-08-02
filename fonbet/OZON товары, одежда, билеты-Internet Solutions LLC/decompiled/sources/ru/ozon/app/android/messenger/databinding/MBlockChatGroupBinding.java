package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;

/* loaded from: classes12.dex */
public final class MBlockChatGroupBinding implements a {

    @NonNull
    public final ConstraintLayout chatGroupRoot;

    @NonNull
    public final IconView groupIcon;

    @NonNull
    public final View groupIndicator;

    @NonNull
    public final TextView groupNameTv;

    @NonNull
    public final IndicatorView groupUnreadCountIndicator;

    @NonNull
    private final ConstraintLayout rootView;

    private MBlockChatGroupBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull IconView iconView, @NonNull View view, @NonNull TextView textView, @NonNull IndicatorView indicatorView) {
        this.rootView = constraintLayout;
        this.chatGroupRoot = constraintLayout2;
        this.groupIcon = iconView;
        this.groupIndicator = view;
        this.groupNameTv = textView;
        this.groupUnreadCountIndicator = indicatorView;
    }

    @NonNull
    public static MBlockChatGroupBinding bind(@NonNull View view) {
        View d11;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.groupIcon;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null && (d11 = C2548q.d((i11 = R$id.groupIndicator), view)) != null) {
            i11 = R$id.groupNameTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.groupUnreadCountIndicator;
                IndicatorView indicatorView = (IndicatorView) C2548q.d(i11, view);
                if (indicatorView != null) {
                    return new MBlockChatGroupBinding(constraintLayout, constraintLayout, iconView, d11, textView, indicatorView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockChatGroupBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_chat_group, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
