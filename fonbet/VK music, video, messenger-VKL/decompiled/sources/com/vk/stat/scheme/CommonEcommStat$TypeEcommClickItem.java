package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeEcommClickItem implements SchemeStat$TypeClick.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_avito_integration_click")
    private final CommonEcommStat$TypeAvitoIntegrationClickItem typeAvitoIntegrationClick;

    @pmi0("type_community_verification_click")
    private final CommonEcommStat$TypeCommunityVerificationClickItem typeCommunityVerificationClick;

    @pmi0("type_smb_subscriptions_click")
    private final CommonEcommStat$TypeSmbSubscriptionsClickItem typeSmbSubscriptionsClick;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_avito_integration_click")
        public static final Type TYPE_AVITO_INTEGRATION_CLICK;

        @pmi0("type_community_verification_click")
        public static final Type TYPE_COMMUNITY_VERIFICATION_CLICK;

        @pmi0("type_smb_subscriptions_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CLICK;

        static {
            Type type = new Type("TYPE_AVITO_INTEGRATION_CLICK", 0);
            TYPE_AVITO_INTEGRATION_CLICK = type;
            Type type2 = new Type("TYPE_SMB_SUBSCRIPTIONS_CLICK", 1);
            TYPE_SMB_SUBSCRIPTIONS_CLICK = type2;
            Type type3 = new Type("TYPE_COMMUNITY_VERIFICATION_CLICK", 2);
            TYPE_COMMUNITY_VERIFICATION_CLICK = type3;
            Type[] typeArr = {type, type2, type3};
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

    private CommonEcommStat$TypeEcommClickItem(Type type, CommonEcommStat$TypeAvitoIntegrationClickItem commonEcommStat$TypeAvitoIntegrationClickItem, CommonEcommStat$TypeSmbSubscriptionsClickItem commonEcommStat$TypeSmbSubscriptionsClickItem, CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem) {
        this.type = type;
        this.typeAvitoIntegrationClick = commonEcommStat$TypeAvitoIntegrationClickItem;
        this.typeSmbSubscriptionsClick = commonEcommStat$TypeSmbSubscriptionsClickItem;
        this.typeCommunityVerificationClick = commonEcommStat$TypeCommunityVerificationClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeEcommClickItem)) {
            return false;
        }
        CommonEcommStat$TypeEcommClickItem commonEcommStat$TypeEcommClickItem = (CommonEcommStat$TypeEcommClickItem) obj;
        return this.type == commonEcommStat$TypeEcommClickItem.type && epx.f(this.typeAvitoIntegrationClick, commonEcommStat$TypeEcommClickItem.typeAvitoIntegrationClick) && epx.f(this.typeSmbSubscriptionsClick, commonEcommStat$TypeEcommClickItem.typeSmbSubscriptionsClick) && epx.f(this.typeCommunityVerificationClick, commonEcommStat$TypeEcommClickItem.typeCommunityVerificationClick);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        CommonEcommStat$TypeAvitoIntegrationClickItem commonEcommStat$TypeAvitoIntegrationClickItem = this.typeAvitoIntegrationClick;
        int hashCode2 = (hashCode + (commonEcommStat$TypeAvitoIntegrationClickItem == null ? 0 : commonEcommStat$TypeAvitoIntegrationClickItem.hashCode())) * 31;
        CommonEcommStat$TypeSmbSubscriptionsClickItem commonEcommStat$TypeSmbSubscriptionsClickItem = this.typeSmbSubscriptionsClick;
        int hashCode3 = (hashCode2 + (commonEcommStat$TypeSmbSubscriptionsClickItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsClickItem.hashCode())) * 31;
        CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem = this.typeCommunityVerificationClick;
        return hashCode3 + (commonEcommStat$TypeCommunityVerificationClickItem != null ? commonEcommStat$TypeCommunityVerificationClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeEcommClickItem(type=" + this.type + ", typeAvitoIntegrationClick=" + this.typeAvitoIntegrationClick + ", typeSmbSubscriptionsClick=" + this.typeSmbSubscriptionsClick + ", typeCommunityVerificationClick=" + this.typeCommunityVerificationClick + ')';
    }

    public /* synthetic */ CommonEcommStat$TypeEcommClickItem(Type type, CommonEcommStat$TypeAvitoIntegrationClickItem commonEcommStat$TypeAvitoIntegrationClickItem, CommonEcommStat$TypeSmbSubscriptionsClickItem commonEcommStat$TypeSmbSubscriptionsClickItem, CommonEcommStat$TypeCommunityVerificationClickItem commonEcommStat$TypeCommunityVerificationClickItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : commonEcommStat$TypeAvitoIntegrationClickItem, (i & 4) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsClickItem, (i & 8) != 0 ? null : commonEcommStat$TypeCommunityVerificationClickItem);
    }
}
