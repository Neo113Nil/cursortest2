package com.vk.push.pushsdk.work;

import android.content.Context;
import android.os.Bundle;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bpn0;
import xsna.e5w0;
import xsna.gzs;
import xsna.izs;
import xsna.lhg;
import xsna.nj10;
import xsna.qxi;
import xsna.spj;
import xsna.wj80;
import xsna.xvj;
import xsna.ycx;
import xsna.zjq;

/* compiled from: NotifyOldMasterWorker.kt */
/* loaded from: classes5.dex */
public final class NotifyOldMasterWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: NotifyOldMasterWorker.kt */
    public static final class a implements wj80 {

        /* compiled from: NotifyOldMasterWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.NotifyOldMasterWorker$a$a, reason: collision with other inner class name */
        public static final class C1740a extends Lambda implements gzs<c.a> {
            public static final C1740a i = new C1740a(0);

            @Override // xsna.gzs
            public final c.a invoke() {
                return new c.a(NotifyOldMasterWorker.class);
            }
        }

        /* compiled from: NotifyOldMasterWorker.kt */
        public static final class b extends Lambda implements izs<Data.a, Data.a> {
            final /* synthetic */ String $newMasterPackage;
            final /* synthetic */ String $oldMasterPackage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, String str2) {
                super(1);
                this.$oldMasterPackage = str;
                this.$newMasterPackage = str2;
            }

            @Override // xsna.izs
            public final Data.a invoke(Data.a aVar) {
                Data.a aVar2 = aVar;
                aVar2.d("OLD_MASTER_PACKAGE_KEY", this.$oldMasterPackage);
                aVar2.a.put("NEW_MASTER_PACKAGE_KEY", this.$newMasterPackage);
                return aVar2;
            }
        }

        @Override // xsna.wj80
        public final androidx.work.c a(WorkModel workModel, boolean z) {
            Bundle params = workModel.getParams();
            String string = params != null ? params.getString("old_master_package") : null;
            Bundle params2 = workModel.getParams();
            String string2 = params2 != null ? params2.getString("new_master_package") : null;
            Bundle params3 = workModel.getParams();
            long j = params3 != null ? params3.getLong("initial_delay_millis") : 0L;
            c.a d = zjq.d(z, C1740a.i);
            b bVar = new b(string, string2);
            Data.a aVar = new Data.a();
            aVar.d("WORK_NAME_KEY", "VKPNS_NotifyOldMasterWorker");
            bVar.invoke(aVar);
            d.h(aVar.a());
            return ((c.a) d.g(j, TimeUnit.MILLISECONDS).e(BackoffPolicy.LINEAR, 10000L)).b();
        }
    }

    /* compiled from: NotifyOldMasterWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(a.i);
        public final bpn0 b = new bpn0(C1741b.i);

        /* compiled from: NotifyOldMasterWorker.kt */
        public static final class a extends Lambda implements gzs<Logger> {
            public static final a i = new a(0);

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger("NOMWorker");
            }
        }

        /* compiled from: NotifyOldMasterWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.NotifyOldMasterWorker$b$b, reason: collision with other inner class name */
        public static final class C1741b extends Lambda implements gzs<nj10> {
            public static final C1741b i = new C1741b(0);

            @Override // xsna.gzs
            public final nj10 invoke() {
                Logger logger = ycx.a;
                return ycx.a();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            e eVar;
            int i2;
            Object d;
            b bVar;
            Throwable a2;
            if (continuationImpl instanceof e) {
                eVar = (e) continuationImpl;
                int i3 = eVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = eVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.RETRY;
                        }
                        bpn0 bpn0Var = this.a;
                        Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), lhg.a(i, "Notify old master start work, runAttemptCount = "), null, 2, null);
                        if (i >= 10) {
                            Logger.DefaultImpls.info$default((Logger) bpn0Var.getValue(), "Max attempt count is reached, finish worker", null, 2, null);
                            return WorkResult.SUCESSS;
                        }
                        String d2 = data.d("OLD_MASTER_PACKAGE_KEY");
                        if (d2 == null) {
                            return WorkResult.FAILURE;
                        }
                        String d3 = data.d("NEW_MASTER_PACKAGE_KEY");
                        if (d3 == null) {
                            return WorkResult.FAILURE;
                        }
                        nj10 nj10Var = (nj10) this.b.getValue();
                        eVar.L$0 = this;
                        eVar.label = 1;
                        d = nj10Var.d(d2, d3, eVar);
                        if (d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar = this;
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) eVar.L$0;
                        kotlin.a.a(obj);
                        d = ((Result) obj).d();
                    }
                    a2 = Result.a(d);
                    if (a2 != null) {
                        return WorkResult.SUCESSS;
                    }
                    ((Logger) bVar.a.getValue()).error("Notify old master error", a2);
                    if (a2 instanceof SdkIsNotInitializedException) {
                        WorkResult.CREATOR creator = WorkResult.CREATOR;
                    }
                    return WorkResult.RETRY;
                }
            }
            eVar = new e(this, continuationImpl);
            Object obj2 = eVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = eVar.label;
            if (i2 != 0) {
            }
            a2 = Result.a(d);
            if (a2 != null) {
            }
        }
    }

    /* compiled from: NotifyOldMasterWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.NotifyOldMasterWorker", f = "NotifyOldMasterWorker.kt", l = {30}, m = "doWork")
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
            return NotifyOldMasterWorker.this.doWork(this);
        }
    }

    public NotifyOldMasterWorker(Context context, WorkerParameters workerParameters) {
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
