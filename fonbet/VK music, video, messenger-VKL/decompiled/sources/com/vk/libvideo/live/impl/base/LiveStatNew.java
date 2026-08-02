package com.vk.libvideo.live.impl.base;

import android.os.Bundle;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonVideoStat$TypeLiveActionsItem;
import com.vk.stat.scheme.CommonVideoStat$TypeLiveCommentActionsItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.ciz;
import xsna.pvo0;
import xsna.q9k;
import xsna.qyk0;
import xsna.zrp;

/* compiled from: LiveStatNew.kt */
/* loaded from: classes3.dex */
public final class LiveStatNew {
    public UserType a;
    public String b;
    public String c;
    public String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveStatNew.kt */
    public static final class UserType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserType[] $VALUES;
        public static final UserType author;
        public static final UserType viewer;

        static {
            UserType userType = new UserType("author", 0);
            author = userType;
            UserType userType2 = new UserType("viewer", 1);
            viewer = userType2;
            UserType[] userTypeArr = {userType, userType2};
            $VALUES = userTypeArr;
            $ENTRIES = new asp(userTypeArr);
        }

        public UserType() {
            throw null;
        }

        public static UserType valueOf(String str) {
            return (UserType) Enum.valueOf(UserType.class, str);
        }

        public static UserType[] values() {
            return (UserType[]) $VALUES.clone();
        }
    }

    public static void d(UserId userId, int i, int i2, CommonVideoStat$TypeLiveCommentActionsItem.Type type) {
        UiTracker uiTracker = UiTracker.a;
        new ciz(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new CommonVideoStat$TypeLiveActionsItem(CommonVideoStat$TypeLiveActionsItem.Type.TYPE_LIVE_COMMENT_ACTIONS, userId.b, i, new CommonVideoStat$TypeLiveCommentActionsItem(type, i2), null), 3)).q();
    }

    public final void a(UserId userId) {
        Bundle a = q9k.a("action_type", "block_user");
        a.putLong("recipient_user_id", userId.b);
        b(a);
        qyk0.a().e("live_action", a);
    }

    public final void b(Bundle bundle) {
        bundle.putInt("ts", pvo0.a());
        bundle.putString("video_id", this.b);
        bundle.putString("track_code", this.c);
        bundle.putString("user_type", String.valueOf(this.a));
        bundle.putString("nav_screen", this.d);
    }

    public final void c(UserId userId) {
        Bundle a = q9k.a("action_type", "subscribe");
        a.putLong("recipient_user_id", userId.b);
        b(a);
        qyk0.a().e("live_action", a);
    }

    public final void e(UserId userId) {
        Bundle a = q9k.a("action_type", "view_streamer_profile");
        a.putLong("recipient_user_id", userId.b);
        b(a);
        qyk0.a().e("live_action", a);
    }
}
