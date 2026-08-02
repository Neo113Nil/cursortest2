package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.nac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends View implements pcc<gm> {
    private pcc<gm> pcc;

    public gm(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void clickSkip() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void clickSound(String str) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public View getCloseBackupButton() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.getCloseBackupButton();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public View getCloseButton() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            return pccVar.getCloseButton();
        }
        return null;
    }

    public View getITopLayout() {
        Object obj = this.pcc;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public gm pcc(@NonNull of ofVar) {
        if (this.pcc == null) {
            TopLayoutDislike2 load = new TopLayoutDislike2(getContext()).load(ofVar);
            this.pcc = load;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                pcc(load, (ViewGroup) parent);
            }
        }
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setCountDownFor1InN(charSequence, i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setListener(sf sfVar) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setListener(sfVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowDislike(boolean z) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setShowDislike(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowEndCardNextAd(boolean z, of ofVar) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setShowEndCardNextAd(z, ofVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowPlayableNextAd(boolean z, of ofVar) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setShowPlayableNextAd(z, ofVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowSkip(boolean z) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setShowSkip(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setShowSound(boolean z) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setShowSound(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipEnable(boolean z) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setSkipEnable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipInvisiable() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSkipText(CharSequence charSequence) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setSoundMute(boolean z) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showCloseButton() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showCountDownText() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.pcc
    public void showSkipButton() {
        pcc<gm> pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.showSkipButton();
        }
    }

    public gm(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public gm(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    private void pcc(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
        if (view != null) {
            view.setId(nac.gl);
        }
    }
}
