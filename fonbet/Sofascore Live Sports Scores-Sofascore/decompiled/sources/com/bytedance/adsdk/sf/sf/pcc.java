package com.bytedance.adsdk.sf.sf;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.sf.gm;
import com.bytedance.adsdk.sf.gm.qf;
import defpackage.mz1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private final AssetManager oo;
    private gm vj;
    private final qf<String> pcc = new qf<>();
    private final Map<qf<String>, Typeface> sf = new HashMap();
    private final Map<String, Typeface> gm = new HashMap();
    private String wh = ".ttf";

    public pcc(Drawable.Callback callback, gm gmVar) {
        this.vj = gmVar;
        if (callback instanceof View) {
            this.oo = ((View) callback).getContext().getAssets();
        } else {
            this.oo = null;
        }
    }

    private Typeface sf(com.bytedance.adsdk.sf.gm.gm gmVar) {
        Typeface typeface;
        String pcc = gmVar.pcc();
        Typeface typeface2 = this.gm.get(pcc);
        if (typeface2 != null) {
            return typeface2;
        }
        String gm = gmVar.gm();
        String sf = gmVar.sf();
        gm gmVar2 = this.vj;
        if (gmVar2 != null) {
            typeface = gmVar2.pcc(pcc, gm, sf);
            if (typeface == null) {
                typeface = this.vj.pcc(pcc);
            }
        } else {
            typeface = null;
        }
        gm gmVar3 = this.vj;
        if (gmVar3 != null && typeface == null) {
            String sf2 = gmVar3.sf(pcc, gm, sf);
            if (sf2 == null) {
                sf2 = this.vj.sf(pcc);
            }
            if (sf2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.oo, sf2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (gmVar.oo() != null) {
            return gmVar.oo();
        }
        if (typeface == null) {
            StringBuilder r = mz1.r("fonts/", pcc);
            r.append(this.wh);
            try {
                typeface = Typeface.createFromAsset(this.oo, r.toString());
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.gm.put(pcc, typeface);
        return typeface;
    }

    public Typeface pcc(com.bytedance.adsdk.sf.gm.gm gmVar) {
        this.pcc.pcc(gmVar.pcc(), gmVar.gm());
        Typeface typeface = this.sf.get(this.pcc);
        if (typeface != null) {
            return typeface;
        }
        Typeface pcc = pcc(sf(gmVar), gmVar.gm());
        this.sf.put(this.pcc, pcc);
        return pcc;
    }

    public void pcc(String str) {
        this.wh = str;
    }

    public void pcc(gm gmVar) {
        this.vj = gmVar;
    }

    private Typeface pcc(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
