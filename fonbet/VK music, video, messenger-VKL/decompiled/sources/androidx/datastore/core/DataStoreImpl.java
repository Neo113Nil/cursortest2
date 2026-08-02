package androidx.datastore.core;

import androidx.datastore.core.l;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import xsna.b6l;
import xsna.bay;
import xsna.bpn0;
import xsna.f7f0;
import xsna.fvk;
import xsna.gtk0;
import xsna.gzs;
import xsna.hvk;
import xsna.ivk;
import xsna.izg0;
import xsna.izs;
import xsna.j2q0;
import xsna.j5g;
import xsna.jvk;
import xsna.kbb;
import xsna.ksr;
import xsna.kvk;
import xsna.l9q0;
import xsna.lvk;
import xsna.m9q0;
import xsna.mgl0;
import xsna.mnh0;
import xsna.myc0;
import xsna.mzw;
import xsna.n7i;
import xsna.nvk;
import xsna.o7i;
import xsna.ogl0;
import xsna.ovk;
import xsna.p7i;
import xsna.pgl0;
import xsna.qgr;
import xsna.rtk;
import xsna.s3q0;
import xsna.spj;
import xsna.tu;
import xsna.twj;
import xsna.uax;
import xsna.ui50;
import xsna.wi50;
import xsna.wzs;
import xsna.xoj0;
import xsna.yoj0;
import xsna.yok0;
import xsna.yvj;
import xsna.zrg0;

/* compiled from: DataStoreImpl.kt */
/* loaded from: classes.dex */
public final class DataStoreImpl<T> implements fvk<T> {
    public final mgl0<T> a;
    public final twj<T> b;
    public final yvj c;
    public int f;
    public yok0 g;
    public final DataStoreImpl<T>.a i;
    public final yoj0<l.a<T>> l;
    public final izg0 d = new izg0(new DataStoreImpl$data$1(this, null));
    public final wi50 e = bay.a();
    public final tu h = new tu();
    public final bpn0 j = new bpn0(new c(this));
    public final bpn0 k = new bpn0(new b(this));

    /* compiled from: DataStoreImpl.kt */
    public final class a extends zrg0 {
        public List<? extends wzs<? super mzw<T>, ? super spj<? super s3q0>, ? extends Object>> c;

        public a(List<? extends wzs<? super mzw<T>, ? super spj<? super s3q0>, ? extends Object>> list) {
            this.c = j5g.O0(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.zrg0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(ContinuationImpl continuationImpl) {
            androidx.datastore.core.a aVar;
            int i;
            a aVar2;
            rtk rtkVar;
            if (continuationImpl instanceof androidx.datastore.core.a) {
                aVar = (androidx.datastore.core.a) continuationImpl;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        List<? extends wzs<? super mzw<T>, ? super spj<? super s3q0>, ? extends Object>> list = this.c;
                        DataStoreImpl<T> dataStoreImpl = DataStoreImpl.this;
                        if (list == null || list.isEmpty()) {
                            aVar.L$0 = this;
                            aVar.label = 1;
                            obj = DataStoreImpl.f(dataStoreImpl, false, aVar);
                            if (obj != coroutineSingletons) {
                                aVar2 = this;
                                rtkVar = (rtk) obj;
                            }
                        } else {
                            uax g = dataStoreImpl.g();
                            androidx.datastore.core.c cVar = new androidx.datastore.core.c(dataStoreImpl, this, null);
                            aVar.L$0 = this;
                            aVar.label = 2;
                            obj = g.d(cVar, aVar);
                            if (obj != coroutineSingletons) {
                                aVar2 = this;
                                rtkVar = (rtk) obj;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i == 1) {
                        aVar2 = (a) aVar.L$0;
                        kotlin.a.a(obj);
                        rtkVar = (rtk) obj;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) aVar.L$0;
                        kotlin.a.a(obj);
                        rtkVar = (rtk) obj;
                    }
                    DataStoreImpl.this.h.b(rtkVar);
                    return s3q0.a;
                }
            }
            aVar = new androidx.datastore.core.a(this, continuationImpl);
            Object obj2 = aVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = aVar.label;
            if (i != 0) {
            }
            DataStoreImpl.this.h.b(rtkVar);
            return s3q0.a;
        }
    }

    /* compiled from: DataStoreImpl.kt */
    public static final class b extends Lambda implements gzs<uax> {
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DataStoreImpl<T> dataStoreImpl) {
            super(0);
            this.this$0 = dataStoreImpl;
        }

        @Override // xsna.gzs
        public final uax invoke() {
            return ((ogl0) this.this$0.j.getValue()).a();
        }
    }

    /* compiled from: DataStoreImpl.kt */
    public static final class c extends Lambda implements gzs<ogl0<T>> {
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DataStoreImpl<T> dataStoreImpl) {
            super(0);
            this.this$0 = dataStoreImpl;
        }

        @Override // xsna.gzs
        public final Object invoke() {
            return this.this$0.a.a();
        }
    }

    /* compiled from: DataStoreImpl.kt */
    @b6l(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
        final /* synthetic */ wzs<T, spj<? super T>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(DataStoreImpl<T> dataStoreImpl, wzs<? super T, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.this$0 = dataStoreImpl;
            this.$transform = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            d dVar = new d(this.this$0, this.$transform, spjVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((d) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            o7i a = p7i.a();
            l.a aVar = new l.a(this.$transform, a, this.this$0.h.a(), yvjVar.getCoroutineContext());
            yoj0<l.a<T>> yoj0Var = this.this$0.l;
            Object f = yoj0Var.c.f(aVar);
            if (f instanceof kbb.a) {
                Throwable a2 = kbb.a(f);
                if (a2 == null) {
                    throw new ClosedSendChannelException("Channel was closed normally");
                }
                throw a2;
            }
            if (f instanceof kbb.b) {
                throw new IllegalStateException("Check failed.");
            }
            if (yoj0Var.d.a.getAndIncrement() == 0) {
                myc0.h(yoj0Var.a, null, null, new xoj0(yoj0Var, null), 3);
            }
            this.label = 1;
            Object J = a.J(this);
            return J == coroutineSingletons ? coroutineSingletons : J;
        }
    }

    /* compiled from: DataStoreImpl.kt */
    public static final class e extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DataStoreImpl<T> dataStoreImpl) {
            super(1);
            this.this$0 = dataStoreImpl;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 != null) {
                this.this$0.h.b(new qgr(th2));
            }
            if (this.this$0.j.isInitialized()) {
                ((ogl0) this.this$0.j.getValue()).close();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DataStoreImpl.kt */
    public static final class f extends Lambda implements wzs<l.a<T>, Throwable, s3q0> {
        public static final f i = new f(2);

        @Override // xsna.wzs
        public final s3q0 invoke(Object obj, Throwable th) {
            Throwable th2 = th;
            o7i o7iVar = ((l.a) obj).b;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            o7iVar.A(th2);
            return s3q0.a;
        }
    }

    /* compiled from: DataStoreImpl.kt */
    @b6l(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements wzs<l.a<T>, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DataStoreImpl<T> dataStoreImpl, spj<? super g> spjVar) {
            super(2, spjVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            g gVar = new g(this.this$0, spjVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((g) create((l.a) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                l.a aVar = (l.a) this.L$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (DataStoreImpl.c(dataStoreImpl, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public DataStoreImpl(mgl0<T> mgl0Var, List<? extends wzs<? super mzw<T>, ? super spj<? super s3q0>, ? extends Object>> list, twj<T> twjVar, yvj yvjVar) {
        this.a = mgl0Var;
        this.b = twjVar;
        this.c = yvjVar;
        this.i = new a(list);
        this.l = new yoj0<>(yvjVar, new e(this), f.i, new g(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:12:0x004f, B:14:0x0057, B:16:0x005b, B:17:0x0061, B:18:0x0063), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        androidx.datastore.core.d dVar;
        int i;
        wi50 wi50Var;
        int i2;
        dataStoreImpl.getClass();
        try {
            if (continuationImpl instanceof androidx.datastore.core.d) {
                dVar = (androidx.datastore.core.d) continuationImpl;
                int i3 = dVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = dVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wi50Var = dataStoreImpl.e;
                        dVar.L$0 = dataStoreImpl;
                        dVar.L$1 = wi50Var;
                        dVar.label = 1;
                        if (wi50Var.b(dVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r4 = (ui50) dVar.L$1;
                        DataStoreImpl dataStoreImpl2 = (DataStoreImpl) dVar.L$0;
                        kotlin.a.a(obj);
                        wi50Var = r4;
                        dataStoreImpl = dataStoreImpl2;
                    }
                    i2 = dataStoreImpl.f - 1;
                    dataStoreImpl.f = i2;
                    if (i2 == 0) {
                        yok0 yok0Var = dataStoreImpl.g;
                        if (yok0Var != null) {
                            yok0Var.b(null);
                        }
                        dataStoreImpl.g = null;
                    }
                    s3q0 s3q0Var = s3q0.a;
                    wi50Var.c(null);
                    return s3q0.a;
                }
            }
            i2 = dataStoreImpl.f - 1;
            dataStoreImpl.f = i2;
            if (i2 == 0) {
            }
            s3q0 s3q0Var2 = s3q0.a;
            wi50Var.c(null);
            return s3q0.a;
        } catch (Throwable th) {
            wi50Var.c(null);
            throw th;
        }
        dVar = new androidx.datastore.core.d(dataStoreImpl, continuationImpl);
        Object obj2 = dVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007d, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.DataStoreImpl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [xsna.n7i] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(DataStoreImpl dataStoreImpl, l.a aVar, ContinuationImpl continuationImpl) {
        androidx.datastore.core.e eVar;
        int i;
        n7i n7iVar;
        n7i n7iVar2;
        DataStoreImpl dataStoreImpl2;
        Object d2;
        ?? r9;
        Throwable a2;
        dataStoreImpl.getClass();
        if (continuationImpl instanceof androidx.datastore.core.e) {
            eVar = (androidx.datastore.core.e) continuationImpl;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                boolean z = true;
                if (i == 0) {
                    try {
                        if (i == 1) {
                            n7iVar = (n7i) eVar.L$0;
                        } else if (i == 2) {
                            n7i n7iVar3 = (n7i) eVar.L$2;
                            DataStoreImpl dataStoreImpl3 = (DataStoreImpl) eVar.L$1;
                            l.a aVar2 = (l.a) eVar.L$0;
                            kotlin.a.a(obj);
                            n7iVar2 = n7iVar3;
                            dataStoreImpl2 = dataStoreImpl3;
                            aVar = aVar2;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            n7iVar = (n7i) eVar.L$0;
                        }
                        kotlin.a.a(obj);
                        r9 = n7iVar;
                    } catch (Throwable th) {
                        th = th;
                        obj = new Result.Failure(th);
                        r9 = dataStoreImpl;
                        a2 = Result.a(obj);
                        if (a2 == null) {
                        }
                        return s3q0.a;
                    }
                    a2 = Result.a(obj);
                    if (a2 == null) {
                        r9.h(obj);
                    } else {
                        r9.A(a2);
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
                n7iVar2 = aVar.b;
                try {
                    gtk0<T> a3 = dataStoreImpl.h.a();
                    if (a3 instanceof rtk) {
                        wzs<T, spj<? super T>, Object> wzsVar = aVar.a;
                        kotlin.coroutines.d dVar = aVar.d;
                        eVar.L$0 = n7iVar2;
                        eVar.label = 1;
                        try {
                            d2 = dataStoreImpl.g().d(new nvk(dataStoreImpl, dVar, wzsVar, null), eVar);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            dataStoreImpl = n7iVar2;
                            obj = new Result.Failure(th);
                            r9 = dataStoreImpl;
                            a2 = Result.a(obj);
                            if (a2 == null) {
                            }
                            return s3q0.a;
                        }
                    } else {
                        if (!(a3 instanceof f7f0)) {
                            z = a3 instanceof j2q0;
                        }
                        if (!z) {
                            if (a3 instanceof qgr) {
                                throw ((qgr) a3).b;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (a3 != aVar.c) {
                            throw ((f7f0) a3).b;
                        }
                        eVar.L$0 = aVar;
                        eVar.L$1 = dataStoreImpl;
                        eVar.L$2 = n7iVar2;
                        eVar.label = 2;
                        Object h = dataStoreImpl.h(eVar);
                        dataStoreImpl2 = dataStoreImpl;
                        if (h == coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    dataStoreImpl = n7iVar2;
                    obj = new Result.Failure(th);
                    r9 = dataStoreImpl;
                    a2 = Result.a(obj);
                    if (a2 == null) {
                    }
                    return s3q0.a;
                }
                wzs<T, spj<? super T>, Object> wzsVar2 = aVar.a;
                kotlin.coroutines.d dVar2 = aVar.d;
                eVar.L$0 = n7iVar2;
                eVar.L$1 = null;
                eVar.L$2 = null;
                eVar.label = 3;
                d2 = dataStoreImpl2.g().d(new nvk(dataStoreImpl2, dVar2, wzsVar2, null), eVar);
            }
        }
        eVar = new androidx.datastore.core.e(dataStoreImpl, continuationImpl);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        boolean z2 = true;
        if (i == 0) {
        }
        wzs<T, spj<? super T>, Object> wzsVar22 = aVar.a;
        kotlin.coroutines.d dVar22 = aVar.d;
        eVar.L$0 = n7iVar2;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.label = 3;
        d2 = dataStoreImpl2.g().d(new nvk(dataStoreImpl2, dVar22, wzsVar22, null), eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:12:0x004f, B:14:0x0056, B:15:0x0067), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v7, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        androidx.datastore.core.f fVar;
        int i;
        wi50 wi50Var;
        int i2;
        dataStoreImpl.getClass();
        try {
            if (continuationImpl instanceof androidx.datastore.core.f) {
                fVar = (androidx.datastore.core.f) continuationImpl;
                int i3 = fVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wi50Var = dataStoreImpl.e;
                        fVar.L$0 = dataStoreImpl;
                        fVar.L$1 = wi50Var;
                        fVar.label = 1;
                        if (wi50Var.b(fVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r4 = (ui50) fVar.L$1;
                        DataStoreImpl dataStoreImpl2 = (DataStoreImpl) fVar.L$0;
                        kotlin.a.a(obj);
                        wi50Var = r4;
                        dataStoreImpl = dataStoreImpl2;
                    }
                    i2 = dataStoreImpl.f + 1;
                    dataStoreImpl.f = i2;
                    if (i2 == 1) {
                        dataStoreImpl.g = myc0.h(dataStoreImpl.c, null, null, new androidx.datastore.core.g(dataStoreImpl, null), 3);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    wi50Var.c(null);
                    return s3q0.a;
                }
            }
            i2 = dataStoreImpl.f + 1;
            dataStoreImpl.f = i2;
            if (i2 == 1) {
            }
            s3q0 s3q0Var2 = s3q0.a;
            wi50Var.c(null);
            return s3q0.a;
        } catch (Throwable th) {
            wi50Var.c(null);
            throw th;
        }
        fVar = new androidx.datastore.core.f(dataStoreImpl, continuationImpl);
        Object obj2 = fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(DataStoreImpl dataStoreImpl, boolean z, spj spjVar) {
        i iVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        DataStoreImpl dataStoreImpl2;
        gtk0 gtk0Var;
        boolean z2;
        DataStoreImpl dataStoreImpl3;
        Pair pair;
        dataStoreImpl.getClass();
        if (spjVar instanceof i) {
            iVar = (i) spjVar;
            int i2 = iVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.label = i2 - Integer.MIN_VALUE;
                Object obj = iVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    gtk0 a2 = dataStoreImpl.h.a();
                    if (a2 instanceof j2q0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    uax g2 = dataStoreImpl.g();
                    iVar.L$0 = dataStoreImpl;
                    iVar.L$1 = a2;
                    iVar.Z$0 = z;
                    iVar.label = 1;
                    Integer version = g2.getVersion();
                    if (version != coroutineSingletons) {
                        dataStoreImpl2 = dataStoreImpl;
                        gtk0Var = a2;
                        obj = version;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        dataStoreImpl3 = (DataStoreImpl) iVar.L$0;
                        kotlin.a.a(obj);
                        pair = (Pair) obj;
                        gtk0 gtk0Var2 = (gtk0) pair.d();
                        if (((Boolean) pair.g()).booleanValue()) {
                        }
                        return gtk0Var2;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dataStoreImpl3 = (DataStoreImpl) iVar.L$0;
                    kotlin.a.a(obj);
                    pair = (Pair) obj;
                    gtk0 gtk0Var22 = (gtk0) pair.d();
                    if (((Boolean) pair.g()).booleanValue()) {
                        dataStoreImpl3.h.b(gtk0Var22);
                    }
                    return gtk0Var22;
                }
                z = iVar.Z$0;
                gtk0Var = (gtk0) iVar.L$1;
                dataStoreImpl2 = (DataStoreImpl) iVar.L$0;
                kotlin.a.a(obj);
                int intValue = ((Number) obj).intValue();
                z2 = gtk0Var instanceof rtk;
                int i3 = !z2 ? gtk0Var.a : -1;
                if (!z2 && intValue == i3) {
                    return gtk0Var;
                }
                if (z) {
                    uax g3 = dataStoreImpl2.g();
                    jvk jvkVar = new jvk(dataStoreImpl2, i3, null);
                    iVar.L$0 = dataStoreImpl2;
                    iVar.L$1 = null;
                    iVar.label = 3;
                    obj = g3.c(jvkVar, iVar);
                    if (obj != coroutineSingletons) {
                        dataStoreImpl3 = dataStoreImpl2;
                        pair = (Pair) obj;
                        gtk0 gtk0Var222 = (gtk0) pair.d();
                        if (((Boolean) pair.g()).booleanValue()) {
                        }
                        return gtk0Var222;
                    }
                } else {
                    uax g4 = dataStoreImpl2.g();
                    ivk ivkVar = new ivk(dataStoreImpl2, null);
                    iVar.L$0 = dataStoreImpl2;
                    iVar.L$1 = null;
                    iVar.label = 2;
                    obj = g4.d(ivkVar, iVar);
                    if (obj != coroutineSingletons) {
                        dataStoreImpl3 = dataStoreImpl2;
                        pair = (Pair) obj;
                        gtk0 gtk0Var2222 = (gtk0) pair.d();
                        if (((Boolean) pair.g()).booleanValue()) {
                        }
                        return gtk0Var2222;
                    }
                }
                return coroutineSingletons;
            }
        }
        iVar = new i(dataStoreImpl, spjVar);
        Object obj2 = iVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.label;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = gtk0Var instanceof rtk;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0064, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0140 A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x012e, B:29:0x0140, B:32:0x0148), top: B:26:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4 A[Catch: CorruptionException -> 0x0064, TryCatch #0 {CorruptionException -> 0x0064, blocks: (B:36:0x005f, B:37:0x0103, B:40:0x006d, B:41:0x00e5, B:56:0x008a, B:58:0x00a4, B:59:0x00aa, B:65:0x0093, B:68:0x00d2), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(DataStoreImpl dataStoreImpl, boolean z, ContinuationImpl continuationImpl) {
        j jVar;
        Ref$ObjectRef ref$ObjectRef;
        CorruptionException corruptionException;
        DataStoreImpl dataStoreImpl2;
        boolean z2;
        Ref$ObjectRef ref$ObjectRef2;
        CorruptionException corruptionException2;
        Object d2;
        Ref$IntRef ref$IntRef;
        Ref$ObjectRef ref$ObjectRef3;
        Integer version;
        DataStoreImpl dataStoreImpl3;
        int i;
        Object obj;
        dataStoreImpl.getClass();
        if (continuationImpl instanceof j) {
            jVar = (j) continuationImpl;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = (T) jVar.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (jVar.label) {
                    case 0:
                        kotlin.a.a(obj2);
                        if (!z) {
                            uax g2 = dataStoreImpl.g();
                            jVar.L$0 = dataStoreImpl;
                            jVar.Z$0 = z;
                            jVar.label = 3;
                            obj2 = (T) g2.getVersion();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            uax g3 = dataStoreImpl.g();
                            kvk kvkVar = new kvk(dataStoreImpl, intValue, null);
                            jVar.L$0 = dataStoreImpl;
                            jVar.Z$0 = z;
                            jVar.label = 4;
                            obj2 = (T) g3.c(kvkVar, jVar);
                            if (obj2 == obj3) {
                            }
                            return (rtk) obj2;
                        }
                        jVar.L$0 = dataStoreImpl;
                        jVar.Z$0 = z;
                        jVar.label = 1;
                        obj2 = (T) dataStoreImpl.i(jVar);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        uax g4 = dataStoreImpl.g();
                        jVar.L$0 = dataStoreImpl;
                        jVar.L$1 = obj2;
                        jVar.Z$0 = z;
                        jVar.I$0 = hashCode;
                        jVar.label = 2;
                        version = g4.getVersion();
                        if (version != obj3) {
                            dataStoreImpl3 = dataStoreImpl;
                            i = hashCode;
                            obj = obj2;
                            obj2 = (T) version;
                            return new rtk(obj, i, ((Number) obj2).intValue());
                        }
                        return obj3;
                    case 1:
                        z = jVar.Z$0;
                        dataStoreImpl = (DataStoreImpl) jVar.L$0;
                        kotlin.a.a(obj2);
                        if (obj2 == null) {
                        }
                        uax g42 = dataStoreImpl.g();
                        jVar.L$0 = dataStoreImpl;
                        jVar.L$1 = obj2;
                        jVar.Z$0 = z;
                        jVar.I$0 = hashCode;
                        jVar.label = 2;
                        version = g42.getVersion();
                        if (version != obj3) {
                        }
                        return obj3;
                    case 2:
                        i = jVar.I$0;
                        z = jVar.Z$0;
                        obj = jVar.L$1;
                        dataStoreImpl3 = (DataStoreImpl) jVar.L$0;
                        try {
                            kotlin.a.a(obj2);
                            return new rtk(obj, i, ((Number) obj2).intValue());
                        } catch (CorruptionException e2) {
                            e = e2;
                            dataStoreImpl = dataStoreImpl3;
                            ref$ObjectRef = new Ref$ObjectRef();
                            twj<T> twjVar = dataStoreImpl.b;
                            jVar.L$0 = dataStoreImpl;
                            jVar.L$1 = e;
                            jVar.L$2 = ref$ObjectRef;
                            jVar.L$3 = ref$ObjectRef;
                            jVar.Z$0 = z;
                            jVar.label = 5;
                            Object a2 = twjVar.a(e);
                            if (a2 != obj3) {
                                corruptionException = e;
                                obj2 = (T) a2;
                                dataStoreImpl2 = dataStoreImpl;
                                z2 = z;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef2.element = (T) obj2;
                                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                try {
                                    lvk lvkVar = new lvk(ref$ObjectRef, dataStoreImpl2, ref$IntRef2, null);
                                    jVar.L$0 = corruptionException;
                                    jVar.L$1 = ref$ObjectRef;
                                    jVar.L$2 = ref$IntRef2;
                                    jVar.L$3 = null;
                                    jVar.label = 6;
                                    if (z2) {
                                    }
                                    if (d2 != obj3) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    mnh0.d(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z = jVar.Z$0;
                        dataStoreImpl = (DataStoreImpl) jVar.L$0;
                        kotlin.a.a(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        uax g32 = dataStoreImpl.g();
                        kvk kvkVar2 = new kvk(dataStoreImpl, intValue2, null);
                        jVar.L$0 = dataStoreImpl;
                        jVar.Z$0 = z;
                        jVar.label = 4;
                        obj2 = (T) g32.c(kvkVar2, jVar);
                        if (obj2 == obj3) {
                        }
                        return (rtk) obj2;
                    case 4:
                        boolean z3 = jVar.Z$0;
                        kotlin.a.a(obj2);
                        return (rtk) obj2;
                    case 5:
                        z2 = jVar.Z$0;
                        ref$ObjectRef2 = (Ref$ObjectRef) jVar.L$3;
                        ref$ObjectRef = (Ref$ObjectRef) jVar.L$2;
                        corruptionException = (CorruptionException) jVar.L$1;
                        dataStoreImpl2 = (DataStoreImpl) jVar.L$0;
                        kotlin.a.a(obj2);
                        ref$ObjectRef2.element = (T) obj2;
                        Ref$IntRef ref$IntRef22 = new Ref$IntRef();
                        lvk lvkVar2 = new lvk(ref$ObjectRef, dataStoreImpl2, ref$IntRef22, null);
                        jVar.L$0 = corruptionException;
                        jVar.L$1 = ref$ObjectRef;
                        jVar.L$2 = ref$IntRef22;
                        jVar.L$3 = null;
                        jVar.label = 6;
                        if (z2) {
                            d2 = dataStoreImpl2.g().d(new hvk(lvkVar2, null), jVar);
                        } else {
                            dataStoreImpl2.getClass();
                            d2 = lvkVar2.invoke(jVar);
                        }
                        if (d2 != obj3) {
                            ref$IntRef = ref$IntRef22;
                            ref$ObjectRef3 = ref$ObjectRef;
                            T t = ref$ObjectRef3.element;
                            obj3 = new rtk(t, t != null ? t.hashCode() : 0, ref$IntRef.element);
                        }
                        return obj3;
                    case 6:
                        ref$IntRef = (Ref$IntRef) jVar.L$2;
                        ref$ObjectRef3 = (Ref$ObjectRef) jVar.L$1;
                        corruptionException2 = (CorruptionException) jVar.L$0;
                        try {
                            kotlin.a.a(obj2);
                            T t2 = ref$ObjectRef3.element;
                            obj3 = new rtk(t2, t2 != null ? t2.hashCode() : 0, ref$IntRef.element);
                            return obj3;
                        } catch (Throwable th2) {
                            th = th2;
                            mnh0.d(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        jVar = new j(dataStoreImpl, continuationImpl);
        Object obj22 = (T) jVar.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (jVar.label) {
        }
    }

    @Override // xsna.fvk
    public final Object a(wzs<? super T, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super T> spjVar) {
        m9q0 m9q0Var = (m9q0) spjVar.getContext().get(l9q0.b);
        if (m9q0Var != null) {
            m9q0Var.a(this);
        }
        return myc0.k(new m9q0(m9q0Var, this), new d(this, wzsVar, null), spjVar);
    }

    public final uax g() {
        return (uax) this.k.getValue();
    }

    @Override // xsna.fvk
    public final ksr<T> getData() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r4.b(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        DataStoreImpl<T> dataStoreImpl;
        int intValue;
        int i2;
        Throwable th;
        DataStoreImpl<T> dataStoreImpl2;
        try {
            if (continuationImpl instanceof h) {
                hVar = (h) continuationImpl;
                int i3 = hVar.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.label = i3 - Integer.MIN_VALUE;
                    Object obj = hVar.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = hVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        uax g2 = g();
                        hVar.L$0 = this;
                        hVar.label = 1;
                        obj = g2.getVersion();
                        if (obj != obj2) {
                            dataStoreImpl = this;
                        }
                        return obj2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = hVar.I$0;
                        dataStoreImpl2 = (DataStoreImpl) hVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            return s3q0.a;
                        } catch (Throwable th2) {
                            th = th2;
                            dataStoreImpl2.h.b(new f7f0(th, i2));
                            throw th;
                        }
                    }
                    dataStoreImpl = (DataStoreImpl) hVar.L$0;
                    kotlin.a.a(obj);
                    intValue = ((Number) obj).intValue();
                    DataStoreImpl<T>.a aVar = dataStoreImpl.i;
                    hVar.L$0 = dataStoreImpl;
                    hVar.I$0 = intValue;
                    hVar.label = 2;
                }
            }
            DataStoreImpl<T>.a aVar2 = dataStoreImpl.i;
            hVar.L$0 = dataStoreImpl;
            hVar.I$0 = intValue;
            hVar.label = 2;
        } catch (Throwable th3) {
            i2 = intValue;
            th = th3;
            dataStoreImpl2 = dataStoreImpl;
            dataStoreImpl2.h.b(new f7f0(th, i2));
            throw th;
        }
        hVar = new h(this, continuationImpl);
        Object obj3 = hVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hVar.label;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(ContinuationImpl continuationImpl) {
        return ((ogl0) this.j.getValue()).c(new pgl0(3, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z, ContinuationImpl continuationImpl) {
        k kVar;
        int i;
        Ref$IntRef ref$IntRef;
        if (continuationImpl instanceof k) {
            kVar = (k) continuationImpl;
            int i2 = kVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.label = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kVar.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    ogl0 ogl0Var = (ogl0) this.j.getValue();
                    ovk ovkVar = new ovk(ref$IntRef2, this, obj, z, null);
                    kVar.L$0 = ref$IntRef2;
                    kVar.label = 1;
                    if (ogl0Var.b(ovkVar, kVar) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$IntRef = ref$IntRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$IntRef = (Ref$IntRef) kVar.L$0;
                    kotlin.a.a(obj2);
                }
                return new Integer(ref$IntRef.element);
            }
        }
        kVar = new k(this, continuationImpl);
        Object obj22 = kVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kVar.label;
        if (i != 0) {
        }
        return new Integer(ref$IntRef.element);
    }
}
