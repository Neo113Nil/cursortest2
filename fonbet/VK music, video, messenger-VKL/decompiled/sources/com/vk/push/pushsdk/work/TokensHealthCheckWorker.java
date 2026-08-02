package com.vk.push.pushsdk.work;

import android.content.Context;
import android.os.Bundle;
import androidx.work.CoroutineWorker;
import androidx.work.Data;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.d;
import com.vk.push.common.AppInfo;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.push.IsPushTokenExistResult;
import com.vk.push.core.utils.StringExtensionsKt;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.push.pushsdk.client.ipc.AppNotInstalledException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.b6l;
import xsna.bpn0;
import xsna.c5g;
import xsna.don0;
import xsna.e5w0;
import xsna.e790;
import xsna.epx;
import xsna.ezx0;
import xsna.gzs;
import xsna.l4;
import xsna.l6g;
import xsna.mwk;
import xsna.px90;
import xsna.qxi;
import xsna.s3q0;
import xsna.ske0;
import xsna.spj;
import xsna.sul;
import xsna.tle0;
import xsna.v6g0;
import xsna.vie0;
import xsna.wzs;
import xsna.xvj;
import xsna.ycx;
import xsna.yfq0;
import xsna.zjq;

/* compiled from: TokensHealthCheckWorker.kt */
/* loaded from: classes5.dex */
public final class TokensHealthCheckWorker extends CoroutineWorker {
    public static final a b = new a();

    /* compiled from: TokensHealthCheckWorker.kt */
    public static final class a implements px90 {

        /* compiled from: TokensHealthCheckWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.TokensHealthCheckWorker$a$a, reason: collision with other inner class name */
        public static final class C1746a extends Lambda implements wzs<Long, TimeUnit, d.a> {
            public static final C1746a i = new C1746a(2);

            @Override // xsna.wzs
            public final d.a invoke(Long l, TimeUnit timeUnit) {
                return new d.a(TokensHealthCheckWorker.class, l.longValue(), timeUnit);
            }
        }

        @Override // xsna.px90
        public final androidx.work.d a(WorkModel workModel, boolean z) {
            return zjq.e(z, 1L, TimeUnit.DAYS, C1746a.i).b();
        }
    }

    /* compiled from: TokensHealthCheckWorker.kt */
    public static final class b implements xvj {
        public final bpn0 a = new bpn0(e.i);
        public final bpn0 b = new bpn0(c.i);
        public final bpn0 c = new bpn0(d.i);
        public final bpn0 d = new bpn0(g.i);
        public final bpn0 e = new bpn0(f.i);
        public final bpn0 f = new bpn0(h.i);

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class a {
            public final Collection<tle0> a;

            public a(Collection<tle0> collection) {
                this.a = collection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return l4.h(new StringBuilder("HealthCheckResult(tokensForDelete="), this.a, ')');
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        /* renamed from: com.vk.push.pushsdk.work.TokensHealthCheckWorker$b$b, reason: collision with other inner class name */
        public static final class C1747b {
            public final tle0 a;
            public final e790 b;

            public C1747b(tle0 tle0Var, e790 e790Var) {
                this.a = tle0Var;
                this.b = e790Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1747b)) {
                    return false;
                }
                C1747b c1747b = (C1747b) obj;
                return epx.f(this.a, c1747b.a) && epx.f(this.b, c1747b.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                e790 e790Var = this.b;
                return hashCode + (e790Var == null ? 0 : e790Var.hashCode());
            }

            public final String toString() {
                return "PushTokenWithPackageInfo(token=" + this.a + ", packageInfo=" + this.b + ')';
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class c extends Lambda implements gzs<vie0> {
            public static final c i = new c(0);

            @Override // xsna.gzs
            public final vie0 invoke() {
                Logger logger = ycx.a;
                return (vie0) ycx.c.getValue();
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class d extends Lambda implements gzs<sul> {
            public static final d i = new d(0);

            @Override // xsna.gzs
            public final sul invoke() {
                return yfq0.a();
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class e extends Lambda implements gzs<Logger> {
            public static final e i = new e(0);

            @Override // xsna.gzs
            public final Logger invoke() {
                Logger defaultLogger;
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                    defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
                }
                return defaultLogger.createLogger("TokensHealthCheckWorker");
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class f extends Lambda implements gzs<ske0> {
            public static final f i = new f(0);

            @Override // xsna.gzs
            public final ske0 invoke() {
                return mwk.c();
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class g extends Lambda implements gzs<don0> {
            public static final g i = new g(0);

            @Override // xsna.gzs
            public final don0 invoke() {
                Logger logger = v6g0.a;
                return v6g0.f();
            }
        }

        /* compiled from: TokensHealthCheckWorker.kt */
        public static final class h extends Lambda implements gzs<ezx0> {
            public static final h i = new h(0);

            @Override // xsna.gzs
            public final ezx0 invoke() {
                Logger logger = v6g0.a;
                return v6g0.g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        @Override // xsna.xvj
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Enum a(int i, Data data, ContinuationImpl continuationImpl) {
            k kVar;
            int i2;
            b bVar;
            WorkResult workResult;
            if (continuationImpl instanceof k) {
                kVar = (k) continuationImpl;
                int i3 = kVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = kVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = kVar.label;
                    if (i2 != 0) {
                        kotlin.a.a(obj);
                        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
                            return WorkResult.FAILURE;
                        }
                        Logger.DefaultImpls.info$default(d(), "Start health checking work...", null, 2, null);
                        try {
                            kVar.L$0 = this;
                            kVar.label = 1;
                            obj = c(kVar);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            bVar = this;
                        } catch (Throwable th) {
                            th = th;
                            bVar = this;
                            bVar.d().info("Tokens health check failed", th);
                            workResult = WorkResult.FAILURE;
                            return workResult;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (b) kVar.L$0;
                        try {
                            kotlin.a.a(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                bVar.d().info("Tokens health check failed", th);
                                workResult = WorkResult.FAILURE;
                                return workResult;
                            } finally {
                                Logger.DefaultImpls.info$default(bVar.d(), "Work has finished", null, 2, null);
                            }
                        }
                    }
                    int intValue = ((Number) obj).intValue();
                    Logger.DefaultImpls.info$default(bVar.d(), "Tokens health check finished, deleted tokens: " + intValue, null, 2, null);
                    workResult = WorkResult.SUCESSS;
                    return workResult;
                }
            }
            kVar = new k(this, continuationImpl);
            Object obj2 = kVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = kVar.label;
            if (i2 != 0) {
            }
            int intValue2 = ((Number) obj2).intValue();
            Logger.DefaultImpls.info$default(bVar.d(), "Tokens health check finished, deleted tokens: " + intValue2, null, 2, null);
            workResult = WorkResult.SUCESSS;
            return workResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
            j jVar;
            int i;
            b bVar;
            ArrayList arrayList2;
            b bVar2;
            List list;
            Iterator it;
            if (continuationImpl instanceof j) {
                jVar = (j) continuationImpl;
                int i2 = jVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = jVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = jVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        Logger.DefaultImpls.info$default(d(), "Deleting " + arrayList.size() + " from database...", null, 2, null);
                        ske0 ske0Var = (ske0) this.e.getValue();
                        jVar.L$0 = this;
                        jVar.L$1 = arrayList;
                        jVar.label = 1;
                        obj = ske0Var.f(arrayList, jVar);
                        if (obj != coroutineSingletons) {
                            bVar = this;
                            arrayList2 = arrayList;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) jVar.L$2;
                        list = (List) jVar.L$1;
                        bVar2 = (b) jVar.L$0;
                        kotlin.a.a(obj);
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            don0 don0Var = (don0) bVar2.d.getValue();
                            jVar.L$0 = bVar2;
                            jVar.L$1 = list;
                            jVar.L$2 = it;
                            jVar.label = 2;
                            if (don0Var.a(str, jVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        Logger.DefaultImpls.info$default(bVar2.d(), list.size() + " tokens have been deleted from syn storage", null, 2, null);
                        return s3q0.a;
                    }
                    ?? r8 = (List) jVar.L$1;
                    bVar = (b) jVar.L$0;
                    kotlin.a.a(obj);
                    arrayList2 = r8;
                    Logger.DefaultImpls.info$default(bVar.d(), l6g.a(((Number) obj).intValue(), " tokens have been deleted from database"), null, 2, null);
                    bVar2 = bVar;
                    list = arrayList2;
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                    }
                    Logger.DefaultImpls.info$default(bVar2.d(), list.size() + " tokens have been deleted from syn storage", null, 2, null);
                    return s3q0.a;
                }
            }
            jVar = new j(this, continuationImpl);
            Object obj2 = jVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = jVar.label;
            if (i != 0) {
            }
            Logger.DefaultImpls.info$default(bVar.d(), l6g.a(((Number) obj2).intValue(), " tokens have been deleted from database"), null, 2, null);
            bVar2 = bVar;
            list = arrayList2;
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            Logger.DefaultImpls.info$default(bVar2.d(), list.size() + " tokens have been deleted from syn storage", null, 2, null);
            return s3q0.a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
        
            r15.L$0 = r9;
            r15.L$1 = r0;
            r15.L$2 = r5;
            r15.L$3 = r8;
            r15.label = 2;
            r2 = r9.f(r8, r10, r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
        
            if (r2 != r1) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
        
            r13 = r0;
            r0 = r15;
            r15 = r2;
            r2 = r8;
            r8 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0170, code lost:
        
            if (r9.g(r0, r15) == r1) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x014a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0111 -> B:18:0x0116). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(ContinuationImpl continuationImpl) {
            l lVar;
            int i;
            b bVar;
            Collection collection;
            Iterator it;
            Set set;
            l lVar2;
            b bVar2;
            ArrayList arrayList;
            if (continuationImpl instanceof l) {
                lVar = (l) continuationImpl;
                int i2 = lVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = lVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        lVar.L$0 = this;
                        lVar.label = 1;
                        obj = e(lVar);
                        if (obj != coroutineSingletons) {
                            bVar = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            set = (Set) lVar.L$0;
                            kotlin.a.a(obj);
                            return new Integer(set.size());
                        }
                        e790 e790Var = (e790) lVar.L$3;
                        it = (Iterator) lVar.L$2;
                        Set set2 = (Set) lVar.L$1;
                        bVar2 = (b) lVar.L$0;
                        kotlin.a.a(obj);
                        Collection<tle0> collection2 = ((a) obj).a;
                        if (!collection2.isEmpty()) {
                            Logger.DefaultImpls.info$default(bVar2.d(), "There are " + collection2.size() + " tokens for delete for app " + e790Var.b, null, 2, null);
                        }
                        set2.addAll(collection2);
                        lVar2 = lVar;
                        set = set2;
                        while (true) {
                            if (!it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                e790 e790Var2 = (e790) entry.getKey();
                                List list = (List) entry.getValue();
                                arrayList = new ArrayList(c5g.u(list, 10));
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((C1747b) it2.next()).a);
                                }
                                if (e790Var2 != null) {
                                    break;
                                }
                                set.addAll(arrayList);
                            } else {
                                if (set.isEmpty()) {
                                    Logger.DefaultImpls.info$default(bVar2.d(), "All checks are finished - there is nothing to delete", null, 2, null);
                                    return new Integer(0);
                                }
                                lVar2.L$0 = set;
                                lVar2.L$1 = null;
                                lVar2.L$2 = null;
                                lVar2.L$3 = null;
                                lVar2.label = 3;
                            }
                        }
                        return coroutineSingletons;
                    }
                    bVar = (b) lVar.L$0;
                    kotlin.a.a(obj);
                    collection = (Collection) obj;
                    if (!collection.isEmpty()) {
                        Logger.DefaultImpls.info$default(bVar.d(), "No push tokens found in database", null, 2, null);
                        return new Integer(0);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj2 : collection) {
                        e790 e790Var3 = ((C1747b) obj2).b;
                        Object obj3 = linkedHashMap.get(e790Var3);
                        if (obj3 == null) {
                            obj3 = new ArrayList();
                            linkedHashMap.put(e790Var3, obj3);
                        }
                        ((List) obj3).add(obj2);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    it = linkedHashMap.entrySet().iterator();
                    l lVar3 = lVar;
                    set = linkedHashSet;
                    lVar2 = lVar3;
                    bVar2 = bVar;
                    while (true) {
                        if (!it.hasNext()) {
                        }
                        set.addAll(arrayList);
                    }
                    return coroutineSingletons;
                }
            }
            lVar = new l(this, continuationImpl);
            Object obj4 = lVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = lVar.label;
            if (i != 0) {
            }
            collection = (Collection) obj4;
            if (!collection.isEmpty()) {
            }
        }

        public final Logger d() {
            return (Logger) this.a.getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a5 -> B:11:0x00a6). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object e(ContinuationImpl continuationImpl) {
            m mVar;
            int i;
            b bVar;
            Iterator it;
            b bVar2;
            Collection collection;
            if (continuationImpl instanceof m) {
                mVar = (m) continuationImpl;
                int i2 = mVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = mVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ske0 ske0Var = (ske0) this.e.getValue();
                        mVar.L$0 = this;
                        mVar.label = 1;
                        obj = ske0Var.n(mVar);
                        if (obj != coroutineSingletons) {
                            bVar = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        bVar = (b) mVar.L$0;
                        kotlin.a.a(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        collection = (Collection) mVar.L$4;
                        tle0 tle0Var = (tle0) mVar.L$3;
                        it = (Iterator) mVar.L$2;
                        Collection collection2 = (Collection) mVar.L$1;
                        bVar2 = (b) mVar.L$0;
                        kotlin.a.a(obj);
                        collection.add(new C1747b(tle0Var, (e790) obj));
                        collection = collection2;
                        if (!it.hasNext()) {
                            tle0Var = (tle0) it.next();
                            ske0 ske0Var2 = (ske0) bVar2.e.getValue();
                            String str = tle0Var.b;
                            mVar.L$0 = bVar2;
                            mVar.L$1 = collection;
                            mVar.L$2 = it;
                            mVar.L$3 = tle0Var;
                            mVar.L$4 = collection;
                            mVar.label = 2;
                            obj = ske0Var2.h(str, mVar);
                            if (obj != coroutineSingletons) {
                                collection2 = collection;
                                collection.add(new C1747b(tle0Var, (e790) obj));
                                collection = collection2;
                                if (!it.hasNext()) {
                                    return (List) collection;
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    it = list.iterator();
                    bVar2 = bVar;
                    collection = arrayList;
                    if (!it.hasNext()) {
                    }
                }
            }
            mVar = new m(this, continuationImpl);
            Object obj2 = mVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = mVar.label;
            if (i != 0) {
            }
            List list2 = (List) obj2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            it = list2.iterator();
            bVar2 = bVar;
            collection = arrayList2;
            if (!it.hasNext()) {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0173, code lost:
        
            if (r0.a(r1, r2) == r4) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0175, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
        
            if (r11 == r4) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
        /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ff -> B:17:0x0102). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object f(e790 e790Var, ArrayList arrayList, ContinuationImpl continuationImpl) {
            n nVar;
            b bVar;
            int i;
            Iterator it;
            List list;
            AppInfo appInfo;
            b bVar2;
            ArrayList arrayList2;
            if (continuationImpl instanceof n) {
                nVar = (n) continuationImpl;
                int i2 = nVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nVar.label = i2 - Integer.MIN_VALUE;
                    bVar = this;
                    Object obj = nVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = nVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (arrayList.isEmpty()) {
                            return new a(EmptyList.b);
                        }
                        AppInfo appInfo2 = new AppInfo(e790Var.b, e790Var.c);
                        Logger.DefaultImpls.info$default(bVar.d(), "Making health check for app " + appInfo2.getPackageName() + " and " + arrayList.size() + " tokens", null, 2, null);
                        ArrayList arrayList3 = new ArrayList();
                        it = arrayList.iterator();
                        list = arrayList3;
                        appInfo = appInfo2;
                        bVar2 = bVar;
                        arrayList2 = arrayList;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return new a(EmptyList.b);
                        }
                        tle0 tle0Var = (tle0) nVar.L$5;
                        it = (Iterator) nVar.L$4;
                        list = (List) nVar.L$3;
                        appInfo = (AppInfo) nVar.L$2;
                        ?? r11 = (Collection) nVar.L$1;
                        bVar2 = (b) nVar.L$0;
                        kotlin.a.a(obj);
                        Object d2 = ((Result) obj).d();
                        tle0 tle0Var2 = tle0Var;
                        arrayList2 = r11;
                        Object b = d2;
                        bVar2.getClass();
                        if (Result.a(b) instanceof AppNotInstalledException) {
                            Logger.DefaultImpls.info$default(bVar2.d(), "Seems app " + appInfo.getPackageName() + " is not installed, so all its tokens will be deleted", null, 2, null);
                            return new a(arrayList2);
                        }
                        if (Result.a(b) instanceof HostIsNotMasterException) {
                            Logger.DefaultImpls.info$default(bVar2.d(), "Seems app " + appInfo.getPackageName() + " is not master, so all its tokens will be deleted locally", null, 2, null);
                            sul sulVar = (sul) bVar2.c.getValue();
                            String packageName = appInfo.getPackageName();
                            nVar.L$0 = null;
                            nVar.L$1 = null;
                            nVar.L$2 = null;
                            nVar.L$3 = null;
                            nVar.L$4 = null;
                            nVar.L$5 = null;
                            nVar.label = 2;
                        } else {
                            if (Result.a(b) instanceof TimeoutCancellationException) {
                                Logger.DefaultImpls.info$default(bVar2.d(), "Timeout connecting to app " + appInfo.getPackageName() + ", skip health check...", null, 2, null);
                                return new a(EmptyList.b);
                            }
                            Logger.DefaultImpls.info$default(bVar2.d(), "Check token result: " + ((Object) Result.c(b)), null, 2, null);
                            if (b instanceof Result.Failure) {
                                b = null;
                            }
                            if (b == IsPushTokenExistResult.DOES_NOT_EXIST) {
                                Logger.DefaultImpls.info$default(bVar2.d(), "Token " + StringExtensionsKt.hideSensitive(tle0Var2.b) + " for " + appInfo.getPackageName() + " will be deleted", null, 2, null);
                                list.add(tle0Var2);
                            }
                            if (it.hasNext()) {
                                return new a(list);
                            }
                            tle0Var2 = (tle0) it.next();
                            Logger.DefaultImpls.info$default(bVar2.d(), "Checking is token " + StringExtensionsKt.hideSensitive(tle0Var2.b) + " known to the client...", null, 2, null);
                            vie0 vie0Var = (vie0) bVar2.b.getValue();
                            String str = tle0Var2.b;
                            nVar.L$0 = bVar2;
                            nVar.L$1 = arrayList2;
                            nVar.L$2 = appInfo;
                            nVar.L$3 = list;
                            nVar.L$4 = it;
                            nVar.L$5 = tle0Var2;
                            nVar.label = 1;
                            b = vie0Var.b(appInfo, str, nVar);
                        }
                    }
                }
            }
            bVar = this;
            nVar = new n(bVar, continuationImpl);
            Object obj2 = nVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = nVar.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x009f A[LOOP:0: B:11:0x0099->B:13:0x009f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00cd A[LOOP:1: B:16:0x00c7->B:18:0x00cd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object g(Collection collection, ContinuationImpl continuationImpl) {
            o oVar;
            int i;
            b bVar;
            Iterator it;
            Iterator it2;
            if (continuationImpl instanceof o) {
                oVar = (o) continuationImpl;
                int i2 = oVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = oVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = oVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (collection.isEmpty()) {
                            Logger.DefaultImpls.warn$default(d(), "No tokens for delete", null, 2, null);
                            return s3q0.a;
                        }
                        Collection collection2 = collection;
                        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
                        Iterator it3 = collection2.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((tle0) it3.next()).b);
                        }
                        oVar.L$0 = this;
                        oVar.L$1 = collection;
                        oVar.label = 1;
                        if (b(arrayList, oVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        collection = (Collection) oVar.L$1;
                        bVar = (b) oVar.L$0;
                        kotlin.a.a(obj);
                    }
                    bVar.getClass();
                    WorkModel.KeepExistingWork keepExistingWork = WorkModel.KeepExistingWork.YES;
                    Bundle bundle = new Bundle();
                    Collection collection3 = collection;
                    ArrayList arrayList2 = new ArrayList(c5g.u(collection3, 10));
                    it = collection3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((tle0) it.next()).b);
                    }
                    bundle.putStringArray("tokens_list", (String[]) arrayList2.toArray(new String[0]));
                    ArrayList arrayList3 = new ArrayList(c5g.u(collection3, 10));
                    it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((tle0) it2.next()).a);
                    }
                    bundle.putStringArray("project_ids_list", (String[]) arrayList3.toArray(new String[0]));
                    s3q0 s3q0Var = s3q0.a;
                    ((ezx0) bVar.f.getValue()).b(new WorkModel("DeleteTokensFromServerWorker", keepExistingWork, bundle));
                    Logger.DefaultImpls.info$default(bVar.d(), "Network tokens deletion worker has been scheduled", null, 2, null);
                    Logger.DefaultImpls.info$default(bVar.d(), "Deleting has finished", null, 2, null);
                    return s3q0.a;
                }
            }
            oVar = new o(this, continuationImpl);
            Object obj2 = oVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = oVar.label;
            if (i != 0) {
            }
            bVar.getClass();
            WorkModel.KeepExistingWork keepExistingWork2 = WorkModel.KeepExistingWork.YES;
            Bundle bundle2 = new Bundle();
            Collection collection32 = collection;
            ArrayList arrayList22 = new ArrayList(c5g.u(collection32, 10));
            it = collection32.iterator();
            while (it.hasNext()) {
            }
            bundle2.putStringArray("tokens_list", (String[]) arrayList22.toArray(new String[0]));
            ArrayList arrayList32 = new ArrayList(c5g.u(collection32, 10));
            it2 = collection32.iterator();
            while (it2.hasNext()) {
            }
            bundle2.putStringArray("project_ids_list", (String[]) arrayList32.toArray(new String[0]));
            s3q0 s3q0Var2 = s3q0.a;
            ((ezx0) bVar.f.getValue()).b(new WorkModel("DeleteTokensFromServerWorker", keepExistingWork2, bundle2));
            Logger.DefaultImpls.info$default(bVar.d(), "Network tokens deletion worker has been scheduled", null, 2, null);
            Logger.DefaultImpls.info$default(bVar.d(), "Deleting has finished", null, 2, null);
            return s3q0.a;
        }
    }

    /* compiled from: TokensHealthCheckWorker.kt */
    @b6l(c = "com.vk.push.pushsdk.work.TokensHealthCheckWorker", f = "TokensHealthCheckWorker.kt", l = {40}, m = "doWork")
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
            return TokensHealthCheckWorker.this.doWork(this);
        }
    }

    public TokensHealthCheckWorker(Context context, WorkerParameters workerParameters) {
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
