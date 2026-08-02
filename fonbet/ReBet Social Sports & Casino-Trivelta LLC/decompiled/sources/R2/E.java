package R2;

import Ph.AbstractC1440a0;
import Q2.AbstractC1508t;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9932a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9933b;

    public static final class a extends SuspendLambda implements Function4 {

        /* renamed from: n, reason: collision with root package name */
        public int f9934n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f9935o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ long f9936p;

        public a(Continuation continuation) {
            super(4, continuation);
        }

        public final Object i(InterfaceC5322g interfaceC5322g, Throwable th2, long j10, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f9935o = th2;
            aVar.f9936p = j10;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((InterfaceC5322g) obj, (Throwable) obj2, ((Number) obj3).longValue(), (Continuation) obj4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9934n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.f9935o;
                long j10 = this.f9936p;
                AbstractC1508t.e().d(E.f9932a, "Cannot check for unfinished work", th2);
                long min = Math.min(j10 * 30000, E.f9933b);
                this.f9934n = 1;
                if (AbstractC1440a0.a(min, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(true);
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f9937n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ boolean f9938o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Context f9939p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Continuation continuation) {
            super(2, continuation);
            this.f9939p = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.f9939p, continuation);
            bVar.f9938o = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, Continuation continuation) {
            return ((b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9937n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Y2.A.c(this.f9939p, RescheduleReceiver.class, this.f9938o);
            return Unit.INSTANCE;
        }
    }

    static {
        String i10 = AbstractC1508t.i("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"UnfinishedWorkListener\")");
        f9932a = i10;
        f9933b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(Ph.P p10, Context appContext, androidx.work.a configuration, WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(p10, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (Y2.C.b(appContext, configuration)) {
            AbstractC5323h.C(AbstractC5323h.F(AbstractC5323h.k(AbstractC5323h.i(AbstractC5323h.H(db2.l().q(), new a(null)))), new b(appContext, null)), p10);
        }
    }
}
