package com.vk.dzenarticle.impl.ui.view.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import xsna.cro;
import xsna.fe0;
import xsna.izs;
import xsna.s3q0;
import xsna.zu50;

/* compiled from: BaseTopAdView.kt */
/* loaded from: classes18.dex */
public abstract class BaseTopAdView extends FrameLayout {
    public zu50 b;
    public fe0 c;
    public izs<? super cro, s3q0> d;

    /* compiled from: BaseTopAdView.kt */
    public final class a {
        public final String a;
        public final View b;
        public final cro c;
        public final cro d;

        public a(String str, VkText vkText, cro croVar, cro croVar2) {
            this.a = str;
            this.b = vkText;
            this.c = croVar;
            this.d = croVar2;
        }
    }

    public BaseTopAdView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final fe0 getAdChoicesController() {
        return this.c;
    }

    public final zu50 getNativeAd() {
        return this.b;
    }

    public final izs<cro, s3q0> getOnAction() {
        return this.d;
    }

    public final void setAdChoicesController(fe0 fe0Var) {
        this.c = fe0Var;
    }

    public final void setNativeAd(zu50 zu50Var) {
        this.b = zu50Var;
    }

    public final void setOnAction(izs<? super cro, s3q0> izsVar) {
        this.d = izsVar;
    }

    public BaseTopAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public BaseTopAdView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ BaseTopAdView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public BaseTopAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
