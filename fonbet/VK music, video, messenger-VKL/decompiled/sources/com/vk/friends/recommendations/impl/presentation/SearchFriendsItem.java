package com.vk.friends.recommendations.impl.presentation;

import xsna.asp;
import xsna.shy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: SearchFriendsItem.kt */
/* loaded from: classes16.dex */
public final class SearchFriendsItem {
    public final Type a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchFriendsItem.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ICON_TEXT;
        public static final Type SPACE;

        static {
            Type type = new Type("ICON_TEXT", 0);
            ICON_TEXT = type;
            Type type2 = new Type("SPACE", 1);
            SPACE = type2;
            Type[] typeArr = {type, type2};
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

    public SearchFriendsItem(Type type, int i, int i2, int i3) {
        this.a = type;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFriendsItem)) {
            return false;
        }
        SearchFriendsItem searchFriendsItem = (SearchFriendsItem) obj;
        return this.a == searchFriendsItem.a && this.b == searchFriendsItem.b && this.c == searchFriendsItem.c && this.d == searchFriendsItem.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFriendsItem(type=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", title=");
        return vu5.b(sb, this.d, ')');
    }
}
