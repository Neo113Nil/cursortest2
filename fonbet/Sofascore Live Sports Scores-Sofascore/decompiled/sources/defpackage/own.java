package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class own extends wca {
    @Override // defpackage.wca
    public final iwn L(zzcu zzcuVar) {
        iwn iwnVar;
        iwn iwnVar2 = iwn.d;
        synchronized (zzcuVar) {
            try {
                iwnVar = zzcuVar.b;
                if (iwnVar != iwnVar2) {
                    zzcuVar.b = iwnVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iwnVar;
    }

    @Override // defpackage.wca
    public final qwn M(zzcu zzcuVar) {
        qwn qwnVar;
        qwn qwnVar2 = qwn.c;
        synchronized (zzcuVar) {
            try {
                qwnVar = zzcuVar.c;
                if (qwnVar != qwnVar2) {
                    zzcuVar.c = qwnVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qwnVar;
    }

    @Override // defpackage.wca
    public final void N(qwn qwnVar, qwn qwnVar2) {
        qwnVar.b = qwnVar2;
    }

    @Override // defpackage.wca
    public final void P(qwn qwnVar, Thread thread) {
        qwnVar.a = thread;
    }

    @Override // defpackage.wca
    public final boolean R(zzcu zzcuVar, iwn iwnVar, iwn iwnVar2) {
        synchronized (zzcuVar) {
            try {
                if (zzcuVar.b != iwnVar) {
                    return false;
                }
                zzcuVar.b = iwnVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wca
    public final boolean S(twn twnVar, Object obj, Object obj2) {
        synchronized (twnVar) {
            try {
                if (twnVar.a != obj) {
                    return false;
                }
                twnVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wca
    public final boolean T(twn twnVar, qwn qwnVar, qwn qwnVar2) {
        synchronized (twnVar) {
            try {
                if (twnVar.c != qwnVar) {
                    return false;
                }
                twnVar.c = qwnVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
