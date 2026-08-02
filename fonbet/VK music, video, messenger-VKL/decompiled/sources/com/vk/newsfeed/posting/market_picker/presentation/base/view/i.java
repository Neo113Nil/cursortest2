package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.graphics.drawable.Animatable;
import android.util.SparseBooleanArray;
import xsna.lqj;
import xsna.mjw;
import xsna.wc2;

/* compiled from: PhotoAdapter.kt */
/* loaded from: classes4.dex */
public final class i extends lqj {
    public final /* synthetic */ h b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ClippingImageView d;

    public i(h hVar, int i, ClippingImageView clippingImageView) {
        this.b = hVar;
        this.c = i;
        this.d = clippingImageView;
    }

    @Override // xsna.kqj
    public final void e(String str, mjw mjwVar, Animatable animatable) {
        h hVar = this.b;
        SparseBooleanArray sparseBooleanArray = hVar.k;
        int i = this.c;
        sparseBooleanArray.put(i, true);
        this.d.post(new wc2(hVar, i));
    }
}
