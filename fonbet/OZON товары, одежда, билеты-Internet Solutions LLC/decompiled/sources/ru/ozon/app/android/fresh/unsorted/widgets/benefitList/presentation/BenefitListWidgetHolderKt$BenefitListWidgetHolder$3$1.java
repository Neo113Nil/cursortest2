package ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation;

import Tg.b;
import WZ.l;
import a1.C4912a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListVO;
import v0.G;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv0/G;", "", "invoke", "(Lv0/G;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1 extends AbstractC7737t implements Function1<G, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ float $badgesHeight;
    final /* synthetic */ List<BenefitListVO.Badge> $elements;
    final /* synthetic */ l $tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/unsorted/widgets/benefitList/presentation/BenefitListVO$Badge;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.benefitList.presentation.BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<BenefitListVO.Badge, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(BenefitListVO.Badge it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String obj = it.getText().getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1(List<BenefitListVO.Badge> list, float f7, Function1<? super b, Unit> function1, l lVar) {
        super(1);
        this.$elements = list;
        this.$badgesHeight = f7;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(G g10) {
        invoke2(g10);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<BenefitListVO.Badge> list = this.$elements;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        float f7 = this.$badgesHeight;
        Function1<b, Unit> function1 = this.$actionHandler;
        l lVar = this.$tokenizedAnalytics;
        LazyRow.a(list.size(), anonymousClass1 != null ? new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$2(anonymousClass1, list) : null, new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$3(BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$1.INSTANCE, list), new C4912a(true, -632812321, new BenefitListWidgetHolderKt$BenefitListWidgetHolder$3$1$invoke$$inlined$items$default$4(list, f7, function1, lVar)));
    }
}
