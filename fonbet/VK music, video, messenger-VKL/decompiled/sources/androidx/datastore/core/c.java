package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b6l;
import xsna.bay;
import xsna.epx;
import xsna.iuk;
import xsna.izs;
import xsna.mzw;
import xsna.rtk;
import xsna.s3q0;
import xsna.spj;
import xsna.uax;
import xsna.ui50;
import xsna.wzs;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, ApiInvocationException.ErrorCodes.PRIVACY_RESTRICTION, 546, 468}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends SuspendLambda implements izs<spj<? super rtk<Object>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;
    final /* synthetic */ DataStoreImpl<Object>.a this$1;

    /* compiled from: DataStoreImpl.kt */
    public static final class a implements mzw<Object> {
        public final /* synthetic */ ui50 a;
        public final /* synthetic */ Ref$BooleanRef b;
        public final /* synthetic */ Ref$ObjectRef<Object> c;
        public final /* synthetic */ DataStoreImpl<Object> d;

        public a(ui50 ui50Var, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<Object> ref$ObjectRef, DataStoreImpl<Object> dataStoreImpl) {
            this.a = ui50Var;
            this.b = ref$BooleanRef;
            this.c = ref$ObjectRef;
            this.d = dataStoreImpl;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00b0, B:30:0x00b8), top: B:26:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0094, B:42:0x0098, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0094, B:42:0x0098, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0094 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r10v13, types: [T] */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r8v3, types: [xsna.wzs] */
        @Override // xsna.mzw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(iuk iukVar, ContinuationImpl continuationImpl) {
            b bVar;
            int i;
            ui50 ui50Var;
            DataStoreImpl<Object> dataStoreImpl;
            Ref$BooleanRef ref$BooleanRef;
            Ref$ObjectRef<Object> ref$ObjectRef;
            ui50 ui50Var2;
            ui50 ui50Var3;
            DataStoreImpl<Object> dataStoreImpl2;
            ?? r10;
            Ref$ObjectRef<Object> ref$ObjectRef2;
            try {
                if (continuationImpl instanceof b) {
                    bVar = (b) continuationImpl;
                    int i2 = bVar.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bVar.label = i2 - Integer.MIN_VALUE;
                        Object obj = bVar.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = bVar.label;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            bVar.L$0 = iukVar;
                            ui50Var = this.a;
                            bVar.L$1 = ui50Var;
                            Ref$BooleanRef ref$BooleanRef2 = this.b;
                            bVar.L$2 = ref$BooleanRef2;
                            Ref$ObjectRef<Object> ref$ObjectRef3 = this.c;
                            bVar.L$3 = ref$ObjectRef3;
                            dataStoreImpl = this.d;
                            bVar.L$4 = dataStoreImpl;
                            bVar.label = 1;
                            if (ui50Var.b(bVar) != coroutineSingletons) {
                                ref$BooleanRef = ref$BooleanRef2;
                                ref$ObjectRef = ref$ObjectRef3;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Object obj2 = bVar.L$2;
                                ref$ObjectRef2 = (Ref$ObjectRef) bVar.L$1;
                                ui50Var2 = (ui50) bVar.L$0;
                                try {
                                    kotlin.a.a(obj);
                                    r10 = obj2;
                                    ref$ObjectRef2.element = r10;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    Object obj3 = ref$ObjectRef.element;
                                    ui50Var2.c(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ui50Var2.c(null);
                                    throw th;
                                }
                            }
                            dataStoreImpl2 = (DataStoreImpl) bVar.L$2;
                            ref$ObjectRef = (Ref$ObjectRef) bVar.L$1;
                            ui50Var3 = (ui50) bVar.L$0;
                            try {
                                kotlin.a.a(obj);
                                if (!epx.f(obj, ref$ObjectRef.element)) {
                                    ui50Var2 = ui50Var3;
                                    Object obj32 = ref$ObjectRef.element;
                                    ui50Var2.c(null);
                                    return obj32;
                                }
                                bVar.L$0 = ui50Var3;
                                bVar.L$1 = ref$ObjectRef;
                                bVar.L$2 = obj;
                                bVar.label = 3;
                                if (dataStoreImpl2.j(obj, false, bVar) != coroutineSingletons) {
                                    r10 = obj;
                                    ref$ObjectRef2 = ref$ObjectRef;
                                    ui50Var2 = ui50Var3;
                                    ref$ObjectRef2.element = r10;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    Object obj322 = ref$ObjectRef.element;
                                    ui50Var2.c(null);
                                    return obj322;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                ui50Var2 = ui50Var3;
                                ui50Var2.c(null);
                                throw th;
                            }
                        }
                        DataStoreImpl<Object> dataStoreImpl3 = (DataStoreImpl) bVar.L$4;
                        ref$ObjectRef = (Ref$ObjectRef) bVar.L$3;
                        ref$BooleanRef = (Ref$BooleanRef) bVar.L$2;
                        ui50 ui50Var4 = (ui50) bVar.L$1;
                        ?? r8 = (wzs) bVar.L$0;
                        kotlin.a.a(obj);
                        dataStoreImpl = dataStoreImpl3;
                        iukVar = r8;
                        ui50Var = ui50Var4;
                        if (!ref$BooleanRef.element) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj4 = ref$ObjectRef.element;
                        bVar.L$0 = ui50Var;
                        bVar.L$1 = ref$ObjectRef;
                        bVar.L$2 = dataStoreImpl;
                        bVar.L$3 = null;
                        bVar.L$4 = null;
                        bVar.label = 2;
                        Object invoke = iukVar.invoke(obj4, bVar);
                        if (invoke != coroutineSingletons) {
                            ui50Var3 = ui50Var;
                            obj = invoke;
                            dataStoreImpl2 = dataStoreImpl;
                            if (!epx.f(obj, ref$ObjectRef.element)) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                if (!ref$BooleanRef.element) {
                }
            } catch (Throwable th3) {
                th = th3;
                ui50Var2 = ui50Var;
                ui50Var2.c(null);
                throw th;
            }
            bVar = new b(this, continuationImpl);
            Object obj5 = bVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = bVar.label;
            if (i != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataStoreImpl<Object> dataStoreImpl, DataStoreImpl<Object>.a aVar, spj<? super c> spjVar) {
        super(1, spjVar);
        this.this$0 = dataStoreImpl;
        this.this$1 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new c(this.this$0, this.this$1, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super rtk<Object>> spjVar) {
        return ((c) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ui50 a2;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$BooleanRef ref$BooleanRef2;
        ui50 ui50Var;
        Iterator it;
        ui50 ui50Var2;
        Ref$BooleanRef ref$BooleanRef3;
        Ref$ObjectRef ref$ObjectRef3;
        a aVar;
        Ref$ObjectRef ref$ObjectRef4;
        Object obj2;
        Integer version;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            a2 = bay.a();
            ref$BooleanRef = new Ref$BooleanRef();
            ref$ObjectRef = new Ref$ObjectRef();
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            this.L$0 = a2;
            this.L$1 = ref$BooleanRef;
            this.L$2 = ref$ObjectRef;
            this.L$3 = ref$ObjectRef;
            this.label = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
            if (obj != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$0;
                    obj2 = this.L$0;
                    kotlin.a.a(obj);
                    return new rtk(obj2, i, ((Number) obj).intValue());
                }
                ui50Var = (ui50) this.L$2;
                ref$ObjectRef4 = (Ref$ObjectRef) this.L$1;
                ref$BooleanRef2 = (Ref$BooleanRef) this.L$0;
                kotlin.a.a(obj);
                try {
                    ref$BooleanRef2.element = true;
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    obj2 = ref$ObjectRef4.element;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    uax g = this.this$0.g();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = hashCode;
                    this.label = 4;
                    version = g.getVersion();
                    if (version != coroutineSingletons) {
                        i = hashCode;
                        obj = version;
                        return new rtk(obj2, i, ((Number) obj).intValue());
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    ui50Var.c(null);
                    throw th;
                }
            }
            it = (Iterator) this.L$4;
            aVar = (a) this.L$3;
            ref$ObjectRef3 = (Ref$ObjectRef) this.L$2;
            ref$BooleanRef3 = (Ref$BooleanRef) this.L$1;
            ui50Var2 = (ui50) this.L$0;
            kotlin.a.a(obj);
            while (it.hasNext()) {
                wzs wzsVar = (wzs) it.next();
                this.L$0 = ui50Var2;
                this.L$1 = ref$BooleanRef3;
                this.L$2 = ref$ObjectRef3;
                this.L$3 = aVar;
                this.L$4 = it;
                this.label = 2;
                if (wzsVar.invoke(aVar, this) == coroutineSingletons) {
                    break;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef3;
            ref$BooleanRef2 = ref$BooleanRef3;
            ui50Var = ui50Var2;
            this.this$1.c = null;
            this.L$0 = ref$BooleanRef2;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = ui50Var;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (ui50Var.b(this) != coroutineSingletons) {
                ref$ObjectRef4 = ref$ObjectRef2;
                ref$BooleanRef2.element = true;
                s3q0 s3q0Var2 = s3q0.a;
                ui50Var.c(null);
                obj2 = ref$ObjectRef4.element;
                if (obj2 == null) {
                }
                uax g2 = this.this$0.g();
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = hashCode;
                this.label = 4;
                version = g2.getVersion();
                if (version != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$3;
        ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
        ref$BooleanRef = (Ref$BooleanRef) this.L$1;
        a2 = (ui50) this.L$0;
        kotlin.a.a(obj);
        ref$ObjectRef.element = ((rtk) obj).b;
        a aVar2 = new a(a2, ref$BooleanRef, ref$ObjectRef2, this.this$0);
        List<? extends wzs<? super mzw<Object>, ? super spj<? super s3q0>, ? extends Object>> list = this.this$1.c;
        if (list == null) {
            ref$BooleanRef2 = ref$BooleanRef;
            ui50Var = a2;
            this.this$1.c = null;
            this.L$0 = ref$BooleanRef2;
            this.L$1 = ref$ObjectRef2;
            this.L$2 = ui50Var;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (ui50Var.b(this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        it = list.iterator();
        ui50Var2 = a2;
        ref$BooleanRef3 = ref$BooleanRef;
        ref$ObjectRef3 = ref$ObjectRef2;
        aVar = aVar2;
        while (it.hasNext()) {
        }
        ref$ObjectRef2 = ref$ObjectRef3;
        ref$BooleanRef2 = ref$BooleanRef3;
        ui50Var = ui50Var2;
        this.this$1.c = null;
        this.L$0 = ref$BooleanRef2;
        this.L$1 = ref$ObjectRef2;
        this.L$2 = ui50Var;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (ui50Var.b(this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
