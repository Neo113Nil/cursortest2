package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view;

import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;
import v0.I;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$2$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ I $listState;
    final /* synthetic */ Function1<InsuranceCarouselViewModelAction, Unit> $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$2$1(Function1<? super InsuranceCarouselViewModelAction, Unit> function1, I i11) {
        super(1);
        this.$onAction = function1;
        this.$listState = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Function1<InsuranceCarouselViewModelAction, Unit> function1 = this.$onAction;
        final I i11 = this.$listState;
        return new M() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.InsuranceCarouselCardsListKt$InsuranceCarouselCardsList$2$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                Function1.this.invoke(new InsuranceCarouselViewModelAction.OnSaveScrollState(i11.o(), i11.p()));
            }
        };
    }
}
