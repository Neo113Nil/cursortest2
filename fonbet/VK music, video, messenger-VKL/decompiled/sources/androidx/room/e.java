package androidx.room;

import android.content.Intent;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a67;
import xsna.b6l;
import xsna.pkg;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.sqp0;
import xsna.vpx;
import xsna.wrg0;
import xsna.wzs;
import xsna.xb3;
import xsna.xh6;
import xsna.yvj;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final class e {
    public final RoomDatabase a;
    public final String[] b;
    public final sqp0 c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final xb3 f;
    public final xh6 g;
    public final pkg h;
    public Intent i;
    public g j;
    public final Object k;

    /* compiled from: InvalidationTracker.android.kt */
    public static abstract class a {
        public final String[] a;

        public a(String[] strArr) {
            this.a = strArr;
        }

        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.android.kt */
    @b6l(c = "androidx.room.InvalidationTracker$removeObserver$1", f = "InvalidationTracker.android.kt", l = {Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE}, m = "invokeSuspend")
    /* loaded from: classes12.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return e.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sqp0 sqp0Var = e.this.c;
                this.label = 1;
                if (sqp0Var.f(this) == coroutineSingletons) {
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

    public e(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = roomDatabase;
        this.b = strArr;
        sqp0 sqp0Var = new sqp0(roomDatabase, hashMap, hashMap2, strArr, roomDatabase.l, new vpx(1, this, e.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.c = sqp0Var;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new xb3(this, 6);
        this.g = new xh6(this, 7);
        this.h = new pkg(roomDatabase);
        this.k = new Object();
        sqp0Var.k = new a67(this, 6);
    }

    public final boolean a(a aVar) {
        LinkedHashMap linkedHashMap = this.d;
        String[] strArr = aVar.a;
        sqp0 sqp0Var = this.c;
        Pair<String[], int[]> g = sqp0Var.g(strArr);
        String[] d = g.d();
        int[] g2 = g.g();
        h hVar = new h(aVar, g2, d);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            h hVar2 = linkedHashMap.containsKey(aVar) ? (h) pn00.h(aVar, linkedHashMap) : (h) linkedHashMap.put(aVar, hVar);
            reentrantLock.unlock();
            return hVar2 == null && sqp0Var.h.a(g2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(a aVar) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            h hVar = (h) this.d.remove(aVar);
            if (hVar != null) {
                if (this.c.h.b(hVar.b)) {
                    wrg0.a(new b(null));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object c(SuspendLambda suspendLambda) {
        RoomDatabase roomDatabase = this.a;
        if (roomDatabase.o() && !roomDatabase.s()) {
            return s3q0.a;
        }
        Object f = this.c.f(suspendLambda);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }
}
