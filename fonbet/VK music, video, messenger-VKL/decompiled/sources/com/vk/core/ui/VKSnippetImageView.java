package com.vk.core.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;
import xsna.iah0;
import xsna.ojt;

/* loaded from: classes17.dex */
public class VKSnippetImageView extends VKImageView {
    public static final float p = iah0.a(0.5f);
    public float m;
    public int n;
    public boolean o;

    public VKSnippetImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = p;
        this.n = 1023413274;
        this.o = true;
        setBackgroundResource(R.drawable.attach_snippet_placeholder_top);
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        ojtVar.l = f5h0.f.a;
        float f = 2;
        float a = iah0.a(f);
        float a2 = iah0.a(f);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.e(a, a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        roundingParams.d(p);
        roundingParams.f = 1023413274;
        roundingParams.i = true;
        ojtVar.q = roundingParams;
    }

    public final void T0(float f, float f2, float f3, float f4) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.e(f, f2, f3, f4);
        if (this.o) {
            roundingParams.d(this.m);
            roundingParams.f = this.n;
        }
        roundingParams.i = true;
        getHierarchy().u(roundingParams);
    }

    public int getBorderColor() {
        return this.n;
    }

    public float getBorderWidth() {
        return this.m;
    }

    public void setBorderColor(int i) {
        this.n = i;
    }

    public void setBorderWidth(float f) {
        this.m = f;
    }

    public void setDrawBorder(boolean z) {
        this.o = z;
    }

    public void setType(int i) {
        int a = iah0.a(4);
        int i2 = a >> 1;
        int a2 = iah0.a(10);
        int a3 = iah0.a(6);
        int a4 = iah0.a(8);
        int a5 = iah0.a(12);
        if (i == 1) {
            setBackgroundResource(R.drawable.attach_snippet_placeholder_top);
            float f = i2;
            T0(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 9) {
            setBackground(null);
            setDrawBorder(false);
            float f2 = a4;
            T0(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
        } else if (i == 0) {
            setBackgroundResource(R.drawable.attach_snippet_placeholder_left);
            float f3 = i2;
            T0(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3);
        } else if (i == 3) {
            setBackgroundResource(R.drawable.attach_snippet_article_placeholder);
            float f4 = a;
            T0(f4, f4, f4, f4);
        } else if (i == 4) {
            setBackground(null);
            setDrawBorder(false);
            float f5 = a3;
            T0(f5, f5, f5, f5);
        } else if (i == 5) {
            setBackground(null);
            setDrawBorder(false);
            float f6 = a2;
            T0(f6, f6, f6, f6);
        } else if (i == 6) {
            setBackgroundResource(R.drawable.podcast_placeholder_48_snippet);
            float f7 = a3;
            T0(f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f7);
        } else if (i == 10) {
            setDrawBorder(false);
            setBackgroundResource(R.drawable.podcast_placeholder_48_snippet_discover);
            float f8 = a;
            T0(f8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8);
        } else if (i == 7) {
            setBackgroundResource(R.drawable.friend_rec_placeholder_top);
            float f9 = a;
            T0(f9, f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else if (i == 8) {
            setBackground(null);
            setDrawBorder(false);
            float f10 = a5;
            T0(f10, f10, f10, f10);
        } else if (i == 11) {
            setBackgroundResource(R.drawable.friend_rec_actionable_placeholder_top);
            float f11 = a4;
            T0(f11, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (i == 12) {
            setBackground(null);
            setDrawBorder(false);
            float f12 = a3;
            T0(f12, f12, f12, f12);
            return;
        }
        if (i != 13) {
            setBackgroundResource(R.drawable.attach_snippet_placeholder_all);
            float f13 = i2;
            T0(f13, f13, f13, f13);
        } else {
            setBackground(null);
            setDrawBorder(true);
            float f14 = a5;
            float f15 = i2;
            T0(f14, f14, f15, f15);
        }
    }
}
