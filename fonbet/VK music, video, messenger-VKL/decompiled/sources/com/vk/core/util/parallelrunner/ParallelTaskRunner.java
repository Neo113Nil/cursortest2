package com.vk.core.util.parallelrunner;

import android.app.Application;
import android.os.StrictMode;
import android.os.Trace;
import com.vk.core.apps.BuildInfo;
import com.vk.core.util.parallelrunner.stat.tacker.RunStep;
import com.vk.metrics.performance.appstart.IdleStateHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.a0g;
import xsna.asp;
import xsna.asu0;
import xsna.bp;
import xsna.dp;
import xsna.epx;
import xsna.gzs;
import xsna.ig00;
import xsna.j5o0;
import xsna.mb3;
import xsna.mh90;
import xsna.msy;
import xsna.ndp0;
import xsna.nmg0;
import xsna.o8r;
import xsna.p45;
import xsna.s3q0;
import xsna.v1w;
import xsna.zf6;
import xsna.zrp;

/* compiled from: ParallelTaskRunner.kt */
/* loaded from: classes.dex */
public final class ParallelTaskRunner {
    public final boolean a;
    public final v1w b;
    public final o8r c;
    public final boolean d;
    public final zf6 e;
    public final ArrayList<f> f;
    public final ArrayList g;
    public final ArrayList<f> h;
    public final ArrayList i;
    public final ArrayList j;
    public final j5o0 k;
    public final ig00 l;
    public final Object m;
    public boolean n;
    public CountDownLatch o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ParallelTaskRunner.kt */
    public static final class ErrorStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ErrorStrategy[] $VALUES;
        public static final ErrorStrategy LogAndFail;
        public static final ErrorStrategy LogOnly;

        static {
            ErrorStrategy errorStrategy = new ErrorStrategy("LogOnly", 0);
            LogOnly = errorStrategy;
            ErrorStrategy errorStrategy2 = new ErrorStrategy("LogAndFail", 1);
            LogAndFail = errorStrategy2;
            ErrorStrategy[] errorStrategyArr = {errorStrategy, errorStrategy2};
            $VALUES = errorStrategyArr;
            $ENTRIES = new asp(errorStrategyArr);
        }

        public ErrorStrategy() {
            throw null;
        }

        public static ErrorStrategy valueOf(String str) {
            return (ErrorStrategy) Enum.valueOf(ErrorStrategy.class, str);
        }

        public static ErrorStrategy[] values() {
            return (ErrorStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: ParallelTaskRunner.kt */
    public static abstract class a extends d {
        public final gzs<nmg0> c;

        public a(Application application, gzs<nmg0> gzsVar) {
            super(application);
            this.c = gzsVar;
        }

        public final nmg0 c() {
            return this.c.invoke();
        }
    }

    /* compiled from: ParallelTaskRunner.kt */
    public final class b extends FutureTask<s3q0> implements f {
        public final String b;
        public int c;
        public final ArrayList d;
        public final List<f> e;
        public final AtomicBoolean f;

        public b(ParallelTaskRunner parallelTaskRunner, String str, ErrorStrategy errorStrategy, int i, ArrayList arrayList, List list, gzs gzsVar) {
            super(parallelTaskRunner.new c(str, errorStrategy, list, gzsVar));
            this.b = str;
            this.c = i;
            this.d = arrayList;
            this.e = list;
            this.f = new AtomicBoolean();
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final List<f> O2() {
            return this.d;
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final boolean canBeExecuted() {
            List<f> list = this.e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((f) it.next()).isDone()) {
                        break;
                    }
                }
            }
            return this.f.compareAndSet(false, true);
        }

        public final boolean equals(Object obj) {
            b bVar = obj instanceof b ? (b) obj : null;
            return epx.f(bVar != null ? bVar.b : null, this.b);
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final String getName() {
            return this.b;
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final int getPriority() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final List<f> s7() {
            return this.e;
        }

        @Override // java.util.concurrent.FutureTask
        public final void setException(Throwable th) {
            if (th != null) {
                throw th;
            }
        }

        @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.f
        public final void setPriority(int i) {
            this.c = i;
        }
    }

    /* compiled from: ParallelTaskRunner.kt */
    public final class c implements Callable<s3q0> {
        public final String b;
        public final ErrorStrategy c;
        public final List<f> d;
        public final gzs<s3q0> e;
        public volatile boolean f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, ErrorStrategy errorStrategy, List<? extends f> list, gzs<s3q0> gzsVar) {
            this.b = str;
            this.c = errorStrategy;
            this.d = list;
            this.e = gzsVar;
        }

        public final void a() {
            ParallelTaskException parallelTaskException;
            ErrorStrategy errorStrategy;
            ErrorStrategy errorStrategy2;
            List<f> list = this.d;
            String str = this.b;
            try {
                boolean e = ndp0.e();
                if (e) {
                    ndp0.b("ParallelTaskRunner.InternalTask." + str + " dependencies");
                }
                try {
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ((f) it.next()).get();
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    if (e) {
                        Trace.endSection();
                    }
                    boolean e2 = ndp0.e();
                    if (e2) {
                        ndp0.b("ParallelTaskRunner.InternalTask." + str);
                    }
                    try {
                        this.e.invoke();
                    } finally {
                        if (e2) {
                            Trace.endSection();
                        }
                    }
                } catch (Throwable th) {
                    if (e) {
                        Trace.endSection();
                    }
                    throw th;
                }
            } finally {
                if (errorStrategy2 != errorStrategy) {
                }
            }
        }

        @Override // java.util.concurrent.Callable
        public final s3q0 call() {
            if (!ParallelTaskRunner.this.n) {
                a();
            } else if (!this.f) {
                ParallelTaskRunner parallelTaskRunner = ParallelTaskRunner.this;
                synchronized (this) {
                    if (!this.f) {
                        this.f = true;
                        a();
                        CountDownLatch countDownLatch = parallelTaskRunner.o;
                        if (countDownLatch == null) {
                            countDownLatch = null;
                        }
                        countDownLatch.countDown();
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ParallelTaskRunner.kt */
    public static abstract class d implements gzs<s3q0> {
        public final Application b;

        public d(Application application) {
            this.b = application;
        }

        public abstract String a();
    }

    /* compiled from: ParallelTaskRunner.kt */
    public interface f extends RunnableFuture<s3q0> {
        List<f> O2();

        boolean canBeExecuted();

        String getName();

        int getPriority();

        List<f> s7();

        void setPriority(int i);
    }

    /* compiled from: ParallelTaskRunner.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdleStateHandler.AppStartListener.StartType.values().length];
            try {
                iArr[IdleStateHandler.AppStartListener.StartType.COLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdleStateHandler.AppStartListener.StartType.WARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ParallelTaskRunner(boolean z, v1w v1wVar, o8r o8rVar, zf6 zf6Var) {
        mb3 mb3Var = new mb3(11);
        this.a = z;
        this.b = v1wVar;
        this.c = o8rVar;
        this.d = true;
        this.e = zf6Var;
        this.f = new ArrayList<>();
        this.g = new ArrayList();
        this.h = new ArrayList<>();
        this.i = new ArrayList();
        this.j = new ArrayList();
        j5o0 j5o0Var = new j5o0(mb3Var);
        this.k = j5o0Var;
        this.l = new ig00(j5o0Var);
        this.m = msy.a(LazyThreadSafetyMode.NONE, new bp(this, 5));
        IdleStateHandler.b.add(new com.vk.metrics.performance.appstart.d(new p45(this, 1)));
    }

    public final void a(d dVar) {
        b(new e(dVar));
    }

    public final void b(e eVar) {
        b j = j(eVar, this.a ? ErrorStrategy.LogAndFail : ErrorStrategy.LogOnly);
        this.j.add(j);
        Iterator<T> it = eVar.c.iterator();
        while (it.hasNext()) {
            ((f) it.next()).O2().add(j);
        }
    }

    public final void c(e eVar) {
        this.h.add(j(eVar, this.a ? ErrorStrategy.LogAndFail : ErrorStrategy.LogOnly));
    }

    public final void d(e eVar) {
        this.f.add(j(eVar, ErrorStrategy.LogAndFail));
    }

    public final b e(e eVar) {
        b j = j(eVar, this.a ? ErrorStrategy.LogAndFail : ErrorStrategy.LogOnly);
        this.g.add(j);
        Iterator<T> it = eVar.c.iterator();
        while (it.hasNext()) {
            ((f) it.next()).O2().add(j);
        }
        return j;
    }

    public final void f(d dVar) {
        e(new e(dVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(List list, RunStep runStep, boolean z, dp dpVar) {
        if (!list.isEmpty()) {
            ((mh90) this.m.getValue()).a(true, runStep == RunStep.Parallel).a(list, runStep, z, dpVar);
        } else if (dpVar != null) {
            dpVar.invoke();
        }
    }

    public final b h(e eVar) {
        b j = j(eVar, this.a ? ErrorStrategy.LogAndFail : ErrorStrategy.LogOnly);
        this.i.add(j);
        Iterator<T> it = eVar.c.iterator();
        while (it.hasNext()) {
            ((f) it.next()).O2().add(j);
        }
        return j;
    }

    public final void i() {
        ig00 ig00Var;
        Iterator<f> it = this.f.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ig00Var = this.l;
            if (!hasNext) {
                break;
            } else {
                ig00Var.a(it.next(), RunStep.Before);
            }
        }
        ArrayList arrayList = this.g;
        this.o = new CountDownLatch(arrayList.size());
        boolean m = BuildInfo.m();
        this.n = m;
        g(arrayList, RunStep.Parallel, !m, null);
        if (this.n) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitNetwork().build());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f fVar = (f) it2.next();
                if (!fVar.isDone()) {
                    ig00Var.a(fVar, RunStep.Parallel);
                }
            }
            CountDownLatch countDownLatch = this.o;
            (countDownLatch != null ? countDownLatch : null).await();
            StrictMode.setThreadPolicy(threadPolicy);
            this.n = false;
        }
        Iterator<f> it3 = this.h.iterator();
        while (it3.hasNext()) {
            ig00Var.a(it3.next(), RunStep.After);
        }
        asu0.a.getClass();
        asu0.o().execute(new a0g(this, 2));
    }

    public final b j(e eVar, ErrorStrategy errorStrategy) {
        return new b(this, eVar.a, errorStrategy, eVar.b ? 2 : 1, new ArrayList(), eVar.c, eVar.d);
    }

    /* compiled from: ParallelTaskRunner.kt */
    public static final class e {
        public final String a;
        public final boolean b;
        public final List<f> c;
        public final gzs<s3q0> d;

        public e(String str, b bVar, gzs gzsVar) {
            this(str, false, Collections.singletonList(bVar), gzsVar);
        }

        public e(int i, String str, gzs gzsVar) {
            this(str, true, EmptyList.b, gzsVar);
        }

        public e(d dVar) {
            this(dVar.a(), false, EmptyList.b, dVar);
        }

        public e(String str, gzs<s3q0> gzsVar) {
            this(str, false, EmptyList.b, gzsVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, boolean z, List<? extends f> list, gzs<s3q0> gzsVar) {
            this.a = str;
            this.b = z;
            this.c = list;
            this.d = gzsVar;
        }
    }
}
