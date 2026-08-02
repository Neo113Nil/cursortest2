package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w6p extends u6p {
    private w6p() {
        throw null;
    }

    @Override // defpackage.u6p
    public final void a(y6p y6pVar, Thread thread) {
        y6pVar.a = thread;
    }

    @Override // defpackage.u6p
    public final void b(y6p y6pVar, y6p y6pVar2) {
        y6pVar.b = y6pVar2;
    }

    @Override // defpackage.u6p
    public final boolean c(z6p z6pVar, y6p y6pVar, y6p y6pVar2) {
        synchronized (z6pVar) {
            try {
                if (z6pVar.c != y6pVar) {
                    return false;
                }
                z6pVar.c = y6pVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u6p
    public final boolean d(t6p t6pVar, q6p q6pVar, q6p q6pVar2) {
        synchronized (t6pVar) {
            try {
                if (t6pVar.b != q6pVar) {
                    return false;
                }
                t6pVar.b = q6pVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u6p
    public final y6p e(t6p t6pVar) {
        y6p y6pVar;
        y6p y6pVar2 = y6p.c;
        synchronized (t6pVar) {
            try {
                y6pVar = t6pVar.c;
                if (y6pVar != y6pVar2) {
                    t6pVar.c = y6pVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y6pVar;
    }

    @Override // defpackage.u6p
    public final q6p f(t6p t6pVar, q6p q6pVar) {
        q6p q6pVar2;
        synchronized (t6pVar) {
            try {
                q6pVar2 = t6pVar.b;
                if (q6pVar2 != q6pVar) {
                    t6pVar.b = q6pVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q6pVar2;
    }

    @Override // defpackage.u6p
    public final boolean g(z6p z6pVar, Object obj, Object obj2) {
        synchronized (z6pVar) {
            try {
                if (z6pVar.a != obj) {
                    return false;
                }
                z6pVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
