package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import B1.B;
import Sc.InterfaceC4008j;
import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.View;
import androidx.fragment.app.G;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
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
import ru.ozon.app.android.composer.view.layoutManager.scroll.ScrollExtKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialogCutConfig;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1", f = "ShowOnboardingComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC4008j<RecyclerView> $composerRv$delegate;
    final /* synthetic */ OnBoardingCutConfig $cutConfig;
    final /* synthetic */ G $fragmentManager;
    final /* synthetic */ J $lifecycleOwner;
    final /* synthetic */ OnBoardingDTO $onBoardingDto;
    final /* synthetic */ Function0<Unit> $onCropAreaClick;
    final /* synthetic */ C4911f $ownerContainer;
    final /* synthetic */ int $statusBarHeight;
    final /* synthetic */ B $targetCoordinates;
    final /* synthetic */ View $view;
    final /* synthetic */ BaseOnBoardingViewModel $viewModel;
    final /* synthetic */ String $widgetKey;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pageTag", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, Unit> {
        final /* synthetic */ InterfaceC4008j<RecyclerView> $composerRv$delegate;
        final /* synthetic */ B $coordinates;
        final /* synthetic */ OnBoardingCutConfig $cutConfig;
        final /* synthetic */ J $lifecycleOwner;
        final /* synthetic */ G $manager;
        final /* synthetic */ OnBoardingDTO $onBoardingDto;
        final /* synthetic */ Function0<Unit> $onCropAreaClick;
        final /* synthetic */ int $statusBarHeight;
        final /* synthetic */ View $view;
        final /* synthetic */ BaseOnBoardingViewModel $viewModel;
        final /* synthetic */ String $widgetKey;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17611 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ InterfaceC4008j<RecyclerView> $composerRv$delegate;
            final /* synthetic */ B $coordinates;
            final /* synthetic */ OnBoardingCutConfig $cutConfig;
            final /* synthetic */ J $lifecycleOwner;
            final /* synthetic */ G $manager;
            final /* synthetic */ OnBoardingDTO $onBoardingDto;
            final /* synthetic */ Function0<Unit> $onCropAreaClick;
            final /* synthetic */ String $pageTag;
            final /* synthetic */ int $statusBarHeight;
            final /* synthetic */ View $view;
            final /* synthetic */ BaseOnBoardingViewModel $viewModel;
            final /* synthetic */ String $widgetKey;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C17621 extends AbstractC7737t implements Function1<Boolean, Unit> {
                final /* synthetic */ InterfaceC4008j<RecyclerView> $composerRv$delegate;
                final /* synthetic */ String $pageTag;
                final /* synthetic */ BaseOnBoardingViewModel $viewModel;
                final /* synthetic */ String $widgetKey;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C17621(BaseOnBoardingViewModel baseOnBoardingViewModel, String str, String str2, InterfaceC4008j<? extends RecyclerView> interfaceC4008j) {
                    super(1);
                    this.$viewModel = baseOnBoardingViewModel;
                    this.$pageTag = str;
                    this.$widgetKey = str2;
                    this.$composerRv$delegate = interfaceC4008j;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.f71690a;
                }

                public final void invoke(boolean z11) {
                    RecyclerView ShowOnboardingIfNeeded$lambda$14;
                    if (z11) {
                        this.$viewModel.onPageShown(this.$pageTag);
                    }
                    this.$viewModel.onShown(this.$widgetKey, z11);
                    ShowOnboardingIfNeeded$lambda$14 = ShowOnboardingComposableKt.ShowOnboardingIfNeeded$lambda$14(this.$composerRv$delegate);
                    if (ShowOnboardingIfNeeded$lambda$14 != null) {
                        ScrollExtKt.scrollEnable(ShowOnboardingIfNeeded$lambda$14, true);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C17611(B b11, int i11, OnBoardingCutConfig onBoardingCutConfig, G g10, View view, J j11, Function0<Unit> function0, OnBoardingDTO onBoardingDTO, InterfaceC4008j<? extends RecyclerView> interfaceC4008j, BaseOnBoardingViewModel baseOnBoardingViewModel, String str, String str2) {
                super(0);
                this.$coordinates = b11;
                this.$statusBarHeight = i11;
                this.$cutConfig = onBoardingCutConfig;
                this.$manager = g10;
                this.$view = view;
                this.$lifecycleOwner = j11;
                this.$onCropAreaClick = function0;
                this.$onBoardingDto = onBoardingDTO;
                this.$composerRv$delegate = interfaceC4008j;
                this.$viewModel = baseOnBoardingViewModel;
                this.$pageTag = str;
                this.$widgetKey = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                RecyclerView ShowOnboardingIfNeeded$lambda$14;
                RecyclerView ShowOnboardingIfNeeded$lambda$142;
                OnBoardingDialogCutConfig createOnboardingValues = ShowOnboardingComposableKt.createOnboardingValues(this.$coordinates, this.$statusBarHeight, this.$cutConfig);
                if (createOnboardingValues == null) {
                    return;
                }
                ShowOnboardingIfNeeded$lambda$14 = ShowOnboardingComposableKt.ShowOnboardingIfNeeded$lambda$14(this.$composerRv$delegate);
                if (ShowOnboardingIfNeeded$lambda$14 != null) {
                    ScrollExtKt.scrollEnable(ShowOnboardingIfNeeded$lambda$14, false);
                }
                ShowOnboardingIfNeeded$lambda$142 = ShowOnboardingComposableKt.ShowOnboardingIfNeeded$lambda$14(this.$composerRv$delegate);
                if (ShowOnboardingIfNeeded$lambda$142 != null) {
                    ShowOnboardingIfNeeded$lambda$142.stopScroll();
                }
                OnBoardingDelegateExtKt.setupFragmentResultListener(this.$manager, this.$view, this.$lifecycleOwner, new C17621(this.$viewModel, this.$pageTag, this.$widgetKey, this.$composerRv$delegate), this.$onCropAreaClick);
                OnBoardingDialog.INSTANCE.newInstance(createOnboardingValues, this.$onBoardingDto).show(this.$manager, "OnBoardingDialog");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseOnBoardingViewModel baseOnBoardingViewModel, String str, B b11, int i11, OnBoardingCutConfig onBoardingCutConfig, G g10, View view, J j11, Function0<Unit> function0, OnBoardingDTO onBoardingDTO, InterfaceC4008j<? extends RecyclerView> interfaceC4008j) {
            super(1);
            this.$viewModel = baseOnBoardingViewModel;
            this.$widgetKey = str;
            this.$coordinates = b11;
            this.$statusBarHeight = i11;
            this.$cutConfig = onBoardingCutConfig;
            this.$manager = g10;
            this.$view = view;
            this.$lifecycleOwner = j11;
            this.$onCropAreaClick = function0;
            this.$onBoardingDto = onBoardingDTO;
            this.$composerRv$delegate = interfaceC4008j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String pageTag) {
            Intrinsics.checkNotNullParameter(pageTag, "pageTag");
            BaseOnBoardingViewModel baseOnBoardingViewModel = this.$viewModel;
            String str = this.$widgetKey;
            baseOnBoardingViewModel.showIfNeed(pageTag, str, new C17611(this.$coordinates, this.$statusBarHeight, this.$cutConfig, this.$manager, this.$view, this.$lifecycleOwner, this.$onCropAreaClick, this.$onBoardingDto, this.$composerRv$delegate, baseOnBoardingViewModel, pageTag, str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1(B b11, G g10, C4911f c4911f, BaseOnBoardingViewModel baseOnBoardingViewModel, String str, int i11, OnBoardingCutConfig onBoardingCutConfig, View view, J j11, Function0<Unit> function0, OnBoardingDTO onBoardingDTO, InterfaceC4008j<? extends RecyclerView> interfaceC4008j, d<? super ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1> dVar) {
        super(2, dVar);
        this.$targetCoordinates = b11;
        this.$fragmentManager = g10;
        this.$ownerContainer = c4911f;
        this.$viewModel = baseOnBoardingViewModel;
        this.$widgetKey = str;
        this.$statusBarHeight = i11;
        this.$cutConfig = onBoardingCutConfig;
        this.$view = view;
        this.$lifecycleOwner = j11;
        this.$onCropAreaClick = function0;
        this.$onBoardingDto = onBoardingDTO;
        this.$composerRv$delegate = interfaceC4008j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1(this.$targetCoordinates, this.$fragmentManager, this.$ownerContainer, this.$viewModel, this.$widgetKey, this.$statusBarHeight, this.$cutConfig, this.$view, this.$lifecycleOwner, this.$onCropAreaClick, this.$onBoardingDto, this.$composerRv$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        G g10;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        B b11 = this.$targetCoordinates;
        if (b11 != null && (g10 = this.$fragmentManager) != null) {
            ComposerExtKt.withPageTag(this.$ownerContainer, new AnonymousClass1(this.$viewModel, this.$widgetKey, b11, this.$statusBarHeight, this.$cutConfig, g10, this.$view, this.$lifecycleOwner, this.$onCropAreaClick, this.$onBoardingDto, this.$composerRv$delegate));
            return Unit.f71690a;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShowOnboardingComposableKt$ShowOnboardingIfNeeded$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
