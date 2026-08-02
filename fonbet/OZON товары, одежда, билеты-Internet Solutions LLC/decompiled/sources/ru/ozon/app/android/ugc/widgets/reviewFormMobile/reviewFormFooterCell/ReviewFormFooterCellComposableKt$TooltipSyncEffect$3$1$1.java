package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import ru.ozon.fintech.ui.input.CounterView;
import ve.EnumC10311b;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormFooterCell.ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1", f = "ReviewFormFooterCellComposable.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $duration;
    final /* synthetic */ boolean $isTooltipVisible;
    final /* synthetic */ Function0<Unit> $onTooltipClosed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1(boolean z11, int i11, Function0<Unit> function0, d<? super ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1> dVar) {
        super(2, dVar);
        this.$isTooltipVisible = z11;
        this.$duration = i11;
        this.$onTooltipClosed = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1(this.$isTooltipVisible, this.$duration, this.$onTooltipClosed, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$isTooltipVisible) {
                b.Companion companion = b.INSTANCE;
                long h11 = c.h(b.h(c.g(this.$duration, EnumC10311b.SECONDS)) + CounterView.COUNTER_MAX_DEFAULT, EnumC10311b.MILLISECONDS);
                this.label = 1;
                if (Y.c(h11, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$onTooltipClosed.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReviewFormFooterCellComposableKt$TooltipSyncEffect$3$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
