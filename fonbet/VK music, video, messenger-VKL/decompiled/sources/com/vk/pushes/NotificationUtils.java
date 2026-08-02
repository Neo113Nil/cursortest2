package com.vk.pushes;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4504q2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.aaw;
import xsna.epx;
import xsna.go9;
import xsna.qaj0;
import xsna.t5m;

/* loaded from: classes5.dex */
public final class NotificationUtils {
    public static final boolean a = ((Boolean) t5m.a.getValue()).booleanValue();
    public static final HashMap b = new HashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Id {
        private static final /* synthetic */ Id[] $VALUES;
        public static final Id NewMsg;
        private final int id = 10;

        static {
            Id id = new Id();
            NewMsg = id;
            $VALUES = new Id[]{id};
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Id{id=" + this.id + "} " + super.toString();
        }
    }

    public enum Type {
        PrivateMessages("PrivateMessages"),
        ChatMessages("ChatMessages"),
        FriendRequests("FriendRequests"),
        FoundFriends("FoundFriends"),
        Replies("Replies"),
        Comments("Comments"),
        Mentions("Mentions"),
        Likes("Likes"),
        Reposts("Reposts"),
        Posts("Posts"),
        GroupInvites("GroupInvites"),
        UpcomingEvents("UpcomingEvents"),
        PhotoTags("PhotoTags"),
        VideoTags("VideoTags"),
        Games("Games"),
        Gifts("Gifts"),
        BDays("BDays"),
        ChatMentions("ChatMentions"),
        Default("__"),
        LiveBroadcasts("LiveBroadcasts"),
        StoryReplies("StoryReplies"),
        CommunityMessages("CommunityMessages"),
        CommunityChannelsMessages("CommunityChannelsMessages"),
        VkAppChannels("CommunityChannel"),
        Calls("Calls");

        public static final List<Type> MSG_TYPES;
        private final String key;

        static {
            Type type = PrivateMessages;
            Type type2 = ChatMessages;
            Type type3 = CommunityMessages;
            Object[] objArr = {type, type2, CommunityChannelsMessages, type3, VkAppChannels};
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                Object obj = objArr[i];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            MSG_TYPES = Collections.unmodifiableList(arrayList);
        }

        Type(String str) {
            this.key = str;
        }

        @Nullable
        public static Type b(String str) {
            str.getClass();
            switch (str) {
                case "private_messages":
                    return PrivateMessages;
                case "group_chats":
                    return ChatMessages;
                case "channels":
                    return VkAppChannels;
                case "groups_messages_pushes":
                    return CommunityMessages;
                case "community_channels_messages":
                    return CommunityChannelsMessages;
                default:
                    return null;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.key;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[Type.PrivateMessages.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Type.ChatMessages.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Type.CommunityMessages.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Type.CommunityChannelsMessages.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Type.VkAppChannels.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class b implements SharedPreferences.OnSharedPreferenceChangeListener {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.a.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public static synchronized void a(Context context, c cVar) {
        SharedPreferences g;
        synchronized (NotificationUtils.class) {
            try {
                if (BuildInfo.t()) {
                    aaw.b.getClass();
                    g = aaw.c();
                } else {
                    g = Preference.g(context);
                }
                b bVar = new b(cVar);
                b.put(cVar, bVar);
                g.registerOnSharedPreferenceChangeListener(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(Context context, NotificationCompat.h hVar, Type type, boolean z, boolean z2) {
        SharedPreferences g = Preference.g(context);
        if (a) {
            try {
                Field declaredField = NotificationCompat.h.class.getDeclaredField("mFlymeNotification");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(hVar);
                Field declaredField2 = obj.getClass().getDeclaredField("internalApp");
                declaredField2.setAccessible(true);
                declaredField2.setInt(obj, 1);
            } catch (Exception e) {
                L.C("vk", e);
            }
        }
        StringBuilder sb = new StringBuilder("notifyAdvanced");
        sb.append(type.key);
        String str = g.getBoolean(sb.toString(), false) ? type.key : "";
        String b2 = go9.b("notifyRingtone", str);
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        if (g.getString(b2, uri.toString()).length() <= 0 || !z) {
            hVar.A(null);
        } else {
            hVar.A(Uri.parse(g.getString(go9.b("notifyRingtone", str), uri.toString())));
        }
        hVar.l(0);
        if (!g.getBoolean("notifyVibrate" + str, true) || z2) {
            hVar.I.vibrate = new long[0];
        } else {
            hVar.l(2);
        }
        if (g.getBoolean("notifyLED" + str, true)) {
            hVar.r(g.getInt("notifyLedColor", -1), 1000, 1000);
        }
        hVar.u = NotificationCompat.CATEGORY_SOCIAL;
        if (g.getBoolean("notifyHeadsUp" + str, true)) {
            hVar.k = 2;
        }
    }

    public static boolean c(Context context, Type type, UserId userId) {
        if (BuildInfo.t()) {
            aaw.b.getClass();
            return aaw.b(type, userId);
        }
        return Preference.g(context).getBoolean(C4504q2.x + type.key, true);
    }

    public static String d(Context context, Type type) {
        SharedPreferences g = Preference.g(context);
        StringBuilder sb = new StringBuilder("notifyAdvanced");
        sb.append(type.key);
        return g.getBoolean(sb.toString(), false) ? type.key : "";
    }

    public static Uri e(Context context, Type type) {
        return Uri.parse(Preference.g(context).getString("notifyRingtone" + d(context, type), Settings.System.DEFAULT_NOTIFICATION_URI.toString()));
    }

    public static boolean f(Context context, Type type) {
        return Preference.g(context).getBoolean(C4504q2.x + d(context, type), true);
    }

    public static boolean g(Context context, Type type) {
        int i = a.a[type.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            return "sound_and_vibration".equals(Preference.g(context).getString("notificationNoSoundAndVibration" + type, "sound_and_vibration"));
        }
        L.l("[NotificationUtils] Unexpected type " + type + "  when checking isMsgSoundAndVibrationEnabled");
        return false;
    }

    public static boolean h(Context context, Type type) {
        int i = a.a[type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            L.l("[NotificationUtils] Unexpected type when checking isMsgTextEnabled");
            return false;
        }
        return "name_and_text".equals(Preference.g(context).getString("notificationNoText" + type, "name_and_text"));
    }

    public static boolean i(Context context, Type type, UserId userId) {
        List<Type> list = Type.MSG_TYPES;
        if (!list.contains(type)) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"[NotificationUtils] type " + type + " isn't in MSG_TYPES when checking isMsgTextEnabled"});
                return false;
            }
        } else {
            if (!BuildInfo.t()) {
                return h(context, type);
            }
            aaw.b.getClass();
            if (list.contains(type)) {
                return epx.f(aaw.d(userId).getString("notification_payload_for_" + type, "name_and_text"), "name_and_text");
            }
        }
        return false;
    }

    public static synchronized void j(Context context, c cVar) {
        SharedPreferences g;
        synchronized (NotificationUtils.class) {
            try {
                if (BuildInfo.t()) {
                    aaw.b.getClass();
                    g = aaw.c();
                } else {
                    g = Preference.g(context);
                }
                b bVar = (b) b.remove(cVar);
                if (bVar != null) {
                    g.unregisterOnSharedPreferenceChangeListener(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(Context context, Type type, boolean z) {
        if (!BuildInfo.t()) {
            Preference.g(context).edit().putBoolean(C4504q2.x + type.key, z).apply();
            return;
        }
        aaw.b.getClass();
        qaj0.c(aaw.c(), "are_notifications_enabled_for_" + type, Boolean.valueOf(z));
    }

    public static void l(Context context, Type type, boolean z) {
        int i = a.a[type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            L.l("[NotificationUtils] type " + type + " isn't valid when saveMsgTextEnabled");
            return;
        }
        if (BuildInfo.t()) {
            aaw.b.getClass();
            aaw.e(type, z);
            return;
        }
        String str = z ? "name_and_text" : "name_only";
        Preference.g(context).edit().putString("notificationNoText" + type, str).apply();
    }

    public static void m(Context context, Type type, boolean z) {
        int i = a.a[type.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            L.l("[NotificationUtils] type " + type + " isn't valid when saveSoundAndVibrationEnabled");
            return;
        }
        String str = z ? "sound_and_vibration" : "no_sound";
        Preference.g(context).edit().putString("notificationNoSoundAndVibration" + type, str).apply();
    }
}
