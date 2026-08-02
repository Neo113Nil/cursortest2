package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class jad implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sx2 b;

    public /* synthetic */ jad(sx2 sx2Var, int i) {
        this.a = i;
        this.b = sx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        sx2 sx2Var = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) sx2Var.b).iterator();
                while (it.hasNext()) {
                    v5b v5bVar = ((u5b) it.next()).a;
                    if (v5bVar.d) {
                        ike ikeVar = v5bVar.c;
                        snl youtubePlayer$core_release = v5bVar.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release();
                        ikeVar.getClass();
                        youtubePlayer$core_release.getClass();
                        String str = ikeVar.d;
                        if (str != null) {
                            boolean z = ikeVar.b;
                            if (z && ikeVar.c == ane.c) {
                                aik.Z(youtubePlayer$core_release, ikeVar.a, str, ikeVar.e);
                            } else if (!z && ikeVar.c == ane.c) {
                                xnl xnlVar = (xnl) youtubePlayer$core_release;
                                xnlVar.b(xnlVar.a, "cueVideo", str, Float.valueOf(ikeVar.e));
                            }
                            ikeVar.c = null;
                        }
                    } else {
                        v5bVar.e.invoke();
                    }
                }
                break;
            default:
                Iterator it2 = ((ArrayList) sx2Var.b).iterator();
                while (it2.hasNext()) {
                    ((u5b) it2.next()).getClass();
                }
                break;
        }
    }
}
