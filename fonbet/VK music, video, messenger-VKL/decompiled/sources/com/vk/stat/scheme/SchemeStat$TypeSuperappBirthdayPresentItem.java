package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSuperappBirthdayPresentItem implements SchemeStat$TypeNavgo.b, SchemeStat$TypeAction.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0("coupons")
    private final List<SchemeStat$TypeSuperappCouponItem> coupons;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("button_click")
        public static final Type BUTTON_CLICK;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Type CLOSE;

        @pmi0("coupon_click")
        public static final Type COUPON_CLICK;

        @pmi0("load")
        public static final Type LOAD;

        static {
            Type type = new Type("LOAD", 0);
            LOAD = type;
            Type type2 = new Type("COUPON_CLICK", 1);
            COUPON_CLICK = type2;
            Type type3 = new Type("BUTTON_CLICK", 2);
            BUTTON_CLICK = type3;
            Type type4 = new Type("CLOSE", 3);
            CLOSE = type4;
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

    public SchemeStat$TypeSuperappBirthdayPresentItem(Type type, List<SchemeStat$TypeSuperappCouponItem> list, Integer num) {
        this.type = type;
        this.coupons = list;
        this.actionIndex = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappBirthdayPresentItem)) {
            return false;
        }
        SchemeStat$TypeSuperappBirthdayPresentItem schemeStat$TypeSuperappBirthdayPresentItem = (SchemeStat$TypeSuperappBirthdayPresentItem) obj;
        return this.type == schemeStat$TypeSuperappBirthdayPresentItem.type && epx.f(this.coupons, schemeStat$TypeSuperappBirthdayPresentItem.coupons) && epx.f(this.actionIndex, schemeStat$TypeSuperappBirthdayPresentItem.actionIndex);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<SchemeStat$TypeSuperappCouponItem> list = this.coupons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.actionIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappBirthdayPresentItem(type=");
        sb.append(this.type);
        sb.append(", coupons=");
        sb.append(this.coupons);
        sb.append(", actionIndex=");
        return uqi.b(sb, this.actionIndex, ')');
    }

    public /* synthetic */ SchemeStat$TypeSuperappBirthdayPresentItem(Type type, List list, Integer num, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
