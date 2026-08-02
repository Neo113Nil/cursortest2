package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import S0.InterfaceC3967k;
import S0.Q;
import Tg.b;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import fd.InterfaceC6511n;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderVO;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4 extends AbstractC7737t implements Function1<f<ReviewFormHeaderV2VO>, Unit> {
    final /* synthetic */ ReviewFormComponent $component;
    final /* synthetic */ C7475g $widgetStorage;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormHeaderV2/ReviewFormHeaderV2VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<ReviewFormHeaderV2VO>, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ ReviewFormComponent $component;
        final /* synthetic */ C7475g $widgetStorage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7475g c7475g, ReviewFormComponent reviewFormComponent) {
            super(3);
            this.$widgetStorage = c7475g;
            this.$component = reviewFormComponent;
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(i<ReviewFormHeaderV2VO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(iVar, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(i<ReviewFormHeaderV2VO> content, InterfaceC3967k interfaceC3967k, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(content, "$this$content");
            if ((i11 & 6) == 0) {
                i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 19) == 18 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            int i13 = i12 & 14;
            Function1<b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$widgetStorage, null, null, null, interfaceC3967k, i13, 14));
            h hVar = (h) interfaceC3967k.m(b00.f.f());
            final ReviewFormComponent reviewFormComponent = this.$component;
            ReviewFormViewModel reviewFormViewModel = (ReviewFormViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2.ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$invoke$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ReviewFormViewModel formViewModel = ReviewFormComponent.this.getFormViewModel();
                    Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return formViewModel;
                }
            }).a(ReviewFormViewModel.class);
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(b00.f.c());
            l lVar = (l) interfaceC3967k.m(b00.f.e());
            Unit unit = Unit.f71690a;
            interfaceC3967k.o(-1788614072);
            boolean F11 = (i13 == 4) | interfaceC3967k.F(reviewFormViewModel);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$1$1(content, reviewFormViewModel, null);
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            Q.e(interfaceC3967k, unit, (Function2) C11);
            ReviewFormHeaderVO.SubmitOnBackConfigVO submitOnBackConfig = content.b().getSubmitOnBackConfig();
            if (submitOnBackConfig != null) {
                reviewFormViewModel.onViewIntent(new ViewIntent.ReviewHeaderInitialized(submitOnBackConfig.getSubmitAction(), submitOnBackConfig.getMinRating(), Long.valueOf(content.b().getId()), content.b().getWidgetToken(), content.b().getPageAnalyticsInfo(), submitOnBackConfig.getSubmitActionTrackingInfo()));
            }
            ReviewFormHeaderV2VO b11 = content.b();
            interfaceC3967k.o(-1788584693);
            boolean F12 = interfaceC3967k.F(lVar) | (i13 == 4) | interfaceC3967k.F(reviewFormViewModel) | interfaceC3967k.F(interfaceC7851b);
            Object C12 = interfaceC3967k.C();
            if (F12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$3$1(content, reviewFormViewModel, interfaceC7851b, lVar);
                interfaceC3967k.x(C12);
            }
            Function1 function1 = (Function1) C12;
            interfaceC3967k.k();
            interfaceC3967k.o(-1788559499);
            boolean F13 = interfaceC3967k.F(reviewFormViewModel);
            Object C13 = interfaceC3967k.C();
            if (F13 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$4$1(reviewFormViewModel);
                interfaceC3967k.x(C13);
            }
            Function1 function12 = (Function1) C13;
            interfaceC3967k.k();
            interfaceC3967k.o(-1788564081);
            boolean F14 = interfaceC3967k.F(lVar);
            Object C14 = interfaceC3967k.C();
            if (F14 || C14 == InterfaceC3967k.a.a()) {
                C14 = new ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4$1$5$1(lVar);
                interfaceC3967k.x(C14);
            }
            interfaceC3967k.k();
            ReviewFormHeaderV2ComposableKt.ReviewFormHeaderV2Composable(b11, function1, function12, (Function1) C14, m470buildHandlerimpl, null, interfaceC3967k, 0, 32);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormHeaderV2WidgetKt$reviewFormHeaderV2Widget$4(C7475g c7475g, ReviewFormComponent reviewFormComponent) {
        super(1);
        this.$widgetStorage = c7475g;
        this.$component = reviewFormComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(f<ReviewFormHeaderV2VO> fVar) {
        invoke2(fVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(f<ReviewFormHeaderV2VO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, -1391972340, new AnonymousClass1(this.$widgetStorage, this.$component)));
    }
}
