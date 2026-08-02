package com.vk.profile.community.impl.ui.item.header.model;

import com.vk.dto.group.GroupMarketInfo;
import defpackage.q0;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.s4h;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CommunityTrustMarkItemModel.kt */
/* loaded from: classes5.dex */
public final class CommunityTrustMarkItemModel extends s4h {
    public final GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code b;
    public final Type c;
    public final String d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityTrustMarkItemModel.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DATE;
        public static final Type DELIVERY;
        public static final Type DOCS;
        public static final Type FRIENDS;
        public static final Type NONE;
        public static final Type OZON;
        public static final Type POPULAR;
        public static final Type YCLIENTS;

        static {
            Type type = new Type("NONE", 0);
            NONE = type;
            Type type2 = new Type("DOCS", 1);
            DOCS = type2;
            Type type3 = new Type("POPULAR", 2);
            POPULAR = type3;
            Type type4 = new Type(Privacy.FRIENDS, 3);
            FRIENDS = type4;
            Type type5 = new Type("DATE", 4);
            DATE = type5;
            Type type6 = new Type("YCLIENTS", 5);
            YCLIENTS = type6;
            Type type7 = new Type("OZON", 6);
            OZON = type7;
            Type type8 = new Type("DELIVERY", 7);
            DELIVERY = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommunityTrustMarkItemModel(GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code code, Type type, String str, boolean z) {
        this.b = code;
        this.c = type;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunityTrustMarkItemModel)) {
            return false;
        }
        CommunityTrustMarkItemModel communityTrustMarkItemModel = (CommunityTrustMarkItemModel) obj;
        return this.b == communityTrustMarkItemModel.b && this.c == communityTrustMarkItemModel.c && epx.f(this.d, communityTrustMarkItemModel.d) && this.e == communityTrustMarkItemModel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityTrustMarkItemModel(mainCode=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", isAdmin=");
        return q0.a(sb, this.e, ')');
    }
}
