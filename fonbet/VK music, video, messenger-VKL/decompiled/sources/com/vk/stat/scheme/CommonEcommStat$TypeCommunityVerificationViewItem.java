package com.vk.stat.scheme;

import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeCommunityVerificationViewItem {

    @pmi0("business_verification_requirements_show")
    private final CommonEcommStat$BusinessVerificationRequirementsShowItem businessVerificationRequirementsShow;

    @pmi0("community_id")
    private final long communityId;

    @pmi0("premium_verification_requirements_show")
    private final CommonEcommStat$PremiumVerificationRequirementsShowItem premiumVerificationRequirementsShow;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("business_verification_requirements_show")
        public static final Type BUSINESS_VERIFICATION_REQUIREMENTS_SHOW;

        @pmi0("premium_verification_requirements_show")
        public static final Type PREMIUM_VERIFICATION_REQUIREMENTS_SHOW;

        static {
            Type type = new Type("PREMIUM_VERIFICATION_REQUIREMENTS_SHOW", 0);
            PREMIUM_VERIFICATION_REQUIREMENTS_SHOW = type;
            Type type2 = new Type("BUSINESS_VERIFICATION_REQUIREMENTS_SHOW", 1);
            BUSINESS_VERIFICATION_REQUIREMENTS_SHOW = type2;
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

    private CommonEcommStat$TypeCommunityVerificationViewItem(Type type, long j, CommonEcommStat$PremiumVerificationRequirementsShowItem commonEcommStat$PremiumVerificationRequirementsShowItem, CommonEcommStat$BusinessVerificationRequirementsShowItem commonEcommStat$BusinessVerificationRequirementsShowItem) {
        this.type = type;
        this.communityId = j;
        this.premiumVerificationRequirementsShow = commonEcommStat$PremiumVerificationRequirementsShowItem;
        this.businessVerificationRequirementsShow = commonEcommStat$BusinessVerificationRequirementsShowItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeCommunityVerificationViewItem)) {
            return false;
        }
        CommonEcommStat$TypeCommunityVerificationViewItem commonEcommStat$TypeCommunityVerificationViewItem = (CommonEcommStat$TypeCommunityVerificationViewItem) obj;
        return this.type == commonEcommStat$TypeCommunityVerificationViewItem.type && this.communityId == commonEcommStat$TypeCommunityVerificationViewItem.communityId && epx.f(this.premiumVerificationRequirementsShow, commonEcommStat$TypeCommunityVerificationViewItem.premiumVerificationRequirementsShow) && epx.f(this.businessVerificationRequirementsShow, commonEcommStat$TypeCommunityVerificationViewItem.businessVerificationRequirementsShow);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        CommonEcommStat$PremiumVerificationRequirementsShowItem commonEcommStat$PremiumVerificationRequirementsShowItem = this.premiumVerificationRequirementsShow;
        int hashCode = (a + (commonEcommStat$PremiumVerificationRequirementsShowItem == null ? 0 : commonEcommStat$PremiumVerificationRequirementsShowItem.hashCode())) * 31;
        CommonEcommStat$BusinessVerificationRequirementsShowItem commonEcommStat$BusinessVerificationRequirementsShowItem = this.businessVerificationRequirementsShow;
        return hashCode + (commonEcommStat$BusinessVerificationRequirementsShowItem != null ? commonEcommStat$BusinessVerificationRequirementsShowItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeCommunityVerificationViewItem(type=" + this.type + ", communityId=" + this.communityId + ", premiumVerificationRequirementsShow=" + this.premiumVerificationRequirementsShow + ", businessVerificationRequirementsShow=" + this.businessVerificationRequirementsShow + ')';
    }

    public /* synthetic */ CommonEcommStat$TypeCommunityVerificationViewItem(Type type, long j, CommonEcommStat$PremiumVerificationRequirementsShowItem commonEcommStat$PremiumVerificationRequirementsShowItem, CommonEcommStat$BusinessVerificationRequirementsShowItem commonEcommStat$BusinessVerificationRequirementsShowItem, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : commonEcommStat$PremiumVerificationRequirementsShowItem, (i & 8) != 0 ? null : commonEcommStat$BusinessVerificationRequirementsShowItem);
    }
}
