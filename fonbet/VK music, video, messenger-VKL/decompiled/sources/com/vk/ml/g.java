package com.vk.ml;

import com.vk.ml.MLFeatures;
import xsna.epx;
import xsna.oq;

/* compiled from: ModelsManagerReadyEvent.kt */
/* loaded from: classes3.dex */
public final class g implements f {
    public final MLFeatures.MLFeature a;
    public final Throwable b;

    public g(MLFeatures.MLFeature mLFeature, Throwable th) {
        this.a = mLFeature;
        this.b = th;
    }

    @Override // com.vk.ml.f
    public final MLFeatures.MLFeature a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && epx.f(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModelsManagerLoadFailedEvent(mlFeature=");
        sb.append(this.a);
        sb.append(", cause=");
        return oq.c(sb, this.b, ')');
    }
}
