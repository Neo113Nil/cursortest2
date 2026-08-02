package com.vk.voip.ui.scheduled.creation.ui.settings.ui.state;

import com.vkontakte.android.R;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.hfz;
import xsna.shy;
import xsna.uqi;
import xsna.zrp;

/* compiled from: VoipScheduledCallSettingsContentViewState.kt */
/* loaded from: classes7.dex */
public abstract class VoipScheduledCallSettingsContentViewState$ScreenState$Item implements hfz {

    /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
    public static final class Setting extends VoipScheduledCallSettingsContentViewState$ScreenState$Item {
        public final Type b;
        public final int c;
        public final a d;
        public final Integer e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type ANONYMOUS_JOIN;
            public static final Type AUDIO_MUTE;
            public static final Type FEEDBACK;
            public static final Type RECORD;
            public static final Type SCREEN_SHARING;
            public static final Type SHOULD_SHOW_CHAT_HISTORY;
            public static final Type VIDEO_MUTE;
            public static final Type WAITING_HALL;
            public static final Type WATCH_TOGETHER_ITEM;

            static {
                Type type = new Type("WAITING_HALL", 0);
                WAITING_HALL = type;
                Type type2 = new Type("ANONYMOUS_JOIN", 1);
                ANONYMOUS_JOIN = type2;
                Type type3 = new Type("FEEDBACK", 2);
                FEEDBACK = type3;
                Type type4 = new Type("AUDIO_MUTE", 3);
                AUDIO_MUTE = type4;
                Type type5 = new Type("VIDEO_MUTE", 4);
                VIDEO_MUTE = type5;
                Type type6 = new Type("WATCH_TOGETHER_ITEM", 5);
                WATCH_TOGETHER_ITEM = type6;
                Type type7 = new Type(SignalingProtocol.MEDIA_OPTION_SCREEN_SHARING, 6);
                SCREEN_SHARING = type7;
                Type type8 = new Type("RECORD", 7);
                RECORD = type8;
                Type type9 = new Type("SHOULD_SHOW_CHAT_HISTORY", 8);
                SHOULD_SHOW_CHAT_HISTORY = type9;
                Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
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

        /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
        public static abstract class a {

            /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
            /* renamed from: com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item$Setting$a$a, reason: collision with other inner class name */
            public static final class C2074a extends a {
                public static final C2074a a = new C2074a();
            }

            /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
            public static final class b extends a {
                public static final b a = new b();
            }

            /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
            public static final class c extends a {
                public static final c a = new c();
            }
        }

        public Setting(Type type, int i, a aVar, Integer num) {
            this.b = type;
            this.c = i;
            this.d = aVar;
            this.e = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Setting)) {
                return false;
            }
            Setting setting = (Setting) obj;
            return this.b == setting.b && this.c == setting.c && epx.f(this.d, setting.d) && epx.f(this.e, setting.e);
        }

        @Override // com.vk.voip.ui.scheduled.creation.ui.settings.ui.state.VoipScheduledCallSettingsContentViewState$ScreenState$Item, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.ordinal());
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31)) * 31;
            Integer num = this.e;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Setting(type=");
            sb.append(this.b);
            sb.append(", titleId=");
            sb.append(this.c);
            sb.append(", switchState=");
            sb.append(this.d);
            sb.append(", subtitleText=");
            return uqi.b(sb, this.e, ')');
        }
    }

    /* compiled from: VoipScheduledCallSettingsContentViewState.kt */
    public static final class a extends VoipScheduledCallSettingsContentViewState$ScreenState$Item {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.voip_scheduled_call_options_item_title);
        }

        public final String toString() {
            return "Title(title=2131971372)";
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
