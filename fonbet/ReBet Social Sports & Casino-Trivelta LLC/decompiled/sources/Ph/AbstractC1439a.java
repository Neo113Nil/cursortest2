package Ph;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.Typography;

/* renamed from: Ph.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1439a extends I0 implements C0, Continuation, P {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f9060c;

    public AbstractC1439a(CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            a0((C0) coroutineContext.get(C0.f9001U2));
        }
        this.f9060c = coroutineContext.plus(this);
    }

    @Override // Ph.I0
    public String G() {
        return U.a(this) + " was cancelled";
    }

    public void K0(Object obj) {
        y(obj);
    }

    public final void N0(S s10, Object obj, Function2 function2) {
        s10.b(function2, obj, this);
    }

    @Override // Ph.I0
    public final void Z(Throwable th2) {
        N.a(this.f9060c, th2);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f9060c;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f9060c;
    }

    @Override // Ph.I0
    public String i0() {
        String g10 = J.g(this.f9060c);
        if (g10 == null) {
            return super.i0();
        }
        return Typography.quote + g10 + "\":" + super.i0();
    }

    @Override // Ph.I0, Ph.C0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // Ph.I0
    public final void q0(Object obj) {
        if (!(obj instanceof C)) {
            M0(obj);
        } else {
            C c10 = (C) obj;
            L0(c10.f9000a, c10.a());
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object h02 = h0(E.b(obj));
        if (h02 == J0.f9032b) {
            return;
        }
        K0(h02);
    }

    public void M0(Object obj) {
    }

    public void L0(Throwable th2, boolean z10) {
    }
}
