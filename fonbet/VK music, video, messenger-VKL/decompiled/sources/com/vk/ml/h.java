package com.vk.ml;

import com.vk.ml.MLFeatures;

/* compiled from: ModelsManagerReadyEvent.kt */
/* loaded from: classes3.dex */
public final class h implements f {
    public final MLFeatures.MLFeature a;

    public h(MLFeatures.MLFeature mLFeature) {
        this.a = mLFeature;
    }

    @Override // com.vk.ml.f
    public final MLFeatures.MLFeature a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModelsManagerLoadedEvent(mlFeature=" + this.a + ')';
    }
}
