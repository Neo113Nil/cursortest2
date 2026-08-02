package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mpd implements OnBackAnimationCallback {
    public final /* synthetic */ npd a;

    public mpd(npd npdVar) {
        this.a = npdVar;
    }

    public final void onBackCancelled() {
        npd npdVar = this.a;
        f8d f8dVar = npdVar.a;
        if (f8dVar == null) {
            a70.r("This input is not added to any dispatcher.");
            return;
        }
        if (!npdVar.b) {
            f8dVar.d(npdVar, null);
        }
        n8d n8dVar = f8dVar.b;
        if (npdVar.equals(n8dVar.h) && -1 == n8dVar.g) {
            h8d h8dVar = n8dVar.f;
            if (h8dVar == null) {
                h8dVar = n8dVar.c(-1);
            }
            n8dVar.f = null;
            n8dVar.g = 0;
            n8dVar.h = null;
            p8d p8dVar = p8d.a;
            if (h8dVar != null) {
                h8dVar.d = p8dVar;
                h8dVar.a();
            }
            n8dVar.a.m(null, p8dVar);
        }
        npdVar.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        e8d k = aa.k(backEvent);
        npd npdVar = this.a;
        f8d f8dVar = npdVar.a;
        if (f8dVar == null) {
            a70.r("This input is not added to any dispatcher.");
            return;
        }
        if (npdVar.b) {
            n8d n8dVar = f8dVar.b;
            if (npdVar.equals(n8dVar.h) && -1 == n8dVar.g) {
                h8d h8dVar = n8dVar.f;
                if (h8dVar == null) {
                    h8dVar = n8dVar.c(-1);
                }
                if (h8dVar != null) {
                    h8dVar.d = new q8d(k, -1);
                    h8dVar.c(k);
                }
                n8dVar.a.m(null, new q8d(k, -1));
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        e8d k = aa.k(backEvent);
        npd npdVar = this.a;
        f8d f8dVar = npdVar.a;
        if (f8dVar == null) {
            a70.r("This input is not added to any dispatcher.");
        } else {
            if (npdVar.b) {
                return;
            }
            f8dVar.d(npdVar, k);
            npdVar.b = true;
        }
    }
}
