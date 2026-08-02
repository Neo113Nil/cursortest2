package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsMarketStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem implements MobileOfficialAppsMarketStat$TypeMarketClick.b {

    @pmi0("contact_id")
    private final Long contactId;

    @pmi0("item_id")
    private final Integer itemId;

    @pmi0("message_template")
    private final String messageTemplate;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("owner_response_time_minutes")
    private final Integer ownerResponseTimeMinutes;

    public MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem)) {
            return false;
        }
        MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem = (MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem) obj;
        return epx.f(this.itemId, mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.itemId) && epx.f(this.ownerId, mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.ownerId) && epx.f(this.messageTemplate, mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.messageTemplate) && epx.f(this.contactId, mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.contactId) && epx.f(this.ownerResponseTimeMinutes, mobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem.ownerResponseTimeMinutes);
    }

    public final int hashCode() {
        Integer num = this.itemId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.messageTemplate;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.contactId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.ownerResponseTimeMinutes;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketSendMessageToOwnerClickItem(itemId=");
        sb.append(this.itemId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", messageTemplate=");
        sb.append(this.messageTemplate);
        sb.append(", contactId=");
        sb.append(this.contactId);
        sb.append(", ownerResponseTimeMinutes=");
        return uqi.b(sb, this.ownerResponseTimeMinutes, ')');
    }

    public MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem(Integer num, Long l, String str, Long l2, Integer num2) {
        this.itemId = num;
        this.ownerId = l;
        this.messageTemplate = str;
        this.contactId = l2;
        this.ownerResponseTimeMinutes = num2;
    }

    public /* synthetic */ MobileOfficialAppsMarketStat$TypeMarketSendMessageToOwnerClickItem(Integer num, Long l, String str, Long l2, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : num2);
    }
}
