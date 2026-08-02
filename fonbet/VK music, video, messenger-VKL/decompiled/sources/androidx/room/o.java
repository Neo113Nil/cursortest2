package androidx.room;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.hpj;
import xsna.myc0;
import xsna.pkg;
import xsna.s3q0;
import xsna.spj;
import xsna.wrg0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: RoomTrackingLiveData.android.kt */
/* loaded from: classes.dex */
public abstract class o<T> extends androidx.lifecycle.n<T> {
    public final RoomDatabase l;
    public final pkg m;
    public final n n;
    public final AtomicBoolean o = new AtomicBoolean(true);
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final kotlin.coroutines.d r;

    /* compiled from: RoomTrackingLiveData.android.kt */
    @b6l(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", l = {123}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ o<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o<T> oVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                o<T> oVar = this.this$0;
                this.label = 1;
                if (o.l(oVar, this) == coroutineSingletons) {
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

    public o(RoomDatabase roomDatabase, pkg pkgVar, String[] strArr) {
        kotlin.coroutines.d dVar;
        this.l = roomDatabase;
        this.m = pkgVar;
        this.n = new n(strArr, this);
        if (roomDatabase.o()) {
            dVar = roomDatabase.c;
            if (dVar == null) {
                dVar = null;
            }
        } else {
            dVar = EmptyCoroutineContext.b;
        }
        this.r = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c A[Catch: all -> 0x0032, Exception -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0035, blocks: (B:12:0x002e, B:16:0x007c), top: B:11:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:14:0x0074, B:16:0x007c, B:25:0x0095, B:38:0x008b, B:39:0x0092), top: B:7:0x0024, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.room.o] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.n, androidx.room.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.room.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0072 -> B:13:0x0074). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a4 -> B:24:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(o oVar, ContinuationImpl continuationImpl) {
        p pVar;
        ?? r2;
        o oVar2;
        oVar.getClass();
        try {
            if (continuationImpl instanceof p) {
                pVar = (p) continuationImpl;
                int i = pVar.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pVar.label = i - Integer.MIN_VALUE;
                    Object obj = pVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = pVar.label;
                    if (r2 == 0) {
                        if (r2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pVar.I$0;
                        r2 = (o) pVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            r2 = r2;
                            while (r2.o.compareAndSet(true, false)) {
                                pVar.L$0 = r2;
                                pVar.I$0 = 1;
                                pVar.label = 1;
                                obj = r2.m();
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                r2.i(obj);
                            }
                            if (i2 != 0 || !oVar2.o.get()) {
                                return s3q0.a;
                            }
                            oVar = oVar2;
                            o oVar3 = oVar;
                            if (oVar.p.compareAndSet(false, true)) {
                                i2 = 0;
                                oVar2 = oVar3;
                                if (i2 != 0) {
                                }
                                return s3q0.a;
                            }
                            obj = null;
                            i2 = 0;
                            r2 = oVar3;
                            while (r2.o.compareAndSet(true, false)) {
                            }
                            if (i2 != 0) {
                            }
                            if (i2 != 0) {
                            }
                            return s3q0.a;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    }
                    kotlin.a.a(obj);
                    if (oVar.q.compareAndSet(false, true)) {
                        e eVar = oVar.l.g;
                        if (eVar == null) {
                            eVar = null;
                        }
                        n nVar = oVar.n;
                        eVar.getClass();
                        if (eVar.a(new t(eVar, nVar))) {
                            wrg0.a(new f(eVar, null));
                        }
                    }
                    o oVar32 = oVar;
                    if (oVar.p.compareAndSet(false, true)) {
                    }
                }
            }
            if (r2 == 0) {
            }
        } finally {
            r2.p.set(false);
        }
        pVar = new p(oVar, continuationImpl);
        Object obj2 = pVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = pVar.label;
    }

    @Override // androidx.lifecycle.n
    public final void g() {
        ((Set) this.m.c).add(this);
        hpj hpjVar = this.l.b;
        if (hpjVar == null) {
            hpjVar = null;
        }
        myc0.h(hpjVar, this.r, null, new a(this, null), 2);
    }

    @Override // androidx.lifecycle.n
    public final void h() {
        ((Set) this.m.c).remove(this);
    }

    public abstract Object m();
}
