package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import Sc.InterfaceC4008j;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.AnimationsKt;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.utils.TapToContinueTextView;
import ru.ozon.app.android.regulardraw.utils.Dimens;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/FirstGreetingScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;", "<init>", "()V", "Landroid/widget/FrameLayout;", "rootView", "tutorialScreenModel", "LWZ/l;", "tokenizedAnalytics", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "", "onNext", "show", "(Landroid/widget/FrameLayout;Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel$FirstTutorialScreenModel;LWZ/l;Lkotlin/jvm/functions/Function2;)V", "", "textHorizontalMargin", "I", "imageTopMargin$delegate", "LSc/j;", "getImageTopMargin", "()I", "imageTopMargin", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FirstGreetingScreen extends BaseTutorialScreen<TutorialScreenModel.FirstTutorialScreenModel> {
    private final int textHorizontalMargin = Dimens.INSTANCE.getDP_45();

    /* renamed from: imageTopMargin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageTopMargin = LazyUtilsKt.unsafeLazy(FirstGreetingScreen$imageTopMargin$2.INSTANCE);

    private final int getImageTopMargin() {
        return ((Number) this.imageTopMargin.getValue()).intValue();
    }

    public void show(@NotNull FrameLayout rootView, @NotNull TutorialScreenModel.FirstTutorialScreenModel tutorialScreenModel, @NotNull l tokenizedAnalytics, @NotNull Function2<? super Boolean, ? super Function0<Unit>, Unit> onNext) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(tutorialScreenModel, "tutorialScreenModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onNext, "onNext");
        final ConstraintLayout constraintLayout = new ConstraintLayout(rootView.getContext());
        constraintLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        final ImageView imageView = new ImageView(rootView.getContext());
        imageView.setId(View.generateViewId());
        ImageViewExtKt.load$default(imageView, tutorialScreenModel.getFirstScreenModel().getImageUrl(), null, null, null, null, false, LoadPriority.HIGH, 62, null);
        imageView.setLayoutParams(new ConstraintLayout.b(0, -2));
        imageView.setAdjustViewBounds(true);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final TapToContinueTextView tapToContinueTextView = new TapToContinueTextView(context, tutorialScreenModel.getFirstScreenModel().getActionText());
        constraintLayout.addView(imageView);
        constraintLayout.addView(tapToContinueTextView);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(constraintLayout);
        dVar.t(imageView.getId(), 3, 0, 3, getImageTopMargin());
        dVar.s(imageView.getId(), 6, 0, 6);
        dVar.s(imageView.getId(), 7, 0, 7);
        dVar.t(tapToContinueTextView.getId(), 4, 0, 4, Dimens.INSTANCE.getDP_24());
        dVar.t(tapToContinueTextView.getId(), 6, 0, 6, this.textHorizontalMargin);
        dVar.t(tapToContinueTextView.getId(), 7, 0, 7, this.textHorizontalMargin);
        dVar.f(constraintLayout);
        constraintLayout.setAlpha(0.0f);
        rootView.addView(constraintLayout);
        AnimationsKt.fadeInWithCallback(constraintLayout, 500L, new FirstGreetingScreen$show$1(constraintLayout, this, rootView, onNext));
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.FirstGreetingScreen$show$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (imageView.getBottom() > tapToContinueTextView.getTop()) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.p(constraintLayout);
                        dVar2.o(imageView.getId(), 3);
                        dVar2.s(imageView.getId(), 3, 0, 3);
                        dVar2.f(constraintLayout);
                    }
                }
            });
        } else if (imageView.getBottom() > tapToContinueTextView.getTop()) {
            androidx.constraintlayout.widget.d b11 = Cm.e.b(constraintLayout);
            b11.o(imageView.getId(), 3);
            b11.s(imageView.getId(), 3, 0, 3);
            b11.f(constraintLayout);
        }
        t welcomeScreenViewEvent = tutorialScreenModel.getFirstScreenModel().getWelcomeScreenViewEvent();
        if (welcomeScreenViewEvent != null) {
            m.c(tokenizedAnalytics, welcomeScreenViewEvent, null);
        }
        fitsSystemWindow(constraintLayout);
    }
}
