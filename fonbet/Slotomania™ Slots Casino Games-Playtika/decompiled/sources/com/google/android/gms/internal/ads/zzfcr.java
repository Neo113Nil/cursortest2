package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
final /* synthetic */ class zzfcr implements zzhaq {
    static final /* synthetic */ zzfcr zza = new zzfcr();

    private /* synthetic */ zzfcr() {
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzhbi.zza(new zzfct("", 1, null));
        }
        zzihm zzc = zzihn.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzihk zzc2 = zzihl.zzc();
            zzc2.zza(topic.getTopicId());
            zzc2.zzb(topic.getModelVersion());
            zzc2.zzc(topic.getTaxonomyVersion());
            zzc.zza((zzihl) zzc2.zzbu());
        }
        return zzhbi.zza(new zzfct(Base64.encodeToString(((zzihn) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
