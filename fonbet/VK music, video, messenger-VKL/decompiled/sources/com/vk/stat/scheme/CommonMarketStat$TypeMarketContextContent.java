package com.vk.stat.scheme;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonMarketStat.kt */
/* loaded from: classes5.dex */
public final class CommonMarketStat$TypeMarketContextContent {

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonMarketStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("article")
        public static final Type ARTICLE;

        @pmi0("clip")
        public static final Type CLIP;

        @pmi0("live")
        public static final Type LIVE;

        @pmi0("market")
        public static final Type MARKET;

        @pmi0("photo")
        public static final Type PHOTO;

        @pmi0("post")
        public static final Type POST;

        @pmi0("story")
        public static final Type STORY;

        @pmi0("video")
        public static final Type VIDEO;

        @pmi0("wall")
        public static final Type WALL;

        static {
            Type type = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = type;
            Type type2 = new Type("CLIP", 1);
            CLIP = type2;
            Type type3 = new Type("WALL", 2);
            WALL = type3;
            Type type4 = new Type("PHOTO", 3);
            PHOTO = type4;
            Type type5 = new Type("STORY", 4);
            STORY = type5;
            Type type6 = new Type("LIVE", 5);
            LIVE = type6;
            Type type7 = new Type("ARTICLE", 6);
            ARTICLE = type7;
            Type type8 = new Type("MARKET", 7);
            MARKET = type8;
            Type type9 = new Type("POST", 8);
            POST = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CommonMarketStat$TypeMarketContextContent() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonMarketStat$TypeMarketContextContent)) {
            return false;
        }
        CommonMarketStat$TypeMarketContextContent commonMarketStat$TypeMarketContextContent = (CommonMarketStat$TypeMarketContextContent) obj;
        return this.type == commonMarketStat$TypeMarketContextContent.type && epx.f(this.id, commonMarketStat$TypeMarketContextContent.id) && epx.f(this.ownerId, commonMarketStat$TypeMarketContextContent.ownerId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMarketContextContent(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        return iq.b(sb, this.ownerId, ')');
    }

    public CommonMarketStat$TypeMarketContextContent(Type type, Integer num, Long l) {
        this.type = type;
        this.id = num;
        this.ownerId = l;
    }

    public /* synthetic */ CommonMarketStat$TypeMarketContextContent(Type type, Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }
}
