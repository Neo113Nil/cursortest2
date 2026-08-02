package ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class IconButtonWidgetViewHolder$bindOnBoarding$1$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ IconButtonV3View $view;
    final /* synthetic */ OnBoardingDTO $vo;
    final /* synthetic */ IconButtonWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.presentation.IconButtonWidgetViewHolder$bindOnBoarding$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ IconButtonV3View $view;
        final /* synthetic */ OnBoardingDTO $vo;
        final /* synthetic */ IconButtonWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IconButtonWidgetViewHolder iconButtonWidgetViewHolder, OnBoardingDTO onBoardingDTO, IconButtonV3View iconButtonV3View) {
            super(0);
            this.this$0 = iconButtonWidgetViewHolder;
            this.$vo = onBoardingDTO;
            this.$view = iconButtonV3View;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBoardingDelegate onBoardingDelegate;
            OnBoardingDelegate onBoardingDelegate2;
            float f7;
            onBoardingDelegate = this.this$0.onBoardingDelegate;
            if (onBoardingDelegate == null) {
                this.this$0.initDelegate(this.$vo);
            }
            int[] iArr = new int[2];
            this.$view.getLocationOnScreen(iArr);
            Integer J11 = C7705l.J(iArr, 0);
            if (J11 != null) {
                int intValue = J11.intValue();
                onBoardingDelegate2 = this.this$0.onBoardingDelegate;
                if (onBoardingDelegate2 != null) {
                    IconButtonWidgetViewHolder iconButtonWidgetViewHolder = this.this$0;
                    Integer valueOf = Integer.valueOf(intValue - this.$view.getLeft());
                    Integer valueOf2 = Integer.valueOf(this.$view.getLeft() + (-intValue));
                    f7 = this.this$0.dpf8;
                    OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, iconButtonWidgetViewHolder, new OnBoardingCutConfig(valueOf, null, valueOf2, null, null, null, Float.valueOf(f7), false, 186, null), null, 4, null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconButtonWidgetViewHolder$bindOnBoarding$1$1(IconButtonWidgetViewHolder iconButtonWidgetViewHolder, OnBoardingDTO onBoardingDTO, IconButtonV3View iconButtonV3View) {
        super(1);
        this.this$0 = iconButtonWidgetViewHolder;
        this.$vo = onBoardingDTO;
        this.$view = iconButtonV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String pageTag) {
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        Intrinsics.checkNotNullParameter(pageTag, "pageTag");
        baseOnBoardingViewModel = this.this$0.onboardingViewModel;
        String onboardingKey = this.$vo.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "icon_button_onboarding_key";
        }
        baseOnBoardingViewModel.showIfNeed(pageTag, onboardingKey, new AnonymousClass1(this.this$0, this.$vo, this.$view));
    }
}
