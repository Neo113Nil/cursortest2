package com.vk.stat.scheme;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeAdCampaign {

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("id")
    private final Integer id;

    @pmi0("medium")
    private final String medium;

    @pmi0("name")
    private final String name;

    @pmi0("source")
    private final String source;

    @pmi0("term")
    private final String term;

    public CommonMarketStat$TypeAdCampaign() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeAdCampaign)) {
            return false;
        }
        CommonMarketStat$TypeAdCampaign commonMarketStat$TypeAdCampaign = (CommonMarketStat$TypeAdCampaign) obj;
        return epx.f(this.id, commonMarketStat$TypeAdCampaign.id) && epx.f(this.name, commonMarketStat$TypeAdCampaign.name) && epx.f(this.source, commonMarketStat$TypeAdCampaign.source) && epx.f(this.medium, commonMarketStat$TypeAdCampaign.medium) && epx.f(this.term, commonMarketStat$TypeAdCampaign.term) && epx.f(this.content, commonMarketStat$TypeAdCampaign.content);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.medium;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.term;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.content;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAdCampaign(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", medium=");
        sb.append(this.medium);
        sb.append(", term=");
        sb.append(this.term);
        sb.append(", content=");
        return ho8.a(sb, this.content, ')');
    }

    public CommonMarketStat$TypeAdCampaign(Integer num, String str, String str2, String str3, String str4, String str5) {
        this.id = num;
        this.name = str;
        this.source = str2;
        this.medium = str3;
        this.term = str4;
        this.content = str5;
    }

    public /* synthetic */ CommonMarketStat$TypeAdCampaign(Integer num, String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
