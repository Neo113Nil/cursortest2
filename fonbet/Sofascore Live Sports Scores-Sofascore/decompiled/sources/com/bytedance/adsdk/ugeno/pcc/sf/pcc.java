package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.pcc.vj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc {
    protected Map<Float, String> gm;
    protected vj oo;
    protected Context pcc;
    protected com.bytedance.adsdk.ugeno.sf.gm qf;
    protected String sf;
    protected List<PropertyValuesHolder> wh = new ArrayList();
    protected List<Keyframe> vj = new ArrayList();

    public pcc(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Map<Float, String> map) {
        this.pcc = context;
        this.sf = str;
        this.gm = map;
        this.oo = vj.pcc(this.sf);
        this.qf = gmVar;
    }

    public void gm() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.gm;
        if (map2 instanceof TreeMap) {
            Float f = (Float) ((TreeMap) map2).lastKey();
            if (f.floatValue() != 100.0f) {
                pcc(100.0f, this.gm.get(f));
            }
        }
    }

    public void oo() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!pcc()) {
            sf();
        }
        for (Map.Entry<Float, String> entry : this.gm.entrySet()) {
            if (entry != null) {
                pcc(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        gm();
    }

    public abstract void pcc(float f, String str);

    public boolean pcc() {
        Map<Float, String> map = this.gm;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.gm.containsKey(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public abstract void sf();

    public List<PropertyValuesHolder> vj() {
        String sf = this.oo.sf();
        oo();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(sf, (Keyframe[]) this.vj.toArray(new Keyframe[0]));
        TypeEvaluator wh = wh();
        if (wh != null) {
            ofKeyframe.setEvaluator(wh);
        }
        this.wh.add(ofKeyframe);
        return this.wh;
    }

    public abstract TypeEvaluator wh();
}
