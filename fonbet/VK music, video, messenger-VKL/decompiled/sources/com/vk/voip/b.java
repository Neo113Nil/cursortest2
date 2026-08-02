package com.vk.voip;

import com.vk.voip.api.id.CallId;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import com.vk.voip.dto.call_member.CallMemberId;
import java.io.File;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.gleffects.EffectRegistry;
import xsna.epx;
import xsna.hl90;
import xsna.ho8;
import xsna.ih8;
import xsna.io70;
import xsna.k490;
import xsna.kwk;
import xsna.po70;
import xsna.qoy;
import xsna.rah0;
import xsna.rct0;
import xsna.shy;
import xsna.ulp;

/* compiled from: IVoipEngine.kt */
/* loaded from: classes11.dex */
public interface b extends k490 {

    /* compiled from: IVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final EffectRegistry.EffectId a;
        public final File b;
        public final String c;

        public /* synthetic */ a(EffectRegistry.EffectId effectId, File file) {
            this(effectId, file, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            File file = this.b;
            int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallEffect(effectId=");
            sb.append(this.a);
            sb.append(", resourcePack=");
            sb.append(this.b);
            sb.append(", previewUrl=");
            return ho8.a(sb, this.c, ')');
        }

        public a(EffectRegistry.EffectId effectId, File file, String str) {
            this.a = effectId;
            this.b = file;
            this.c = str;
        }
    }

    /* compiled from: IVoipEngine.kt */
    /* renamed from: com.vk.voip.b$b, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC2004b {
        void a(ArrayList arrayList, po70 po70Var);

        void b(ArrayList arrayList);
    }

    /* compiled from: IVoipEngine.kt */
    public interface c {
        void c();
    }

    /* compiled from: IVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final int c;
        public final ScreenCapturePermissionProvider d;

        public d(boolean z, boolean z2, int i, rah0 rah0Var) {
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = rah0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        }

        public final String toString() {
            return "StartCallParams(forceRelay=" + this.a + ", dnsResolverEnabled=" + this.b + ", maxVideoTrackCount=" + this.c + ", screenCapturePermissionProvider=" + this.d + ')';
        }
    }

    ih8 M();

    CallId b();

    void c(boolean z, boolean z2);

    io70 d();

    void e(boolean z);

    void f(c cVar);

    ConversationFeatureManager g();

    AsrManager getAsrManager();

    ContactCallManager getContactCallManager();

    FeedbackManager getFeedbackManager();

    MediaOptions getMediaOptionsForCurrentUser();

    ParticipantStatesManager getParticipantStatesManager();

    rct0 getVideoController();

    WatchTogetherPlayer getWatchTogetherPlayer();

    ulp h();

    void i(boolean z, boolean z2);

    boolean isFeedbackEnabled();

    boolean isGroupCall();

    boolean isMeCreatorOrAdmin();

    boolean isWaitingRoomEnabled();

    void j(CallMemberId callMemberId, boolean z);

    hl90 k();

    void l(boolean z, boolean z2);

    void m();

    boolean n(CallMemberId callMemberId);

    void o(boolean z);

    void p(BeautyFilterIntensity beautyFilterIntensity);

    kwk q();

    void r(boolean z);

    boolean s(String str);

    void setFeedbackEnabled(boolean z);
}
