package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1", f = "ReviewFormFooterCellComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isReady;
    final /* synthetic */ boolean $isTooltipVisible;
    final /* synthetic */ ReviewFormFooterCellVO $item;
    final /* synthetic */ Function0<Unit> $onTooltipActivated;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1(boolean z11, boolean z12, Function1<? super String, Boolean> function1, ReviewFormFooterCellVO reviewFormFooterCellVO, Function0<Unit> function0, Function1<? super String, Unit> function12, d<? super ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1> dVar) {
        super(2, dVar);
        this.$isReady = z11;
        this.$isTooltipVisible = z12;
        this.$shouldShowTooltip = function1;
        this.$item = reviewFormFooterCellVO;
        this.$onTooltipActivated = function0;
        this.$onTooltipShown = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1(this.$isReady, this.$isTooltipVisible, this.$shouldShowTooltip, this.$item, this.$onTooltipActivated, this.$onTooltipShown, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.$isReady || this.$isTooltipVisible) {
            return Unit.f71690a;
        }
        if (this.$shouldShowTooltip.invoke(this.$item.getTooltipKey()).booleanValue()) {
            this.$onTooltipActivated.invoke();
            this.$onTooltipShown.invoke(this.$item.getTooltipKey());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormFooterCellComposableKt$TooltipSyncEffect$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
