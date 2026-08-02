package com.vk.core.utils;

import xsna.asp;
import xsna.zrp;

/* compiled from: CommunityOrganizationTitleBuilder.kt */
/* loaded from: classes17.dex */
public final class CommunityOrganizationTitleBuilder {
    public static final CommunityOrganizationTitleBuilder a = new CommunityOrganizationTitleBuilder();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityOrganizationTitleBuilder.kt */
    public static final class OrganizationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OrganizationType[] $VALUES;
        public static final OrganizationType GOVERNMENT_ORGANIZATION;
        public static final OrganizationType NON_PROFIT_ORGANIZATION;

        static {
            OrganizationType organizationType = new OrganizationType("NON_PROFIT_ORGANIZATION", 0);
            NON_PROFIT_ORGANIZATION = organizationType;
            OrganizationType organizationType2 = new OrganizationType("GOVERNMENT_ORGANIZATION", 1);
            GOVERNMENT_ORGANIZATION = organizationType2;
            OrganizationType[] organizationTypeArr = {organizationType, organizationType2};
            $VALUES = organizationTypeArr;
            $ENTRIES = new asp(organizationTypeArr);
        }

        public OrganizationType() {
            throw null;
        }

        public static OrganizationType valueOf(String str) {
            return (OrganizationType) Enum.valueOf(OrganizationType.class, str);
        }

        public static OrganizationType[] values() {
            return (OrganizationType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityOrganizationTitleBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrganizationType.values().length];
            try {
                iArr[OrganizationType.NON_PROFIT_ORGANIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrganizationType.GOVERNMENT_ORGANIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
