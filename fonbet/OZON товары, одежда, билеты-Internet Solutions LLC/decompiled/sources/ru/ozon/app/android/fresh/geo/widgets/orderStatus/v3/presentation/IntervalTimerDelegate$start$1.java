package ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation;

import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import ve.EnumC10311b;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.geo.widgets.orderStatus.v3.presentation.IntervalTimerDelegate$start$1", f = "IntervalTimerDelegate.kt", l = {24, TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class IntervalTimerDelegate$start$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<d<? super Unit>, Object> $onStartPeriodicJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IntervalTimerDelegate$start$1(Function1<? super d<? super Unit>, ? extends Object> function1, d<? super IntervalTimerDelegate$start$1> dVar) {
        super(2, dVar);
        this.$onStartPeriodicJob = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IntervalTimerDelegate$start$1(this.$onStartPeriodicJob, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (xe.Y.c(r4, r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r7.invoke(r6) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0037 -> B:11:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                s.b(obj);
                b.Companion companion = b.INSTANCE;
                long g10 = c.g(60, EnumC10311b.SECONDS);
                this.label = 2;
            } else if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        s.b(obj);
        Function1<d<? super Unit>, Object> function1 = this.$onStartPeriodicJob;
        this.label = 1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((IntervalTimerDelegate$start$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
