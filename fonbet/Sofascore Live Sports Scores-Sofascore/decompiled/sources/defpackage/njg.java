package defpackage;

import android.view.View;
import android.webkit.WebView;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class njg implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ pgg e;
    public final /* synthetic */ sjg f;

    public njg(sjg sjgVar, List list, View view, boolean z, boolean z2, pgg pggVar) {
        this.f = sjgVar;
        this.a = list;
        this.b = view;
        this.c = z;
        this.d = z2;
        this.e = pggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.a;
        lkg lkgVar = (list == null || list.size() <= 0) ? null : (lkg) this.a.get((int) (Math.random() * this.a.size()));
        try {
            sjg sjgVar = this.f;
            this.f.e.put(this.b, new rjg(sjgVar, sjgVar.b, this.b, this.a, this.c, this.d));
            fjg.c().f(1);
            pgg pggVar = this.e;
            if (pggVar != null && lkgVar != null) {
                ((qgg) pggVar).j(lkgVar.a, ((nkg) lkgVar.b.get(0)).b);
            }
        } catch (IllegalArgumentException e) {
            fjg c = fjg.c();
            e.getMessage();
            c.f(1);
            pgg pggVar2 = this.e;
            if (pggVar2 != null) {
                int i = this.b instanceof WebView ? 2 : 1;
                if (lkgVar != null) {
                    ((qgg) pggVar2).i(e, lkgVar.a, ((nkg) lkgVar.b.get(0)).b, i);
                } else {
                    ((qgg) pggVar2).i(e, null, null, i);
                }
            }
        }
        synchronized (this) {
            notify();
        }
    }
}
