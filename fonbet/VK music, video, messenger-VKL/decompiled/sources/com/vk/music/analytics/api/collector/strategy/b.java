package com.vk.music.analytics.api.collector.strategy;

import com.vk.movika.sdk.base.ui.o0;
import com.vk.music.analytics.api.collector.strategy.CollectorStrategy;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ax1;
import xsna.b7;
import xsna.epx;
import xsna.g7z;
import xsna.gzs;
import xsna.iwa0;
import xsna.izs;
import xsna.msy;
import xsna.q940;
import xsna.r940;
import xsna.s3q0;
import xsna.t940;
import xsna.v940;

/* compiled from: OverflowCollectorStrategy.kt */
/* loaded from: classes3.dex */
public class b<T extends t940> implements CollectorStrategy<T> {
    public final g7z b;
    public final CollectorStrategy<T> c;
    public final FunctionReferenceImpl d;
    public final q940 e;
    public final a<T> f;
    public final Object g;

    /* compiled from: OverflowCollectorStrategy.kt */
    public interface a<T> {
        ax1 a(ax1 ax1Var);

        ax1 b(iwa0 iwa0Var);
    }

    /* compiled from: OverflowCollectorStrategy.kt */
    /* renamed from: com.vk.music.analytics.api.collector.strategy.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1317b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CollectorStrategy.OverflowStrategy.values().length];
            try {
                iArr[CollectorStrategy.OverflowStrategy.IGNORE_NEW_EVENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollectorStrategy.OverflowStrategy.REMOVE_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g7z g7zVar, CollectorStrategy<T> collectorStrategy, gzs<? extends Set<? extends v940>> gzsVar, q940 q940Var) {
        a<T> cVar;
        this.b = g7zVar;
        this.c = collectorStrategy;
        this.d = (FunctionReferenceImpl) gzsVar;
        this.e = q940Var;
        int i = C1317b.$EnumSwitchMapping$0[g7zVar.a().ordinal()];
        if (i == 1) {
            cVar = new c(this);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new d(this);
        }
        this.f = cVar;
        this.g = msy.a(LazyThreadSafetyMode.NONE, new o0(29));
    }

    public static final boolean a(b bVar) {
        r940.a aVar = bVar.e.b().a;
        g7z g7zVar = bVar.b;
        return g7zVar.c() && aVar.b >= g7zVar.d();
    }

    public static final void b(b bVar, ax1 ax1Var) {
        bVar.e.i(ax1Var);
        if (bVar.c()) {
            bVar.d(ax1Var, new b7(16, ax1Var, bVar));
        }
    }

    public boolean c() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final void d(ax1 ax1Var, izs<? super v940, s3q0> izsVar) {
        Object failure;
        for (v940 v940Var : (Iterable) this.d.invoke()) {
            try {
                failure = (Boolean) v940Var.a().invoke(ax1Var);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            if (epx.f(failure, Boolean.TRUE)) {
                izsVar.invoke(v940Var);
            }
        }
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public ax1 g(iwa0 iwa0Var) {
        if (this.c.j(iwa0Var)) {
            return this.f.b(iwa0Var);
        }
        return null;
    }

    @Override // com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public final boolean j(iwa0 iwa0Var) {
        return this.c.j(iwa0Var);
    }
}
