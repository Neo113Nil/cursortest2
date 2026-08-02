package com.bytedance.adsdk.ugeno.yoga;

import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.cp4;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@com.bytedance.adsdk.ugeno.yoga.pcc.pcc
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends ork implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    private float[] arr;
    private List<YogaNodeJNIBase> gm;

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    private int mLayoutDirection;
    private qf oo;
    protected long pcc;
    private boolean qf;
    private YogaNodeJNIBase sf;
    private sf vj;
    private Object wh;

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.qf = true;
        if (j != 0) {
            this.pcc = j;
        } else {
            a70.r("Failed to allocate native memory");
            throw null;
        }
    }

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.gm;
        if (list == null) {
            a70.r("Cannot replace child. YogaNode does not have children");
            return 0L;
        }
        list.remove(i);
        this.gm.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.sf = this;
        return yogaNodeJNIBase.pcc;
    }

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    public final float baseline(float f, float f2) {
        return this.vj.pcc(this, f, f2);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase pcc(int i) {
        List<YogaNodeJNIBase> list = this.gm;
        if (list != null) {
            return list.get(i);
        }
        a70.r("YogaNode does not have children");
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public float kj() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[1] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @com.bytedance.adsdk.ugeno.yoga.pcc.pcc
    public final long measure(float f, int i, float f2, int i2) {
        if (tmg()) {
            return this.oo.pcc(this, f, kj.pcc(i), f2, kj.pcc(i2));
        }
        cp4.h("Measure function isn't defined!");
        return 0L;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase sf(int i) {
        List<YogaNodeJNIBase> list = this.gm;
        if (list == null) {
            a70.r("Trying to remove a child of a YogaNode that does not have children");
            return null;
        }
        YogaNodeJNIBase remove = list.remove(i);
        remove.sf = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.pcc, remove.pcc);
        return remove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void ork(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(float f, float f2) {
        sf((ork) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.gm;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.sf(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].pcc;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.pcc, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public float qf() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[4] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void sf(pcc pccVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.pcc, pccVar.pcc());
    }

    public boolean tmg() {
        return this.oo != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void vh(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void vj(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public float vy() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[2] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public float wh() {
        float[] fArr = this.arr;
        return fArr != null ? fArr[3] : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public Object ork() {
        return this.wh;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    /* renamed from: vh, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase sf() {
        return this.sf;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void vj() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.pcc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void tmg(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void kj(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void qf(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void vy(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void wh(float f) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.pcc, f);
    }

    private void sf(ork orkVar) {
        ork();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void sf(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void sf(oo ooVar, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.pcc, ooVar.pcc(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void gm(pcc pccVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.pcc, pccVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void gm(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void gm() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.pcc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void gm(oo ooVar, float f) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.pcc, ooVar.pcc(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void oo(float f) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.pcc, f);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void oo() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.pcc);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public int pcc() {
        List<YogaNodeJNIBase> list = this.gm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(ork orkVar, int i) {
        if (orkVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) orkVar;
            if (yogaNodeJNIBase.sf == null) {
                List list = this.gm;
                if (list == null) {
                    list = new ArrayList(4);
                    this.gm = list;
                }
                list.add(i, yogaNodeJNIBase);
                yogaNodeJNIBase.sf = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.pcc, yogaNodeJNIBase.pcc, i);
                return;
            }
            a70.r("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public int pcc(ork orkVar) {
        List<YogaNodeJNIBase> list = this.gm;
        if (list == null) {
            return -1;
        }
        return list.indexOf(orkVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(gm gmVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.pcc, gmVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(vj vjVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.pcc, vjVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(wh whVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.pcc, whVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(pcc pccVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.pcc, pccVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(hc hcVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.pcc, hcVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(gbb gbbVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.pcc, gbbVar.pcc());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.pcc, f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(oo ooVar, float f) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.pcc, ooVar.pcc(), f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(qf qfVar) {
        this.oo = qfVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.pcc, qfVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(boolean z) {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.pcc, z);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.ork
    public void pcc(Object obj) {
        this.wh = obj;
    }
}
