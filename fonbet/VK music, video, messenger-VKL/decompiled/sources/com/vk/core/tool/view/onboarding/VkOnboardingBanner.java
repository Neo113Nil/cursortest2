package com.vk.core.tool.view.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.tool.onboarding.VkOnboarding$GraffitiAlignment;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.components.R$styleable;
import xsna.f7v0;
import xsna.g7v0;
import xsna.gzs;
import xsna.ht7;
import xsna.im80;
import xsna.l5g;
import xsna.o7v0;
import xsna.rg50;
import xsna.rpo0;
import xsna.s3q0;
import xsna.wak0;
import xsna.wh50;
import xsna.zak0;

/* compiled from: VkOnboardingBanner.kt */
/* loaded from: classes17.dex */
public final class VkOnboardingBanner extends rpo0 {
    public static final /* synthetic */ int y = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;
    public final rg50 w;
    public final wh50 x;

    public VkOnboardingBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.rpo0
    public final void A(int i, a aVar) {
        a M = aVar.M(1284566819);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(1284566819, i2, -1, "com.vk.core.tool.view.onboarding.VkOnboardingBanner.ThemedContent (VkOnboardingBanner.kt:71)");
            }
            String title = getTitle();
            String buttonText = getButtonText();
            gzs<s3q0> onButtonClick = getOnButtonClick();
            if (onButtonClick == null) {
                M.K(371717757);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new im80(16);
                    M.R(x);
                }
                onButtonClick = (gzs) x;
            } else {
                M.K(1813105686);
            }
            M.j();
            o7v0.c(title, f7v0.a.a(buttonText, onButtonClick, M, 1572864), null, getGraffiti(), getGraffitiAlignment(), getColor(), getHighlighterMarkerType(), m82getHighlightedTextColorQN2ZGVo(), getOnClick(), getOnDismiss(), getBannerBottomPaddingDp(), getStatDelegate(), M, 0, 0, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ht7(this, i, 13);
        }
    }

    public final int getBannerBottomPaddingDp() {
        return this.w.getIntValue();
    }

    public final String getButtonText() {
        return (String) ((zak0) this.n).getValue();
    }

    public final VkOnboarding$TintColor getColor() {
        return (VkOnboarding$TintColor) ((zak0) this.q).getValue();
    }

    public final g7v0 getGraffiti() {
        return (g7v0) ((zak0) this.o).getValue();
    }

    public final VkOnboarding$GraffitiAlignment getGraffitiAlignment() {
        return (VkOnboarding$GraffitiAlignment) ((zak0) this.p).getValue();
    }

    /* renamed from: getHighlightedTextColor-QN2ZGVo, reason: not valid java name */
    public final l5g m82getHighlightedTextColorQN2ZGVo() {
        return (l5g) ((zak0) this.s).getValue();
    }

    public final VkOnboarding$HighlighterMarkerType getHighlighterMarkerType() {
        return (VkOnboarding$HighlighterMarkerType) ((zak0) this.r).getValue();
    }

    public final gzs<s3q0> getOnButtonClick() {
        return (gzs) ((zak0) this.u).getValue();
    }

    public final gzs<s3q0> getOnClick() {
        return (gzs) ((zak0) this.t).getValue();
    }

    public final gzs<s3q0> getOnDismiss() {
        return (gzs) ((zak0) this.v).getValue();
    }

    public final VkOnboardingStat$Delegate getStatDelegate() {
        return (VkOnboardingStat$Delegate) ((zak0) this.x).getValue();
    }

    public final String getTitle() {
        return (String) ((zak0) this.m).getValue();
    }

    public final void setBannerBottomPaddingDp(int i) {
        ((wak0) this.w).C(i);
    }

    public final void setButtonText(String str) {
        ((zak0) this.n).setValue(str);
    }

    public final void setColor(VkOnboarding$TintColor vkOnboarding$TintColor) {
        ((zak0) this.q).setValue(vkOnboarding$TintColor);
    }

    public final void setGraffiti(g7v0 g7v0Var) {
        ((zak0) this.o).setValue(g7v0Var);
    }

    public final void setGraffitiAlignment(VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment) {
        ((zak0) this.p).setValue(vkOnboarding$GraffitiAlignment);
    }

    /* renamed from: setHighlightedTextColor-Y2TPw74, reason: not valid java name */
    public final void m83setHighlightedTextColorY2TPw74(l5g l5gVar) {
        ((zak0) this.s).setValue(l5gVar);
    }

    public final void setHighlighterMarkerType(VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType) {
        ((zak0) this.r).setValue(vkOnboarding$HighlighterMarkerType);
    }

    public final void setOnButtonClick(gzs<s3q0> gzsVar) {
        ((zak0) this.u).setValue(gzsVar);
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        ((zak0) this.t).setValue(gzsVar);
    }

    public final void setOnDismiss(gzs<s3q0> gzsVar) {
        ((zak0) this.v).setValue(gzsVar);
    }

    public final void setStatDelegate(VkOnboardingStat$Delegate vkOnboardingStat$Delegate) {
        ((zak0) this.x).setValue(vkOnboardingStat$Delegate);
    }

    public final void setTitle(String str) {
        ((zak0) this.m).setValue(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkOnboardingBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.m = k.b("");
        this.n = k.b("");
        g7v0 g7v0Var = g7v0.f.b;
        this.o = k.b(g7v0Var);
        VkOnboarding$GraffitiAlignment vkOnboarding$GraffitiAlignment = VkOnboarding$GraffitiAlignment.Start;
        this.p = k.b(vkOnboarding$GraffitiAlignment);
        VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
        this.q = k.b(vkOnboarding$TintColor);
        VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type1;
        this.r = k.b(vkOnboarding$HighlighterMarkerType);
        this.s = k.b(null);
        this.t = k.b(null);
        this.u = k.b(null);
        this.v = k.b(null);
        this.w = i.a(24);
        this.x = k.b(null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            String string = obtainStyledAttributes.getString(3);
            if (string != null) {
                setTitle(string);
            }
            String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                setButtonText(string2);
            }
            int i2 = obtainStyledAttributes.getInt(2, 0);
            if (i2 == 1) {
                g7v0Var = g7v0.b.b;
            } else if (i2 == 2) {
                g7v0Var = g7v0.d.b;
            } else if (i2 == 3) {
                g7v0Var = g7v0.e.b;
            }
            setGraffiti(g7v0Var);
            setGraffitiAlignment(obtainStyledAttributes.getInt(4, 0) == 1 ? VkOnboarding$GraffitiAlignment.End : vkOnboarding$GraffitiAlignment);
            int i3 = obtainStyledAttributes.getInt(5, 0);
            if (i3 == 1) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type2;
            } else if (i3 == 2) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type3;
            } else if (i3 == 3) {
                vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type4;
            }
            setHighlighterMarkerType(vkOnboarding$HighlighterMarkerType);
            int i4 = obtainStyledAttributes.getInt(1, 0);
            if (i4 == 1) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Cyan;
            } else if (i4 == 2) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Azure;
            } else if (i4 == 3) {
                vkOnboarding$TintColor = VkOnboarding$TintColor.Pink;
            }
            setColor(vkOnboarding$TintColor);
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
