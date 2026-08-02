package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import com.vk.push.common.utils.FileExtensionKt;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference2Impl;
import xsna.b6l;
import xsna.dyc0;
import xsna.fpf0;
import xsna.fvk;
import xsna.izs;
import xsna.ksr;
import xsna.qcy;
import xsna.rsr;
import xsna.spj;
import xsna.uyc0;
import xsna.vyc0;
import xsna.x0g0;
import xsna.zcl;
import xsna.zxc0;

/* compiled from: DataStoreMigration.kt */
/* loaded from: classes.dex */
public class PreferenceDataStoreMigration<T> implements Migration<T> {
    public static final /* synthetic */ qcy<Object>[] e;
    public final fvk<uyc0> a;
    public final String b;
    public final izs<uyc0, T> c;
    public final dyc0 d;

    /* compiled from: DataStoreMigration.kt */
    @b6l(c = "com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration", f = "DataStoreMigration.kt", l = {34}, m = "migrate-gIAlu-s$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PreferenceDataStoreMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PreferenceDataStoreMigration<T> preferenceDataStoreMigration, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = preferenceDataStoreMigration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object a = PreferenceDataStoreMigration.a(this.this$0, null, this);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
        }
    }

    /* compiled from: DataStoreMigration.kt */
    public static final class b extends Lambda implements izs<CorruptionException, uyc0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final uyc0 invoke(CorruptionException corruptionException) {
            return vyc0.a(new uyc0.b[0]);
        }
    }

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(PreferenceDataStoreMigration.class, "preferencesDataStore", "getPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        fpf0.a.getClass();
        e = new qcy[]{propertyReference2Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreMigration(fvk<uyc0> fvkVar, String str, izs<? super uyc0, ? extends T> izsVar) {
        this.a = fvkVar;
        this.b = str;
        this.c = izsVar;
        this.d = zxc0.b(str, new x0g0(b.i));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(PreferenceDataStoreMigration<T> preferenceDataStoreMigration, Context context, spj<? super Result<? extends T>> spjVar) {
        a aVar;
        int i;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        fvk<uyc0> fvkVar = preferenceDataStoreMigration.a;
                        if (fvkVar == null) {
                            fvkVar = preferenceDataStoreMigration.d.getValue(context, e[0]);
                        }
                        ksr<uyc0> data = fvkVar.getData();
                        aVar.L$0 = context;
                        aVar.L$1 = preferenceDataStoreMigration;
                        aVar.label = 1;
                        obj = rsr.n(data, aVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        preferenceDataStoreMigration = (PreferenceDataStoreMigration) aVar.L$1;
                        context = (Context) aVar.L$0;
                        kotlin.a.a(obj);
                    }
                    T invoke = preferenceDataStoreMigration.c.invoke((uyc0) obj);
                    DataStoreMigrationKt.getFileToMigrate(context, preferenceDataStoreMigration.b).delete();
                    return invoke;
                }
            }
            if (i != 0) {
            }
            T invoke2 = preferenceDataStoreMigration.c.invoke((uyc0) obj);
            DataStoreMigrationKt.getFileToMigrate(context, preferenceDataStoreMigration.b).delete();
            return invoke2;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        aVar = new a(preferenceDataStoreMigration, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    /* renamed from: migrate-gIAlu-s */
    public Object mo103migrategIAlus(Context context, spj<? super Result<? extends T>> spjVar) {
        return a(this, context, spjVar);
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, spj<? super Boolean> spjVar) {
        return Boolean.valueOf(FileExtensionKt.existsSafe(DataStoreMigrationKt.getFileToMigrate(context, this.b)));
    }

    public /* synthetic */ PreferenceDataStoreMigration(fvk fvkVar, String str, izs izsVar, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : fvkVar, str, izsVar);
    }
}
