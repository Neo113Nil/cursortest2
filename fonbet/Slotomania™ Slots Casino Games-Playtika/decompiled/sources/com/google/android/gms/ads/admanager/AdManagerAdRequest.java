package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes6.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzm(str);
            return this;
        }

        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public Builder self() {
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzi(str);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, byte[] bArr) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zzk();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzf();
    }
}
