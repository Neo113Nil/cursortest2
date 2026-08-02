package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fap extends sha {
    @Override // defpackage.sha
    public final void a0(hap hapVar, Thread thread) {
        hapVar.a = thread;
    }

    @Override // defpackage.sha
    public final void b0(hap hapVar, hap hapVar2) {
        hapVar.b = hapVar2;
    }

    @Override // defpackage.sha
    public final boolean c0(iap iapVar, hap hapVar, hap hapVar2) {
        synchronized (iapVar) {
            try {
                if (iapVar.c != hapVar) {
                    return false;
                }
                iapVar.c = hapVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sha
    public final boolean d0(iap iapVar, dap dapVar, dap dapVar2) {
        synchronized (iapVar) {
            try {
                if (iapVar.b != dapVar) {
                    return false;
                }
                iapVar.b = dapVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sha
    public final hap e0(iap iapVar) {
        hap hapVar;
        hap hapVar2 = hap.c;
        synchronized (iapVar) {
            try {
                hapVar = iapVar.c;
                if (hapVar != hapVar2) {
                    iapVar.c = hapVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hapVar;
    }

    @Override // defpackage.sha
    public final dap g0(iap iapVar) {
        dap dapVar;
        dap dapVar2 = dap.d;
        synchronized (iapVar) {
            try {
                dapVar = iapVar.b;
                if (dapVar != dapVar2) {
                    iapVar.b = dapVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dapVar;
    }

    @Override // defpackage.sha
    public final boolean h0(iap iapVar, Object obj, Object obj2) {
        synchronized (iapVar) {
            try {
                if (iapVar.a != obj) {
                    return false;
                }
                iapVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
