package com.vk.voip.factory;

import android.content.Context;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.VoipFeatures;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.calls.sdk.experiments.ExperimentsInterface;
import one.video.calls.sdk.experiments.a;
import one.video.calls.sdk.experiments.c;
import one.video.calls.sdk.experiments.models.PcapLabelConfig;
import org.json.JSONObject;
import org.webrtc.BreakpadBridge;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsConfiguration;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsUploadConfig;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.webrtc.connection.BadNetworkIndicatorConfig;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.bd3;
import xsna.cqi;
import xsna.dg1;
import xsna.e03;
import xsna.ete0;
import xsna.f370;
import xsna.h6o0;
import xsna.hy2;
import xsna.irw0;
import xsna.k73;
import xsna.lhg;
import xsna.ms2;
import xsna.nw70;
import xsna.om60;
import xsna.orj;
import xsna.ow70;
import xsna.pm60;
import xsna.prj;
import xsna.q1t;
import xsna.qc1;
import xsna.qcy;
import xsna.rc1;
import xsna.rew0;
import xsna.sc1;
import xsna.swe0;
import xsna.xb20;
import xsna.z34;
import xsna.zhy0;
import xsna.zmw0;

/* compiled from: ConversationFactoryCreator.kt */
/* loaded from: classes7.dex */
public final class ConversationFactoryCreator {
    public final zmw0 a;
    public final hy2 b;
    public final om60 c;
    public final pm60 d;
    public final rew0 e;

    /* compiled from: ConversationFactoryCreator.kt */
    public static final class ConversationFactoryCreatorException extends RuntimeException {
    }

    public ConversationFactoryCreator(zmw0 zmw0Var, hy2 hy2Var, om60 om60Var, pm60 pm60Var, rew0 rew0Var) {
        this.a = zmw0Var;
        this.b = hy2Var;
        this.c = om60Var;
        this.d = pm60Var;
        this.e = rew0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0544  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConversationFactory a() {
        String str;
        String str2;
        char c;
        qc1 qc1Var;
        b.d i;
        boolean a;
        irw0 g;
        String b;
        Integer b2;
        String D;
        b.d j;
        zmw0 zmw0Var = this.a;
        Context context = zmw0Var.getContext();
        zmw0Var.h().getClass();
        Features.Type type = Features.Type.FEATURE_VOIP_DOMAINID_OVERRIDE;
        type.getClass();
        b bVar = b.A;
        String obj = (!bVar.a(type) || (j = bVar.j(type.getKey(), false)) == null) ? null : j.c.toString();
        OkApi.Builder deviceIdProvider = new OkApi.Builder().setDeviceIdProvider(new ow70(new z34(26)));
        deviceIdProvider.setAppKeyProvider(new nw70(zmw0Var.h())).setTokenInfoProvider(new xb20(zmw0Var.h().c, 19)).setSessionStore(new e03());
        OkApi build = deviceIdProvider.build();
        Context context2 = zmw0Var.getContext();
        zmw0Var.h().getClass();
        ConversationFactory conversationFactory = new ConversationFactory(build, context2, "VK");
        conversationFactory.setDomainId(obj);
        ConversationAnalyticsConfiguration configuration = conversationFactory.getAnalyticsSender().getConfiguration();
        configuration.setApplicationNameProvider(new q1t(this.e));
        Pair pair = new Pair(new ConversationAnalyticsUploadConfig(15, 1000, 100, null, false, false, true, false, 40, null), new Pair(2, 48));
        ConversationAnalyticsUploadConfig conversationAnalyticsUploadConfig = (ConversationAnalyticsUploadConfig) pair.d();
        Pair pair2 = (Pair) pair.g();
        int intValue = ((Number) pair2.d()).intValue();
        int intValue2 = ((Number) pair2.g()).intValue();
        configuration.setUploadConfigProvider(new dg1(conversationAnalyticsUploadConfig, 14));
        a experiments = conversationFactory.getExperiments();
        Double valueOf = Double.valueOf(intValue / 100.0d);
        Double valueOf2 = Double.valueOf(intValue2 * 1000.0d);
        c cVar = experiments.a;
        c.a aVar = cVar.k;
        qcy<Object>[] qcyVarArr = c.j0;
        qcy<Object> qcyVar = qcyVarArr[9];
        aVar.b(valueOf);
        c.a aVar2 = cVar.l;
        qcy<Object> qcyVar2 = qcyVarArr[10];
        aVar2.b(valueOf2);
        c.a aVar3 = conversationFactory.getExperiments().a.j;
        qcy<Object> qcyVar3 = qcyVarArr[8];
        aVar3.b(Boolean.TRUE);
        L.e("ConversationFactoryCreator", "setAnalyticsUploadConfig " + pair);
        conversationFactory.setRotationProvider(new prj(this, zmw0Var.k().a()));
        conversationFactory.setAnimojiDataSupplier(new ms2(context, zmw0Var.i(), this.c, this.d, zmw0Var.a().e()));
        ete0 ete0Var = new ete0(zmw0Var);
        conversationFactory.setLogger(ete0Var);
        conversationFactory.setLogConfiguration(new h6o0(zmw0Var.g()));
        ConversationFactoryInitParams.PeerConnection.Builder nativeLibraryLoader = new ConversationFactoryInitParams.PeerConnection.Builder().setUdpMarker("0x8021:0xfc09b46f").setLogger(ete0Var).setEarlyAudioPlayoutEnabled(true).setNativeLibraryLoader(new orj(ete0Var, this));
        conversationFactory.setWebRTCCodecFilteringEnabled(zmw0Var.f());
        conversationFactory.setAudioCodecs(zmw0Var.b());
        conversationFactory.setVideoCodecs(zmw0Var.j());
        Features.Type type2 = Features.Type.FEATURE_VOIP_BONUS_FIELD_TRIALS;
        type2.getClass();
        if (bVar.a(type2)) {
            b.d j2 = bVar.j(type2.getKey(), false);
            if (j2 == null || (str = j2.c.toString()) == null) {
                str = "";
            }
            nativeLibraryLoader.setBonusFieldTrials(str);
            L.e("ConversationFactoryCreator", "bonus field trials enabled: ".concat(str));
        } else {
            L.e("ConversationFactoryCreator", "bonus field trials disabled");
        }
        b.d i2 = bVar.i(VoipFeatures.BAD_NETWORK_INDICATOR);
        boolean z = i2 != null && i2.a;
        if (i2 == null || (str2 = i2.c.toString()) == null || !z) {
            str2 = null;
        }
        BadNetworkIndicatorConfig from = BadNetworkIndicatorConfig.Companion.from(str2, ete0Var);
        conversationFactory.setBadNetworkIndicatorConfig(from);
        conversationFactory.setEnableLossRttBadConnectionHandling(z);
        L.e("ConversationFactoryCreator", "setBadNetworkIndicatorParameters " + from);
        boolean a2 = bVar.a(VoipFeatures.DISABLE_CAMERA2_API);
        if (a2) {
            c.a aVar4 = conversationFactory.getExperiments().a.b;
            qcy<Object> qcyVar4 = qcyVarArr[0];
            aVar4.b(Boolean.FALSE);
        }
        L.e("ConversationFactoryCreator", zhy0.a("setCamera2ApiDisabled ", a2));
        try {
            b.d i3 = bVar.i(VoipFeatures.ENABLE_VMOJI_BACKEND_RENDER);
            JSONObject g2 = (i3 == null || !i3.a) ? null : i3.g();
            if (g2 != null) {
                Boolean q = f370.q(g2, "enabled_for_all");
                boolean booleanValue = q != null ? q.booleanValue() : false;
                String D2 = f370.D(g2, "enabled_for_one_ui_version");
                if (booleanValue || D2 != null) {
                    conversationFactory.getExperiments().a(D2, booleanValue);
                    L.e("ConversationFactoryCreator", "setBackendRenderVmoji all=" + booleanValue + ", oneUI=" + D2);
                }
            }
        } catch (Throwable th) {
            L.e("ConversationFactoryCreator", "setBackendRenderVmoji(false)", th);
        }
        VoipFeatures voipFeatures = VoipFeatures.NEW_SUMMARY_STATISTICS;
        voipFeatures.getClass();
        b bVar2 = b.A;
        boolean a3 = bVar2.a(voipFeatures);
        c.a aVar5 = conversationFactory.getExperiments().a.v;
        qcy<Object>[] qcyVarArr2 = c.j0;
        qcy<Object> qcyVar5 = qcyVarArr2[20];
        aVar5.b(Boolean.valueOf(a3));
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (L.m(loggerOutputTarget)) {
            c = '0';
        } else {
            c = '0';
            L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsSummaryStatsEnabled ", a3)});
        }
        c.a aVar6 = conversationFactory.getExperiments().a.w;
        qcy<Object> qcyVar6 = qcyVarArr2[21];
        aVar6.b(Boolean.valueOf(a3));
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsSignalingLogThrottlingEnabled ", a3)});
        }
        b.d i4 = bVar2.i(VoipFeatures.AI_OPUS_BWE_CONFIG);
        JSONObject g3 = i4 != null ? i4.g() : null;
        if (g3 != null) {
            Boolean q2 = f370.q(g3, MLFeatureConfigProviderBase.ENABLED_KEY);
            String D3 = f370.D(g3, "config");
            if (q2 != null) {
                if (q2.equals(Boolean.TRUE)) {
                    qc1Var = D3 != null ? new rc1(D3) : sc1.a;
                } else {
                    if (!q2.equals(Boolean.FALSE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qc1Var = qc1.a.a;
                }
                if (qc1Var != null) {
                    c.a aVar7 = conversationFactory.getExperiments().a.x;
                    qcy<Object> qcyVar7 = qcyVarArr2[22];
                    aVar7.b(qc1Var);
                }
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", k73.c(new StringBuilder("setAiOpusBweConfig '"), g3 == null ? "[NULL]" : g3, '\'')});
                }
                if (g3 != null && (D = f370.D(g3, "label")) != null) {
                    PcapLabelConfig pcapLabelConfig = new PcapLabelConfig(D, PcapLabelConfig.Source.AI_OPUS_BWE);
                    c.a aVar8 = conversationFactory.getExperiments().a.W;
                    qcy<Object> qcyVar8 = qcyVarArr2[47];
                    aVar8.b(pcapLabelConfig);
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", "setPcapLabel '" + pcapLabelConfig + '\''});
                    }
                }
                VoipFeatures voipFeatures2 = VoipFeatures.LINEAR_OPUS_BWE_ENABLED;
                voipFeatures2.getClass();
                boolean a4 = bVar2.a(voipFeatures2);
                c.a aVar9 = conversationFactory.getExperiments().a.A;
                qcy<Object> qcyVar9 = qcyVarArr2[25];
                aVar9.b(Boolean.valueOf(a4));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsLinearBweEnabled ", a4)});
                }
                VoipFeatures voipFeatures3 = VoipFeatures.ADAPTIVE_OPUS;
                voipFeatures3.getClass();
                boolean a5 = bVar2.a(voipFeatures3);
                c.a aVar10 = conversationFactory.getExperiments().a.B;
                qcy<Object> qcyVar10 = qcyVarArr2[26];
                aVar10.b(Boolean.valueOf(a5));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsAdaptiveOpusComplexityEnabled ", a5)});
                }
                VoipFeatures voipFeatures4 = VoipFeatures.H265_PRIORITIZED;
                voipFeatures4.getClass();
                boolean a6 = bVar2.a(voipFeatures4);
                c.a aVar11 = conversationFactory.getExperiments().a.z;
                qcy<Object> qcyVar11 = qcyVarArr2[24];
                aVar11.b(Boolean.valueOf(a6));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsH265Prioritized ", a6)});
                }
                i = bVar2.i(VoipFeatures.ICE_CANDIDATE_POOL_SIZE);
                if (i != null && (b2 = i.b()) != null) {
                    int g4 = swe0.g(b2.intValue(), 1, 10);
                    a experiments2 = conversationFactory.getExperiments();
                    Integer valueOf3 = Integer.valueOf(g4);
                    c.a aVar12 = experiments2.a.S;
                    qcy<Object> qcyVar12 = qcyVarArr2[43];
                    aVar12.b(valueOf3);
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", lhg.a(g4, "setIceCandidatePoolSize ")});
                    }
                }
                VoipFeatures voipFeatures5 = VoipFeatures.LL_AUDIO;
                voipFeatures5.getClass();
                boolean a7 = bVar2.a(voipFeatures5);
                c.a aVar13 = conversationFactory.getExperiments().a.U;
                qcy<Object> qcyVar13 = qcyVarArr2[45];
                aVar13.b(Boolean.valueOf(a7));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsLowLatencyAudioEnabled ", a7)});
                }
                VoipFeatures voipFeatures6 = VoipFeatures.SIMULCAST;
                voipFeatures6.getClass();
                a = bVar2.a(voipFeatures6);
                VoipFeatures voipFeatures7 = VoipFeatures.SIMULCAST_SW_VP8;
                voipFeatures7.getClass();
                boolean a8 = bVar2.a(voipFeatures7);
                if (!a) {
                    a experiments3 = conversationFactory.getExperiments();
                    ExperimentsInterface.SimulcastState simulcastState = ExperimentsInterface.SimulcastState.ALL_SUPPORTED_CODEC;
                    c.a aVar14 = experiments3.a.G;
                    qcy<Object> qcyVar14 = qcyVarArr2[31];
                    aVar14.b(simulcastState);
                    nativeLibraryLoader.setSimulcastEnabled(true);
                } else if (a8) {
                    a experiments4 = conversationFactory.getExperiments();
                    ExperimentsInterface.SimulcastState simulcastState2 = ExperimentsInterface.SimulcastState.ONLY_SW_VP8;
                    c.a aVar15 = experiments4.a.G;
                    qcy<Object> qcyVar15 = qcyVarArr2[31];
                    aVar15.b(simulcastState2);
                    nativeLibraryLoader.setSimulcastEnabled(false);
                } else {
                    a experiments5 = conversationFactory.getExperiments();
                    ExperimentsInterface.SimulcastState simulcastState3 = ExperimentsInterface.SimulcastState.DISABLED;
                    c.a aVar16 = experiments5.a.G;
                    qcy<Object> qcyVar16 = qcyVarArr2[31];
                    aVar16.b(simulcastState3);
                    nativeLibraryLoader.setSimulcastEnabled(false);
                }
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setEnabledSimulcastForAllSupportedCodecs ", a)});
                }
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsSimulcastVP8Enabled ", a8)});
                }
                VoipFeatures voipFeatures8 = VoipFeatures.NO_DEPRECATED_WEBRTC_STAT;
                voipFeatures8.getClass();
                boolean a9 = bVar2.a(voipFeatures8);
                c.a aVar17 = conversationFactory.getExperiments().a.c0;
                qcy<Object> qcyVar17 = qcyVarArr2[53];
                aVar17.b(Boolean.valueOf(a9));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setDeprecatedStatDisabled ", a9)});
                }
                VoipFeatures voipFeatures9 = VoipFeatures.DISABLE_INBOUND_MEDIA_STAT_FIX;
                voipFeatures9.getClass();
                boolean z2 = !bVar2.a(voipFeatures9);
                c.a aVar18 = conversationFactory.getExperiments().a.h0;
                qcy<Object> qcyVar18 = qcyVarArr2[58];
                aVar18.b(Boolean.valueOf(z2));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsMediaStatFixEnabled ", z2)});
                }
                VoipFeatures voipFeatures10 = VoipFeatures.SNI_ENABLED;
                voipFeatures10.getClass();
                boolean a10 = bVar2.a(voipFeatures10);
                c.a aVar19 = conversationFactory.getExperiments().a.K;
                qcy<Object> qcyVar19 = qcyVarArr2[35];
                aVar19.b(Boolean.valueOf(a10));
                if (!L.m(loggerOutputTarget)) {
                    L.u(l, L.LogType.d, new Object[]{"ConversationFactoryCreator", zhy0.a("setIsSNIEnabled ", a10)});
                }
                conversationFactory.setFastScreenCaptureEnabled(true);
                conversationFactory.setDeviceAudioShareEnabled(true);
                conversationFactory.setShowLocalVideoInOriginalQuality(true);
                conversationFactory.setAsrOnlineEnabled(true);
                c.a aVar20 = conversationFactory.getExperiments().a.e;
                qcy<Object> qcyVar20 = qcyVarArr2[3];
                Boolean bool = Boolean.TRUE;
                aVar20.b(bool);
                c.a aVar21 = conversationFactory.getExperiments().a.f;
                qcy<Object> qcyVar21 = qcyVarArr2[4];
                aVar21.b(bool);
                c.a aVar22 = conversationFactory.getExperiments().a.g;
                qcy<Object> qcyVar22 = qcyVarArr2[5];
                aVar22.b(bool);
                c.a aVar23 = conversationFactory.getExperiments().a.q;
                qcy<Object> qcyVar23 = qcyVarArr2[15];
                aVar23.b(bool);
                a experiments6 = conversationFactory.getExperiments();
                SignalingTransport.FallbackParams fallbackParams = new SignalingTransport.FallbackParams(false, null, true, 0L, 11, null);
                c.a aVar24 = experiments6.a.r;
                qcy<Object> qcyVar24 = qcyVarArr2[16];
                aVar24.b(fallbackParams);
                c.a aVar25 = conversationFactory.getExperiments().a.P;
                qcy<Object> qcyVar25 = qcyVarArr2[40];
                aVar25.b(bool);
                c.a aVar26 = conversationFactory.getExperiments().a.J;
                qcy<Object> qcyVar26 = qcyVarArr2[34];
                aVar26.b(bool);
                c.a aVar27 = conversationFactory.getExperiments().a.M;
                qcy<Object> qcyVar27 = qcyVarArr2[37];
                aVar27.b(bool);
                c.a aVar28 = conversationFactory.getExperiments().a.T;
                qcy<Object> qcyVar28 = qcyVarArr2[44];
                aVar28.b(bool);
                c.a aVar29 = conversationFactory.getExperiments().a.X;
                qcy<Object> qcyVar29 = qcyVarArr2[c];
                aVar29.b(bool);
                c.a aVar30 = conversationFactory.getExperiments().a.R;
                qcy<Object> qcyVar30 = qcyVarArr2[42];
                aVar30.b(bool);
                c.a aVar31 = conversationFactory.getExperiments().a.Q;
                qcy<Object> qcyVar31 = qcyVarArr2[41];
                aVar31.b(bool);
                ClientCapabilities clientCapabilities = ClientCapabilities.Companion.getDefault().set(ClientCapabilities.Capability.SESSION_STATE_UPDATES, true);
                ClientCapabilities.Capability capability = ClientCapabilities.Capability.AUDIENCE_MODE;
                Features.Type type3 = Features.Type.FEATURE_VOIP_STEREO;
                type3.getClass();
                conversationFactory.setClientCapabilities(clientCapabilities.set(capability, bVar2.a(type3)));
                ConversationFactory.init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(nativeLibraryLoader.build()).build());
                g = ete0Var.a.g();
                b = g.b();
                if (g.a() && b != null && bd3.d(b)) {
                    try {
                        BreakpadBridge.initBreakpad(b);
                    } catch (Exception e) {
                        L.l("VoipCore", cqi.b(e, new StringBuilder("Unable initialize NativeCrashHandler with error=")));
                    }
                }
                conversationFactory.setAppVersion((String) com.vk.core.apps.a.d.getValue());
                return conversationFactory;
            }
        }
        qc1Var = null;
        if (qc1Var != null) {
        }
        if (!L.m(loggerOutputTarget)) {
        }
        if (g3 != null) {
            PcapLabelConfig pcapLabelConfig2 = new PcapLabelConfig(D, PcapLabelConfig.Source.AI_OPUS_BWE);
            c.a aVar82 = conversationFactory.getExperiments().a.W;
            qcy<Object> qcyVar82 = qcyVarArr2[47];
            aVar82.b(pcapLabelConfig2);
            if (!L.m(loggerOutputTarget)) {
            }
        }
        VoipFeatures voipFeatures22 = VoipFeatures.LINEAR_OPUS_BWE_ENABLED;
        voipFeatures22.getClass();
        boolean a42 = bVar2.a(voipFeatures22);
        c.a aVar92 = conversationFactory.getExperiments().a.A;
        qcy<Object> qcyVar92 = qcyVarArr2[25];
        aVar92.b(Boolean.valueOf(a42));
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures32 = VoipFeatures.ADAPTIVE_OPUS;
        voipFeatures32.getClass();
        boolean a52 = bVar2.a(voipFeatures32);
        c.a aVar102 = conversationFactory.getExperiments().a.B;
        qcy<Object> qcyVar102 = qcyVarArr2[26];
        aVar102.b(Boolean.valueOf(a52));
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures42 = VoipFeatures.H265_PRIORITIZED;
        voipFeatures42.getClass();
        boolean a62 = bVar2.a(voipFeatures42);
        c.a aVar112 = conversationFactory.getExperiments().a.z;
        qcy<Object> qcyVar112 = qcyVarArr2[24];
        aVar112.b(Boolean.valueOf(a62));
        if (!L.m(loggerOutputTarget)) {
        }
        i = bVar2.i(VoipFeatures.ICE_CANDIDATE_POOL_SIZE);
        if (i != null) {
            int g42 = swe0.g(b2.intValue(), 1, 10);
            a experiments22 = conversationFactory.getExperiments();
            Integer valueOf32 = Integer.valueOf(g42);
            c.a aVar122 = experiments22.a.S;
            qcy<Object> qcyVar122 = qcyVarArr2[43];
            aVar122.b(valueOf32);
            if (!L.m(loggerOutputTarget)) {
            }
        }
        VoipFeatures voipFeatures52 = VoipFeatures.LL_AUDIO;
        voipFeatures52.getClass();
        boolean a72 = bVar2.a(voipFeatures52);
        c.a aVar132 = conversationFactory.getExperiments().a.U;
        qcy<Object> qcyVar132 = qcyVarArr2[45];
        aVar132.b(Boolean.valueOf(a72));
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures62 = VoipFeatures.SIMULCAST;
        voipFeatures62.getClass();
        a = bVar2.a(voipFeatures62);
        VoipFeatures voipFeatures72 = VoipFeatures.SIMULCAST_SW_VP8;
        voipFeatures72.getClass();
        boolean a82 = bVar2.a(voipFeatures72);
        if (!a) {
        }
        if (!L.m(loggerOutputTarget)) {
        }
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures82 = VoipFeatures.NO_DEPRECATED_WEBRTC_STAT;
        voipFeatures82.getClass();
        boolean a92 = bVar2.a(voipFeatures82);
        c.a aVar172 = conversationFactory.getExperiments().a.c0;
        qcy<Object> qcyVar172 = qcyVarArr2[53];
        aVar172.b(Boolean.valueOf(a92));
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures92 = VoipFeatures.DISABLE_INBOUND_MEDIA_STAT_FIX;
        voipFeatures92.getClass();
        boolean z22 = !bVar2.a(voipFeatures92);
        c.a aVar182 = conversationFactory.getExperiments().a.h0;
        qcy<Object> qcyVar182 = qcyVarArr2[58];
        aVar182.b(Boolean.valueOf(z22));
        if (!L.m(loggerOutputTarget)) {
        }
        VoipFeatures voipFeatures102 = VoipFeatures.SNI_ENABLED;
        voipFeatures102.getClass();
        boolean a102 = bVar2.a(voipFeatures102);
        c.a aVar192 = conversationFactory.getExperiments().a.K;
        qcy<Object> qcyVar192 = qcyVarArr2[35];
        aVar192.b(Boolean.valueOf(a102));
        if (!L.m(loggerOutputTarget)) {
        }
        conversationFactory.setFastScreenCaptureEnabled(true);
        conversationFactory.setDeviceAudioShareEnabled(true);
        conversationFactory.setShowLocalVideoInOriginalQuality(true);
        conversationFactory.setAsrOnlineEnabled(true);
        c.a aVar202 = conversationFactory.getExperiments().a.e;
        qcy<Object> qcyVar202 = qcyVarArr2[3];
        Boolean bool2 = Boolean.TRUE;
        aVar202.b(bool2);
        c.a aVar212 = conversationFactory.getExperiments().a.f;
        qcy<Object> qcyVar212 = qcyVarArr2[4];
        aVar212.b(bool2);
        c.a aVar222 = conversationFactory.getExperiments().a.g;
        qcy<Object> qcyVar222 = qcyVarArr2[5];
        aVar222.b(bool2);
        c.a aVar232 = conversationFactory.getExperiments().a.q;
        qcy<Object> qcyVar232 = qcyVarArr2[15];
        aVar232.b(bool2);
        a experiments62 = conversationFactory.getExperiments();
        SignalingTransport.FallbackParams fallbackParams2 = new SignalingTransport.FallbackParams(false, null, true, 0L, 11, null);
        c.a aVar242 = experiments62.a.r;
        qcy<Object> qcyVar242 = qcyVarArr2[16];
        aVar242.b(fallbackParams2);
        c.a aVar252 = conversationFactory.getExperiments().a.P;
        qcy<Object> qcyVar252 = qcyVarArr2[40];
        aVar252.b(bool2);
        c.a aVar262 = conversationFactory.getExperiments().a.J;
        qcy<Object> qcyVar262 = qcyVarArr2[34];
        aVar262.b(bool2);
        c.a aVar272 = conversationFactory.getExperiments().a.M;
        qcy<Object> qcyVar272 = qcyVarArr2[37];
        aVar272.b(bool2);
        c.a aVar282 = conversationFactory.getExperiments().a.T;
        qcy<Object> qcyVar282 = qcyVarArr2[44];
        aVar282.b(bool2);
        c.a aVar292 = conversationFactory.getExperiments().a.X;
        qcy<Object> qcyVar292 = qcyVarArr2[c];
        aVar292.b(bool2);
        c.a aVar302 = conversationFactory.getExperiments().a.R;
        qcy<Object> qcyVar302 = qcyVarArr2[42];
        aVar302.b(bool2);
        c.a aVar312 = conversationFactory.getExperiments().a.Q;
        qcy<Object> qcyVar312 = qcyVarArr2[41];
        aVar312.b(bool2);
        ClientCapabilities clientCapabilities2 = ClientCapabilities.Companion.getDefault().set(ClientCapabilities.Capability.SESSION_STATE_UPDATES, true);
        ClientCapabilities.Capability capability2 = ClientCapabilities.Capability.AUDIENCE_MODE;
        Features.Type type32 = Features.Type.FEATURE_VOIP_STEREO;
        type32.getClass();
        conversationFactory.setClientCapabilities(clientCapabilities2.set(capability2, bVar2.a(type32)));
        ConversationFactory.init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(nativeLibraryLoader.build()).build());
        g = ete0Var.a.g();
        b = g.b();
        if (g.a()) {
            BreakpadBridge.initBreakpad(b);
        }
        conversationFactory.setAppVersion((String) com.vk.core.apps.a.d.getValue());
        return conversationFactory;
    }
}
