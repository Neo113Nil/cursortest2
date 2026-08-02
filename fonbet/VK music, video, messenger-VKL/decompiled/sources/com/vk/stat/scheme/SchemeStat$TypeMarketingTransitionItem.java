package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMarketingTransitionItem implements SchemeStat$TypeAction.b {

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    private final String campaign;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("source")
    private final String source;

    @pmi0("url")
    private final String url;

    public SchemeStat$TypeMarketingTransitionItem(String str, String str2, String str3, String str4) {
        this.campaign = str;
        this.event = str2;
        this.source = str3;
        this.url = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMarketingTransitionItem)) {
            return false;
        }
        SchemeStat$TypeMarketingTransitionItem schemeStat$TypeMarketingTransitionItem = (SchemeStat$TypeMarketingTransitionItem) obj;
        return epx.f(this.campaign, schemeStat$TypeMarketingTransitionItem.campaign) && epx.f(this.event, schemeStat$TypeMarketingTransitionItem.event) && epx.f(this.source, schemeStat$TypeMarketingTransitionItem.source) && epx.f(this.url, schemeStat$TypeMarketingTransitionItem.url);
    }

    public final int hashCode() {
        int a = urd0.a(this.campaign.hashCode() * 31, 31, this.event);
        String str = this.source;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketingTransitionItem(campaign=");
        sb.append(this.campaign);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    public /* synthetic */ SchemeStat$TypeMarketingTransitionItem(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
