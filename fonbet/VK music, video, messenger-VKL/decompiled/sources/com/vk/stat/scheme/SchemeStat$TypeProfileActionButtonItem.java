package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeProfileActionButtonItem implements SchemeStat$TypeClick.b {

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("ask")
        public static final Type ASK;

        @pmi0(NotificationCompat.CATEGORY_CALL)
        public static final Type CALL;

        @pmi0("clip")
        public static final Type CLIP;

        @pmi0("friend")
        public static final Type FRIEND;

        @pmi0("launch_mini_app")
        public static final Type LAUNCH_MINI_APP;

        @pmi0("launch_third_party_app")
        public static final Type LAUNCH_THIRD_PARTY_APP;

        @pmi0("live")
        public static final Type LIVE;

        @pmi0("photo")
        public static final Type PHOTO;

        @pmi0("post")
        public static final Type POST;

        @pmi0("send_gift")
        public static final Type SEND_GIFT;

        @pmi0("send_money")
        public static final Type SEND_MONEY;

        @pmi0("story")
        public static final Type STORY;

        @pmi0("unfriend")
        public static final Type UNFRIEND;

        static {
            Type type = new Type("FRIEND", 0);
            FRIEND = type;
            Type type2 = new Type("UNFRIEND", 1);
            UNFRIEND = type2;
            Type type3 = new Type("SEND_MONEY", 2);
            SEND_MONEY = type3;
            Type type4 = new Type("SEND_GIFT", 3);
            SEND_GIFT = type4;
            Type type5 = new Type("ASK", 4);
            ASK = type5;
            Type type6 = new Type("LAUNCH_MINI_APP", 5);
            LAUNCH_MINI_APP = type6;
            Type type7 = new Type("CALL", 6);
            CALL = type7;
            Type type8 = new Type("CLIP", 7);
            CLIP = type8;
            Type type9 = new Type("PHOTO", 8);
            PHOTO = type9;
            Type type10 = new Type("POST", 9);
            POST = type10;
            Type type11 = new Type("LIVE", 10);
            LIVE = type11;
            Type type12 = new Type("STORY", 11);
            STORY = type12;
            Type type13 = new Type("LAUNCH_THIRD_PARTY_APP", 12);
            LAUNCH_THIRD_PARTY_APP = type13;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13};
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

    public SchemeStat$TypeProfileActionButtonItem(Type type, Integer num) {
        this.type = type;
        this.miniAppId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeProfileActionButtonItem)) {
            return false;
        }
        SchemeStat$TypeProfileActionButtonItem schemeStat$TypeProfileActionButtonItem = (SchemeStat$TypeProfileActionButtonItem) obj;
        return this.type == schemeStat$TypeProfileActionButtonItem.type && epx.f(this.miniAppId, schemeStat$TypeProfileActionButtonItem.miniAppId);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.miniAppId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeProfileActionButtonItem(type=");
        sb.append(this.type);
        sb.append(", miniAppId=");
        return uqi.b(sb, this.miniAppId, ')');
    }

    public /* synthetic */ SchemeStat$TypeProfileActionButtonItem(Type type, Integer num, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : num);
    }
}
