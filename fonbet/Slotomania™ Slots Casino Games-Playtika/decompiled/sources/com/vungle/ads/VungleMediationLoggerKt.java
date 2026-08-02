package com.vungle.ads;

import com.vungle.ads.internal.util.LogEntry;
import kotlin.Metadata;

/* compiled from: VungleMediationLogger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"adLogEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "Lcom/vungle/ads/VungleAdType;", "getAdLogEntry", "(Lcom/vungle/ads/VungleAdType;)Lcom/vungle/ads/internal/util/LogEntry;", "vungle-ads_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VungleMediationLoggerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final LogEntry getAdLogEntry(VungleAdType vungleAdType) {
        if (vungleAdType instanceof BaseAd) {
            return ((BaseAd) vungleAdType).getLogEntry();
        }
        if (vungleAdType instanceof VungleBannerView) {
            return ((VungleBannerView) vungleAdType).getLogEntry$vungle_ads_release();
        }
        return null;
    }
}
