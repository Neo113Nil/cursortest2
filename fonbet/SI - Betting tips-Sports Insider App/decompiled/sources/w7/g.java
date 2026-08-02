package w7;

import g6.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final m f24979a = new m();

    public final void a(Exception exc) {
        this.f24979a.n(exc);
    }

    public final void b(Object obj) {
        this.f24979a.m(obj);
    }

    public final boolean c(Exception exc) {
        m mVar = this.f24979a;
        mVar.getClass();
        v.i(exc, "Exception must not be null");
        synchronized (mVar.f24998a) {
            try {
                if (mVar.f25000c) {
                    return false;
                }
                mVar.f25000c = true;
                mVar.f25003f = exc;
                mVar.f24999b.f(mVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Object obj) {
        m mVar = this.f24979a;
        synchronized (mVar.f24998a) {
            try {
                if (mVar.f25000c) {
                    return;
                }
                mVar.f25000c = true;
                mVar.f25002e = obj;
                mVar.f24999b.f(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
