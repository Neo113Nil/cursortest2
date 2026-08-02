package com.vk.push.pushsdk.work;

import android.content.Context;
import android.os.Bundle;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b560;
import xsna.b6l;
import xsna.bpn0;
import xsna.e5w0;
import xsna.gzs;
import xsna.j5g;
import xsna.lhg;
import xsna.mqi;
import xsna.nj10;
import xsna.p6j;
import xsna.qxi;
import xsna.spj;
import xsna.wj80;
import xsna.xvj;
import xsna.ycx;
import xsna.zhy0;
import xsna.zjq;

/* compiled from: InitiateMasterElectionsWorker.kt */
/* loaded from: classes5.dex */
public final class InitiateMasterElectionsWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: InitiateMasterElectionsWorker.kt */
    public static final class a implements wj80 {

        /* compiled from: InitiateMasterElectionsWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.InitiateMasterElectionsWorker$a$a, reason: collision with other inner class name */
        public static final class C1738a extends Lambda implements gzs<c.a> {
            public static final C1738a i = new C1738a(0);

            @Override // xsna.gzs
            public final c.a invoke() {
                return new c.a(InitiateMasterElectionsWorker.class);
            }
        }

        @Override // xsna.wj80
        public final androidx.work.c a(WorkModel workModel, boolean z) {
            c.a d = zjq.d(z, C1738a.i);
            mqi mqiVar = mqi.k;
            Data.a aVar = new Data.a();
            aVar.d("WORK_NAME_KEY", "VKPNS_InitiateMasterElectionsWorker");
            mqiVar.getClass();
            d.h(aVar.a());
            b560 b560Var = new b560(null);
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Bundle params = workModel.getParams();
            if (params != null ? params.getBoolean("use_google_connection_check") : false) {
                networkType = NetworkType.CONNECTED;
                b560Var = new b560(null);
            }
            c.a f = d.f(new p6j(b560Var, networkType, false, false, false, false, -1L, -1L, j5g.S0(linkedHashSet)));
            Bundle params2 = workModel.getParams();
            return ((c.a) f.g(params2 != null ? params2.getLong("initial_delay_millis") : 0L, TimeUnit.MILLISECONDS).e(BackoffPolicy.LINEAR, 10000L)).b();
        }
    }

    /* compiled from: InitiateMasterElectionsWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(a.i);
        public final bpn0 b = new bpn0(C1739b.i);

        /* compiled from: InitiateMasterElectionsWorker.kt */
        public static final class a extends Lambda implements gzs<Logger> {
            public static final a i = new a(0);

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger("IMEWorker");
            }
        }

        /* compiled from: InitiateMasterElectionsWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.InitiateMasterElectionsWorker$b$b, reason: collision with other inner class name */
        public static final class C1739b extends Lambda implements gzs<nj10> {
            public static final C1739b i = new C1739b(0);

            @Override // xsna.gzs
            public final nj10 invoke() {
                Logger logger = ycx.a;
                return ycx.a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            d dVar;
            int i2;
            Object c;
            b bVar;
            if (continuationImpl instanceof d) {
                dVar = (d) continuationImpl;
                int i3 = dVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = dVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = dVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.RETRY;
                        }
                        bpn0 bpn0Var = this.a;
                        Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), lhg.a(i, "InitiateMasterElectionsWorker start work, runAttemptCount = "), null, 2, null);
                        if (i >= 10) {
                            Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), "Max attempt count is reached, finish worker", null, 2, null);
                            return WorkResult.SUCESSS;
                        }
                        nj10 nj10Var = (nj10) this.b.getValue();
                        dVar.L$0 = this;
                        dVar.label = 1;
                        c = nj10Var.c(null, dVar);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) dVar.L$0;
                        kotlin.a.a(obj);
                        c = ((Result) obj).d();
                    }
                    boolean z = c instanceof Result.Failure;
                    Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), zhy0.a("Initiate master elections isSuccessful = ", !z), null, 2, null);
                    return z ? WorkResult.SUCESSS : WorkResult.RETRY;
                }
            }
            dVar = new d(this, continuationImpl);
            Object obj2 = dVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = dVar.label;
            if (i2 != 0) {
            }
            boolean z2 = c instanceof Result.Failure;
            Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), zhy0.a("Initiate master elections isSuccessful = ", !z2), null, 2, null);
            if (z2) {
            }
        }
    }

    /* compiled from: InitiateMasterElectionsWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.InitiateMasterElectionsWorker", f = "InitiateMasterElectionsWorker.kt", l = {32}, m = "doWork")
    public static final class c extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public c(spj<? super c> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitiateMasterElectionsWorker.this.doWork(this);
        }
    }

    public InitiateMasterElectionsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(spj<? super b.a> spjVar) {
        c cVar;
        int i;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b bVar = new b();
                    int runAttemptCount = getRunAttemptCount();
                    Data inputData = getInputData();
                    cVar.label = 1;
                    obj = bVar.a(runAttemptCount, inputData, cVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((WorkResult) obj).toListenableWorkerResult();
            }
        }
        cVar = new c(spjVar);
        Object obj3 = cVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        return ((WorkResult) obj3).toListenableWorkerResult();
    }
}
