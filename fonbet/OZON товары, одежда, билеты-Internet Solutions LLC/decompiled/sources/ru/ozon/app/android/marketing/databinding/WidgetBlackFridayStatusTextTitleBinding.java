package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.atoms.v3.holders.switchingButton.SwitchingButtonView;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.view.TimerView;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetBlackFridayStatusTextTitleBinding implements a {

    @NonNull
    public final TextAtomView btnSubtitleTav;

    @NonNull
    public final AppCompatImageView leftIv;

    @NonNull
    public final Guideline rightGuideline;

    @NonNull
    public final ConstraintLayout rootCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StockBarView stockBarV;

    @NonNull
    public final TextAtomView subtitleTav;

    @NonNull
    public final SwitchingButtonView switchingBtn;

    @NonNull
    public final TextAtomView timerTitleTav;

    @NonNull
    public final TimerView timerV;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetBlackFridayStatusTextTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull AppCompatImageView appCompatImageView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull StockBarView stockBarView, @NonNull TextAtomView textAtomView2, @NonNull SwitchingButtonView switchingButtonView, @NonNull TextAtomView textAtomView3, @NonNull TimerView timerView, @NonNull TextAtomView textAtomView4) {
        this.rootView = constraintLayout;
        this.btnSubtitleTav = textAtomView;
        this.leftIv = appCompatImageView;
        this.rightGuideline = guideline;
        this.rootCl = constraintLayout2;
        this.stockBarV = stockBarView;
        this.subtitleTav = textAtomView2;
        this.switchingBtn = switchingButtonView;
        this.timerTitleTav = textAtomView3;
        this.timerV = timerView;
        this.titleTav = textAtomView4;
    }

    @NonNull
    public static WidgetBlackFridayStatusTextTitleBinding bind(@NonNull View view) {
        int i11 = R$id.btnSubtitleTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.leftIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.rightGuideline;
                Guideline guideline = (Guideline) C2548q.d(i11, view);
                if (guideline != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.stockBarV;
                    StockBarView stockBarView = (StockBarView) C2548q.d(i11, view);
                    if (stockBarView != null) {
                        i11 = R$id.subtitleTav;
                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                        if (textAtomView2 != null) {
                            i11 = R$id.switchingBtn;
                            SwitchingButtonView switchingButtonView = (SwitchingButtonView) C2548q.d(i11, view);
                            if (switchingButtonView != null) {
                                i11 = R$id.timerTitleTav;
                                TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                if (textAtomView3 != null) {
                                    i11 = R$id.timerV;
                                    TimerView timerView = (TimerView) C2548q.d(i11, view);
                                    if (timerView != null) {
                                        i11 = R$id.titleTav;
                                        TextAtomView textAtomView4 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView4 != null) {
                                            return new WidgetBlackFridayStatusTextTitleBinding(constraintLayout, textAtomView, appCompatImageView, guideline, constraintLayout, stockBarView, textAtomView2, switchingButtonView, textAtomView3, timerView, textAtomView4);
                                        }
                                    }
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
