package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import xe.Y;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "LAe/i;", "", "<unused var>", "", "attempt", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1", f = "TimeoutAndActionV2AsyncWidgetViewModel.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1<T> extends j implements InterfaceC6512o<InterfaceC2397i<? super T>, Throwable, Long, d<? super Boolean>, Object> {
    /* synthetic */ long J$0;
    int label;

    TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1(d<? super TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1> dVar) {
        super(4, dVar);
    }

    public final Object invoke(InterfaceC2397i<? super T> interfaceC2397i, Throwable th2, long j11, d<? super Boolean> dVar) {
        TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1 timeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1 = new TimeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1(dVar);
        timeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1.J$0 = j11;
        return timeoutAndActionV2AsyncWidgetViewModel$retryOnErrorWithDelay$1.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        long j12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.J$0;
            if (j11 < 10) {
                this.J$0 = j11;
                this.label = 1;
                if (Y.b(15000L, this) == aVar) {
                    return aVar;
                }
                j12 = j11;
            }
            return Boolean.valueOf(j11 < 10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j12 = this.J$0;
        s.b(obj);
        j11 = j12;
        return Boolean.valueOf(j11 < 10);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l11, d<? super Boolean> dVar) {
        return invoke((InterfaceC2397i) obj, th2, l11.longValue(), dVar);
    }
}
