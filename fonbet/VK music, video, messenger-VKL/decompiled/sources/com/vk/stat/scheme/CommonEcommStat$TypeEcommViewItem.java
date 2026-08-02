package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeEcommViewItem implements SchemeStat$TypeView.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_avito_integration_view")
    private final CommonEcommStat$TypeAvitoIntegrationViewItem typeAvitoIntegrationView;

    @pmi0("type_community_verification_view")
    private final CommonEcommStat$TypeCommunityVerificationViewItem typeCommunityVerificationView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_avito_integration_view")
        public static final Type TYPE_AVITO_INTEGRATION_VIEW;

        @pmi0("type_community_verification_view")
        public static final Type TYPE_COMMUNITY_VERIFICATION_VIEW;

        static {
            Type type = new Type("TYPE_AVITO_INTEGRATION_VIEW", 0);
            TYPE_AVITO_INTEGRATION_VIEW = type;
            Type type2 = new Type("TYPE_COMMUNITY_VERIFICATION_VIEW", 1);
            TYPE_COMMUNITY_VERIFICATION_VIEW = type2;
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

    private CommonEcommStat$TypeEcommViewItem(Type type, CommonEcommStat$TypeAvitoIntegrationViewItem commonEcommStat$TypeAvitoIntegrationViewItem, CommonEcommStat$TypeCommunityVerificationViewItem commonEcommStat$TypeCommunityVerificationViewItem) {
        this.type = type;
        this.typeAvitoIntegrationView = commonEcommStat$TypeAvitoIntegrationViewItem;
        this.typeCommunityVerificationView = commonEcommStat$TypeCommunityVerificationViewItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeEcommViewItem)) {
            return false;
        }
        CommonEcommStat$TypeEcommViewItem commonEcommStat$TypeEcommViewItem = (CommonEcommStat$TypeEcommViewItem) obj;
        return this.type == commonEcommStat$TypeEcommViewItem.type && epx.f(this.typeAvitoIntegrationView, commonEcommStat$TypeEcommViewItem.typeAvitoIntegrationView) && epx.f(this.typeCommunityVerificationView, commonEcommStat$TypeEcommViewItem.typeCommunityVerificationView);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        CommonEcommStat$TypeAvitoIntegrationViewItem commonEcommStat$TypeAvitoIntegrationViewItem = this.typeAvitoIntegrationView;
        int hashCode2 = (hashCode + (commonEcommStat$TypeAvitoIntegrationViewItem == null ? 0 : commonEcommStat$TypeAvitoIntegrationViewItem.hashCode())) * 31;
        CommonEcommStat$TypeCommunityVerificationViewItem commonEcommStat$TypeCommunityVerificationViewItem = this.typeCommunityVerificationView;
        return hashCode2 + (commonEcommStat$TypeCommunityVerificationViewItem != null ? commonEcommStat$TypeCommunityVerificationViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeEcommViewItem(type=" + this.type + ", typeAvitoIntegrationView=" + this.typeAvitoIntegrationView + ", typeCommunityVerificationView=" + this.typeCommunityVerificationView + ')';
    }

    public /* synthetic */ CommonEcommStat$TypeEcommViewItem(Type type, CommonEcommStat$TypeAvitoIntegrationViewItem commonEcommStat$TypeAvitoIntegrationViewItem, CommonEcommStat$TypeCommunityVerificationViewItem commonEcommStat$TypeCommunityVerificationViewItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : commonEcommStat$TypeAvitoIntegrationViewItem, (i & 4) != 0 ? null : commonEcommStat$TypeCommunityVerificationViewItem);
    }
}
