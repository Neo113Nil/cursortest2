package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeAvitoIntegrationClickItem {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_avito_integration_badge_click")
    private final CommonEcommStat$TypeAvitoIntegrationBadgeClickItem typeAvitoIntegrationBadgeClick;

    @pmi0("type_avito_integration_disable_click")
    private final com.vk.stat.scheme.a typeAvitoIntegrationDisableClick;

    @pmi0("type_avito_integration_enable_click")
    private final com.vk.stat.scheme.b typeAvitoIntegrationEnableClick;

    @pmi0("type_avito_integration_info_click")
    private final CommonEcommStat$TypeAvitoIntegrationInfoClickItem typeAvitoIntegrationInfoClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_avito_integration_badge_click")
        public static final Type TYPE_AVITO_INTEGRATION_BADGE_CLICK;

        @pmi0("type_avito_integration_disable_click")
        public static final Type TYPE_AVITO_INTEGRATION_DISABLE_CLICK;

        @pmi0("type_avito_integration_enable_click")
        public static final Type TYPE_AVITO_INTEGRATION_ENABLE_CLICK;

        @pmi0("type_avito_integration_info_click")
        public static final Type TYPE_AVITO_INTEGRATION_INFO_CLICK;

        static {
            Type type = new Type("TYPE_AVITO_INTEGRATION_ENABLE_CLICK", 0);
            TYPE_AVITO_INTEGRATION_ENABLE_CLICK = type;
            Type type2 = new Type("TYPE_AVITO_INTEGRATION_DISABLE_CLICK", 1);
            TYPE_AVITO_INTEGRATION_DISABLE_CLICK = type2;
            Type type3 = new Type("TYPE_AVITO_INTEGRATION_BADGE_CLICK", 2);
            TYPE_AVITO_INTEGRATION_BADGE_CLICK = type3;
            Type type4 = new Type("TYPE_AVITO_INTEGRATION_INFO_CLICK", 3);
            TYPE_AVITO_INTEGRATION_INFO_CLICK = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    /* compiled from: CommonEcommStat.kt */
    public static final class a {
        public static CommonEcommStat$TypeAvitoIntegrationClickItem a(long j, b bVar) {
            if (bVar instanceof com.vk.stat.scheme.b) {
                return new CommonEcommStat$TypeAvitoIntegrationClickItem(Type.TYPE_AVITO_INTEGRATION_ENABLE_CLICK, j, (com.vk.stat.scheme.b) bVar, null, null, null, 56, null);
            }
            if (bVar instanceof com.vk.stat.scheme.a) {
                return new CommonEcommStat$TypeAvitoIntegrationClickItem(Type.TYPE_AVITO_INTEGRATION_DISABLE_CLICK, j, null, (com.vk.stat.scheme.a) bVar, null, null, 52, null);
            }
            if (bVar instanceof CommonEcommStat$TypeAvitoIntegrationBadgeClickItem) {
                return new CommonEcommStat$TypeAvitoIntegrationClickItem(Type.TYPE_AVITO_INTEGRATION_BADGE_CLICK, j, null, null, (CommonEcommStat$TypeAvitoIntegrationBadgeClickItem) bVar, null, 44, null);
            }
            if (!(bVar instanceof CommonEcommStat$TypeAvitoIntegrationInfoClickItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeAvitoIntegrationEnableClickItem, TypeAvitoIntegrationDisableClickItem, TypeAvitoIntegrationBadgeClickItem, TypeAvitoIntegrationInfoClickItem)");
            }
            return new CommonEcommStat$TypeAvitoIntegrationClickItem(Type.TYPE_AVITO_INTEGRATION_INFO_CLICK, j, null, null, null, (CommonEcommStat$TypeAvitoIntegrationInfoClickItem) bVar, 28, null);
        }
    }

    /* compiled from: CommonEcommStat.kt */
    public interface b {
    }

    private CommonEcommStat$TypeAvitoIntegrationClickItem(Type type, long j, com.vk.stat.scheme.b bVar, com.vk.stat.scheme.a aVar, CommonEcommStat$TypeAvitoIntegrationBadgeClickItem commonEcommStat$TypeAvitoIntegrationBadgeClickItem, CommonEcommStat$TypeAvitoIntegrationInfoClickItem commonEcommStat$TypeAvitoIntegrationInfoClickItem) {
        this.type = type;
        this.communityId = j;
        this.typeAvitoIntegrationEnableClick = bVar;
        this.typeAvitoIntegrationDisableClick = aVar;
        this.typeAvitoIntegrationBadgeClick = commonEcommStat$TypeAvitoIntegrationBadgeClickItem;
        this.typeAvitoIntegrationInfoClick = commonEcommStat$TypeAvitoIntegrationInfoClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeAvitoIntegrationClickItem)) {
            return false;
        }
        CommonEcommStat$TypeAvitoIntegrationClickItem commonEcommStat$TypeAvitoIntegrationClickItem = (CommonEcommStat$TypeAvitoIntegrationClickItem) obj;
        return this.type == commonEcommStat$TypeAvitoIntegrationClickItem.type && this.communityId == commonEcommStat$TypeAvitoIntegrationClickItem.communityId && epx.f(this.typeAvitoIntegrationEnableClick, commonEcommStat$TypeAvitoIntegrationClickItem.typeAvitoIntegrationEnableClick) && epx.f(this.typeAvitoIntegrationDisableClick, commonEcommStat$TypeAvitoIntegrationClickItem.typeAvitoIntegrationDisableClick) && epx.f(this.typeAvitoIntegrationBadgeClick, commonEcommStat$TypeAvitoIntegrationClickItem.typeAvitoIntegrationBadgeClick) && epx.f(this.typeAvitoIntegrationInfoClick, commonEcommStat$TypeAvitoIntegrationClickItem.typeAvitoIntegrationInfoClick);
    }

    public final int hashCode() {
        int a2 = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        com.vk.stat.scheme.b bVar = this.typeAvitoIntegrationEnableClick;
        int hashCode = (a2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        com.vk.stat.scheme.a aVar = this.typeAvitoIntegrationDisableClick;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CommonEcommStat$TypeAvitoIntegrationBadgeClickItem commonEcommStat$TypeAvitoIntegrationBadgeClickItem = this.typeAvitoIntegrationBadgeClick;
        int hashCode3 = (hashCode2 + (commonEcommStat$TypeAvitoIntegrationBadgeClickItem == null ? 0 : commonEcommStat$TypeAvitoIntegrationBadgeClickItem.hashCode())) * 31;
        CommonEcommStat$TypeAvitoIntegrationInfoClickItem commonEcommStat$TypeAvitoIntegrationInfoClickItem = this.typeAvitoIntegrationInfoClick;
        return hashCode3 + (commonEcommStat$TypeAvitoIntegrationInfoClickItem != null ? commonEcommStat$TypeAvitoIntegrationInfoClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAvitoIntegrationClickItem(type=" + this.type + ", communityId=" + this.communityId + ", typeAvitoIntegrationEnableClick=" + this.typeAvitoIntegrationEnableClick + ", typeAvitoIntegrationDisableClick=" + this.typeAvitoIntegrationDisableClick + ", typeAvitoIntegrationBadgeClick=" + this.typeAvitoIntegrationBadgeClick + ", typeAvitoIntegrationInfoClick=" + this.typeAvitoIntegrationInfoClick + ')';
    }

    public /* synthetic */ CommonEcommStat$TypeAvitoIntegrationClickItem(Type type, long j, com.vk.stat.scheme.b bVar, com.vk.stat.scheme.a aVar, CommonEcommStat$TypeAvitoIntegrationBadgeClickItem commonEcommStat$TypeAvitoIntegrationBadgeClickItem, CommonEcommStat$TypeAvitoIntegrationInfoClickItem commonEcommStat$TypeAvitoIntegrationInfoClickItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : commonEcommStat$TypeAvitoIntegrationBadgeClickItem, (i & 32) != 0 ? null : commonEcommStat$TypeAvitoIntegrationInfoClickItem);
    }
}
