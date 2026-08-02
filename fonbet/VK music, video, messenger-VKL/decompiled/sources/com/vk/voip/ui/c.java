package com.vk.voip.ui;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.FailedBinderCallBack;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.permission.PermissionHelper;
import com.vk.toggle.features.ComFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.OkOwnCameraController;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.api.dto.VoipCallOnStartAction;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.api.id.CallId;
import com.vk.voip.b;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.dto.type.StartCallType;
import com.vk.voip.feedback_gestures.GestureFeedback;
import com.vk.voip.ui.VoipAudioManager;
import com.vk.voip.ui.VoipStatManager;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.prodstat.analytics.base.screen.VoipAnalyticsEventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.j2;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.n1;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.HangupReason;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.hangup.HangupParameters;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.a201;
import xsna.a4x0;
import xsna.a68;
import xsna.ab;
import xsna.ab80;
import xsna.acc0;
import xsna.ah8;
import xsna.ahn;
import xsna.asu0;
import xsna.b39;
import xsna.b55;
import xsna.b63;
import xsna.bb3;
import xsna.bfw0;
import xsna.bnw0;
import xsna.bpn0;
import xsna.bx80;
import xsna.c13;
import xsna.c24;
import xsna.c5g;
import xsna.c8x0;
import xsna.cc9;
import xsna.cd3;
import xsna.ch8;
import xsna.chr0;
import xsna.chw0;
import xsna.cnw0;
import xsna.cow0;
import xsna.cqr0;
import xsna.cus0;
import xsna.d53;
import xsna.d8j;
import xsna.d8u0;
import xsna.da9;
import xsna.dc9;
import xsna.dhw0;
import xsna.djw0;
import xsna.dnz;
import xsna.drm0;
import xsna.dvw0;
import xsna.dwe0;
import xsna.e43;
import xsna.e49;
import xsna.e4x0;
import xsna.e53;
import xsna.efz;
import xsna.ehw0;
import xsna.ejw0;
import xsna.enj;
import xsna.epw0;
import xsna.epx;
import xsna.esa;
import xsna.esj;
import xsna.eu2;
import xsna.ew3;
import xsna.f18;
import xsna.f870;
import xsna.f8j;
import xsna.f9t;
import xsna.fjw0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fq4;
import xsna.fsw0;
import xsna.fw3;
import xsna.fw6;
import xsna.fyp0;
import xsna.fz2;
import xsna.g2h0;
import xsna.g3x0;
import xsna.g49;
import xsna.g4x0;
import xsna.gf8;
import xsna.gp;
import xsna.gs00;
import xsna.gsi0;
import xsna.gvw0;
import xsna.gw3;
import xsna.gy50;
import xsna.gyo0;
import xsna.gzs;
import xsna.h260;
import xsna.h3x0;
import xsna.h8j;
import xsna.hd8;
import xsna.hdi0;
import xsna.hew0;
import xsna.hg1;
import xsna.hrt0;
import xsna.i0q0;
import xsna.i3x0;
import xsna.i9e0;
import xsna.iah0;
import xsna.ib3;
import xsna.icx0;
import xsna.ifv0;
import xsna.ihg;
import xsna.ihu;
import xsna.il90;
import xsna.ip4;
import xsna.iq60;
import xsna.iqt;
import xsna.it80;
import xsna.iw6;
import xsna.ixu0;
import xsna.izs;
import xsna.j55;
import xsna.jew0;
import xsna.jnf;
import xsna.jo70;
import xsna.jow0;
import xsna.jrw0;
import xsna.jsa;
import xsna.jy10;
import xsna.k4x0;
import xsna.k55;
import xsna.k570;
import xsna.k7m;
import xsna.kcx0;
import xsna.kdw0;
import xsna.kew0;
import xsna.kiu;
import xsna.knf;
import xsna.kqt;
import xsna.ks2;
import xsna.l570;
import xsna.l5x0;
import xsna.lcq0;
import xsna.lew0;
import xsna.lfw0;
import xsna.lhw0;
import xsna.llx0;
import xsna.lnf;
import xsna.loj0;
import xsna.lrt;
import xsna.m0m0;
import xsna.m570;
import xsna.m7m;
import xsna.mdh0;
import xsna.mdw0;
import xsna.mlp;
import xsna.mnh0;
import xsna.msy;
import xsna.myc0;
import xsna.n0m0;
import xsna.n4x0;
import xsna.n7w0;
import xsna.nav;
import xsna.nfw0;
import xsna.nhw0;
import xsna.nlk;
import xsna.nmw0;
import xsna.o4;
import xsna.o4x0;
import xsna.o7j0;
import xsna.oft0;
import xsna.ofw0;
import xsna.ofy0;
import xsna.on00;
import xsna.os2;
import xsna.ou1;
import xsna.p4g;
import xsna.p4x0;
import xsna.p6e0;
import xsna.pi50;
import xsna.ps0;
import xsna.pvw0;
import xsna.q03;
import xsna.q6x;
import xsna.qat0;
import xsna.qbv;
import xsna.qcy;
import xsna.qit0;
import xsna.qjm0;
import xsna.qlk;
import xsna.qoy;
import xsna.qwi0;
import xsna.r03;
import xsna.r12;
import xsna.r4x0;
import xsna.r5x0;
import xsna.r7w0;
import xsna.rah0;
import xsna.rd9;
import xsna.rew0;
import xsna.rl3;
import xsna.rpk0;
import xsna.rpu;
import xsna.rq4;
import xsna.rq6;
import xsna.rsg0;
import xsna.rtg0;
import xsna.s12;
import xsna.s3q0;
import xsna.sgt0;
import xsna.sni;
import xsna.sq6;
import xsna.ssw;
import xsna.swe0;
import xsna.t03;
import xsna.t0f;
import xsna.t33;
import xsna.t4x0;
import xsna.t6m0;
import xsna.t9c0;
import xsna.tdj;
import xsna.tk40;
import xsna.tk90;
import xsna.tog;
import xsna.tqf0;
import xsna.tr;
import xsna.tsw;
import xsna.u0f;
import xsna.u2x0;
import xsna.u35;
import xsna.u4x0;
import xsna.u5u0;
import xsna.u94;
import xsna.ubt0;
import xsna.ug9;
import xsna.ulp;
import xsna.v0f;
import xsna.v2x0;
import xsna.v3x0;
import xsna.v5u0;
import xsna.vc9;
import xsna.ven;
import xsna.vg9;
import xsna.vqe0;
import xsna.vvr0;
import xsna.vxl0;
import xsna.vyq0;
import xsna.w0f;
import xsna.w2x0;
import xsna.w8i;
import xsna.w94;
import xsna.wa3;
import xsna.wb3;
import xsna.wc9;
import xsna.wd2;
import xsna.wgw0;
import xsna.whr0;
import xsna.wkl;
import xsna.wot;
import xsna.wql0;
import xsna.wqu;
import xsna.wrj;
import xsna.ws10;
import xsna.wv8;
import xsna.x19;
import xsna.x2x0;
import xsna.x3x0;
import xsna.x6t0;
import xsna.xab;
import xsna.xdf;
import xsna.xdw0;
import xsna.xhb0;
import xsna.xik;
import xsna.xul0;
import xsna.y45;
import xsna.y4x0;
import xsna.yd60;
import xsna.yfb;
import xsna.yoa0;
import xsna.ysg0;
import xsna.yt2;
import xsna.z4g;
import xsna.z58;
import xsna.zc9;
import xsna.zg9;
import xsna.zhy0;
import xsna.zlm0;
import xsna.zmw0;
import xsna.zqk0;
import xsna.zqu;
import xsna.zy60;

/* compiled from: VoipViewModel.kt */
/* loaded from: classes11.dex */
public final class c implements il90, tsw, g49, ah8, w8i, b.c {
    public static final Object A;
    public static final bpn0 A0;
    public static boolean B;
    public static final com.vk.voip.ui.sessionrooms.d B0;
    public static b39 C;
    public static final bpn0 C0;
    public static boolean D;
    public static final nfw0 D0;
    public static boolean E;
    public static final bpn0 E0;
    public static boolean F;
    public static final yoa0 F0;
    public static final p4x0 G;
    public static final bpn0 G0;
    public static boolean H;
    public static zmw0.b H0;
    public static final io.reactivex.rxjava3.subjects.d<CallsAudioDeviceInfo> I;
    public static long I0;
    public static boolean J;
    public static VoipViewModelState J0;
    public static volatile long K;
    public static VoipViewModelState K0;
    public static volatile UserId L;
    public static String L0;
    public static String M;
    public static CallMember.NetworkStatus M0;
    public static boolean N;
    public static final Handler N0;
    public static dhw0 O;
    public static xab O0;
    public static zqk0 P;
    public static wd2 P0;
    public static Set<? extends VoipCallOnStartAction> Q;
    public static final v3x0 Q0;
    public static boolean R;
    public static int R0;
    public static nav S;
    public static boolean S0;
    public static boolean T;
    public static volatile CallId T0;
    public static final io.reactivex.rxjava3.subjects.f<mlp> U;
    public static final bpn0 U0;
    public static ofy0 V;
    public static boolean V0;
    public static fw6 W;
    public static boolean W0;
    public static final lrt X;
    public static boolean X0;
    public static final u4x0 Y;
    public static VoipCallSource Y0;
    public static final bpn0 Z;
    public static boolean Z0;
    public static final bpn0 a0;
    public static boolean a1;
    public static final c b;
    public static final bpn0 b0;
    public static i9e0 b1;
    public static final bpn0 c;
    public static final z4g c0;
    public static boolean c1;
    public static Boolean d;
    public static VoipDataProvider d0;
    public static io.reactivex.rxjava3.disposables.c d1;
    public static final io.reactivex.rxjava3.disposables.b e;
    public static com.vk.voip.ui.actions.feature.c e0;
    public static io.reactivex.rxjava3.disposables.c e1;
    public static boolean f;
    public static ssw f0;
    public static io.reactivex.rxjava3.disposables.c f1;
    public static rah0 g;
    public static final io.reactivex.rxjava3.subjects.f<gy50> g0;
    public static io.reactivex.rxjava3.disposables.c g1;
    public static volatile nhw0 h;
    public static final bpn0 h0;
    public static io.reactivex.rxjava3.disposables.c h1;
    public static final dvw0 i;
    public static final bpn0 i0;
    public static io.reactivex.rxjava3.disposables.c i1;
    public static final kqt j;
    public static final bpn0 j0;
    public static final bpn0 j1;
    public static final bpn0 k;
    public static final i0 k0;
    public static final bpn0 k1;
    public static final bpn0 l;
    public static final ihu l0;
    public static final bpn0 m;
    public static final ven m0;
    public static final lfw0 n;
    public static final bpn0 n0;
    public static final kdw0<mdw0> o;
    public static final bpn0 o0;
    public static final u35 p;
    public static final iw6 p0;
    public static boolean q;
    public static final bpn0 q0;
    public static final OKVoipEngine r;
    public static v2x0 r0;
    public static UserId s;
    public static u2x0 s0;
    public static boolean t;
    public static final pi50 t0;
    public static final y4x0 u;
    public static final bpn0 u0;
    public static boolean v;
    public static final bpn0 v0;
    public static long w;
    public static final bpn0 w0;
    public static final io.reactivex.rxjava3.subjects.d<c8x0> x;
    public static final bpn0 x0;
    public static final io.reactivex.rxjava3.subjects.f<jy10> y;
    public static final bpn0 y0;
    public static final Object z;
    public static final bpn0 z0;

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final com.vk.voip.b a;
        public final boolean b;
        public final boolean c;

        public a(com.vk.voip.b bVar, boolean z, boolean z2) {
            this.a = bVar;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallConfigForStart(engine=");
            sb.append(this.a);
            sb.append(", forceRelay=");
            sb.append(this.b);
            sb.append(", dnsResolverEnabled=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipViewModelState.values().length];
            try {
                iArr[VoipViewModelState.InCall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipViewModelState.CallingPeer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipViewModelState.AboutToCallPeer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipViewModelState.ReceivingCallFromPeer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VoipViewModelState.Connecting.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VoipViewModelState.FinishedTransient.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VoipViewModelState.DeclinedTransient.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VoipViewModelState.RecordingAudioMessage.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* renamed from: com.vk.voip.ui.c$c, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class C2012c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public C2012c(Object obj) {
            super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final y a(boolean z, gzs gzsVar) {
            c.b.getClass();
            return c.J0(z, gzsVar);
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<a, s3q0> {
        public e(c cVar) {
            super(1, cVar, c.class, "onCreateCallConfigForStartSuccess", "onCreateCallConfigForStartSuccess(Lcom/vk/voip/ui/VoipViewModel$CallConfigForStart;)V", 0);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:5|(1:7)|8|(1:10)(1:62)|11|(1:13)|14|(1:16)|17|(1:19)(1:61)|20|(1:22)|23|(2:25|(3:36|37|38)(3:31|(1:33)(1:35)|34))|45|46|47|(2:49|34)(2:50|51)) */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01c6, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01ce, code lost:
        
            com.vk.log.L.f("OKVoipEngine", "error while executing doStartCall", r0);
            r0 = com.vk.voip.OKVoipEngine.v;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01d5, code lost:
        
            if (r0 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x01d7, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
        
            com.vk.voip.OKVoipEngine.o.getClass();
            r15 = xsna.g620.d(r0);
            r16 = r4.E();
            r17 = (com.vk.voip.dto.type.StartCallType) com.vk.voip.OKVoipEngine.C.b;
            r0 = com.vk.voip.OKVoipEngine.k;
            r7.e(new xsna.zmw0.a(r9, r0, -1, r15, r16, r17, null, new xsna.ic1(1, r0.d, xsna.h49.class, "onCallStartError", "onCallStartError(Lcom/vk/voip/dependencies/EngineCallErrorInfo;)V", 0, 7)));
            r0.d.b(r9, false, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01d9, code lost:
        
            r7 = r0;
         */
        /* JADX WARN: Type inference failed for: r7v4, types: [xsna.mo70] */
        /* JADX WARN: Type inference failed for: r8v8, types: [xsna.no70] */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(a aVar) {
            dhw0 dhw0Var;
            a aVar2 = aVar;
            c cVar = (c) this.receiver;
            c cVar2 = c.b;
            cVar.getClass();
            zqk0 zqk0Var = c.P;
            if (zqk0Var != null && c.K0 == VoipViewModelState.AboutToCallPeer) {
                c.q = true;
                if (c.N) {
                    c.b1(true, true);
                }
                d8j d8jVar = (d8j) c.a0.getValue();
                if (zqk0Var.m != null) {
                    d8jVar.b.c0();
                } else {
                    d8jVar.getClass();
                }
                OKVoipEngine oKVoipEngine = c.r;
                zqk0 a = zqk0.a(zqk0Var, null, c.N, 3670015);
                boolean z = aVar2.b;
                boolean z2 = aVar2.c;
                int g = swe0.g(Math.max(12, (((Math.max(iah0.f().widthPixels, iah0.f().heightPixels) / ListGroupCallView.r0) + 1) * 4) / 3), 6, 30);
                rah0 rah0Var = c.g;
                if (rah0Var == null) {
                    rah0Var = null;
                }
                final b.d dVar = new b.d(z, z2, g, rah0Var);
                oKVoipEngine.getClass();
                dhw0 a2 = ehw0.a(a);
                cnw0 cnw0Var = OKVoipEngine.v;
                if (cnw0Var == null) {
                    cnw0Var = null;
                }
                bnw0.b bVar = cnw0Var.c;
                L.A("OKVoipEngine", "startCall callInfo=" + (BuildInfo.m() ? dhw0.a(a2, "<HIDDEN>", 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -2, ApiInvocationException.ErrorCodes.IDS_BLOCKED).toString() : a2.toString()) + ", forceRelay=" + z + '}');
                final dhw0 a3 = ehw0.a(a);
                final boolean z3 = a.s;
                final boolean z4 = a.t;
                cnw0 cnw0Var2 = OKVoipEngine.v;
                if (cnw0Var2 == null) {
                    cnw0Var2 = null;
                }
                String m = cnw0Var2.m();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null) {
                    if (OKVoipEngine.B == null || (dhw0Var = OKVoipEngine.B) == null || a3.b != dhw0Var.b) {
                        conversation.hangup(new HangupParameters.Builder().setReason(HangupReason.BUSY).build());
                        try {
                            OKVoipEngine.b.P();
                        } catch (Throwable th) {
                            cnw0 cnw0Var3 = OKVoipEngine.v;
                            if (cnw0Var3 == null) {
                                cnw0Var3 = null;
                            }
                            cnw0Var3.q(th.getMessage(), th);
                        }
                    } else {
                        L.l("OKVoipEngine", "startCallImpl: new call matches current one, just accept it");
                        OKVoipEngine oKVoipEngine2 = OKVoipEngine.b;
                        oKVoipEngine2.getClass();
                        if (conversation.isPrepared()) {
                            f9t.h(conversation);
                            oKVoipEngine2.y().f(true);
                        } else {
                            L.l("OKVoipEngine", "acceptCall: an attempt to accept unprepared conversation");
                        }
                        c.p1();
                        c.V0();
                    }
                }
                OKVoipEngine.B = a3;
                if (!oKVoipEngine.w()) {
                    throw new OKVoipEngine.EngineNotInitializedException();
                }
                wrj wrjVar = OKVoipEngine.E;
                wrjVar.getClass();
                wrjVar.a.getAndSet(oKVoipEngine.v(new OKVoipEngine.c(a3, a, m, z3, z4, dVar.a, dVar.b, new OKVoipEngine.d(new Consumer() { // from class: xsna.mo70
                    @Override // ru.ok.android.webrtc.utils.Consumer
                    public final void accept(Object obj) {
                        Conversation conversation2;
                        CallMember a4;
                        Conversation conversation3 = (Conversation) obj;
                        ulp ulpVar = OKVoipEngine.k;
                        L.A("OKVoipEngine", "startCall: callPrepared, forceRelay = " + b.d.this + ".forceRelay");
                        OKVoipEngine oKVoipEngine3 = OKVoipEngine.b;
                        oKVoipEngine3.getClass();
                        wrj wrjVar2 = OKVoipEngine.E;
                        if (!epx.f(wrjVar2.getConversation(), conversation3)) {
                            StringBuilder sb = new StringBuilder("\n                                    startCall: callPrepared, conversation mismatch. Our current is ");
                            Conversation conversation4 = wrjVar2.getConversation();
                            sb.append(conversation4 != null ? conversation4.getConversationId() : null);
                            sb.append("\n                                    prepared by sdk is ");
                            sb.append(conversation3.getConversationId());
                            sb.append("\n                                    ");
                            L.l("OKVoipEngine", sb.toString());
                            conversation3.release();
                            return;
                        }
                        f9t.h(conversation3);
                        Serializer.c<CallId> cVar3 = CallId.CREATOR;
                        OKVoipEngine.F = CallId.a.a(conversation3.getConversationId());
                        oKVoipEngine3.y().f(true);
                        dhw0 dhw0Var2 = a3;
                        boolean c = dhw0Var2.c();
                        boolean z5 = z3;
                        if (c) {
                            ulpVar.d.u(oKVoipEngine3.E(), z5, z4);
                        } else {
                            ulpVar.d.p(oKVoipEngine3.E(), z5);
                        }
                        OkOwnCameraController okOwnCameraController = OKVoipEngine.y;
                        Application application = OKVoipEngine.w;
                        okOwnCameraController.a(application != null ? application : null);
                        if (dhw0Var2.D && dhw0Var2.h.isEmpty() && (conversation2 = wrjVar2.getConversation()) != null && (a4 = tk90.a(OKVoipEngine.H, conversation2.getMe())) != null) {
                            ulpVar.b.d(new il90.a(a4, Collections.singletonList(a4), OKVoipEngine.J(conversation2.getParticipants())));
                        }
                        oKVoipEngine3.O(conversation3);
                    }
                }, new Consumer() { // from class: xsna.no70
                    @Override // ru.ok.android.webrtc.utils.Consumer
                    public final void accept(Object obj) {
                        Throwable th2 = (Throwable) obj;
                        esj esjVar = OKVoipEngine.J;
                        OKVoipEngine oKVoipEngine3 = OKVoipEngine.b;
                        esjVar.a(new esj.a(th2, dhw0.this, oKVoipEngine3.E(), (StartCallType) OKVoipEngine.C.b, null));
                        oKVoipEngine3.P();
                    }
                }, new OKVoipEngine.b(oKVoipEngine.getVideoController())), dVar.c, dVar.d)));
                c.p1();
                c.V0();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public f(c cVar) {
            super(1, cVar, c.class, "onCreateCallConfigForStartError", "onCreateCallConfigForStartError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            c cVar = (c) this.receiver;
            c cVar2 = c.b;
            cVar.getClass();
            L.A("VoipViewModel", "doStartCall failed: " + th2);
            com.vk.metrics.eventtracking.b.a.a(th2);
            c.p.getClass();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            enj.q(R.string.voip_error_common, 0, context);
            L.A("VoipViewModel", "doStartCall declineOrHang");
            c.C(cVar, null, 0L, false, false, false, null, 207);
            return s3q0.a;
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<String, Boolean> {
        public g(GestureFeedback.a aVar) {
            super(1, aVar, GestureFeedback.a.class, "checkIfGestureFeedback", "checkIfGestureFeedback(Ljava/lang/String;)Z", 0);
        }

        @Override // xsna.izs
        public final Boolean invoke(String str) {
            String str2 = str;
            ((GestureFeedback.a) this.receiver).getClass();
            GestureFeedback[] values = GestureFeedback.values();
            int length = values.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (epx.f(values[i].h(), str2)) {
                    z = true;
                    break;
                }
                i++;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: VoipViewModel.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<Boolean> {
        public h(c cVar) {
            super(0, cVar, c.class, "shouldMuteMicFromPrefs", "shouldMuteMicFromPrefs()Z", 0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            c cVar = (c) this.receiver;
            c cVar2 = c.b;
            cVar.getClass();
            c.t0.getClass();
            f18 f18Var = pi50.c;
            boolean z = false;
            qcy<Object> qcyVar = pi50.b[0];
            if (f18Var.a().booleanValue() && cVar.s0()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class i implements izs {
        public static final i b = new i();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof fjw0);
        }
    }

    static {
        c cVar = new c();
        b = cVar;
        int i2 = 18;
        c = new bpn0(new ihg(i2));
        e = new io.reactivex.rxjava3.disposables.b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        i = new dvw0(context);
        j = new kqt(cVar);
        int i3 = 16;
        k = new bpn0(new wv8(i3));
        int i4 = 19;
        l = new bpn0(new r12(i4));
        int i5 = 12;
        m = new bpn0(new vg9(i5));
        int i6 = 17;
        int i7 = 21;
        n = new lfw0(new bpn0(new zg9(i6)), new b63(i7));
        o = ((VoipAnalyticsInternalComponent) ((k7m) m7m.f(cVar)).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df();
        int i8 = 20;
        u35 u35Var = new u35(i8);
        p = u35Var;
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        r = oKVoipEngine;
        u = new y4x0(new w0f(i2), new xdf(3));
        v = true;
        x = io.reactivex.rxjava3.subjects.d.N0();
        y = new io.reactivex.rxjava3.subjects.f<>();
        wa3 wa3Var = new wa3(i8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        z = msy.a(lazyThreadSafetyMode, wa3Var);
        A = msy.a(lazyThreadSafetyMode, new jnf(i6));
        C = new b39(0);
        E = true;
        G = new p4x0(cVar);
        I = io.reactivex.rxjava3.subjects.d.O0(CallsAudioDeviceInfo.Companion.getNONE());
        L = UserId.d;
        M = "";
        Q = EmptySet.b;
        U = new io.reactivex.rxjava3.subjects.f<>();
        lrt lrtVar = new lrt(new rd9());
        X = lrtVar;
        Y = new u4x0(oKVoipEngine, lrtVar, new cd3(i8));
        Z = new bpn0(new v0f(i6));
        a0 = new bpn0(new bb3(14));
        b0 = new bpn0(new ib3(i7));
        c0 = new z4g(8);
        g0 = new io.reactivex.rxjava3.subjects.f<>();
        h0 = new bpn0(new wb3(i5));
        i0 = new bpn0(new y45(i2));
        j0 = new bpn0(new b55(i6));
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.y4 y4Var = new hg1.y4(i.b);
        fVar.getClass();
        i0 i0Var = new i0(fVar, y4Var);
        k0 = i0Var;
        l0 = new ihu(oKVoipEngine, i0Var, new eu2(i2));
        m0 = new ven(oKVoipEngine.getVideoController(), i0Var);
        n0 = new bpn0(new q03(i4));
        o0 = new bpn0(new c24(24));
        p0 = new iw6(new q03(i2));
        q0 = new bpn0(new r03(i6));
        t0 = pi50.a;
        u0 = new bpn0(new d53(10));
        int i9 = 15;
        v0 = new bpn0(new t03(i9));
        w0 = new bpn0(new e53(i9));
        x0 = new bpn0(new rq6(i2));
        int i10 = 23;
        y0 = new bpn0(new sq6(i10));
        z0 = new bpn0(new c13(i7));
        A0 = new bpn0(new knf(i10));
        com.vk.voip.ui.sessionrooms.d dVar = new com.vk.voip.ui.sessionrooms.d(oKVoipEngine, cVar, u35Var, new lnf(i4), new s12(i2), new tog(i6));
        B0 = dVar;
        int i11 = 22;
        C0 = new bpn0(new j55(i11));
        D0 = new nfw0(new hew0(new k55(i2), new bpn0(new u94(i8))), new ofw0(new h260(2), new w94(26)), oKVoipEngine, new z58(i11), dVar);
        E0 = new bpn0(new a68(i4));
        F0 = new yoa0();
        G0 = new bpn0(new ug9(i8));
        H0 = new zmw0.b(false, false, false);
        VoipViewModelState voipViewModelState = VoipViewModelState.Idle;
        J0 = voipViewModelState;
        K0 = voipViewModelState;
        L0 = "";
        M0 = CallMember.NetworkStatus.GOOD;
        N0 = new Handler(Looper.getMainLooper());
        Q0 = new v3x0();
        T0 = CallId.e;
        U0 = new bpn0(new t0f(i4));
        Serializer.c<VoipCallSource> cVar2 = VoipCallSource.CREATOR;
        Y0 = VoipCallSource.a.a();
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        e1 = emptyDisposable;
        f1 = emptyDisposable;
        g1 = emptyDisposable;
        h1 = emptyDisposable;
        i1 = emptyDisposable;
        j1 = new bpn0(new ps0(i3));
        k1 = new bpn0(new u0f(i9));
        L.e("VoipViewModel", "init VoipViewModel");
    }

    public static void A(boolean z2) {
        ParticipantStatesManager participantStatesManager = r.getParticipantStatesManager();
        if (participantStatesManager != null) {
            kdw0<mdw0> kdw0Var = o;
            if (!z2 && participantStatesManager.isOwnHandRaised()) {
                kdw0Var.b(epw0.b.c.a);
            } else if (z2 && !participantStatesManager.isOwnHandRaised()) {
                kdw0Var.b(epw0.b.d.a);
            }
            participantStatesManager.setOwnHandRaised(z2);
        }
    }

    public static void C(c cVar, String str, long j2, boolean z2, boolean z3, boolean z4, CallId callId, int i2) {
        zqk0 zqk0Var;
        da9 c2;
        zqk0 zqk0Var2;
        da9 c3;
        String str2 = (i2 & 1) != 0 ? "" : str;
        long j3 = (i2 & 2) != 0 ? 1500L : j2;
        int i3 = 0;
        boolean z5 = (i2 & 4) == 0;
        boolean z6 = (i2 & 8) != 0 ? false : z2;
        boolean z7 = (i2 & 16) != 0 ? false : z3;
        boolean z8 = (i2 & 32) != 0 ? false : z4;
        boolean z9 = (i2 & 64) == 0;
        CallId callId2 = (i2 & 128) != 0 ? T0 : callId;
        cVar.getClass();
        bpn0 bpn0Var = i0q0.a;
        StringBuilder c4 = gp.c("declineOrHang manualResetOfTransientState=", " finishCallForAll", " isDecline=", z5, z6);
        gsi0.c(c4, z7, " fromUser=", z8, " ignoreCallback=");
        c4.append(z9);
        L.A("VoipViewModel", c4.toString());
        i.a();
        if (K0 != VoipViewModelState.Idle) {
            VoipViewModelState voipViewModelState = K0;
            VoipViewModelState voipViewModelState2 = VoipViewModelState.FinishedTransient;
            if (voipViewModelState != voipViewModelState2 && K0 != VoipViewModelState.DeclinedTransient) {
                pvw0 j02 = j0();
                VoipAnalyticsEventScreen a2 = VoipAnalyticsEventScreen.a(str2);
                if (!VoipAnalyticsEventScreen.b(a2.e())) {
                    a2 = null;
                }
                String e2 = a2 != null ? a2.e() : null;
                if (e2 == null) {
                    e2 = null;
                }
                boolean z10 = z9;
                j02.K(e2, new e49.b(false, K, cVar.s0(), cVar.a0(), sni.n(callId2, new x3x0(T0, i3)), z8, z7));
                if (z6) {
                    L.A("VoipViewModel", "makeForceCallFinishRequest");
                    CallId callId3 = T0;
                    if (!callId3.c) {
                        new n1(rsg0.y0(new ip4(callId3.b, 2), null, null, 3).F(new hdi0(new o7j0(20), 10)), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
                    }
                    if (!z10 && (zqk0Var2 = P) != null && (c3 = zqk0Var2.c()) != null) {
                        c3.b();
                    }
                } else if (!z10 && (zqk0Var = P) != null && (c2 = zqk0Var.c()) != null) {
                    c2.f();
                }
                F = true;
                OKVoipEngine oKVoipEngine = r;
                String.valueOf(K);
                oKVoipEngine.i(false, z6);
                cVar.f1(voipViewModelState2);
                if (!z5) {
                    n0(j3);
                }
                x.onNext(c8x0.a.a);
                return;
            }
        }
        L.G("VoipViewModel", "declineOrHang during state = " + K0 + ", ignoring declineOrHang");
    }

    public static void C0(c cVar, gvw0 gvw0Var) {
        cVar.getClass();
        if (!O() || v || gvw0Var.e()) {
            return;
        }
        gvw0Var.i(new vxl0(11), new ifv0(3));
    }

    public static void D0() {
        ysg0.b.a(new h3x0());
    }

    public static void E(boolean z2) {
        ConversationFeatureManager g2 = r.g();
        if (g2 == null) {
            return;
        }
        if (z2) {
            ConversationFeatureManager.enableFeatureForAll$default(g2, CallFeature.RECORD, null, null, 6, null);
        } else {
            ConversationFeatureManager.enableFeatureForRoles$default(g2, CallFeature.RECORD, rl3.y0(new CallParticipant.Role[]{CallParticipant.Role.CREATOR, CallParticipant.Role.ADMIN}), null, null, 12, null);
        }
    }

    public static y E0() {
        q o02 = I.o0(new v(new qbv(b, 2)));
        t9c0 t9c0Var = new t9c0(12, new k4x0(0));
        o02.getClass();
        return new y(new p1(o02, t9c0Var), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static AccessibilityEvents F() {
        return (AccessibilityEvents) h0.getValue();
    }

    public static j1 F0() {
        return E0().U(new xhb0(new e4x0(0), 19));
    }

    public static o4x0 G() {
        return (o4x0) Z.getValue();
    }

    public static y G0(boolean z2) {
        q U2 = ysg0.b.a.b0(h3x0.class).U(new gs00(new r7w0(2), 23));
        if (z2) {
            U2 = U2.o0(new v(new Callable() { // from class: xsna.h4x0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new it80(com.vk.voip.ui.c.O);
                }
            }));
        }
        U2.getClass();
        return new y(U2, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static com.vk.voip.ui.a H() {
        if (epx.f(r, OKVoipEngine.b)) {
            return com.vk.voip.ui.a.a;
        }
        throw new IllegalStateException();
    }

    public static y H0(boolean z2) {
        q U2 = ysg0.b.a.b0(fjw0.class).U(new a4x0(new m0m0(12), 0));
        if (z2) {
            U2 = U2.o0(new v(new Callable() { // from class: xsna.b4x0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return com.vk.voip.ui.c.K0;
                }
            }));
        }
        U2.getClass();
        return new y(U2, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static r4x0 I() {
        return (r4x0) C0.getValue();
    }

    public static /* synthetic */ y I0(c cVar) {
        cVar.getClass();
        return H0(false);
    }

    public static rew0 J() {
        return (rew0) n0.getValue();
    }

    public static y J0(boolean z2, gzs gzsVar) {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        x6t0 x6t0Var = new x6t0(4);
        fVar.getClass();
        q U2 = new i0(fVar, x6t0Var).U(new bx80(gzsVar, 17));
        if (z2) {
            U2 = U2.o0(new v(new os2(gzsVar, 5)));
        }
        U2.getClass();
        return new y(U2, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static String K() {
        if (b.$EnumSwitchMapping$0[K0.ordinal()] != 1) {
            return "";
        }
        String m2 = f870.m(R0);
        if (fkq0.c(L)) {
            return tdj.a(new StringBuilder(), epx.f(M, "") ? String.valueOf(L.b) : M, " • ", m2);
        }
        return m2;
    }

    public static y K0() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        fyp0 fyp0Var = new fyp0(5);
        fVar.getClass();
        q o02 = new i0(fVar, fyp0Var).U(new oft0(2)).o0(new v(new Callable() { // from class: xsna.j4x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.K0 == VoipViewModelState.InCall && cVar.s0());
            }
        }));
        o02.getClass();
        return new y(o02, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static y L0() {
        q o02 = new io.reactivex.rxjava3.internal.operators.observable.q(new xul0(8)).o0(new v(new Callable() { // from class: xsna.s3x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.vk.voip.ui.c.b.getClass();
                ParticipantStatesManager participantStatesManager = com.vk.voip.ui.c.r.getParticipantStatesManager();
                return Boolean.valueOf(participantStatesManager != null ? participantStatesManager.isOwnHandRaised() : false);
            }
        }));
        o02.getClass();
        return new y(o02, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static y M0() {
        return J0(true, new tqf0(15));
    }

    public static zc9 N() {
        return (zc9) o0.getValue();
    }

    public static boolean O() {
        return K0 == VoipViewModelState.InCall || K0 == VoipViewModelState.Connecting || K0 == VoipViewModelState.CallingPeer || K0 == VoipViewModelState.ReceivingCallFromPeer || K0 == VoipViewModelState.WaitingRoom;
    }

    public static void P0() {
        String b2;
        Set<CallMemberId> q2;
        dhw0 dhw0Var = O;
        if (dhw0Var != null && (q2 = dhw0Var.q()) != null && (!q2.isEmpty())) {
            N().b().b();
        }
        y4x0 y4x0Var = u;
        y4x0Var.getClass();
        L.e("VVMOpponentAvatarDelegate", "Peer avatar update requested by call info update");
        dhw0 dhw0Var2 = O;
        if (dhw0Var2 == null) {
            y4x0Var.c(y4x0.a.b.a);
            return;
        }
        Long valueOf = dhw0Var2 != null ? Long.valueOf(dhw0Var2.g()) : null;
        if (valueOf != null && com.vk.dto.common.b.a(valueOf.longValue())) {
            y4x0Var.c(new y4x0.a.C4076a(valueOf.longValue()));
            return;
        }
        b2 = dhw0Var2.d().b(0);
        if (b2 == null) {
            b2 = "";
        }
        if (b2.length() != 0) {
            y4x0Var.c(new y4x0.a.c(b2));
        } else {
            L.e("VVMOpponentAvatarDelegate", "Call info avatar data is empty, reset icon");
            y4x0Var.c(y4x0.a.b.a);
        }
    }

    public static CallEffectsDependency Q() {
        v2x0 v2x0Var = r0;
        if (v2x0Var == null) {
            v2x0Var = null;
        }
        return v2x0Var.a().a();
    }

    public static void Q0(CallMemberId callMemberId) {
        if (p0()) {
            r.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                conversation.pinParticipant(mnh0.H(callMemberId), true);
            }
            j0().i();
        }
    }

    public static i3x0 R() {
        r.getClass();
        cnw0 cnw0Var = OKVoipEngine.v;
        if (cnw0Var == null) {
            cnw0Var = null;
        }
        return cnw0Var.l();
    }

    public static l570 S() {
        v2x0 v2x0Var = r0;
        if (v2x0Var == null) {
            v2x0Var = null;
        }
        return v2x0Var.a().b();
    }

    public static void S0(gy50 gy50Var) {
        g0.onNext(gy50Var);
    }

    public static fq4 T() {
        v2x0 v2x0Var = r0;
        if (v2x0Var == null) {
            v2x0Var = null;
        }
        return v2x0Var.d();
    }

    public static w2x0 U() {
        x2x0 x2x0Var = (x2x0) u0.getValue();
        zqk0 zqk0Var = P;
        return x2x0Var.a(new x2x0.a((zqk0Var != null ? zqk0Var.h() : null) != null));
    }

    public static nmw0 V() {
        return (nmw0) c.getValue();
    }

    public static void V0() {
        ofy0 ofy0Var = V;
        if (ofy0Var == null) {
            return;
        }
        e.b(ofy0Var.h().m(asu0.a.d()).subscribe(new v5u0(new zlm0(16), 4), new tk40(new ou1(L.a, 13), 29)));
    }

    public static t4x0 W() {
        return (t4x0) b0.getValue();
    }

    public static void W0(CallId callId) {
        T0 = callId;
        if (callId.d) {
            L.p("callId aka callId " + T0 + " in " + (w0() ? "OK" : "ICQ") + " call");
        }
    }

    public static x X() {
        String Ab;
        CallMemberId Y2 = Y();
        if (Y2 == null || (Ab = Y2.Ab()) == null) {
            return tr.b(it80.b);
        }
        v vVar = new v(new wkl(Ab, 2));
        asu0.a.getClass();
        return vVar.q(asu0.r());
    }

    public static CallMemberId Y() {
        dhw0 dhw0Var = O;
        if (dhw0Var == null) {
            return null;
        }
        if (dhw0Var != null && dhw0Var.v()) {
            return new CallMemberId(String.valueOf(dhw0Var.o().b), 0);
        }
        OKVoipEngine oKVoipEngine = r;
        oKVoipEngine.getClass();
        if (!OKVoipEngine.x().e()) {
            return new CallMemberId(String.valueOf(J().f().b), 0);
        }
        oKVoipEngine.getClass();
        return new CallMemberId(OKVoipEngine.x().a().b(), 0);
    }

    public static void Y0(boolean z2) {
        R = z2;
        com.vk.voip.ui.a H2 = H();
        VoipViewModelState voipViewModelState = K0;
        H2.h(voipViewModelState, voipViewModelState, z2);
    }

    public static wot Z() {
        return (wot) y0.getValue();
    }

    public static void Z0(boolean z2) {
        if (H != z2) {
            H = z2;
            ysg0.b.a(new jrw0(H));
        }
    }

    public static void a1(boolean z2) {
        if (B != z2) {
            i0().j(z2);
            B = z2;
            w = System.currentTimeMillis();
            r.y().b(B);
            if (!w0()) {
                p1();
            }
            if (B) {
                H().a();
                N().b().b();
            }
            if (!B) {
                h0().b(null, null);
                ysg0.b.a(new q6x());
            }
            D0();
        }
    }

    public static fsw0 b0() {
        return (fsw0) j1.getValue();
    }

    public static void b1(boolean z2, boolean z3) {
        L.A("VoipViewModel", zy60.c("setOwnCameraOnOff on=", " bypassLoudspeakerChange=", z2, z3));
        a1 = z3;
        a1(z2);
        a1 = false;
    }

    public static void c1() {
        VoipAudioManager.LoudspeakerMode loudspeakerMode;
        zqk0 zqk0Var = P;
        if ((zqk0Var != null ? zqk0Var.h() : null) != null) {
            loudspeakerMode = VoipAudioManager.LoudspeakerMode.ALWAYS;
        } else {
            dhw0 dhw0Var = O;
            loudspeakerMode = (dhw0Var == null || !dhw0Var.s()) ? VoipAudioManager.LoudspeakerMode.DEFAULT : VoipAudioManager.LoudspeakerMode.ON_START;
        }
        H().i(loudspeakerMode);
    }

    public static String d0() {
        VoipChatInfo e2;
        dhw0 dhw0Var = O;
        String title = (dhw0Var == null || (e2 = dhw0Var.e()) == null) ? null : e2.getTitle();
        String h2 = dhw0Var != null ? dhw0Var.h() : null;
        return (title == null || drm0.N(title)) ? (h2 == null || drm0.N(h2)) ? "…" : h2 : title;
    }

    public static void d1(boolean z2) {
        if (E != z2) {
            E = z2;
            L.A("VoipViewModel", zhy0.a("isRemoteMicOn=", z2));
            D0();
        }
    }

    public static void e1(zmw0.b bVar) {
        zmw0.b bVar2 = H0;
        boolean z2 = false;
        boolean z3 = bVar2.a && !bVar2.b;
        if (epx.f(bVar2, bVar)) {
            return;
        }
        H0 = bVar;
        if (bVar.a && !bVar.b) {
            z2 = true;
        }
        if (!z3 && z2 && !z0() && (K0 != VoipViewModelState.InCall || !N)) {
            OKVoipEngine oKVoipEngine = r;
            String.valueOf(K);
            CallId callId = T0;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null) {
                L.A("OKVoipEngine", "Trying decline video request while conversation is null");
            } else {
                ConversationParticipant opponent = conversation.getOpponent();
                if (opponent == null) {
                    L.A("OKVoipEngine", "Trying decline video request while opponent is null");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "vk");
                    jSONObject.put("subtype", "vk_decline_video_request");
                    jSONObject.put("user_id", conversation.getMe().getExternalId().id);
                    jSONObject.put(FailedBinderCallBack.CALLER_ID, callId.b);
                    conversation.sendData(opponent, jSONObject);
                }
            }
        }
        D0();
    }

    public static l5x0 h0() {
        return (l5x0) A0.getValue();
    }

    public static r5x0 i0() {
        return (r5x0) z0.getValue();
    }

    public static void i1(c cVar, zqk0 zqk0Var, VoipCallSource voipCallSource) {
        cVar.g1(zqk0Var, voipCallSource, null, "", EmptySet.b);
    }

    public static pvw0 j0() {
        return (pvw0) m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static kcx0 k0() {
        return (kcx0) A.getValue();
    }

    public static void k1(c cVar) {
        cVar.getClass();
        L.A("VoipViewModel", "swapCamera");
        r.y().a();
    }

    public static icx0 l0() {
        return k0().b();
    }

    public static void l1() {
        L.A("VoipViewModel", "toggleSpeaker");
        if (O()) {
            L.A("VoipViewModel", "toggleSpeaker executed");
            Z0(!H);
            H().c(H);
        }
    }

    public static llx0 m0() {
        return (llx0) E0.getValue();
    }

    public static void m1() {
        m1 y02;
        long j2 = K;
        if (j2 == 0 || com.vk.dto.common.b.a(j2)) {
            return;
        }
        y4x0 y4x0Var = u;
        y4x0Var.getClass();
        dhw0 dhw0Var = O;
        Long valueOf = dhw0Var != null ? Long.valueOf(dhw0Var.g()) : null;
        if (valueOf != null && !com.vk.dto.common.b.a(valueOf.longValue()) && y4x0Var.b() == null) {
            y4x0Var.b.dispose();
            m1 y03 = rsg0.y0(new jow0(valueOf.longValue()), null, null, 3);
            d8u0 d8u0Var = new d8u0(new ab(26, y4x0Var, valueOf), 6);
            final n7w0 n7w0Var = new n7w0(2);
            y4x0Var.b = y03.subscribe(d8u0Var, new io.reactivex.rxjava3.functions.f(n7w0Var) { // from class: xsna.x4x0
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj) {
                    s3q0 s3q0Var = s3q0.a;
                }
            });
        }
        if (fkq0.b(L)) {
            h1.dispose();
            ComFeatures comFeatures = ComFeatures.COM_GROUPS_GETBYID_CODEGEN;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                fz2 y2 = yfb.y(wqu.a.b(new zqu(), Collections.singletonList(fkq0.a(L)), e43.l(GroupsFieldsDto.MEMBERS_COUNT, GroupsFieldsDto.IS_CLOSED, GroupsFieldsDto.START_DATE, GroupsFieldsDto.CAN_MESSAGE, GroupsFieldsDto.IS_MESSAGES_BLOCKED, GroupsFieldsDto.MEMBER_STATUS, GroupsFieldsDto.BAN_INFO, GroupsFieldsDto.IS_MARKET_CART_ENABLED, GroupsFieldsDto.ENABLED_FEATURES), null, 4), new n0m0(18));
                ahn.D(y2);
                y02 = rsg0.y0(y2, null, null, 3);
            } else {
                y02 = rsg0.y0(new rpu(fkq0.e(L)), null, null, 3);
            }
            io.reactivex.rxjava3.disposables.c subscribe = y02.subscribe(new hrt0(new p6e0(29), 7), new iq60(new u5u0(4), 4));
            e.b(subscribe);
            h1 = subscribe;
        }
    }

    public static void n0(long j2) {
        N0.postDelayed(new Runnable() { // from class: xsna.c4x0
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                if (com.vk.voip.ui.c.u0()) {
                    cVar.f1(VoipViewModelState.Idle);
                    com.vk.voip.ui.c.Z0(false);
                    com.vk.voip.ui.c.I.onNext(CallsAudioDeviceInfo.Companion.getNONE());
                }
            }
        }, j2);
    }

    public static void n1(CallMemberId callMemberId) {
        if (p0()) {
            r.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                conversation.pinParticipant(mnh0.H(callMemberId), false);
            }
            j0().P();
        }
    }

    public static boolean o0() {
        Set<CallMemberId> k2;
        if (Z0) {
            return true;
        }
        dhw0 dhw0Var = O;
        return (dhw0Var == null || (k2 = dhw0Var.k()) == null || k2.size() != 2) ? false : true;
    }

    public static boolean p0() {
        return K0 == VoipViewModelState.AboutToCallPeer || K0 == VoipViewModelState.CallingPeer || K0 == VoipViewModelState.Connecting || K0 == VoipViewModelState.InCall || K0 == VoipViewModelState.WaitingRoom;
    }

    public static void p1() {
        if (z0()) {
            com.vk.voip.ui.a.a.getClass();
            if (!com.vk.voip.ui.a.e() && !H && !a1) {
                H().c(true);
                Z0(true);
                return;
            }
        }
        com.vk.voip.ui.a.a.getClass();
        if (com.vk.voip.ui.a.e()) {
            Z0(false);
        }
    }

    public static boolean q0() {
        dhw0 dhw0Var = O;
        return dhw0Var != null && dhw0Var.r();
    }

    public static boolean r0() {
        dhw0 dhw0Var = O;
        return (dhw0Var == null || dhw0Var.r()) ? false : true;
    }

    public static void s1(gvw0 gvw0Var, gzs gzsVar) {
        if (O() && !z0() && !gvw0Var.e()) {
            gvw0Var.g(new loj0(1, gzsVar), new xik(2, gzsVar));
        } else if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public static boolean t0() {
        return K0 == VoipViewModelState.RecordingAudioMessage;
    }

    public static boolean u0() {
        return v0() || t0();
    }

    public static boolean v0() {
        return K0 == VoipViewModelState.FinishedTransient || K0 == VoipViewModelState.DeclinedTransient;
    }

    public static boolean w0() {
        return r == OKVoipEngine.b;
    }

    public static void y(CallMember callMember) {
        v = callMember.c();
        a1(callMember.f());
        D = callMember.d();
        D0();
    }

    public static void z(final VoipViewModelState voipViewModelState, final List list, final dhw0 dhw0Var, final nhw0.a aVar) {
        v vVar = new v(new Callable() { // from class: xsna.d4x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhw0 dhw0Var2 = dhw0Var;
                VoipViewModelState voipViewModelState2 = voipViewModelState;
                nhw0.a aVar2 = aVar;
                List list2 = list;
                com.vk.voip.ui.c.b.getClass();
                if (list2 != null) {
                    it80.a aVar3 = it80.b;
                    nhw0 nhw0Var = com.vk.voip.ui.c.h;
                    r4 = nhw0Var != null ? nhw0Var.a(voipViewModelState2, list2, dhw0Var2, aVar2) : null;
                    aVar3.getClass();
                    return new it80(r4);
                }
                it80.a aVar4 = it80.b;
                nhw0 nhw0Var2 = com.vk.voip.ui.c.h;
                if (nhw0Var2 != null && voipViewModelState2 != nhw0Var2.b) {
                    r4 = nhw0Var2.a(voipViewModelState2, nhw0Var2.a, dhw0Var2, aVar2);
                }
                aVar4.getClass();
                return new it80(r4);
            }
        });
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        e.b(io.reactivex.rxjava3.kotlin.c.e(vVar.q(asu0.w()).m(asu0Var.d()), new C2012c(L.a), new n0m0(19)));
    }

    public static boolean z0() {
        return B && !u0();
    }

    public final void A0() {
        L.A("VoipViewModel", "micOff");
        if (O() && v) {
            L.A("VoipViewModel", "micOff executed");
            v = false;
            r.getClass();
            OKVoipEngine.S(new jo70(false));
            D0();
            j0().Q(s0());
        }
    }

    public final void B(boolean z2) {
        L.e("VoipViewModel", "continueAfterPermissionRequest");
        V0 = false;
        if (!((gvw0) U0.getValue()).d()) {
            if (K0 == VoipViewModelState.AboutToCallPeer) {
                f1(VoipViewModelState.Idle);
            }
            if (K0 == VoipViewModelState.ReceivingCallFromPeer) {
                C(this, null, 0L, false, false, true, null, 207);
                return;
            }
            return;
        }
        if (K0 == VoipViewModelState.AboutToCallPeer) {
            D();
        }
        if (K0 == VoipViewModelState.ReceivingCallFromPeer && !z2 && J) {
            n(N);
        }
    }

    public final void B0() {
        L.A("VoipViewModel", "micOn");
        if (!O() || v) {
            return;
        }
        OKVoipEngine oKVoipEngine = r;
        MediaOptionState audioState = oKVoipEngine.getMediaOptionsForCurrentUser().getAudioState();
        boolean z2 = true;
        boolean z3 = audioState != MediaOptionState.MUTED_PERMANENT;
        boolean z4 = audioState == MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE;
        PermissionHelper permissionHelper = PermissionHelper.a;
        p.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String[] strArr = PermissionHelper.m;
        permissionHelper.getClass();
        if (PermissionHelper.b(context, strArr)) {
            if (z3 || z4) {
                L.A("VoipViewModel", "micOn executed");
                v = true;
                oKVoipEngine.getClass();
                OKVoipEngine.S(new jo70(z2));
                D0();
                j0().b0(s0());
            }
        }
    }

    public final void D() {
        L.A("VoipViewModel", "doStartCall getting engine pref from server");
        zqk0 zqk0Var = P;
        if (zqk0Var == null) {
            return;
        }
        g1.dispose();
        io.reactivex.rxjava3.internal.operators.single.b S2 = x19.S(new sgt0(zqk0Var, 10));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c e2 = io.reactivex.rxjava3.kotlin.c.e(S2.q(asu0.r()).m(asu0Var.d()), new f(this), new e(this));
        e.b(e2);
        g1 = e2;
    }

    public final synchronized dhw0 L() {
        return O;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String M() {
        switch (b.$EnumSwitchMapping$0[K0.ordinal()]) {
            case 2:
            case 3:
                if (fkq0.c(L)) {
                    p.getClass();
                    Context context = e43.a;
                    return (context != null ? context : null).getString(R.string.voip_call_status_calling_on_behalf, epx.f(M, "") ? String.valueOf(L.b) : M);
                }
                if (!r.H()) {
                    if (R) {
                        p.getClass();
                        Context context2 = e43.a;
                        return (context2 != null ? context2 : null).getString(R.string.voip_call_status_calling);
                    }
                    p.getClass();
                    Context context3 = e43.a;
                    return (context3 != null ? context3 : null).getString(R.string.voip_call_status_connecting);
                }
                return "";
            case 4:
                if (W().a()) {
                    p.getClass();
                    Context context4 = e43.a;
                    return (context4 != null ? context4 : null).getString(R.string.voip_incoming_call_to_contact);
                }
                if (N) {
                    p.getClass();
                    Context context5 = e43.a;
                    return (context5 != null ? context5 : null).getString(R.string.voip_incoming_video_call);
                }
                p.getClass();
                Context context6 = e43.a;
                return (context6 != null ? context6 : null).getString(R.string.voip_incoming_audio_call);
            case 5:
                if (S0 || R0 != 0) {
                    p.getClass();
                    Context context7 = e43.a;
                    return (context7 != null ? context7 : null).getString(R.string.voip_call_connecting);
                }
                p.getClass();
                Context context8 = e43.a;
                return (context8 != null ? context8 : null).getString(R.string.voip_call_status_calling);
            case 6:
                p.getClass();
                Context context9 = e43.a;
                return (context9 != null ? context9 : null).getString(R.string.voip_call_finished);
            case 7:
                if (W0) {
                    p.getClass();
                    Context context10 = e43.a;
                    return (context10 != null ? context10 : null).getString(R.string.voip_call_busy);
                }
                p.getClass();
                Context context11 = e43.a;
                return (context11 != null ? context11 : null).getString(R.string.voip_call_declined);
            case 8:
                rq4.a.getClass();
                if (rq4.e()) {
                    StringBuilder sb = new StringBuilder();
                    p.getClass();
                    Context context12 = e43.a;
                    sb.append((context12 != null ? context12 : null).getString(R.string.voip_call_audio_message_recording));
                    sb.append(' ');
                    sb.append(rq4.f());
                    return sb.toString();
                }
                if (rq4.d()) {
                    p.getClass();
                    Context context13 = e43.a;
                    return (context13 != null ? context13 : null).getString(R.string.voip_call_audio_message_recording_completed);
                }
                p.getClass();
                Context context14 = e43.a;
                return (context14 != null ? context14 : null).getString(R.string.voip_call_declined);
            default:
                return "";
        }
    }

    public final void N0(CallId callId, boolean z2, gzs<Boolean> gzsVar) {
        boolean w02 = w0();
        dvw0 dvw0Var = i;
        dvw0Var.b = z2;
        dvw0Var.c = w02;
        if (w02) {
            dvw0Var.d = false;
            dvw0Var.a.a();
        }
        W0(callId);
        d = null;
        if (gzsVar.invoke().booleanValue()) {
            A0();
        }
        D0();
        p1();
        VoipViewModelState voipViewModelState = K0;
        VoipViewModelState voipViewModelState2 = VoipViewModelState.CallingPeer;
        OKVoipEngine oKVoipEngine = r;
        if (voipViewModelState == voipViewModelState2 && oKVoipEngine.H() && s0()) {
            com.vk.voip.ui.a H2 = H();
            VoipViewModelState voipViewModelState3 = K0;
            H2.h(voipViewModelState3, voipViewModelState3, R);
        }
        Set<? extends VoipCallOnStartAction> set = Q;
        Q = EmptySet.b;
        for (VoipCallOnStartAction voipCallOnStartAction : set) {
            if (!(voipCallOnStartAction instanceof VoipCallOnStartAction.g)) {
                boolean z3 = voipCallOnStartAction instanceof VoipCallOnStartAction.a;
                int i2 = 1;
                c cVar = b;
                if (z3) {
                    cVar.getClass();
                    io.reactivex.rxjava3.disposables.c cVar2 = d1;
                    if (cVar2 != null) {
                        cVar2.dispose();
                    }
                    v vVar = new v(new yd60(i2));
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    d1 = hg1.i(vVar.q(asu0.p()).m(asu0Var.d()), new zlm0(15));
                } else if (voipCallOnStartAction instanceof VoipCallOnStartAction.f) {
                    boolean a2 = ((VoipCallOnStartAction.f) voipCallOnStartAction).a();
                    cVar.getClass();
                    oKVoipEngine.getClass();
                    Conversation conversation = OKVoipEngine.E.getConversation();
                    if (conversation != null) {
                        conversation.setWaitingRoomEnabled(a2);
                    }
                    if (a2) {
                        j0().k();
                    } else {
                        j0().l();
                    }
                } else if (voipCallOnStartAction instanceof VoipCallOnStartAction.b) {
                    boolean a3 = ((VoipCallOnStartAction.b) voipCallOnStartAction).a();
                    cVar.getClass();
                    boolean z4 = !a3;
                    OKVoipEngine.b.getClass();
                    Conversation conversation2 = OKVoipEngine.E.getConversation();
                    if (conversation2 != null) {
                        conversation2.setAnonJoinForbidden(z4);
                    }
                } else if (voipCallOnStartAction instanceof VoipCallOnStartAction.c) {
                    Y.b(((VoipCallOnStartAction.c) voipCallOnStartAction).a());
                } else if (voipCallOnStartAction instanceof VoipCallOnStartAction.e) {
                    ((VoipCallOnStartAction.e) voipCallOnStartAction).getClass();
                    cVar.getClass();
                    b0().f(on00.f(new Pair(MediaOption.SCREEN_SHARING, MediaOptionState.MUTED_PERMANENT)));
                } else if (voipCallOnStartAction instanceof VoipCallOnStartAction.d) {
                    ((VoipCallOnStartAction.d) voipCallOnStartAction).getClass();
                    cVar.getClass();
                    E(false);
                } else {
                    if (!(voipCallOnStartAction instanceof VoipCallOnStartAction.SetupMediaOptions)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VoipCallOnStartAction.SetupMediaOptions setupMediaOptions = (VoipCallOnStartAction.SetupMediaOptions) voipCallOnStartAction;
                    fsw0.a aVar = new fsw0.a(ws10.a(setupMediaOptions.a()), ws10.a(setupMediaOptions.b()));
                    cVar.getClass();
                    b0().c(aVar);
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void O0(List<CallMember> list) {
        Object obj;
        List<CallMember> list2;
        boolean z2;
        V().d();
        if (K0 != VoipViewModelState.InCall && s0() && (!((z2 = (list2 = list) instanceof Collection)) || !list2.isEmpty())) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CallMember callMember = (CallMember) it.next();
                if (callMember.e() && callMember.b()) {
                    if (r.H()) {
                        VoipViewModelState voipViewModelState = K0;
                        voipViewModelState.getClass();
                        if (voipViewModelState != VoipViewModelState.AboutToCallPeer && voipViewModelState != VoipViewModelState.WaitingRoom) {
                            f1(VoipViewModelState.CallingPeer);
                            D0();
                        }
                    }
                    if (!z2 || !list2.isEmpty()) {
                        Iterator<T> it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            CallMember callMember2 = (CallMember) it2.next();
                            if (!callMember2.e() && callMember2.b()) {
                                f1(VoipViewModelState.InCall);
                                D0();
                                break;
                            }
                        }
                    }
                }
            }
        }
        VoipViewModelState voipViewModelState2 = K0;
        VoipViewModelState voipViewModelState3 = VoipViewModelState.InCall;
        if (voipViewModelState2 == voipViewModelState3 && s0() && r.H()) {
            f1(VoipViewModelState.CallingPeer);
            D0();
        }
        if (K0 == voipViewModelState3) {
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it3.next();
                    if (epx.f(((CallMember) obj).a(), b.c0())) {
                        break;
                    }
                }
            }
            CallMember callMember3 = (CallMember) obj;
            t = callMember3 != null ? callMember3.d() : false;
        }
        OKVoipEngine oKVoipEngine = r;
        if (oKVoipEngine.H()) {
            Y0(false);
        }
        if (h == null) {
            return;
        }
        CallMemberId a2 = oKVoipEngine.a();
        OKVoipEngine.b.getClass();
        ConversationParticipant C2 = OKVoipEngine.C();
        ParticipantId externalId = C2 != null ? C2.getExternalId() : null;
        n4x0 n4x0Var = new n4x0(K0, list, O, new nhw0.a(a2, externalId != null ? mnh0.E(externalId) : null));
        z(n4x0Var.d(), n4x0Var.c(), n4x0Var.b(), n4x0Var.a());
    }

    public final bfw0 P() {
        return ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).getConfiguration().b();
    }

    public final void R0(CallMemberId callMemberId) {
        if (p0()) {
            dhw0 dhw0Var = O;
            if ((dhw0Var != null ? dhw0Var.m() : null) == null) {
                dhw0 dhw0Var2 = O;
                X0(dhw0Var2 != null ? dhw0.a(dhw0Var2, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, callMemberId, null, null, null, false, false, 0, null, false, false, false, false, null, null, -16777217, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null);
                D0();
            }
        }
    }

    public final void T0(Collection<Pair<CallMemberId, Boolean>> collection) {
        Conversation conversation;
        ConversationParticipant conversationParticipant;
        CallMember a2;
        L.A("VoipViewModel", "removeParticipants " + collection);
        if (!p0() || collection.isEmpty()) {
            return;
        }
        r.getClass();
        wrj wrjVar = OKVoipEngine.E;
        if (wrjVar.a() && (conversation = wrjVar.getConversation()) != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                CallMemberId callMemberId = (CallMemberId) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                Iterator<ConversationParticipant> it2 = conversation.getParticipants().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        conversationParticipant = null;
                        break;
                    }
                    conversationParticipant = it2.next();
                    ConversationParticipant conversationParticipant2 = conversationParticipant;
                    if (epx.f(conversationParticipant2.getExternalId().id, callMemberId.Ab()) && conversationParticipant2.getExternalId().deviceIndex == callMemberId.zb()) {
                        break;
                    }
                }
                ConversationParticipant conversationParticipant3 = conversationParticipant;
                if (conversationParticipant3 != null) {
                    conversation.removeParticipant(conversationParticipant3.getExternalId(), booleanValue);
                    tk90 tk90Var = OKVoipEngine.H;
                    CallMember a3 = tk90.a(tk90Var, conversation.getMe());
                    if (a3 == null || (a2 = tk90.a(tk90Var, conversationParticipant3)) == null) {
                        return;
                    }
                    OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                    ParticipantCollection participants = conversation.getParticipants();
                    oKVoipEngine.getClass();
                    OKVoipEngine.k.b.s(new il90.d(a3, Collections.singletonList(a2), OKVoipEngine.J(participants)));
                }
            }
        }
    }

    public final void U0(CallMemberId callMemberId) {
        if (p0()) {
            r.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                conversation.grantRoles(mnh0.H(callMemberId), true, CallParticipant.Role.ADMIN);
            }
            j0().w0();
        }
    }

    public final synchronized void X0(dhw0 dhw0Var) {
        O = dhw0Var;
        P0();
        D0();
    }

    @Override // xsna.g49
    public final void a(String str, boolean z2, CallId callId) {
        boolean s02 = s0();
        OKVoipEngine oKVoipEngine = r;
        if (s02 && oKVoipEngine.H()) {
            return;
        }
        if (!oKVoipEngine.H()) {
            dvw0 dvw0Var = i;
            if (!dvw0Var.d && dvw0Var.c) {
                dvw0Var.d = true;
            }
        }
        L.A("VoipViewModel", "onRemoteAccepted peerId=" + str + ", isVideo=" + z2);
        if (K0 != VoipViewModelState.CallingPeer) {
            L.G("VoipViewModel", "onRemoteAccepted during state = " + K0 + ", ignoring onRemoteAccepted");
            return;
        }
        if (!H) {
            i9e0 i9e0Var = b1;
            if (i9e0Var == null) {
                i9e0Var = null;
            }
            if (i9e0Var.a()) {
                vvr0.e();
            }
        }
        j0().z(new e49.k(callId, z2, s0()));
        f1(VoipViewModelState.Connecting);
    }

    public final Integer a0() {
        dhw0 dhw0Var;
        Set<CallMemberId> k2;
        if (!s0() || (dhw0Var = O) == null || (k2 = dhw0Var.k()) == null) {
            return null;
        }
        return Integer.valueOf(k2.size());
    }

    @Override // xsna.g49
    public final void b(dhw0 dhw0Var, boolean z2, Throwable th) {
        d = null;
        pvw0 j02 = j0();
        long g2 = dhw0Var.g();
        boolean s2 = dhw0Var.s();
        long j2 = J().f().b;
        p.getClass();
        Context context = e43.a;
        j02.B0(new e49.e(g2, s2, j2, z2, enj.n(context != null ? context : null), th));
    }

    @Override // com.vk.voip.b.c
    public final void c() {
        L.A("VoipViewModel", "onLoseOwnership");
        C(this, null, 0L, false, false, false, null, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    }

    public final CallMemberId c0() {
        r.getClass();
        Conversation conversation = OKVoipEngine.E.getConversation();
        if (conversation != null) {
            return f9t.v(conversation);
        }
        return null;
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
        O0(aVar.b());
        y(aVar.c());
        F().g(aVar.c(), aVar.a());
    }

    @Override // xsna.ah8
    public final void e(hd8 hd8Var) {
        ysg0<Object> ysg0Var = ysg0.b;
        ysg0.b.a(new h3x0());
    }

    public final String e0() {
        return b.$EnumSwitchMapping$0[K0.ordinal()] == 1 ? K() : M();
    }

    public final CallMemberId f0() {
        return r.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x06a6 A[Catch: all -> 0x0677, TryCatch #0 {all -> 0x0677, blocks: (B:194:0x0670, B:164:0x067a, B:167:0x0680, B:178:0x0685, B:181:0x06a6, B:183:0x06ab, B:188:0x06b5, B:191:0x06ba), top: B:193:0x0670 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(VoipViewModelState voipViewModelState) {
        boolean z2;
        boolean z3;
        boolean z4;
        UserId Bb;
        String str;
        if (K0 != voipViewModelState) {
            L.A("VoipViewModel", "VoipViewModel setting state = " + voipViewModelState);
            VoipViewModelState voipViewModelState2 = VoipViewModelState.Idle;
            J0 = voipViewModelState == voipViewModelState2 ? voipViewModelState2 : K0;
            K0 = voipViewModelState;
            u4x0 u4x0Var = Y;
            OKVoipEngine oKVoipEngine = r;
            oKVoipEngine.getClass();
            ulp ulpVar = OKVoipEngine.k;
            int i2 = 2;
            int i3 = 1;
            int i4 = 0;
            if (voipViewModelState.h()) {
                ulpVar.h(this);
                ulpVar.d(this);
                ulpVar.f(u4x0Var);
                o4x0 G2 = G();
                gw3 gw3Var = ulpVar.i;
                gw3Var.getClass();
                i0q0.i(0L, new o4(new ks2(i2, gw3Var, G2), i3));
                t4x0 W2 = W();
                h8j h8jVar = ulpVar.j;
                StringBuilder sb = new StringBuilder("addContactCallListener: ");
                CopyOnWriteArraySet<f8j> copyOnWriteArraySet = h8jVar.b;
                L.e("ContactCallListenerProxyImpl", fw3.d(copyOnWriteArraySet, sb));
                copyOnWriteArraySet.add(W2);
                ulpVar.h(W());
                ulpVar.h(nlk.b);
                ulpVar.q.b.add(m0());
            } else {
                ulpVar.l(this);
                ulpVar.i(this);
                ulpVar.j(u4x0Var);
                o4x0 G3 = G();
                gw3 gw3Var2 = ulpVar.i;
                gw3Var2.getClass();
                i0q0.i(0L, new o4(new ew3(i4, gw3Var2, G3), i3));
                t4x0 W3 = W();
                h8j h8jVar2 = ulpVar.j;
                StringBuilder sb2 = new StringBuilder("removeContactCallListener: ");
                CopyOnWriteArraySet<f8j> copyOnWriteArraySet2 = h8jVar2.b;
                L.e("ContactCallListenerProxyImpl", fw3.d(copyOnWriteArraySet2, sb2));
                copyOnWriteArraySet2.remove(W3);
                ulpVar.l(W());
                ulpVar.l(nlk.b);
                ulpVar.q.b.remove(m0());
            }
            GroupCallViewModel.b.k(oKVoipEngine, voipViewModelState.h());
            I0 = System.currentTimeMillis();
            VoipViewModelState voipViewModelState3 = K0;
            VoipViewModelState voipViewModelState4 = VoipViewModelState.InCall;
            if (voipViewModelState3 == voipViewModelState4 || (J0 == voipViewModelState4 && oKVoipEngine.H())) {
                Y0(false);
            }
            D0();
            ysg0<Object> ysg0Var = ysg0.b;
            ysg0Var.a(new fjw0(K0, J0, W0, X0));
            if (K0 == voipViewModelState2) {
                CallId callId = T0;
                UserId userId = s0() ? null : s;
                long j2 = K;
                int i5 = R0;
                boolean s02 = s0();
                dhw0 dhw0Var = O;
                boolean r2 = dhw0Var != null ? dhw0Var.r() : false;
                boolean z5 = (O0 == null && P0 == null) ? false : true;
                dhw0 dhw0Var2 = O;
                Integer valueOf = dhw0Var2 != null ? Integer.valueOf(dhw0Var2.j()) : null;
                VoipCallSource voipCallSource = Y0;
                zqk0 zqk0Var = P;
                Long h2 = zqk0Var != null ? zqk0Var.h() : null;
                com.vk.voip.ui.actions.feature.c cVar = e0;
                if (cVar == null) {
                    cVar = null;
                }
                djw0 a2 = cVar.a();
                ysg0Var.a(new chw0(new cow0(callId, userId, j2, "calls_v2", i5, s02, r2, z5, valueOf, voipCallSource, h2, a2 != null && a2.a())));
                Z0 = false;
                v = true;
                a1(false);
                D = false;
                e1(new zmw0.b(false, false, false));
                K = 0L;
                N = false;
                P = null;
                X0(null);
                S0 = false;
                W0(CallId.e);
                V0 = false;
                W0 = false;
                X0 = false;
                Serializer.c<VoipCallSource> cVar2 = VoipCallSource.CREATOR;
                Y0 = VoipCallSource.a.a();
                if (!epx.f(L0, "")) {
                    L0 = "";
                    D0();
                }
                CallMember.NetworkStatus networkStatus = CallMember.NetworkStatus.GOOD;
                if (M0 != networkStatus) {
                    M0 = networkStatus;
                    ysg0Var.a(qlk.a);
                }
                i9e0 i9e0Var = b1;
                if (i9e0Var == null) {
                    i9e0Var = null;
                }
                i9e0Var.stopTrackingProximity();
                Y0(false);
                L = UserId.d;
                if (R0 != 0) {
                    R0 = 0;
                    ysg0Var.a(new wgw0());
                }
                M = "";
                D0();
                rah0 rah0Var = g;
                if (rah0Var == null) {
                    rah0Var = null;
                }
                rah0Var.d();
                d1(true);
                Z0(false);
                I.onNext(CallsAudioDeviceInfo.Companion.getNONE());
                H().c(false);
                if (J) {
                    J = false;
                    ysg0Var.a(new g3x0());
                }
                q = false;
                p4x0 p4x0Var = G;
                p4x0Var.getClass();
                L.e("VoipViewModelAudioDumpDelegate", "Stop audio record (if any) by call finish");
                p4x0Var.d();
                V().b();
                L.A("VoipViewModel", "VoipViewModel released headset notification");
                nlk.b.a();
                T = false;
                VoipDataProvider voipDataProvider = d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                voipDataProvider.n();
                io.reactivex.rxjava3.disposables.c cVar3 = d1;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                d1 = null;
                wd2 wd2Var = P0;
                if (wd2Var != null) {
                    if (wd2Var != null) {
                        N0.post(wd2Var);
                    }
                    P0 = null;
                }
                xab xabVar = O0;
                if (xabVar != null) {
                    if (xabVar != null) {
                        N0.post(xabVar);
                    }
                    O0 = null;
                }
                fw6 fw6Var = W;
                if (fw6Var != null) {
                    fw6Var.a();
                }
                i0().b();
                h0().f();
                com.vk.voip.ui.sessionrooms.d dVar = B0;
                dVar.k().C(qwi0.i.b);
                dVar.m().c();
                F = false;
                ch8 ch8Var = ulpVar.e;
                StringBuilder sb3 = new StringBuilder("broadcastListeners: ");
                CopyOnWriteArraySet<ah8> copyOnWriteArraySet3 = ch8Var.b;
                L.e("BroadcastListenerProxy", fw3.d(copyOnWriteArraySet3, sb3));
                copyOnWriteArraySet3.remove(this);
                N().b().a();
                N().a().a();
                j0().reset();
                m0().a();
                f = false;
            }
            if (J0 == voipViewModelState2 && K0 != voipViewModelState2) {
                h0().h();
                V().a();
                i9e0 i9e0Var2 = b1;
                if (i9e0Var2 == null) {
                    i9e0Var2 = null;
                }
                i9e0Var2.startTrackingProximity();
                ulpVar.e.a(this);
                L.A("VoipViewModel", "VoipViewModel blocked headset notification");
            }
            if (J0 == voipViewModelState2 && voipViewModelState == VoipViewModelState.ReceivingCallFromPeer) {
                com.vk.voip.ui.notifications.incoming.b bVar = (com.vk.voip.ui.notifications.incoming.b) v0.getValue();
                dhw0 dhw0Var3 = O;
                if (dhw0Var3 == null || (str = dhw0Var3.h()) == null) {
                    str = "";
                }
                bVar.c(str, N, true);
            }
            VoipViewModelState voipViewModelState5 = J0;
            VoipViewModelState voipViewModelState6 = VoipViewModelState.ReceivingCallFromPeer;
            if (voipViewModelState5 == voipViewModelState6 && voipViewModelState != voipViewModelState6) {
                ((com.vk.voip.ui.notifications.incoming.b) v0.getValue()).a();
            }
            if (K0 == VoipViewModelState.RecordingAudioMessage) {
                U().b(new w2x0.a(false, 7));
                rq4.a.j();
            } else {
                rq4.a.getClass();
                rq4.a(false);
            }
            if (K0 == voipViewModelState4) {
                Handler handler = N0;
                v3x0 v3x0Var = Q0;
                handler.removeCallbacks(v3x0Var);
                handler.postDelayed(v3x0Var, 1000L);
                p4x0 p4x0Var2 = G;
                io.reactivex.rxjava3.subjects.d<p4x0.b> dVar2 = p4x0Var2.b;
                b.getClass();
                dVar2.onNext(new p4x0.b(d0(), "", false, null));
                p4x0.a b2 = p4x0.b(null);
                if (((Boolean) ((vqe0) s0.a()).invoke()).booleanValue() || b2.c()) {
                    L.e("VoipViewModelAudioDumpDelegate", "Starting audio dump record by call start, because of user.enabled=" + ((Boolean) ((vqe0) s0.a()).invoke()).booleanValue() + " or config.force=" + b2.c());
                    p4x0Var2.f(b2);
                }
            }
            if (K0.h()) {
                V().e();
            } else {
                V().f();
            }
            if (K0.h()) {
                nfw0 nfw0Var = D0;
                io.reactivex.rxjava3.disposables.b bVar2 = nfw0Var.k;
                ofw0 ofw0Var = nfw0Var.b;
                if (!nfw0Var.h) {
                    nfw0Var.h = true;
                    lew0 lew0Var = ofw0Var.b;
                    io.reactivex.rxjava3.subjects.d<lew0.b> dVar3 = lew0Var.e;
                    dVar3.onNext(lew0.b.C3264b.a);
                    kew0 kew0Var = lew0Var.c;
                    io.reactivex.rxjava3.subjects.f<jew0> fVar = kew0Var.a;
                    t6m0 t6m0Var = new t6m0(new ubt0(kew0Var, 4), 11);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    j1 U2 = new z0(fVar.E(t6m0Var, lVar, kVar, kVar)).U(new qat0(new g2h0(13), 2));
                    io.reactivex.rxjava3.disposables.c cVar4 = lew0Var.f;
                    if (cVar4 != null) {
                        cVar4.dispose();
                    }
                    asu0 asu0Var = asu0.a;
                    lew0Var.f = io.reactivex.rxjava3.kotlin.c.f(2, new i0(q.X(dVar3.r0(asu0Var.c()), U2).b(2, 1), new dnz(new wql0(15), 29)), null, new acc0(19), new ixu0(lew0Var, 4));
                    nfw0Var.c.b(io.reactivex.rxjava3.kotlin.c.f(2, new j2(ofw0Var.c().r0(asu0Var.c())), null, new gyo0(nfw0Var, 17), new vyq0(nfw0Var, 12)));
                    bVar2.b(io.reactivex.rxjava3.kotlin.c.f(3, ofw0Var.c().r0(asu0Var.c()), null, null, new cus0(nfw0Var, 9)));
                    bVar2.b(io.reactivex.rxjava3.kotlin.c.f(3, ofw0Var.d().r0(asu0Var.c()), null, null, new rtg0(nfw0Var, 26)));
                    io.reactivex.rxjava3.subjects.f<com.vk.voip.ui.sessionrooms.a> fVar2 = nfw0Var.f.c;
                    fVar2.getClass();
                    bVar2.b(io.reactivex.rxjava3.kotlin.c.f(3, new z0(fVar2).r0(asu0Var.c()), null, null, new qjm0(nfw0Var, 11)));
                }
                ((CopyOnWriteArraySet) ulpVar.n.a).add(nfw0Var);
                i0().l();
                CallMemberId c02 = c0();
                if (c02 != null && (Bb = c02.Bb()) != null) {
                    s = Bb;
                }
            }
            if (K0.h()) {
                ((mdh0) i0.getValue()).a();
                ((dwe0) j0.getValue()).a();
            }
            f1.dispose();
            io.reactivex.rxjava3.disposables.c f2 = io.reactivex.rxjava3.kotlin.c.f(3, yt2.a(), null, null, new qit0(6));
            e.b(f2);
            f1 = f2;
            kqt kqtVar = j;
            VoipViewModelState voipViewModelState7 = K0;
            if (kqtVar.c == null) {
                if (!voipViewModelState7.i() || voipViewModelState7 == VoipViewModelState.AboutToCallPeer) {
                    kqtVar.c = null;
                } else if (voipViewModelState7 != voipViewModelState6) {
                    kqtVar.b.onNext(iqt.a.C3074a.a);
                    kqtVar.c = null;
                }
            }
            G().c(J0, K0);
            u4x0Var.getClass();
            b.getClass();
            if (J0 == VoipViewModelState.WaitingRoom) {
                u4x0Var.onFeedbackEnabledChanged(u4x0Var.b.isFeedbackEnabled());
            }
            k570 k570Var = (k570) x0.getValue();
            if (!q) {
                oKVoipEngine = null;
            }
            k570Var.d(oKVoipEngine);
            if (K0 != voipViewModelState2) {
                ((m570) S()).b();
            }
            VoipViewModelState voipViewModelState8 = K0;
            voipViewModelState8.getClass();
            VoipViewModelState voipViewModelState9 = VoipViewModelState.FinishedTransient;
            if (voipViewModelState8 == voipViewModelState9 || voipViewModelState8 == VoipViewModelState.DeclinedTransient) {
                a201.b().e().a();
                nfw0 nfw0Var2 = D0;
                ((CopyOnWriteArraySet) ulpVar.n.a).remove(nfw0Var2);
                if (nfw0Var2.h) {
                    nfw0Var2.h = false;
                    nfw0Var2.c.e();
                    lew0 lew0Var2 = nfw0Var2.b.b;
                    lew0Var2.g.clear();
                    io.reactivex.rxjava3.disposables.c cVar5 = lew0Var2.f;
                    if (cVar5 != null) {
                        cVar5.dispose();
                    }
                    lew0Var2.f = null;
                    kew0 kew0Var2 = lew0Var2.c;
                    io.reactivex.rxjava3.disposables.c cVar6 = kew0Var2.b;
                    if (cVar6 != null) {
                        cVar6.dispose();
                    }
                    io.reactivex.rxjava3.disposables.c cVar7 = kew0Var2.c;
                    if (cVar7 != null) {
                        cVar7.dispose();
                    }
                    lew0Var2.a();
                    nfw0Var2.k.e();
                    nfw0Var2.b.a.a(false);
                }
            }
            e1.dispose();
            e1 = io.reactivex.rxjava3.kotlin.c.f(3, a201.b().e().c(), null, null, new lcq0(10));
            lfw0 lfw0Var = n;
            VoipViewModelState voipViewModelState10 = K0;
            synchronized (lfw0Var) {
                if (voipViewModelState10 != voipViewModelState4) {
                    try {
                        if (voipViewModelState10 != VoipViewModelState.CallingPeer) {
                            z2 = false;
                            z3 = lfw0Var.b;
                            if (z3 && z2) {
                                lhw0 lhw0Var = lfw0Var.c;
                                if (!z3) {
                                    lhw0Var.a.c();
                                    lhw0Var.a.a(((lhw0.a) lfw0Var.a.invoke()).a().b());
                                    lfw0Var.b = true;
                                }
                            } else if (z3) {
                                voipViewModelState10.getClass();
                                if (voipViewModelState10 != voipViewModelState9 && voipViewModelState10 != VoipViewModelState.DeclinedTransient) {
                                    z4 = false;
                                    if (z4 && lfw0Var.b) {
                                        lfw0Var.c.a.e();
                                        lfw0Var.b = false;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    lfw0Var.c.a.e();
                                    lfw0Var.b = false;
                                }
                            }
                        }
                    } finally {
                    }
                }
                z2 = true;
                z3 = lfw0Var.b;
                if (z3) {
                }
                if (z3) {
                }
            }
            com.vk.voip.ui.actions.feature.c cVar8 = e0;
            (cVar8 != null ? cVar8 : null).c(K0);
        }
    }

    @Override // xsna.ah8
    public final void g(whr0 whr0Var) {
        ysg0.b.a(new gf8.a(whr0Var));
    }

    public final synchronized zqk0 g0() {
        return P;
    }

    public final void g1(zqk0 zqk0Var, VoipCallSource voipCallSource, UserId userId, String str, Set<? extends VoipCallOnStartAction> set) {
        ejw0 ejw0Var = new ejw0(zqk0Var, voipCallSource, userId, str, set);
        r.f(this);
        if (J().d()) {
            j1(ejw0Var);
        } else {
            P0 = new wd2(ejw0Var, 12);
            J().reset();
        }
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        O0(cVar.a());
        y(cVar.d());
        VoipDataProvider voipDataProvider = d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        Collection values = ((LinkedHashMap) cVar.b()).values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallMemberId) it.next()).Ab());
        }
        voipDataProvider.l(arrayList);
    }

    public final void h1(ejw0 ejw0Var) {
        dhw0 dhw0Var;
        L.A("VoipViewModel", "startCall peerId=" + ejw0Var.i().f() + ", fromId=" + ejw0Var.g());
        if (v0()) {
            f1(VoipViewModelState.Idle);
        }
        F = false;
        zqk0 a2 = ejw0Var.a();
        VoipCallSource b2 = ejw0Var.b();
        UserId c2 = ejw0Var.c();
        String d2 = ejw0Var.d();
        Set<VoipCallOnStartAction> e2 = ejw0Var.e();
        boolean j2 = a2.j();
        boolean contains = e2.contains(VoipCallOnStartAction.g.a);
        if (K0 != VoipViewModelState.Idle) {
            if (q && (dhw0Var = O) != null && ejw0Var.i().f() == dhw0Var.g()) {
                if (K0 == VoipViewModelState.ReceivingCallFromPeer) {
                    n(j2);
                    U().b(new w2x0.a(contains, 6));
                    return;
                }
                if (K0.h()) {
                    dhw0 dhw0Var2 = O;
                    if (!epx.f(dhw0Var2 != null ? dhw0Var2.i() : null, a2.g())) {
                        O0 = new xab(ejw0Var, 11);
                        L.A("VoipViewModel", "startCall declineOrHang switch to another one call");
                        C(this, null, 0L, false, false, true, null, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
                        return;
                    }
                }
                if (K0.h()) {
                    U().b(new w2x0.a(contains, 6));
                    return;
                }
            }
            O0 = new xab(ejw0Var, 11);
            L.A("VoipViewModel", "startCall declineOrHang scheduleNewCallStart");
            C(this, null, 0L, false, false, false, null, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
            return;
        }
        Y0 = b2;
        P = a2;
        Q = e2;
        X0(ehw0.a(a2));
        c1();
        K = a2.f();
        if (c2 == null) {
            c2 = UserId.d;
        }
        L = c2;
        h0().a(d2);
        N = a2.j() || myc0.f(d2);
        m1();
        dhw0 dhw0Var3 = O;
        if (dhw0Var3 == null || !dhw0Var3.c()) {
            d = null;
        } else {
            d = Boolean.valueOf(!a2.i() && s0());
        }
        f1(VoipViewModelState.AboutToCallPeer);
        if (((gvw0) U0.getValue()).b()) {
            L.A("VoipViewModel", "startCall permissions granted");
            V0 = false;
            N0.postDelayed(new Runnable() { // from class: xsna.f4x0
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.vk.voip.ui.c.K0 == VoipViewModelState.AboutToCallPeer) {
                        com.vk.voip.ui.c.b.D();
                    }
                }
            }, 50L);
        } else {
            L.A("VoipViewModel", "startCall waitingForPermissions");
            V0 = true;
        }
        U().b(new w2x0.a(contains, new cqr0(a2, 15), new g4x0(a2, 0)));
    }

    @Override // xsna.g49
    public final void i(g49.a aVar) {
        zqk0 zqk0Var;
        da9 c2;
        dhw0 dhw0Var;
        i.a();
        L.A("VoipViewModel", "onRemoteDeclinedOrHanged peerId=" + aVar + ".peerId");
        if (!K0.i()) {
            L.G("VoipViewModel", "onRemoteDeclinedOrHanged during state = " + K0 + ", ignoring onRemoteDeclinedOrHanged");
            return;
        }
        String b2 = aVar.b();
        dhw0 dhw0Var2 = O;
        if (!epx.f(b2, dhw0Var2 != null ? Long.valueOf(dhw0Var2.g()).toString() : null)) {
            L.G("VoipViewModel", "onRemoteDeclinedOrHanged for improper peerId = " + aVar.b() + ", ignoring");
            return;
        }
        j0().y(new e49.c(T0, aVar.c(), aVar.e(), s0()));
        W0 = aVar.c();
        X0 = aVar.e();
        if (K0 == VoipViewModelState.CallingPeer) {
            f1((!((Boolean) ((chr0) s0.d()).invoke()).booleanValue() || W0 || !fkq0.c(L) || s0() || ((dhw0Var = O) != null && dhw0Var.v())) ? VoipViewModelState.DeclinedTransient : VoipViewModelState.RecordingAudioMessage);
            if (!H) {
                i9e0 i9e0Var = b1;
                if ((i9e0Var != null ? i9e0Var : null).a()) {
                    vvr0.f();
                }
            }
        } else {
            f1(VoipViewModelState.FinishedTransient);
        }
        if (!F && (zqk0Var = P) != null && (c2 = zqk0Var.c()) != null) {
            c2.f();
        }
        if (W0 || t0() || aVar.d()) {
            return;
        }
        n0(1500L);
    }

    public final void j(boolean z2) {
        L.A("VoipViewModel", "acceptIncoming");
        n(z2);
    }

    public final void j1(ejw0 ejw0Var) {
        zqk0 zqk0Var;
        xdw0 b2;
        esa d2 = ejw0Var.i().d();
        c cVar = b;
        if (d2 != null) {
            cVar.getClass();
            ((jsa) k1.getValue()).b(d2);
        }
        Set<VoipCallOnStartAction> h2 = ejw0Var.h();
        cVar.getClass();
        if (J().h() || ((zqk0Var = P) != null && (b2 = zqk0Var.b()) != null && b2.c())) {
            r.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation == null ? false : conversation.getMe().isCreator()) {
                p4g.e(h2, new VoipCallOnStartAction.b(false));
                p4g.e(h2, new VoipCallOnStartAction.c(false));
            }
        }
        h1(ejw0.f(ejw0Var, h2));
    }

    @Override // xsna.g49
    public final void k(CallId callId, String str) {
        zqk0 zqk0Var;
        xdw0 b2;
        zqk0 zqk0Var2;
        xdw0 b3;
        L.A("VoipViewModel", "onConnected peerId=".concat(str));
        W0(callId);
        if (!str.equals(String.valueOf(K)) && !s0()) {
            L.G("VoipViewModel", efz.b(K, ", ignoring!", t33.a("onConnected wrong peerId = ", str, " whereas dialogId=")));
            return;
        }
        if (K0 != VoipViewModelState.Connecting) {
            L.G("VoipViewModel", "onConnected when state = " + K0 + ", ignoring!");
        }
        boolean z2 = true;
        if (!T) {
            j0().V(new e49.a(callId, s0()));
            ((d8j) a0.getValue()).a();
            T = true;
        }
        VoipViewModelState voipViewModelState = K0;
        VoipViewModelState voipViewModelState2 = VoipViewModelState.InCall;
        if (voipViewModelState != voipViewModelState2) {
            f1(voipViewModelState2);
            D0();
            OKVoipEngine oKVoipEngine = r;
            boolean z3 = v;
            oKVoipEngine.getClass();
            OKVoipEngine.S(new jo70(z3));
        }
        wc9 b4 = N().b();
        boolean s02 = s0();
        boolean q02 = q0();
        c cVar = b;
        cVar.getClass();
        b4.c(new vc9(s02, q02, J().h() || !((zqk0Var2 = P) == null || (b3 = zqk0Var2.b()) == null || !b3.c())));
        dc9 a2 = N().a();
        boolean q03 = q0();
        cVar.getClass();
        if (!J().h() && ((zqk0Var = P) == null || (b2 = zqk0Var.b()) == null || !b2.c())) {
            z2 = false;
        }
        a2.b(new cc9(q03, z2));
    }

    @Override // xsna.g49
    public final void l(int i2, boolean z2, boolean z3, CallId callId) {
        j0().h(new e49.n(z2, z3, Integer.valueOf(i2), callId));
    }

    @Override // xsna.tsw
    public final void m(com.vk.voip.b bVar, String str, dhw0 dhw0Var, CallId callId, boolean z2) {
        dvw0 dvw0Var = i;
        boolean w02 = w0();
        dvw0Var.b = z2;
        dvw0Var.c = w02;
        if (w02) {
            dvw0Var.d = false;
            dvw0Var.a.a();
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.v, new Object[]{"VoipViewModel", "onIncomingCall peerId=" + str + ", isVideo=" + z2});
        }
        if (u0()) {
            f1(VoipViewModelState.Idle);
        }
        j0().u(new e49.h(z2, Long.valueOf(Long.parseLong(str)), dhw0Var.s(), callId));
        if (K != 0 && !epx.f(String.valueOf(K), str)) {
            L.G("VoipViewModel", efz.b(K, ", ignoring onIncomingCall!", new StringBuilder("onIncomingCall dialogId is ")));
            bVar.i(true, false);
            j0().K(null, new e49.b(Long.parseLong(str), s0(), a0(), callId));
            return;
        }
        if (K0 != VoipViewModelState.Idle) {
            L.G("VoipViewModel", "onIncomingCall during state = " + K0 + ", ignoring onIncomingCall");
            return;
        }
        J().e();
        N = z2;
        W0(callId);
        X0(dhw0Var);
        c1();
        q = true;
        K = Long.parseLong(str);
        S0 = true;
        m1();
        f1(VoipViewModelState.ReceivingCallFromPeer);
        if (!((gvw0) U0.getValue()).b()) {
            L.A("VoipViewModel", "onIncomingCall waitingForPermissions");
            V0 = true;
        }
        V0();
    }

    public final void n(final boolean z2) {
        L.A("VoipViewModel", "acceptIncoming with call user (before switch)");
        if (K0 != VoipViewModelState.ReceivingCallFromPeer) {
            L.G("VoipViewModel", "acceptIncoming during state = " + K0 + ", ignoring acceptIncoming");
        } else if (K == 0) {
            L.G("VoipViewModel", "acceptIncoming while dialogId=0, ignoring acceptIncoming");
        } else if (V0) {
            if (!J) {
                J = true;
                ysg0.b.a(new g3x0());
            }
            L.A("VoipViewModel", "acceptIncoming while waitingForPermissions, ignoring acceptIncoming");
        } else {
            OKVoipEngine oKVoipEngine = r;
            oKVoipEngine.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                if (conversation.isPrepared()) {
                    f9t.h(conversation);
                    oKVoipEngine.y().f(true);
                } else {
                    L.l("OKVoipEngine", "acceptCall: an attempt to accept unprepared conversation");
                }
            }
            j0().v(new e49.f(z2, s0()));
            f1(VoipViewModelState.Connecting);
        }
        J().b(new izs() { // from class: xsna.y3x0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((Boolean) obj).getClass();
                com.vk.voip.ui.c.b.getClass();
                Handler handler = com.vk.voip.ui.c.N0;
                final boolean z3 = z2;
                handler.postDelayed(new Runnable() { // from class: xsna.i4x0
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
                    
                        if (r2.a().booleanValue() != false) goto L10;
                     */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        MediaOptions mediaOptionsForCurrentUser = OKVoipEngine.b.getMediaOptionsForCurrentUser();
                        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                        cVar.getClass();
                        MediaOptionState audioState = mediaOptionsForCurrentUser.getAudioState();
                        MediaOptionState mediaOptionState = MediaOptionState.MUTED_PERMANENT;
                        boolean z4 = false;
                        if (audioState != mediaOptionState && audioState != MediaOptionState.UNMUTED_BUT_MUTED_ONCE) {
                            if (cVar.s0()) {
                                com.vk.voip.ui.c.t0.getClass();
                                f18 f18Var = pi50.c;
                                qcy<Object> qcyVar = pi50.b[0];
                            }
                            MediaOptionState videoState = mediaOptionsForCurrentUser.getVideoState();
                            boolean z5 = videoState != mediaOptionState || videoState == MediaOptionState.UNMUTED_BUT_MUTED_ONCE;
                            if (z3 && !z5) {
                                z4 = true;
                            }
                            com.vk.voip.ui.c.a1(z4);
                        }
                        cVar.A0();
                        MediaOptionState videoState2 = mediaOptionsForCurrentUser.getVideoState();
                        if (videoState2 != mediaOptionState) {
                        }
                        if (z3) {
                            z4 = true;
                        }
                        com.vk.voip.ui.c.a1(z4);
                    }
                }, 300L);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.tsw
    public final void o(mlp mlpVar) {
        w(mlpVar);
    }

    public final void o1() {
        if (p0()) {
            dhw0 dhw0Var = O;
            X0(dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -16777217, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null);
            D0();
        }
    }

    @Override // xsna.g49
    public final void p(CallId callId, boolean z2) {
        N0(callId, z2, new h(this));
    }

    @Override // xsna.g49
    public final void q() {
        if (S0) {
            return;
        }
        ysg0.b.a(new ab80());
        j0().J(new e49.m(s0()));
        if (K0 == VoipViewModelState.InCall || R) {
            return;
        }
        Y0(true);
        D0();
    }

    public final void q1() {
        L.A("VoipViewModel", "videoOff");
        if (O() && z0()) {
            L.A("VoipViewModel", "videoOff executed");
            a1(false);
            j0().L0(s0());
        }
    }

    @Override // xsna.g49
    public final void r(boolean z2) {
        zqk0 zqk0Var;
        xdw0 b2;
        dhw0 dhw0Var = O;
        X0(dhw0Var != null ? dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, z2, true, 0, null, false, false, false, false, null, null, -1610612737, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : null);
        String str = L0;
        b.getClass();
        boolean h2 = J().h();
        u4x0 u4x0Var = Y;
        if ((h2 || ((zqk0Var = P) != null && (b2 = zqk0Var.b()) != null && b2.c())) && z2 && r.isMeCreatorOrAdmin() && myc0.f(str)) {
            OKVoipEngine.b.getClass();
            Conversation conversation = OKVoipEngine.E.getConversation();
            if (conversation != null) {
                conversation.setAnonJoinForbidden(true);
            }
            u4x0Var.b(false);
        }
        if (z2) {
            if (!epx.f(L0, "")) {
                L0 = "";
                D0();
            }
            V().d();
        }
        u4x0Var.onFeedbackEnabledChanged(u4x0Var.b.isFeedbackEnabled());
        D0();
    }

    public final void r1() {
        L.A("VoipViewModel", "videoOn");
        if (!O() || z0()) {
            return;
        }
        MediaOptionState videoState = r.getMediaOptionsForCurrentUser().getVideoState();
        boolean z2 = videoState != MediaOptionState.MUTED_PERMANENT;
        boolean z3 = videoState == MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE;
        PermissionHelper permissionHelper = PermissionHelper.a;
        p.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String[] strArr = PermissionHelper.l;
        permissionHelper.getClass();
        if (PermissionHelper.b(context, strArr)) {
            if (z2 || z3) {
                L.A("VoipViewModel", "videoOn executed");
                a1(true);
                j0().s(s0());
            }
        }
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
        O0(dVar.a());
        y(dVar.b());
        VoipDataProvider voipDataProvider = d0;
        if (voipDataProvider == null) {
            voipDataProvider = null;
        }
        List<CallMember> c2 = dVar.c();
        ArrayList arrayList = new ArrayList(c5g.u(c2, 10));
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallMember) it.next()).a().Ab());
        }
        voipDataProvider.l(arrayList);
        F().h(dVar.b(), dVar.c());
    }

    public final boolean s0() {
        dhw0 dhw0Var = O;
        return dhw0Var != null && dhw0Var.s();
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
        O0(eVar.a());
        y(eVar.b());
    }

    @Override // xsna.g49
    public final void u(CallId callId, boolean z2, final boolean z3) {
        N0(callId, z2, new gzs() { // from class: xsna.u3x0
            @Override // xsna.gzs
            public final Object invoke() {
                boolean z4;
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                if (z3) {
                    cVar.getClass();
                } else if (cVar.s0()) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
                z4 = false;
                return Boolean.valueOf(z4);
            }
        });
        j0().E(new e49.j(callId));
    }

    @Override // xsna.g49
    public final void v(CallId callId, String str) {
        L.A("VoipViewModel", "onDisconnected peerId=".concat(str));
        if (!str.equals(String.valueOf(K)) && !s0()) {
            L.G("VoipViewModel", efz.b(K, ", ignoring!", t33.a("onDisconnected wrong peerId = ", str, " whereas dialogId=")));
            return;
        }
        if (K0 != VoipViewModelState.InCall) {
            L.G("VoipViewModel", "onDisonnected when state = " + K0 + ", ignoring!");
        }
        if (T) {
            j0().U(new e49.d(s0(), a0(), callId));
            T = false;
        }
        f1(VoipViewModelState.Connecting);
    }

    @Override // xsna.g49
    public final void w(mlp mlpVar) {
        L.A("VoipViewModel", "onCallStartError");
        d = null;
        VoipStatManager.StatData statData = VoipStatManager.a;
        VoipStatManager.b(mlpVar.b());
        U.onNext(mlpVar);
        x.onNext(c8x0.a.a);
        if (rpk0.a(mlpVar.e())) {
            j0().f0(new e49.g(mlpVar.c(), mlpVar.d(), s0(), mlpVar.a()));
        } else if (rpk0.b(mlpVar.e())) {
            j0().K0(new e49.i(mlpVar.c(), mlpVar.d(), mlpVar.a()));
        } else {
            j0().D0(new e49.l(mlpVar.c(), mlpVar.d(), s0(), mlpVar.a()));
        }
        C(this, null, 0L, false, false, false, mlpVar.a(), 91);
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
        O0(bVar.a());
        y(bVar.c());
    }

    public final boolean x0() {
        boolean s02 = s0();
        if (!s02) {
            if (s02) {
                throw new NoWhenBranchMatchedException();
            }
            return H0.c && K0 == VoipViewModelState.InCall;
        }
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        dhw0 dhw0Var = O;
        CallMemberId n2 = dhw0Var != null ? dhw0Var.n() : null;
        groupCallViewModel.getClass();
        kiu b2 = GroupCallViewModel.b(n2);
        if (b2 != null) {
            return b2.a();
        }
        return false;
    }

    public final boolean y0() {
        boolean s02 = s0();
        if (!s02) {
            if (s02) {
                throw new NoWhenBranchMatchedException();
            }
            return H0.a && K0 == VoipViewModelState.InCall;
        }
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        dhw0 dhw0Var = O;
        CallMemberId n2 = dhw0Var != null ? dhw0Var.n() : null;
        groupCallViewModel.getClass();
        kiu b2 = GroupCallViewModel.b(n2);
        if (b2 != null) {
            return b2.b();
        }
        return false;
    }

    @Override // xsna.g49
    public final void f(g49.b bVar) {
    }
}
