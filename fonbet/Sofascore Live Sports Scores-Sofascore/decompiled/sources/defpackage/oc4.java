package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.sofascore.localPersistence.database.AppDatabase;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class oc4 implements xff {
    public final mc4 a;
    public final ic4 b;
    public final pc4 c;
    public final int d;

    public oc4(mc4 mc4Var, ic4 ic4Var, pc4 pc4Var, int i) {
        this.a = mc4Var;
        this.b = ic4Var;
        this.c = pc4Var;
        this.d = i;
    }

    public final Object a() {
        ic4 ic4Var = this.b;
        pc4 pc4Var = this.c;
        mc4 mc4Var = this.a;
        int i = this.d;
        switch (i) {
            case 0:
                return new vj(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), pc4Var.a);
            case 1:
                return new q81(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get());
            case 2:
                Application s = pd0.s(mc4Var.c.b);
                return new qk1((wve) mc4Var.J.get(), pc4Var.a, s);
            case 3:
                return new eu1(pd0.s(mc4Var.c.b), (g39) mc4Var.N0.get());
            case 4:
                return new su1(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get(), (cg4) mc4Var.K0.get());
            case 5:
                return new dv1(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case 6:
                return new k92(pd0.s(mc4Var.c.b), (i92) pc4Var.i.get());
            case 7:
                return new i92(mc4Var.c.b, (c92) mc4Var.O0.get());
            case 8:
                return new pq2(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (s96) mc4Var.U.get(), (cs2) mc4Var.C.get(), (wqc) mc4Var.P0.get(), (fyk) mc4Var.Q.get(), pc4Var.a);
            case 9:
                return new br2(pd0.s(mc4Var.c.b), (cg4) mc4Var.K0.get(), (bfk) mc4Var.k.get());
            case 10:
                return new us2((cs2) mc4Var.C.get(), (s96) mc4Var.U.get(), (cs2) mc4Var.C.get(), (cg4) mc4Var.K0.get(), pd0.s(mc4Var.c.b), pc4Var.a);
            case 11:
                return new ku2(pd0.s(mc4Var.c.b), pc4Var.a, (vyh) pc4Var.n.get());
            case 12:
                return new vyh((NetworkCoroutineAPI) mc4Var.v.get());
            case 13:
                return new p63(mc4Var.c.b, (uwg) mc4Var.Q0.get(), (s96) mc4Var.U.get(), pc4Var.a);
            case 14:
                return new la3(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (vyh) pc4Var.n.get(), (vrj) mc4Var.f0.get(), (w3b) mc4Var.H.get(), (dhk) mc4Var.N.get());
            case 15:
                return new tr3(pd0.s(mc4Var.c.b), (e64) mc4Var.q0.get(), new mx8((e64) pc4Var.b.q0.get()));
            case 16:
                return new ks3(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), pc4Var.a);
            case 17:
                return new ov3(pd0.s(mc4Var.c.b), (SharedPreferences) mc4Var.l.get());
            case 18:
                return new w24(pd0.s(mc4Var.c.b), (e64) mc4Var.q0.get());
            case 19:
                Application s2 = pd0.s(mc4Var.c.b);
                mc4 mc4Var2 = pc4Var.b;
                return new q54(s2, new fp4((s96) mc4Var2.U.get(), (j0j) mc4Var2.I.get()), (e64) mc4Var.q0.get());
            case 20:
                return new n84((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case 21:
                return new ai4(pd0.s(mc4Var.c.b), pc4Var.a, (vyh) pc4Var.n.get(), (vrj) mc4Var.f0.get(), (w3b) mc4Var.H.get());
            case 22:
                return new q05(pd0.s(mc4Var.c.b), (p1f) mc4Var.M0.get(), (bfk) mc4Var.k.get(), (ti6) mc4Var.C0.get(), (SharedPreferences) mc4Var.l.get(), (AppDatabase) mc4Var.z.get(), (NetworkCoroutineAPI) mc4Var.B.get());
            case 23:
                return new kd5(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case 24:
                Application s3 = pd0.s(mc4Var.c.b);
                return new sh5((e64) mc4Var.q0.get(), pc4Var.a, s3);
            case 25:
                Application s4 = pd0.s(mc4Var.c.b);
                return new th5((e64) mc4Var.q0.get(), pc4Var.a, s4);
            case 26:
                return new di5((e64) mc4Var.q0.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 27:
                return new hi5((e64) mc4Var.q0.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 28:
                return new mr5(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get(), (s96) mc4Var.U.get(), (j0j) mc4Var.I.get(), (pai) mc4Var.R0.get(), (vrj) mc4Var.f0.get(), (e64) mc4Var.q0.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), (SharedPreferences) mc4Var.l.get(), (cg4) mc4Var.K0.get(), (bli) ic4Var.f.get(), mc4Var.a(), (s5d) mc4Var.F0.get(), pc4Var.a);
            case 29:
                return new t9c((NetworkCoroutineAPI) mc4Var.v.get(), (NetworkCoroutineAPI) mc4Var.B.get());
            case 30:
                return new xs5(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (SharedPreferences) mc4Var.l.get(), (bli) ic4Var.f.get());
            case 31:
                return new ct5((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 32:
                return new kv5((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 33:
                return new hw5((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 34:
                return new zw5((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 35:
                return new dz5(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (t9c) pc4Var.E.get(), (j0j) mc4Var.I.get(), (pai) mc4Var.R0.get(), (wve) mc4Var.J.get(), (w3b) mc4Var.H.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), (z3k) mc4Var.p0.get(), (SharedPreferences) mc4Var.l.get(), (fyk) mc4Var.Q.get(), (g39) mc4Var.N0.get(), (cg4) mc4Var.K0.get(), (e64) mc4Var.q0.get(), (zte) mc4Var.R.get());
            case 36:
                return new nz5(pd0.s(mc4Var.c.b), (zf5) mc4Var.S0.get(), (s96) mc4Var.U.get());
            case 37:
                return new p06(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (g39) mc4Var.N0.get(), (wi7) mc4Var.F.get(), (j0j) mc4Var.I.get(), (bfk) mc4Var.k.get());
            case 38:
                return new w06((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 39:
                return new n16((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 40:
                return new u16((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 41:
                return new r36(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get(), (iqk) mc4Var.T0.get());
            case 42:
                return new d46(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (j0j) mc4Var.I.get());
            case 43:
                return new p46((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 44:
                return new y46((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 45:
                return new b66(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (j0j) mc4Var.I.get());
            case 46:
                return new w66((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 47:
                return new bc6(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (g39) mc4Var.N0.get());
            case 48:
                return new mc6(pd0.s(mc4Var.c.b), (z3k) mc4Var.p0.get());
            case 49:
                return new nc6(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get(), pc4Var.a);
            case 50:
                return new yd6((s96) mc4Var.U.get(), pd0.s(mc4Var.c.b));
            case 51:
                return new lo6(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (SharedPreferences) mc4Var.l.get());
            case 52:
                Application s5 = pd0.s(mc4Var.c.b);
                return new hp6((wi7) mc4Var.F.get(), pc4Var.a, s5);
            case 53:
                return new cq6(pd0.s(mc4Var.c.b), pc4Var.a, (SharedPreferences) mc4Var.l.get(), (wi7) mc4Var.F.get(), (umd) mc4Var.r0.get());
            case 54:
                return new nr6(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get(), (tj7) pc4Var.f0.get());
            case 55:
                return new ky6(mc4Var.c.b, (wi7) mc4Var.F.get());
            case 56:
                return new tj7((s96) mc4Var.U.get(), (wi7) mc4Var.F.get());
            case 57:
                return new qr6((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 58:
                return new is6((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 59:
                return new pu6(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get(), (tj7) pc4Var.f0.get());
            case 60:
                return new xu6(pd0.s(mc4Var.c.b), pc4Var.a, (ru6) mc4Var.U0.get(), (wi7) mc4Var.F.get());
            case 61:
                Application s6 = pd0.s(mc4Var.c.b);
                return new cv6((wi7) mc4Var.F.get(), pc4Var.a, s6);
            case 62:
                return new mv6((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 63:
                return new yv6((wi7) mc4Var.F.get(), pd0.s(mc4Var.c.b));
            case 64:
                return new dw6((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 65:
                return new kw6((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 66:
                return new ax6(pc4Var.a, pd0.s(mc4Var.c.b), (ky6) pc4Var.e0.get());
            case 67:
                return new ay6(pd0.s(mc4Var.c.b), (wi7) mc4Var.F.get(), (bfk) mc4Var.k.get());
            case 68:
                return new jz6(pd0.s(mc4Var.c.b), (wi7) mc4Var.F.get(), (s96) mc4Var.U.get(), (tj7) pc4Var.f0.get());
            case 69:
                return new lz6(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (s96) mc4Var.U.get(), (tj7) pc4Var.f0.get());
            case 70:
                Application s7 = pd0.s(mc4Var.c.b);
                return new j07((wi7) mc4Var.F.get(), pc4Var.a, s7);
            case 71:
                Application s8 = pd0.s(mc4Var.c.b);
                return new p07((wi7) mc4Var.F.get(), (tj7) pc4Var.f0.get(), pc4Var.a, s8);
            case 72:
                Application s9 = pd0.s(mc4Var.c.b);
                return new y07((wi7) mc4Var.F.get(), pc4Var.a, s9);
            case TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER /* 73 */:
                Application s10 = pd0.s(mc4Var.c.b);
                return new e17((wi7) mc4Var.F.get(), pc4Var.a, s10);
            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                Application s11 = pd0.s(mc4Var.c.b);
                return new k17((wi7) mc4Var.F.get(), pc4Var.a, s11);
            case TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER /* 75 */:
                return new h27((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER /* 76 */:
                return new n27((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return new j37((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER /* 78 */:
                return new d47((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 79:
                return new m47((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 80:
                Application s12 = pd0.s(mc4Var.c.b);
                return new e57((wi7) mc4Var.F.get(), (tj7) pc4Var.f0.get(), pc4Var.a, s12);
            case 81:
                return new r57((wi7) mc4Var.F.get(), pc4Var.a);
            case 82:
                return new h67((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 83:
                return new r77(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get());
            case 84:
                Application s13 = pd0.s(mc4Var.c.b);
                return new n87((wi7) mc4Var.F.get(), pc4Var.a, s13);
            case 85:
                return new t97(pd0.s(mc4Var.c.b));
            case 86:
                Application s14 = pd0.s(mc4Var.c.b);
                return new ia7((wi7) mc4Var.F.get(), pc4Var.a, s14);
            case 87:
                Application s15 = pd0.s(mc4Var.c.b);
                return new ta7((wi7) mc4Var.F.get(), pc4Var.a, s15);
            case 88:
                return new ob7((wi7) mc4Var.F.get(), pd0.s(mc4Var.c.b));
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                return new wb7(pd0.s(mc4Var.c.b), pc4Var.a, (bfk) mc4Var.k.get(), (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get());
            case 90:
                Application s16 = pd0.s(mc4Var.c.b);
                return new gc7((wi7) mc4Var.F.get(), pc4Var.a, s16);
            case 91:
                Application s17 = pd0.s(mc4Var.c.b);
                return new yc7((wi7) mc4Var.F.get(), pc4Var.a, s17);
            case 92:
                return new te7((wi7) mc4Var.F.get(), (tj7) pc4Var.f0.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 93:
                return new if7((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case MBSupportMuteAdType.REWARD_VIDEO /* 94 */:
                Application s18 = pd0.s(mc4Var.c.b);
                return new gk7((wi7) mc4Var.F.get(), pc4Var.a, s18);
            case 95:
                return new ml7(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get());
            case 96:
                return new im7((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 97:
                return new tm7((wi7) mc4Var.F.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 98:
                Application s19 = pd0.s(mc4Var.c.b);
                return new ao7((wi7) mc4Var.F.get(), pc4Var.a, s19);
            case 99:
                return new vo7(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get(), (tj7) pc4Var.f0.get());
            default:
                throw new AssertionError(i);
        }
    }

    public final Object b() {
        ic4 ic4Var = this.b;
        pc4 pc4Var = this.c;
        mc4 mc4Var = this.a;
        int i = this.d;
        switch (i) {
            case 100:
                return new vp7(pd0.s(mc4Var.c.b), pc4Var.a, (wi7) mc4Var.F.get(), (ky6) pc4Var.e0.get());
            case 101:
                return new rr7(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), (wve) mc4Var.J.get(), (w3b) mc4Var.H.get(), (gzh) mc4Var.d0.get(), pc4Var.a);
            case 102:
                return new is7(pd0.s(mc4Var.c.b), mc4Var.a(), (j0j) mc4Var.I.get(), (w3b) mc4Var.H.get(), (gzh) mc4Var.d0.get());
            case 103:
                return new tu7(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), (cg4) mc4Var.K0.get(), pc4Var.a);
            case 104:
                return new nv7(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (w3b) mc4Var.H.get(), (umd) mc4Var.r0.get(), (SharedPreferences) mc4Var.l.get(), (amd) ic4Var.e.get());
            case 105:
                return new my7((m7c) mc4Var.o0.get(), (u8c) pc4Var.d1.get(), (qw7) mc4Var.V0.get(), (ith) pc4Var.e1.get(), (SharedPreferences) mc4Var.l.get(), mc4Var.c.b);
            case 106:
                return new u8c(mc4Var.c.b, (m7c) mc4Var.o0.get(), (s96) mc4Var.U.get(), (w3b) mc4Var.H.get(), (j0j) mc4Var.I.get(), (g39) mc4Var.N0.get(), (wve) mc4Var.J.get(), (t9c) pc4Var.E.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), (SharedPreferences) mc4Var.l.get());
            case 107:
                return new ith((dhk) mc4Var.N.get(), mc4Var.c.b, (SharedPreferences) mc4Var.l.get());
            case 108:
                return new qy7(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get());
            case 109:
                return new FollowSubStagesViewModel(pd0.s(mc4Var.c.b), (tak) mc4Var.L.get(), pc4Var.a);
            case 110:
                return new ga9(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case 111:
                return new ac9((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case 112:
                return new yta(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (sef) ic4Var.d.get(), (wi7) mc4Var.F.get(), mc4Var.a(), pc4Var.a, (kgl) mc4Var.W0.get());
            case 113:
                return new nua((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case ASSET_WRITE_ERROR_VALUE:
                return new kva(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (oi5) mc4Var.X0.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), (cg4) mc4Var.K0.get(), (aya) pc4Var.m1.get());
            case INVALID_INDEX_URL_VALUE:
                return new aya(mc4Var.c.b, (w3b) mc4Var.H.get());
            case GZIP_ENCODE_ERROR_VALUE:
                return new fwa((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case ASSET_FAILED_STATUS_CODE_VALUE:
                return new zwa((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                return new gya(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), pc4Var.a);
            case JSON_ENCODE_ERROR_VALUE:
                return new eza(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (cg4) mc4Var.K0.get());
            case 120:
                Application s = pd0.s(mc4Var.c.b);
                w3b w3bVar = (w3b) mc4Var.H.get();
                j0j j0jVar = (j0j) mc4Var.I.get();
                w3bVar.getClass();
                j0jVar.getClass();
                return new tza(s);
            case TPAT_ERROR_VALUE:
                return new o4b((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case INVALID_ADS_ENDPOINT_VALUE:
                return new xeb(pd0.s(mc4Var.c.b), (vyh) pc4Var.n.get(), (w3b) mc4Var.H.get(), (udl) mc4Var.S.get());
            case INVALID_RI_ENDPOINT_VALUE:
                return new njb(pd0.s(mc4Var.c.b), (qa6) mc4Var.K.get(), (bfk) mc4Var.k.get());
            case INVALID_LOG_ERROR_ENDPOINT_VALUE:
                return new ypb(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (cg4) mc4Var.K0.get(), (ru6) mc4Var.U0.get(), (wi7) mc4Var.F.get());
            case INVALID_METRICS_ENDPOINT_VALUE:
                return new zqb(pd0.s(mc4Var.c.b), (gzh) mc4Var.d0.get(), (vrj) mc4Var.f0.get(), (qa6) mc4Var.K.get(), (s96) mc4Var.U.get(), (ue9) mc4Var.Y0.get(), (ith) pc4Var.e1.get(), (cg4) mc4Var.K0.get(), (w3b) mc4Var.H.get(), mc4Var.a(), pc4Var.a);
            case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                return new esb(pd0.s(mc4Var.c.b), (zsb) mc4Var.Z0.get());
            case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                return new osb(pd0.s(mc4Var.c.b), (zsb) mc4Var.Z0.get());
            case 128:
                return new axb(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (fyk) mc4Var.Q.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get());
            case 129:
                return new dyb(pd0.s(mc4Var.c.b), (cg4) mc4Var.K0.get());
            case 130:
                return new e5c((u8c) pc4Var.d1.get(), (w3b) mc4Var.H.get());
            case MRAID_JS_WRITE_FAILED_VALUE:
                Application s2 = pd0.s(mc4Var.c.b);
                return new nlc((e64) mc4Var.q0.get(), pc4Var.a, s2);
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                return new emc(pd0.s(mc4Var.c.b));
            case OMSDK_JS_WRITE_FAILED_VALUE:
                return new nmc(pd0.s(mc4Var.c.b), pc4Var.a, (vrj) mc4Var.f0.get(), (s96) mc4Var.U.get());
            case 134:
                return new vmc(pd0.s(mc4Var.c.b), (wqc) mc4Var.P0.get());
            case 135:
                return new cnc(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (wqc) mc4Var.P0.get());
            case PRIVACY_URL_ERROR_VALUE:
                return new rnc(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), mc4Var.a(), pc4Var.a);
            case TPAT_RETRY_FAILED_VALUE:
                return new vnc(pd0.s(mc4Var.c.b), (pai) mc4Var.R0.get());
            case 138:
                return new znc(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get());
            case 139:
                return new ioc(pd0.s(mc4Var.c.b), (pai) mc4Var.R0.get());
            case 140:
                return new qoc(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get());
            case 141:
                return new fpc(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), mc4Var.a(), pc4Var.a);
            case 142:
                return new kpc((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case 143:
                return new vpc(pd0.s(mc4Var.c.b), (wqc) mc4Var.P0.get());
            case 144:
                return new aqc((w3b) mc4Var.H.get(), pd0.s(mc4Var.c.b));
            case 145:
                return new jqc(pd0.s(mc4Var.c.b), (fyk) mc4Var.Q.get());
            case 146:
                return new ebd((had) mc4Var.D0.get());
            case 147:
                return new yfd(pd0.s(mc4Var.c.b), pc4Var.a, (yhd) mc4Var.b0.get());
            case 148:
                return new khd(pd0.s(mc4Var.c.b), (yhd) mc4Var.b0.get(), (gzh) mc4Var.d0.get());
            case 149:
                return new OnboardingViewModel(pd0.s(mc4Var.c.b), pc4Var.a, (uwg) mc4Var.Q0.get(), (j0j) mc4Var.I.get(), (w3b) mc4Var.H.get(), (wve) mc4Var.J.get());
            case 150:
                return new b1e(pd0.s(mc4Var.c.b), (uwg) mc4Var.Q0.get());
            case 151:
                return new v1e(pd0.s(mc4Var.c.b), (lue) mc4Var.a1.get());
            case 152:
                return new y1e(pd0.s(mc4Var.c.b), pc4Var.a, (lue) mc4Var.a1.get());
            case 153:
                return new m2e(pd0.s(mc4Var.c.b), (lue) mc4Var.a1.get());
            case 154:
                return new r2e(pd0.s(mc4Var.c.b), pc4Var.a, (lue) mc4Var.a1.get());
            case 155:
                return new e3e(pd0.s(mc4Var.c.b), (lue) mc4Var.a1.get());
            case 156:
                return new ade((wve) mc4Var.J.get(), pc4Var.a, pd0.s(mc4Var.c.b));
            case 157:
                return new ple(pd0.s(mc4Var.c.b), (wve) mc4Var.J.get(), (wi7) mc4Var.F.get(), (t9c) pc4Var.E.get(), (sef) ic4Var.d.get(), (bfk) mc4Var.k.get(), mc4Var.a(), pc4Var.a);
            case 158:
                return new ome(pd0.s(mc4Var.c.b), (wve) mc4Var.J.get());
            case 159:
                Application s3 = pd0.s(mc4Var.c.b);
                wve wveVar = (wve) mc4Var.J.get();
                AppDatabase appDatabase = (AppDatabase) pc4Var.b.z.get();
                appDatabase.getClass();
                dvb i2 = appDatabase.i();
                w3a.q(i2);
                return new roe(s3, wveVar, new by9(i2), (e64) mc4Var.q0.get(), (pxe) pc4Var.f2.get());
            case 160:
                return new pxe(mc4Var.c.b, (wve) mc4Var.J.get());
            case 161:
                return new fqe(pd0.s(mc4Var.c.b), pc4Var.a, (wve) mc4Var.J.get(), (g39) mc4Var.N0.get(), (s96) mc4Var.U.get());
            case 162:
                return new qqe((wve) mc4Var.J.get());
            case 163:
                Application s4 = pd0.s(mc4Var.c.b);
                return new jre((wi7) mc4Var.F.get(), pc4Var.a, s4);
            case 164:
                return new gte(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get());
            case 165:
                return new nwe(pd0.s(mc4Var.c.b), (wve) mc4Var.J.get(), (w3b) mc4Var.H.get());
            case 166:
                return new f9f(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (dhk) mc4Var.N.get());
            case 167:
                return new q9f(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), (oi5) mc4Var.X0.get(), pc4Var.a);
            case 168:
                return new t9f(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), pc4Var.a);
            case 169:
                return new ebf(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), pc4Var.a);
            case 170:
                return new fbf(pd0.s(mc4Var.c.b), (fyk) mc4Var.Q.get(), pc4Var.a);
            case 171:
                return new sbf(pd0.s(mc4Var.c.b), (fta) mc4Var.b1.get(), (dhk) mc4Var.N.get(), (bfk) mc4Var.k.get());
            case 172:
                return new ybf(pd0.s(mc4Var.c.b), (a3l) mc4Var.k0.get(), (dhk) mc4Var.N.get(), (oi5) mc4Var.X0.get(), pc4Var.a);
            case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                return new mlf(pd0.s(mc4Var.c.b), (pai) mc4Var.R0.get());
            case 174:
                return new qlf(pd0.s(mc4Var.c.b), (pai) mc4Var.R0.get());
            case 175:
                return new jsf(pd0.s(mc4Var.c.b), (ctf) mc4Var.c1.get());
            case 176:
                return new rsf(pd0.s(mc4Var.c.b), (ctf) mc4Var.c1.get());
            case 177:
                return new zsf(pd0.s(mc4Var.c.b), (ctf) mc4Var.c1.get());
            case 178:
                return new vtf(pd0.s(mc4Var.c.b), (bli) ic4Var.f.get());
            case 179:
                return new buf(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), (cg4) mc4Var.K0.get());
            case 180:
                return new bxg(pd0.s(mc4Var.c.b), (uwg) mc4Var.Q0.get(), (s96) mc4Var.U.get());
            case 181:
                return new pyg(pd0.s(mc4Var.c.b), (wve) mc4Var.J.get(), (j0j) mc4Var.I.get(), pc4Var.a);
            case 182:
                return new mdh(pd0.s(mc4Var.c.b), pc4Var.a);
            case 183:
                return new kth(pd0.s(mc4Var.c.b), (dhk) mc4Var.N.get(), (SharedPreferences) mc4Var.l.get(), (ith) pc4Var.e1.get());
            case 184:
                return new a0i(pd0.s(mc4Var.c.b), (gzh) mc4Var.d0.get());
            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                return new g1i(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), mc4Var.a());
            case 186:
                return new r1i(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (vyh) pc4Var.n.get());
            case 187:
                return new d3i(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get());
            case 188:
                return new q3i(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get(), (j0j) mc4Var.I.get());
            case PsExtractor.PRIVATE_STREAM_1 /* 189 */:
                return new g4i(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (t9c) pc4Var.E.get(), (umd) mc4Var.r0.get(), (z3k) mc4Var.p0.get(), (amd) ic4Var.e.get(), (SharedPreferences) mc4Var.l.get(), pc4Var.a);
            case 190:
                return new n4i(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get(), (qa6) mc4Var.K.get(), (qa6) mc4Var.K.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get(), mc4Var.a());
            case 191:
                return new p5i(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get());
            case PsExtractor.AUDIO_STREAM /* 192 */:
                return new j6i(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get());
            case 193:
                return new h7i(pd0.s(mc4Var.c.b), pc4Var.a, (s96) mc4Var.U.get(), (vyh) pc4Var.n.get(), (tak) mc4Var.L.get());
            case 194:
                return new h8i(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), (s96) mc4Var.U.get(), mc4Var.a(), pc4Var.a);
            case 195:
                return new o8i(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get());
            case 196:
                return new rbi(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (qxj) mc4Var.d1.get(), (g39) mc4Var.N0.get());
            case 197:
                return new lci((bfk) mc4Var.k.get(), (s96) mc4Var.U.get(), (gzh) mc4Var.d0.get(), (SharedPreferences) mc4Var.l.get(), (cg4) mc4Var.K0.get(), pd0.s(mc4Var.c.b));
            case 198:
                return new aoi(pd0.s(mc4Var.c.b), (yni) pc4Var.S2.get());
            case 199:
                return new yni((NetworkCoroutineAPI) mc4Var.G.get());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.d;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        int i3 = 1;
        if (i2 == 1) {
            return b();
        }
        int i4 = 2;
        if (i2 != 2) {
            throw new AssertionError(i);
        }
        ic4 ic4Var = this.b;
        pc4 pc4Var = this.c;
        mc4 mc4Var = this.a;
        switch (i) {
            case 200:
                return new dsi();
            case 201:
                return new nui(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), (t9c) pc4Var.E.get(), (sef) ic4Var.d.get(), mc4Var.a(), pc4Var.a, (kgl) mc4Var.W0.get());
            case 202:
                return new pvi(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (j0j) mc4Var.I.get(), (umd) mc4Var.r0.get(), (amd) ic4Var.e.get());
            case 203:
                return new jwi(pd0.s(mc4Var.c.b), pc4Var.a);
            case 204:
                return new xwi(pd0.s(mc4Var.c.b), pc4Var.a, (j0j) mc4Var.I.get(), (cg4) mc4Var.K0.get());
            case 205:
                return new txi(pd0.s(mc4Var.c.b), (t9c) pc4Var.E.get());
            case 206:
                return new tyi((j0j) mc4Var.I.get(), pc4Var.a);
            case 207:
                Application s = pd0.s(mc4Var.c.b);
                return new y0j((w3b) mc4Var.H.get(), (j0j) mc4Var.I.get(), s);
            case INVALID_BID_PAYLOAD_VALUE:
                return new g2j(pc4Var.a, (j0j) mc4Var.I.get(), pd0.s(mc4Var.c.b));
            case INVALID_JSON_BID_PAYLOAD_VALUE:
                return new l2j(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), (w3b) mc4Var.H.get(), (qxj) mc4Var.d1.get(), (g39) mc4Var.N0.get());
            case AD_NOT_LOADED_VALUE:
                return new y2j(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case 211:
                return new n3j((w3b) mc4Var.H.get(), (j0j) mc4Var.I.get(), pd0.s(mc4Var.c.b));
            case PLACEMENT_SLEEP_VALUE:
                Application s2 = pd0.s(mc4Var.c.b);
                return new q3j(pc4Var.a, (j0j) mc4Var.I.get(), s2);
            case INVALID_ADUNIT_BID_PAYLOAD_VALUE:
                return new l4j(pc4Var.a, (j0j) mc4Var.I.get(), pd0.s(mc4Var.c.b));
            case INVALID_GZIP_BID_PAYLOAD_VALUE:
                return new klj(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case AD_RESPONSE_EMPTY_VALUE:
                return new qlj(pd0.s(mc4Var.c.b), pc4Var.a, (u8c) pc4Var.d1.get(), (t9c) pc4Var.E.get(), (qw7) mc4Var.V0.get());
            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                return new koj((w3b) mc4Var.H.get(), (j0j) mc4Var.I.get(), pd0.s(mc4Var.c.b));
            case AD_RESPONSE_TIMED_OUT_VALUE:
                Application s3 = pd0.s(mc4Var.c.b);
                fqg fqgVar = pc4Var.a;
                juj jujVar = juj.a;
                mc4 mc4Var2 = pc4Var.b;
                return new muj(s3, fqgVar, new d4a(awf.j(2, new Object[]{jujVar, new a3f((w3b) mc4Var2.H.get()), juj.b, new hbi((w3b) mc4Var2.H.get(), (g39) mc4Var2.N0.get())}, null), 20));
            case MRAID_JS_DOES_NOT_EXIST_VALUE:
                return new uvj((vyh) pc4Var.n.get(), (vrj) mc4Var.f0.get());
            case MRAID_JS_COPY_FAILED_VALUE:
                return new c0k(pd0.s(mc4Var.c.b), (vyh) pc4Var.n.get());
            case AD_RESPONSE_RETRY_AFTER_VALUE:
                return new k0k(pd0.s(mc4Var.c.b), (vyh) pc4Var.n.get());
            case AD_LOAD_FAIL_RETRY_AFTER_VALUE:
                return new n0k(pd0.s(mc4Var.c.b), (umd) mc4Var.r0.get());
            case INVALID_WATERFALL_PLACEMENT_ID_VALUE:
                return new u3k(pd0.s(mc4Var.c.b), (z3k) mc4Var.p0.get(), (a4k) pc4Var.q3.get());
            case STALE_CACHED_RESPONSE_VALUE:
                return new a4k((SharedPreferences) mc4Var.l.get(), (yea) mc4Var.G0.get());
            case 224:
                return new g4k(pd0.s(mc4Var.c.b), (s96) mc4Var.U.get(), (z3k) mc4Var.p0.get(), (a4k) pc4Var.q3.get());
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
                return new xdk(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (s96) mc4Var.U.get(), (bli) ic4Var.f.get());
            case PRIVACY_ICON_FALLBACK_ERROR_VALUE:
                return new agk(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (s96) mc4Var.U.get(), (dhk) mc4Var.N.get(), (bli) ic4Var.f.get(), (SharedPreferences) mc4Var.l.get(), pc4Var.a, (ith) pc4Var.e1.get(), (cg4) mc4Var.K0.get());
            case INVALID_CSB_DATA_VALUE:
                return new dnk(pd0.s(mc4Var.c.b), (unk) mc4Var.e1.get());
            case 228:
                return new onk(pd0.s(mc4Var.c.b), (unk) mc4Var.e1.get());
            case 229:
                return new aok(pd0.s(mc4Var.c.b), (unk) mc4Var.e1.get(), (s96) mc4Var.U.get());
            case 230:
                return new j3l(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (dhk) mc4Var.N.get(), (a3l) mc4Var.k0.get());
            case 231:
                return new p3l(pd0.s(mc4Var.c.b), (bfk) mc4Var.k.get(), (s96) mc4Var.U.get(), (umd) mc4Var.r0.get(), (fyk) mc4Var.Q.get(), (SharedPreferences) mc4Var.l.get(), (s5d) mc4Var.F0.get(), pc4Var.a);
            case 232:
                return new WeeklyChallengeViewModel(pd0.s(mc4Var.c.b), (a3l) mc4Var.k0.get(), (s96) mc4Var.U.get(), (fyk) mc4Var.Q.get(), (dhk) mc4Var.N.get(), (amd) ic4Var.e.get(), (SharedPreferences) mc4Var.l.get());
            case 233:
                return new l5l(pd0.s(mc4Var.c.b), (a3l) mc4Var.k0.get(), (fyk) mc4Var.Q.get(), pc4Var.a);
            case 234:
                return new qkl(pd0.s(mc4Var.c.b), (w3b) mc4Var.H.get(), (t9c) pc4Var.E.get(), (pai) mc4Var.R0.get(), (j0j) mc4Var.I.get(), (s96) mc4Var.U.get(), (cg4) mc4Var.K0.get(), (aya) pc4Var.m1.get(), (umd) mc4Var.r0.get(), (wi7) mc4Var.F.get(), (amd) ic4Var.e.get(), (SharedPreferences) mc4Var.l.get(), mc4Var.a(), (irk) mc4Var.P.get(), (kgl) mc4Var.W0.get());
            case 235:
                return new ill(pd0.s(mc4Var.c.b), (j0j) mc4Var.I.get(), (cg4) mc4Var.K0.get(), (tll) mc4Var.L0.get());
            case 236:
                return new nc4(this, 0);
            case 237:
                return new nc4(this, i3);
            case 238:
                return new nc4(this, i4);
            case 239:
                return new nc4(this, 3);
            case 240:
                return new nc4(this, 4);
            default:
                throw new AssertionError(i);
        }
    }
}
