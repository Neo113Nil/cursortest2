package Y2;

import Ph.AbstractC1455i;
import Ph.AbstractC1481v0;
import Ph.P;
import Q2.AbstractC1508t;
import Q2.C1498i;
import Q2.InterfaceC1499j;
import R2.f0;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.Executor;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13916a;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f13917n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f13918o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f13919p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1499j f13920q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Context f13921r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.work.c cVar, WorkSpec workSpec, InterfaceC1499j interfaceC1499j, Context context, Continuation continuation) {
            super(2, continuation);
            this.f13918o = cVar;
            this.f13919p = workSpec;
            this.f13920q = interfaceC1499j;
            this.f13921r = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f13918o, this.f13919p, this.f13920q, this.f13921r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            if (r8 == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f13917n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ta.o foregroundInfoAsync = this.f13918o.getForegroundInfoAsync();
                Intrinsics.checkNotNullExpressionValue(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                androidx.work.c cVar = this.f13918o;
                this.f13917n = 1;
                obj = f0.d(foregroundInfoAsync, cVar, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            C1498i c1498i = (C1498i) obj;
            if (c1498i == null) {
                throw new IllegalStateException("Worker was marked important (" + this.f13919p.workerClassName + ") but did not provide ForegroundInfo");
            }
            String str = H.f13916a;
            WorkSpec workSpec = this.f13919p;
            AbstractC1508t.e().a(str, "Updating notification for " + workSpec.workerClassName);
            Ta.o a10 = this.f13920q.a(this.f13921r, this.f13918o.getId(), c1498i);
            Intrinsics.checkNotNullExpressionValue(a10, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
            this.f13917n = 2;
            Object a11 = f0.e.a(a10, this);
            return a11 == coroutine_suspended ? coroutine_suspended : a11;
        }
    }

    static {
        String i10 = AbstractC1508t.i("WorkForegroundRunnable");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f13916a = i10;
    }

    public static final Object b(Context context, WorkSpec workSpec, androidx.work.c cVar, InterfaceC1499j interfaceC1499j, Z2.b bVar, Continuation continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.INSTANCE;
        }
        Executor a10 = bVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "taskExecutor.mainThreadExecutor");
        Object g10 = AbstractC1455i.g(AbstractC1481v0.b(a10), new a(cVar, workSpec, interfaceC1499j, context, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }
}
