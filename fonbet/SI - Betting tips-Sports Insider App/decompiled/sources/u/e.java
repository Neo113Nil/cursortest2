package u;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends a.a {
    @Override // a.a
    public final boolean c(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23996b != cVar) {
                    return false;
                }
                gVar.f23996b = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean d(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f23995a != obj) {
                    return false;
                }
                gVar.f23995a = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final boolean e(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f23997c != fVar) {
                    return false;
                }
                gVar.f23997c = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // a.a
    public final void w(f fVar, f fVar2) {
        fVar.f23990b = fVar2;
    }

    @Override // a.a
    public final void x(f fVar, Thread thread) {
        fVar.f23989a = thread;
    }
}
