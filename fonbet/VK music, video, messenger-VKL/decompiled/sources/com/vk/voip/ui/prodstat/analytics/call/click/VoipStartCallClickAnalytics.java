package com.vk.voip.ui.prodstat.analytics.call.click;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.gjw0;
import xsna.jdw0;
import xsna.mdw0;
import xsna.wew0;
import xsna.zrp;

/* compiled from: VoipStartCallClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class VoipStartCallClickAnalytics extends wew0<Event> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipStartCallClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface Event extends mdw0 {

        /* compiled from: VoipStartCallClickAnalytics.kt */
        public static final class OutgoingCall implements Event {
            public final Type a;
            public final Source b;
            public final VoipCallTypeAnalytics c;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: VoipStartCallClickAnalytics.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type AUDIO;
                public static final Type AUDIO_MAIN;
                public static final Type BY_PHONE_AUDIO;
                public static final Type MAX;
                public static final Type VIDEO;

                static {
                    Type type = new Type(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
                    AUDIO = type;
                    Type type2 = new Type("AUDIO_MAIN", 1);
                    AUDIO_MAIN = type2;
                    Type type3 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 2);
                    VIDEO = type3;
                    Type type4 = new Type("BY_PHONE_AUDIO", 3);
                    BY_PHONE_AUDIO = type4;
                    Type type5 = new Type("MAX", 4);
                    MAX = type5;
                    Type[] typeArr = {type, type2, type3, type4, type5};
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

            public OutgoingCall(Type type, Source source, VoipCallTypeAnalytics voipCallTypeAnalytics) {
                this.a = type;
                this.b = source;
                this.c = voipCallTypeAnalytics;
            }

            public final VoipCallTypeAnalytics b() {
                return this.c;
            }

            public final Source c() {
                return this.b;
            }

            public final Type d() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OutgoingCall)) {
                    return false;
                }
                OutgoingCall outgoingCall = (OutgoingCall) obj;
                return this.a == outgoingCall.a && this.b == outgoingCall.b && this.c == outgoingCall.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "OutgoingCall(type=" + this.a + ", source=" + this.b + ", callType=" + this.c + ')';
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipStartCallClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CALLS_SERVICES;
        public static final Source CALLS_SERVICES_EMPTY_SEARCH;
        public static final Source CALLS_SERVICES_OTHER;
        public static final Source FRIENDS_LIST;
        public static final Source IM_PROFILE;
        public static final Source PAST_CALLS;
        public static final Source PAST_CALLS_OTHER;
        public static final Source PROFILE;

        static {
            Source source = new Source("CALLS_SERVICES", 0);
            CALLS_SERVICES = source;
            Source source2 = new Source("CALLS_SERVICES_OTHER", 1);
            CALLS_SERVICES_OTHER = source2;
            Source source3 = new Source("IM_PROFILE", 2);
            IM_PROFILE = source3;
            Source source4 = new Source("PAST_CALLS", 3);
            PAST_CALLS = source4;
            Source source5 = new Source("PAST_CALLS_OTHER", 4);
            PAST_CALLS_OTHER = source5;
            Source source6 = new Source("FRIENDS_LIST", 5);
            FRIENDS_LIST = source6;
            Source source7 = new Source("PROFILE", 6);
            PROFILE = source7;
            Source source8 = new Source("CALLS_SERVICES_EMPTY_SEARCH", 7);
            CALLS_SERVICES_EMPTY_SEARCH = source8;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7, source8};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* compiled from: VoipStartCallClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof Event;
        }
    }

    /* compiled from: VoipStartCallClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Event.OutgoingCall.Type.values().length];
            try {
                iArr[Event.OutgoingCall.Type.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.OutgoingCall.Type.AUDIO_MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Event.OutgoingCall.Type.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Event.OutgoingCall.Type.BY_PHONE_AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Event.OutgoingCall.Type.MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Source.values().length];
            try {
                iArr2[Source.CALLS_SERVICES.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Source.CALLS_SERVICES_OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Source.IM_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Source.PAST_CALLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Source.PAST_CALLS_OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Source.FRIENDS_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Source.PROFILE.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Source.CALLS_SERVICES_EMPTY_SEARCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
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
        MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType eventType;
        MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source source;
        if (!(event instanceof Event.OutgoingCall)) {
            throw new NoWhenBranchMatchedException();
        }
        Event.OutgoingCall outgoingCall = (Event.OutgoingCall) event;
        int i = b.$EnumSwitchMapping$0[outgoingCall.d().ordinal()];
        if (i == 1) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_AUDIO_CLICK;
        } else if (i == 2) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_AUDIO_MAIN_CLICK;
        } else if (i == 3) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_VIDEO_CLICK;
        } else if (i == 4) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_STARTED_AUDIO_CONTACT_CLICK;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.MAX_CALL_CLICK;
        }
        switch (b.$EnumSwitchMapping$1[outgoingCall.c().ordinal()]) {
            case 1:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.CALLS_SERVICES;
                break;
            case 2:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.CALLS_SERVICES_OTHER;
                break;
            case 3:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.IM_PROFILE;
                break;
            case 4:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.HISTORY_FRIENDS_LIST_SERVICES;
                break;
            case 5:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.HISTORY_FRIENDS_LIST_SERVICES_OTHER;
                break;
            case 6:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.FRIENDS_LIST;
                break;
            case 7:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.PROFILE;
                break;
            case 8:
                source = MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.CALLS_SERVICES_EMPTY_SEARCH;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(eventType, source, gjw0.a(outgoingCall.b())), 7);
    }
}
