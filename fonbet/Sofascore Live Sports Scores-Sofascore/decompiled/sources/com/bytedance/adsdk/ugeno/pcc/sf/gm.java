package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.pcc.vj;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends pcc {
    public gm(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, TreeMap<Float, String> treeMap) {
        super(context, gmVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void pcc(float f, String str) {
        this.vj.add(this.oo == vj.BACKGROUND_COLOR ? Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.qf.pcc.pcc(str)) : Keyframe.ofInt(f, com.bytedance.adsdk.ugeno.qf.gm.pcc(str, 0)));
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void sf() {
        if (this.oo == vj.BACKGROUND_COLOR) {
            this.vj.add(Keyframe.ofInt(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.qf.kun()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public TypeEvaluator wh() {
        return this.oo == vj.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }
}
