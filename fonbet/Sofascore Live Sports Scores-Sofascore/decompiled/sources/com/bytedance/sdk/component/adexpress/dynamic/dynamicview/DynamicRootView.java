package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.oo {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private vj dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.wh.pcc mDynamicClickListener;
    boolean mIsMute;
    private com.bytedance.sdk.component.adexpress.sf.vh mRenderListener;
    private com.bytedance.sdk.component.adexpress.sf.hc mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.sf muteListener;
    protected final com.bytedance.sdk.component.adexpress.sf.gbb renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.gm> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.vj videoListener;
    public View videoView;

    public DynamicRootView(Context context, boolean z, com.bytedance.sdk.component.adexpress.sf.hc hcVar, com.bytedance.sdk.component.adexpress.dynamic.wh.pcc pccVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.sf.gbb gbbVar = new com.bytedance.sdk.component.adexpress.sf.gbb();
        this.renderResult = gbbVar;
        gbbVar.pcc(2);
        this.mDynamicClickListener = pccVar;
        pccVar.pcc(this);
        this.mIsMute = z;
        this.mRenderRequest = hcVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj;
        com.bytedance.sdk.component.adexpress.dynamic.oo.vj ork = kjVar.ork();
        if (ork == null || (vj = ork.vj()) == null) {
            return;
        }
        this.renderResult.sf(vj.xy());
    }

    private boolean checkSizeValid() {
        vj vjVar = this.dynamicBaseWidget;
        return vjVar.vj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && vjVar.wh > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !kjVar.yt()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible(vj vjVar, int i) {
        if (vjVar == null) {
            return;
        }
        if (vjVar.getBeginInvisibleAndShow()) {
            vjVar.setVisibility(i);
            View view = vjVar.jr;
            if (view != null) {
                view.setVisibility(i);
            }
        }
        int childCount = vjVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (vjVar.getChildAt(i2) instanceof vj) {
                beginShowFromInvisible((vj) vjVar.getChildAt(i2), i);
            }
        }
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.pcc(false);
        this.renderResult.sf(i);
        this.renderResult.pcc(str);
        this.mRenderListener.pcc(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.wh.pcc getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.sf.vh getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.sf.hc getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.gm> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void onvideoComplate() {
        try {
            this.videoListener.pcc();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, int i) {
        this.dynamicBaseWidget = renderDynamicView(kjVar, this, i);
        this.renderResult.pcc(true);
        this.renderResult.pcc(this.dynamicBaseWidget.vj);
        this.renderResult.sf(this.dynamicBaseWidget.wh);
        this.renderResult.pcc(this.videoView);
        this.mRenderListener.pcc(this.renderResult);
    }

    public vj renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar, ViewGroup viewGroup, int i) {
        if (kjVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> vh = kjVar.vh();
        vj pcc = com.bytedance.sdk.component.adexpress.dynamic.pcc.sf.pcc(this.mContext, this, kjVar);
        if (pcc instanceof ye) {
            callBackRenderFail(i == 3 ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(kjVar);
        pcc.gm();
        if (viewGroup != null) {
            viewGroup.addView(pcc);
            setClipChildren(viewGroup, kjVar);
        }
        if (vh == null || vh.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.kj> it = vh.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), pcc, i);
        }
        return pcc;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.sf sfVar) {
        this.muteListener = sfVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.sf.vh vhVar) {
        this.mRenderListener = vhVar;
        this.mDynamicClickListener.pcc(vhVar);
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.sf sfVar = this.muteListener;
        if (sfVar != null) {
            sfVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).pcc(charSequence, i == 1, i2, z);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.gm gmVar) {
        this.timeOutListener.add(gmVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.vj vjVar) {
        this.videoListener = vjVar;
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.gm(d);
        this.renderResult.oo(d2);
        this.renderResult.vj(d3);
        this.renderResult.wh(d4);
        this.renderResult.pcc(f);
        this.renderResult.sf(f);
        this.renderResult.gm(f);
        this.renderResult.oo(f);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }
}
