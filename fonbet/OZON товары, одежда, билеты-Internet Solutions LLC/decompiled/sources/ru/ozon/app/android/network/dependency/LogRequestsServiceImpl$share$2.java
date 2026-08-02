package ru.ozon.app.android.network.dependency;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import vj.C10325b;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.network.dependency.LogRequestsServiceImpl$share$2", f = "LogRequestsServiceImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LogRequestsServiceImpl$share$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ LogRequestsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogRequestsServiceImpl$share$2(LogRequestsServiceImpl logRequestsServiceImpl, Context context, d<? super LogRequestsServiceImpl$share$2> dVar) {
        super(2, dVar);
        this.this$0 = logRequestsServiceImpl;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LogRequestsServiceImpl$share$2(this.this$0, this.$context, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.this$0.isOzonHarLoggerFlagEnabled()) {
            return Unit.f71690a;
        }
        Uri a11 = C10325b.a.a();
        t.a aVar2 = new t.a(this.$context);
        aVar2.g(this.$context.getContentResolver().getType(a11));
        aVar2.e(a11);
        aVar2.d("HTTP request logs");
        aVar2.h();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LogRequestsServiceImpl$share$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
