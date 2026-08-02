package com.vk.superapp.vkpay.checkout.feature.pin.success;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.vkpay.checkout.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.gzs;
import xsna.m33;
import xsna.nf0;
import xsna.s3q0;

/* compiled from: PinSuccessView.kt */
/* loaded from: classes6.dex */
public final class PinSuccessView extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public gzs<s3q0> b;

    public PinSuccessView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(4);
        setOrientation(1);
        e3m.a aVar = e3m.a;
        setBackground(m33.a(R.drawable.vk_pay_checkout_loader_background, context));
        LayoutInflater.from(context).inflate(R.layout.vk_pay_checkout_pin_success_view, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.vk_pay_checkout_pin_success_title);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                textView.setText(string);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a() {
        setVisibility(0);
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        animate().setStartDelay(0L).alpha(1.0f).setDuration(300L).withEndAction(new nf0(this, 9));
    }

    public final void setOnShownListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }
}
