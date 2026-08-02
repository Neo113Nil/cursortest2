package com.vk.push.pushsdk.work.scheduler;

import android.content.Context;
import android.os.Bundle;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.utils.StringExtensionsKt;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import xsna.b560;
import xsna.b6l;
import xsna.bpn0;
import xsna.c5g;
import xsna.e5w0;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.p6j;
import xsna.qle0;
import xsna.qxi;
import xsna.rl3;
import xsna.sle0;
import xsna.spj;
import xsna.tle0;
import xsna.v6g0;
import xsna.wj80;
import xsna.xvj;
import xsna.zjq;

/* compiled from: DeleteTokensFromServerWorker.kt */
/* loaded from: classes5.dex */
public final class DeleteTokensFromServerWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: DeleteTokensFromServerWorker.kt */
    public static final class a implements wj80 {

        /* compiled from: DeleteTokensFromServerWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker$a$a, reason: collision with other inner class name */
        public static final class C1748a extends Lambda implements gzs<c.a> {
            public static final C1748a i = new C1748a(0);

            @Override // xsna.gzs
            public final c.a invoke() {
                return new c.a(DeleteTokensFromServerWorker.class);
            }
        }

        /* compiled from: DeleteTokensFromServerWorker.kt */
        public static final class b extends Lambda implements izs<Data.a, Data.a> {
            final /* synthetic */ String[] $projectIdsList;
            final /* synthetic */ String[] $tokensList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String[] strArr, String[] strArr2) {
                super(1);
                this.$tokensList = strArr;
                this.$projectIdsList = strArr2;
            }

            @Override // xsna.izs
            public final Data.a invoke(Data.a aVar) {
                Data.a aVar2 = aVar;
                aVar2.a.put("push_tokens_extra", this.$tokensList);
                aVar2.a.put("project_ids_extra", this.$projectIdsList);
                return aVar2;
            }
        }

        @Override // xsna.wj80
        public final androidx.work.c a(WorkModel workModel, boolean z) {
            Bundle params = workModel.getParams();
            String[] stringArray = params != null ? params.getStringArray("tokens_list") : null;
            if (stringArray == null) {
                stringArray = new String[0];
            }
            Bundle params2 = workModel.getParams();
            String[] stringArray2 = params2 != null ? params2.getStringArray("project_ids_list") : null;
            if (stringArray2 == null) {
                stringArray2 = new String[0];
            }
            c.a d = zjq.d(z, C1748a.i);
            b bVar = new b(stringArray, stringArray2);
            Data.a aVar = new Data.a();
            aVar.d("WORK_NAME_KEY", "DeleteTokensFromServerWorker");
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
            return d.f(new p6j(b560Var, networkType, false, false, false, false, -1L, -1L, j5g.S0(linkedHashSet))).b();
        }
    }

    /* compiled from: DeleteTokensFromServerWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(new a());
        public final bpn0 b = new bpn0(C1749b.i);

        /* compiled from: DeleteTokensFromServerWorker.kt */
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

        /* compiled from: DeleteTokensFromServerWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker$b$b, reason: collision with other inner class name */
        public static final class C1749b extends Lambda implements gzs<sle0> {
            public static final C1749b i = new C1749b(0);

            @Override // xsna.gzs
            public final sle0 invoke() {
                Logger logger = v6g0.a;
                return (sle0) v6g0.n.getValue();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            com.vk.push.pushsdk.work.scheduler.b bVar;
            int i2;
            b bVar2;
            if (continuationImpl instanceof com.vk.push.pushsdk.work.scheduler.b) {
                bVar = (com.vk.push.pushsdk.work.scheduler.b) continuationImpl;
                int i3 = bVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = bVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.RETRY;
                        }
                        Logger.DefaultImpls.info$default(c(), "Start deleting tokens work...", null, 2, null);
                        try {
                            bVar.L$0 = this;
                            bVar.label = 1;
                            obj = b(data, bVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar2 = this;
                        } catch (Throwable th) {
                            th = th;
                            bVar2 = this;
                            bVar2.c().info("Deleting tokens failed", th);
                            return WorkResult.RETRY;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (b) bVar.L$0;
                        try {
                            kotlin.a.a(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                bVar2.c().info("Deleting tokens failed", th);
                                return WorkResult.RETRY;
                            } finally {
                                Logger.DefaultImpls.info$default(bVar2.c(), "Work has finished", null, 2, null);
                            }
                        }
                    }
                    return (WorkResult) obj;
                }
            }
            bVar = new com.vk.push.pushsdk.work.scheduler.b(this, continuationImpl);
            Object obj2 = bVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = bVar.label;
            if (i2 != 0) {
            }
            return (WorkResult) obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x015b -> B:10:0x015e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum b(Data data, ContinuationImpl continuationImpl) {
            com.vk.push.pushsdk.work.scheduler.a aVar;
            int i;
            ?? r7;
            b bVar;
            Iterator it;
            List list;
            if (continuationImpl instanceof com.vk.push.pushsdk.work.scheduler.a) {
                aVar = (com.vk.push.pushsdk.work.scheduler.a) continuationImpl;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        String[] e = data.e("push_tokens_extra");
                        List u0 = e != null ? rl3.u0(e) : null;
                        String[] e2 = data.e("project_ids_extra");
                        List u02 = e2 != null ? rl3.u0(e2) : null;
                        List list2 = u0;
                        if (list2 == null || list2.isEmpty() || (list = u02) == null || list.isEmpty() || u0.size() != u02.size()) {
                            Logger c = c();
                            StringBuilder sb = new StringBuilder("Invalid input data. First list size: ");
                            sb.append(u0 != null ? Integer.valueOf(u0.size()) : null);
                            sb.append(", second: ");
                            sb.append(u02 != null ? Integer.valueOf(u02.size()) : null);
                            Logger.DefaultImpls.warn$default(c, sb.toString(), null, 2, null);
                            r7 = EmptyList.b;
                        } else {
                            List list3 = u0;
                            Iterator it2 = list3.iterator();
                            List list4 = u02;
                            Iterator it3 = list4.iterator();
                            r7 = new ArrayList(Math.min(c5g.u(list3, 10), c5g.u(list4, 10)));
                            while (it2.hasNext() && it3.hasNext()) {
                                r7.add(new tle0((String) it3.next(), (String) it2.next(), null));
                            }
                        }
                        if (r7.isEmpty()) {
                            Logger.DefaultImpls.warn$default(c(), "No arguments found", null, 2, null);
                            return WorkResult.SUCESSS;
                        }
                        Logger.DefaultImpls.info$default(c(), "There are " + r7.size() + " tokens to delete...", null, 2, null);
                        bVar = this;
                        it = ((Iterable) r7).iterator();
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        tle0 tle0Var = (tle0) aVar.L$2;
                        it = (Iterator) aVar.L$1;
                        bVar = (b) aVar.L$0;
                        kotlin.a.a(obj);
                        Object a2 = ((Result) obj).d();
                        if (a2 instanceof Result.Failure) {
                            Logger.DefaultImpls.info$default(bVar.c(), "Deleting token " + StringExtensionsKt.hideSensitive(tle0Var.b) + " is successful", null, 2, null);
                        } else {
                            bVar.c().warn("Deleting token " + StringExtensionsKt.hideSensitive(tle0Var.b) + " failed", Result.a(a2));
                        }
                        bVar.getClass();
                        if (Result.a(a2) instanceof IOException) {
                            Logger.DefaultImpls.warn$default(bVar.c(), "Network error detected", null, 2, null);
                            return WorkResult.RETRY;
                        }
                        if (it.hasNext()) {
                            tle0Var = (tle0) it.next();
                            qle0 qle0Var = (qle0) bVar.b.getValue();
                            String str = tle0Var.b;
                            String str2 = tle0Var.a;
                            aVar.L$0 = bVar;
                            aVar.L$1 = it;
                            aVar.L$2 = tle0Var;
                            aVar.label = 1;
                            a2 = qle0Var.a(str, str2, aVar);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (a2 instanceof Result.Failure) {
                            }
                            bVar.getClass();
                            if (Result.a(a2) instanceof IOException) {
                            }
                            if (it.hasNext()) {
                                Logger.DefaultImpls.info$default(bVar.c(), "Deleting tokens has finished", null, 2, null);
                                return WorkResult.SUCESSS;
                            }
                        }
                    }
                }
            }
            aVar = new com.vk.push.pushsdk.work.scheduler.a(this, continuationImpl);
            Object obj2 = aVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = aVar.label;
            if (i != 0) {
            }
        }

        public final Logger c() {
            return (Logger) this.a.getValue();
        }
    }

    /* compiled from: DeleteTokensFromServerWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker", f = "DeleteTokensFromServerWorker.kt", l = {40}, m = "doWork")
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
            return DeleteTokensFromServerWorker.this.doWork(this);
        }
    }

    public DeleteTokensFromServerWorker(Context context, WorkerParameters workerParameters) {
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
