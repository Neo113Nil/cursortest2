package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.view.TimerView;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetBlackFridayStatusImageTitleBinding implements a {

    @NonNull
    public final AppCompatImageView leftIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final StockBarView stockBarV;

    @NonNull
    public final Barrier timerBarrier;

    @NonNull
    public final TextAtomView timerTitleTav;

    @NonNull
    public final TimerView timerV;

    @NonNull
    public final AppCompatImageView titleIv;

    private WidgetBlackFridayStatusImageTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull StockBarView stockBarView, @NonNull Barrier barrier, @NonNull TextAtomView textAtomView, @NonNull TimerView timerView, @NonNull AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.leftIv = appCompatImageView;
        this.stockBarV = stockBarView;
        this.timerBarrier = barrier;
        this.timerTitleTav = textAtomView;
        this.timerV = timerView;
        this.titleIv = appCompatImageView2;
    }

    @NonNull
    public static WidgetBlackFridayStatusImageTitleBinding bind(@NonNull View view) {
        int i11 = R$id.leftIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.stockBarV;
            StockBarView stockBarView = (StockBarView) C2548q.d(i11, view);
            if (stockBarView != null) {
                i11 = R$id.timerBarrier;
                Barrier barrier = (Barrier) C2548q.d(i11, view);
                if (barrier != null) {
                    i11 = R$id.timerTitleTav;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView != null) {
                        i11 = R$id.timerV;
                        TimerView timerView = (TimerView) C2548q.d(i11, view);
                        if (timerView != null) {
                            i11 = R$id.titleIv;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                            if (appCompatImageView2 != null) {
                                return new WidgetBlackFridayStatusImageTitleBinding((ConstraintLayout) view, appCompatImageView, stockBarView, barrier, textAtomView, timerView, appCompatImageView2);
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
