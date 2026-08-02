package defpackage;

import com.google.android.gms.internal.ads.zzhbr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dlo extends w3a {
    @Override // defpackage.w3a
    public final void X(flo floVar, Thread thread) {
        floVar.a = thread;
    }

    @Override // defpackage.w3a
    public final void Y(flo floVar, flo floVar2) {
        floVar.b = floVar2;
    }

    @Override // defpackage.w3a
    public final boolean Z(glo gloVar, flo floVar, flo floVar2) {
        synchronized (gloVar) {
            try {
                if (gloVar.c != floVar) {
                    return false;
                }
                gloVar.c = floVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w3a
    public final boolean a0(zzhbr zzhbrVar, zko zkoVar, zko zkoVar2) {
        synchronized (zzhbrVar) {
            try {
                if (zzhbrVar.b != zkoVar) {
                    return false;
                }
                zzhbrVar.b = zkoVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w3a
    public final flo b0(zzhbr zzhbrVar) {
        flo floVar;
        flo floVar2 = flo.c;
        synchronized (zzhbrVar) {
            try {
                floVar = zzhbrVar.c;
                if (floVar != floVar2) {
                    zzhbrVar.c = floVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return floVar;
    }

    @Override // defpackage.w3a
    public final zko d0(zzhbr zzhbrVar) {
        zko zkoVar;
        zko zkoVar2 = zko.d;
        synchronized (zzhbrVar) {
            try {
                zkoVar = zzhbrVar.b;
                if (zkoVar != zkoVar2) {
                    zzhbrVar.b = zkoVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zkoVar;
    }

    @Override // defpackage.w3a
    public final boolean e0(glo gloVar, Object obj, Object obj2) {
        synchronized (gloVar) {
            try {
                if (gloVar.a != obj) {
                    return false;
                }
                gloVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
