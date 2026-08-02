package com.vk.ml;

import com.vk.log.L;
import com.vk.ml.MLFeatures;
import xsna.izs;
import xsna.q330;
import xsna.s3q0;

/* compiled from: ModelsManager.kt */
/* loaded from: classes3.dex */
public final class d implements izs {
    public final /* synthetic */ MLFeatures.MLFeature b;
    public final /* synthetic */ q330 c;

    public d(MLFeatures.MLFeature mLFeature, q330 q330Var) {
        this.b = mLFeature;
        this.c = q330Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        L.e("ModelsManager", "on downloaded " + this.b);
        this.c.invoke();
        return s3q0.a;
    }
}
