package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.TapToContinueTextView;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.ViewInfoExtKt;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/SecondBalanceScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;", "<init>", "()V", "Landroid/widget/FrameLayout;", "rootView", "tutorialScreenModel", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "", "onNext", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$SecondTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "", "textHorizontalMargin", "I", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SecondBalanceScreen extends BaseTutorialScreen<TutorialScreenModel.SecondTutorialScreenModel> {
    private final int textHorizontalMargin = Dimens.INSTANCE.getDP_45();

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.SecondTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        constraintLayout.setClipChildren(false);
        View view = tutorialScreenModel.getBalanceModel().getBalanceView().invoke().get();
        if (view == null || !view.isAttachedToWindow()) {
            onNext.invoke(Boolean.TRUE, null);
            return;
        }
        Rect positionAndSize = ViewInfoExtKt.getPositionAndSize(view);
        ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(View.generateViewId());
        imageView.setImageBitmap(ViewInfoExtKt.getSnapshot(view));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).width = positionAndSize.width();
        ((ViewGroup.MarginLayoutParams) bVar).height = positionAndSize.height();
        imageView.setLayoutParams(bVar);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TapToContinueTextView tapToContinueTextView = new TapToContinueTextView(context, tutorialScreenModel.getScreenInfoModel().getActionText());
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TooltipView tooltipView = new TooltipView(context2, 0.5f, false, false);
        tooltipView.bind(new ToolTipConfig.BasicOnboarding(tutorialScreenModel.getScreenInfoModel().getTooltipText(), tutorialScreenModel.getScreenInfoModel().getTooltipImage()));
        constraintLayout.addView(imageView);
        constraintLayout.addView(tapToContinueTextView);
        constraintLayout.addView(tooltipView);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        int id2 = imageView.getId();
        int i11 = positionAndSize.top;
        Context context3 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        dVar.t(id2, 3, 0, 3, i11 - ResourceExtKt.getStatusBarHeight(context3));
        dVar.t(imageView.getId(), 6, 0, 6, positionAndSize.left);
        int id3 = tooltipView.getId();
        int id4 = imageView.getId();
        Dimens dimens = Dimens.INSTANCE;
        dVar.t(id3, 3, id4, 4, dimens.getDP_8());
        dVar.t(tapToContinueTextView.getId(), 4, 0, 4, dimens.getDP_24());
        dVar.t(tapToContinueTextView.getId(), 6, 0, 6, this.textHorizontalMargin);
        dVar.t(tapToContinueTextView.getId(), 7, 0, 7, this.textHorizontalMargin);
        dVar.f(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        AnimationsKt.fadeInWithCallback$default(constraintLayout, 0L, new SecondBalanceScreen$show$1(constraintLayout, this, rootView, onNext), 1, null);
        t balanceScreenViewEvent = tutorialScreenModel.getScreenInfoModel().getBalanceScreenViewEvent();
        if (balanceScreenViewEvent != null) {
            m.c(tokenizedAnalytics, balanceScreenViewEvent, null);
        }
        fitsSystemWindow(constraintLayout);
    }
}
