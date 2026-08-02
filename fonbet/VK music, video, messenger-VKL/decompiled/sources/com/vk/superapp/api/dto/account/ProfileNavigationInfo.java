package com.vk.superapp.api.dto.account;

import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.pzd0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ProfileNavigationInfo.kt */
/* loaded from: classes6.dex */
public final class ProfileNavigationInfo {
    public final pzd0 a;
    public final b b;
    public final a c;
    public final SecurityInfo d;
    public final SecurityRecommendationIndicator e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileNavigationInfo.kt */
    public static final class SecurityInfo {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SecurityInfo[] $VALUES;
        public static final SecurityInfo ALL_GOOD;
        public static final a Companion;
        public static final SecurityInfo HAS_WARNINGS;
        public static final SecurityInfo NO_PHONE;
        public static final SecurityInfo NO_STATUS;
        private final int securityLevel;

        /* compiled from: ProfileNavigationInfo.kt */
        public static final class a {
        }

        static {
            SecurityInfo securityInfo = new SecurityInfo("NO_STATUS", 0, 0);
            NO_STATUS = securityInfo;
            SecurityInfo securityInfo2 = new SecurityInfo("NO_PHONE", 1, 1);
            NO_PHONE = securityInfo2;
            SecurityInfo securityInfo3 = new SecurityInfo("HAS_WARNINGS", 2, 10);
            HAS_WARNINGS = securityInfo3;
            SecurityInfo securityInfo4 = new SecurityInfo("ALL_GOOD", 3, 20);
            ALL_GOOD = securityInfo4;
            SecurityInfo[] securityInfoArr = {securityInfo, securityInfo2, securityInfo3, securityInfo4};
            $VALUES = securityInfoArr;
            $ENTRIES = new asp(securityInfoArr);
            Companion = new a();
        }

        public SecurityInfo(String str, int i, int i2) {
            this.securityLevel = i2;
        }

        public static SecurityInfo valueOf(String str) {
            return (SecurityInfo) Enum.valueOf(SecurityInfo.class, str);
        }

        public static SecurityInfo[] values() {
            return (SecurityInfo[]) $VALUES.clone();
        }

        public final int h() {
            return this.securityLevel;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileNavigationInfo.kt */
    public static final class SecurityRecommendationIndicator {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SecurityRecommendationIndicator[] $VALUES;
        public static final SecurityRecommendationIndicator CRITICAL_WARNING;
        public static final a Companion;
        public static final SecurityRecommendationIndicator NORMAL_WARNING;
        public static final SecurityRecommendationIndicator NO_WARNING;
        public static final SecurityRecommendationIndicator NO_WARNING_WELL_PROTECT;
        private final int indicator;

        /* compiled from: ProfileNavigationInfo.kt */
        public static final class a {
        }

        static {
            SecurityRecommendationIndicator securityRecommendationIndicator = new SecurityRecommendationIndicator("NO_WARNING", 0, 0);
            NO_WARNING = securityRecommendationIndicator;
            SecurityRecommendationIndicator securityRecommendationIndicator2 = new SecurityRecommendationIndicator("CRITICAL_WARNING", 1, 1);
            CRITICAL_WARNING = securityRecommendationIndicator2;
            SecurityRecommendationIndicator securityRecommendationIndicator3 = new SecurityRecommendationIndicator("NORMAL_WARNING", 2, 10);
            NORMAL_WARNING = securityRecommendationIndicator3;
            SecurityRecommendationIndicator securityRecommendationIndicator4 = new SecurityRecommendationIndicator("NO_WARNING_WELL_PROTECT", 3, 20);
            NO_WARNING_WELL_PROTECT = securityRecommendationIndicator4;
            SecurityRecommendationIndicator[] securityRecommendationIndicatorArr = {securityRecommendationIndicator, securityRecommendationIndicator2, securityRecommendationIndicator3, securityRecommendationIndicator4};
            $VALUES = securityRecommendationIndicatorArr;
            $ENTRIES = new asp(securityRecommendationIndicatorArr);
            Companion = new a();
        }

        public SecurityRecommendationIndicator(String str, int i, int i2) {
            this.indicator = i2;
        }

        public static SecurityRecommendationIndicator valueOf(String str) {
            return (SecurityRecommendationIndicator) Enum.valueOf(SecurityRecommendationIndicator.class, str);
        }

        public static SecurityRecommendationIndicator[] values() {
            return (SecurityRecommendationIndicator[]) $VALUES.clone();
        }

        public final int h() {
            return this.indicator;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileNavigationInfo.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type DIGITS;
        public static final Type OPEN;
        private final String type;

        /* compiled from: ProfileNavigationInfo.kt */
        public static final class a {
        }

        static {
            Type type = new Type("DIGITS", 0, "digits");
            DIGITS = type;
            Type type2 = new Type("OPEN", 1, "open");
            OPEN = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.type = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.type;
        }
    }

    /* compiled from: ProfileNavigationInfo.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkComboNavigationInfo(isEnabled=");
            sb.append(this.a);
            sb.append(", isShow=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ProfileNavigationInfo.kt */
    public static final class b {
        public final boolean a;
        public final String b;
        public final Type c;

        public b(boolean z, String str, Type type) {
            this.a = z;
            this.b = str;
            this.c = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "VkPayNavigationInfo(isEnabled=" + this.a + ", cardDigits=" + this.b + ", type=" + this.c + ')';
        }
    }

    public ProfileNavigationInfo(pzd0 pzd0Var, b bVar, a aVar, SecurityInfo securityInfo, SecurityRecommendationIndicator securityRecommendationIndicator) {
        this.a = pzd0Var;
        this.b = bVar;
        this.c = aVar;
        this.d = securityInfo;
        this.e = securityRecommendationIndicator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNavigationInfo)) {
            return false;
        }
        ProfileNavigationInfo profileNavigationInfo = (ProfileNavigationInfo) obj;
        return epx.f(this.a, profileNavigationInfo.a) && epx.f(this.b, profileNavigationInfo.b) && epx.f(this.c, profileNavigationInfo.c) && this.d == profileNavigationInfo.d && this.e == profileNavigationInfo.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileNavigationInfo(profileShortInfo=" + this.a + ", vkPayNavigationInfo=" + this.b + ", vkComboNavigationInfo=" + this.c + ", securityInfo=" + this.d + ", securityRecommendationIndicator=" + this.e + ')';
    }
}
