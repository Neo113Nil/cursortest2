package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import com.vk.push.common.utils.FileExtensionKt;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fvk;
import xsna.izs;
import xsna.ksr;
import xsna.nh50;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.uyc0;
import xsna.wzs;
import xsna.xyc0;

/* compiled from: DataStoreMigration.kt */
/* loaded from: classes5.dex */
public final class PreferenceDataStoreByKeyMigration<T> implements Migration<T> {
    public final String a;
    public final List<uyc0.a<?>> b;
    public final izs<Context, fvk<uyc0>> c;
    public final izs<uyc0, T> d;

    /* compiled from: DataStoreMigration.kt */
    @b6l(c = "com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration", f = "DataStoreMigration.kt", l = {55, 58, 64}, m = "migrate-gIAlu-s")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PreferenceDataStoreByKeyMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = preferenceDataStoreByKeyMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object mo103migrategIAlus = this.this$0.mo103migrategIAlus(null, this);
            return mo103migrategIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? mo103migrategIAlus : new Result(mo103migrategIAlus);
        }
    }

    /* compiled from: DataStoreMigration.kt */
    @b6l(c = "com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration$migrate$2$1", f = "DataStoreMigration.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<nh50, spj<? super s3q0>, Object> {
        final /* synthetic */ PreferenceDataStoreByKeyMigration<T> $this_runCatching;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_runCatching = preferenceDataStoreByKeyMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$this_runCatching, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(nh50 nh50Var, spj<? super s3q0> spjVar) {
            return ((b) create(nh50Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            nh50 nh50Var = (nh50) this.L$0;
            for (uyc0.a aVar : this.$this_runCatching.b) {
                nh50Var.c();
                nh50Var.a.remove(aVar);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreByKeyMigration(String str, List<? extends uyc0.a<?>> list, izs<? super Context, ? extends fvk<uyc0>> izsVar, izs<? super uyc0, ? extends T> izsVar2) {
        this.a = str;
        this.b = list;
        this.c = izsVar;
        this.d = izsVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(2:14|15)(1:17)))|27|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(fvk fvkVar, spj spjVar) {
        com.vk.push.core.filedatastore.migration.a aVar;
        int i;
        if (spjVar instanceof com.vk.push.core.filedatastore.migration.a) {
            aVar = (com.vk.push.core.filedatastore.migration.a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ksr<T> data = fvkVar.getData();
                    aVar.label = 1;
                    obj = rsr.n(data, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                Serializable failure = Boolean.valueOf(!((uyc0) obj).a().keySet().isEmpty());
                return !(failure instanceof Result.Failure) ? Boolean.FALSE : failure;
            }
        }
        aVar = new com.vk.push.core.filedatastore.migration.a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        Serializable failure2 = Boolean.valueOf(!((uyc0) obj2).a().keySet().isEmpty());
        if (!(failure2 instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:33|34))(3:35|36|(1:38)(1:39))|12|(3:25|(3:28|(1:30)(1:31)|26)|32)|16|17|18|(2:20|21)(1:23)))|42|6|7|(0)(0)|12|(1:14)|25|(1:26)|32|16|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r5 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0048, B:14:0x0059, B:17:0x007c, B:25:0x0064, B:26:0x0068, B:28:0x006e, B:36:0x0038), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(fvk fvkVar, spj spjVar) {
        com.vk.push.core.filedatastore.migration.b bVar;
        int i;
        PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration;
        Set<uyc0.a<?>> keySet;
        Iterator<T> it;
        if (spjVar instanceof com.vk.push.core.filedatastore.migration.b) {
            bVar = (com.vk.push.core.filedatastore.migration.b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ksr<T> data = fvkVar.getData();
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = rsr.n(data, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    preferenceDataStoreByKeyMigration = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    preferenceDataStoreByKeyMigration = (PreferenceDataStoreByKeyMigration) bVar.L$0;
                    kotlin.a.a(obj);
                }
                keySet = ((uyc0) obj).a().keySet();
                if ((keySet instanceof Collection) || !keySet.isEmpty()) {
                    it = keySet.iterator();
                    while (it.hasNext()) {
                        if (preferenceDataStoreByKeyMigration.b.contains((uyc0.a) it.next())) {
                            break;
                        }
                    }
                }
                z = false;
                Serializable failure = Boolean.valueOf(z);
                return !(failure instanceof Result.Failure) ? Boolean.FALSE : failure;
            }
        }
        bVar = new com.vk.push.core.filedatastore.migration.b(this, spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        boolean z2 = true;
        if (i != 0) {
        }
        keySet = ((uyc0) obj2).a().keySet();
        if (keySet instanceof Collection) {
        }
        it = keySet.iterator();
        while (it.hasNext()) {
        }
        z2 = false;
        Serializable failure2 = Boolean.valueOf(z2);
        if (!(failure2 instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0034, B:14:0x00c6, B:16:0x00ce, B:23:0x0052, B:25:0x00b3, B:30:0x0064, B:32:0x008c, B:37:0x006e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.vk.push.core.filedatastore.migration.Migration
    /* renamed from: migrate-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo103migrategIAlus(Context context, spj<? super Result<? extends T>> spjVar) {
        a aVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        fvk<uyc0> fvkVar;
        PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration;
        b bVar;
        Context context2;
        Object obj;
        fvk<uyc0> fvkVar2;
        PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration2;
        Context context3;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        fvk<uyc0> invoke = this.c.invoke(context);
                        ksr<uyc0> data = invoke.getData();
                        aVar.L$0 = context;
                        aVar.L$1 = this;
                        aVar.L$2 = invoke;
                        aVar.label = 1;
                        Object n = rsr.n(data, aVar);
                        if (n == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        fvkVar = invoke;
                        obj2 = n;
                        preferenceDataStoreByKeyMigration = this;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = aVar.L$2;
                                preferenceDataStoreByKeyMigration2 = (PreferenceDataStoreByKeyMigration) aVar.L$1;
                                context3 = (Context) aVar.L$0;
                                kotlin.a.a(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    DataStoreMigrationKt.getFileToMigrate(context3, preferenceDataStoreByKeyMigration2.a).delete();
                                }
                                return obj;
                            }
                            obj = aVar.L$3;
                            fvk<uyc0> fvkVar3 = (fvk) aVar.L$2;
                            PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration3 = (PreferenceDataStoreByKeyMigration) aVar.L$1;
                            context2 = (Context) aVar.L$0;
                            kotlin.a.a(obj2);
                            fvkVar2 = fvkVar3;
                            preferenceDataStoreByKeyMigration = preferenceDataStoreByKeyMigration3;
                            aVar.L$0 = context2;
                            aVar.L$1 = preferenceDataStoreByKeyMigration;
                            aVar.L$2 = obj;
                            aVar.L$3 = null;
                            aVar.label = 3;
                            obj2 = preferenceDataStoreByKeyMigration.a(fvkVar2, aVar);
                            if (obj2 != coroutineSingletons) {
                                preferenceDataStoreByKeyMigration2 = preferenceDataStoreByKeyMigration;
                                context3 = context2;
                                if (!((Boolean) obj2).booleanValue()) {
                                }
                                return obj;
                            }
                            return coroutineSingletons;
                        }
                        fvk<uyc0> fvkVar4 = (fvk) aVar.L$2;
                        preferenceDataStoreByKeyMigration = (PreferenceDataStoreByKeyMigration) aVar.L$1;
                        Context context4 = (Context) aVar.L$0;
                        kotlin.a.a(obj2);
                        fvkVar = fvkVar4;
                        context = context4;
                    }
                    T invoke2 = preferenceDataStoreByKeyMigration.d.invoke((uyc0) obj2);
                    bVar = new b(preferenceDataStoreByKeyMigration, null);
                    aVar.L$0 = context;
                    aVar.L$1 = preferenceDataStoreByKeyMigration;
                    aVar.L$2 = fvkVar;
                    aVar.L$3 = invoke2;
                    aVar.label = 2;
                    if (fvkVar.a(new xyc0(bVar, null), aVar) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fvk<uyc0> fvkVar5 = fvkVar;
                    context2 = context;
                    obj = invoke2;
                    fvkVar2 = fvkVar5;
                    aVar.L$0 = context2;
                    aVar.L$1 = preferenceDataStoreByKeyMigration;
                    aVar.L$2 = obj;
                    aVar.L$3 = null;
                    aVar.label = 3;
                    obj2 = preferenceDataStoreByKeyMigration.a(fvkVar2, aVar);
                    if (obj2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            T invoke22 = preferenceDataStoreByKeyMigration.d.invoke((uyc0) obj2);
            bVar = new b(preferenceDataStoreByKeyMigration, null);
            aVar.L$0 = context;
            aVar.L$1 = preferenceDataStoreByKeyMigration;
            aVar.L$2 = fvkVar;
            aVar.L$3 = invoke22;
            aVar.label = 2;
            if (fvkVar.a(new xyc0(bVar, null), aVar) != coroutineSingletons) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        aVar = new a(this, spjVar);
        Object obj22 = aVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, spj<? super Boolean> spjVar) {
        return FileExtensionKt.existsSafe(DataStoreMigrationKt.getFileToMigrate(context, this.a)) ? b(this.c.invoke(context), spjVar) : Boolean.FALSE;
    }
}
