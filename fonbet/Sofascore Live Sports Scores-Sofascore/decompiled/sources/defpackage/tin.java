package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tin extends haa {
    @Override // defpackage.haa
    public final void P(vin vinVar, Thread thread) {
        vinVar.a = thread;
    }

    @Override // defpackage.haa
    public final void R(vin vinVar, vin vinVar2) {
        vinVar.b = vinVar2;
    }

    @Override // defpackage.haa
    public final boolean T(yin yinVar, vin vinVar, vin vinVar2) {
        synchronized (yinVar) {
            try {
                if (yinVar.c != vinVar) {
                    return false;
                }
                yinVar.c = vinVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.haa
    public final vin U(yin yinVar) {
        vin vinVar;
        vin vinVar2 = vin.c;
        synchronized (yinVar) {
            try {
                vinVar = yinVar.c;
                if (vinVar != vinVar2) {
                    yinVar.c = vinVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vinVar;
    }

    @Override // defpackage.haa
    public final jin W(yin yinVar) {
        jin jinVar;
        jin jinVar2 = jin.b;
        synchronized (yinVar) {
            try {
                jinVar = yinVar.b;
                if (jinVar != jinVar2) {
                    yinVar.b = jinVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jinVar;
    }

    @Override // defpackage.haa
    public final boolean Z(yin yinVar, Object obj, Object obj2) {
        synchronized (yinVar) {
            try {
                if (yinVar.a != obj) {
                    return false;
                }
                yinVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
