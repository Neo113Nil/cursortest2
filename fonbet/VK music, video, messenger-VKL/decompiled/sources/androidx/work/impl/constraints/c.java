package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.constraints.a;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.b6l;
import xsna.brm0;
import xsna.d560;
import xsna.eyx;
import xsna.gzs;
import xsna.haj0;
import xsna.izs;
import xsna.m100;
import xsna.myc0;
import xsna.p6j;
import xsna.phd0;
import xsna.qsl;
import xsna.s3q0;
import xsna.spj;
import xsna.suw;
import xsna.wux0;
import xsna.wzs;
import xsna.yok0;
import xsna.yvj;
import xsna.zhd0;

/* compiled from: WorkConstraintsTracker.kt */
@b6l(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class c extends SuspendLambda implements wzs<zhd0<? super androidx.work.impl.constraints.a>, spj<? super s3q0>, Object> {
    final /* synthetic */ p6j $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d560 this$0;

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ gzs<s3q0> $tryUnregister;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gzs<s3q0> gzsVar) {
            super(0);
            this.$tryUnregister = gzsVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.$tryUnregister.invoke();
            return s3q0.a;
        }
    }

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class b extends Lambda implements izs<androidx.work.impl.constraints.a, s3q0> {
        final /* synthetic */ zhd0<androidx.work.impl.constraints.a> $$this$callbackFlow;
        final /* synthetic */ eyx $timeoutJob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(yok0 yok0Var, zhd0 zhd0Var) {
            super(1);
            this.$timeoutJob = yok0Var;
            this.$$this$callbackFlow = zhd0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(androidx.work.impl.constraints.a aVar) {
            this.$timeoutJob.b(null);
            this.$$this$callbackFlow.f(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: WorkConstraintsTracker.kt */
    @b6l(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {149}, m = "invokeSuspend")
    /* renamed from: androidx.work.impl.constraints.c$c, reason: collision with other inner class name */
    public static final class C0095c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ zhd0<androidx.work.impl.constraints.a> $$this$callbackFlow;
        int label;
        final /* synthetic */ d560 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0095c(d560 d560Var, zhd0<? super androidx.work.impl.constraints.a> zhd0Var, spj<? super C0095c> spjVar) {
            super(2, spjVar);
            this.this$0 = d560Var;
            this.$$this$callbackFlow = zhd0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new C0095c(this.this$0, this.$$this$callbackFlow, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((C0095c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.this$0.getClass();
                this.label = 1;
                if (qsl.b(1000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            m100 c = m100.c();
            int i2 = wux0.a;
            this.this$0.getClass();
            c.getClass();
            this.$$this$callbackFlow.f(new a.b(7));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p6j p6jVar, d560 d560Var, spj<? super c> spjVar) {
        super(2, spjVar);
        this.$constraints = p6jVar;
        this.this$0 = d560Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        c cVar = new c(this.$constraints, this.this$0, spjVar);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super androidx.work.impl.constraints.a> zhd0Var, spj<? super s3q0> spjVar) {
        return ((c) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gzs suwVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            zhd0 zhd0Var = (zhd0) this.L$0;
            NetworkRequest a2 = this.$constraints.a();
            if (a2 == null) {
                zhd0Var.getChannel().B(null);
                return s3q0.a;
            }
            b bVar = new b(myc0.h(zhd0Var, null, null, new C0095c(this.this$0, zhd0Var, null), 3), zhd0Var);
            if (Build.VERSION.SDK_INT >= 30) {
                d dVar = d.a;
                ConnectivityManager connectivityManager = this.this$0.a;
                dVar.getClass();
                synchronized (d.b) {
                    try {
                        LinkedHashMap linkedHashMap = d.c;
                        boolean isEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(bVar, a2);
                        if (isEmpty) {
                            m100 c = m100.c();
                            int i2 = wux0.a;
                            c.getClass();
                            connectivityManager.registerDefaultNetworkCallback(dVar);
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                suwVar = new haj0(bVar, connectivityManager, dVar);
            } else {
                int i3 = androidx.work.impl.constraints.b.b;
                ConnectivityManager connectivityManager2 = this.this$0.a;
                androidx.work.impl.constraints.b bVar2 = new androidx.work.impl.constraints.b(bVar);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                try {
                    m100 c2 = m100.c();
                    int i4 = wux0.a;
                    c2.getClass();
                    connectivityManager2.registerNetworkCallback(a2, bVar2);
                    ref$BooleanRef.element = true;
                } catch (RuntimeException e) {
                    if (!brm0.v(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    m100 c3 = m100.c();
                    int i5 = wux0.a;
                    c3.getClass();
                    bVar.invoke(new a.b(7));
                }
                suwVar = new suw(ref$BooleanRef, connectivityManager2, bVar2);
            }
            a aVar = new a(suwVar);
            this.label = 1;
            if (phd0.a(zhd0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
