package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeAvitoIntegrationViewItem {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_avito_integration_badge_view")
    private final CommonEcommStat$TypeAvitoIntegrationBadgeViewItem typeAvitoIntegrationBadgeView;

    @pmi0("type_avito_integration_info_view")
    private final CommonEcommStat$TypeAvitoIntegrationInfoViewItem typeAvitoIntegrationInfoView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_avito_integration_badge_view")
        public static final Type TYPE_AVITO_INTEGRATION_BADGE_VIEW;

        @pmi0("type_avito_integration_info_view")
        public static final Type TYPE_AVITO_INTEGRATION_INFO_VIEW;

        static {
            Type type = new Type("TYPE_AVITO_INTEGRATION_BADGE_VIEW", 0);
            TYPE_AVITO_INTEGRATION_BADGE_VIEW = type;
            Type type2 = new Type("TYPE_AVITO_INTEGRATION_INFO_VIEW", 1);
            TYPE_AVITO_INTEGRATION_INFO_VIEW = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    private CommonEcommStat$TypeAvitoIntegrationViewItem(Type type, long j, CommonEcommStat$TypeAvitoIntegrationBadgeViewItem commonEcommStat$TypeAvitoIntegrationBadgeViewItem, CommonEcommStat$TypeAvitoIntegrationInfoViewItem commonEcommStat$TypeAvitoIntegrationInfoViewItem) {
        this.type = type;
        this.communityId = j;
        this.typeAvitoIntegrationBadgeView = commonEcommStat$TypeAvitoIntegrationBadgeViewItem;
        this.typeAvitoIntegrationInfoView = commonEcommStat$TypeAvitoIntegrationInfoViewItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeAvitoIntegrationViewItem)) {
            return false;
        }
        CommonEcommStat$TypeAvitoIntegrationViewItem commonEcommStat$TypeAvitoIntegrationViewItem = (CommonEcommStat$TypeAvitoIntegrationViewItem) obj;
        return this.type == commonEcommStat$TypeAvitoIntegrationViewItem.type && this.communityId == commonEcommStat$TypeAvitoIntegrationViewItem.communityId && epx.f(this.typeAvitoIntegrationBadgeView, commonEcommStat$TypeAvitoIntegrationViewItem.typeAvitoIntegrationBadgeView) && epx.f(this.typeAvitoIntegrationInfoView, commonEcommStat$TypeAvitoIntegrationViewItem.typeAvitoIntegrationInfoView);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        CommonEcommStat$TypeAvitoIntegrationBadgeViewItem commonEcommStat$TypeAvitoIntegrationBadgeViewItem = this.typeAvitoIntegrationBadgeView;
        int hashCode = (a + (commonEcommStat$TypeAvitoIntegrationBadgeViewItem == null ? 0 : commonEcommStat$TypeAvitoIntegrationBadgeViewItem.hashCode())) * 31;
        CommonEcommStat$TypeAvitoIntegrationInfoViewItem commonEcommStat$TypeAvitoIntegrationInfoViewItem = this.typeAvitoIntegrationInfoView;
        return hashCode + (commonEcommStat$TypeAvitoIntegrationInfoViewItem != null ? commonEcommStat$TypeAvitoIntegrationInfoViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAvitoIntegrationViewItem(type=" + this.type + ", communityId=" + this.communityId + ", typeAvitoIntegrationBadgeView=" + this.typeAvitoIntegrationBadgeView + ", typeAvitoIntegrationInfoView=" + this.typeAvitoIntegrationInfoView + ')';
    }

    public /* synthetic */ CommonEcommStat$TypeAvitoIntegrationViewItem(Type type, long j, CommonEcommStat$TypeAvitoIntegrationBadgeViewItem commonEcommStat$TypeAvitoIntegrationBadgeViewItem, CommonEcommStat$TypeAvitoIntegrationInfoViewItem commonEcommStat$TypeAvitoIntegrationInfoViewItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : commonEcommStat$TypeAvitoIntegrationBadgeViewItem, (i & 8) != 0 ? null : commonEcommStat$TypeAvitoIntegrationInfoViewItem);
    }
}
