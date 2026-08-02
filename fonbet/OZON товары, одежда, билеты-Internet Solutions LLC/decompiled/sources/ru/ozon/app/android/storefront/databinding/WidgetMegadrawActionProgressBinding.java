package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.widgets.megaRaffle.presentation.MegaDrawProductProgressView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetMegadrawActionProgressBinding implements a {

    @NonNull
    public final MegaDrawProductProgressView actionFirstItemProgress;

    @NonNull
    public final MegaDrawProductProgressView actionSecondItemProgress;

    @NonNull
    public final AppCompatImageView backgroundIv;

    @NonNull
    public final TextAtomView mainSubtitleTv;

    @NonNull
    public final AppCompatImageView mainTitleArrowIv;

    @NonNull
    public final TextAtomView mainTitleTv;

    @NonNull
    public final ConstraintLayout megadrawActionProgress;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subtitleCounterTv;

    private WidgetMegadrawActionProgressBinding(@NonNull ConstraintLayout constraintLayout, @NonNull MegaDrawProductProgressView megaDrawProductProgressView, @NonNull MegaDrawProductProgressView megaDrawProductProgressView2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextAtomView textAtomView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.actionFirstItemProgress = megaDrawProductProgressView;
        this.actionSecondItemProgress = megaDrawProductProgressView2;
        this.backgroundIv = appCompatImageView;
        this.mainSubtitleTv = textAtomView;
        this.mainTitleArrowIv = appCompatImageView2;
        this.mainTitleTv = textAtomView2;
        this.megadrawActionProgress = constraintLayout2;
        this.subtitleCounterTv = textAtomView3;
    }

    @NonNull
    public static WidgetMegadrawActionProgressBinding bind(@NonNull View view) {
        int i11 = R$id.actionFirstItemProgress;
        MegaDrawProductProgressView megaDrawProductProgressView = (MegaDrawProductProgressView) C2548q.d(i11, view);
        if (megaDrawProductProgressView != null) {
            i11 = R$id.actionSecondItemProgress;
            MegaDrawProductProgressView megaDrawProductProgressView2 = (MegaDrawProductProgressView) C2548q.d(i11, view);
            if (megaDrawProductProgressView2 != null) {
                i11 = R$id.backgroundIv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.mainSubtitleTv;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.mainTitleArrowIv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.mainTitleTv;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i11 = R$id.subtitleCounterTv;
                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView3 != null) {
                                    return new WidgetMegadrawActionProgressBinding(constraintLayout, megaDrawProductProgressView, megaDrawProductProgressView2, appCompatImageView, textAtomView, appCompatImageView2, textAtomView2, constraintLayout, textAtomView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
