package com.bytedance.adsdk.ugeno.pcc.sf;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.pcc.vj;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends pcc {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.pcc.sf.sf$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[vj.values().length];
            pcc = iArr;
            try {
                iArr[vj.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[vj.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[vj.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                pcc[vj.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                pcc[vj.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                pcc[vj.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                pcc[vj.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                pcc[vj.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                pcc[vj.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public sf(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, TreeMap<Float, String> treeMap) {
        super(context, gmVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void pcc(float f, String str) {
        this.vj.add(Keyframe.ofFloat(f, (this.sf.startsWith(vj.TRANSLATE.pcc()) || this.oo == vj.BORDER_RADIUS) ? kj.pcc(this.pcc, com.bytedance.adsdk.ugeno.qf.gm.pcc(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : com.bytedance.adsdk.ugeno.qf.gm.pcc(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public void sf() {
        float jr;
        switch (AnonymousClass1.pcc[this.oo.ordinal()]) {
            case 1:
                jr = this.qf.jr();
                break;
            case 2:
                jr = this.qf.dax();
                break;
            case 3:
                jr = this.qf.nac();
                break;
            case 4:
                jr = this.qf.lu();
                break;
            case 5:
                jr = this.qf.gpj();
                if (this.qf.vh() != null) {
                    this.qf.vh().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                jr = this.qf.lo();
                if (this.qf.vh() != null) {
                    this.qf.vh().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                jr = this.qf.fum();
                break;
            case 8:
                jr = this.qf.tz();
                break;
            case 9:
                jr = this.qf.of();
                break;
            default:
                jr = 0.0f;
                break;
        }
        this.vj.add(Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, jr));
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf.pcc
    public TypeEvaluator wh() {
        return new FloatEvaluator();
    }
}
