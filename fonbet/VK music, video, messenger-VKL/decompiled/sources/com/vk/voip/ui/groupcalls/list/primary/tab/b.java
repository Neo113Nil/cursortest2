package com.vk.voip.ui.groupcalls.list.primary.tab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.f4m;
import xsna.hga;
import xsna.lpj;
import xsna.ov7;

/* compiled from: PrimaryTabItemView.kt */
/* loaded from: classes7.dex */
public final class b extends FrameLayout {
    public final TextView b;
    public final AppCompatImageView c;
    public a d;
    public float e;

    /* compiled from: PrimaryTabItemView.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public b(Context context) {
        super(context);
        TextView textView = new TextView(new lpj(getContext(), R.style.VkLegacyTypography_Caption1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        bwt0.R(textView, new hga(this, 1));
        textView.setTextColor(-1);
        textView.setMaxLines(1);
        this.b = textView;
        addView(textView);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams2);
        bwt0.R(appCompatImageView, new ov7(this, 2));
        this.c = appCompatImageView;
        addView(appCompatImageView);
    }

    public final void a() {
        a aVar = this.d;
        if (aVar == null) {
            return;
        }
        int i = aVar.d;
        float f = this.e;
        int i2 = (int) ((aVar.b * f) + ((1.0f - f) * aVar.a));
        bwt0.r0(i2, this);
        TextView textView = this.b;
        textView.setScaleX(f);
        textView.setScaleY(f);
        int width = textView.getWidth();
        AppCompatImageView appCompatImageView = this.c;
        int max = Math.max((i2 - ((appCompatImageView.getWidth() + i) + width)) / 2, i);
        f4m.s(max, appCompatImageView);
        f4m.s(appCompatImageView.getWidth() + max + i, textView);
    }

    public final void setConfiguration(a aVar) {
        this.d = aVar;
        this.b.setText(aVar.f);
        int i = aVar.e;
        AppCompatImageView appCompatImageView = this.c;
        appCompatImageView.setImageResource(i);
        int i2 = aVar.c;
        bwt0.m0(i2, i2, appCompatImageView);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        a();
    }

    public final void setTabOpenProgress(float f) {
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > f || f > 1.0f) {
            throw new IllegalArgumentException("openProgress must be within 0f to 1f");
        }
        this.e = f;
        a();
    }
}
