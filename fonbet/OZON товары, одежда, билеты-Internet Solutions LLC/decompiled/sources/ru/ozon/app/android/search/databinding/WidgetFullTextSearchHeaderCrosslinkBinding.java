package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetFullTextSearchHeaderCrosslinkBinding implements a {

    @NonNull
    public final ConstraintLayout crosslinkCl;

    @NonNull
    public final AppCompatImageView crosslinkIconIv;

    @NonNull
    public final TextView crosslinkTitleTv;

    @NonNull
    private final CardView rootView;

    private WidgetFullTextSearchHeaderCrosslinkBinding(@NonNull CardView cardView, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView) {
        this.rootView = cardView;
        this.crosslinkCl = constraintLayout;
        this.crosslinkIconIv = appCompatImageView;
        this.crosslinkTitleTv = textView;
    }

    @NonNull
    public static WidgetFullTextSearchHeaderCrosslinkBinding bind(@NonNull View view) {
        int i11 = R$id.crosslinkCl;
        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
        if (constraintLayout != null) {
            i11 = R$id.crosslinkIconIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.crosslinkTitleTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new WidgetFullTextSearchHeaderCrosslinkBinding((CardView) view, constraintLayout, appCompatImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public CardView getConstraintLayout() {
        return this.rootView;
    }
}
