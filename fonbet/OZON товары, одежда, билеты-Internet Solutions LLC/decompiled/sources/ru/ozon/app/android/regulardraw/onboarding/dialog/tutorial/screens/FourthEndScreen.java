package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import B3.D;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.ViewInfoExtKt;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJI\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014\u0012\u0004\u0012\u00020\b0\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/FourthEndScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;", "<init>", "()V", "LWZ/l;", "tokenizedAnalytics", "tutorialScreenModel", "", "onScreenClosed", "(LWZ/l;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/GradientDrawable;", "createOvalBackground", "(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;", "Landroid/widget/FrameLayout;", "rootView", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "onNext", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FourthTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FourthEndScreen extends BaseTutorialScreen<TutorialScreenModel.FourthTutorialScreenModel> {
    private final GradientDrawable createOvalBackground(Context context) {
        GradientDrawable b11 = D.b(0);
        b11.setColor(androidx.core.content.a.getColor(context, R$color.onboarding_skip_btn_bg_color));
        b11.setCornerRadius(ResourceExtKt.toPxF(13));
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScreenClosed(l tokenizedAnalytics, TutorialScreenModel.FourthTutorialScreenModel tutorialScreenModel) {
        t skipButtonClickEvent = tutorialScreenModel.getScreenInfoModel().getSkipButtonClickEvent();
        if (skipButtonClickEvent != null) {
            m.a(tokenizedAnalytics, skipButtonClickEvent, null);
        }
    }

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.FourthTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        constraintLayout.setClipChildren(false);
        View view = tutorialScreenModel.getFirstNavbarItemModel().getFirstNavbarView().invoke().get();
        if (view == null || !view.isAttachedToWindow()) {
            onNext.invoke(Boolean.TRUE, null);
            return;
        }
        View view2 = tutorialScreenModel.getSecondNavbarItemModel().getSecondNavbarView().invoke().get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            onNext.invoke(Boolean.TRUE, null);
            return;
        }
        Rect positionAndSize = ViewInfoExtKt.getPositionAndSize(view);
        Rect positionAndSize2 = ViewInfoExtKt.getPositionAndSize(view2);
        ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(View.generateViewId());
        imageView.setImageBitmap(ViewInfoExtKt.getSnapshot(view));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).width = positionAndSize.width();
        ((ViewGroup.MarginLayoutParams) bVar).height = positionAndSize.height();
        imageView.setLayoutParams(bVar);
        ImageView imageView2 = new ImageView(rootView.getContext());
        imageView2.setId(View.generateViewId());
        imageView2.setImageBitmap(ViewInfoExtKt.getSnapshot(view2));
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar2).width = positionAndSize2.width();
        ((ViewGroup.MarginLayoutParams) bVar2).height = positionAndSize2.height();
        imageView2.setLayoutParams(bVar2);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TooltipView tooltipView = new TooltipView(context, -0.25f, false, false);
        tooltipView.bind(new ToolTipConfig.BasicOnboarding(tutorialScreenModel.getScreenInfoModel().getTooltipText(), tutorialScreenModel.getScreenInfoModel().getTooltipImage()));
        AppCompatTextView appCompatTextView = new AppCompatTextView(rootView.getContext());
        appCompatTextView.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        Dimens dimens = Dimens.INSTANCE;
        appCompatTextView.setPadding(dimens.getDP_12(), ResourceExtKt.toPx(11), dimens.getDP_12(), dimens.getDP_14());
        appCompatTextView.setLayoutParams(bVar3);
        Context context2 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context2, R$style.Text_SemiBold);
        appCompatTextView.setText(tutorialScreenModel.getScreenInfoModel().getSkipButtonText());
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(rootView.getContext(), R$color.onboarding_skip_btn_text_color));
        appCompatTextView.setTextSize(2, 16.0f);
        appCompatTextView.setLineSpacing(0.0f, 1.2f);
        appCompatTextView.setLetterSpacing(0.0f);
        Context context3 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        appCompatTextView.setBackground(createOvalBackground(context3));
        constraintLayout.addView(imageView);
        constraintLayout.addView(imageView2);
        constraintLayout.addView(tooltipView);
        constraintLayout.addView(appCompatTextView);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        int id2 = imageView.getId();
        int i11 = positionAndSize.top;
        Context context4 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        dVar.t(id2, 3, 0, 3, i11 - ResourceExtKt.getStatusBarHeight(context4));
        dVar.t(imageView.getId(), 6, 0, 6, positionAndSize.left);
        int id3 = imageView2.getId();
        int i12 = positionAndSize2.top;
        Context context5 = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        dVar.t(id3, 3, 0, 3, i12 - ResourceExtKt.getStatusBarHeight(context5));
        dVar.t(imageView2.getId(), 6, 0, 6, positionAndSize2.left);
        dVar.t(tooltipView.getId(), 4, (positionAndSize.top > positionAndSize2.top ? imageView2 : imageView).getId(), 3, dimens.getDP_8());
        dVar.t(appCompatTextView.getId(), 3, 0, 3, dimens.getDP_8());
        dVar.t(appCompatTextView.getId(), 7, 0, 7, dimens.getDP_12());
        dVar.f(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        AnimationsKt.fadeInWithCallback$default(constraintLayout, 0L, new FourthEndScreen$show$1(appCompatTextView, imageView, imageView2, this, tokenizedAnalytics, tutorialScreenModel, constraintLayout, rootView, onNext), 1, null);
        t routeScreenViewEvent = tutorialScreenModel.getScreenInfoModel().getRouteScreenViewEvent();
        if (routeScreenViewEvent != null) {
            m.c(tokenizedAnalytics, routeScreenViewEvent, null);
        }
        fitsSystemWindow(constraintLayout);
    }
}
