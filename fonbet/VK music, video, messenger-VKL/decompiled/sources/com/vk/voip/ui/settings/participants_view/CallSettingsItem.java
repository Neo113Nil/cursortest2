package com.vk.voip.ui.settings.participants_view;

import com.vk.voip.dto.call_member.CallMemberId;
import defpackage.q0;
import java.util.Set;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.sew0;
import xsna.u11;
import xsna.ur;
import xsna.zrp;

/* compiled from: CallParticipantsViewModel.kt */
/* loaded from: classes7.dex */
public abstract class CallSettingsItem {

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class CallParticipant extends CallSettingsItem {
        public final CallMemberId a;
        public final sew0 b;
        public final b c;
        public final CharSequence d;
        public final boolean e;
        public final a f;
        public final boolean g;
        public final long h;
        public final boolean i;
        public final CameraState j;
        public final MicrophoneState k;
        public final boolean l;
        public final boolean m;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallParticipantsViewModel.kt */
        public static final class CameraState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ CameraState[] $VALUES;
            public static final CameraState MUTE;
            public static final CameraState OFF;
            public static final CameraState ON;

            static {
                CameraState cameraState = new CameraState(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0);
                MUTE = cameraState;
                CameraState cameraState2 = new CameraState("OFF", 1);
                OFF = cameraState2;
                CameraState cameraState3 = new CameraState("ON", 2);
                ON = cameraState3;
                CameraState[] cameraStateArr = {cameraState, cameraState2, cameraState3};
                $VALUES = cameraStateArr;
                $ENTRIES = new asp(cameraStateArr);
            }

            public CameraState() {
                throw null;
            }

            public static CameraState valueOf(String str) {
                return (CameraState) Enum.valueOf(CameraState.class, str);
            }

            public static CameraState[] values() {
                return (CameraState[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallParticipantsViewModel.kt */
        public static final class MicrophoneState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MicrophoneState[] $VALUES;
            public static final MicrophoneState MUTE;
            public static final MicrophoneState OFF;
            public static final MicrophoneState ON;
            public static final MicrophoneState TALKING;

            static {
                MicrophoneState microphoneState = new MicrophoneState(SignalingProtocol.MEDIA_OPTION_STATE_MUTE, 0);
                MUTE = microphoneState;
                MicrophoneState microphoneState2 = new MicrophoneState("OFF", 1);
                OFF = microphoneState2;
                MicrophoneState microphoneState3 = new MicrophoneState("ON", 2);
                ON = microphoneState3;
                MicrophoneState microphoneState4 = new MicrophoneState("TALKING", 3);
                TALKING = microphoneState4;
                MicrophoneState[] microphoneStateArr = {microphoneState, microphoneState2, microphoneState3, microphoneState4};
                $VALUES = microphoneStateArr;
                $ENTRIES = new asp(microphoneStateArr);
            }

            public MicrophoneState() {
                throw null;
            }

            public static MicrophoneState valueOf(String str) {
                return (MicrophoneState) Enum.valueOf(MicrophoneState.class, str);
            }

            public static MicrophoneState[] values() {
                return (MicrophoneState[]) $VALUES.clone();
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public interface a {

            /* compiled from: CallParticipantsViewModel.kt */
            /* renamed from: com.vk.voip.ui.settings.participants_view.CallSettingsItem$CallParticipant$a$a, reason: collision with other inner class name */
            public static final class C2086a implements a {
                public static final C2086a a = new C2086a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2086a);
                }

                public final int hashCode() {
                    return 1999069787;
                }

                public final String toString() {
                    return "ForAll";
                }
            }

            /* compiled from: CallParticipantsViewModel.kt */
            public static final class b implements a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1736628834;
                }

                public final String toString() {
                    return "ForMe";
                }
            }

            /* compiled from: CallParticipantsViewModel.kt */
            public static final class c implements a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -887066053;
                }

                public final String toString() {
                    return "None";
                }
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public interface b {

            /* compiled from: CallParticipantsViewModel.kt */
            public static final class a implements b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 593708938;
                }

                public final String toString() {
                    return "Admin";
                }
            }

            /* compiled from: CallParticipantsViewModel.kt */
            /* renamed from: com.vk.voip.ui.settings.participants_view.CallSettingsItem$CallParticipant$b$b, reason: collision with other inner class name */
            public static final class C2087b implements b {
                public static final C2087b a = new C2087b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2087b);
                }

                public final int hashCode() {
                    return 1491837351;
                }

                public final String toString() {
                    return "Creator";
                }
            }

            /* compiled from: CallParticipantsViewModel.kt */
            public static final class c implements b {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return -1781565539;
                }

                public final String toString() {
                    return "None";
                }
            }
        }

        public CallParticipant(CallMemberId callMemberId, sew0 sew0Var, b bVar, CharSequence charSequence, boolean z, a aVar, boolean z2, long j, boolean z3, CameraState cameraState, MicrophoneState microphoneState, boolean z4, boolean z5) {
            this.a = callMemberId;
            this.b = sew0Var;
            this.c = bVar;
            this.d = charSequence;
            this.e = z;
            this.f = aVar;
            this.g = z2;
            this.h = j;
            this.i = z3;
            this.j = cameraState;
            this.k = microphoneState;
            this.l = z4;
            this.m = z5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallParticipant)) {
                return false;
            }
            CallParticipant callParticipant = (CallParticipant) obj;
            return epx.f(this.a, callParticipant.a) && epx.f(this.b, callParticipant.b) && epx.f(this.c, callParticipant.c) && epx.f(this.d, callParticipant.d) && this.e == callParticipant.e && epx.f(this.f, callParticipant.f) && this.g == callParticipant.g && this.h == callParticipant.h && this.i == callParticipant.i && this.j == callParticipant.j && this.k == callParticipant.k && this.l == callParticipant.l && this.m == callParticipant.m;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.m) + qoy.b((this.k.hashCode() + ((this.j.hashCode() + qoy.b(bh10.a(qoy.b((this.f.hashCode() + qoy.b(u11.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallParticipant(id=");
            sb.append(this.a);
            sb.append(", avatar=");
            sb.append(this.b);
            sb.append(", showRole=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append((Object) this.d);
            sb.append(", isSelf=");
            sb.append(this.e);
            sb.append(", showPinned=");
            sb.append(this.f);
            sb.append(", isRaisedHand=");
            sb.append(this.g);
            sb.append(", raisedHandTime=");
            sb.append(this.h);
            sb.append(", isScreenShare=");
            sb.append(this.i);
            sb.append(", cameraState=");
            sb.append(this.j);
            sb.append(", microphoneState=");
            sb.append(this.k);
            sb.append(", isConnecting=");
            sb.append(this.l);
            sb.append(", isShowMenuBtn=");
            return q0.a(sb, this.m, ')');
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class FillSpace extends CallSettingsItem {
        public final Height a;
        public final CallSettingsItem$ChangeBackground$Background b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallParticipantsViewModel.kt */
        public static final class Height {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Height[] $VALUES;
            public static final Height DP_8;

            static {
                Height height = new Height("DP_8", 0);
                DP_8 = height;
                Height[] heightArr = {height};
                $VALUES = heightArr;
                $ENTRIES = new asp(heightArr);
            }

            public Height() {
                throw null;
            }

            public static Height valueOf(String str) {
                return (Height) Enum.valueOf(Height.class, str);
            }

            public static Height[] values() {
                return (Height[]) $VALUES.clone();
            }
        }

        public FillSpace(Height height, CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = height;
            this.b = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FillSpace)) {
                return false;
            }
            FillSpace fillSpace = (FillSpace) obj;
            return this.a == fillSpace.a && this.b == fillSpace.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FillSpace(height=" + this.a + ", background=" + this.b + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class TitleHeader extends CallSettingsItem {
        public final Title a;
        public final Subtitle b;
        public final Integer c;
        public final a d;
        public final CallSettingsItem$ChangeBackground$Background e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallParticipantsViewModel.kt */
        public static final class Subtitle {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Subtitle[] $VALUES;
            public static final Subtitle CONTACT_BOOK;
            public static final Subtitle SHOW_LAST_MESSAGES;

            static {
                Subtitle subtitle = new Subtitle("SHOW_LAST_MESSAGES", 0);
                SHOW_LAST_MESSAGES = subtitle;
                Subtitle subtitle2 = new Subtitle("CONTACT_BOOK", 1);
                CONTACT_BOOK = subtitle2;
                Subtitle[] subtitleArr = {subtitle, subtitle2};
                $VALUES = subtitleArr;
                $ENTRIES = new asp(subtitleArr);
            }

            public Subtitle() {
                throw null;
            }

            public static Subtitle valueOf(String str) {
                return (Subtitle) Enum.valueOf(Subtitle.class, str);
            }

            public static Subtitle[] values() {
                return (Subtitle[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallParticipantsViewModel.kt */
        public static final class Title {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Title[] $VALUES;
            public static final Title CHAT_MEMBERS;
            public static final Title CONTACTS;
            public static final Title FRIENDS;
            public static final Title SUBSCRIBERS;
            public static final Title WAITING_ROOM;

            static {
                Title title = new Title("WAITING_ROOM", 0);
                WAITING_ROOM = title;
                Title title2 = new Title("CHAT_MEMBERS", 1);
                CHAT_MEMBERS = title2;
                Title title3 = new Title(Privacy.FRIENDS, 2);
                FRIENDS = title3;
                Title title4 = new Title("SUBSCRIBERS", 3);
                SUBSCRIBERS = title4;
                Title title5 = new Title("CONTACTS", 4);
                CONTACTS = title5;
                Title[] titleArr = {title, title2, title3, title4, title5};
                $VALUES = titleArr;
                $ENTRIES = new asp(titleArr);
            }

            public Title() {
                throw null;
            }

            public static Title valueOf(String str) {
                return (Title) Enum.valueOf(Title.class, str);
            }

            public static Title[] values() {
                return (Title[]) $VALUES.clone();
            }
        }

        /* compiled from: CallParticipantsViewModel.kt */
        public interface a {

            /* compiled from: CallParticipantsViewModel.kt */
            /* renamed from: com.vk.voip.ui.settings.participants_view.CallSettingsItem$TitleHeader$a$a, reason: collision with other inner class name */
            public static final class C2088a implements a {
                public final Set<String> a;

                public C2088a(Set<String> set) {
                    this.a = set;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2088a) && epx.f(this.a, ((C2088a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ur.c(new StringBuilder("ChatMembers(membersIds="), this.a, ')');
                }
            }
        }

        public TitleHeader(Title title, Subtitle subtitle, Integer num, a.C2088a c2088a, CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background, int i) {
            subtitle = (i & 2) != 0 ? null : subtitle;
            num = (i & 4) != 0 ? null : num;
            c2088a = (i & 8) != 0 ? null : c2088a;
            this.a = title;
            this.b = subtitle;
            this.c = num;
            this.d = c2088a;
            this.e = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleHeader)) {
                return false;
            }
            TitleHeader titleHeader = (TitleHeader) obj;
            return this.a == titleHeader.a && this.b == titleHeader.b && epx.f(this.c, titleHeader.c) && epx.f(this.d, titleHeader.d) && this.e == titleHeader.e;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Subtitle subtitle = this.b;
            int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            a aVar = this.d;
            return this.e.hashCode() + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "TitleHeader(title=" + this.a + ", subtitle=" + this.b + ", counter=" + this.c + ", button=" + this.d + ", background=" + this.e + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class a extends CallSettingsItem {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1635216855;
        }

        public final String toString() {
            return "AdminToolbar";
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public interface b {
        CharSequence getName();

        sew0 i();
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class c extends CallSettingsItem {
        public final CallSettingsItem$ChangeBackground$Background a;

        public c(CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ContactPermissionBanner(background=" + this.a + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class d extends CallSettingsItem {
        public final CallSettingsItem$ChangeBackground$Background a;

        public d(CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Divider(background=" + this.a + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class e extends CallSettingsItem {
        public static final e a = new e();
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class f extends CallSettingsItem implements b {
        public final String a;
        public final boolean b;
        public final sew0 c;
        public final CharSequence d;
        public final CallSettingsItem$ChangeBackground$Background e;

        public f(String str, boolean z, sew0 sew0Var, CharSequence charSequence, CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = str;
            this.b = z;
            this.c = sew0Var;
            this.d = charSequence;
            this.e = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e;
        }

        @Override // com.vk.voip.ui.settings.participants_view.CallSettingsItem.b
        public final CharSequence getName() {
            return this.d;
        }

        public final int hashCode() {
            return this.e.hashCode() + u11.c((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        @Override // com.vk.voip.ui.settings.participants_view.CallSettingsItem.b
        public final sew0 i() {
            return this.c;
        }

        public final String toString() {
            return "InviteUser(id=" + this.a + ", isSelected=" + this.b + ", avatar=" + this.c + ", name=" + ((Object) this.d) + ", background=" + this.e + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class g extends CallSettingsItem {
        public final CallSettingsItem$ChangeBackground$Background a;

        public g(CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "InviteUsersHeader(background=" + this.a + ')';
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class h extends CallSettingsItem {
        public final String a;
        public final boolean b;

        public h(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Search(text=");
            sb.append(this.a);
            sb.append(", isShowBackBtn=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallParticipantsViewModel.kt */
    public static final class i extends CallSettingsItem implements b {
        public final CallMemberId a;
        public final sew0 b;
        public final CharSequence c;
        public final CallSettingsItem$ChangeBackground$Background d;

        public i(CallMemberId callMemberId, sew0 sew0Var, CharSequence charSequence, CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
            this.a = callMemberId;
            this.b = sew0Var;
            this.c = charSequence;
            this.d = callSettingsItem$ChangeBackground$Background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c) && this.d == iVar.d;
        }

        @Override // com.vk.voip.ui.settings.participants_view.CallSettingsItem.b
        public final CharSequence getName() {
            return this.c;
        }

        public final int hashCode() {
            return this.d.hashCode() + u11.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        @Override // com.vk.voip.ui.settings.participants_view.CallSettingsItem.b
        public final sew0 i() {
            return this.b;
        }

        public final String toString() {
            return "WaitingRoomParticipant(id=" + this.a + ", avatar=" + this.b + ", name=" + ((Object) this.c) + ", background=" + this.d + ')';
        }
    }
}
