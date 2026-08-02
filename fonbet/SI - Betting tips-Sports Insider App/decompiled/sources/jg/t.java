package jg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class t extends eg.a implements mf.d {

    /* renamed from: d, reason: collision with root package name */
    public final Continuation f18525d;

    public t(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f18525d = continuation;
    }

    @Override // eg.m1
    public final boolean P() {
        return true;
    }

    @Override // mf.d
    public final mf.d getCallerFrame() {
        Continuation continuation = this.f18525d;
        if (continuation instanceof mf.d) {
            return (mf.d) continuation;
        }
        return null;
    }

    @Override // eg.m1
    public void j(Object obj) {
        h.f(eg.c0.u(obj), lf.d.b(this.f18525d));
    }

    @Override // eg.m1
    public void l(Object obj) {
        this.f18525d.resumeWith(eg.c0.u(obj));
    }

    public void k0() {
    }
}
