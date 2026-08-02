package defpackage;

import android.app.Application;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ec4 implements uff {
    public final /* synthetic */ int a;
    public final qn2 b;

    public /* synthetic */ ec4(qn2 qn2Var, int i) {
        this.a = i;
        this.b = qn2Var;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        qn2 qn2Var = this.b;
        switch (i) {
            case 0:
                kz7 kz7Var = (kz7) ((uff) qn2Var.b).get();
                if (kz7Var == null) {
                    yhk.s("Cannot return null from a non-@Nullable component method");
                    break;
                } else {
                    break;
                }
            case 1:
                iw1 iw1Var = (iw1) ((uff) qn2Var.c).get();
                if (iw1Var == null) {
                    yhk.s("Cannot return null from a non-@Nullable component method");
                    break;
                } else {
                    break;
                }
            case 2:
                LinkedHashMap linkedHashMap = new LinkedHashMap(11);
                linkedHashMap.put("IMAGE_ONLY_PORTRAIT", (k2a) qn2Var.d);
                linkedHashMap.put("IMAGE_ONLY_LANDSCAPE", (k2a) qn2Var.e);
                linkedHashMap.put("MODAL_LANDSCAPE", (k2a) qn2Var.f);
                linkedHashMap.put("MODAL_PORTRAIT", (k2a) qn2Var.g);
                linkedHashMap.put("CARD_LANDSCAPE", (k2a) qn2Var.h);
                linkedHashMap.put("CARD_PORTRAIT", (k2a) qn2Var.i);
                linkedHashMap.put("BANNER_PORTRAIT", (k2a) qn2Var.j);
                linkedHashMap.put("BANNER_LANDSCAPE", (k2a) qn2Var.k);
                Map unmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
                if (unmodifiableMap == null) {
                    yhk.s("Cannot return null from a non-@Nullable component method");
                    break;
                } else {
                    break;
                }
            default:
                Application application = (Application) ((uff) qn2Var.a).get();
                if (application == null) {
                    yhk.s("Cannot return null from a non-@Nullable component method");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
