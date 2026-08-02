package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.blocks.messagetext.TextViewWithSlaveLayout;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.utils.view.TightTextView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockTextBinding implements a {

    @NonNull
    public final LinearLayout authorIcons;

    @NonNull
    public final AppCompatTextView authorNameTv;

    @NonNull
    public final ConstraintLayout blockTextRootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TightTextView textTv;

    @NonNull
    public final TextViewWithSlaveLayout textWithSlaveLayout;

    @NonNull
    public final TimeStatusView timeStatusView;

    private MBlockTextBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull TightTextView tightTextView, @NonNull TextViewWithSlaveLayout textViewWithSlaveLayout, @NonNull TimeStatusView timeStatusView) {
        this.rootView = constraintLayout;
        this.authorIcons = linearLayout;
        this.authorNameTv = appCompatTextView;
        this.blockTextRootCl = constraintLayout2;
        this.textTv = tightTextView;
        this.textWithSlaveLayout = textViewWithSlaveLayout;
        this.timeStatusView = timeStatusView;
    }

    @NonNull
    public static MBlockTextBinding bind(@NonNull View view) {
        int i11 = R$id.authorIcons;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.authorNameTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.textTv;
                TightTextView tightTextView = (TightTextView) C2548q.d(i11, view);
                if (tightTextView != null) {
                    i11 = R$id.textWithSlaveLayout;
                    TextViewWithSlaveLayout textViewWithSlaveLayout = (TextViewWithSlaveLayout) C2548q.d(i11, view);
                    if (textViewWithSlaveLayout != null) {
                        i11 = R$id.timeStatusView;
                        TimeStatusView timeStatusView = (TimeStatusView) C2548q.d(i11, view);
                        if (timeStatusView != null) {
                            return new MBlockTextBinding(constraintLayout, linearLayout, appCompatTextView, constraintLayout, tightTextView, textViewWithSlaveLayout, timeStatusView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockTextBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_text, viewGroup, false);
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
