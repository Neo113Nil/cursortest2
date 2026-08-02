package com.vk.ecomm.clipproductattaches.models;

import java.util.Iterator;
import xsna.asp;
import xsna.dly;
import xsna.epx;
import xsna.urd0;
import xsna.zrp;

/* compiled from: GoodItem.kt */
/* loaded from: classes18.dex */
public final class GoodBadge {
    public final BadgeType a;
    public final String b;
    public final dly c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GoodItem.kt */
    public static final class BadgeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final a Companion;
        public static final BadgeType DEFAULT;
        public static final BadgeType MULTI_INTEGRATION;
        public static final BadgeType OZON;
        private final int type;

        /* compiled from: GoodItem.kt */
        public static final class a {
            public static BadgeType a(Integer num) {
                Object obj;
                Iterator<E> it = BadgeType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    int i = ((BadgeType) obj).i();
                    if (num != null && i == num.intValue()) {
                        break;
                    }
                }
                return (BadgeType) obj;
            }
        }

        static {
            BadgeType badgeType = new BadgeType("DEFAULT", 0, 0);
            DEFAULT = badgeType;
            BadgeType badgeType2 = new BadgeType("OZON", 1, 2);
            OZON = badgeType2;
            BadgeType badgeType3 = new BadgeType("MULTI_INTEGRATION", 2, 3);
            MULTI_INTEGRATION = badgeType3;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3};
            $VALUES = badgeTypeArr;
            $ENTRIES = new asp(badgeTypeArr);
            Companion = new a();
        }

        public BadgeType(String str, int i, int i2) {
            this.type = i2;
        }

        public static zrp<BadgeType> h() {
            return $ENTRIES;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }

        public final int i() {
            return this.type;
        }
    }

    public GoodBadge(BadgeType badgeType, String str, dly dlyVar) {
        this.a = badgeType;
        this.b = str;
        this.c = dlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodBadge)) {
            return false;
        }
        GoodBadge goodBadge = (GoodBadge) obj;
        return this.a == goodBadge.a && epx.f(this.b, goodBadge.b) && epx.f(this.c, goodBadge.c);
    }

    public final int hashCode() {
        BadgeType badgeType = this.a;
        int a = urd0.a((badgeType == null ? 0 : badgeType.hashCode()) * 31, 31, this.b);
        dly dlyVar = this.c;
        return a + (dlyVar != null ? dlyVar.hashCode() : 0);
    }

    public final String toString() {
        return "GoodBadge(type=" + this.a + ", text=" + this.b + ", labelIcon=" + this.c + ')';
    }
}
