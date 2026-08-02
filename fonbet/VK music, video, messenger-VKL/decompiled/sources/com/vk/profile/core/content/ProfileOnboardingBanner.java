package com.vk.profile.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.profile.core.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.gzs;
import xsna.nl30;
import xsna.s3q0;
import xsna.t0w0;
import xsna.too0;

/* compiled from: ProfileOnboardingBanner.kt */
/* loaded from: classes5.dex */
public final class ProfileOnboardingBanner extends LinearLayout implements too0 {
    public final int b;
    public gzs<s3q0> c;

    public ProfileOnboardingBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        int i = !obtainStyledAttributes.getBoolean(0, false) ? R.drawable.bg_tab_photo_flow_onboarding : R.drawable.bg_photo_flow_onboarding;
        this.b = i;
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R.layout.view_profile_onboarding_banner, (ViewGroup) this, true);
        bwt0.i0(findViewById(R.id.close), new nl30(this, 19));
        setOutlineProvider(new t0w0(6, cn70.b(8), false, false));
        setClipToOutline(true);
        ((ViewGroup) findViewById(R.id.root)).setBackground(dhr0.w(i, context));
    }

    @Override // xsna.too0
    public final void Ng() {
        ((ViewGroup) findViewById(R.id.root)).setBackground(dhr0.w(this.b, getContext()));
    }

    public final gzs<s3q0> getOnClose() {
        return this.c;
    }

    public final void setOnClose(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }
}
