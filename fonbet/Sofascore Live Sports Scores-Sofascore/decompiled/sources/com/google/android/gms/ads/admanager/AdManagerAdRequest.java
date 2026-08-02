package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        @NonNull
        public Builder addCategoryExclusion(@NonNull String str) {
            this.a.zzm(str);
            return this;
        }

        @NonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this);
        }

        @NonNull
        public Builder setPublisherProvidedId(@NonNull String str) {
            this.a.zzi(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public Builder self() {
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }
    }

    @Override // com.google.android.gms.ads.AdRequest
    @NonNull
    public Bundle getCustomTargeting() {
        return this.a.zzk();
    }

    @NonNull
    public String getPublisherProvidedId() {
        return this.a.zzf();
    }
}
