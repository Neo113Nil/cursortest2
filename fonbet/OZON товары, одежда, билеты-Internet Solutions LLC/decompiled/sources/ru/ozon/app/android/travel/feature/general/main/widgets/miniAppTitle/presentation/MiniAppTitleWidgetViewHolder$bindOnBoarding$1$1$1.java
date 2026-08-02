package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.onboarding.MiniAppOnboardingInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.view.MiniAppTitleView;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1", f = "MiniAppTitleWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ MiniAppOnboardingInfoProvider $infoProvider;
    final /* synthetic */ MiniAppTitleVO.OnbordingItem $onboarding;
    final /* synthetic */ View $this_measuredView;
    int label;
    final /* synthetic */ MiniAppTitleWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ MiniAppOnboardingInfoProvider $infoProvider;
        final /* synthetic */ MiniAppTitleVO.OnbordingItem $onboarding;
        final /* synthetic */ View $this_measuredView;
        final /* synthetic */ MiniAppTitleWidgetViewHolder this$0;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C19191 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ MiniAppOnboardingInfoProvider $infoProvider;
            final /* synthetic */ String $key;
            final /* synthetic */ MiniAppTitleVO.OnbordingItem $onboarding;
            final /* synthetic */ View $this_measuredView;
            final /* synthetic */ MiniAppTitleWidgetViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19191(MiniAppTitleWidgetViewHolder miniAppTitleWidgetViewHolder, String str, MiniAppTitleVO.OnbordingItem onbordingItem, MiniAppOnboardingInfoProvider miniAppOnboardingInfoProvider, View view) {
                super(0);
                this.this$0 = miniAppTitleWidgetViewHolder;
                this.$key = str;
                this.$onboarding = onbordingItem;
                this.$infoProvider = miniAppOnboardingInfoProvider;
                this.$this_measuredView = view;
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
                MiniAppTitleView miniAppTitleView;
                onBoardingDelegate = this.this$0.onBoardingDelegate;
                if (onBoardingDelegate == null) {
                    this.this$0.initDelegate(this.$key, this.$onboarding.getOnboarding());
                }
                onBoardingDelegate2 = this.this$0.onBoardingDelegate;
                if (onBoardingDelegate2 != null) {
                    MiniAppTitleWidgetViewHolder miniAppTitleWidgetViewHolder = this.this$0;
                    MiniAppOnboardingInfoProvider miniAppOnboardingInfoProvider = this.$infoProvider;
                    miniAppTitleView = miniAppTitleWidgetViewHolder.miniAppTitleView;
                    OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, miniAppTitleWidgetViewHolder, miniAppOnboardingInfoProvider.getConfig(miniAppTitleView, this.$this_measuredView), null, 4, null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MiniAppOnboardingInfoProvider miniAppOnboardingInfoProvider, MiniAppTitleVO.OnbordingItem onbordingItem, MiniAppTitleWidgetViewHolder miniAppTitleWidgetViewHolder, View view) {
            super(1);
            this.$infoProvider = miniAppOnboardingInfoProvider;
            this.$onboarding = onbordingItem;
            this.this$0 = miniAppTitleWidgetViewHolder;
            this.$this_measuredView = view;
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
            String key = this.$infoProvider.getKey(this.$onboarding.getOnboarding());
            baseOnBoardingViewModel = this.this$0.onboardingViewModel;
            baseOnBoardingViewModel.showIfNeed(pageTag, key, new C19191(this.this$0, key, this.$onboarding, this.$infoProvider, this.$this_measuredView));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1(MiniAppTitleWidgetViewHolder miniAppTitleWidgetViewHolder, MiniAppOnboardingInfoProvider miniAppOnboardingInfoProvider, MiniAppTitleVO.OnbordingItem onbordingItem, View view, d<? super MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = miniAppTitleWidgetViewHolder;
        this.$infoProvider = miniAppOnboardingInfoProvider;
        this.$onboarding = onbordingItem;
        this.$this_measuredView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1(this.this$0, this.$infoProvider, this.$onboarding, this.$this_measuredView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean hasBottomSheetOpened;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        hasBottomSheetOpened = this.this$0.hasBottomSheetOpened();
        if (hasBottomSheetOpened) {
            return Unit.f71690a;
        }
        composerReferences = this.this$0.references;
        ComposerExtKt.withPageTag(composerReferences.getContainer(), new AnonymousClass1(this.$infoProvider, this.$onboarding, this.this$0, this.$this_measuredView));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MiniAppTitleWidgetViewHolder$bindOnBoarding$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
