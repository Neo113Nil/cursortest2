package ig;

import eg.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class u extends mf.c implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final hg.h f11286a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f11287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11288c;

    /* renamed from: d, reason: collision with root package name */
    public CoroutineContext f11289d;

    /* renamed from: e, reason: collision with root package name */
    public Continuation f11290e;

    public u(hg.h hVar, CoroutineContext coroutineContext) {
        super(s.f11283a, kotlin.coroutines.g.f19227a);
        this.f11286a = hVar;
        this.f11287b = coroutineContext;
        this.f11288c = ((Number) coroutineContext.O(0, new fc.a(28))).intValue();
    }

    public final Object c(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        c0.k(context);
        CoroutineContext coroutineContext = this.f11289d;
        if (coroutineContext != context) {
            if (coroutineContext instanceof p) {
                throw new IllegalStateException(kotlin.text.t.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) coroutineContext).f11282b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.O(0, new xh.a(2, this))).intValue() != this.f11288c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11287b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f11289d = context;
        }
        this.f11290e = continuation;
        vf.a aVar = w.f11292a;
        hg.h hVar = this.f11286a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = aVar.invoke(hVar, obj, this);
        if (!Intrinsics.areEqual(invoke, lf.a.f20034a)) {
            this.f11290e = null;
        }
        return invoke;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation frame) {
        try {
            Object c2 = c(frame, obj);
            lf.a aVar = lf.a.f20034a;
            if (c2 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return c2 == aVar ? c2 : Unit.f19194a;
        } catch (Throwable th2) {
            this.f11289d = new p(th2, frame.getContext());
            throw th2;
        }
    }

    @Override // mf.a, mf.d
    public final mf.d getCallerFrame() {
        Continuation continuation = this.f11290e;
        if (continuation instanceof mf.d) {
            return (mf.d) continuation;
        }
        return null;
    }

    @Override // mf.c, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f11289d;
        return coroutineContext == null ? kotlin.coroutines.g.f19227a : coroutineContext;
    }

    @Override // mf.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        Throwable a7 = gf.q.a(obj);
        if (a7 != null) {
            this.f11289d = new p(a7, getContext());
        }
        Continuation continuation = this.f11290e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return lf.a.f20034a;
    }
}
