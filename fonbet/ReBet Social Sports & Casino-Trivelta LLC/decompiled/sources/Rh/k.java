package Rh;

import Ph.AbstractC1439a;
import Ph.D0;
import Ph.I0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public abstract class k extends AbstractC1439a implements j {

    /* renamed from: d, reason: collision with root package name */
    public final j f10365d;

    public k(CoroutineContext coroutineContext, j jVar, boolean z10, boolean z11) {
        super(coroutineContext, z10, z11);
        this.f10365d = jVar;
    }

    @Override // Ph.I0
    public void D(Throwable th2) {
        CancellationException C02 = I0.C0(this, th2, null, 1, null);
        this.f10365d.cancel(C02);
        B(C02);
    }

    public final j O0() {
        return this.f10365d;
    }

    @Override // Rh.B
    public boolean a(Throwable th2) {
        return this.f10365d.a(th2);
    }

    @Override // Ph.I0, Ph.C0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new D0(G(), null, this);
        }
        D(cancellationException);
    }

    @Override // Rh.B
    public void g(Function1 function1) {
        this.f10365d.g(function1);
    }

    @Override // Rh.B
    public Object h(Object obj) {
        return this.f10365d.h(obj);
    }

    @Override // Rh.A
    public Object i() {
        return this.f10365d.i();
    }

    @Override // Rh.A
    public boolean isEmpty() {
        return this.f10365d.isEmpty();
    }

    @Override // Rh.A
    public l iterator() {
        return this.f10365d.iterator();
    }

    @Override // Rh.A
    public Object j(Continuation continuation) {
        Object j10 = this.f10365d.j(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return j10;
    }

    @Override // Rh.A
    public Object m(Continuation continuation) {
        return this.f10365d.m(continuation);
    }

    @Override // Rh.B
    public Object o(Object obj, Continuation continuation) {
        return this.f10365d.o(obj, continuation);
    }

    @Override // Rh.B
    public boolean p() {
        return this.f10365d.p();
    }

    @Override // Ph.I0, Ph.C0
    public /* synthetic */ void cancel() {
        D(new D0(G(), null, this));
    }

    @Override // Ph.I0, Ph.C0
    public final /* synthetic */ boolean cancel(Throwable th2) {
        D(new D0(G(), null, this));
        return true;
    }

    public final j d() {
        return this;
    }
}
