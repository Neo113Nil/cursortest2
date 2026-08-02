package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockFileBinding implements a {

    @NonNull
    public final AppCompatTextView authorNameTv;

    @NonNull
    public final CardView fileBackgroundCV;

    @NonNull
    public final ConstraintLayout fileMessageRootCl;

    @NonNull
    public final AppCompatTextView fileNameTv;

    @NonNull
    public final AppCompatTextView fileSizeTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TimeStatusView timeStatusView;

    private MBlockFileBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull TimeStatusView timeStatusView) {
        this.rootView = constraintLayout;
        this.authorNameTv = appCompatTextView;
        this.fileBackgroundCV = cardView;
        this.fileMessageRootCl = constraintLayout2;
        this.fileNameTv = appCompatTextView2;
        this.fileSizeTv = appCompatTextView3;
        this.timeStatusView = timeStatusView;
    }

    @NonNull
    public static MBlockFileBinding bind(@NonNull View view) {
        int i11 = R$id.authorNameTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.fileBackgroundCV;
            CardView cardView = (CardView) C2548q.d(i11, view);
            if (cardView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.fileNameTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    i11 = R$id.fileSizeTv;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView3 != null) {
                        i11 = R$id.timeStatusView;
                        TimeStatusView timeStatusView = (TimeStatusView) C2548q.d(i11, view);
                        if (timeStatusView != null) {
                            return new MBlockFileBinding(constraintLayout, appCompatTextView, cardView, constraintLayout, appCompatTextView2, appCompatTextView3, timeStatusView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockFileBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_file, viewGroup, false);
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
