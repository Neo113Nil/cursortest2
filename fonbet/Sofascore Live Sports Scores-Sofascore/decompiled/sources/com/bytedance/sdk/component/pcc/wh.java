package com.bytedance.sdk.component.pcc;

import com.bytedance.sdk.component.pcc.gm;
import defpackage.a70;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class wh {
    private final com.bytedance.sdk.component.pcc.pcc kj;
    private final qf pcc;
    private final vh qf;
    private final Map<String, sf> sf = new HashMap();
    private final nac<String, lu> gm = new nac<>();
    private final Map<String, gm.sf> oo = new HashMap();
    private final List<gbb> vj = new ArrayList();
    private final Set<gm> wh = new HashSet();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        boolean pcc;
        String sf;

        private pcc(boolean z, String str) {
            this.pcc = z;
            this.sf = str;
        }
    }

    public wh(vy vyVar, com.bytedance.sdk.component.pcc.pcc pccVar) {
        this.kj = pccVar;
        this.pcc = vyVar.oo;
        this.qf = vyVar.kj;
    }

    public pcc pcc(gbb gbbVar, vj vjVar) throws Exception {
        sf sfVar = this.sf.get(gbbVar.oo);
        if (sfVar != null) {
            try {
                if (sfVar instanceof oo) {
                    gbbVar.toString();
                    return pcc(gbbVar, (oo) sfVar, vjVar);
                }
            } catch (IllegalStateException unused) {
                gbbVar.toString();
                this.vj.add(gbbVar);
                return new pcc(false, gpj.pcc());
            }
        }
        lu pcc2 = this.gm.pcc(gbbVar.oo);
        if (pcc2 != null) {
            gbbVar.toString();
            return pcc(gbbVar, pcc2, vjVar);
        }
        gm.sf sfVar2 = this.oo.get(gbbVar.oo);
        if (sfVar2 == null) {
            gbbVar.toString();
            return null;
        }
        gm pcc3 = sfVar2.pcc();
        pcc3.pcc(gbbVar.oo);
        gbbVar.toString();
        return pcc(gbbVar, pcc3, vjVar);
    }

    public void pcc(String str, oo<?, ?> ooVar) {
        ooVar.pcc(str);
        this.sf.put(str, ooVar);
    }

    public void pcc(Set<String> set, lu<?, ?> luVar) {
        luVar.pcc(set);
        this.gm.pcc(set, luVar);
        Objects.toString(set);
    }

    public void pcc(String str, gm.sf sfVar) {
        this.oo.put(str, sfVar);
    }

    public void pcc() {
        Iterator<gm> it = this.wh.iterator();
        while (it.hasNext()) {
            it.next().vj();
        }
        this.wh.clear();
        this.sf.clear();
        this.oo.clear();
        this.gm.pcc();
    }

    private pcc pcc(gbb gbbVar, oo ooVar, vj vjVar) throws Exception {
        Object pcc2 = ooVar.pcc(gbbVar.oo, pcc(gbbVar.vj, (sf) ooVar), vjVar);
        return new pcc(true, gpj.pcc(this.pcc.pcc((qf) pcc2), ooVar.sf()));
    }

    private pcc pcc(final gbb gbbVar, final gm gmVar, vj vjVar) throws Exception {
        this.wh.add(gmVar);
        gmVar.pcc(pcc(gbbVar.vj, gmVar), vjVar, new gm.pcc() { // from class: com.bytedance.sdk.component.pcc.wh.1
            @Override // com.bytedance.sdk.component.pcc.gm.pcc
            public void pcc(Object obj) {
                if (wh.this.kj == null) {
                    return;
                }
                wh.this.kj.sf(gpj.pcc(wh.this.pcc.pcc((qf) obj), gmVar.sf()), gbbVar);
                wh.this.wh.remove(gmVar);
            }

            @Override // com.bytedance.sdk.component.pcc.gm.pcc
            public void pcc(Throwable th) {
                if (wh.this.kj == null) {
                    return;
                }
                wh.this.kj.sf(gpj.pcc(th), gbbVar);
                wh.this.wh.remove(gmVar);
            }
        });
        return new pcc(false, gpj.pcc());
    }

    private Object pcc(String str, sf sfVar) throws JSONException {
        return this.pcc.pcc(str, pcc(sfVar)[0]);
    }

    private static Type[] pcc(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        a70.r("Method is not parameterized?!");
        return null;
    }
}
