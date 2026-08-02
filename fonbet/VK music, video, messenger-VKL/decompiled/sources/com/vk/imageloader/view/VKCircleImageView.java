package com.vk.imageloader.view;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.RoundingParams;
import xsna.f5h0;
import xsna.ojt;

/* loaded from: classes2.dex */
public class VKCircleImageView extends VKImageView {
    public VKCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.vk.imageloader.view.VKImageView
    public final void K0(ojt ojtVar) {
        ojtVar.q = RoundingParams.a();
        ojtVar.l = f5h0.f.a;
    }
}
