package ru.ozon.app.android.composer.network.cache.interceptor.cacheError;

import Sc.s;
import Wc.a;
import We.InterfaceC4865g;
import We.L;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.network.cache.interceptor.cacheError.CheckCacheStrategy$Enabled$execute$1", f = "CheckCacheStrategy.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class CheckCacheStrategy$Enabled$execute$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $cacheWriteAbortCount;
    final /* synthetic */ int $cacheWriteSuccessCount;
    final /* synthetic */ InterfaceC4865g $call;
    final /* synthetic */ CatchErrorsStrategy $catchErrorsStrategy;
    final /* synthetic */ List<Throwable> $caughtErrors;
    final /* synthetic */ L $response;
    int label;
    final /* synthetic */ CheckCacheStrategy.Enabled this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CheckCacheStrategy$Enabled$execute$1(CheckCacheStrategy.Enabled enabled, L l11, InterfaceC4865g interfaceC4865g, int i11, int i12, List<? extends Throwable> list, CatchErrorsStrategy catchErrorsStrategy, d<? super CheckCacheStrategy$Enabled$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = enabled;
        this.$response = l11;
        this.$call = interfaceC4865g;
        this.$cacheWriteAbortCount = i11;
        this.$cacheWriteSuccessCount = i12;
        this.$caughtErrors = list;
        this.$catchErrorsStrategy = catchErrorsStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CheckCacheStrategy$Enabled$execute$1(this.this$0, this.$response, this.$call, this.$cacheWriteAbortCount, this.$cacheWriteSuccessCount, this.$caughtErrors, this.$catchErrorsStrategy, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            long checkCacheDelayMillis = this.this$0.getCheckCacheDelayMillis();
            this.label = 1;
            if (Y.b(checkCacheDelayMillis, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.this$0.checkResponseInCache(this.$response, this.$call, this.$cacheWriteAbortCount, this.$cacheWriteSuccessCount, this.$caughtErrors, this.$catchErrorsStrategy);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CheckCacheStrategy$Enabled$execute$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
