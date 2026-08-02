package com.vk.voip.ui.actions.feature;

import com.vk.voip.ui.logs.app.AppLogsSending$SendType;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import defpackage.q0;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.iq;
import xsna.k5x0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vu5;
import xsna.w5w0;
import xsna.zrp;

/* compiled from: VoipActionsFeatureState.kt */
/* loaded from: classes7.dex */
public interface VoipActionsFeatureState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipActionsFeatureState.kt */
    public static final class UserType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserType[] $VALUES;
        public static final UserType ANONYM;
        public static final UserType AUTHORIZED;

        static {
            UserType userType = new UserType("AUTHORIZED", 0);
            AUTHORIZED = userType;
            UserType userType2 = new UserType("ANONYM", 1);
            ANONYM = userType2;
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

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsrOnline(isAvailable=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsrRecord(isVisible=");
            sb.append(this.a);
            sb.append(", isStarted=");
            sb.append(this.b);
            sb.append(", canStop=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BeautyFilter(isVisible=");
            sb.append(this.a);
            sb.append(", isInitialized=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final int c;

        public d(boolean z, boolean z2, int i) {
            this.a = z;
            this.b = z2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallDump(isVisible=");
            sb.append(this.a);
            sb.append(", isRecording=");
            sb.append(this.b);
            sb.append(", title=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class e {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("CallEffectsPlaceholder(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("DebugMenu(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class g {
        public final boolean a;
        public final boolean b;

        public g(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b == gVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FrontCameraMirroring(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class h {
        public final boolean a;
        public final boolean b;

        public h(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GesturesFeedback(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class i {
        public final boolean a;
        public final String b;
        public final String c;

        public i(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolidayInteraction(isVisible=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class j {
        public final AppLogsSending$SendType a;

        public j(AppLogsSending$SendType appLogsSending$SendType) {
            this.a = appLogsSending$SendType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LogsSending(type=" + this.a + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class k {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final k5x0.a d;

        public k(boolean z, boolean z2, boolean z3, k5x0.a aVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && epx.f(this.d, kVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Mask(isVisible=" + this.a + ", isEnabled=" + this.b + ", isInitialized=" + this.c + ", effectState=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class l {
        public final boolean a;
        public final boolean b;

        public l(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && this.b == lVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRequestAttention(isVisible=");
            sb.append(this.a);
            sb.append(", shouldShowAllText=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class m {
        public final boolean a;
        public final CallsAudioDeviceInfo b;

        public m(boolean z, CallsAudioDeviceInfo callsAudioDeviceInfo) {
            this.a = z;
            this.b = callsAudioDeviceInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a == mVar.a && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingAudio(isVisible=" + this.a + ", audioDevice=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class n {
        public final boolean a;
        public final MediaOptionState b;

        public n(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a == nVar.a && this.b == nVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingMicrophone(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class o {
        public final boolean a;
        public final MediaOptionState b;

        public o(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.a == oVar.a && this.b == oVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingVideo(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class p {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final NoiseSuppressorFeature$State d;

        public p(boolean z, boolean z2, boolean z3, NoiseSuppressorFeature$State noiseSuppressorFeature$State) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = noiseSuppressorFeature$State;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "NoiseSuppressor(isVisible=" + this.a + ", isEnabled=" + this.b + ", isInitialized=" + this.c + ", mode=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class q {
        public final boolean a;

        public q(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a == ((q) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ParticipantPermissions(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class r {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public r(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.a == rVar.a && this.b == rVar.b && this.c == rVar.c && this.d == rVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecordStatus(isSupported=");
            sb.append(this.a);
            sb.append(", isStarted=");
            sb.append(this.b);
            sb.append(", canStart=");
            sb.append(this.c);
            sb.append(", canManage=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class s {
        public final boolean a;
        public final boolean b;

        public s(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.a == sVar.a && this.b == sVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenCaptureStatus(isStarted=");
            sb.append(this.a);
            sb.append(", isAvailable=");
            return q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class t {
        public final boolean a;
        public final boolean b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final boolean i;

        public t(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = str;
            this.i = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return this.a == tVar.a && this.b == tVar.b && this.c == tVar.c && this.d == tVar.d && this.e == tVar.e && this.f == tVar.f && this.g == tVar.g && epx.f(this.h, tVar.h) && this.i == tVar.i;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            String str = this.h;
            return Boolean.hashCode(this.i) + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionRooms(isConfigureOptionVisible=");
            sb.append(this.a);
            sb.append(", isConfigureOptionHighlighted=");
            sb.append(this.b);
            sb.append(", configureOptionTitle=");
            sb.append(this.c);
            sb.append(", isJoinOptionVisible=");
            sb.append(this.d);
            sb.append(", isJoinOptionEnabled=");
            sb.append(this.e);
            sb.append(", isAssistanceRequestOptionVisible=");
            sb.append(this.f);
            sb.append(", isSessionRoomLeaveVisible=");
            sb.append(this.g);
            sb.append(", roomName=");
            sb.append(this.h);
            sb.append(", isSendMessageToAllRoomsVisible=");
            return q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class u {
        public final boolean a;

        public u(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.a == ((u) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return q0.a(new StringBuilder("ShareLink(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class v {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final Long f;

        public v(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c && this.d == vVar.d && this.e == vVar.e && epx.f(this.f, vVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            Long l = this.f;
            return b + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StreamStatus(isSupported=");
            sb.append(this.a);
            sb.append(", isStarted=");
            sb.append(this.b);
            sb.append(", canStart=");
            sb.append(this.c);
            sb.append(", canStop=");
            sb.append(this.d);
            sb.append(", canManage=");
            sb.append(this.e);
            sb.append(", startTimeMs=");
            return iq.b(sb, this.f, ')');
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class w {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final k5x0.b d;

        public w(boolean z, boolean z2, boolean z3, k5x0.b bVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a == wVar.a && this.b == wVar.b && this.c == wVar.c && epx.f(this.d, wVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "VirtualBackground(isVisible=" + this.a + ", isEnabled=" + this.b + ", isInitialized=" + this.c + ", effectState=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class x {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final w5w0 d;

        public x(boolean z, boolean z2, boolean z3, w5w0 w5w0Var) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = w5w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            return this.a == xVar.a && this.b == xVar.b && this.c == xVar.c && epx.f(this.d, xVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "VmojiStatus(isVisible=" + this.a + ", isEnabled=" + this.b + ", isInitialized=" + this.c + ", vmoji=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsFeatureState.kt */
    public static final class y {
        public final boolean a;
        public final boolean b;

        public y(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.a == yVar.a && this.b == yVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WatchTogether(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return q0.a(sb, this.b, ')');
        }
    }
}
