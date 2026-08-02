package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.n1;
import Tg.b;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.pdp.ui.configurators.tooltip.TooltipViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3 extends AbstractC7737t implements Function1<f<ReviewFormFooterCellVO>, Unit> {
    final /* synthetic */ ReviewFormComponent $component;
    final /* synthetic */ e<Object, ReviewFormFooterCellVO> $this_reviewFormFooterCellContent;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormFooterCell/ReviewFormFooterCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<ReviewFormFooterCellVO>, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ ReviewFormComponent $component;
        final /* synthetic */ e<Object, ReviewFormFooterCellVO> $this_reviewFormFooterCellContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(e<Object, ReviewFormFooterCellVO> eVar, ReviewFormComponent reviewFormComponent) {
            super(3);
            this.$this_reviewFormFooterCellContent = eVar;
            this.$component = reviewFormComponent;
        }

        private static final boolean invoke$lambda$1(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        private static final boolean invoke$lambda$2(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(i<ReviewFormFooterCellVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(iVar, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(i<ReviewFormFooterCellVO> content, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(content, "$this$content");
            if ((i11 & 6) == 0) {
                i11 |= interfaceC3967k.n(content) ? 4 : 2;
            }
            if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            ComponentCallbacksC5392m c11 = ((C4911f) interfaceC3967k.m(b00.f.d())).c();
            String tag = c11 != null ? c11.getTag() : null;
            Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_reviewFormFooterCellContent.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14));
            h hVar = (h) interfaceC3967k.m(b00.f.f());
            final ReviewFormComponent reviewFormComponent = this.$component;
            TooltipViewModel tooltipViewModel = (TooltipViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$invoke$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    TooltipViewModel onboardingViewModel = ReviewFormComponent.this.getOnboardingViewModel();
                    Intrinsics.g(onboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return onboardingViewModel;
                }
            }).a(TooltipViewModel.class);
            InterfaceC3978p0 b11 = n1.b(tooltipViewModel.getTooltipClosed(), interfaceC3967k);
            InterfaceC3978p0 b12 = n1.b(tooltipViewModel.isTooltipVisible(), interfaceC3967k);
            ReviewFormFooterCellVO b13 = content.b();
            boolean invoke$lambda$1 = invoke$lambda$1(b11);
            boolean invoke$lambda$2 = invoke$lambda$2(b12);
            interfaceC3967k.o(667288697);
            boolean F11 = interfaceC3967k.F(tooltipViewModel) | interfaceC3967k.n(tag);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$1$1(tooltipViewModel, tag);
                interfaceC3967k.x(C11);
            }
            Function1 function1 = (Function1) C11;
            interfaceC3967k.k();
            interfaceC3967k.o(667283553);
            boolean F12 = interfaceC3967k.F(tooltipViewModel);
            Object C12 = interfaceC3967k.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$2$1(tooltipViewModel);
                interfaceC3967k.x(C12);
            }
            Function0 function0 = (Function0) C12;
            interfaceC3967k.k();
            interfaceC3967k.o(667286014);
            boolean F13 = interfaceC3967k.F(tooltipViewModel);
            Object C13 = interfaceC3967k.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$3$1(tooltipViewModel);
                interfaceC3967k.x(C13);
            }
            Function0 function02 = (Function0) C13;
            interfaceC3967k.k();
            interfaceC3967k.o(667298913);
            boolean F14 = interfaceC3967k.F(tooltipViewModel);
            Object C14 = interfaceC3967k.C();
            if (F14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3$1$4$1(tooltipViewModel);
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            ReviewFormFooterCellComposableKt.ReviewFormFooterCellComposable(b13, invoke$lambda$1, invoke$lambda$2, m470buildHandlerimpl, function1, function0, function02, (Function1) C14, interfaceC3967k, CellDTO.$stable | TooltipDTO.$stable, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormFooterCellContentKt$reviewFormFooterCellContent$3(e<Object, ReviewFormFooterCellVO> eVar, ReviewFormComponent reviewFormComponent) {
        super(1);
        this.$this_reviewFormFooterCellContent = eVar;
        this.$component = reviewFormComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(f<ReviewFormFooterCellVO> fVar) {
        invoke2(fVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(f<ReviewFormFooterCellVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, -710940664, new AnonymousClass1(this.$this_reviewFormFooterCellContent, this.$component)));
    }
}
