package com.vk.ml;

import com.vk.ml.MLFeatures;

/* compiled from: ModelsManagerReadyEvent.kt */
/* loaded from: classes3.dex */
public final class e implements f {
    public final MLFeatures.MLFeature a;

    public e(MLFeatures.MLFeature mLFeature) {
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
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModelsManagerAlreadyDownloaded(mlFeature=" + this.a + ')';
    }
}
