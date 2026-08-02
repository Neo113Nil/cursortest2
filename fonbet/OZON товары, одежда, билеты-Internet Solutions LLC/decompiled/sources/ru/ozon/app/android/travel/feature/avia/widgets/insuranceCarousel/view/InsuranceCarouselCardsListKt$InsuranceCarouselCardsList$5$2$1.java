package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselVI;
import ru.ozon.uni.atoms.af.AtomAction;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ float $maxHeight;
    final /* synthetic */ InsuranceCarouselVI $state;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI$InsuranceCarouselCardVI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<InsuranceCarouselVI.InsuranceCarouselCardVI, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(InsuranceCarouselVI.InsuranceCarouselCardVI it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getId());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1(InsuranceCarouselVI insuranceCarouselVI, float f7, Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$state = insuranceCarouselVI;
        this.$maxHeight = f7;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<InsuranceCarouselVI.InsuranceCarouselCardVI> insurances = this.$state.getInsurances();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        float f7 = this.$maxHeight;
        Function1<AtomAction, Unit> function1 = this.$actionHandler;
        LazyRow.a(insurances.size(), anonymousClass1 != null ? new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$2(anonymousClass1, insurances) : null, new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$3(InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$1.INSTANCE, insurances), new C4912a(true, -632812321, new InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$5$2$1$invoke$$inlined$items$default$4(insurances, f7, function1)));
    }
}
