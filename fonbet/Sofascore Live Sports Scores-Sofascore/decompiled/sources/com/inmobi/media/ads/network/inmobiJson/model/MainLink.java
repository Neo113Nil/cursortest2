package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;
import com.ironsource.U3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/MainLink;", "Lcom/inmobi/media/ads/network/inmobiJson/model/Link;", "<init>", "()V", U3.i.X, "", "fallbackUrl", "getFallbackUrl", "()Ljava/lang/String;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainLink extends Link {

    @NotNull
    private String fallbackUrl = "";

    @NotNull
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }
}
