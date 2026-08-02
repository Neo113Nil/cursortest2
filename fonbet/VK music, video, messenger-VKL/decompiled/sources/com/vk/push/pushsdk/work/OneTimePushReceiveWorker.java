package com.vk.push.pushsdk.work;

import android.content.Context;
import android.os.Bundle;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.d;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.receiver.OneTimePushReceiveHelper;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b560;
import xsna.b6l;
import xsna.bke0;
import xsna.bpn0;
import xsna.e5w0;
import xsna.g9i;
import xsna.gzs;
import xsna.j5g;
import xsna.mwk;
import xsna.nhe0;
import xsna.p6j;
import xsna.px90;
import xsna.qxi;
import xsna.rsr;
import xsna.ske0;
import xsna.spj;
import xsna.vj10;
import xsna.wzs;
import xsna.xvj;
import xsna.zjq;

/* compiled from: OneTimePushReceiveWorker.kt */
/* loaded from: classes5.dex */
public final class OneTimePushReceiveWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: OneTimePushReceiveWorker.kt */
    public static final class a implements px90 {

        /* compiled from: OneTimePushReceiveWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.OneTimePushReceiveWorker$a$a, reason: collision with other inner class name */
        public static final class C1742a extends Lambda implements wzs<Long, TimeUnit, d.a> {
            public static final C1742a i = new C1742a(2);

            @Override // xsna.wzs
            public final d.a invoke(Long l, TimeUnit timeUnit) {
                return new d.a(OneTimePushReceiveWorker.class, l.longValue(), timeUnit);
            }
        }

        @Override // xsna.px90
        public final androidx.work.d a(WorkModel workModel, boolean z) {
            d.a e = zjq.e(z, 900000L, TimeUnit.MILLISECONDS, C1742a.i);
            vj10 vj10Var = vj10.k;
            Data.a aVar = new Data.a();
            aVar.d("WORK_NAME_KEY", "VKPNS_OneTimePushReceiveWorker");
            vj10Var.getClass();
            e.h(aVar.a());
            b560 b560Var = new b560(null);
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Bundle params = workModel.getParams();
            if (params != null ? params.getBoolean("use_google_connection_check") : false) {
                networkType = NetworkType.CONNECTED;
                b560Var = new b560(null);
            }
            return e.f(new p6j(b560Var, networkType, false, false, false, false, -1L, -1L, j5g.S0(linkedHashSet))).b();
        }
    }

    /* compiled from: OneTimePushReceiveWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(a.i);
        public final bpn0 b = new bpn0(C1743b.i);
        public final bpn0 c = new bpn0(c.i);

        /* compiled from: OneTimePushReceiveWorker.kt */
        public static final class a extends Lambda implements gzs<Logger> {
            public static final a i = new a(0);

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger("OneTimePushReceiveWorker");
            }
        }

        /* compiled from: OneTimePushReceiveWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.OneTimePushReceiveWorker$b$b, reason: collision with other inner class name */
        public static final class C1743b extends Lambda implements gzs<nhe0> {
            public static final C1743b i = new C1743b(0);

            @Override // xsna.gzs
            public final nhe0 invoke() {
                return g9i.a();
            }
        }

        /* compiled from: OneTimePushReceiveWorker.kt */
        public static final class c extends Lambda implements gzs<ske0> {
            public static final c i = new c(0);

            @Override // xsna.gzs
            public final ske0 invoke() {
                return mwk.c();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v5, types: [com.vk.push.pushsdk.work.OneTimePushReceiveWorker$b] */
        /* JADX WARN: Type inference failed for: r9v8, types: [com.vk.push.common.Logger] */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            f fVar;
            Object obj;
            int i2;
            b bVar;
            WorkResult workResult;
            if (continuationImpl instanceof f) {
                fVar = (f) continuationImpl;
                int i3 = fVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i3 - Integer.MIN_VALUE;
                    obj = fVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = fVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.SUCESSS;
                        }
                        Logger.DefaultImpls.info$default(b(), "Work has started", null, 2, null);
                        fVar.L$0 = this;
                        fVar.label = 1;
                        obj = c(fVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b bVar2 = (b) fVar.L$0;
                        kotlin.a.a(obj);
                        bVar = bVar2;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Logger.DefaultImpls.warn$default(bVar.b(), "No push tokens found, finish work", null, 2, null);
                        return WorkResult.SUCESSS;
                    }
                    try {
                        try {
                            new OneTimePushReceiveHelper(bke0.a(null), (nhe0) bVar.b.getValue(), bVar.b()).a();
                            workResult = WorkResult.SUCESSS;
                        } catch (Exception e) {
                            bVar.b().error("Failed to complete work", e);
                            workResult = WorkResult.FAILURE;
                        }
                        return workResult;
                    } finally {
                        Logger.DefaultImpls.info$default(bVar.b(), "Work has finished", null, 2, null);
                    }
                }
            }
            fVar = new f(this, continuationImpl);
            obj = fVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = fVar.label;
            if (i2 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }

        public final Logger b() {
            return (Logger) this.a.getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(ContinuationImpl continuationImpl) {
            g gVar;
            int i;
            if (continuationImpl instanceof g) {
                gVar = (g) continuationImpl;
                int i2 = gVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = gVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        FlowUtil$createFlow$$inlined$map$1 k = ((ske0) this.c.getValue()).k();
                        gVar.label = 1;
                        obj = rsr.n(k, gVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    return Boolean.valueOf(((Number) obj).intValue() > 0);
                }
            }
            gVar = new g(this, continuationImpl);
            Object obj2 = gVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = gVar.label;
            if (i != 0) {
            }
            return Boolean.valueOf(((Number) obj2).intValue() > 0);
        }
    }

    /* compiled from: OneTimePushReceiveWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.OneTimePushReceiveWorker", f = "OneTimePushReceiveWorker.kt", l = {36}, m = "doWork")
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
            return OneTimePushReceiveWorker.this.doWork(this);
        }
    }

    public OneTimePushReceiveWorker(Context context, WorkerParameters workerParameters) {
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
