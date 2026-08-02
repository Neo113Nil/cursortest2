package com.vk.voip.ui.prodstat.analytics.search.click;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.jdw0;
import xsna.mdw0;
import xsna.wew0;
import xsna.zrp;

/* compiled from: VoipSearchClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class VoipSearchClickAnalytics extends wew0<Event> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipSearchClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface Event extends mdw0 {

        /* compiled from: VoipSearchClickAnalytics.kt */
        public interface ServiceCallScreen extends Event {

            /* compiled from: VoipSearchClickAnalytics.kt */
            public static final class Friends implements ServiceCallScreen {
                public final Type a;
                public final String b;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VoipSearchClickAnalytics.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type CALL;
                    public static final Type OPEN_CHAT;
                    public static final Type SHARE_LINK;

                    static {
                        Type type = new Type("OPEN_CHAT", 0);
                        OPEN_CHAT = type;
                        Type type2 = new Type("CALL", 1);
                        CALL = type2;
                        Type type3 = new Type("SHARE_LINK", 2);
                        SHARE_LINK = type3;
                        Type[] typeArr = {type, type2, type3};
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

                public Friends(Type type, String str) {
                    this.a = type;
                    this.b = str;
                }

                @Override // com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics.Event.ServiceCallScreen
                public final String a() {
                    return "friends";
                }

                public final Type b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Friends)) {
                        return false;
                    }
                    Friends friends = (Friends) obj;
                    return this.a == friends.a && epx.f(this.b, friends.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                @Override // com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics.Event.ServiceCallScreen
                public final String r() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Friends(type=");
                    sb.append(this.a);
                    sb.append(", trackCode=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: VoipSearchClickAnalytics.kt */
            public static final class Global implements ServiceCallScreen {
                public final Type a;
                public final String b;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: VoipSearchClickAnalytics.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type ADD_FRIEND;
                    public static final Type OPEN_PROFILE;

                    static {
                        Type type = new Type("OPEN_PROFILE", 0);
                        OPEN_PROFILE = type;
                        Type type2 = new Type("ADD_FRIEND", 1);
                        ADD_FRIEND = type2;
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

                public Global(Type type, String str) {
                    this.a = type;
                    this.b = str;
                }

                @Override // com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics.Event.ServiceCallScreen
                public final String a() {
                    return "except_friends";
                }

                public final Type b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Global)) {
                        return false;
                    }
                    Global global = (Global) obj;
                    return this.a == global.a && epx.f(this.b, global.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                @Override // com.vk.voip.ui.prodstat.analytics.search.click.VoipSearchClickAnalytics.Event.ServiceCallScreen
                public final String r() {
                    return this.b;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Global(type=");
                    sb.append(this.a);
                    sb.append(", trackCode=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            String a();

            String r();
        }
    }

    /* compiled from: VoipSearchClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof Event;
        }
    }

    /* compiled from: VoipSearchClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Event.ServiceCallScreen.Friends.Type.values().length];
            try {
                iArr[Event.ServiceCallScreen.Friends.Type.OPEN_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.ServiceCallScreen.Friends.Type.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.ServiceCallScreen.Friends.Type.SHARE_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Event.ServiceCallScreen.Global.Type.values().length];
            try {
                iArr2[Event.ServiceCallScreen.Global.Type.OPEN_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Event.ServiceCallScreen.Global.Type.ADD_FRIEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof Event)) {
            return false;
        }
        b((Event) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(Event event) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action;
        if (!(event instanceof Event.ServiceCallScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        Event.ServiceCallScreen serviceCallScreen = (Event.ServiceCallScreen) event;
        if (serviceCallScreen instanceof Event.ServiceCallScreen.Friends) {
            int i = b.$EnumSwitchMapping$0[((Event.ServiceCallScreen.Friends) serviceCallScreen).b().ordinal()];
            if (i == 1) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            } else if (i == 2) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.CALL;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_MESSAGE;
            }
        } else {
            if (!(serviceCallScreen instanceof Event.ServiceCallScreen.Global)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = b.$EnumSwitchMapping$1[((Event.ServiceCallScreen.Global) serviceCallScreen).b().ordinal()];
            if (i2 == 1) {
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.ADD_FRIEND;
            }
        }
        wew0.c(this, null, new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, serviceCallScreen.r(), null, 46, null), new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, serviceCallScreen.a(), MobileOfficialAppsCoreNavStat$EventScreen.CALLS, 6, null), 5);
    }
}
