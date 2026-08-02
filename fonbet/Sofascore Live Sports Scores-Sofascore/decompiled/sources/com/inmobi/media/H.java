package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class H {
    public static final int a(String str, String str2, AdConfig adConfig) {
        return "video".equals(str) ? IronSourceConstants.EVENTS_NATIVE.equals(str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed() : "audio".equals(str) ? "audio".equals(str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed() : IronSourceConstants.EVENTS_NATIVE.equals(str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(String str, String str2, AdConfig adConfig) {
        return "video".equals(str) ? IronSourceConstants.EVENTS_NATIVE.equals(str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed() : "audio".equals(str) ? "audio".equals(str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed() : IronSourceConstants.EVENTS_NATIVE.equals(str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }

    public static final int a(String str) {
        if (kotlin.text.c.v(str, "track_", false)) {
            str = str.substring(6);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
