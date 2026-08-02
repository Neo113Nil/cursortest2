package com.vk.clips.viewer.impl.utils;

import com.vk.clips.viewer.impl.utils.ClipVideoPixelExecutorDelegate;
import com.vk.dto.common.StatPixel;
import com.vk.log.L;
import io.reactivex.rxjava3.core.g;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.fuseable.d;
import io.reactivex.rxjava3.internal.operators.completable.b0;
import io.reactivex.rxjava3.internal.operators.completable.m;
import io.reactivex.rxjava3.internal.operators.completable.n;
import io.reactivex.rxjava3.internal.operators.completable.y;
import io.reactivex.rxjava3.internal.operators.flowable.r0;
import io.reactivex.rxjava3.internal.operators.observable.e0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.utils.Logger;
import xsna.cp0;
import xsna.dez0;
import xsna.fpf0;
import xsna.hg1;
import xsna.i22;
import xsna.izs;
import xsna.j5g;
import xsna.lp1;
import xsna.o19;
import xsna.pgn;
import xsna.qcy;
import xsna.rr;
import xsna.s3q0;
import xsna.t00;
import xsna.t40;
import xsna.ve0;
import xsna.ver0;
import xsna.wmi0;
import xsna.wn;

/* compiled from: ClipVideoPixelExecutorDelegate.kt */
/* loaded from: classes17.dex */
public final class ClipVideoPixelExecutorDelegate {
    public static final /* synthetic */ qcy<Object>[] h;
    public final w a;
    public final o19 b;
    public final ve0 c;
    public final rr d;
    public final List<StatPixel> e;
    public final AtomicBoolean f;
    public final pgn g;

    /* compiled from: ClipVideoPixelExecutorDelegate.kt */
    public static final class StatPixelSendException extends Throwable {
    }

    /* compiled from: ClipVideoPixelExecutorDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<StatPixel, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(StatPixel statPixel) {
            ClipVideoPixelExecutorDelegate clipVideoPixelExecutorDelegate = (ClipVideoPixelExecutorDelegate) this.receiver;
            List<StatPixel> list = clipVideoPixelExecutorDelegate.e;
            list.remove(statPixel);
            if (clipVideoPixelExecutorDelegate.f.get()) {
                clipVideoPixelExecutorDelegate.b.t(list);
            }
            StatPixel statPixel2 = (StatPixel) j5g.a0(list);
            if (statPixel2 != null) {
                clipVideoPixelExecutorDelegate.a(statPixel2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipVideoPixelExecutorDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipVideoPixelExecutorDelegate.class, "runningExec", "getRunningExec()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        h = new qcy[]{mutablePropertyReference1Impl};
    }

    public ClipVideoPixelExecutorDelegate() {
        throw null;
    }

    public ClipVideoPixelExecutorDelegate(w wVar) {
        o19 o19Var = new o19();
        ve0 ve0Var = new ve0(12);
        rr rrVar = new rr(10);
        this.a = wVar;
        this.b = o19Var;
        this.c = ve0Var;
        this.d = rrVar;
        this.e = dez0.b();
        this.f = new AtomicBoolean(false);
        this.g = new pgn();
        ver0.a(new e0(wmi0.a.e("ClipVideoPixelExecutor.data")).subscribe(new t00(new t40(this, 19), 14), new i22(new lp1(L.a, 1), 9)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final StatPixel statPixel) {
        qcy<Object>[] qcyVarArr = h;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.g;
        if (hg1.d((c) pgnVar.b)) {
            return;
        }
        y q = new m(new Callable() { // from class: xsna.gfd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] bArr = (byte[]) ClipVideoPixelExecutorDelegate.this.c.invoke(statPixel.c);
                if (bArr != null) {
                    return bArr;
                }
                throw new ClipVideoPixelExecutorDelegate.StatPixelSendException("network error");
            }
        }).q(this.a);
        g a2 = q instanceof d ? ((d) q).a() : new b0(q);
        rr rrVar = this.d;
        Objects.requireNonNull(rrVar, "handler is null");
        c subscribe = new n(new r0(a2, rrVar)).t(statPixel).subscribe(new cp0(new a(1, this, ClipVideoPixelExecutorDelegate.class, "drop", "drop(Lcom/vk/dto/common/StatPixel;)V", 0), 12), new wn(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 15));
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(subscribe);
    }
}
