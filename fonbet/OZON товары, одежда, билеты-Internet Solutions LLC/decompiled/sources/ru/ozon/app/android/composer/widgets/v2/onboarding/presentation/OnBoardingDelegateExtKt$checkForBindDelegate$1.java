package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class OnBoardingDelegateExtKt$checkForBindDelegate$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ Function0<Unit> $bindDelegate;
    final /* synthetic */ BaseOnBoardingViewModel $onboardingViewModel;
    final /* synthetic */ View $targetView;
    final /* synthetic */ String $widgetKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnBoardingDelegateExtKt$checkForBindDelegate$1(View view, BaseOnBoardingViewModel baseOnBoardingViewModel, String str, Function0<Unit> function0) {
        super(1);
        this.$targetView = view;
        this.$onboardingViewModel = baseOnBoardingViewModel;
        this.$widgetKey = str;
        this.$bindDelegate = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final String pageTag) {
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        final View view = this.$targetView;
        final BaseOnBoardingViewModel baseOnBoardingViewModel = this.$onboardingViewModel;
        final String str = this.$widgetKey;
        final Function0<Unit> function0 = this.$bindDelegate;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateExtKt$checkForBindDelegate$1$invoke$$inlined$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                baseOnBoardingViewModel.showIfNeed(pageTag, str, new OnBoardingDelegateExtKt$checkForBindDelegate$1$1$1(function0));
            }
        });
    }
}
