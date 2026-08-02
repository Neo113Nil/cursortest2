package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import com.google.ads.interactivemedia.v3.impl.data.AdData;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialService;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks;
import com.google.android.gms.identitycredentials.internal.IdentityCredentialClientImpl;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzau;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.ads.zzry;
import com.google.android.gms.internal.ads.zzsf;
import com.google.android.gms.internal.ads.zzuc;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.U3;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gmo implements zgo, zzr, RemoteCall, zzgvc, hf, zzeb, n4p, zzsf, icp {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gmo(qc4 qc4Var) {
        this.a = 12;
        mxn mxnVar = new mxn(qc4Var, 17);
        this.b = u9n.a(new ohn(u9n.a(new yjo(u9n.a(new gvo(12, mxnVar, u9n.a(new muo(mxnVar, 5)))), u9n.a(new ohn(mxnVar, 7)), mxnVar)), 25));
    }

    @Override // defpackage.n4p
    public a5p a(Class cls) {
        for (int i = 0; i < 2; i++) {
            n4p n4pVar = ((n4p[]) this.b)[i];
            if (n4pVar.b(cls)) {
                return n4pVar.a(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.n4p
    public boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((n4p[]) this.b)[i].b(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zgo
    public void c(byte[] bArr, byte[] bArr2) {
        mmo mmoVar = (mmo) this.b;
        int i = mmoVar.k1;
        int i2 = mmoVar.n2;
        int i3 = mmoVar.u2;
        int i4 = (i & i2) ^ i3;
        int i5 = mmoVar.F2 ^ i2;
        int i6 = mmoVar.B1;
        int i7 = ((~mmoVar.F0) & i6) ^ mmoVar.H0;
        int i8 = ~i6;
        int i9 = mmoVar.s;
        int i10 = i9 & i8;
        int i11 = mmoVar.u;
        int i12 = i11 & i10;
        int i13 = (mmoVar.U0 & i6) ^ mmoVar.Z1;
        int i14 = mmoVar.a0;
        int i15 = i8 & i11;
        int i16 = ((mmoVar.k2 ^ ((~mmoVar.G0) & i6)) ^ ((~i13) & i14)) ^ mmoVar.r;
        mmoVar.r = i16;
        int i17 = mmoVar.p2;
        int i18 = ~i16;
        int i19 = i17 & i18;
        mmoVar.U0 = i19;
        mmoVar.G0 = (~i19) & i17;
        mmoVar.k2 = i16 ^ i17;
        int i20 = i16 & (~i17);
        mmoVar.l1 = i20;
        mmoVar.n = i20 | i17;
        int i21 = mmoVar.D ^ i15;
        int i22 = mmoVar.e;
        int i23 = ~i22;
        int i24 = mmoVar.A1 ^ (i21 & i23);
        int i25 = mmoVar.m;
        int i26 = (~i24) & i25;
        int i27 = (~i9) & i6;
        int i28 = i9 ^ (i11 & i27);
        int i29 = mmoVar.S0;
        int i30 = (~(i29 ^ ((i9 ^ (i11 & i6)) | i22))) & i25;
        int i31 = (((~(mmoVar.j0 ^ ((~mmoVar.Y1) & i6))) & i14) ^ i7) ^ mmoVar.f;
        mmoVar.f = i31;
        int i32 = mmoVar.v;
        int i33 = mmoVar.I1;
        int i34 = i33 & (i31 ^ i32);
        int i35 = i33 & i31;
        int i36 = i6 & i9;
        int i37 = i25 & (i12 ^ (i22 | i36));
        int i38 = ~i36;
        int i39 = i29 ^ ((i11 & i38) & i23);
        int i40 = i38 & i6;
        int i41 = (~i40) & i11;
        int i42 = i27 ^ i12;
        int i43 = ((i10 ^ i41) ^ (i42 & i23)) ^ i30;
        int i44 = mmoVar.K1;
        int i45 = (~i43) & i44;
        int i46 = ~i44;
        int i47 = (i28 ^ ((~i41) & i22)) ^ i26;
        int i48 = i47 | i44;
        int i49 = i47 & i44;
        int i50 = i40 ^ i15;
        int i51 = (i28 ^ (i22 | i50)) ^ i37;
        int i52 = (i51 ^ i45) ^ mmoVar.f2;
        mmoVar.f2 = i52;
        int i53 = mmoVar.j1;
        int i54 = (i51 ^ (i43 & i46)) ^ i53;
        mmoVar.z0 = i54;
        int i55 = i39 ^ (i25 & (((~i50) & i22) ^ i42));
        int i56 = mmoVar.X;
        int i57 = (i55 ^ i48) ^ i56;
        mmoVar.S0 = i57;
        int i58 = mmoVar.q1;
        int i59 = ~i58;
        int i60 = mmoVar.x0;
        int i61 = (i59 & i57) ^ i60;
        int i62 = mmoVar.t0;
        int i63 = ~i57;
        int i64 = mmoVar.d2 ^ (i62 & i63);
        int i65 = mmoVar.P;
        int i66 = ~i65;
        int i67 = i65 | (i62 ^ (i57 | i2));
        int i68 = mmoVar.a1;
        int i69 = i5 ^ (i68 & i57);
        int i70 = mmoVar.m0 ^ ((mmoVar.h ^ (i57 | mmoVar.W)) & i66);
        int i71 = i5 ^ (mmoVar.M0 & i63);
        int i72 = i3 ^ (i57 | mmoVar.o0);
        int i73 = (i2 ^ (i57 & (~mmoVar.W1))) ^ mmoVar.m1;
        int i74 = i65 | (mmoVar.E2 ^ (i58 & i63));
        int i75 = i68 ^ (i57 | mmoVar.A2);
        int i76 = i65 | (i60 ^ (mmoVar.v1 & i63));
        int i77 = i4 ^ (i57 | mmoVar.x1);
        int i78 = i65 | (mmoVar.e2 ^ (i57 | i5));
        int i79 = mmoVar.J ^ (i55 ^ i49);
        mmoVar.J = i79;
        int i80 = mmoVar.B;
        int i81 = i80 & i79;
        int i82 = (~i81) & i80;
        int i83 = i79 ^ i80;
        int i84 = i83 | i;
        int i85 = i79 | i80;
        int i86 = ~i80;
        mmoVar.x1 = i85 ^ (i | i81);
        mmoVar.a1 = i81;
        int i87 = i80 & (~i79);
        int i88 = mmoVar.y1;
        int i89 = i88 ^ (i56 | i88);
        int i90 = (mmoVar.d1 ^ (mmoVar.f0 & i89)) ^ mmoVar.p0;
        int i91 = (mmoVar.u0 & (i89 ^ mmoVar.D0)) ^ mmoVar.n1;
        int i92 = mmoVar.H;
        int i93 = (i90 ^ ((~i91) & i92)) ^ mmoVar.o;
        int i94 = mmoVar.i0;
        int i95 = i93 | i94;
        int i96 = mmoVar.w;
        int i97 = i96 & i93;
        int i98 = i95 | i96;
        int i99 = mmoVar.X0;
        int i100 = ~mmoVar.z;
        int i101 = (mmoVar.R1 ^ (i53 & (mmoVar.g0 ^ (i99 & i100)))) ^ mmoVar.I0;
        mmoVar.I0 = i101;
        int i102 = mmoVar.W0;
        int i103 = ~i101;
        int i104 = mmoVar.b;
        int i105 = i104 ^ (i102 & i103);
        int i106 = mmoVar.s0;
        int i107 = mmoVar.y;
        int i108 = i107 & (~(i105 ^ (i106 & i105)));
        int i109 = i106 | i105;
        int i110 = i101 | i102;
        int i111 = mmoVar.L0;
        int i112 = (i111 ^ i110) | i106;
        int i113 = mmoVar.G;
        int i114 = i107 & (i113 ^ i112);
        int i115 = i104 ^ (i101 | i113);
        int i116 = i106 & i115;
        int i117 = i115 | i106;
        int i118 = i113 & i103;
        int i119 = ~i106;
        int i120 = mmoVar.N0;
        int i121 = (i120 ^ i110) ^ i117;
        int i122 = mmoVar.y2;
        int i123 = i122 | (i121 ^ (i107 & i121));
        int i124 = i107 & ((i104 ^ (i120 & i103)) ^ (i118 & i119));
        int i125 = i106 & (~i110);
        int i126 = i106 & i110;
        int i127 = mmoVar.e1 & i103;
        int i128 = i107 & (~i127);
        int i129 = ((i127 ^ (i110 & i119)) ^ i114) | i122;
        int i130 = i107 & (~(i127 ^ mmoVar.C1));
        int i131 = i107 & ((i113 ^ i118) ^ i109);
        int i132 = i104 ^ i118;
        int i133 = i101 | mmoVar.Q;
        int i134 = i104 ^ i133;
        int i135 = ~i122;
        int i136 = (i113 ^ (i104 & i103)) ^ i106;
        int i137 = i113 ^ i133;
        int i138 = i85 & i86;
        int i139 = (((i105 ^ i125) ^ (i107 & (i137 ^ i126))) ^ i129) ^ mmoVar.t;
        mmoVar.t = i139;
        int i140 = i79 & i86;
        int i141 = ~i139;
        int i142 = i81 & i141;
        int i143 = ~i;
        int i144 = i139 | i138;
        mmoVar.d1 = (i140 ^ i144) ^ ((i81 ^ i142) & i143);
        int i145 = ((i134 ^ i109) ^ i130) & i135;
        int i146 = i132 & i119;
        int i147 = i80 ^ (i83 & i141);
        int i148 = i | (i140 ^ (i139 | i81));
        mmoVar.f0 = i147 ^ (i | (i82 ^ i142));
        int i149 = i140 & i141;
        mmoVar.e2 = i147 ^ ((i79 ^ i149) & i143);
        int i150 = i79 & i141;
        mmoVar.o1 = i79 ^ i150;
        int i151 = i139 | i79;
        int i152 = i85 ^ i151;
        mmoVar.d2 = i85 ^ (i & i152);
        mmoVar.z2 = (i85 ^ (i139 | i85)) & i143;
        int i153 = i87 ^ i149;
        mmoVar.o0 = i152 ^ (i | i153);
        mmoVar.n2 = (i79 ^ i144) ^ (i153 & i143);
        mmoVar.W0 = i81 ^ (i & (~(i81 ^ i139)));
        int i154 = i79 ^ (i139 | i80);
        mmoVar.X0 = i154 ^ i;
        mmoVar.Z1 = i & i154;
        mmoVar.M0 = (i138 ^ i151) ^ i84;
        mmoVar.N0 = i150 ^ i148;
        mmoVar.x0 = (i80 ^ i150) ^ i;
        int i155 = (((i137 ^ i116) ^ i128) ^ i123) ^ mmoVar.p;
        mmoVar.p = i155;
        int i156 = mmoVar.N;
        int i157 = i156 ^ i155;
        mmoVar.h = i157;
        int i158 = ~i156;
        int i159 = i155 & i156;
        int i160 = mmoVar.x;
        int i161 = ~i160;
        int i162 = (((i137 ^ i146) ^ i124) ^ i145) ^ mmoVar.L;
        mmoVar.L = i162;
        int i163 = i162 ^ i31;
        int i164 = i162 & i31;
        int i165 = (~i164) & i31;
        int i166 = (i163 ^ (i32 | i165)) ^ i35;
        int i167 = ~i32;
        int i168 = i31 ^ (i32 | i164);
        int i169 = ~i162;
        int i170 = i31 & i169 & i167;
        int i171 = i170 ^ i34;
        int i172 = i33 & (~(i163 ^ i170));
        int i173 = i33 & (i162 ^ i170);
        int i174 = i33 & (i164 ^ (i32 | i162));
        int i175 = i31 | i162;
        int i176 = ~i31;
        int i177 = (i175 ^ (i32 | (i175 & i176))) ^ i34;
        int i178 = i33 & (~(i165 ^ ((i162 & i176) & i167)));
        int i179 = ((i136 ^ i108) ^ ((((i104 ^ (i101 | i111)) ^ mmoVar.O1) ^ i131) | i122)) ^ mmoVar.h2;
        mmoVar.h2 = i179;
        mmoVar.g0 = i179 & i16;
        mmoVar.R1 = i179 & i18;
        int i180 = ((((mmoVar.R & i100) ^ mmoVar.G2) | i53) ^ mmoVar.h1) ^ mmoVar.E;
        mmoVar.E = i180;
        int i181 = mmoVar.k0;
        int i182 = i181 | i180;
        int i183 = ~i181;
        int i184 = mmoVar.M;
        int i185 = i180 & i183;
        int i186 = mmoVar.c0;
        int i187 = (~(i184 ^ i185)) & i186;
        int i188 = i93 | i180;
        int i189 = i94 & i180;
        int i190 = ~i93;
        int i191 = i94 ^ i180;
        int i192 = i93 | i191;
        int i193 = i180 | i184;
        int i194 = i181 | i193;
        mmoVar.T1 = i186 & i185;
        int i195 = ~i180;
        int i196 = i184 & i195;
        mmoVar.s2 = i196 & i183;
        int i197 = i186 & (i196 ^ i185);
        mmoVar.A2 = i197;
        int i198 = i180 ^ i184;
        mmoVar.i1 = i198;
        int i199 = i181 | i198;
        mmoVar.o2 = i199;
        int i200 = mmoVar.U;
        mmoVar.a2 = i200 | (i198 ^ (i198 & i183));
        mmoVar.e0 = (i199 & (~i186)) ^ i181;
        int i201 = ~i200;
        int i202 = i198 ^ i181;
        int i203 = i200 | (i193 ^ ((~i202) & i186));
        int i204 = mmoVar.B0 ^ i202;
        int i205 = i184 ^ i199;
        int i206 = i180 ^ mmoVar.C;
        int i207 = i180 | i94;
        int i208 = i207 ^ i93;
        int i209 = i93 | i207;
        int i210 = i180 & (~i94);
        int i211 = i96 & (~(i210 ^ i192));
        int i212 = (i210 ^ (i210 & i190)) ^ i97;
        int i213 = i96 & (i210 ^ i95);
        int i214 = i180 & (~i210);
        int i215 = i96 & (~i214);
        int i216 = (i189 & i190) ^ (i96 & i214);
        int i217 = i184 | i216;
        int i218 = ~i184;
        int i219 = i98 ^ (i216 & i218);
        int i220 = mmoVar.g;
        int i221 = i69 & i66;
        int i222 = i64 & i66;
        int i223 = (i162 ^ (i164 & i167)) ^ i174;
        int i224 = (i165 ^ (i162 & i167)) ^ i172;
        int i225 = i61 ^ i222;
        int i226 = i214 ^ i93;
        int i227 = i220 & (~(i212 ^ (((i191 ^ (i93 | i210)) ^ (i96 & i226)) & i218)));
        int i228 = i94 & i195;
        int i229 = i96 & (~i228);
        int i230 = i190 & i228;
        int i231 = i191 ^ i230;
        int i232 = (((i231 ^ (i96 & (i191 ^ i95))) ^ i217) ^ (i220 & i219)) ^ i92;
        mmoVar.H = i232;
        int i233 = i226 ^ i213;
        mmoVar.c1 = (i225 ^ (i232 & (i75 ^ i74))) ^ mmoVar.c1;
        int i234 = ~(i72 ^ i221);
        int i235 = mmoVar.a;
        int i236 = ((i71 ^ i76) ^ (i232 & i234)) ^ i235;
        mmoVar.t0 = i236;
        int i237 = ((i77 ^ i78) ^ (i232 & i67)) ^ i6;
        mmoVar.B1 = i237;
        int i238 = (i73 ^ (i232 & (~i70))) ^ i93;
        mmoVar.W = i238;
        int i239 = i228 ^ i95;
        int i240 = (i93 | i228) ^ i215;
        int i241 = ((i220 & (~(i188 ^ (i184 | (mmoVar.V ^ (i207 ^ i230)))))) ^ ((i208 ^ i215) ^ (((i94 ^ i230) ^ i229) & i218))) ^ mmoVar.g2;
        mmoVar.g2 = i241;
        int i242 = (i168 ^ i178) ^ ((~i171) & i241);
        mmoVar.F0 = i242;
        int i243 = (~i52) & i241;
        int i244 = i52 | i243;
        int i245 = i224 ^ ((~i177) & i241);
        mmoVar.Y1 = i245;
        int i246 = i241 & i52;
        int i247 = i241 | i52;
        int i248 = i162 & (~i247);
        int i249 = (~i241) & i52;
        int i250 = ~i249;
        int i251 = i52 & i250;
        int i252 = i162 | i251;
        int i253 = i162 & i250;
        int i254 = i241 ^ i52;
        int i255 = (i168 ^ i173) ^ ((~i223) & i241);
        mmoVar.m0 = i255;
        int i256 = i166 ^ ((~(i32 ^ i174)) & i241);
        mmoVar.A1 = i256;
        int i257 = i96 | i228;
        int i258 = i180 | i228;
        int i259 = ((i233 ^ (i184 | ((i258 ^ i188) ^ i211))) ^ i227) ^ mmoVar.d0;
        mmoVar.d0 = i259;
        int i260 = mmoVar.F;
        int i261 = (~i260) & i259;
        int i262 = i261 ^ i156;
        int i263 = mmoVar.x2;
        int i264 = (~i262) & i263;
        int i265 = ((~(i260 ^ (i261 & i158))) & i263) | i179;
        int i266 = i156 | i261;
        int i267 = i263 | i266;
        int i268 = i261 ^ mmoVar.J2;
        int i269 = ~i263;
        int i270 = i260 | i261;
        int i271 = mmoVar.C2 ^ (i263 & i270);
        int i272 = i259 | i260;
        int i273 = i156 | i272;
        int i274 = ~i179;
        int i275 = (i272 ^ mmoVar.q0) & i263;
        int i276 = i179 | (i266 ^ i275);
        int i277 = i260 & (~i259);
        int i278 = i156 | i277;
        int i279 = i277 & i158;
        int i280 = i259 ^ i279;
        int i281 = i280 ^ mmoVar.l2;
        int i282 = i279 ^ mmoVar.p1;
        int i283 = ~i54;
        int i284 = i272 ^ i266;
        int i285 = i54 | (((i277 ^ (i270 & i158)) ^ i275) ^ ((i284 ^ (i268 & i269)) & i274));
        int i286 = i263 & (i277 ^ i156);
        int i287 = i277 ^ i278;
        int i288 = i54 | ((i287 ^ i286) ^ ((i287 ^ ((i272 ^ i156) & i263)) & i274));
        int i289 = (i284 ^ (i287 & i269)) | i179;
        int i290 = i260 ^ (i156 | (i259 ^ i260));
        int i291 = (i280 ^ ((~(i156 | i259)) & i263)) | i179;
        int i292 = i259 & i260;
        mmoVar.K1 = ((i281 ^ ((i273 ^ ((~(i292 ^ i278)) & i263)) & i274)) ^ i285) ^ i44;
        int i293 = mmoVar.I2 ^ i292;
        int i294 = (((i284 ^ ((~i293) & i263)) ^ i291) ^ i288) ^ i94;
        mmoVar.i0 = i294;
        int i295 = ~i237;
        int i296 = i294 & i295;
        int i297 = i237 ^ i296;
        int i298 = i292 ^ i279;
        int i299 = i159 & i161;
        int i300 = mmoVar.i ^ (((i293 ^ i267) ^ i265) ^ (i54 | (i271 ^ ((i298 ^ i264) & i274))));
        mmoVar.i = i300;
        int i301 = ~i236;
        int i302 = i236 | i300;
        int i303 = i300 & i236;
        int i304 = (~i303) & i236;
        int i305 = i300 ^ i236;
        int i306 = (~i300) & i236;
        mmoVar.P1 ^= ((i290 ^ (i263 & (~i298))) ^ i289) ^ ((i282 ^ i276) & i283);
        int i307 = i220 & (~(i240 ^ ((i239 ^ (i96 & i258)) & i218)));
        int i308 = (((i231 ^ i257) ^ ((i210 ^ i209) & i218)) ^ i307) ^ mmoVar.Z;
        mmoVar.Z = i308;
        int i309 = ~i308;
        mmoVar.z1 = i79 & i309;
        mmoVar.Q = (i308 | i79) & i176;
        int i310 = i180 & i218;
        int i311 = i310 ^ (i193 & i183);
        int i312 = i186 & i311;
        int i313 = i310 ^ i194;
        int i314 = ((i204 ^ i203) ^ (i235 & ((i313 ^ ((~i311) & i186)) ^ ((i205 ^ i187) & i201)))) ^ mmoVar.R0;
        mmoVar.R0 = i314;
        int i315 = ~i314;
        int i316 = i241 & i315;
        int i317 = i52 ^ i316;
        int i318 = i162 & (~i317);
        int i319 = i162 & i317;
        int i320 = i317 ^ i252;
        int i321 = i254 & i315;
        int i322 = i162 & (~i321);
        int i323 = i247 ^ (i314 | i52);
        int i324 = mmoVar.H1;
        int i325 = i324 & (i323 ^ i248);
        int i326 = i155 & i315;
        int i327 = (i314 ^ i326) ^ i160;
        int i328 = i246 & i315;
        int i329 = i156 | i314;
        int i330 = i155 & (~i329);
        int i331 = i329 ^ i155;
        int i332 = i324 & (i331 ^ i299);
        int i333 = i254 ^ i314;
        int i334 = i324 & ((i243 ^ i328) ^ (i162 & (~i333)));
        int i335 = i314 | i251;
        int i336 = i162 & (i244 ^ i316);
        int i337 = i156 & i315;
        int i338 = i337 & i160;
        int i339 = i155 & i337;
        int i340 = i155 & (~i337);
        int i341 = i157 ^ (i337 & i161);
        int i342 = i314 | i337;
        int i343 = i160 & i342;
        int i344 = i160 & (~i342);
        int i345 = i156 ^ (i155 & i342);
        int i346 = i260 & (~(i341 ^ (i324 & i345)));
        int i347 = (i327 ^ (i324 & (~((i329 ^ i330) ^ i344)))) & i260;
        int i348 = i155 & i156 & i314;
        int i349 = i324 & (~((i329 ^ i348) ^ i344));
        int i350 = (i331 ^ i338) ^ (i324 & ((i314 ^ i348) ^ i343));
        mmoVar.c = i350;
        int i351 = i300 & i301;
        int i352 = i155 & i158;
        int i353 = i324 & (~(i162 & (i52 ^ i321)));
        int i354 = i337 ^ i326;
        mmoVar.h1 = i354;
        int i355 = i314 ^ i318;
        int i356 = i314 ^ i340;
        int i357 = i244 ^ (i314 | i241);
        int i358 = i324 & (~(i335 ^ (i162 & (~i357))));
        int i359 = mmoVar.T;
        int i360 = ~i359;
        int i361 = ((i357 ^ i253) ^ i325) | i359;
        int i362 = i249 & i315;
        int i363 = (i156 ^ i314) ^ i160;
        int i364 = i260 & (~((i356 ^ (i160 & (i314 ^ i352))) ^ i349));
        int i365 = i359 | (i324 & (~((i246 ^ (i314 | i254)) ^ i336)));
        int i366 = ((((i249 ^ (i314 | i243)) ^ i319) ^ i334) ^ ((i355 ^ i358) & i360)) ^ mmoVar.q;
        mmoVar.q = i366;
        int i367 = i302 ^ i366;
        int i368 = i302 ^ (i366 | i300);
        int i369 = i366 | i236;
        int i370 = ~i366;
        int i371 = i300 & i370;
        int i372 = i236 & i370;
        int i373 = i305 ^ i372;
        int i374 = i303 ^ i369;
        int i375 = i305 ^ i371;
        int i376 = i305 ^ i366;
        int i377 = i366 | i305;
        int i378 = i305 & i370;
        int i379 = i300 ^ i378;
        int i380 = i305 ^ i378;
        int i381 = i303 ^ i372;
        int i382 = i236 ^ i366;
        int i383 = i324 & (~((i241 ^ i316) & i169));
        int i384 = i324 & (~((i314 ^ (i155 & i314)) & i161));
        mmoVar.y2 = ((((i243 ^ i362) ^ (i162 & (~(i251 ^ i328)))) ^ i383) ^ i365) ^ i122;
        int i385 = i314 & i158;
        int i386 = i337 ^ (i155 & i385);
        mmoVar.G1 = i386;
        int i387 = i385 & i160;
        int i388 = ((i363 ^ (i324 & (~(i345 ^ i387)))) ^ i346) ^ i9;
        mmoVar.s = i388;
        int i389 = i388 & i237;
        int i390 = i389 ^ i294;
        int i391 = i294 & i389;
        int i392 = i388 ^ i237;
        int i393 = i392 ^ i294;
        int i394 = ~i388;
        int i395 = i294 & i394;
        int i396 = i394 & i237;
        mmoVar.N1 = i396 ^ (i294 & i396);
        int i397 = i351 ^ i377;
        int i398 = i351 ^ i369;
        int i399 = i294 & (~i396);
        int i400 = i396 ^ i296;
        int i401 = i388 & i295;
        int i402 = i237 | i401;
        int i403 = i294 & i402;
        int i404 = i237 ^ i403;
        int i405 = i294 & (~i401);
        int i406 = i401 ^ i296;
        int i407 = i294 & i388;
        mmoVar.b0 = i396;
        int i408 = i333 ^ i322;
        int i409 = i388 | i237;
        mmoVar.V0 = i409;
        int i410 = i294 & (~i409);
        int i411 = i237 & (~i389);
        int i412 = i314 & (~i385);
        int i413 = i157 ^ (i160 & (~(i412 ^ i339)));
        mmoVar.q1 = i413;
        int i414 = i413 ^ i332;
        mmoVar.u2 = i414;
        mmoVar.b2 = (i414 ^ i364) ^ i186;
        int i415 = i324 & (i354 ^ (i160 & (~i412)));
        int i416 = i386 ^ i387;
        mmoVar.p1 = i416;
        mmoVar.Y = (i350 ^ (i260 & (~(i415 ^ i416)))) ^ mmoVar.Y;
        int i417 = i157 ^ (i314 & i161);
        mmoVar.K = i417;
        int i418 = ((i417 ^ i384) ^ i347) ^ i113;
        mmoVar.G = i418;
        mmoVar.w1 = i368 ^ (i381 & i418);
        mmoVar.v2 = i382 ^ (i418 & i380);
        mmoVar.A = i376 ^ (i418 & i302);
        mmoVar.v1 = i375 ^ ((~i397) & i418);
        mmoVar.E0 = i379 ^ ((~(i304 ^ i372)) & i418);
        mmoVar.L0 = i374 ^ (i351 & i418);
        mmoVar.k = i306 ^ ((~i373) & i418);
        mmoVar.X = (i300 ^ (i366 | i302)) ^ ((~i302) & i418);
        mmoVar.D0 = i368 ^ (i418 & i373);
        mmoVar.u0 = i368 ^ (i418 & i306);
        mmoVar.B2 = i371 & i418;
        mmoVar.V = i418 | i367;
        mmoVar.H0 = i303 ^ ((~i398) & i418);
        mmoVar.V1 = i373 ^ ((~i418) & i373);
        int i419 = i408 ^ i353;
        int i420 = (i199 ^ (i186 & i196)) & i201;
        int i421 = i241 ^ i362;
        int i422 = (i419 ^ ((i421 ^ (i324 & (i421 ^ i162))) & i360)) ^ i96;
        mmoVar.w = i422;
        int i423 = ~i422;
        mmoVar.y1 = i238 & i423;
        mmoVar.R = i238 ^ i422;
        int i424 = ((i320 ^ (i324 & (~(i323 ^ (i162 & (~(i247 ^ (i243 & i315)))))))) ^ i361) ^ i22;
        mmoVar.e = i424;
        int i425 = ~i424;
        mmoVar.z = i409 & i425;
        mmoVar.y0 = i388 ^ (i411 | i424);
        mmoVar.C1 = i392 ^ (i388 & i425);
        mmoVar.I = i388 ^ (i392 & i425);
        mmoVar.q0 = i392 ^ (i237 & i425);
        mmoVar.p0 = i389 ^ (i424 | i389);
        mmoVar.o = i388 ^ (i424 | i237);
        mmoVar.F2 = i392 ^ (i396 & i425);
        mmoVar.O1 = i424 | i392;
        mmoVar.l2 = i392 ^ (i424 | i409);
        mmoVar.J0 = i401 ^ (i389 & i425);
        mmoVar.G2 = i235 & ((i200 | (i206 ^ ((i310 ^ i185) & i186))) ^ ((i180 ^ (i310 & i183)) ^ i312));
        int i426 = i180 & i184;
        mmoVar.n1 = i426;
        int i427 = ((i420 ^ ((i193 ^ i185) ^ ((~(i426 ^ i182)) & i186))) ^ (i235 & (~((i200 | (i313 ^ i197)) ^ (i199 ^ ((i198 ^ (i426 & i183)) & i186)))))) ^ mmoVar.r2;
        mmoVar.r2 = i427;
        int i428 = (i427 ^ i81) & i309;
        int i429 = i308 | i427;
        int i430 = ~i427;
        int i431 = i79 & i430;
        int i432 = i79 & i427;
        int i433 = ~i432;
        int i434 = i80 & i433;
        int i435 = i80 & i432;
        int i436 = i433 & i427;
        int i437 = i80 & (~i436);
        int i438 = i308 | (i436 ^ i434);
        int i439 = i432 ^ i80;
        mmoVar.r1 = i31 | ((i434 & i309) ^ i439);
        int i440 = i409 ^ i399;
        int i441 = i409 ^ i405;
        int i442 = i308 | (i79 ^ i434);
        int i443 = i79 | i427;
        int i444 = i443 & i430;
        int i445 = i80 & (~i444);
        mmoVar.f1 = i308 | i444;
        mmoVar.H2 = (i444 ^ (i80 & i431)) ^ i429;
        int i446 = i308 & (~(i427 ^ (i80 & i443)));
        int i447 = i443 ^ i81;
        mmoVar.h0 = i447;
        int i448 = i445 ^ i431;
        int i449 = i439 ^ i442;
        int i450 = i389 ^ i403;
        int i451 = i402 ^ i395;
        int i452 = i396 ^ i399;
        mmoVar.C = ((i447 ^ i438) & i176) ^ i449;
        mmoVar.e1 = i80 & i430;
        mmoVar.s0 = (i255 ^ (i245 & i430)) ^ i106;
        int i453 = (i256 ^ (i242 & i427)) ^ i14;
        mmoVar.a0 = i453;
        mmoVar.Q1 = i406 ^ (i451 | i453);
        int i454 = ~i453;
        mmoVar.m1 = i400 ^ ((i392 ^ i395) & i454);
        mmoVar.I2 = i453 & i390;
        mmoVar.U1 = (i390 | i453) ^ i440;
        mmoVar.K0 = (i294 & i454) ^ i451;
        mmoVar.q2 = (i396 ^ i391) ^ i453;
        mmoVar.c2 = i453 & i450;
        mmoVar.E1 = ((i401 ^ i395) & i454) ^ i441;
        mmoVar.O = i393 ^ (i453 & i452);
        mmoVar.C2 = (i297 | i453) ^ i410;
        mmoVar.t2 = i452 ^ (i404 | i453);
        mmoVar.A0 = i393 ^ (i237 & i454);
        mmoVar.Y0 = i392 ^ (i407 & i454);
        mmoVar.W1 = i427 ^ i87;
        mmoVar.X1 = i80 & i427;
        int i455 = i79 ^ i427;
        mmoVar.D = i455;
        int i456 = ((i455 & i308) ^ i448) & i176;
        int i457 = i308 | ((i80 & (~i455)) ^ i455);
        int i458 = i31 | (i443 ^ i457);
        int i459 = mmoVar.S1;
        mmoVar.B0 = (i448 ^ (i31 | (i435 ^ i457))) | i459;
        int i460 = (((i455 ^ i437) ^ i428) ^ i456) | i459;
        int i461 = i455 ^ i80;
        mmoVar.E2 = i461;
        int i462 = (((i446 ^ i461) ^ i458) ^ i460) ^ i220;
        mmoVar.g = i462;
        int i463 = i462 & i423;
        mmoVar.T0 = i463;
        int i464 = i238 & (~(i238 & (~i462)));
        mmoVar.j0 = i464;
        mmoVar.j1 = i464 ^ i422;
        mmoVar.g1 = i422 | i464;
        int i465 = i462 & i238;
        mmoVar.J2 = i465;
        mmoVar.M1 = i463 ^ i465;
        int i466 = i422 | i462;
        mmoVar.C0 = i462 ^ i466;
        mmoVar.u1 = i238 ^ i466;
        mmoVar.F1 = i465 ^ i466;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public void d(int i, String str, List list, boolean z, boolean z2) {
        zzgs zzgsVar;
        zzic zzicVar = (zzic) ((zzht) this.b).b;
        int i2 = i - 1;
        if (i2 == 0) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzgsVar = zzguVar.n;
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzgsVar = zzguVar2.o;
            } else if (i2 != 4) {
                zzgu zzguVar3 = zzicVar.f;
                zzic.m(zzguVar3);
                zzgsVar = zzguVar3.m;
            } else if (z) {
                zzgu zzguVar4 = zzicVar.f;
                zzic.m(zzguVar4);
                zzgsVar = zzguVar4.k;
            } else if (z2) {
                zzgu zzguVar5 = zzicVar.f;
                zzic.m(zzguVar5);
                zzgsVar = zzguVar5.j;
            } else {
                zzgu zzguVar6 = zzicVar.f;
                zzic.m(zzguVar6);
                zzgsVar = zzguVar6.l;
            }
        } else if (z) {
            zzgu zzguVar7 = zzicVar.f;
            zzic.m(zzguVar7);
            zzgsVar = zzguVar7.h;
        } else if (z2) {
            zzgu zzguVar8 = zzicVar.f;
            zzic.m(zzguVar8);
            zzgsVar = zzguVar8.g;
        } else {
            zzgu zzguVar9 = zzicVar.f;
            zzic.m(zzguVar9);
            zzgsVar = zzguVar9.i;
        }
        int size = list.size();
        if (size == 1) {
            zzgsVar.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            zzgsVar.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            zzgsVar.a(str);
        } else {
            zzgsVar.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void e(Exception exc) {
        zzeh.f("Audio sink error", exc);
        zzry zzryVar = ((zzuc) this.b).z0;
        Handler handler = zzryVar.a;
        if (handler != null) {
            handler.post(new i4p(zzryVar, exc, 5));
        }
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 6:
                if (obj == null) {
                    return false;
                }
                return afn.a(this, obj, new String[0]);
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.a) {
            case 6:
                return efn.a(this, new String[0]);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                AdData adData = (AdData) this.b;
                String adId = adData.adId();
                String creativeId = adData.creativeId();
                String creativeAdId = adData.creativeAdId();
                String title = adData.title();
                String description = adData.description();
                String contentType = adData.contentType();
                String valueOf = String.valueOf(adData.adWrapperIds());
                String valueOf2 = String.valueOf(adData.adWrapperSystems());
                String valueOf3 = String.valueOf(adData.adWrapperCreativeIds());
                String adSystem = adData.adSystem();
                String advertiserName = adData.advertiserName();
                String surveyUrl = adData.surveyUrl();
                String dealId = adData.dealId();
                Boolean linear = adData.linear();
                Boolean skippable = adData.skippable();
                boolean booleanValue = skippable == null ? false : skippable.booleanValue();
                Integer width = adData.width();
                Integer height = adData.height();
                Integer vastMediaHeight = adData.vastMediaHeight();
                int intValue = vastMediaHeight == null ? 0 : vastMediaHeight.intValue();
                Integer vastMediaWidth = adData.vastMediaWidth();
                int intValue2 = vastMediaWidth == null ? 0 : vastMediaWidth.intValue();
                Integer vastMediaBitrate = adData.vastMediaBitrate();
                int intValue3 = vastMediaBitrate != null ? vastMediaBitrate.intValue() : 0;
                String traffickingParameters = adData.traffickingParameters();
                String clickThroughUrl = adData.clickThroughUrl();
                Double duration = adData.duration();
                double doubleValue = duration == null ? 0.0d : duration.doubleValue();
                String valueOf4 = String.valueOf(adData.adPodInfo());
                boolean z = booleanValue;
                String valueOf5 = String.valueOf(adData.uiElements());
                Boolean disableUi = adData.disableUi();
                Double skipTimeOffset = adData.skipTimeOffset();
                String valueOf6 = String.valueOf(adData.companions());
                String valueOf7 = String.valueOf(adData.universalAdIds());
                int length = String.valueOf(adId).length();
                int length2 = String.valueOf(creativeId).length();
                int length3 = String.valueOf(creativeAdId).length();
                int length4 = String.valueOf(title).length();
                int length5 = String.valueOf(description).length();
                int length6 = String.valueOf(contentType).length();
                int length7 = valueOf.length();
                int length8 = valueOf2.length();
                int length9 = valueOf3.length();
                int length10 = String.valueOf(adSystem).length();
                int length11 = String.valueOf(advertiserName).length();
                int length12 = String.valueOf(surveyUrl).length();
                int length13 = String.valueOf(dealId).length();
                int length14 = String.valueOf(linear).length();
                int length15 = String.valueOf(z).length();
                int length16 = String.valueOf(width).length();
                int length17 = String.valueOf(height).length();
                int length18 = String.valueOf(intValue).length();
                int length19 = String.valueOf(intValue2).length();
                StringBuilder sb = new StringBuilder(valueOf7.length() + mz1.d(mz1.d(mz1.d(length + 22 + length2 + 15 + length3 + 8 + length4 + 14 + length5 + 14 + length6 + 15 + length7 + 19 + length8 + 23 + length9 + 11 + length10 + 17 + length11 + 12 + length12 + 9 + length13 + 9 + length14 + 12 + length15 + 8 + length16 + 9 + length17 + 18 + length18 + 17 + length19 + 19 + String.valueOf(intValue3).length() + 24 + String.valueOf(traffickingParameters).length() + 18 + String.valueOf(clickThroughUrl).length() + 11 + String.valueOf(doubleValue).length() + 12, 13, valueOf4) + valueOf5.length() + 12 + String.valueOf(disableUi).length() + 17, 13, String.valueOf(skipTimeOffset)), 17, valueOf6) + 1);
                bf3.v(sb, "Ad [adId=", adId, ", creativeId=", creativeId);
                bf3.v(sb, ", creativeAdId=", creativeAdId, ", title=", title);
                bf3.v(sb, ", description=", description, ", contentType=", contentType);
                bf3.v(sb, ", adWrapperIds=", valueOf, ", adWrapperSystems=", valueOf2);
                bf3.v(sb, ", adWrapperCreativeIds=", valueOf3, ", adSystem=", adSystem);
                bf3.v(sb, ", advertiserName=", advertiserName, ", surveyUrl=", surveyUrl);
                sb.append(", dealId=");
                sb.append(dealId);
                sb.append(", linear=");
                sb.append(linear);
                sb.append(", skippable=");
                sb.append(z);
                sb.append(", width=");
                sb.append(width);
                sb.append(", height=");
                sb.append(height);
                sb.append(", vastMediaHeight=");
                sb.append(intValue);
                me4.r(sb, ", vastMediaWidth=", intValue2, ", vastMediaBitrate=", intValue3);
                bf3.v(sb, ", traffickingParameters=", traffickingParameters, ", clickThroughUrl=", clickThroughUrl);
                fn0.A(sb, ", duration=", doubleValue, ", adPodInfo=");
                bf3.v(sb, valueOf4, ", uiElements=", valueOf5, ", disableUi=");
                sb.append(disableUi);
                sb.append(", skipTimeOffset=");
                sb.append(skipTimeOffset);
                sb.append(", companions=");
                return fc6.o(sb, valueOf6, ", universalAdIds=", valueOf7, U3.j.e);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1] */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, final TaskCompletionSource taskCompletionSource) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                IdentityCredentialClientImpl identityCredentialClientImpl = (IdentityCredentialClientImpl) anyClient;
                Api api = InternalIdentityCredentialClient.l;
                ?? r0 = new IdentityCredentialBaseCallbacks() { // from class: com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1
                    @Override // com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
                    public final void D3(Status status, PendingGetCredentialHandle pendingGetCredentialHandle) {
                        status.getClass();
                        TaskUtil.a(status, pendingGetCredentialHandle, TaskCompletionSource.this);
                    }
                };
                IIdentityCredentialService iIdentityCredentialService = (IIdentityCredentialService) identityCredentialClientImpl.getService();
                identityCredentialClientImpl.getContext();
                iIdentityCredentialService.Q3(r0, (GetCredentialRequest) obj, zzh.a());
                break;
            default:
                int i2 = zzkk.l;
                juo juoVar = new juo(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                byte[] h = ((zzme) obj).h();
                Parcel S1 = zzktVar.S1();
                zzbn.c(S1, juoVar);
                S1.writeByteArray(h);
                zzktVar.Z1(S1, 31);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ Object mo792zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                int i2 = zzjw.l;
                return (zzabc) obj;
            default:
                Class cls = (Class) obj;
                try {
                    return fdp.a.a(cls);
                } catch (Exception e) {
                    String valueOf = String.valueOf(cls);
                    vp2.e(wt3.m("Unable to create instance of ", valueOf, new StringBuilder(valueOf.length() + 147), ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
                    return null;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        zznt zzntVar = (zznt) obj;
        switch (i) {
            case 7:
                zzntVar.l((zzv) obj2);
                break;
            default:
                zzntVar.k((zzau) obj2);
                break;
        }
    }

    public /* synthetic */ gmo(zznr zznrVar, zzv zzvVar, zzjf zzjfVar) {
        this.a = 7;
        this.b = zzvVar;
    }

    public /* synthetic */ gmo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gmo(zznr zznrVar, zzau zzauVar) {
        this.a = 8;
        this.b = zzauVar;
    }

    public gmo(Context context, Executor executor) {
        this.a = 2;
        q8p q8pVar = new q8p(new rln(context, 3));
        executor.execute(q8pVar);
        this.b = q8pVar;
    }
}
