package defpackage;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.smartadserver1.adsession.Partner;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sjg extends mjg {
    public static String f;
    public ujg d;
    public Partner b = null;
    public boolean c = false;
    public final HashMap e = new HashMap();

    public static String e() {
        if (f == null) {
            gl5 gl5Var = new gl5(3);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                new Thread(gl5Var).start();
            } else {
                gl5Var.run();
            }
        }
        return f;
    }

    @Override // defpackage.mjg
    public final rjg b(View view) {
        return (rjg) this.e.get(view);
    }

    @Override // defpackage.mjg
    public final void c(ia0 ia0Var) {
        this.d = ujg.P(ia0Var);
        e();
        hkg.T().post(new pyn(this, ia0Var, false, 19));
    }

    @Override // defpackage.mjg
    public final rjg d(ViewGroup viewGroup, List list, boolean z, boolean z2, pgg pggVar) {
        sjg sjgVar;
        ViewGroup viewGroup2;
        if (!this.c) {
            return null;
        }
        if (b(viewGroup) == null) {
            sjgVar = this;
            viewGroup2 = viewGroup;
            njg njgVar = new njg(sjgVar, list, viewGroup2, z, z2, pggVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                njgVar.run();
            } else {
                synchronized (njgVar) {
                    hkg.T().post(njgVar);
                    try {
                        njgVar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            sjgVar = this;
            viewGroup2 = viewGroup;
        }
        return sjgVar.b(viewGroup2);
    }
}
