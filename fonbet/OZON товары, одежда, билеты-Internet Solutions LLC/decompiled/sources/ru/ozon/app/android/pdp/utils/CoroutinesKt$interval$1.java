package ru.ozon.app.android.pdp.utils;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.Y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LAe/i;", "", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.utils.CoroutinesKt$interval$1", f = "Coroutines.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER, TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CoroutinesKt$interval$1 extends j implements Function2<InterfaceC2397i<? super Long>, d<? super Unit>, Object> {
    final /* synthetic */ long $period;
    final /* synthetic */ TimeUnit $timeUnit;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesKt$interval$1(TimeUnit timeUnit, long j11, d<? super CoroutinesKt$interval$1> dVar) {
        super(2, dVar);
        this.$timeUnit = timeUnit;
        this.$period = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CoroutinesKt$interval$1 coroutinesKt$interval$1 = new CoroutinesKt$interval$1(this.$timeUnit, this.$period, dVar);
        coroutinesKt$interval$1.L$0 = obj;
        return coroutinesKt$interval$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Long> interfaceC2397i, d<? super Unit> dVar) {
        return ((CoroutinesKt$interval$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0065 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        long millis;
        long j11;
        InterfaceC2397i interfaceC2397i2;
        Long l11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            millis = this.$timeUnit.toMillis(this.$period);
            j11 = 0;
            this.L$0 = interfaceC2397i;
            this.J$0 = j11;
            this.J$1 = millis;
            this.label = 1;
            if (Y.b(millis, this) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            millis = this.J$1;
            j11 = this.J$0;
            interfaceC2397i2 = (InterfaceC2397i) this.L$0;
            s.b(obj);
            long j12 = 1 + j11;
            l11 = new Long(j11);
            this.L$0 = interfaceC2397i2;
            this.J$0 = j12;
            this.J$1 = millis;
            this.label = 2;
            if (interfaceC2397i2.emit(l11, this) != aVar) {
            }
            return aVar;
        }
        if (i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        millis = this.J$1;
        j11 = this.J$0;
        interfaceC2397i2 = (InterfaceC2397i) this.L$0;
        s.b(obj);
        interfaceC2397i = interfaceC2397i2;
        this.L$0 = interfaceC2397i;
        this.J$0 = j11;
        this.J$1 = millis;
        this.label = 1;
        if (Y.b(millis, this) != aVar) {
            interfaceC2397i2 = interfaceC2397i;
            long j122 = 1 + j11;
            l11 = new Long(j11);
            this.L$0 = interfaceC2397i2;
            this.J$0 = j122;
            this.J$1 = millis;
            this.label = 2;
            if (interfaceC2397i2.emit(l11, this) != aVar) {
                j11 = j122;
                interfaceC2397i = interfaceC2397i2;
                this.L$0 = interfaceC2397i;
                this.J$0 = j11;
                this.J$1 = millis;
                this.label = 1;
                if (Y.b(millis, this) != aVar) {
                }
            }
        }
        return aVar;
    }
}
