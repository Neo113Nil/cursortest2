package androidx.work.impl.constraints;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.L;
import Ph.P;
import Ph.Q;
import Q2.AbstractC1508t;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.model.WorkSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23894a;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f23895n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ i f23896o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ WorkSpec f23897p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ f f23898q;

        /* renamed from: androidx.work.impl.constraints.j$a$a, reason: collision with other inner class name */
        public static final class C0424a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f f23899a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkSpec f23900b;

            public C0424a(f fVar, WorkSpec workSpec) {
                this.f23899a = fVar;
                this.f23900b = workSpec;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, Continuation continuation) {
                this.f23899a.e(this.f23900b, bVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, WorkSpec workSpec, f fVar, Continuation continuation) {
            super(2, continuation);
            this.f23896o = iVar;
            this.f23897p = workSpec;
            this.f23898q = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f23896o, this.f23897p, this.f23898q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f23895n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f b10 = this.f23896o.b(this.f23897p);
                C0424a c0424a = new C0424a(this.f23898q, this.f23897p);
                this.f23895n = 1;
                if (b10.collect(c0424a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        String i10 = AbstractC1508t.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f23894a = i10;
    }

    public static final d a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new d((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final C0 c(i iVar, WorkSpec spec, L dispatcher, f listener) {
        C0 d10;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        d10 = AbstractC1459k.d(Q.a(dispatcher), null, null, new a(iVar, spec, listener, null), 3, null);
        return d10;
    }
}
