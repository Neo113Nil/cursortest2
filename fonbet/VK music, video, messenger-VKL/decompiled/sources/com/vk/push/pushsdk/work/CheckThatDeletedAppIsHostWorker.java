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
import xsna.dqk0;
import xsna.e060;
import xsna.e5w0;
import xsna.gzs;
import xsna.j5g;
import xsna.p6j;
import xsna.qxi;
import xsna.spj;
import xsna.v6g0;
import xsna.wj80;
import xsna.xvj;
import xsna.yfq0;
import xsna.zjq;

/* compiled from: CheckThatDeletedAppIsHostWorker.kt */
/* loaded from: classes5.dex */
public final class CheckThatDeletedAppIsHostWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
    public static final class a implements wj80 {
        @Override // xsna.wj80
        public final androidx.work.c a(WorkModel workModel, boolean z) {
            String str;
            Bundle params = workModel.getParams();
            long j = params != null ? params.getLong("initial_delay") : 0L;
            Bundle params2 = workModel.getParams();
            if (params2 == null || (str = params2.getString("deleted_package_name")) == null) {
                str = "";
            }
            c.a d = zjq.d(z, com.vk.push.pushsdk.work.a.i);
            com.vk.push.pushsdk.work.b bVar = new com.vk.push.pushsdk.work.b(str);
            Data.a aVar = new Data.a();
            aVar.d("WORK_NAME_KEY", "VKPNS_InitiateMasterElectionsWorker");
            bVar.invoke(aVar);
            d.h(aVar.a());
            b560 b560Var = new b560(null);
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null) {
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            }
            if (vkpnsPushConfig.g) {
                networkType = NetworkType.CONNECTED;
                b560Var = new b560(null);
            }
            return ((c.a) d.f(new p6j(b560Var, networkType, false, false, false, false, -1L, -1L, j5g.S0(linkedHashSet))).g(j, TimeUnit.MILLISECONDS).e(BackoffPolicy.LINEAR, 10000L)).b();
        }
    }

    /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(new a());
        public final bpn0 b = new bpn0(new C1737b());
        public final bpn0 c = new bpn0(c.i);

        /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
        public static final class a extends Lambda implements gzs<Logger> {
            public a() {
                super(0);
            }

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                b bVar = b.this;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger(bVar);
            }
        }

        /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.CheckThatDeletedAppIsHostWorker$b$b, reason: collision with other inner class name */
        public static final class C1737b extends Lambda implements gzs<e060> {
            public C1737b() {
                super(0);
            }

            @Override // xsna.gzs
            public final e060 invoke() {
                Logger logger = yfq0.a;
                return yfq0.c((Logger) b.this.a.getValue());
            }
        }

        /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
        public static final class c extends Lambda implements gzs<dqk0> {
            public static final c i = new c(0);

            @Override // xsna.gzs
            public final dqk0 invoke() {
                Logger logger = yfq0.a;
                return new dqk0(v6g0.g());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            com.vk.push.pushsdk.work.c cVar;
            int i2;
            Object b;
            b bVar;
            if (continuationImpl instanceof com.vk.push.pushsdk.work.c) {
                cVar = (com.vk.push.pushsdk.work.c) continuationImpl;
                int i3 = cVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = cVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = cVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.RETRY;
                        }
                        bpn0 bpn0Var = this.a;
                        Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), "CheckThatDeletedAppIsHostWorker start work", null, 2, null);
                        if (i >= 10) {
                            Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), "Max attempt count is reached, finish worker", null, 2, null);
                            return WorkResult.SUCESSS;
                        }
                        String d = data.d("DELETED_APP_KEY");
                        if (d == null) {
                            return WorkResult.FAILURE;
                        }
                        e060 e060Var = (e060) this.b.getValue();
                        cVar.L$0 = this;
                        cVar.label = 1;
                        b = e060Var.b(d, cVar);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) cVar.L$0;
                        kotlin.a.a(obj);
                        b = ((Result) obj).d();
                    }
                    if (Result.a(b) == null) {
                        return WorkResult.RETRY;
                    }
                    if (((Boolean) b).booleanValue()) {
                        Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), "Schedule master elections", null, 2, null);
                        ((dqk0) bVar.c.getValue()).a(false);
                    }
                    return WorkResult.SUCESSS;
                }
            }
            cVar = new com.vk.push.pushsdk.work.c(this, continuationImpl);
            Object obj2 = cVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = cVar.label;
            if (i2 != 0) {
            }
            if (Result.a(b) == null) {
            }
        }
    }

    /* compiled from: CheckThatDeletedAppIsHostWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.CheckThatDeletedAppIsHostWorker", f = "CheckThatDeletedAppIsHostWorker.kt", l = {31}, m = "doWork")
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
            return CheckThatDeletedAppIsHostWorker.this.doWork(this);
        }
    }

    public CheckThatDeletedAppIsHostWorker(Context context, WorkerParameters workerParameters) {
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
