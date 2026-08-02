package ru.ozon.tracker.sendEvent;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;
import xe.Y;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LAe/i;", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "", "<unused var>", "", "attempt", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.ExtensionKt$asSafeFlow$1", f = "Extension.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExtensionKt$asSafeFlow$1 extends j implements InterfaceC6512o<InterfaceC2397i<? super EventUpdateHandler.UpdateState>, Throwable, Long, d<? super Boolean>, Object> {
    final /* synthetic */ int $maxRetry;
    final /* synthetic */ long $retryTimeout;
    int I$0;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtensionKt$asSafeFlow$1(int i11, long j11, d<? super ExtensionKt$asSafeFlow$1> dVar) {
        super(4, dVar);
        this.$maxRetry = i11;
        this.$retryTimeout = j11;
    }

    public final Object invoke(InterfaceC2397i<? super EventUpdateHandler.UpdateState> interfaceC2397i, Throwable th2, long j11, d<? super Boolean> dVar) {
        ExtensionKt$asSafeFlow$1 extensionKt$asSafeFlow$1 = new ExtensionKt$asSafeFlow$1(this.$maxRetry, this.$retryTimeout, dVar);
        extensionKt$asSafeFlow$1.J$0 = j11;
        return extensionKt$asSafeFlow$1.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            i11 = this.J$0 < ((long) this.$maxRetry) ? 1 : 0;
            if (i11 != 0) {
                long j11 = this.$retryTimeout;
                this.I$0 = i11;
                this.label = 1;
                if (Y.c(j11, this) == aVar) {
                    return aVar;
                }
                i12 = i11;
            }
            return Boolean.valueOf(i11 != 0);
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i12 = this.I$0;
        s.b(obj);
        i11 = i12;
        return Boolean.valueOf(i11 != 0);
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC2397i<? super EventUpdateHandler.UpdateState> interfaceC2397i, Throwable th2, Long l11, d<? super Boolean> dVar) {
        return invoke(interfaceC2397i, th2, l11.longValue(), dVar);
    }
}
