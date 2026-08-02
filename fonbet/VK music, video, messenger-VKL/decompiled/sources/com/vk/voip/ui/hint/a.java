package com.vk.voip.ui.hint;

import android.text.TextUtils;
import com.vk.movika.sdk.base.ui.r;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.c;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.hint.VoipHintView;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.asp;
import xsna.axb;
import xsna.drm0;
import xsna.ek5;
import xsna.f3a;
import xsna.f4m;
import xsna.f9t;
import xsna.fpf0;
import xsna.fw3;
import xsna.g57;
import xsna.g9b;
import xsna.ghu;
import xsna.gvw0;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.kiu;
import xsna.oa4;
import xsna.p4g;
import xsna.p5j;
import xsna.p98;
import xsna.pgn;
import xsna.po40;
import xsna.pvw0;
import xsna.qcy;
import xsna.rte0;
import xsna.s3q0;
import xsna.sd6;
import xsna.v1v;
import xsna.zrp;

/* compiled from: VoipCallHints.kt */
/* loaded from: classes7.dex */
public final class a {
    public static final /* synthetic */ qcy<Object>[] m = {new MutablePropertyReference1Impl(a.class, "displayHintDisposable", "getDisplayHintDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, a.class, "getMemberInfoDisposable", "getGetMemberInfoDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public final VoipHintView a;
    public final c b;
    public final GroupCallViewModel c;
    public final ghu d;
    public final pvw0 e;
    public final gvw0 f;
    public EnumC2056a i;
    public long j;
    public HashSet k;
    public final pgn g = new pgn();
    public final pgn h = new pgn();
    public Set<CallMemberId> l = EmptySet.b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipCallHints.kt */
    /* renamed from: com.vk.voip.ui.hint.a$a, reason: collision with other inner class name */
    public static final class EnumC2056a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC2056a[] $VALUES;
        public static final EnumC2056a AdminStateChanged;
        public static final EnumC2056a AsrRecordStarted;
        public static final EnumC2056a AsrRecordStopped;
        public static final EnumC2056a BroadcastFinished;
        public static final EnumC2056a BroadcastStarted;
        public static final EnumC2056a CameraDisabledDueToBadConnection;
        public static final EnumC2056a CurrentUserBadConnection;
        public static final EnumC2056a HandRaised;
        public static final EnumC2056a HolidayInteractionCancelled;
        public static final EnumC2056a MicOffWhileTalking;
        public static final EnumC2056a MuteStateChanged;
        public static final EnumC2056a PinStateChanged;
        public static final EnumC2056a ScreenShareStarted;
        public static final EnumC2056a SessionRoomNotification;
        public static final EnumC2056a VideoEffectClickWhenMLNotReady;
        public static final EnumC2056a VideoEffectClickWhenVideoIsDisabled;
        public static final EnumC2056a WatchTogetherFeatureAllowed;
        public static final EnumC2056a WatchTogetherFeatureForbidden;
        private final int priority;

        static {
            EnumC2056a enumC2056a = new EnumC2056a("AdminStateChanged", 0, 7);
            AdminStateChanged = enumC2056a;
            EnumC2056a enumC2056a2 = new EnumC2056a("MuteStateChanged", 1, 6);
            MuteStateChanged = enumC2056a2;
            EnumC2056a enumC2056a3 = new EnumC2056a("PinStateChanged", 2, 5);
            PinStateChanged = enumC2056a3;
            EnumC2056a enumC2056a4 = new EnumC2056a("BroadcastStarted", 3, 4);
            BroadcastStarted = enumC2056a4;
            EnumC2056a enumC2056a5 = new EnumC2056a("ScreenShareStarted", 4, 4);
            ScreenShareStarted = enumC2056a5;
            EnumC2056a enumC2056a6 = new EnumC2056a("BroadcastFinished", 5, 3);
            BroadcastFinished = enumC2056a6;
            EnumC2056a enumC2056a7 = new EnumC2056a("AsrRecordStarted", 6, 4);
            AsrRecordStarted = enumC2056a7;
            EnumC2056a enumC2056a8 = new EnumC2056a("AsrRecordStopped", 7, 3);
            AsrRecordStopped = enumC2056a8;
            EnumC2056a enumC2056a9 = new EnumC2056a("SessionRoomNotification", 8, 2);
            SessionRoomNotification = enumC2056a9;
            EnumC2056a enumC2056a10 = new EnumC2056a("WatchTogetherFeatureAllowed", 9, 2);
            WatchTogetherFeatureAllowed = enumC2056a10;
            EnumC2056a enumC2056a11 = new EnumC2056a("WatchTogetherFeatureForbidden", 10, 2);
            WatchTogetherFeatureForbidden = enumC2056a11;
            EnumC2056a enumC2056a12 = new EnumC2056a("VideoEffectClickWhenVideoIsDisabled", 11, 2);
            VideoEffectClickWhenVideoIsDisabled = enumC2056a12;
            EnumC2056a enumC2056a13 = new EnumC2056a("VideoEffectClickWhenMLNotReady", 12, 1);
            VideoEffectClickWhenMLNotReady = enumC2056a13;
            EnumC2056a enumC2056a14 = new EnumC2056a("MicOffWhileTalking", 13, 0);
            MicOffWhileTalking = enumC2056a14;
            EnumC2056a enumC2056a15 = new EnumC2056a("CameraDisabledDueToBadConnection", 14, -1);
            CameraDisabledDueToBadConnection = enumC2056a15;
            EnumC2056a enumC2056a16 = new EnumC2056a("HandRaised", 15, -2);
            HandRaised = enumC2056a16;
            EnumC2056a enumC2056a17 = new EnumC2056a("CurrentUserBadConnection", 16, -3);
            CurrentUserBadConnection = enumC2056a17;
            EnumC2056a enumC2056a18 = new EnumC2056a("HolidayInteractionCancelled", 17, -4);
            HolidayInteractionCancelled = enumC2056a18;
            EnumC2056a[] enumC2056aArr = {enumC2056a, enumC2056a2, enumC2056a3, enumC2056a4, enumC2056a5, enumC2056a6, enumC2056a7, enumC2056a8, enumC2056a9, enumC2056a10, enumC2056a11, enumC2056a12, enumC2056a13, enumC2056a14, enumC2056a15, enumC2056a16, enumC2056a17, enumC2056a18};
            $VALUES = enumC2056aArr;
            $ENTRIES = new asp(enumC2056aArr);
        }

        public EnumC2056a(String str, int i, int i2) {
            this.priority = i2;
        }

        public static EnumC2056a valueOf(String str) {
            return (EnumC2056a) Enum.valueOf(EnumC2056a.class, str);
        }

        public static EnumC2056a[] values() {
            return (EnumC2056a[]) $VALUES.clone();
        }

        public final int h() {
            return this.priority;
        }
    }

    /* compiled from: VoipCallHints.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<kiu, String> {
        @Override // xsna.izs
        public final String invoke(kiu kiuVar) {
            a aVar = (a) this.receiver;
            qcy<Object>[] qcyVarArr = a.m;
            aVar.getClass();
            return a.b(kiuVar);
        }
    }

    public a(VoipHintView voipHintView, c cVar, GroupCallViewModel groupCallViewModel, f9t f9tVar, po40 po40Var, ghu ghuVar, pvw0 pvw0Var, Set<CallMemberId> set, gvw0 gvw0Var) {
        this.a = voipHintView;
        this.b = cVar;
        this.c = groupCallViewModel;
        this.d = ghuVar;
        this.e = pvw0Var;
        this.f = gvw0Var;
        this.k = p4g.d(set);
    }

    public static String b(kiu kiuVar) {
        String str;
        String r = rte0.r(kiuVar.l);
        if (r != null) {
            return r;
        }
        String str2 = kiuVar.c;
        String str3 = kiuVar.d;
        if (str2.length() > 16) {
            str2 = str2.substring(0, 16);
        }
        StringBuilder e = fw3.e(str2);
        if (TextUtils.isEmpty(str3)) {
            str = "";
        } else {
            str = " " + str3.charAt(0) + JwtParser.SEPARATOR_CHAR;
        }
        e.append(str);
        return e.toString();
    }

    public final int a() {
        EnumC2056a enumC2056a = this.i;
        if (enumC2056a != null) {
            return enumC2056a.h();
        }
        return Integer.MIN_VALUE;
    }

    public final void c() {
        qcy<Object>[] qcyVarArr = m;
        qcy<Object> qcyVar = qcyVarArr[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.g.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[1];
        io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.h.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.i = null;
        f4m.j(this.a);
    }

    public final void d(String str) {
        EnumC2056a enumC2056a = EnumC2056a.HolidayInteractionCancelled;
        if (enumC2056a.h() < a()) {
            return;
        }
        VoipHintView.a aVar = new VoipHintView.a(str, null, null, null, false, 14);
        VoipHintView voipHintView = this.a;
        voipHintView.a(aVar);
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oa4(this, 6)));
    }

    public final void e(MediaOptionState mediaOptionState, MediaOptionState mediaOptionState2, boolean z, boolean z2) {
        Pair pair;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_videocam_slash_outline_28);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_mic_slash_outline_28);
        EnumC2056a enumC2056a = EnumC2056a.MuteStateChanged;
        if (enumC2056a.h() < a()) {
            return;
        }
        MediaOptionState mediaOptionState3 = MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
        boolean z3 = mediaOptionState == mediaOptionState3;
        MediaOptionState mediaOptionState4 = MediaOptionState.MUTED_PERMANENT;
        boolean z4 = mediaOptionState == mediaOptionState4;
        boolean z5 = mediaOptionState2 == mediaOptionState3;
        boolean z6 = mediaOptionState2 == mediaOptionState4;
        if ((z3 || z4) && (z5 || z6)) {
            pair = new Pair(Integer.valueOf(R.drawable.vk_icon_microphone_videocam_slash_outline_28), Integer.valueOf(R.string.voip_mute_state_changed_hint));
        } else if (z4) {
            pair = new Pair(valueOf2, Integer.valueOf(R.string.voip_mute_state_changed_hint_audio_hand_up));
        } else if (z3 && z) {
            pair = new Pair(valueOf2, Integer.valueOf(R.string.voip_mute_state_changed_hint_audio));
        } else if (z6) {
            pair = new Pair(valueOf, Integer.valueOf(R.string.voip_mute_state_changed_hint_video_hand_up));
        } else if (!z5 || !z2) {
            return;
        } else {
            pair = new Pair(valueOf, Integer.valueOf(R.string.voip_mute_state_changed_hint_video));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        VoipHintView voipHintView = this.a;
        voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(intValue2), Integer.valueOf(intValue), null, null, false, 28));
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g9b(this, 9)));
    }

    public final void f(CallMemberId callMemberId, boolean z) {
        EnumC2056a enumC2056a = EnumC2056a.PinStateChanged;
        if (enumC2056a.h() < a()) {
            return;
        }
        this.c.getClass();
        kiu b2 = GroupCallViewModel.b(callMemberId);
        if (b2 != null) {
            String b3 = b(b2);
            int i = z ? R.string.voip_pin_state_changed_hint_me : R.string.voip_pin_state_changed_hint;
            VoipHintView voipHintView = this.a;
            voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(i, b3), Integer.valueOf(R.drawable.vk_icon_pin_dot_outline_28), null, null, false, 28));
            voipHintView.setVisibility(0);
            this.i = enumC2056a;
            j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new p98(this, 6)));
        }
    }

    public final void g(int i) {
        EnumC2056a enumC2056a = EnumC2056a.VideoEffectClickWhenMLNotReady;
        if (enumC2056a.h() < a()) {
            return;
        }
        VoipHintView voipHintView = this.a;
        voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(i), null, null, null, true, 14));
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f3a(this, 5)));
    }

    public final void h(int i, gzs<s3q0> gzsVar) {
        EnumC2056a enumC2056a = EnumC2056a.VideoEffectClickWhenVideoIsDisabled;
        if (enumC2056a.h() < a()) {
            return;
        }
        VoipHintView voipHintView = this.a;
        voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(i), null, voipHintView.getResources().getString(R.string.voip_enable_your_camera_to_choose_virtual_background_button), new r(this, gzsVar), false, 2));
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(10000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new g57(this, 8)));
    }

    public final void i() {
        EnumC2056a enumC2056a = EnumC2056a.WatchTogetherFeatureForbidden;
        if (enumC2056a.h() < a()) {
            return;
        }
        VoipHintView voipHintView = this.a;
        voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(R.string.voip_watch_together_forbidden_for_me), null, null, null, false, 14));
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new sd6(this, 7)));
    }

    public final void j(io.reactivex.rxjava3.disposables.c cVar) {
        qcy<Object> qcyVar = m[0];
        this.g.b(cVar);
    }

    public final void k(Set<CallMemberId> set) {
        this.l = set;
        this.c.getClass();
        ArrayList<kiu> arrayList = GroupCallViewModel.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator<kiu> it = arrayList.iterator();
        while (it.hasNext()) {
            kiu next = it.next();
            if (set.contains(next.a.a)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            c();
            return;
        }
        String g0 = j5g.g0(j5g.H0(arrayList2, 5), null, null, null, 0, new b(1, this, a.class, "getShortName", "getShortName(Lcom/vk/voip/ui/groupcalls/GroupCallParticipantViewModel;)Ljava/lang/String;", 0), 31);
        int size = arrayList2.size();
        VoipHintView voipHintView = this.a;
        if (size > 5) {
            StringBuilder b2 = v1v.b(g0, ' ');
            b2.append(drm0.p0(voipHintView.getResources().getString(R.string.voip_hand_raised_hint_other)).toString());
            g0 = b2.toString();
        }
        voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString((arrayList2.size() == 1 && ((kiu) j5g.Y(arrayList2)).i) ? R.string.voip_hand_raised_hint_female : arrayList2.size() == 1 ? R.string.voip_hand_raised_hint_male : R.string.voip_hand_raised_hint_several, g0), null, null, null, false, 30));
        voipHintView.setVisibility(0);
        this.i = EnumC2056a.HandRaised;
        j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ek5(this, 6)));
    }

    public final void l(String str, Integer num, EnumC2056a enumC2056a, long j) {
        VoipHintView.a aVar = new VoipHintView.a(str, num, null, null, false, 28);
        VoipHintView voipHintView = this.a;
        voipHintView.a(aVar);
        voipHintView.setVisibility(0);
        this.i = enumC2056a;
        j(io.reactivex.rxjava3.core.a.s(j, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new axb(this, 5)));
    }
}
