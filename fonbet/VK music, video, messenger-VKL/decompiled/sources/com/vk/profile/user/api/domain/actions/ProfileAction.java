package com.vk.profile.user.api.domain.actions;

import androidx.core.app.NotificationCompat;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.gs90;
import xsna.vv5;
import xsna.zrp;
import xsna.ztu;

/* compiled from: ProfileAction.kt */
/* loaded from: classes5.dex */
public interface ProfileAction {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileAction.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ADD_TO_CONVERSATION;
        public static final Type CALL;
        public static final Type CLIP;
        public static final Type FRIEND;
        public static final Type GIFT;
        public static final Type LIVE;
        public static final Type MEMORIES;
        public static final Type OPEN_APP;
        public static final Type PHOTO;
        public static final Type POST;
        public static final Type PROFILE_QUESTION;
        public static final Type SHARE;
        public static final Type STORY;
        private final String serverName;

        static {
            Type type = new Type("OPEN_APP", 0, "open_app");
            OPEN_APP = type;
            Type type2 = new Type("STORY", 1, "story");
            STORY = type2;
            Type type3 = new Type("POST", 2, "post");
            POST = type3;
            Type type4 = new Type("PHOTO", 3, "photo");
            PHOTO = type4;
            Type type5 = new Type("CLIP", 4, "clip");
            CLIP = type5;
            Type type6 = new Type("CALL", 5, NotificationCompat.CATEGORY_CALL);
            CALL = type6;
            Type type7 = new Type("GIFT", 6, "gift");
            GIFT = type7;
            Type type8 = new Type("LIVE", 7, "live");
            LIVE = type8;
            Type type9 = new Type("FRIEND", 8, "friend");
            FRIEND = type9;
            Type type10 = new Type("PROFILE_QUESTION", 9, "profile_question");
            PROFILE_QUESTION = type10;
            Type type11 = new Type("ADD_TO_CONVERSATION", 10, null);
            ADD_TO_CONVERSATION = type11;
            Type type12 = new Type("MEMORIES", 11, null);
            MEMORIES = type12;
            Type type13 = new Type("SHARE", 12, null);
            SHARE = type13;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.serverName = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String h() {
            return this.serverName;
        }
    }

    /* compiled from: ProfileAction.kt */
    public interface a {
        List<ProfileAction> a(ExtendedUserProfile extendedUserProfile, boolean z);

        ArrayList b(ExtendedUserProfile extendedUserProfile, boolean z);

        List<ProfileAction> c(ExtendedUserProfile extendedUserProfile, int i);
    }

    ztu a();

    vv5 b();

    int c();

    gs90.a getPayload();

    Type getType();
}
