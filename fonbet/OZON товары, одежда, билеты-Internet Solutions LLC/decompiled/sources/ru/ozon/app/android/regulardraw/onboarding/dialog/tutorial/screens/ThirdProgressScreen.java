package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import Sc.InterfaceC4008j;
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
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.ViewInfoExtKt;
import ru.ozon.app.android.regulardraw.ui.tooltip.ToolTipConfig;
import ru.ozon.app.android.regulardraw.ui.tooltip.TooltipView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/ThirdProgressScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;", "<init>", "()V", "Landroid/widget/FrameLayout;", "rootView", "tutorialScreenModel", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "", "onNext", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$ThirdTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "", "prizeTopMargin$delegate", "LSc/j;", "getPrizeTopMargin", "()I", "prizeTopMargin", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThirdProgressScreen extends BaseTutorialScreen<TutorialScreenModel.ThirdTutorialScreenModel> {

    /* renamed from: prizeTopMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j prizeTopMargin = LazyUtilsKt.unsafeLazy(ThirdProgressScreen$prizeTopMargin$2.INSTANCE);

    private final int getPrizeTopMargin() {
        return ((Number) this.prizeTopMargin.getValue()).intValue();
    }

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.ThirdTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        final ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        constraintLayout.setClipChildren(false);
        View view = tutorialScreenModel.getPrizeModel().getPrizeView().invoke().get();
        if (view == null || !view.isAttachedToWindow()) {
            onNext.invoke(Boolean.TRUE, null);
            return;
        }
        View view2 = tutorialScreenModel.getProgressModel().getProgressView().invoke().get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            onNext.invoke(Boolean.TRUE, null);
            return;
        }
        final Rect positionAndSize = ViewInfoExtKt.getPositionAndSize(view);
        final Rect positionAndSize2 = ViewInfoExtKt.getPositionAndSize(view2);
        final ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(View.generateViewId());
        imageView.setImageBitmap(ViewInfoExtKt.getSnapshot(view));
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar).width = positionAndSize.width();
        ((ViewGroup.MarginLayoutParams) bVar).height = positionAndSize.height();
        imageView.setLayoutParams(bVar);
        final ImageView imageView2 = new ImageView(rootView.getContext());
        imageView2.setId(View.generateViewId());
        imageView2.setImageBitmap(ViewInfoExtKt.getSnapshot(view2));
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        ((ViewGroup.MarginLayoutParams) bVar2).width = positionAndSize2.width();
        ((ViewGroup.MarginLayoutParams) bVar2).height = positionAndSize2.height();
        imageView2.setLayoutParams(bVar2);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final TooltipView tooltipView = new TooltipView(context, 0.5f, false, false);
        tooltipView.setId(View.generateViewId());
        tooltipView.bind(new ToolTipConfig.BasicOnboarding(tutorialScreenModel.getScreenInfoModel().getTooltipText(), tutorialScreenModel.getScreenInfoModel().getTooltipImage()));
        constraintLayout.addView(imageView);
        constraintLayout.addView(imageView2);
        constraintLayout.addView(tooltipView);
        final int i11 = positionAndSize2.top - positionAndSize.top;
        androidx.constraintlayout.widget.d b11 = Cm.e.b(constraintLayout);
        b11.t(imageView.getId(), 3, 0, 3, getPrizeTopMargin());
        b11.t(imageView.getId(), 6, 0, 6, positionAndSize.left);
        b11.t(imageView2.getId(), 3, 0, 3, getPrizeTopMargin() + i11);
        b11.t(imageView2.getId(), 6, 0, 6, positionAndSize2.left);
        int id2 = tooltipView.getId();
        int id3 = imageView2.getId();
        Dimens dimens = Dimens.INSTANCE;
        b11.t(id2, 3, id3, 4, dimens.getDP_10());
        b11.f(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        AnimationsKt.fadeInWithCallback$default(constraintLayout, 0L, new ThirdProgressScreen$show$1(constraintLayout, this, rootView, onNext), 1, null);
        t progressScreenViewEvent = tutorialScreenModel.getScreenInfoModel().getProgressScreenViewEvent();
        if (progressScreenViewEvent != null) {
            m.c(tokenizedAnalytics, progressScreenViewEvent, null);
        }
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.ThirdProgressScreen$show$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view3, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view3.removeOnLayoutChangeListener(this);
                    int bottom2 = TooltipView.this.getBottom();
                    Dimens dimens2 = Dimens.INSTANCE;
                    if (dimens2.getDP_16() + bottom2 > constraintLayout.getBottom()) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.p(constraintLayout);
                        dVar.o(imageView.getId(), 3);
                        dVar.o(imageView2.getId(), 3);
                        dVar.o(TooltipView.this.getId(), 3);
                        dVar.t(TooltipView.this.getId(), 4, 0, 4, dimens2.getDP_16());
                        dVar.t(imageView2.getId(), 4, TooltipView.this.getId(), 3, dimens2.getDP_10());
                        dVar.t(imageView.getId(), 4, TooltipView.this.getId(), 3, ((positionAndSize2.height() + dimens2.getDP_10()) + i11) - positionAndSize.height());
                        imageView2.bringToFront();
                        dVar.f(constraintLayout);
                    }
                }
            };
            constraintLayout = constraintLayout;
            constraintLayout.addOnLayoutChangeListener(onLayoutChangeListener);
        } else {
            if (dimens.getDP_16() + tooltipView.getBottom() > constraintLayout.getBottom()) {
                androidx.constraintlayout.widget.d b12 = Cm.e.b(constraintLayout);
                b12.o(imageView.getId(), 3);
                b12.o(imageView2.getId(), 3);
                b12.o(tooltipView.getId(), 3);
                b12.t(tooltipView.getId(), 4, 0, 4, dimens.getDP_16());
                b12.t(imageView2.getId(), 4, tooltipView.getId(), 3, dimens.getDP_10());
                b12.t(imageView.getId(), 4, tooltipView.getId(), 3, ((positionAndSize2.height() + dimens.getDP_10()) + i11) - positionAndSize.height());
                imageView2.bringToFront();
                b12.f(constraintLayout);
            }
        }
        fitsSystemWindow(constraintLayout);
    }
}
