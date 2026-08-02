package com.vk.friends.recommendations.impl.presentation;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.user.RequestUserProfile;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.shy;
import xsna.zrp;

/* compiled from: Item.kt */
/* loaded from: classes16.dex */
public final class Item {
    public final Type a;
    public final int b;
    public final RequestUserProfile c;
    public final List<SearchFriendsItem> d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Item.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type FOLLOW_SUGGEST;
        public static final Type IMPORTS;
        public static final Type REQUEST;
        public static final Type REQUEST_NOT_REAL;
        public static final Type SEARCH_LIST;
        public static final Type TITLE;

        static {
            Type type = new Type("SEARCH_LIST", 0);
            SEARCH_LIST = type;
            Type type2 = new Type("IMPORTS", 1);
            IMPORTS = type2;
            Type type3 = new Type(NativeAdContent.ViewTag.AD_TITLE, 2);
            TITLE = type3;
            Type type4 = new Type("REQUEST", 3);
            REQUEST = type4;
            Type type5 = new Type("FOLLOW_SUGGEST", 4);
            FOLLOW_SUGGEST = type5;
            Type type6 = new Type("REQUEST_NOT_REAL", 5);
            REQUEST_NOT_REAL = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    public Item(Type type, int i, RequestUserProfile requestUserProfile, List<SearchFriendsItem> list) {
        this.a = type;
        this.b = i;
        this.c = requestUserProfile;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.a == item.a && this.b == item.b && epx.f(this.c, item.c) && epx.f(this.d, item.d);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        RequestUserProfile requestUserProfile = this.c;
        int hashCode = (a + (requestUserProfile == null ? 0 : requestUserProfile.hashCode())) * 31;
        List<SearchFriendsItem> list = this.d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", profile=");
        sb.append(this.c);
        sb.append(", searchFriendsList=");
        return ms9.a(')', sb, this.d);
    }

    public /* synthetic */ Item(Type type, int i, RequestUserProfile requestUserProfile, List list, int i2) {
        this(type, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : requestUserProfile, (i2 & 8) != 0 ? null : list);
    }
}
