package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vlg extends umg implements smg {
    public ArrayList h = new ArrayList();
    public Boolean i;
    public Matrix j;
    public int k;
    public String l;

    @Override // defpackage.smg
    public final List a() {
        return this.h;
    }

    @Override // defpackage.smg
    public final void h(wmg wmgVar) {
        if (wmgVar instanceof nmg) {
            this.h.add(wmgVar);
            return;
        }
        throw new wng("Gradient elements cannot contain " + wmgVar + " elements.");
    }
}
