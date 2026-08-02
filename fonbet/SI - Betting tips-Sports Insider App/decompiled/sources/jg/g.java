package jg;

import eg.k0;
import eg.w0;
import eg.w1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class g extends k0 implements mf.d, Continuation {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18497h = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final eg.w f18498d;

    /* renamed from: e, reason: collision with root package name */
    public final mf.c f18499e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18500f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18501g;

    public g(eg.w wVar, mf.c cVar) {
        super(-1);
        this.f18498d = wVar;
        this.f18499e = cVar;
        this.f18500f = h.f18502a;
        this.f18501g = y.b(cVar.getContext());
    }

    @Override // mf.d
    public final mf.d getCallerFrame() {
        return this.f18499e;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f18499e.getContext();
    }

    @Override // eg.k0
    public final Object j() {
        Object obj = this.f18500f;
        this.f18500f = h.f18502a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable a7 = gf.q.a(obj);
        Object tVar = a7 == null ? obj : new eg.t(a7, false);
        mf.c cVar = this.f18499e;
        CoroutineContext context = cVar.getContext();
        eg.w wVar = this.f18498d;
        if (h.h(wVar, context)) {
            this.f18500f = tVar;
            this.f9185c = 0;
            h.g(wVar, cVar.getContext(), this);
            return;
        }
        w0 a10 = w1.a();
        if (a10.f9232c >= 4294967296L) {
            this.f18500f = tVar;
            this.f9185c = 0;
            a10.j0(this);
            return;
        }
        a10.l0(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object c2 = y.c(context2, this.f18501g);
            try {
                cVar.resumeWith(obj);
                Unit unit = Unit.f19194a;
                while (a10.q0()) {
                }
            } finally {
                y.a(context2, c2);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f18498d + ", " + eg.c0.y(this.f18499e) + ']';
    }

    @Override // eg.k0
    public final Continuation d() {
        return this;
    }
}
