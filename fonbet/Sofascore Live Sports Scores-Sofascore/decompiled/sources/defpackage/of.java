package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class of {
    public njd c;
    public int a = 1;
    public boolean b = true;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final ArrayList e = new ArrayList();

    public abstract void a();

    public final void b(zf zfVar) {
        int i;
        zfVar.getClass();
        int ordinal = zfVar.ordinal();
        if (ordinal != 0) {
            i = 3;
            if (ordinal != 1) {
                if (ordinal == 3) {
                    i = 4;
                } else if (ordinal != 4) {
                    i = ordinal != 10 ? this.a : 5;
                }
            }
        } else {
            i = 2;
        }
        this.a = i;
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((nf) it.next()).onAdEvent(zfVar);
        }
        if (zfVar == zf.j) {
            copyOnWriteArraySet.clear();
        }
    }

    public final void c(qcd qcdVar) {
        String message = qcdVar.getMessage();
        if (message == null) {
            switch (qcdVar.a) {
                case 1:
                    message = "NOT_INITIALIZED";
                    break;
                case 2:
                    message = "NO_BID";
                    break;
                case 3:
                    message = "NETWORK_ERROR";
                    break;
                case 4:
                    message = "RENDERER_ERROR";
                    break;
                case 5:
                    message = "CONTROLLER_ERROR";
                    break;
                case 6:
                    message = "WEBVIEW_ERROR";
                    break;
                default:
                    throw null;
            }
        }
        cjb.a(message);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((nf) it.next()).onError(qcdVar);
        }
    }

    public final void d(int i, Rect rect) {
        rect.getClass();
        i(i, rect);
    }

    public float e() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public abstract View f();

    public abstract int g();

    public void i(int i, Rect rect) {
        rect.getClass();
    }

    public abstract void k(int i);

    public abstract void l();

    public abstract void m();

    public void onError(qcd qcdVar) {
        c(qcdVar);
    }

    public void h() {
    }

    public void j(boolean z) {
    }
}
