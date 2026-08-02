package defpackage;

import com.google.android.gms.internal.play_billing.zzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dvo extends hda {
    @Override // defpackage.hda
    public final void W(dxo dxoVar, dxo dxoVar2) {
        dxoVar.b = dxoVar2;
    }

    @Override // defpackage.hda
    public final void Y(dxo dxoVar, Thread thread) {
        dxoVar.a = thread;
    }

    @Override // defpackage.hda
    public final boolean a0(zzo zzoVar, vjo vjoVar, vjo vjoVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.b != vjoVar) {
                    return false;
                }
                zzoVar.b = vjoVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hda
    public final boolean b0(zzo zzoVar, Object obj, Object obj2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.a != obj) {
                    return false;
                }
                zzoVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hda
    public final boolean c0(zzo zzoVar, dxo dxoVar, dxo dxoVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.c != dxoVar) {
                    return false;
                }
                zzoVar.c = dxoVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
