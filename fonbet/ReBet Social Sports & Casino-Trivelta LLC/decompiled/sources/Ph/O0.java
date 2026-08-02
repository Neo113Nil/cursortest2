package Ph;

import Ph.C0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes5.dex */
public final class O0 extends AbstractCoroutineContextElement implements C0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O0 f9045a = new O0();

    public O0() {
        super(C0.f9001U2);
    }

    @Override // Ph.C0
    public InterfaceC1478u attachChild(InterfaceC1482w interfaceC1482w) {
        return P0.f9046a;
    }

    @Override // Ph.C0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // Ph.C0
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Ph.C0
    public Sequence getChildren() {
        return SequencesKt.emptySequence();
    }

    @Override // Ph.C0
    public Vh.a getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ph.C0
    public C0 getParent() {
        return null;
    }

    @Override // Ph.C0
    public InterfaceC1456i0 invokeOnCompletion(Function1 function1) {
        return P0.f9046a;
    }

    @Override // Ph.C0
    public boolean isActive() {
        return true;
    }

    @Override // Ph.C0
    public boolean isCancelled() {
        return false;
    }

    @Override // Ph.C0
    public boolean isCompleted() {
        return false;
    }

    @Override // Ph.C0
    public Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Ph.C0
    public C0 plus(C0 c02) {
        return C0.a.g(this, c02);
    }

    @Override // Ph.C0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // Ph.C0
    public void cancel(CancellationException cancellationException) {
    }

    @Override // Ph.C0
    public InterfaceC1456i0 invokeOnCompletion(boolean z10, boolean z11, Function1 function1) {
        return P0.f9046a;
    }

    @Override // Ph.C0
    public /* synthetic */ boolean cancel(Throwable th2) {
        return false;
    }
}
