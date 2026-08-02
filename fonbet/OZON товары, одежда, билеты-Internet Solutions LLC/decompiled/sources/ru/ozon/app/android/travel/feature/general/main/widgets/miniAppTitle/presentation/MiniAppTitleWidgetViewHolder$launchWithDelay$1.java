package ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.miniAppTitle.presentation.MiniAppTitleWidgetViewHolder$launchWithDelay$1", f = "MiniAppTitleWidgetViewHolder.kt", l = {110, 111}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MiniAppTitleWidgetViewHolder$launchWithDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function2<M, d<? super Unit>, Object> $block;
    final /* synthetic */ long $delay;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MiniAppTitleWidgetViewHolder$launchWithDelay$1(long j11, Function2<? super M, ? super d<? super Unit>, ? extends Object> function2, d<? super MiniAppTitleWidgetViewHolder$launchWithDelay$1> dVar) {
        super(2, dVar);
        this.$delay = j11;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MiniAppTitleWidgetViewHolder$launchWithDelay$1 miniAppTitleWidgetViewHolder$launchWithDelay$1 = new MiniAppTitleWidgetViewHolder$launchWithDelay$1(this.$delay, this.$block, dVar);
        miniAppTitleWidgetViewHolder$launchWithDelay$1.L$0 = obj;
        return miniAppTitleWidgetViewHolder$launchWithDelay$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r7.invoke(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            long j11 = this.$delay;
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        Function2<M, d<? super Unit>, Object> function2 = this.$block;
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MiniAppTitleWidgetViewHolder$launchWithDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
