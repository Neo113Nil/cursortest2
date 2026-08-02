package ru.ozon.app.android.regulardraw.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.widgets.daily.ui.DailyBackground;

/* loaded from: classes13.dex */
public final class WidgetDailyBinding implements a {

    @NonNull
    public final DailyBackground background;

    @NonNull
    public final MorkovskShadowButton bottomButton;

    @NonNull
    public final Flow rewardFlow;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView timer;

    @NonNull
    public final AppCompatTextView timerTitle;

    @NonNull
    public final AppCompatTextView title;

    @NonNull
    public final AppCompatImageView topImage;

    @NonNull
    public final Space topMargin;

    private WidgetDailyBinding(@NonNull ConstraintLayout constraintLayout, @NonNull DailyBackground dailyBackground, @NonNull MorkovskShadowButton morkovskShadowButton, @NonNull Flow flow, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatImageView appCompatImageView, @NonNull Space space) {
        this.rootView = constraintLayout;
        this.background = dailyBackground;
        this.bottomButton = morkovskShadowButton;
        this.rewardFlow = flow;
        this.timer = appCompatTextView;
        this.timerTitle = appCompatTextView2;
        this.title = appCompatTextView3;
        this.topImage = appCompatImageView;
        this.topMargin = space;
    }

    @NonNull
    public static WidgetDailyBinding bind(@NonNull View view) {
        int i11 = R$id.background;
        DailyBackground dailyBackground = (DailyBackground) C2548q.d(i11, view);
        if (dailyBackground != null) {
            i11 = R$id.bottomButton;
            MorkovskShadowButton morkovskShadowButton = (MorkovskShadowButton) C2548q.d(i11, view);
            if (morkovskShadowButton != null) {
                i11 = R$id.rewardFlow;
                Flow flow = (Flow) C2548q.d(i11, view);
                if (flow != null) {
                    i11 = R$id.timer;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        i11 = R$id.timerTitle;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.title;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) C2548q.d(i11, view);
                            if (appCompatTextView3 != null) {
                                i11 = R$id.topImage;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                                if (appCompatImageView != null) {
                                    i11 = R$id.topMargin;
                                    Space space = (Space) C2548q.d(i11, view);
                                    if (space != null) {
                                        return new WidgetDailyBinding((ConstraintLayout) view, dailyBackground, morkovskShadowButton, flow, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatImageView, space);
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
