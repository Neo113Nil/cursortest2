package com.vk.voip;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import com.vk.metrics.trackers.CriticalException;
import com.vk.toggle.Features;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.dto.type.StartCallType;
import com.vk.voip.factory.ConversationFactoryCreator;
import com.vk.voip.ui.VoipViewModelState;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import org.json.JSONObject;
import org.webrtc.VideoFrame;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.external.sdk.TopologyChangedListener;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.stat.StatProcessor;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.webrtc.CapturedFrameInterceptor;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.animoji.util.AnimojiControl;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.hangup.HangupParameters;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.gleffects.EffectRegistry;
import xsna.abv;
import xsna.b2p0;
import xsna.b7;
import xsna.bgs;
import xsna.bnw0;
import xsna.bpn0;
import xsna.brm0;
import xsna.bxi0;
import xsna.c5g;
import xsna.c8x0;
import xsna.cnw0;
import xsna.cxi;
import xsna.ddx;
import xsna.dfs;
import xsna.dhw0;
import xsna.dpt;
import xsna.dw3;
import xsna.e000;
import xsna.e6r;
import xsna.epx;
import xsna.esj;
import xsna.f9t;
import xsna.fpf0;
import xsna.g49;
import xsna.g620;
import xsna.g8j;
import xsna.gfq0;
import xsna.gj9;
import xsna.go9;
import xsna.gzs;
import xsna.h1l0;
import xsna.h49;
import xsna.hb8;
import xsna.hl90;
import xsna.hod;
import xsna.hu2;
import xsna.hv3;
import xsna.hy2;
import xsna.i0q0;
import xsna.ih8;
import xsna.il90;
import xsna.io70;
import xsna.is90;
import xsna.ix50;
import xsna.izi0;
import xsna.izs;
import xsna.j490;
import xsna.j5g;
import xsna.jl6;
import xsna.jo70;
import xsna.jx3;
import xsna.k7m;
import xsna.k8x0;
import xsna.kb3;
import xsna.ko70;
import xsna.kqw0;
import xsna.kwk;
import xsna.m0i;
import xsna.m7m;
import xsna.mlp;
import xsna.mnh0;
import xsna.mo70;
import xsna.msb;
import xsna.nav;
import xsna.nie;
import xsna.nm60;
import xsna.no70;
import xsna.nuq;
import xsna.ocx0;
import xsna.om60;
import xsna.on00;
import xsna.plk;
import xsna.pm60;
import xsna.q49;
import xsna.qav;
import xsna.qlk;
import xsna.qo70;
import xsna.rct0;
import xsna.riu;
import xsna.rwe;
import xsna.s3q0;
import xsna.siu;
import xsna.sni;
import xsna.sub;
import xsna.t3b;
import xsna.ta50;
import xsna.tk90;
import xsna.ts10;
import xsna.uav;
import xsna.uh9;
import xsna.ulp;
import xsna.vav;
import xsna.w0f;
import xsna.w8i;
import xsna.wav;
import xsna.wly;
import xsna.wrj;
import xsna.xdw0;
import xsna.xly;
import xsna.xmw0;
import xsna.xot;
import xsna.xsu;
import xsna.y45;
import xsna.yp6;
import xsna.ysg0;
import xsna.z410;
import xsna.z5r;
import xsna.z63;
import xsna.zfl;
import xsna.zmw0;
import xsna.zos;
import xsna.zq3;
import xsna.zqk0;
import xsna.zzz;

/* compiled from: OKVoipEngine.kt */
@SuppressLint({"UnsupportedChromeOsCameraSystemFeature", "ConstantConditionIf", "UnnecessaryVariable"})
/* loaded from: classes11.dex */
public final class OKVoipEngine implements com.vk.voip.b, w8i {
    public static final h A;
    public static volatile dhw0 B;
    public static kwk C;
    public static StatProcessor D;
    public static final wrj E;
    public static CallId F;
    public static AudioLevelListener G;
    public static final tk90 H;
    public static final ih8 I;
    public static final esj J;
    public static final hl90 K;
    public static final OKVoipEngine b;
    public static final Handler c;
    public static b.c d;
    public static final bpn0 e;
    public static final xly f;
    public static final bgs g;
    public static final bpn0 h;
    public static volatile dfs i;
    public static final xot j;
    public static final ulp k;
    public static final riu l;
    public static j490 m;
    public static final bpn0 n;
    public static final g620 o;
    public static boolean p;
    public static boolean q;
    public static final LinkedHashSet r;
    public static final LinkedHashSet s;
    public static final bpn0 t;
    public static final CopyOnWriteArraySet<CallId> u;
    public static cnw0 v;
    public static Application w;
    public static ConversationFactory x;
    public static final OkOwnCameraController y;
    public static boolean z;

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class EngineNotInitializedException extends RuntimeException {
        public EngineNotInitializedException() {
            super("OK Voip Engine initialization required but didn't complete");
        }
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public interface a {
        void a(boolean z);

        void b(String str, boolean z);
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class b implements ConversationEventsListener, TopologyChangedListener, MediaConnectionListener {
        public final rct0 b;

        /* compiled from: OKVoipEngine.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<mlp, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(mlp mlpVar) {
                ((h49) this.receiver).w(mlpVar);
                return s3q0.a;
            }
        }

        /* compiled from: OKVoipEngine.kt */
        /* renamed from: com.vk.voip.OKVoipEngine$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C2003b extends FunctionReferenceImpl implements izs<mlp, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(mlp mlpVar) {
                ((h49) this.receiver).w(mlpVar);
                return s3q0.a;
            }
        }

        public b(rct0 rct0Var) {
            this.b = rct0Var;
        }

        public static String a() {
            dhw0 dhw0Var = OKVoipEngine.B;
            String l = dhw0Var != null ? Long.valueOf(dhw0Var.b).toString() : null;
            return l == null ? "" : l;
        }

        public static void b(String str) {
            L.A("OKVoipEngine", go9.b("ConversationEventListener.", str));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onAnonJoinForbiddenChanged(boolean z) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            dhw0 dhw0Var = OKVoipEngine.B;
            dhw0 dhw0Var2 = null;
            OKVoipEngine.B = dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, z, false, false, null, null, -1, 507) : null;
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.getClass();
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            dhw0 dhw0Var3 = com.vk.voip.ui.c.O;
            if (dhw0Var3 != null) {
                cVar.getClass();
                dhw0Var2 = dhw0.a(dhw0Var3, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, z, false, false, null, null, -1, 507);
            }
            cVar.X0(dhw0Var2);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCallAccepted() {
            ConversationParticipant opponent;
            b("onCallAccepted");
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            OKVoipEngine.k.d.a(a(), (conversation == null || (opponent = conversation.getOpponent()) == null) ? false : opponent.isVideoEnabled(), oKVoipEngine.E());
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
            dhw0 dhw0Var;
            b("onCallEnded " + conversationEndInfo);
            ConversationEndReason reason = conversationEndInfo.getReason();
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null && conversation.isMeInWaitingRoom() && ((epx.f(reason, ConversationEndReason.RemovedFromCall.INSTANCE) || epx.f(reason, ConversationEndReason.Banned.INSTANCE)) && (dhw0Var = OKVoipEngine.B) != null)) {
                cnw0 cnw0Var = OKVoipEngine.v;
                if (cnw0Var == null) {
                    cnw0Var = null;
                }
                Throwable th = new Throwable();
                OKVoipEngine.o.getClass();
                cnw0Var.e(new zmw0.a(dhw0Var, th, -3, "internal:rejected_from_waiting_room", oKVoipEngine.E(), (StartCallType) OKVoipEngine.C.b, null, new a(1, OKVoipEngine.k.d, h49.class, "onCallStartError", "onCallStartError(Lcom/vk/voip/dependencies/EngineCallErrorInfo;)V", 0)));
            }
            if (reason instanceof ConversationEndReason.ObsoleteClient) {
                String explanationHtml = ((ConversationEndReason.ObsoleteClient) reason).getExplanationHtml();
                String y = explanationHtml != null ? brm0.y(explanationHtml, "{{current_version}}", (String) com.vk.core.apps.a.d.getValue()) : null;
                dhw0 dhw0Var2 = OKVoipEngine.B;
                if (dhw0Var2 != null) {
                    cnw0 cnw0Var2 = OKVoipEngine.v;
                    cnw0 cnw0Var3 = cnw0Var2 != null ? cnw0Var2 : null;
                    Throwable th2 = new Throwable();
                    OKVoipEngine.o.getClass();
                    cnw0Var3.e(new zmw0.a(dhw0Var2, th2, -4, "internal:obsolete_client", oKVoipEngine.E(), (StartCallType) OKVoipEngine.C.b, y, new C2003b(1, OKVoipEngine.k.d, h49.class, "onCallStartError", "onCallStartError(Lcom/vk/voip/dependencies/EngineCallErrorInfo;)V", 0)));
                }
            }
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> list) {
            CallMember a2;
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.getClass();
            VoipFeatures voipFeatures = VoipFeatures.BAD_NETWORK_INDICATOR;
            voipFeatures.getClass();
            boolean a3 = com.vk.toggle.b.A.a(voipFeatures);
            dhw0 dhw0Var = OKVoipEngine.B;
            if ((dhw0Var != null ? dhw0Var.D : false) || a3) {
                OKVoipEngine.b.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                    return;
                }
                ArrayList J = OKVoipEngine.J(list);
                OKVoipEngine.k.b.x(new il90.b(a2, J, OKVoipEngine.J(conversation.getParticipants())));
                Iterator it = J.iterator();
                while (it.hasNext()) {
                    CallMember callMember = (CallMember) it.next();
                    boolean z = callMember.n;
                    CallMember.NetworkStatus networkStatus = callMember.r;
                    if (z) {
                        cnw0 cnw0Var2 = OKVoipEngine.v;
                        if (cnw0Var2 == null) {
                            cnw0Var2 = null;
                        }
                        cnw0Var2.getClass();
                        com.vk.voip.ui.c.b.getClass();
                        if (com.vk.voip.ui.c.M0 != networkStatus) {
                            com.vk.voip.ui.c.M0 = networkStatus;
                            ysg0.b.a(qlk.a);
                        }
                    }
                    if (z && networkStatus == CallMember.NetworkStatus.BAD) {
                        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                        oKVoipEngine.getClass();
                        if (OKVoipEngine.I() && !OKVoipEngine.p) {
                            Features.Type type = Features.Type.FEATURE_VOIP_GROUP_CAM_OFF_BAD_NET;
                            type.getClass();
                            if (com.vk.toggle.b.A.a(type)) {
                                OKVoipEngine.p = true;
                                oKVoipEngine.y().b(false);
                                cnw0 cnw0Var3 = OKVoipEngine.v;
                                if (cnw0Var3 == null) {
                                    cnw0Var3 = null;
                                }
                                cnw0Var3.getClass();
                                com.vk.voip.ui.c.b.getClass();
                                L.A("VoipViewModel", "onCameraDisabledDueToBadConnection");
                                com.vk.voip.ui.c.a1(false);
                                ysg0.b.a(uh9.a);
                            }
                        }
                        cnw0 cnw0Var4 = OKVoipEngine.v;
                        if (cnw0Var4 == null) {
                            cnw0Var4 = null;
                        }
                        cnw0Var4.getClass();
                        com.vk.voip.ui.c.b.getClass();
                        L.A("VoipViewModel", "onCurrentUserBadConnection");
                        ysg0.b.a(plk.a);
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCallStartResolutionFailed(List<ParticipantId> list) {
            b("onCallStartResolutionFailed: " + list);
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null) {
                return;
            }
            ParticipantCollection participants = conversation.getParticipants();
            if (participants == null || !participants.isEmpty()) {
                Iterator<ConversationParticipant> it = participants.iterator();
                while (it.hasNext()) {
                    if (!mnh0.n(OKVoipEngine.b.a(), it.next().getExternalId())) {
                        break;
                    }
                }
            }
            conversation.hangup(new HangupParameters.Builder().setReason(HangupReason.CANCELED).build());
            CallMember a2 = tk90.a(OKVoipEngine.H, conversation.getMe());
            if (a2 == null) {
                return;
            }
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            ParticipantCollection participants2 = conversation.getParticipants();
            oKVoipEngine.getClass();
            OKVoipEngine.k.b.t(new il90.e(a2, OKVoipEngine.J(participants2)));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCameraBusy() {
            b("onCameraBusy");
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onCameraChanged() {
            b("onCameraChanged");
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                oKVoipEngine.y().f(conversation.getCameraManager().isCapturingFromFrontCamera());
                OKVoipEngine.N(conversation, conversation.getMe());
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0236 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCustomData(JSONObject jSONObject) {
            Object obj;
            cxi.b bVar;
            cxi.b bVar2;
            cxi.b bVar3;
            JSONObject optJSONObject;
            String optString;
            b("onCustomData(" + jSONObject + ')');
            String optString2 = jSONObject != null ? jSONObject.optString(NotificationCompat.CATEGORY_EVENT, "") : null;
            if (optString2 != null) {
                switch (optString2.hashCode()) {
                    case -1995317187:
                        if (optString2.equals("InteractionRequest")) {
                            obj = abv.d.a;
                            break;
                        }
                        break;
                    case 735337169:
                        if (optString2.equals("InteractionReady") && (optJSONObject = jSONObject.optJSONObject("payload")) != null && (optString = optJSONObject.optString("interaction_id", "")) != null) {
                            obj = new abv.c(optString);
                            break;
                        }
                        break;
                    case 832133530:
                        if (optString2.equals("InteractionAccept")) {
                            obj = abv.a.a;
                            break;
                        }
                        break;
                    case 887870220:
                        if (optString2.equals("InteractionCancel")) {
                            obj = abv.b.a;
                            break;
                        }
                        break;
                }
                if (obj == null) {
                    cnw0 cnw0Var = OKVoipEngine.v;
                    if (cnw0Var == null) {
                        cnw0Var = null;
                    }
                    cnw0Var.getClass();
                    com.vk.voip.ui.c.b.getClass();
                    nav navVar = com.vk.voip.ui.c.S;
                    qav qavVar = (navVar != null ? navVar : null).a;
                    qavVar.getClass();
                    L.e("opponent event", obj);
                    qavVar.f();
                    if (qavVar.e()) {
                        if (obj instanceof abv.c) {
                            abv.c cVar = (abv.c) obj;
                            qav.b bVar4 = qavVar.k;
                            if (!qavVar.l && bVar4 != null) {
                                qavVar.l = true;
                                qavVar.h(bVar4);
                            }
                            qavVar.d.onNext(new qav.a(cVar.a));
                            return;
                        }
                        if (obj.equals(abv.d.a)) {
                            vav vavVar = qavVar.h;
                            vav vavVar2 = vav.b.a;
                            if (epx.f(vavVar, vavVar2)) {
                                L.l("Opponent requested interaction when feature is disabled");
                            } else if (vavVar instanceof vav.c) {
                                qav.b bVar5 = qavVar.k;
                                if (bVar5 != null && (bVar3 = bVar5.a) != null) {
                                    boolean z0 = com.vk.voip.ui.c.z0();
                                    vavVar2 = new vav.e(bVar3.b, bVar3.c, bVar3.j, z0 ? bVar3.o : bVar3.q, z0 ? bVar3.p : bVar3.r, bVar3.n);
                                }
                                qavVar.i(vavVar2);
                            } else if (vavVar instanceof vav.f) {
                                L.G("Opponent requested interaction when interaction request is sent");
                                qavVar.i(qavVar.c());
                                com.vk.voip.ui.c.r.T(abv.a.a);
                            } else if (vavVar instanceof vav.e) {
                                L.G("Opponent requested interaction again");
                            } else {
                                if (!(vavVar instanceof vav.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                L.G("Opponent requested interaction when it is in progress");
                            }
                            s3q0 s3q0Var = s3q0.a;
                            return;
                        }
                        if (obj.equals(abv.a.a)) {
                            vav vavVar3 = qavVar.h;
                            if (epx.f(vavVar3, vav.b.a)) {
                                L.l("Opponent accepted interaction when feature is disabled");
                            } else if (vavVar3 instanceof vav.c) {
                                L.G("Opponent accepted interaction when it wasn't requested");
                            } else if (vavVar3 instanceof vav.f) {
                                com.vk.voip.ui.c.j0().s0();
                                qavVar.i(qavVar.c());
                            } else if (vavVar3 instanceof vav.e) {
                                L.G("Opponent accepted interaction when it wasn't requested by user");
                            } else {
                                if (!(vavVar3 instanceof vav.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                L.G("Opponent accepted interaction when it is in progress");
                            }
                            s3q0 s3q0Var2 = s3q0.a;
                            return;
                        }
                        if (!obj.equals(abv.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        io.reactivex.rxjava3.subjects.f<uav> fVar = qavVar.e;
                        vav vavVar4 = qavVar.h;
                        if (epx.f(vavVar4, vav.b.a)) {
                            L.l("Opponent cancelled interaction when feature is disabled");
                        } else if (vavVar4 instanceof vav.c) {
                            L.G("Opponent cancelled interaction when it wasn't requested by anyone");
                        } else if (vavVar4 instanceof vav.f) {
                            qav.b bVar6 = qavVar.k;
                            if (bVar6 == null || (bVar2 = bVar6.a) == null) {
                                return;
                            }
                            fVar.onNext(new uav.b(bVar2.s));
                            qavVar.i(qavVar.b());
                        } else if (vavVar4 instanceof vav.e) {
                            qavVar.i(qavVar.b());
                        } else {
                            if (!(vavVar4 instanceof vav.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            qav.b bVar7 = qavVar.k;
                            if (bVar7 == null || (bVar = bVar7.a) == null) {
                                return;
                            }
                            fVar.onNext(new uav.c(bVar.k));
                            qavVar.i(qavVar.b());
                        }
                        s3q0 s3q0Var3 = s3q0.a;
                        return;
                    }
                    return;
                }
                return;
            }
            obj = null;
            if (obj == null) {
            }
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            L.e("calls-sdk-version: 0.2.3");
            b("onDestroyed " + conversationDestroyedInfo);
            if (OKVoipEngine.E.getConversation() != null) {
                q49 q49Var = OKVoipEngine.k.d;
                CallId E = oKVoipEngine.E();
                String a2 = a();
                boolean f = epx.f(conversationDestroyedInfo.getReason(), ConversationEndReason.Busy.INSTANCE);
                ConversationEndReason reason = conversationDestroyedInfo.getReason();
                boolean z = epx.f(reason, ConversationEndReason.RemovedFromCall.INSTANCE) || epx.f(reason, ConversationEndReason.Banned.INSTANCE);
                boolean f2 = epx.f(conversationDestroyedInfo.getReason(), ConversationEndReason.CallTimeout.INSTANCE);
                boolean z2 = conversationDestroyedInfo.getReason() instanceof ConversationEndReason.ObsoleteClient;
                ConversationEndReason reason2 = conversationDestroyedInfo.getReason();
                ConversationEndReason.ObsoleteClient obsoleteClient = reason2 instanceof ConversationEndReason.ObsoleteClient ? (ConversationEndReason.ObsoleteClient) reason2 : null;
                String explanationHtml = obsoleteClient != null ? obsoleteClient.getExplanationHtml() : null;
                q49Var.i(new g49.a(E, a2, f, z, f2, z2, explanationHtml != null ? brm0.y(explanationHtml, "{{current_version}}", (String) com.vk.core.apps.a.d.getValue()) : null));
                oKVoipEngine.P();
            }
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onJoinLinkUpdated(String str) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            dhw0 dhw0Var = OKVoipEngine.B;
            dhw0 dhw0Var2 = null;
            OKVoipEngine.B = dhw0Var != null ? dhw0.a(dhw0Var, str, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -2, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null;
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.getClass();
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            dhw0 dhw0Var3 = com.vk.voip.ui.c.O;
            if (dhw0Var3 != null) {
                cVar.getClass();
                dhw0Var2 = dhw0.a(dhw0Var3, str, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -2, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
            cVar.X0(dhw0Var2);
            com.vk.voip.ui.c.D0();
            OKVoipEngine.L(OKVoipEngine.b, true, 2);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onLocalMediaChanged() {
            b("onLocalMediaChanged");
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null) {
                return;
            }
            OKVoipEngine.N(conversation, conversation.getMe());
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onMeInWaitingRoomChanged(boolean z) {
            if (!z) {
                cnw0 cnw0Var = OKVoipEngine.v;
                (cnw0Var != null ? cnw0Var : null).getClass();
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                if (com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
                    cVar.f1(VoipViewModelState.CallingPeer);
                    com.vk.voip.ui.c.x.onNext(c8x0.b.a);
                    return;
                }
                return;
            }
            cnw0 cnw0Var2 = OKVoipEngine.v;
            (cnw0Var2 != null ? cnw0Var2 : null).getClass();
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar2.getClass();
            if (com.vk.voip.ui.c.K0 != VoipViewModelState.Idle) {
                cVar2.f1(VoipViewModelState.WaitingRoom);
                com.vk.voip.ui.c.x.onNext(c8x0.e.a);
            }
            OKVoipEngine.b.getClass();
            OKVoipEngine.S(new jo70(false));
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0078, code lost:
        
            if (r0 != null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
        
            r1 = xsna.tk90.a(com.vk.voip.OKVoipEngine.H, r0.getMe());
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
        
            if (r1 != null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        
            r4.b.t(new xsna.il90.e(r1, com.vk.voip.OKVoipEngine.J(r0.getParticipants())));
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
        
            r3.b.rebindParticipantViews();
            com.vk.voip.OKVoipEngine.b.getClass();
            r4 = com.vk.voip.OKVoipEngine.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        
            if (r4 != null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
        
            r4 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
        
            r4.getClass();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x005c, code lost:
        
            if ((r4.getSessionRoomManager().getOwnActiveRoom().getRoomId() instanceof ru.ok.android.webrtc.sessionroom.SessionRoomId.MainCall) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
        
            r4 = com.vk.voip.OKVoipEngine.k;
            r4.d.k(com.vk.voip.OKVoipEngine.b.E(), a());
            onOpponentMediaChanged();
            r0 = com.vk.voip.OKVoipEngine.E.getConversation();
         */
        @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
            b("onConnected");
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                ParticipantCollection participants = conversation.getParticipants();
                if (participants == null || !participants.isEmpty()) {
                    for (ConversationParticipant conversationParticipant : participants) {
                        if (conversationParticipant.isUseable() && conversationParticipant.isCallAccepted() && !mnh0.n(OKVoipEngine.b.a(), conversationParticipant.getExternalId())) {
                            break;
                        }
                    }
                }
            }
        }

        @Override // ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
        public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
            b("onDisconnected");
            OKVoipEngine.k.d.v(OKVoipEngine.b.E(), a());
            OKVoipEngine.Q();
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onMicChanged(boolean z) {
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.r(z);
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null) {
                return;
            }
            OKVoipEngine.N(conversation, conversation.getMe());
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onMicrophoneForciblyMuted() {
            b("onMicrophoneForciblyMuted");
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.r(true);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onMuteChanged(MuteEvent muteEvent) {
            OKVoipEngine.k.o.a(muteEvent, false);
            L.A("OKVoipEngine", "onMuteChanged " + muteEvent);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onMuteStateInitialized(MuteEvent muteEvent) {
            OKVoipEngine.k.o.a(muteEvent, true);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onOpponentFingerprintChanged(long j) {
            b("onOpponentFingerprintChanged");
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            String a2 = a();
            String valueOf = String.valueOf(j);
            cnw0Var.getClass();
            bnw0.a.post(new xsna.h(11, a2, valueOf));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onOpponentMediaChanged() {
            ConversationParticipant opponent;
            ConversationParticipant opponent2;
            ConversationParticipant opponent3;
            ConversationParticipant opponent4;
            StringBuilder sb = new StringBuilder("onOpponentMediaChanged isVideo = ");
            OKVoipEngine.b.getClass();
            wrj wrjVar = OKVoipEngine.E;
            Conversation conversation = wrjVar.getConversation();
            sb.append((conversation == null || (opponent4 = conversation.getOpponent()) == null) ? null : Boolean.valueOf(opponent4.isVideoEnabled()));
            b(sb.toString());
            dhw0 dhw0Var = OKVoipEngine.B;
            boolean z = false;
            if (dhw0Var != null ? dhw0Var.D : false) {
                return;
            }
            cnw0 cnw0Var = OKVoipEngine.v;
            cnw0 cnw0Var2 = cnw0Var != null ? cnw0Var : null;
            Conversation conversation2 = wrjVar.getConversation();
            boolean z2 = (conversation2 == null || (opponent3 = conversation2.getOpponent()) == null || !opponent3.isVideoEnabled()) ? false : true;
            Conversation conversation3 = wrjVar.getConversation();
            boolean z3 = (conversation3 == null || (opponent2 = conversation3.getOpponent()) == null || !opponent2.isScreenCaptureEnabled()) ? false : true;
            Conversation conversation4 = wrjVar.getConversation();
            if (conversation4 != null && (opponent = conversation4.getOpponent()) != null && opponent.isAnimojiEnabled()) {
                z = true;
            }
            zmw0.b bVar = new zmw0.b(z2, z3, z);
            cnw0Var2.getClass();
            bnw0.a.post(new hod(bVar, 21));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onOpponentRegistered() {
            b("onOpponentRegistered");
            OKVoipEngine.k.d.q();
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onParticipantsAdded(List<? extends ConversationParticipant> list) {
            CallMember a2;
            ParticipantCollection participants;
            b("onParticipantAdded: " + list);
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            wrj wrjVar = OKVoipEngine.E;
            Conversation conversation = wrjVar.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            ArrayList J = OKVoipEngine.J(list);
            ArrayList J2 = OKVoipEngine.J(conversation.getParticipants());
            ulp ulpVar = OKVoipEngine.k;
            ulpVar.b.d(new il90.a(a2, J, J2));
            dhw0 dhw0Var = OKVoipEngine.B;
            boolean z = dhw0Var != null && dhw0Var.D;
            Conversation conversation2 = wrjVar.getConversation();
            int size = (conversation2 == null || (participants = conversation2.getParticipants()) == null) ? 0 : participants.size();
            if (!z && size > 2) {
                dhw0 dhw0Var2 = OKVoipEngine.B;
                OKVoipEngine.B = dhw0Var2 != null ? dhw0.a(dhw0Var2, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, true, 0, null, false, false, false, false, null, null, -1610612737, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null;
                ulpVar.d.r(true);
            }
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onParticipantsChanged(List<ConversationParticipant> list) {
            CallMember a2;
            b("onParticipantsChanged: " + list);
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            List<ConversationParticipant> list2 = list;
            ArrayList J = OKVoipEngine.J(list2);
            ArrayList J2 = OKVoipEngine.J(conversation.getParticipants());
            Iterator<ConversationParticipant> it = list.iterator();
            while (it.hasNext()) {
                this.b.rebindParticipantView(it.next());
            }
            OKVoipEngine.k.b.x(new il90.b(a2, J, J2));
            OKVoipEngine.L(OKVoipEngine.b, false, 3);
            dhw0 dhw0Var = OKVoipEngine.B;
            if (!(dhw0Var != null ? dhw0Var.D : false)) {
                for (ConversationParticipant conversationParticipant : list2) {
                    dhw0 dhw0Var2 = OKVoipEngine.B;
                    if (!(dhw0Var2 != null ? dhw0Var2.D : false)) {
                        OKVoipEngine.b.getClass();
                        Conversation conversation2 = OKVoipEngine.E.getConversation();
                        if (conversation2 != null && !epx.f(conversationParticipant.getInternalId(), conversation2.getMe().getInternalId())) {
                            cnw0 cnw0Var = OKVoipEngine.v;
                            if (cnw0Var == null) {
                                cnw0Var = null;
                            }
                            String a3 = a();
                            Serializer.c<CallId> cVar = CallId.CREATOR;
                            CallId a4 = CallId.a.a(conversation2.getConversationId());
                            boolean isAudioEnabled = conversationParticipant.isAudioEnabled();
                            cnw0Var.getClass();
                            com.vk.voip.ui.c.b.getClass();
                            if (a3.equals(String.valueOf(com.vk.voip.ui.c.K)) && epx.f(a4, com.vk.voip.ui.c.T0)) {
                                com.vk.voip.ui.c.d1(isAudioEnabled);
                            }
                        }
                    }
                }
            }
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onParticipantsDeAnonymized(List<ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
            CallMember a2;
            b("onParticipantsDeAnonymized: " + list);
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            ArrayList J = OKVoipEngine.J(list);
            ArrayList J2 = OKVoipEngine.J(conversation.getParticipants());
            Iterator<ConversationParticipant> it = list.iterator();
            while (it.hasNext()) {
                this.b.rebindParticipantView(it.next());
            }
            Set<Map.Entry<ParticipantId, ParticipantId>> entrySet = map.entrySet();
            int e = on00.e(c5g.u(entrySet, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator<T> it2 = entrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Pair pair = new Pair(mnh0.E((ParticipantId) entry.getKey()), mnh0.E((ParticipantId) entry.getValue()));
                linkedHashMap.put(pair.i(), pair.j());
            }
            OKVoipEngine.k.b.h(new il90.c(a2, J, linkedHashMap, J2));
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onParticipantsRemoved(List<ConversationParticipant> list) {
            CallMember a2;
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            OKVoipEngine.k.b.s(new il90.d(a2, OKVoipEngine.J(list), OKVoipEngine.J(conversation.getParticipants())));
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onParticipantsUpdated(Collection<? extends ConversationParticipant> collection) {
            CallMember a2;
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            OKVoipEngine.k.b.t(new il90.e(a2, OKVoipEngine.J(conversation.getParticipants())));
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
            CallMember a2;
            OKVoipEngine.t(OKVoipEngine.b, conversationParticipant, z);
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null || (a2 = tk90.a(OKVoipEngine.H, conversation.getMe())) == null) {
                return;
            }
            OKVoipEngine.k.b.t(new il90.e(a2, OKVoipEngine.J(conversation.getParticipants())));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onRecurringChanged(boolean z) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            dhw0 dhw0Var = OKVoipEngine.B;
            dhw0 dhw0Var2 = null;
            OKVoipEngine.B = dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, z, null, null, -1, 495) : null;
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.getClass();
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            dhw0 dhw0Var3 = com.vk.voip.ui.c.O;
            if (dhw0Var3 != null) {
                cVar.getClass();
                dhw0Var2 = dhw0.a(dhw0Var3, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, z, null, null, -1, 495);
            }
            cVar.X0(dhw0Var2);
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onRolesChanged(ConversationParticipant conversationParticipant) {
            String str = conversationParticipant.getExternalId().id;
            L.A("OKVoipEngine", "onRolesChanged ".concat(str));
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null) {
                return;
            }
            boolean equals = str.equals(conversation.getMe().getExternalId().id);
            if (conversationParticipant.isAdmin()) {
                Iterator it = OKVoipEngine.r.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b(str, equals);
                }
            } else {
                Iterator it2 = OKVoipEngine.r.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a(equals);
                }
            }
            CallMember a2 = tk90.a(OKVoipEngine.H, conversation.getMe());
            if (a2 == null) {
                return;
            }
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            ParticipantCollection participants = conversation.getParticipants();
            oKVoipEngine.getClass();
            OKVoipEngine.k.b.t(new il90.e(a2, OKVoipEngine.J(participants)));
        }

        @Override // ru.ok.android.external.sdk.TopologyChangedListener
        public final void onTopologyUpdated(Topology topology, Topology topology2) {
            if (topology == Topology.DIRECT && topology2 == Topology.SERVER) {
                OKVoipEngine.L(OKVoipEngine.b, false, 1);
            }
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onWaitingRoomEnabledChanged(boolean z) {
            com.vk.voip.ui.c cVar;
            boolean z2;
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            dhw0 dhw0Var = OKVoipEngine.B;
            dhw0 dhw0Var2 = null;
            OKVoipEngine.B = dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, z, false, null, null, -1, 503) : null;
            cnw0 cnw0Var = OKVoipEngine.v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.getClass();
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            dhw0 dhw0Var3 = com.vk.voip.ui.c.O;
            if (dhw0Var3 != null) {
                cVar2.getClass();
                dhw0 a2 = dhw0.a(dhw0Var3, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, z, false, null, null, -1, 503);
                z2 = z;
                cVar = cVar2;
                dhw0Var2 = a2;
            } else {
                cVar = cVar2;
                z2 = z;
            }
            cVar.X0(dhw0Var2);
            if (!z2) {
                com.vk.voip.ui.c.x.onNext(new c8x0.f(0));
            }
            com.vk.voip.ui.c.x.onNext(new c8x0.d(z2));
        }

        @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
        public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            List<ParticipantId> list = waitingRoomParticipantsUpdate.participantsIds;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (ParticipantId participantId : list) {
                linkedHashSet.add(new CallMemberId(participantId.id, participantId.deviceIndex));
            }
            k8x0 k8x0Var = new k8x0(linkedHashSet, waitingRoomParticipantsUpdate.hasAdded, waitingRoomParticipantsUpdate.hasRemoved);
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            dhw0 dhw0Var = OKVoipEngine.B;
            OKVoipEngine.B = dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, k8x0Var, null, -1, 479) : null;
            cnw0 cnw0Var = OKVoipEngine.v;
            (cnw0Var != null ? cnw0Var : null).s(k8x0Var);
        }
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class c {
        public final dhw0 a;
        public final zqk0 b;
        public final String c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final d h;
        public final int i;
        public final ScreenCapturePermissionProvider j;

        public c(dhw0 dhw0Var, zqk0 zqk0Var, String str, boolean z, boolean z2, boolean z3, boolean z4, d dVar, int i, ScreenCapturePermissionProvider screenCapturePermissionProvider) {
            this.a = dhw0Var;
            this.b = zqk0Var;
            this.c = str;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
            this.h = dVar;
            this.i = i;
            this.j = screenCapturePermissionProvider;
        }

        public final dhw0 a() {
            return this.a;
        }

        public final d b() {
            return this.h;
        }

        public final boolean c() {
            return this.g;
        }

        public final boolean d() {
            return this.f;
        }

        public final int e() {
            return this.i;
        }

        public final String f() {
            return this.c;
        }

        public final ScreenCapturePermissionProvider g() {
            return this.j;
        }

        public final zqk0 h() {
            return this.b;
        }

        public final boolean i() {
            return this.e;
        }

        public final boolean j() {
            return this.d;
        }
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final mo70 a;
        public final no70 b;
        public final b c;

        public d(mo70 mo70Var, no70 no70Var, b bVar) {
            this.a = mo70Var;
            this.b = no70Var;
            this.c = bVar;
        }

        public final b a() {
            return this.c;
        }
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public interface e {
        void a();

        void b(CallMemberId callMemberId, boolean z, boolean z2);
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<gzs<? extends s3q0>, s3q0> {
        public f(Object obj) {
            super(1, obj, OKVoipEngine.class, "runOnEngineThread", "runOnEngineThread(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.S(gzsVar);
            return s3q0.a;
        }
    }

    /* compiled from: OKVoipEngine.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<gzs<? extends s3q0>, s3q0> {
        public g(Object obj) {
            super(1, obj, OKVoipEngine.class, "runOnEngineThread", "runOnEngineThread(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.S(gzsVar);
            return s3q0.a;
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final class h implements CapturedFrameInterceptor {
        @Override // ru.ok.android.webrtc.CapturedFrameInterceptor
        public final VideoFrame onFrameCaptured(VideoFrame videoFrame) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            dfs dfsVar = OKVoipEngine.i;
            VideoFrame a = (dfsVar != null ? dfsVar.a(videoFrame) : new dfs.a(videoFrame)).a();
            xly xlyVar = OKVoipEngine.f;
            boolean e = oKVoipEngine.y().e();
            j490 j490Var = OKVoipEngine.m;
            xlyVar.a = new wly.a(e, j490Var != null ? j490Var.a() : true);
            bgs bgsVar = OKVoipEngine.g;
            zzz zzzVar = bgsVar.c;
            if (zzzVar != null && !((Boolean) bgsVar.a.invoke()).booleanValue()) {
                float a2 = bgsVar.b.a(zzzVar.c());
                if (a2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return new VideoFrame(a.getBuffer(), (int) (((a.getRotation() + 360) + a2) % 360), a.getTimestampNs());
                }
            }
            return a;
        }

        @Override // ru.ok.android.webrtc.CapturedFrameInterceptor
        public final void onStop() {
            OKVoipEngine.b.getClass();
            dfs dfsVar = OKVoipEngine.i;
            if (dfsVar != null) {
                dfsVar.b();
            }
        }

        public final String toString() {
            return "BaseFrameIntercepter";
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class i extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            return OKVoipEngine.E.getConversation();
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class j extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((OKVoipEngine) this.receiver).a();
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class l extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            return OKVoipEngine.E.getConversation();
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class m extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            return OKVoipEngine.E.getConversation();
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class n extends AdaptedFunctionReference implements izs<Context, TextureViewRenderer> {
        public static final n b = new n(1, TextureViewRenderer.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);

        @Override // xsna.izs
        public final TextureViewRenderer invoke(Context context) {
            return new TextureViewRenderer(context, null, 0, 6, null);
        }
    }

    /* compiled from: OKVoipEngine.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements izs<gzs<? extends s3q0>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gzs<? extends s3q0> gzsVar) {
            OKVoipEngine oKVoipEngine = (OKVoipEngine) this.receiver;
            OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.S(gzsVar);
            return s3q0.a;
        }
    }

    static {
        OKVoipEngine oKVoipEngine = new OKVoipEngine();
        b = oKVoipEngine;
        c = new Handler(Looper.getMainLooper());
        e = new bpn0(new w0f(7));
        xly xlyVar = new xly();
        xlyVar.a = new wly.a();
        f = xlyVar;
        g = new bgs(xlyVar, new hu2(10));
        h = new bpn0(new kb3(8));
        j = new xot(new qo70(0));
        ulp ulpVar = new ulp();
        k = ulpVar;
        l = new riu();
        n = new bpn0(new rwe(7));
        o = new g620();
        L.e("init OkVoipEngine");
        e000 e000Var = new e000();
        k kVar = new k();
        ulpVar.e.a(e000Var);
        ulpVar.d(e000Var);
        ulpVar.c.a(e000Var);
        ulpVar.h(e000Var);
        ulpVar.f(e000Var);
        ulpVar.b(e000Var);
        ulpVar.k.a(e000Var);
        ulpVar.k.a(kVar);
        r = new LinkedHashSet();
        s = new LinkedHashSet();
        t = new bpn0(new hb8(5));
        u = new CopyOnWriteArraySet<>();
        y = OkOwnCameraController.a;
        A = new h();
        Object obj = null;
        C = new kwk(obj, obj);
        wrj wrjVar = new wrj();
        E = wrjVar;
        F = CallId.e;
        tk90 tk90Var = new tk90(new i(oKVoipEngine, OKVoipEngine.class, "currentConversation", "getCurrentConversation()Lru/ok/android/externcalls/sdk/Conversation;", 0), new j(oKVoipEngine, OKVoipEngine.class, "ownId", "getOwnId()Lcom/vk/voip/dto/call_member/CallMemberId;", 0));
        H = tk90Var;
        I = new ih8(new y45(7), ulpVar.e, tk90Var, new zfl(4));
        J = new esj(new xsna.m(6), ulpVar.d, new yp6(10));
        K = new hl90(wrjVar, tk90Var);
    }

    public static MediaOptions A() {
        MediaMuteManager mediaMuteManager;
        MediaOptions mediaOptionsForCall$default;
        Conversation conversation = E.getConversation();
        return (conversation == null || (mediaMuteManager = conversation.getMediaMuteManager()) == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManager, null, 1, null)) == null) ? new MediaOptions(null, null, null, null, 15, null) : mediaOptionsForCall$default;
    }

    public static is90 B() {
        return (is90) n.getValue();
    }

    public static ConversationParticipant C() {
        ConversationParticipant pinnedParticipant;
        Conversation conversation = E.getConversation();
        if (conversation == null || (pinnedParticipant = conversation.getPinnedParticipant()) == null || !pinnedParticipant.isUseable()) {
            return null;
        }
        return pinnedParticipant;
    }

    public static SessionRoomsManager D() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getSessionRoomManager();
        }
        return null;
    }

    public static b2p0 F() {
        cnw0 cnw0Var = v;
        if (cnw0Var == null) {
            cnw0Var = null;
        }
        return cnw0Var.h().b();
    }

    public static boolean I() {
        Conversation conversation;
        ConversationParticipant me2;
        ConversationParticipant me3;
        wrj wrjVar = E;
        if (wrjVar.a()) {
            Conversation conversation2 = wrjVar.getConversation();
            if ((conversation2 == null || (me3 = conversation2.getMe()) == null) ? false : me3.isVideoEnabled()) {
                if (!((!wrjVar.a() || (conversation = wrjVar.getConversation()) == null || (me2 = conversation.getMe()) == null) ? false : me2.isScreenCaptureEnabled())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList J(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            CallMember a2 = tk90.a(H, (ConversationParticipant) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (xsna.epx.f(r3.getOwnProposedRoom().getRoomId(), r5) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(boolean z2, boolean z3) {
        boolean z4;
        dhw0 dhw0Var = B;
        if (dhw0Var == null || dhw0Var.s()) {
            return;
        }
        if (!z2) {
            riu riuVar = l;
            b.getClass();
            Conversation conversation = E.getConversation();
            riuVar.getClass();
            if (conversation != null) {
                ParticipantCollection participants = conversation.getParticipants();
                if (participants.size() <= 2) {
                    if (participants.size() == 2 && !participants.isEmpty()) {
                        Iterator<ConversationParticipant> it = participants.iterator();
                        while (it.hasNext()) {
                            if (it.next().isScreenCaptureEnabled()) {
                                break;
                            }
                        }
                    }
                    if (participants.size() == 2 && !participants.isEmpty()) {
                        Iterator<ConversationParticipant> it2 = participants.iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().getMovies().isEmpty()) {
                                break;
                            }
                        }
                    }
                    SessionRoomsManager sessionRoomManager = conversation.getSessionRoomManager();
                    SessionRoomId roomId = sessionRoomManager.getOwnActiveRoom().getRoomId();
                    SessionRoomId.MainCall mainCall = SessionRoomId.MainCall.INSTANCE;
                    if (epx.f(roomId, mainCall)) {
                    }
                }
            }
            z4 = false;
            B = dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z4, !z2 || z3, 0, null, false, false, false, false, null, null, -1610612737, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            k.d.r(z4);
        }
        z4 = true;
        B = dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z4, !z2 || z3, 0, null, false, false, false, false, null, null, -1610612737, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        k.d.r(z4);
    }

    public static /* synthetic */ void L(OKVoipEngine oKVoipEngine, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) == 0;
        oKVoipEngine.getClass();
        K(z2, z3);
    }

    public static void N(Conversation conversation, ConversationParticipant conversationParticipant) {
        CallMember a2;
        ConversationParticipant me2 = conversation.getMe();
        tk90 tk90Var = H;
        CallMember a3 = tk90.a(tk90Var, me2);
        if (a3 == null || (a2 = tk90.a(tk90Var, conversationParticipant)) == null) {
            return;
        }
        k.b.x(new il90.b(a3, Collections.singletonList(a2), J(conversation.getParticipants())));
    }

    public static void Q() {
        MicrophoneManager microphoneManager;
        try {
            AudioLevelListener audioLevelListener = G;
            if (audioLevelListener == null) {
                return;
            }
            Conversation conversation = E.getConversation();
            if (conversation != null && (microphoneManager = conversation.getMicrophoneManager()) != null) {
                microphoneManager.removeAudioSampleCallback(audioLevelListener);
            }
            G = null;
        } catch (Exception e2) {
            cnw0 cnw0Var = v;
            (cnw0Var != null ? cnw0Var : null).q("Can't remove audio level listener", e2);
        }
    }

    public static void R(CallMemberId callMemberId) {
        dhw0 dhw0Var = B;
        if (dhw0Var != null) {
            k8x0 p2 = dhw0Var.p();
            Set<CallMemberId> b2 = dhw0Var.p().b();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : b2) {
                if (!epx.f((CallMemberId) obj, callMemberId)) {
                    linkedHashSet.add(obj);
                }
            }
            k8x0 a2 = k8x0.a(p2, linkedHashSet);
            cnw0 cnw0Var = v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.s(a2);
            s3q0 s3q0Var = s3q0.a;
            B = dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, a2, null, -1, 479);
        }
    }

    public static void S(gzs gzsVar) {
        i0q0.j(new ddx(1, gzsVar));
    }

    public static void U(OKVoipEngine oKVoipEngine, boolean z2, boolean z3) {
        NoiseSuppressionManager noiseSuppressionManager;
        oKVoipEngine.getClass();
        Conversation conversation = E.getConversation();
        if (conversation == null || (noiseSuppressionManager = conversation.getNoiseSuppressionManager()) == null) {
            return;
        }
        noiseSuppressionManager.setNoiseSuppressionParams(new ko70(z2, z3, false, 0, null, 0, 0, 0, 0, 0, false));
    }

    public static final void t(OKVoipEngine oKVoipEngine, ConversationParticipant conversationParticipant, boolean z2) {
        ConversationParticipant me2;
        CallParticipant callParticipant;
        oKVoipEngine.getClass();
        LinkedHashSet linkedHashSet = s;
        if (conversationParticipant == null || !conversationParticipant.isUseable()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a();
            }
            L.A("OKVoipEngine", "onUnPin");
            return;
        }
        L.A("OKVoipEngine", "onPin " + conversationParticipant.getExternalId().id);
        CallParticipant.ParticipantId participantId = conversationParticipant.getCallParticipant().getParticipantId();
        Conversation conversation = E.getConversation();
        boolean f2 = epx.f(participantId, (conversation == null || (me2 = conversation.getMe()) == null || (callParticipant = me2.getCallParticipant()) == null) ? null : callParticipant.getParticipantId());
        String str = conversationParticipant.getExternalId().id;
        int i2 = conversationParticipant.getExternalId().deviceIndex;
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).b(new CallMemberId(str, i2), f2, !z2);
        }
    }

    public static io70 x() {
        return (io70) h.getValue();
    }

    public static Conversation z() {
        return E.getConversation();
    }

    public final CallId E() {
        return sni.n(b(), new zq3(24));
    }

    public final void G(Context context) {
        cnw0 cnw0Var = v;
        if (cnw0Var == null) {
            cnw0Var = null;
        }
        boolean g2 = ((com.vk.voip.call_effects.a) cnw0Var.a()).g();
        cnw0 cnw0Var2 = v;
        dfs dfsVar = new dfs(context, (cnw0Var2 != null ? cnw0Var2 : null).a(), y(), g2);
        if (g2) {
            dfsVar.e(new dpt(new nie(new zos(12))));
        }
        i = dfsVar;
        if (g2) {
            k.f(new z5r(new z410(10)));
        }
    }

    public final boolean H() {
        Collection collection;
        wrj wrjVar = E;
        Conversation conversation = wrjVar.getConversation();
        if (conversation == null || (collection = conversation.getParticipants()) == null) {
            collection = EmptyList.b;
        }
        Conversation conversation2 = wrjVar.getConversation();
        ConversationParticipant me2 = conversation2 != null ? conversation2.getMe() : null;
        if (collection.size() == 1) {
            return epx.f(((ConversationParticipant) j5g.X(collection)).getExternalId(), me2 != null ? me2.getExternalId() : null);
        }
        return false;
    }

    @Override // com.vk.voip.b
    public final ih8 M() {
        return I;
    }

    public final void O(Conversation conversation) {
        StatProcessor statProcessor;
        cnw0 cnw0Var = v;
        if (cnw0Var == null) {
            cnw0Var = null;
        }
        if (cnw0Var.p() && (statProcessor = D) != null) {
            statProcessor.setConversation(conversation);
        }
        ulp ulpVar = k;
        conversation.getWatchTogetherPlayer().addListener(new ocx0(ulpVar.f));
        e6r e6rVar = new e6r(ulpVar.h);
        e6rVar.onFeedbackEnabledChanged(isFeedbackEnabled());
        conversation.getFeedbackManager().addListener(e6rVar);
        conversation.getAsrManager().addAsrRecordListener(new dw3(ulpVar.i));
        conversation.getAsrOnlineManager().addAsrOnlineListener(new hv3(ulpVar.n));
        conversation.getContactCallManager().addContactCallListener(new g8j(ulpVar.j));
        nuq nuqVar = new nuq(ulpVar.g);
        Iterator<E> it = CallFeature.getEntries().iterator();
        while (it.hasNext()) {
            conversation.getFeatureManager().addFeatureListener((CallFeature) it.next(), nuqVar);
        }
        conversation.getSessionRoomManager().addListener(new bxi0(ulpVar.k));
        conversation.getParticipantStatesManager().addHandListener(new xsu(ulpVar.l));
        conversation.getParticipantStatesManager().addAssistanceRequestListener(new jx3(ulpVar.m));
        conversation.getStereoRoomManager().addListener(new h1l0(ulpVar.p));
        conversation.getUrlSharingManager().addListener(new gfq0(ulpVar.q));
        conversation.getChatManager().addListener(new msb(ulpVar.r));
        conversation.getMediaMuteManager().addListener(new ts10(ulpVar.s));
        conversation.getRecordManager().addRecordListener(I);
        conversation.getSessionRoomManager().addListener(new siu(new ta50(2)));
        j490 j490Var = m;
        if (j490Var != null) {
            j490Var.c();
        }
        m = null;
        m = new j490(getVideoController(), y());
        cnw0 cnw0Var2 = v;
        String b2 = ((kqw0) (cnw0Var2 != null ? cnw0Var2 : null).g()).b();
        if (b2 == null) {
            return;
        }
        conversation.getDebugManager().getMediaDumpManager().setLocalAudioDumpLocation(b2);
    }

    public final void P() {
        Q();
        try {
            wrj wrjVar = E;
            wrjVar.getClass();
            Conversation andSet = wrjVar.a.getAndSet(null);
            if (andSet != null) {
                L.e("conversation " + andSet.getConversationId() + " release resources");
                andSet.release();
            }
        } catch (Throwable th) {
            cnw0 cnw0Var = v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            cnw0Var.q(th.getMessage(), th);
        }
        OkOwnCameraController okOwnCameraController = y;
        Application application = w;
        if (application == null) {
            application = null;
        }
        okOwnCameraController.getClass();
        if (OkOwnCameraController.c) {
            OkOwnCameraController.c = false;
            OkOwnCameraController.d = false;
            application.unregisterReceiver(okOwnCameraController);
        }
        StatProcessor statProcessor = D;
        if (statProcessor != null) {
            statProcessor.setConversation(null);
        }
        F = CallId.e;
        B = null;
        u.clear();
        getVideoController().clear();
        xly xlyVar = f;
        xlyVar.getClass();
        xlyVar.a = new wly.a();
        p = false;
        C = C.b(null);
        j490 j490Var = m;
        if (j490Var != null) {
            j490Var.c();
        }
        m = null;
    }

    public final void T(abv abvVar) {
        Conversation conversation;
        ConversationParticipant opponent;
        L.A("sendHolidayInteractionEvent", String.valueOf(abvVar));
        if (isGroupCall() || (conversation = E.getConversation()) == null || (opponent = conversation.getOpponent()) == null) {
            return;
        }
        conversation.sendData(opponent, wav.a(abvVar));
    }

    @Override // xsna.k490
    public final CallMemberId a() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return mnh0.E(conversation.getMe().getExternalId());
        }
        cnw0 cnw0Var = v;
        if (cnw0Var == null) {
            cnw0Var = null;
        }
        cnw0Var.n();
        return null;
    }

    @Override // com.vk.voip.b
    public final synchronized CallId b() {
        return F;
    }

    @Override // com.vk.voip.b
    public final void c(boolean z2, boolean z3) {
        AnimojiControl animojiControl;
        Conversation conversation = E.getConversation();
        if (conversation == null || (animojiControl = conversation.getAnimojiControl()) == null) {
            return;
        }
        animojiControl.setEnabled(z2, z3);
    }

    @Override // com.vk.voip.b
    public final io70 d() {
        return x();
    }

    @Override // com.vk.voip.b
    public final void e(boolean z2) {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            conversation.setAudioCaptureEnabled(z2);
        }
    }

    @Override // com.vk.voip.b
    public final void f(b.c cVar) {
        S(new nm60(cVar, 1));
    }

    @Override // com.vk.voip.b
    public final ConversationFeatureManager g() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getFeatureManager();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final AsrManager getAsrManager() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getAsrManager();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final ContactCallManager getContactCallManager() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getContactCallManager();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final FeedbackManager getFeedbackManager() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getFeedbackManager();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final MediaOptions getMediaOptionsForCurrentUser() {
        MediaMuteManager mediaMuteManager;
        MediaOptions mediaOptionsForCurrentUser;
        Conversation conversation = E.getConversation();
        return (conversation == null || (mediaMuteManager = conversation.getMediaMuteManager()) == null || (mediaOptionsForCurrentUser = mediaMuteManager.getMediaOptionsForCurrentUser()) == null) ? new MediaOptions(null, null, null, null, 15, null) : mediaOptionsForCurrentUser;
    }

    @Override // com.vk.voip.b
    public final ParticipantStatesManager getParticipantStatesManager() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getParticipantStatesManager();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final rct0 getVideoController() {
        return (rct0) t.getValue();
    }

    @Override // com.vk.voip.b
    public final WatchTogetherPlayer getWatchTogetherPlayer() {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            return conversation.getWatchTogetherPlayer();
        }
        return null;
    }

    @Override // com.vk.voip.b
    public final ulp h() {
        return k;
    }

    @Override // com.vk.voip.b
    public final void i(boolean z2, boolean z3) {
        Conversation conversation = E.getConversation();
        if (conversation == null) {
            return;
        }
        HangupParameters.Builder endCallForAllThroughExternalApiCalled = new HangupParameters.Builder().setEndCallForAllThroughExternalApiCalled(z3);
        if (z2) {
            conversation.hangup(endCallForAllThroughExternalApiCalled.setReason(HangupReason.BUSY).build());
        } else {
            conversation.hangup(endCallForAllThroughExternalApiCalled.setReason(null).build());
        }
        P();
    }

    @Override // com.vk.voip.b
    public final boolean isFeedbackEnabled() {
        Conversation conversation = E.getConversation();
        return conversation != null && conversation.isFeedbackEnabled();
    }

    @Override // com.vk.voip.b
    public final boolean isGroupCall() {
        dhw0 dhw0Var = B;
        return dhw0Var != null && dhw0Var.s();
    }

    @Override // com.vk.voip.b
    public final boolean isMeCreatorOrAdmin() {
        Conversation conversation = E.getConversation();
        if (conversation == null) {
            return false;
        }
        return conversation.isMeCreatorOrAdmin();
    }

    @Override // com.vk.voip.b
    public final boolean isWaitingRoomEnabled() {
        Conversation conversation = E.getConversation();
        return conversation != null && conversation.isWaitingRoomEnabled();
    }

    @Override // com.vk.voip.b
    public final void j(CallMemberId callMemberId, boolean z2) {
        wrj wrjVar = E;
        if (wrjVar.a()) {
            ParticipantId H2 = mnh0.H(callMemberId);
            Conversation conversation = wrjVar.getConversation();
            if (conversation != null) {
                conversation.promoteParticipant(H2, z2);
            }
            if (z2) {
                R(callMemberId);
            }
        }
    }

    @Override // com.vk.voip.b
    public final hl90 k() {
        return K;
    }

    @Override // com.vk.voip.b
    public final void l(boolean z2, boolean z3) {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            conversation.getScreenCaptureManager().setScreenCaptureEnabled(z2, z3);
            L(b, z2, 2);
        }
    }

    @Override // com.vk.voip.b
    public final void m() {
        dhw0 dhw0Var;
        dhw0 dhw0Var2 = B;
        if (dhw0Var2 == null || !dhw0Var2.s() || (dhw0Var = B) == null || !dhw0Var.u()) {
            K(true, true);
        }
    }

    @Override // com.vk.voip.b
    public final boolean n(CallMemberId callMemberId) {
        Conversation conversation = E.getConversation();
        if (conversation == null) {
            return false;
        }
        ConversationParticipant pinnedParticipant = conversation.getPinnedParticipant();
        return epx.f(pinnedParticipant != null ? pinnedParticipant.getExternalId() : null, mnh0.H(callMemberId));
    }

    @Override // com.vk.voip.b
    public final void o(boolean z2) {
        xot xotVar = j;
        xotVar.b = z2;
        xotVar.a.invoke(Boolean.valueOf(xotVar.c && z2));
    }

    @Override // com.vk.voip.b
    public final void p(BeautyFilterIntensity beautyFilterIntensity) {
        dfs dfsVar = i;
        if (dfsVar != null) {
            dfsVar.c(beautyFilterIntensity);
        }
    }

    @Override // com.vk.voip.b
    public final kwk q() {
        return C;
    }

    @Override // com.vk.voip.b
    public final void r(boolean z2) {
        q = z2;
    }

    @Override // com.vk.voip.b
    public final boolean s(String str) {
        ParticipantCollection participants;
        Conversation conversation = E.getConversation();
        ConversationParticipant conversationParticipant = null;
        if (conversation != null && (participants = conversation.getParticipants()) != null) {
            Iterator<ConversationParticipant> it = participants.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ConversationParticipant next = it.next();
                if (epx.f(next.getExternalId().id, str)) {
                    conversationParticipant = next;
                    break;
                }
            }
            conversationParticipant = conversationParticipant;
        }
        if (conversationParticipant == null) {
            return false;
        }
        return f9t.C(conversationParticipant);
    }

    @Override // com.vk.voip.b
    public final void setFeedbackEnabled(boolean z2) {
        Conversation conversation = E.getConversation();
        if (conversation != null) {
            conversation.setFeedbackEnabled(z2);
        }
    }

    public final void u(String str) {
        if (str == null) {
            dfs dfsVar = i;
            if (dfsVar != null) {
                dfsVar.g(null);
                return;
            }
            return;
        }
        b.a aVar = new b.a(EffectRegistry.EffectId.API_PROGRAM, new File(str));
        dfs dfsVar2 = i;
        if (dfsVar2 != null) {
            dfsVar2.g(aVar);
        }
    }

    public final Conversation v(final c cVar) {
        Conversation call;
        L.e("calls-sdk-version: 0.2.3");
        ConversationFactory conversationFactory = x;
        if (conversationFactory == null) {
            conversationFactory = null;
        }
        conversationFactory.setEnabledDnsResolver(cVar.c());
        ConversationFactory conversationFactory2 = x;
        if (conversationFactory2 == null) {
            conversationFactory2 = null;
        }
        conversationFactory2.setForceRelayPolicy(cVar.d());
        ConversationFactory conversationFactory3 = x;
        if (conversationFactory3 == null) {
            conversationFactory3 = null;
        }
        conversationFactory3.setVideoTracksCount(cVar.e());
        ConversationFactory conversationFactory4 = x;
        if (conversationFactory4 == null) {
            conversationFactory4 = null;
        }
        conversationFactory4.setScreenCapturePermissionProvider(cVar.g());
        dhw0 a2 = cVar.a();
        if (a2.b() != null) {
            C = C.b(StartCallType.ANONYMOUS_JOIN);
            final xdw0 b2 = a2.b();
            final String b3 = b2.b();
            final boolean z2 = !brm0.B(b3, "-", false);
            ConversationFactory conversationFactory5 = x;
            call = (conversationFactory5 != null ? conversationFactory5 : null).joinAnonByLink(new izs() { // from class: xsna.oo70
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    xdw0 xdw0Var = xdw0.this;
                    JoinAnonByLinkParams.Builder myId = ((JoinAnonByLinkParams.Builder) obj).setLink(xdw0Var.d).setTokenInfo(xdw0Var.e, xdw0Var.f).setMyId(ParticipantId.withoutDeviceId(b3, z2));
                    OKVoipEngine.c cVar2 = cVar;
                    JoinAnonByLinkParams.Builder startWithVideo = myId.setStartWithVideo(cVar2.d);
                    OKVoipEngine.d dVar = cVar2.h;
                    return startWithVideo.setOnPrepared(dVar.a).setOnError(dVar.b).setEventListener((ConversationEventsListener) dVar.c).setFrameInterceptor((CapturedFrameInterceptor) OKVoipEngine.A).build();
                }
            });
        } else if (a2.i() != null && a2.v()) {
            C = C.b(StartCallType.TOKENIZED_JOIN);
            String i2 = a2.i();
            dhw0 a3 = cVar.a();
            is90 B2 = B();
            cnw0 cnw0Var = v;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            String o2 = cnw0Var.o();
            boolean j2 = cVar.j();
            B2.getClass();
            JSONObject c2 = is90.c(o2, j2, a3);
            ConversationFactory conversationFactory6 = x;
            call = (conversationFactory6 != null ? conversationFactory6 : null).joinByLink(new ix50(i2, c2, a3, cVar));
        } else if (a2.i() != null) {
            C = C.b(StartCallType.JOIN);
            String i3 = a2.i();
            ConversationFactory conversationFactory7 = x;
            call = (conversationFactory7 != null ? conversationFactory7 : null).joinByLink(new b7(15, i3, cVar));
        } else if (a2.t()) {
            C = C.b(StartCallType.NEW_TOKENIZED_GROUP_CALL);
            dhw0 a4 = cVar.a();
            is90 B3 = B();
            cnw0 cnw0Var2 = v;
            if (cnw0Var2 == null) {
                cnw0Var2 = null;
            }
            JSONObject b4 = B3.b(cnw0Var2.o(), cVar.j(), a4);
            ConversationFactory conversationFactory8 = x;
            call = (conversationFactory8 != null ? conversationFactory8 : null).createConfRoom(new t3b(a4, b4, cVar, 6));
        } else if (a2.s()) {
            C = C.b(StartCallType.NEW_GROUP_CALL);
            dhw0 a5 = cVar.a();
            is90 B4 = B();
            cnw0 cnw0Var3 = v;
            if (cnw0Var3 == null) {
                cnw0Var3 = null;
            }
            JSONObject b5 = B4.b(cnw0Var3.o(), cVar.j(), a5);
            ConversationFactory conversationFactory9 = x;
            call = (conversationFactory9 != null ? conversationFactory9 : null).createConfRoom(new jl6(a5, b5, cVar, 7));
        } else if (a2.v()) {
            C = C.b(StartCallType.NEW_TOKENIZED_ONE_TO_ONE);
            dhw0 a6 = cVar.a();
            is90 B5 = B();
            cnw0 cnw0Var4 = v;
            if (cnw0Var4 == null) {
                cnw0Var4 = null;
            }
            JSONObject d2 = B5.d(cnw0Var4.o(), cVar.j(), a6);
            ConversationFactory conversationFactory10 = x;
            call = (conversationFactory10 != null ? conversationFactory10 : null).call(new sub(a6, d2, cVar, 4));
        } else if (a2.f() != null) {
            C = C.b(StartCallType.NEW_CONTACT_CALL);
            dhw0 a7 = cVar.a();
            xmw0 e2 = cVar.h().e();
            String a8 = e2 != null ? e2.a() : null;
            if (a8 == null) {
                a8 = String.valueOf(a7.g());
            }
            is90 B6 = B();
            cnw0 cnw0Var5 = v;
            if (cnw0Var5 == null) {
                cnw0Var5 = null;
            }
            JSONObject d3 = B6.d(cnw0Var5.o(), cVar.j(), a7);
            ConversationFactory conversationFactory11 = x;
            call = (conversationFactory11 != null ? conversationFactory11 : null).call(new m0i(a8, d3, cVar, 3));
        } else {
            C = C.b(StartCallType.NEW_ONE_TO_ONE);
            dhw0 a9 = cVar.a();
            is90 B7 = B();
            cnw0 cnw0Var6 = v;
            if (cnw0Var6 == null) {
                cnw0Var6 = null;
            }
            JSONObject d4 = B7.d(cnw0Var6.o(), cVar.j(), a9);
            ConversationFactory conversationFactory12 = x;
            call = (conversationFactory12 != null ? conversationFactory12 : null).call(new z63(a9, d4, cVar, 9));
        }
        Serializer.c<CallId> cVar2 = CallId.CREATOR;
        F = CallId.a.a(call.getConversationId());
        boolean c3 = a2.c();
        ulp ulpVar = k;
        if (c3) {
            ulpVar.d.f(new g49.b(cVar.j(), cVar.i()));
        } else {
            ulpVar.d.l(izi0.k(a2.k(), a2.v() ? String.valueOf(a2.o().b) : cVar.f()).size(), cVar.j(), a2.s(), E());
        }
        call.getNetworkConnectionManager().plusAssign(cVar.b().a());
        call.getMediaConnectionManager().addListener(cVar.b().a());
        return call;
    }

    public final synchronized boolean w() {
        if (z) {
            return true;
        }
        L.e("calls-sdk-version: 0.2.3");
        try {
            cnw0 cnw0Var = v;
            cnw0 cnw0Var2 = null;
            if (cnw0Var == null) {
                cnw0Var = null;
            }
            w = (Application) cnw0Var.getContext().getApplicationContext();
            cnw0 cnw0Var3 = v;
            x = new ConversationFactoryCreator(cnw0Var3 == null ? null : cnw0Var3, new hy2(26), new om60(2), new pm60(1), ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).L1()).a();
            Application application = w;
            if (application == null) {
                application = null;
            }
            G(application);
            bgs bgsVar = g;
            cnw0 cnw0Var4 = v;
            if (cnw0Var4 != null) {
                cnw0Var2 = cnw0Var4;
            }
            bgsVar.c = cnw0Var2.k().a();
            z = true;
            L.A("OKVoipEngine", "OKVoipEngine is initialized");
            D = new StatProcessor();
        } catch (Exception e2) {
            L.A("OKVoipEngine", "Failed to initialized OK Voip Engine", e2);
            com.vk.metrics.eventtracking.b.a.q(new CriticalException(e2.getMessage(), e2.getCause()));
        }
        return z;
    }

    public final gj9 y() {
        return (gj9) e.getValue();
    }

    /* compiled from: OKVoipEngine.kt */
    public static final class k implements SessionRoomsManager.OwnRoomsListener {
        @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
        public final void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
        public final void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
        public final void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
            OKVoipEngine oKVoipEngine = OKVoipEngine.b;
            oKVoipEngine.getClass();
            OKVoipEngine.t(oKVoipEngine, OKVoipEngine.C(), false);
        }

        @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
        public final void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        }
    }
}
