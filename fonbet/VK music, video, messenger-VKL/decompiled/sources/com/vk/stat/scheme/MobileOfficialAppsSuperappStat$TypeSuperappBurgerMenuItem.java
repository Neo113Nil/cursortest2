package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSuperappStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("click_index")
    private final Integer clickIndex;

    @pmi0("items")
    private final List<String> items;

    @pmi0("security_level")
    private final SecurityLevel securityLevel;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSuperappStat.kt */
    public static final class SecurityLevel {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SecurityLevel[] $VALUES;

        @pmi0("all_good")
        public static final SecurityLevel ALL_GOOD;

        @pmi0("has_warnings")
        public static final SecurityLevel HAS_WARNINGS;

        @pmi0("no_phone")
        public static final SecurityLevel NO_PHONE;

        @pmi0("no_status")
        public static final SecurityLevel NO_STATUS;

        static {
            SecurityLevel securityLevel = new SecurityLevel("NO_STATUS", 0);
            NO_STATUS = securityLevel;
            SecurityLevel securityLevel2 = new SecurityLevel("NO_PHONE", 1);
            NO_PHONE = securityLevel2;
            SecurityLevel securityLevel3 = new SecurityLevel("HAS_WARNINGS", 2);
            HAS_WARNINGS = securityLevel3;
            SecurityLevel securityLevel4 = new SecurityLevel("ALL_GOOD", 3);
            ALL_GOOD = securityLevel4;
            SecurityLevel[] securityLevelArr = {securityLevel, securityLevel2, securityLevel3, securityLevel4};
            $VALUES = securityLevelArr;
            $ENTRIES = new asp(securityLevelArr);
        }

        private SecurityLevel(String str, int i) {
        }

        public static SecurityLevel valueOf(String str) {
            return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
        }

        public static SecurityLevel[] values() {
            return (SecurityLevel[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem(List<String> list, SecurityLevel securityLevel, Integer num) {
        this.items = list;
        this.securityLevel = securityLevel;
        this.clickIndex = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem)) {
            return false;
        }
        MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem = (MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem) obj;
        return epx.f(this.items, mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.items) && this.securityLevel == mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.securityLevel && epx.f(this.clickIndex, mobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem.clickIndex);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        SecurityLevel securityLevel = this.securityLevel;
        int hashCode2 = (hashCode + (securityLevel == null ? 0 : securityLevel.hashCode())) * 31;
        Integer num = this.clickIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappBurgerMenuItem(items=");
        sb.append(this.items);
        sb.append(", securityLevel=");
        sb.append(this.securityLevel);
        sb.append(", clickIndex=");
        return uqi.b(sb, this.clickIndex, ')');
    }

    public /* synthetic */ MobileOfficialAppsSuperappStat$TypeSuperappBurgerMenuItem(List list, SecurityLevel securityLevel, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : securityLevel, (i & 4) != 0 ? null : num);
    }
}
