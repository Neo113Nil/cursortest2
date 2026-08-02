package com.vk.ml;

import com.vk.ml.MLFeatures;
import io.reactivex.rxjava3.core.p;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import xsna.izs;
import xsna.s3q0;
import xsna.ysg0;

/* compiled from: ModelsManager.kt */
/* loaded from: classes3.dex */
public final class c implements izs {
    public final /* synthetic */ MLFeatures.MLFeature b;

    public c(MLFeatures.MLFeature mLFeature) {
        this.b = mLFeature;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        p pVar = (p) obj;
        Object obj2 = pVar.a;
        MLFeatures.MLFeature mLFeature = this.b;
        f gVar = (obj2 == null || (obj2 instanceof NotificationLite.b)) ? obj2 instanceof NotificationLite.b ? new g(mLFeature, pVar.c()) : null : new h(mLFeature);
        if (gVar != null) {
            ysg0.b.a(gVar);
        }
        return s3q0.a;
    }
}
