package com.vk.api.likes;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ahn;
import xsna.asp;
import xsna.brm0;
import xsna.h1f0;
import xsna.i5s;
import xsna.j5g;
import xsna.rsg0;
import xsna.zrp;

/* compiled from: LikesGetList.kt */
/* loaded from: classes15.dex */
public final class LikesGetList extends rsg0<VKList<ReactionUserProfile>> {
    public final ReactionMeta s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LikesGetList.kt */
    public static final class LikesOrder {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LikesOrder[] $VALUES;
        public static final LikesOrder ALL_USERS_BY_TIME;
        public static final LikesOrder ALL_USERS_FRIENDS_FIRST;
        public static final LikesOrder ONLY_FRIENDS_BY_HINTS;
        public static final LikesOrder ONLY_FRIENDS_BY_TIME;
        private final int value;

        static {
            LikesOrder likesOrder = new LikesOrder("ALL_USERS_BY_TIME", 0, 0);
            ALL_USERS_BY_TIME = likesOrder;
            LikesOrder likesOrder2 = new LikesOrder("ONLY_FRIENDS_BY_TIME", 1, 1);
            ONLY_FRIENDS_BY_TIME = likesOrder2;
            LikesOrder likesOrder3 = new LikesOrder("ONLY_FRIENDS_BY_HINTS", 2, 2);
            ONLY_FRIENDS_BY_HINTS = likesOrder3;
            LikesOrder likesOrder4 = new LikesOrder("ALL_USERS_FRIENDS_FIRST", 3, 3);
            ALL_USERS_FRIENDS_FIRST = likesOrder4;
            LikesOrder[] likesOrderArr = {likesOrder, likesOrder2, likesOrder3, likesOrder4};
            $VALUES = likesOrderArr;
            $ENTRIES = new asp(likesOrderArr);
        }

        public LikesOrder(String str, int i, int i2) {
            this.value = i2;
        }

        public static LikesOrder valueOf(String str) {
            return (LikesOrder) Enum.valueOf(LikesOrder.class, str);
        }

        public static LikesOrder[] values() {
            return (LikesOrder[]) $VALUES.clone();
        }

        public final int h() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LikesGetList.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type COMMENT;
        public static final a Companion;
        public static final Type GROUP;
        public static final Type MARKET;
        public static final Type NOTE;
        public static final Type PHOTO;
        public static final Type POST;
        public static final Type POST_ADS;
        public static final Type TOPIC;
        public static final Type VIDEO;
        private final String typeName;

        /* compiled from: LikesGetList.kt */
        public static final class a {
            public static Type a(String str) {
                if (str == null || str.length() == 0) {
                    return Type.POST;
                }
                Type[] values = Type.values();
                int length = values.length;
                for (int i = 0; i < length; i++) {
                    if (brm0.w(values[i].i(), str, true)) {
                        return values[i];
                    }
                }
                return Type.POST;
            }
        }

        static {
            Type type = new Type("POST", 0, "post");
            POST = type;
            Type type2 = new Type("PHOTO", 1, "photo");
            PHOTO = type2;
            Type type3 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 2, "video");
            VIDEO = type3;
            Type type4 = new Type("NOTE", 3, "note");
            NOTE = type4;
            Type type5 = new Type("TOPIC", 4, "topic");
            TOPIC = type5;
            Type type6 = new Type("COMMENT", 5, "comment");
            COMMENT = type6;
            Type type7 = new Type("MARKET", 6, "market");
            MARKET = type7;
            Type type8 = new Type("POST_ADS", 7, "post_ads");
            POST_ADS = type8;
            Type type9 = new Type("GROUP", 8, "group_like");
            GROUP = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
        }

        public Type(String str, int i, String str2) {
            this.typeName = str2;
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

        public final String a(Type type) {
            return (this == COMMENT && type != null && (type == PHOTO || type == VIDEO || type == TOPIC || type == MARKET)) ? i5s.a(new StringBuilder(), type.typeName, "_comment") : this.typeName;
        }

        public final String i() {
            return this.typeName;
        }
    }

    public /* synthetic */ LikesGetList(Type type, Type type2, UserId userId, long j, int i, LikesOrder likesOrder, List list) {
        this(type, type2, userId, j, 0, i, likesOrder, null, null, list, null);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ReactionMeta reactionMeta = this.s;
        if (reactionMeta == null) {
            return h1f0.b(jSONObject.getJSONObject("response"));
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        VKList vKList = new VKList();
        vKList.o(jSONObject2.optInt("count", 0));
        JSONArray optJSONArray = jSONObject2.optJSONArray("items");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                vKList.add(h1f0.e(optJSONArray.getJSONObject(i), reactionMeta));
            }
        }
        return vKList;
    }

    public LikesGetList(Type type, Type type2, UserId userId, long j, int i, int i2, LikesOrder likesOrder, String str, Integer num, List<String> list, ReactionMeta reactionMeta) {
        super("likes.getList");
        String str2;
        this.s = reactionMeta;
        K("type", type.a(type2));
        F(userId, "owner_id");
        D(j, "item_id");
        C(i2, "count");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(1, "extended");
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            str2 = "online_info,photo_base";
        } else {
            str2 = "online_info,photo_base," + j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62);
        }
        K("fields", str2);
        C(likesOrder.h(), "friends_only");
        if (str != null) {
            K("filter", str);
        }
        if (num != null) {
            C(num.intValue(), "reaction_id");
        }
        ahn.D(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LikesGetList(Type type, Type type2, UserId userId, long j, int i, int i2, boolean z, String str, ReactionMeta reactionMeta, int i3) {
        this(type, type2, userId, j, i, i2, r0, str, r14 != null ? Integer.valueOf(r14.getId()) : null, null, r14);
        LikesOrder likesOrder;
        ReactionMeta reactionMeta2 = (i3 & 512) != 0 ? null : reactionMeta;
        if (z) {
            likesOrder = LikesOrder.ONLY_FRIENDS_BY_TIME;
        } else {
            likesOrder = LikesOrder.ALL_USERS_BY_TIME;
        }
    }
}
