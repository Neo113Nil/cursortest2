package androidx.work.impl.constraints;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import Q2.AbstractC1508t;
import Q2.C1493d;
import Rh.B;
import Rh.w;
import Rh.y;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.WorkSpec;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes.dex */
public final class d implements U2.d {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f23865a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23866b;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f23867n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f23868o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C1493d f23869p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ d f23870q;

        /* renamed from: androidx.work.impl.constraints.d$a$a, reason: collision with other inner class name */
        public static final class C0422a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Function0 f23871d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0422a(Function0 function0) {
                super(0);
                this.f23871d = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m54invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m54invoke() {
                this.f23871d.invoke();
            }
        }

        public static final class b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C0 f23872d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ y f23873e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C0 c02, y yVar) {
                super(1);
                this.f23872d = c02;
                this.f23873e = yVar;
            }

            public final void a(androidx.work.impl.constraints.b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                C0.a.b(this.f23872d, null, 1, null);
                this.f23873e.h(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((androidx.work.impl.constraints.b) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class c extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f23874n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ d f23875o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ y f23876p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar, y yVar, Continuation continuation) {
                super(2, continuation);
                this.f23875o = dVar;
                this.f23876p = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f23875o, this.f23876p, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f23874n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j10 = this.f23875o.f23866b;
                    this.f23874n = 1;
                    if (AbstractC1440a0.a(j10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AbstractC1508t e10 = AbstractC1508t.e();
                str = j.f23894a;
                e10.a(str, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.f23875o.f23866b + " ms");
                this.f23876p.h(new b.C0420b(7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1493d c1493d, d dVar, Continuation continuation) {
            super(2, continuation);
            this.f23869p = c1493d;
            this.f23870q = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f23869p, this.f23870q, continuation);
            aVar.f23868o = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(y yVar, Continuation continuation) {
            return ((a) create(yVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C0 d10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f23867n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                y yVar = (y) this.f23868o;
                NetworkRequest d11 = this.f23869p.d();
                if (d11 == null) {
                    B.a.a(yVar.d(), null, 1, null);
                    return Unit.INSTANCE;
                }
                d10 = AbstractC1459k.d(yVar, null, null, new c(this.f23870q, yVar, null), 3, null);
                b bVar = new b(d10, yVar);
                C0422a c0422a = new C0422a(Build.VERSION.SDK_INT >= 30 ? h.f23881a.c(this.f23870q.f23865a, d11, bVar) : androidx.work.impl.constraints.c.f23860b.a(this.f23870q.f23865a, d11, bVar));
                this.f23867n = 1;
                if (w.a(yVar, c0422a, this) == coroutine_suspended) {
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

    public d(ConnectivityManager connManager, long j10) {
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        this.f23865a = connManager;
        this.f23866b = j10;
    }

    @Override // U2.d
    public InterfaceC5321f a(C1493d constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return AbstractC5323h.e(new a(constraints, this, null));
    }

    @Override // U2.d
    public boolean b(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (c(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // U2.d
    public boolean c(WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.constraints.d() != null;
    }

    public /* synthetic */ d(ConnectivityManager connectivityManager, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(connectivityManager, (i10 & 2) != 0 ? 1000L : j10);
    }
}
