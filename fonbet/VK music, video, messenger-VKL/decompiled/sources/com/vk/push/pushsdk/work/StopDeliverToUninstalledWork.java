package com.vk.push.pushsdk.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.d;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.e5w0;
import xsna.g790;
import xsna.g9i;
import xsna.gzs;
import xsna.mwk;
import xsna.myc0;
import xsna.nhe0;
import xsna.px90;
import xsna.qxi;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.xvj;
import xsna.zjq;

/* compiled from: StopDeliverToUninstalledWork.kt */
/* loaded from: classes5.dex */
public final class StopDeliverToUninstalledWork extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: StopDeliverToUninstalledWork.kt */
    public static final class a implements px90 {

        /* compiled from: StopDeliverToUninstalledWork.kt */
        /* renamed from: com.vk.push.pushsdk.work.StopDeliverToUninstalledWork$a$a, reason: collision with other inner class name */
        public static final class C1744a extends Lambda implements wzs<Long, TimeUnit, d.a> {
            public static final C1744a i = new C1744a(2);

            @Override // xsna.wzs
            public final d.a invoke(Long l, TimeUnit timeUnit) {
                return new d.a(StopDeliverToUninstalledWork.class, l.longValue(), timeUnit);
            }
        }

        @Override // xsna.px90
        public final androidx.work.d a(WorkModel workModel, boolean z) {
            return zjq.e(z, 1L, TimeUnit.DAYS, C1744a.i).b();
        }
    }

    /* compiled from: StopDeliverToUninstalledWork.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(a.i);
        public final bpn0 b = new bpn0(c.i);
        public final bpn0 c = new bpn0(C1745b.i);

        /* compiled from: StopDeliverToUninstalledWork.kt */
        public static final class a extends Lambda implements gzs<Logger> {
            public static final a i = new a(0);

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger("StopDeliverToUninstalled");
            }
        }

        /* compiled from: StopDeliverToUninstalledWork.kt */
        /* renamed from: com.vk.push.pushsdk.work.StopDeliverToUninstalledWork$b$b, reason: collision with other inner class name */
        public static final class C1745b extends Lambda implements gzs<g790> {
            public static final C1745b i = new C1745b(0);

            @Override // xsna.gzs
            public final g790 invoke() {
                return mwk.a();
            }
        }

        /* compiled from: StopDeliverToUninstalledWork.kt */
        public static final class c extends Lambda implements gzs<nhe0> {
            public static final c i = new c(0);

            @Override // xsna.gzs
            public final nhe0 invoke() {
                return g9i.a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            h hVar;
            int i2;
            b bVar;
            if (continuationImpl instanceof h) {
                hVar = (h) continuationImpl;
                int i3 = hVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = hVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.FAILURE;
                        }
                        try {
                            hVar.L$0 = this;
                            hVar.label = 1;
                            try {
                                bdn bdnVar = bdn.a;
                                Object k = myc0.k(wgl.c, new i(this, null), hVar);
                                if (k != coroutineSingletons) {
                                    k = s3q0.a;
                                }
                                if (k == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                bVar = this;
                            } catch (Throwable th) {
                                th = th;
                                bVar = this;
                                ((Logger) bVar.a.getValue()).info("Stop deliver to uninstalled apps failed", th);
                                return WorkResult.FAILURE;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) hVar.L$0;
                        try {
                            kotlin.a.a(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            ((Logger) bVar.a.getValue()).info("Stop deliver to uninstalled apps failed", th);
                            return WorkResult.FAILURE;
                        }
                    }
                    Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), "Stop deliver to uninstalled apps finished", null, 2, null);
                    return WorkResult.SUCESSS;
                }
            }
            hVar = new h(this, continuationImpl);
            Object obj2 = hVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = hVar.label;
            if (i2 != 0) {
            }
            Logger.DefaultImpls.info$default((Logger) bVar.a.getValue(), "Stop deliver to uninstalled apps finished", null, 2, null);
            return WorkResult.SUCESSS;
        }
    }

    /* compiled from: StopDeliverToUninstalledWork.kt */
    @b6l(c = "com.vk.push.pushsdk.work.StopDeliverToUninstalledWork", f = "StopDeliverToUninstalledWork.kt", l = {31}, m = "doWork")
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
            return StopDeliverToUninstalledWork.this.doWork(this);
        }
    }

    public StopDeliverToUninstalledWork(Context context, WorkerParameters workerParameters) {
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
