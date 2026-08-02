package androidx.work;

import android.content.Context;
import androidx.work.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ahz;
import xsna.b6l;
import xsna.bdn;
import xsna.epx;
import xsna.iyx;
import xsna.n7s;
import xsna.ovj;
import xsna.ozl;
import xsna.s3q0;
import xsna.spj;
import xsna.ugz;
import xsna.wzs;
import xsna.xll;
import xsna.ygz;
import xsna.yvj;

/* compiled from: CoroutineWorker.kt */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends androidx.work.b {
    private final ovj coroutineContext;
    private final WorkerParameters params;

    /* compiled from: CoroutineWorker.kt */
    /* loaded from: classes12.dex */
    public static final class a extends ovj {
        public static final a c = new a();
        public static final xll d = bdn.b;

        @Override // xsna.ovj
        public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
            d.P(dVar, runnable);
        }

        @Override // xsna.ovj
        public final boolean S(kotlin.coroutines.d dVar) {
            d.getClass();
            return !false;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @b6l(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
    /* loaded from: classes12.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super n7s>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CoroutineWorker.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super n7s> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            return foregroundInfo == coroutineSingletons ? coroutineSingletons : foregroundInfo;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @b6l(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes12.dex */
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super b.a>, Object> {
        int label;

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return CoroutineWorker.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super b.a> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            this.label = 1;
            Object doWork = coroutineWorker.doWork(this);
            return doWork == coroutineSingletons ? coroutineSingletons : doWork;
        }
    }

    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.coroutineContext = a.c;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, spj<? super n7s> spjVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(spj<? super b.a> spjVar);

    public ovj getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(spj<? super n7s> spjVar) {
        return getForegroundInfo$suspendImpl(this, spjVar);
    }

    @Override // androidx.work.b
    public final ugz<n7s> getForegroundInfoAsync() {
        return ahz.a(getCoroutineContext().plus(iyx.a()), new b(null));
    }

    @Override // androidx.work.b
    public final void onStopped() {
        super.onStopped();
    }

    public final Object setForeground(n7s n7sVar, spj<? super s3q0> spjVar) {
        Object a2 = ygz.a(setForegroundAsync(n7sVar), spjVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    public final Object setProgress(Data data, spj<? super s3q0> spjVar) {
        Object a2 = ygz.a(setProgressAsync(data), spjVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    @Override // androidx.work.b
    public final ugz<b.a> startWork() {
        return ahz.a((!epx.f(getCoroutineContext(), a.c) ? getCoroutineContext() : this.params.g).plus(iyx.a()), new c(null));
    }

    @ozl
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
