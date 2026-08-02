package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import WZ.l;
import Z1.d;
import Z1.h;
import a00.C4911f;
import a1.C4912a;
import androidx.compose.ui.platform.K0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.di.ReviewFormComponent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ReviewFormRatingContentKt$reviewFormRatingContent$4 extends AbstractC7737t implements Function1<k<ReviewFormRatingVO>, Unit> {
    final /* synthetic */ ReviewFormComponent $component;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormRating/ReviewFormRatingVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$4$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ReviewFormRatingVO>, g.a, InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ ReviewFormComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReviewFormComponent reviewFormComponent) {
            super(4);
            this.$component = reviewFormComponent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$1(InterfaceC3978p0<h> interfaceC3978p0) {
            return interfaceC3978p0.getValue().d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(InterfaceC3978p0<h> interfaceC3978p0, float f7) {
            interfaceC3978p0.setValue(h.a(f7));
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(i<ReviewFormRatingVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(iVar, aVar, interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(i<ReviewFormRatingVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
            int i12;
            Intrinsics.checkNotNullParameter(content, "$this$content");
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i11 & 6) == 0) {
                i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            l lVar = (l) interfaceC3967k.m(f.e());
            C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
            d dVar = (d) interfaceC3967k.m(K0.e());
            interfaceC3967k.o(-1068142631);
            Object C11 = interfaceC3967k.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(h.a(0), D1.f25195a);
                interfaceC3967k.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k.k();
            a00.h hVar = (a00.h) interfaceC3967k.m(f.f());
            final ReviewFormComponent reviewFormComponent = this.$component;
            ReviewFormViewModel reviewFormViewModel = (ReviewFormViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormRating.ReviewFormRatingContentKt$reviewFormRatingContent$4$1$invoke$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    ReviewFormViewModel formViewModel = ReviewFormComponent.this.getFormViewModel();
                    Intrinsics.g(formViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return formViewModel;
                }
            }).a(ReviewFormViewModel.class);
            interfaceC3967k.o(-1068136976);
            Object C12 = interfaceC3967k.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$updateRating$1$1(reviewFormViewModel);
                interfaceC3967k.x(C12);
            }
            Function2 function2 = (Function2) C12;
            interfaceC3967k.k();
            Unit unit = Unit.f71690a;
            interfaceC3967k.o(-1068129081);
            int i13 = i12 & 14;
            boolean z11 = i13 == 4;
            Object C13 = interfaceC3967k.C();
            if (z11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$1$1(function2, content, null);
                interfaceC3967k.x(C13);
            }
            interfaceC3967k.k();
            Q.e(interfaceC3967k, unit, (Function2) C13);
            Boolean valueOf = Boolean.valueOf(content.b().getIsRatingFullScreen());
            interfaceC3967k.o(-1068124072);
            boolean F11 = interfaceC3967k.F(c4911f) | (i13 == 4) | interfaceC3967k.n(dVar);
            Object C14 = interfaceC3967k.C();
            if (F11 || C14 == InterfaceC3967k.a.a()) {
                Object reviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1 = new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1(c4911f, content, dVar, interfaceC3978p0, null);
                interfaceC3967k.x(reviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1);
                C14 = reviewFormRatingContentKt$reviewFormRatingContent$4$1$2$1;
            }
            interfaceC3967k.k();
            Q.e(interfaceC3967k, valueOf, (Function2) C14);
            ReviewFormRatingVO b11 = content.b();
            float invoke$lambda$1 = invoke$lambda$1(interfaceC3978p0);
            interfaceC3967k.o(-1068092550);
            boolean F12 = interfaceC3967k.F(lVar) | (i13 == 4) | interfaceC3967k.F(interfaceC7851b);
            Object C15 = interfaceC3967k.C();
            if (F12 || C15 == InterfaceC3967k.a.a()) {
                C15 = new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$3$1(content, function2, interfaceC7851b, lVar);
                interfaceC3967k.x(C15);
            }
            Function1 function1 = (Function1) C15;
            interfaceC3967k.k();
            interfaceC3967k.o(-1068073196);
            boolean F13 = interfaceC3967k.F(lVar);
            Object C16 = interfaceC3967k.C();
            if (F13 || C16 == InterfaceC3967k.a.a()) {
                C16 = new ReviewFormRatingContentKt$reviewFormRatingContent$4$1$4$1(lVar);
                interfaceC3967k.x(C16);
            }
            interfaceC3967k.k();
            ReviewFormRatingComposableKt.m1532ReviewFormRatingComposableDzVHIIc(b11, invoke$lambda$1, function1, (Function1) C16, interfaceC3967k, 0, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormRatingContentKt$reviewFormRatingContent$4(ReviewFormComponent reviewFormComponent) {
        super(1);
        this.$component = reviewFormComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(k<ReviewFormRatingVO> kVar) {
        invoke2(kVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(k<ReviewFormRatingVO> widgetSpec) {
        Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
        widgetSpec.a(new C4912a(true, 255383220, new AnonymousClass1(this.$component)));
    }
}
