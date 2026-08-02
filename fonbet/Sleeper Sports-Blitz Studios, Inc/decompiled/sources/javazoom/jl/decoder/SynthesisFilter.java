package javazoom.jl.decoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import org.objectweb.asm.Opcodes;
import org.socure.imgcodecs.Imgcodecs;

/* loaded from: classes9.dex */
final class SynthesisFilter {
    private static final double MY_PI = 3.141592653589793d;
    private float[] _tmpOut = new float[32];
    private float[] actual_v;
    private int actual_write_pos;
    private int channel;
    private float[] eq;
    private float[] samples;
    private float scalefactor;
    private float[] v1;
    private float[] v2;
    private static final float cos1_64 = (float) (1.0d / (Math.cos(0.04908738521234052d) * 2.0d));
    private static final float cos3_64 = (float) (1.0d / (Math.cos(0.14726215563702155d) * 2.0d));
    private static final float cos5_64 = (float) (1.0d / (Math.cos(0.2454369260617026d) * 2.0d));
    private static final float cos7_64 = (float) (1.0d / (Math.cos(0.3436116964863836d) * 2.0d));
    private static final float cos9_64 = (float) (1.0d / (Math.cos(0.44178646691106466d) * 2.0d));
    private static final float cos11_64 = (float) (1.0d / (Math.cos(0.5399612373357456d) * 2.0d));
    private static final float cos13_64 = (float) (1.0d / (Math.cos(0.6381360077604268d) * 2.0d));
    private static final float cos15_64 = (float) (1.0d / (Math.cos(0.7363107781851077d) * 2.0d));
    private static final float cos17_64 = (float) (1.0d / (Math.cos(0.8344855486097889d) * 2.0d));
    private static final float cos19_64 = (float) (1.0d / (Math.cos(0.9326603190344698d) * 2.0d));
    private static final float cos21_64 = (float) (1.0d / (Math.cos(1.030835089459151d) * 2.0d));
    private static final float cos23_64 = (float) (1.0d / (Math.cos(1.1290098598838318d) * 2.0d));
    private static final float cos25_64 = (float) (1.0d / (Math.cos(1.227184630308513d) * 2.0d));
    private static final float cos27_64 = (float) (1.0d / (Math.cos(1.325359400733194d) * 2.0d));
    private static final float cos29_64 = (float) (1.0d / (Math.cos(1.423534171157875d) * 2.0d));
    private static final float cos31_64 = (float) (1.0d / (Math.cos(1.521708941582556d) * 2.0d));
    private static final float cos1_32 = (float) (1.0d / (Math.cos(0.09817477042468103d) * 2.0d));
    private static final float cos3_32 = (float) (1.0d / (Math.cos(0.2945243112740431d) * 2.0d));
    private static final float cos5_32 = (float) (1.0d / (Math.cos(0.4908738521234052d) * 2.0d));
    private static final float cos7_32 = (float) (1.0d / (Math.cos(0.6872233929727672d) * 2.0d));
    private static final float cos9_32 = (float) (1.0d / (Math.cos(0.8835729338221293d) * 2.0d));
    private static final float cos11_32 = (float) (1.0d / (Math.cos(1.0799224746714913d) * 2.0d));
    private static final float cos13_32 = (float) (1.0d / (Math.cos(1.2762720155208536d) * 2.0d));
    private static final float cos15_32 = (float) (1.0d / (Math.cos(1.4726215563702154d) * 2.0d));
    private static final float cos1_16 = (float) (1.0d / (Math.cos(0.19634954084936207d) * 2.0d));
    private static final float cos3_16 = (float) (1.0d / (Math.cos(0.5890486225480862d) * 2.0d));
    private static final float cos5_16 = (float) (1.0d / (Math.cos(0.9817477042468103d) * 2.0d));
    private static final float cos7_16 = (float) (1.0d / (Math.cos(1.3744467859455345d) * 2.0d));
    private static final float cos1_8 = (float) (1.0d / (Math.cos(0.39269908169872414d) * 2.0d));
    private static final float cos3_8 = (float) (1.0d / (Math.cos(1.1780972450961724d) * 2.0d));
    private static final float cos1_4 = (float) (1.0d / (Math.cos(0.7853981633974483d) * 2.0d));
    private static float[] d = null;
    private static float[][] d16 = null;

    public SynthesisFilter(int i, float f, float[] fArr) {
        if (d == null) {
            float[] load_d = load_d();
            d = load_d;
            d16 = splitArray(load_d, 16);
        }
        this.v1 = new float[512];
        this.v2 = new float[512];
        this.samples = new float[32];
        this.channel = i;
        this.scalefactor = f;
        setEQ(this.eq);
        reset();
    }

    public void setEQ(float[] fArr) {
        this.eq = fArr;
        if (fArr == null) {
            this.eq = new float[32];
            for (int i = 0; i < 32; i++) {
                this.eq[i] = 1.0f;
            }
        }
        if (this.eq.length < 32) {
            throw new IllegalArgumentException("eq0");
        }
    }

    public void reset() {
        for (int i = 0; i < 512; i++) {
            float[] fArr = this.v1;
            this.v2[i] = 0.0f;
            fArr[i] = 0.0f;
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.samples[i2] = 0.0f;
        }
        this.actual_v = this.v1;
        this.actual_write_pos = 15;
    }

    public void input_sample(float f, int i) {
        this.samples[i] = this.eq[i] * f;
    }

    public void input_samples(float[] fArr) {
        for (int i = 31; i >= 0; i--) {
            this.samples[i] = fArr[i] * this.eq[i];
        }
    }

    private void compute_new_v() {
        float[] fArr = this.samples;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = fArr[16];
        float f18 = fArr[17];
        float f19 = fArr[18];
        float f20 = fArr[19];
        float f21 = fArr[20];
        float f22 = fArr[21];
        float f23 = fArr[22];
        float f24 = fArr[23];
        float f25 = fArr[24];
        float f26 = fArr[25];
        float f27 = fArr[26];
        float f28 = fArr[27];
        float f29 = fArr[28];
        float f30 = fArr[29];
        float f31 = fArr[30];
        float f32 = fArr[31];
        float f33 = f + f32;
        float f34 = f2 + f31;
        float f35 = f3 + f30;
        float f36 = f4 + f29;
        float f37 = f5 + f28;
        float f38 = f6 + f27;
        float f39 = f7 + f26;
        float f40 = f8 + f25;
        float f41 = f9 + f24;
        float f42 = f10 + f23;
        float f43 = f11 + f22;
        float f44 = f12 + f21;
        float f45 = f13 + f20;
        float f46 = f14 + f19;
        float f47 = f15 + f18;
        float f48 = f16 + f17;
        float f49 = f33 + f48;
        float f50 = f34 + f47;
        float f51 = f35 + f46;
        float f52 = f36 + f45;
        float f53 = f37 + f44;
        float f54 = f38 + f43;
        float f55 = f39 + f42;
        float f56 = f40 + f41;
        float f57 = f33 - f48;
        float f58 = cos1_32;
        float f59 = f57 * f58;
        float f60 = f34 - f47;
        float f61 = cos3_32;
        float f62 = f60 * f61;
        float f63 = f35 - f46;
        float f64 = cos5_32;
        float f65 = f63 * f64;
        float f66 = f36 - f45;
        float f67 = cos7_32;
        float f68 = f66 * f67;
        float f69 = f37 - f44;
        float f70 = cos9_32;
        float f71 = f69 * f70;
        float f72 = f38 - f43;
        float f73 = cos11_32;
        float f74 = f72 * f73;
        float f75 = f39 - f42;
        float f76 = cos13_32;
        float f77 = f75 * f76;
        float f78 = f40 - f41;
        float f79 = cos15_32;
        float f80 = f78 * f79;
        float f81 = f49 + f56;
        float f82 = f50 + f55;
        float f83 = f51 + f54;
        float f84 = f52 + f53;
        float f85 = f49 - f56;
        float f86 = cos1_16;
        float f87 = f85 * f86;
        float f88 = f50 - f55;
        float f89 = cos3_16;
        float f90 = f88 * f89;
        float f91 = f51 - f54;
        float f92 = cos5_16;
        float f93 = f91 * f92;
        float f94 = f52 - f53;
        float f95 = cos7_16;
        float f96 = f94 * f95;
        float f97 = f59 + f80;
        float f98 = f62 + f77;
        float f99 = f65 + f74;
        float f100 = f68 + f71;
        float f101 = (f59 - f80) * f86;
        float f102 = (f62 - f77) * f89;
        float f103 = (f65 - f74) * f92;
        float f104 = (f68 - f71) * f95;
        float f105 = f81 + f84;
        float f106 = f82 + f83;
        float f107 = cos1_8;
        float f108 = (f81 - f84) * f107;
        float f109 = cos3_8;
        float f110 = (f82 - f83) * f109;
        float f111 = f87 + f96;
        float f112 = f90 + f93;
        float f113 = (f87 - f96) * f107;
        float f114 = (f90 - f93) * f109;
        float f115 = f97 + f100;
        float f116 = f98 + f99;
        float f117 = (f97 - f100) * f107;
        float f118 = (f98 - f99) * f109;
        float f119 = f101 + f104;
        float f120 = f102 + f103;
        float f121 = (f101 - f104) * f107;
        float f122 = (f102 - f103) * f109;
        float f123 = f105 + f106;
        float f124 = cos1_4;
        float f125 = (f105 - f106) * f124;
        float f126 = f108 + f110;
        float f127 = (f108 - f110) * f124;
        float f128 = f113 + f114;
        float f129 = (f113 - f114) * f124;
        float f130 = f115 + f116;
        float f131 = (f115 - f116) * f124;
        float f132 = f117 + f118;
        float f133 = (f117 - f118) * f124;
        float f134 = f119 + f120;
        float f135 = (f119 - f120) * f124;
        float f136 = f121 + f122;
        float f137 = (f121 - f122) * f124;
        float f138 = f129 + ((f111 - f112) * f124);
        float f139 = -f138;
        float f140 = f139 - f128;
        float f141 = ((-f128) - f129) - (f111 + f112);
        float f142 = f137 + f133;
        float f143 = f142 + f135;
        float f144 = f137 + f135 + f131;
        float f145 = -f144;
        float f146 = f145 - f136;
        float f147 = (-f136) - f137;
        float f148 = (f147 - f132) - f133;
        float f149 = f148 - f135;
        float f150 = (f147 - f134) - f130;
        float f151 = f148 - f134;
        float f152 = -f123;
        float f153 = -f127;
        float f154 = f153 - f126;
        float f155 = (f - f32) * cos1_64;
        float f156 = (f2 - f31) * cos3_64;
        float f157 = (f3 - f30) * cos5_64;
        float f158 = (f4 - f29) * cos7_64;
        float f159 = (f5 - f28) * cos9_64;
        float f160 = (f6 - f27) * cos11_64;
        float f161 = (f7 - f26) * cos13_64;
        float f162 = (f8 - f25) * cos15_64;
        float f163 = (f9 - f24) * cos17_64;
        float f164 = (f10 - f23) * cos19_64;
        float f165 = (f11 - f22) * cos21_64;
        float f166 = (f12 - f21) * cos23_64;
        float f167 = (f13 - f20) * cos25_64;
        float f168 = (f14 - f19) * cos27_64;
        float f169 = (f15 - f18) * cos29_64;
        float f170 = (f16 - f17) * cos31_64;
        float f171 = f155 + f170;
        float f172 = f156 + f169;
        float f173 = f157 + f168;
        float f174 = f158 + f167;
        float f175 = f159 + f166;
        float f176 = f160 + f165;
        float f177 = f161 + f164;
        float f178 = f162 + f163;
        float f179 = (f155 - f170) * f58;
        float f180 = (f156 - f169) * f61;
        float f181 = (f157 - f168) * f64;
        float f182 = (f158 - f167) * f67;
        float f183 = (f159 - f166) * f70;
        float f184 = (f160 - f165) * f73;
        float f185 = (f161 - f164) * f76;
        float f186 = (f162 - f163) * f79;
        float f187 = f171 + f178;
        float f188 = f172 + f177;
        float f189 = f173 + f176;
        float f190 = f174 + f175;
        float f191 = (f171 - f178) * f86;
        float f192 = (f172 - f177) * f89;
        float f193 = (f173 - f176) * f92;
        float f194 = (f174 - f175) * f95;
        float f195 = f179 + f186;
        float f196 = f180 + f185;
        float f197 = f181 + f184;
        float f198 = f182 + f183;
        float f199 = (f179 - f186) * f86;
        float f200 = (f180 - f185) * f89;
        float f201 = (f181 - f184) * f92;
        float f202 = (f182 - f183) * f95;
        float f203 = f187 + f190;
        float f204 = f188 + f189;
        float f205 = (f187 - f190) * f107;
        float f206 = (f188 - f189) * f109;
        float f207 = f191 + f194;
        float f208 = f192 + f193;
        float f209 = (f191 - f194) * f107;
        float f210 = (f192 - f193) * f109;
        float f211 = f195 + f198;
        float f212 = f196 + f197;
        float f213 = (f195 - f198) * f107;
        float f214 = (f196 - f197) * f109;
        float f215 = f199 + f202;
        float f216 = f200 + f201;
        float f217 = (f199 - f202) * f107;
        float f218 = (f200 - f201) * f109;
        float f219 = f203 + f204;
        float f220 = (f203 - f204) * f124;
        float f221 = f205 + f206;
        float f222 = (f205 - f206) * f124;
        float f223 = f207 + f208;
        float f224 = (f207 - f208) * f124;
        float f225 = f209 + f210;
        float f226 = (f209 - f210) * f124;
        float f227 = f211 + f212;
        float f228 = f213 + f214;
        float f229 = (f213 - f214) * f124;
        float f230 = f215 + f216;
        float f231 = (f215 - f216) * f124;
        float f232 = f217 + f218;
        float f233 = (f217 - f218) * f124;
        float f234 = f233 + f226;
        float f235 = f234 + f229;
        float f236 = f235 + f224 + f231;
        float f237 = f233 + f229 + f222;
        float f238 = f237 + f231;
        float f239 = f231 + f233 + ((f211 - f212) * f124);
        float f240 = f239 + f220;
        float f241 = -f240;
        float f242 = f241 - f232;
        float f243 = f239 + f224 + f226;
        float f244 = -f243;
        float f245 = (f244 - f225) - f232;
        float f246 = (((-f228) - f229) - f232) - f233;
        float f247 = f246 - f231;
        float f248 = (f247 - f221) - f222;
        float f249 = ((f247 - f224) - f225) - f226;
        float f250 = f246 - f230;
        float f251 = (f250 - f221) - f222;
        float f252 = f223 + f225 + f226;
        float f253 = f250 - f252;
        float f254 = (((-f227) - f230) - f232) - f233;
        float f255 = f254 - f219;
        float f256 = f254 - f252;
        float[] fArr2 = this.actual_v;
        int i = this.actual_write_pos;
        fArr2[i] = f125;
        int i2 = i + 16;
        fArr2[i2] = f240;
        int i3 = i + 32;
        fArr2[i3] = f144;
        int i4 = i + 48;
        fArr2[i4] = f243;
        int i5 = i + 64;
        fArr2[i5] = f138;
        int i6 = i + 80;
        fArr2[i6] = f236;
        int i7 = i + 96;
        fArr2[i7] = f143;
        int i8 = i + 112;
        fArr2[i8] = f238;
        int i9 = i + 128;
        fArr2[i9] = f127;
        int i10 = i + 144;
        fArr2[i10] = f237;
        int i11 = i + 160;
        fArr2[i11] = f142;
        int i12 = i + Opcodes.ARETURN;
        fArr2[i12] = f235;
        int i13 = i + 192;
        fArr2[i13] = f129;
        int i14 = i + JfifUtil.MARKER_RST0;
        fArr2[i14] = f234;
        int i15 = i + 224;
        fArr2[i15] = f137;
        int i16 = i + PsExtractor.VIDEO_STREAM_MASK;
        fArr2[i16] = f233;
        int i17 = i + 256;
        fArr2[i17] = 0.0f;
        int i18 = i + Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000;
        fArr2[i18] = -f233;
        int i19 = i + 288;
        fArr2[i19] = -f137;
        int i20 = i + 304;
        fArr2[i20] = -f234;
        int i21 = i + 320;
        fArr2[i21] = -f129;
        int i22 = i + 336;
        fArr2[i22] = -f235;
        int i23 = i + 352;
        fArr2[i23] = -f142;
        int i24 = i + 368;
        fArr2[i24] = -f237;
        int i25 = i + 384;
        fArr2[i25] = f153;
        int i26 = i + 400;
        fArr2[i26] = -f238;
        int i27 = i + TypedValues.CycleType.TYPE_PATH_ROTATE;
        fArr2[i27] = -f143;
        int i28 = i + 432;
        fArr2[i28] = -f236;
        int i29 = i + 448;
        fArr2[i29] = f139;
        int i30 = i + 464;
        fArr2[i30] = f244;
        int i31 = i + 480;
        fArr2[i31] = f145;
        int i32 = i + 496;
        fArr2[i32] = f241;
        float[] fArr3 = this.v1;
        if (fArr2 == fArr3) {
            fArr3 = this.v2;
        }
        fArr3[i] = -f125;
        fArr3[i2] = f242;
        fArr3[i3] = f146;
        fArr3[i4] = f245;
        fArr3[i5] = f140;
        fArr3[i6] = f249;
        fArr3[i7] = f149;
        fArr3[i8] = f248;
        fArr3[i9] = f154;
        fArr3[i10] = f251;
        fArr3[i11] = f151;
        fArr3[i12] = f253;
        fArr3[i13] = f141;
        fArr3[i14] = f256;
        fArr3[i15] = f150;
        fArr3[i16] = f255;
        fArr3[i17] = f152;
        fArr3[i18] = f255;
        fArr3[i19] = f150;
        fArr3[i20] = f256;
        fArr3[i21] = f141;
        fArr3[i22] = f253;
        fArr3[i23] = f151;
        fArr3[i24] = f251;
        fArr3[i25] = f154;
        fArr3[i26] = f248;
        fArr3[i27] = f149;
        fArr3[i28] = f249;
        fArr3[i29] = f140;
        fArr3[i30] = f245;
        fArr3[i31] = f146;
        fArr3[i32] = f242;
    }

    private void compute_new_v_old() {
        float[] fArr = new float[32];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        for (int i = 31; i >= 0; i--) {
            fArr[i] = 0.0f;
        }
        float[] fArr4 = this.samples;
        float f = fArr4[0] + fArr4[31];
        fArr2[0] = f;
        float f2 = fArr4[1];
        float f3 = fArr4[30];
        float f4 = f2 + f3;
        fArr2[1] = f4;
        float f5 = fArr4[2] + fArr4[29];
        fArr2[2] = f5;
        float f6 = fArr4[3];
        float f7 = fArr4[28];
        float f8 = f6 + f7;
        fArr2[3] = f8;
        float f9 = fArr4[4] + fArr4[27];
        fArr2[4] = f9;
        float f10 = fArr4[5];
        float f11 = fArr4[26];
        float f12 = f10 + f11;
        fArr2[5] = f12;
        float f13 = fArr4[6] + fArr4[25];
        fArr2[6] = f13;
        float f14 = fArr4[7];
        float f15 = fArr4[24];
        float f16 = f14 + f15;
        fArr2[7] = f16;
        float f17 = fArr4[8] + fArr4[23];
        fArr2[8] = f17;
        float f18 = fArr4[9];
        float f19 = fArr4[22];
        float f20 = f18 + f19;
        fArr2[9] = f20;
        float f21 = fArr4[10] + fArr4[21];
        fArr2[10] = f21;
        float f22 = fArr4[11];
        float f23 = fArr4[20];
        float f24 = f22 + f23;
        fArr2[11] = f24;
        float f25 = fArr4[12] + fArr4[19];
        fArr2[12] = f25;
        float f26 = fArr4[13];
        float f27 = fArr4[18];
        float f28 = f26 + f27;
        fArr2[13] = f28;
        float f29 = fArr4[14] + fArr4[17];
        fArr2[14] = f29;
        float f30 = fArr4[15];
        float f31 = fArr4[16];
        float f32 = f30 + f31;
        fArr2[15] = f32;
        float f33 = f + f32;
        fArr3[0] = f33;
        float f34 = f4 + f29;
        fArr3[1] = f34;
        float f35 = f5 + f28;
        fArr3[2] = f35;
        float f36 = f8 + f25;
        fArr3[3] = f36;
        float f37 = f9 + f24;
        fArr3[4] = f37;
        float f38 = f12 + f21;
        fArr3[5] = f38;
        float f39 = f13 + f20;
        fArr3[6] = f39;
        float f40 = f16 + f17;
        fArr3[7] = f40;
        float f41 = fArr2[0] - f32;
        float f42 = cos1_32;
        float f43 = f41 * f42;
        fArr3[8] = f43;
        float f44 = fArr2[1] - f29;
        float f45 = cos3_32;
        float f46 = f44 * f45;
        fArr3[9] = f46;
        float f47 = fArr2[2] - f28;
        float f48 = cos5_32;
        float f49 = f47 * f48;
        fArr3[10] = f49;
        float f50 = fArr2[3] - f25;
        float f51 = cos7_32;
        float f52 = f50 * f51;
        fArr3[11] = f52;
        float f53 = fArr2[4] - fArr2[11];
        float f54 = cos9_32;
        float f55 = f53 * f54;
        fArr3[12] = f55;
        float f56 = fArr2[5] - fArr2[10];
        float f57 = cos11_32;
        float f58 = f56 * f57;
        fArr3[13] = f58;
        float f59 = fArr2[6] - fArr2[9];
        float f60 = cos13_32;
        float f61 = f59 * f60;
        fArr3[14] = f61;
        float f62 = fArr2[7] - fArr2[8];
        float f63 = cos15_32;
        float f64 = f62 * f63;
        fArr3[15] = f64;
        float f65 = f33 + f40;
        fArr2[0] = f65;
        float f66 = f34 + f39;
        fArr2[1] = f66;
        float f67 = f35 + f38;
        fArr2[2] = f67;
        float f68 = f36 + f37;
        fArr2[3] = f68;
        float f69 = fArr3[0] - f40;
        float f70 = cos1_16;
        float f71 = f69 * f70;
        fArr2[4] = f71;
        float f72 = fArr3[1] - f39;
        float f73 = cos3_16;
        float f74 = f72 * f73;
        fArr2[5] = f74;
        float f75 = fArr3[2] - fArr3[5];
        float f76 = cos5_16;
        float f77 = f75 * f76;
        fArr2[6] = f77;
        float f78 = fArr3[3] - fArr3[4];
        float f79 = cos7_16;
        float f80 = f78 * f79;
        fArr2[7] = f80;
        float f81 = f43 + f64;
        fArr2[8] = f81;
        float f82 = f46 + f61;
        fArr2[9] = f82;
        float f83 = f49 + f58;
        fArr2[10] = f83;
        float f84 = f52 + f55;
        fArr2[11] = f84;
        float f85 = (fArr3[8] - f64) * f70;
        fArr2[12] = f85;
        float f86 = (fArr3[9] - f61) * f73;
        fArr2[13] = f86;
        float f87 = (fArr3[10] - fArr3[13]) * f76;
        fArr2[14] = f87;
        float f88 = (fArr3[11] - fArr3[12]) * f79;
        fArr2[15] = f88;
        float f89 = f65 + f68;
        fArr3[0] = f89;
        float f90 = f66 + f67;
        fArr3[1] = f90;
        float f91 = fArr2[0] - f68;
        float f92 = cos1_8;
        float f93 = f91 * f92;
        fArr3[2] = f93;
        float f94 = fArr2[1] - fArr2[2];
        float f95 = cos3_8;
        float f96 = f94 * f95;
        fArr3[3] = f96;
        float f97 = f71 + f80;
        fArr3[4] = f97;
        float f98 = f74 + f77;
        fArr3[5] = f98;
        float f99 = (fArr2[4] - f80) * f92;
        fArr3[6] = f99;
        float f100 = (fArr2[5] - fArr2[6]) * f95;
        fArr3[7] = f100;
        float f101 = f81 + f84;
        fArr3[8] = f101;
        float f102 = f82 + f83;
        fArr3[9] = f102;
        float f103 = (fArr2[8] - f84) * f92;
        fArr3[10] = f103;
        float f104 = (fArr2[9] - fArr2[10]) * f95;
        fArr3[11] = f104;
        float f105 = f85 + f88;
        fArr3[12] = f105;
        float f106 = f86 + f87;
        fArr3[13] = f106;
        float f107 = (fArr2[12] - f88) * f92;
        fArr3[14] = f107;
        float f108 = (fArr2[13] - fArr2[14]) * f95;
        fArr3[15] = f108;
        float f109 = f89 + f90;
        fArr2[0] = f109;
        float f110 = fArr3[0] - f90;
        float f111 = cos1_4;
        float f112 = f110 * f111;
        fArr2[1] = f112;
        fArr2[2] = f93 + f96;
        float f113 = (fArr3[2] - f96) * f111;
        fArr2[3] = f113;
        fArr2[4] = f97 + f98;
        float f114 = (fArr3[4] - f98) * f111;
        fArr2[5] = f114;
        float f115 = f99 + f100;
        fArr2[6] = f115;
        float f116 = (fArr3[6] - f100) * f111;
        fArr2[7] = f116;
        float f117 = f101 + f102;
        fArr2[8] = f117;
        float f118 = (fArr3[8] - f102) * f111;
        fArr2[9] = f118;
        fArr2[10] = f103 + f104;
        float f119 = (fArr3[10] - f104) * f111;
        fArr2[11] = f119;
        fArr2[12] = f105 + f106;
        float f120 = (fArr3[12] - f106) * f111;
        fArr2[13] = f120;
        fArr2[14] = f107 + f108;
        float f121 = (fArr3[14] - f108) * f111;
        fArr2[15] = f121;
        fArr[12] = f116;
        float f122 = f116 + f114;
        fArr[4] = f122;
        fArr[19] = (-f122) - f115;
        fArr[27] = ((-f115) - f116) - fArr2[4];
        fArr[14] = f121;
        float f123 = f121 + f119;
        fArr[10] = f123;
        fArr[6] = f123 + f120;
        float f124 = f121 + f120 + f118;
        fArr[2] = f124;
        float f125 = fArr2[14];
        fArr[17] = (-f124) - f125;
        float f126 = (((-f125) - f121) - fArr2[10]) - f119;
        fArr[21] = f126 - f120;
        float f127 = fArr2[12];
        fArr[29] = (((-f125) - f121) - f127) - f117;
        fArr[25] = f126 - f127;
        fArr[31] = -f109;
        fArr[0] = f112;
        fArr[8] = f113;
        fArr[23] = (-f113) - fArr2[2];
        float f128 = (fArr4[0] - fArr4[31]) * cos1_64;
        fArr2[0] = f128;
        float f129 = (fArr4[1] - f3) * cos3_64;
        fArr2[1] = f129;
        float f130 = (fArr4[2] - fArr4[29]) * cos5_64;
        fArr2[2] = f130;
        float f131 = (fArr4[3] - f7) * cos7_64;
        fArr2[3] = f131;
        float f132 = (fArr4[4] - fArr4[27]) * cos9_64;
        fArr2[4] = f132;
        float f133 = (fArr4[5] - f11) * cos11_64;
        fArr2[5] = f133;
        float f134 = (fArr4[6] - fArr4[25]) * cos13_64;
        fArr2[6] = f134;
        float f135 = (fArr4[7] - f15) * cos15_64;
        fArr2[7] = f135;
        float f136 = (fArr4[8] - fArr4[23]) * cos17_64;
        fArr2[8] = f136;
        float f137 = (fArr4[9] - f19) * cos19_64;
        fArr2[9] = f137;
        float f138 = (fArr4[10] - fArr4[21]) * cos21_64;
        fArr2[10] = f138;
        float f139 = (fArr4[11] - f23) * cos23_64;
        fArr2[11] = f139;
        float f140 = (fArr4[12] - fArr4[19]) * cos25_64;
        fArr2[12] = f140;
        float f141 = (fArr4[13] - f27) * cos27_64;
        fArr2[13] = f141;
        float f142 = (fArr4[14] - fArr4[17]) * cos29_64;
        fArr2[14] = f142;
        float f143 = (fArr4[15] - f31) * cos31_64;
        fArr2[15] = f143;
        float f144 = f128 + f143;
        fArr3[0] = f144;
        float f145 = f129 + f142;
        fArr3[1] = f145;
        float f146 = f130 + f141;
        fArr3[2] = f146;
        float f147 = f131 + f140;
        fArr3[3] = f147;
        float f148 = f132 + f139;
        fArr3[4] = f148;
        float f149 = f133 + f138;
        fArr3[5] = f149;
        float f150 = f134 + f137;
        fArr3[6] = f150;
        float f151 = f135 + f136;
        fArr3[7] = f151;
        float f152 = (fArr2[0] - f143) * f42;
        fArr3[8] = f152;
        float f153 = (fArr2[1] - f142) * f45;
        fArr3[9] = f153;
        float f154 = (fArr2[2] - f141) * f48;
        fArr3[10] = f154;
        float f155 = (fArr2[3] - f140) * f51;
        fArr3[11] = f155;
        float f156 = (fArr2[4] - fArr2[11]) * f54;
        fArr3[12] = f156;
        float f157 = (fArr2[5] - fArr2[10]) * f57;
        fArr3[13] = f157;
        float f158 = (fArr2[6] - fArr2[9]) * f60;
        fArr3[14] = f158;
        float f159 = (fArr2[7] - fArr2[8]) * f63;
        fArr3[15] = f159;
        float f160 = f144 + f151;
        fArr2[0] = f160;
        float f161 = f145 + f150;
        fArr2[1] = f161;
        float f162 = f146 + f149;
        fArr2[2] = f162;
        float f163 = f147 + f148;
        fArr2[3] = f163;
        float f164 = (fArr3[0] - f151) * f70;
        fArr2[4] = f164;
        float f165 = (fArr3[1] - f150) * f73;
        fArr2[5] = f165;
        float f166 = (fArr3[2] - fArr3[5]) * f76;
        fArr2[6] = f166;
        float f167 = (fArr3[3] - fArr3[4]) * f79;
        fArr2[7] = f167;
        float f168 = f152 + f159;
        fArr2[8] = f168;
        float f169 = f153 + f158;
        fArr2[9] = f169;
        float f170 = f154 + f157;
        fArr2[10] = f170;
        float f171 = f155 + f156;
        fArr2[11] = f171;
        float f172 = (fArr3[8] - f159) * f70;
        fArr2[12] = f172;
        float f173 = (fArr3[9] - f158) * f73;
        fArr2[13] = f173;
        float f174 = (fArr3[10] - fArr3[13]) * f76;
        fArr2[14] = f174;
        float f175 = (fArr3[11] - fArr3[12]) * f79;
        fArr2[15] = f175;
        float f176 = f160 + f163;
        fArr3[0] = f176;
        float f177 = f161 + f162;
        fArr3[1] = f177;
        float f178 = (fArr2[0] - f163) * f92;
        fArr3[2] = f178;
        float f179 = (fArr2[1] - fArr2[2]) * f95;
        fArr3[3] = f179;
        float f180 = f164 + f167;
        fArr3[4] = f180;
        float f181 = f165 + f166;
        fArr3[5] = f181;
        float f182 = (fArr2[4] - f167) * f92;
        fArr3[6] = f182;
        float f183 = (fArr2[5] - fArr2[6]) * f95;
        fArr3[7] = f183;
        float f184 = f168 + f171;
        fArr3[8] = f184;
        float f185 = f169 + f170;
        fArr3[9] = f185;
        float f186 = (fArr2[8] - f171) * f92;
        fArr3[10] = f186;
        float f187 = (fArr2[9] - fArr2[10]) * f95;
        fArr3[11] = f187;
        float f188 = f172 + f175;
        fArr3[12] = f188;
        float f189 = f173 + f174;
        fArr3[13] = f189;
        float f190 = (fArr2[12] - f175) * f92;
        fArr3[14] = f190;
        float f191 = (fArr2[13] - fArr2[14]) * f95;
        fArr3[15] = f191;
        float f192 = f176 + f177;
        fArr2[0] = f192;
        float f193 = (fArr3[0] - f177) * f111;
        fArr2[1] = f193;
        float f194 = f178 + f179;
        fArr2[2] = f194;
        float f195 = (fArr3[2] - f179) * f111;
        fArr2[3] = f195;
        float f196 = f180 + f181;
        fArr2[4] = f196;
        float f197 = (fArr3[4] - f181) * f111;
        fArr2[5] = f197;
        float f198 = f182 + f183;
        fArr2[6] = f198;
        float f199 = (fArr3[6] - f183) * f111;
        fArr2[7] = f199;
        float f200 = f184 + f185;
        fArr2[8] = f200;
        fArr2[9] = (fArr3[8] - f185) * f111;
        float f201 = f186 + f187;
        fArr2[10] = f201;
        float f202 = (fArr3[10] - f187) * f111;
        fArr2[11] = f202;
        float f203 = f188 + f189;
        fArr2[12] = f203;
        fArr2[13] = (fArr3[12] - f189) * f111;
        float f204 = f190 + f191;
        fArr2[14] = f204;
        float f205 = (fArr3[14] - f191) * f111;
        fArr2[15] = f205;
        fArr[15] = f205;
        float f206 = f205 + f199;
        fArr[13] = f206;
        float f207 = f206 + f202;
        fArr[11] = f207;
        float f208 = fArr2[13];
        fArr[5] = f207 + f197 + f208;
        float f209 = fArr2[15];
        float f210 = fArr2[11];
        float f211 = f209 + f210 + f195;
        fArr[9] = f211;
        fArr[7] = f211 + f208;
        float f212 = f208 + f209 + fArr2[9];
        float f213 = f212 + f193;
        fArr[1] = f213;
        fArr[16] = (-f213) - f204;
        float f214 = fArr2[5];
        float f215 = fArr2[7];
        float f216 = f212 + f214 + f215;
        fArr[3] = f216;
        fArr[18] = ((-f216) - f198) - f204;
        float f217 = (((-f201) - f210) - f204) - f209;
        float f218 = fArr2[3];
        fArr[22] = ((f217 - f208) - f194) - f218;
        fArr[20] = (((f217 - f208) - f214) - f198) - f215;
        fArr[24] = ((f217 - f203) - f194) - f218;
        float f219 = f196 + f198 + f215;
        fArr[26] = (f217 - f203) - f219;
        float f220 = (((-f200) - f203) - f204) - f209;
        fArr[30] = f220 - f192;
        fArr[28] = f220 - f219;
        float[] fArr5 = this.actual_v;
        int i2 = this.actual_write_pos;
        fArr5[i2] = fArr[0];
        fArr5[i2 + 16] = fArr[1];
        fArr5[i2 + 32] = fArr[2];
        fArr5[i2 + 48] = fArr[3];
        fArr5[i2 + 64] = fArr[4];
        fArr5[i2 + 80] = fArr[5];
        fArr5[i2 + 96] = fArr[6];
        fArr5[i2 + 112] = fArr[7];
        fArr5[i2 + 128] = fArr[8];
        fArr5[i2 + 144] = fArr[9];
        fArr5[i2 + 160] = fArr[10];
        fArr5[i2 + Opcodes.ARETURN] = fArr[11];
        fArr5[i2 + 192] = fArr[12];
        fArr5[i2 + JfifUtil.MARKER_RST0] = fArr[13];
        fArr5[i2 + 224] = fArr[14];
        fArr5[i2 + PsExtractor.VIDEO_STREAM_MASK] = fArr[15];
        fArr5[i2 + 256] = 0.0f;
        fArr5[i2 + Imgcodecs.IMWRITE_JPEG2000_COMPRESSION_X1000] = -fArr[15];
        fArr5[i2 + 288] = -fArr[14];
        fArr5[i2 + 304] = -fArr[13];
        fArr5[i2 + 320] = -fArr[12];
        fArr5[i2 + 336] = -fArr[11];
        fArr5[i2 + 352] = -fArr[10];
        fArr5[i2 + 368] = -fArr[9];
        fArr5[i2 + 384] = -fArr[8];
        fArr5[i2 + 400] = -fArr[7];
        fArr5[i2 + TypedValues.CycleType.TYPE_PATH_ROTATE] = -fArr[6];
        fArr5[i2 + 432] = -fArr[5];
        fArr5[i2 + 448] = -fArr[4];
        fArr5[i2 + 464] = -fArr[3];
        fArr5[i2 + 480] = -fArr[2];
        fArr5[i2 + 496] = -fArr[1];
    }

    private void compute_pcm_samples0(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i] * fArr3[0]) + (fArr[i + 15] * fArr3[1]) + (fArr[i + 14] * fArr3[2]) + (fArr[i + 13] * fArr3[3]) + (fArr[i + 12] * fArr3[4]) + (fArr[i + 11] * fArr3[5]) + (fArr[i + 10] * fArr3[6]) + (fArr[i + 9] * fArr3[7]) + (fArr[i + 8] * fArr3[8]) + (fArr[i + 7] * fArr3[9]) + (fArr[i + 6] * fArr3[10]) + (fArr[i + 5] * fArr3[11]) + (fArr[i + 4] * fArr3[12]) + (fArr[i + 3] * fArr3[13]) + (fArr[i + 2] * fArr3[14]) + (fArr[i + 1] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples1(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 1] * fArr3[0]) + (fArr[i] * fArr3[1]) + (fArr[i + 15] * fArr3[2]) + (fArr[i + 14] * fArr3[3]) + (fArr[i + 13] * fArr3[4]) + (fArr[i + 12] * fArr3[5]) + (fArr[i + 11] * fArr3[6]) + (fArr[i + 10] * fArr3[7]) + (fArr[i + 9] * fArr3[8]) + (fArr[i + 8] * fArr3[9]) + (fArr[i + 7] * fArr3[10]) + (fArr[i + 6] * fArr3[11]) + (fArr[i + 5] * fArr3[12]) + (fArr[i + 4] * fArr3[13]) + (fArr[i + 3] * fArr3[14]) + (fArr[i + 2] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples2(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 2] * fArr3[0]) + (fArr[i + 1] * fArr3[1]) + (fArr[i] * fArr3[2]) + (fArr[i + 15] * fArr3[3]) + (fArr[i + 14] * fArr3[4]) + (fArr[i + 13] * fArr3[5]) + (fArr[i + 12] * fArr3[6]) + (fArr[i + 11] * fArr3[7]) + (fArr[i + 10] * fArr3[8]) + (fArr[i + 9] * fArr3[9]) + (fArr[i + 8] * fArr3[10]) + (fArr[i + 7] * fArr3[11]) + (fArr[i + 6] * fArr3[12]) + (fArr[i + 5] * fArr3[13]) + (fArr[i + 4] * fArr3[14]) + (fArr[i + 3] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples3(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 3] * fArr3[0]) + (fArr[i + 2] * fArr3[1]) + (fArr[i + 1] * fArr3[2]) + (fArr[i] * fArr3[3]) + (fArr[i + 15] * fArr3[4]) + (fArr[i + 14] * fArr3[5]) + (fArr[i + 13] * fArr3[6]) + (fArr[i + 12] * fArr3[7]) + (fArr[i + 11] * fArr3[8]) + (fArr[i + 10] * fArr3[9]) + (fArr[i + 9] * fArr3[10]) + (fArr[i + 8] * fArr3[11]) + (fArr[i + 7] * fArr3[12]) + (fArr[i + 6] * fArr3[13]) + (fArr[i + 5] * fArr3[14]) + (fArr[i + 4] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples4(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 4] * fArr3[0]) + (fArr[i + 3] * fArr3[1]) + (fArr[i + 2] * fArr3[2]) + (fArr[i + 1] * fArr3[3]) + (fArr[i] * fArr3[4]) + (fArr[i + 15] * fArr3[5]) + (fArr[i + 14] * fArr3[6]) + (fArr[i + 13] * fArr3[7]) + (fArr[i + 12] * fArr3[8]) + (fArr[i + 11] * fArr3[9]) + (fArr[i + 10] * fArr3[10]) + (fArr[i + 9] * fArr3[11]) + (fArr[i + 8] * fArr3[12]) + (fArr[i + 7] * fArr3[13]) + (fArr[i + 6] * fArr3[14]) + (fArr[i + 5] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples5(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 5] * fArr3[0]) + (fArr[i + 4] * fArr3[1]) + (fArr[i + 3] * fArr3[2]) + (fArr[i + 2] * fArr3[3]) + (fArr[i + 1] * fArr3[4]) + (fArr[i] * fArr3[5]) + (fArr[i + 15] * fArr3[6]) + (fArr[i + 14] * fArr3[7]) + (fArr[i + 13] * fArr3[8]) + (fArr[i + 12] * fArr3[9]) + (fArr[i + 11] * fArr3[10]) + (fArr[i + 10] * fArr3[11]) + (fArr[i + 9] * fArr3[12]) + (fArr[i + 8] * fArr3[13]) + (fArr[i + 7] * fArr3[14]) + (fArr[i + 6] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples6(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 6] * fArr3[0]) + (fArr[i + 5] * fArr3[1]) + (fArr[i + 4] * fArr3[2]) + (fArr[i + 3] * fArr3[3]) + (fArr[i + 2] * fArr3[4]) + (fArr[i + 1] * fArr3[5]) + (fArr[i] * fArr3[6]) + (fArr[i + 15] * fArr3[7]) + (fArr[i + 14] * fArr3[8]) + (fArr[i + 13] * fArr3[9]) + (fArr[i + 12] * fArr3[10]) + (fArr[i + 11] * fArr3[11]) + (fArr[i + 10] * fArr3[12]) + (fArr[i + 9] * fArr3[13]) + (fArr[i + 8] * fArr3[14]) + (fArr[i + 7] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples7(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 7] * fArr3[0]) + (fArr[i + 6] * fArr3[1]) + (fArr[i + 5] * fArr3[2]) + (fArr[i + 4] * fArr3[3]) + (fArr[i + 3] * fArr3[4]) + (fArr[i + 2] * fArr3[5]) + (fArr[i + 1] * fArr3[6]) + (fArr[i] * fArr3[7]) + (fArr[i + 15] * fArr3[8]) + (fArr[i + 14] * fArr3[9]) + (fArr[i + 13] * fArr3[10]) + (fArr[i + 12] * fArr3[11]) + (fArr[i + 11] * fArr3[12]) + (fArr[i + 10] * fArr3[13]) + (fArr[i + 9] * fArr3[14]) + (fArr[i + 8] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples8(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 8] * fArr3[0]) + (fArr[i + 7] * fArr3[1]) + (fArr[i + 6] * fArr3[2]) + (fArr[i + 5] * fArr3[3]) + (fArr[i + 4] * fArr3[4]) + (fArr[i + 3] * fArr3[5]) + (fArr[i + 2] * fArr3[6]) + (fArr[i + 1] * fArr3[7]) + (fArr[i] * fArr3[8]) + (fArr[i + 15] * fArr3[9]) + (fArr[i + 14] * fArr3[10]) + (fArr[i + 13] * fArr3[11]) + (fArr[i + 12] * fArr3[12]) + (fArr[i + 11] * fArr3[13]) + (fArr[i + 10] * fArr3[14]) + (fArr[i + 9] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples9(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 9] * fArr3[0]) + (fArr[i + 8] * fArr3[1]) + (fArr[i + 7] * fArr3[2]) + (fArr[i + 6] * fArr3[3]) + (fArr[i + 5] * fArr3[4]) + (fArr[i + 4] * fArr3[5]) + (fArr[i + 3] * fArr3[6]) + (fArr[i + 2] * fArr3[7]) + (fArr[i + 1] * fArr3[8]) + (fArr[i] * fArr3[9]) + (fArr[i + 15] * fArr3[10]) + (fArr[i + 14] * fArr3[11]) + (fArr[i + 13] * fArr3[12]) + (fArr[i + 12] * fArr3[13]) + (fArr[i + 11] * fArr3[14]) + (fArr[i + 10] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples10(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 10] * fArr3[0]) + (fArr[i + 9] * fArr3[1]) + (fArr[i + 8] * fArr3[2]) + (fArr[i + 7] * fArr3[3]) + (fArr[i + 6] * fArr3[4]) + (fArr[i + 5] * fArr3[5]) + (fArr[i + 4] * fArr3[6]) + (fArr[i + 3] * fArr3[7]) + (fArr[i + 2] * fArr3[8]) + (fArr[i + 1] * fArr3[9]) + (fArr[i] * fArr3[10]) + (fArr[i + 15] * fArr3[11]) + (fArr[i + 14] * fArr3[12]) + (fArr[i + 13] * fArr3[13]) + (fArr[i + 12] * fArr3[14]) + (fArr[i + 11] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples11(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 11] * fArr3[0]) + (fArr[i + 10] * fArr3[1]) + (fArr[i + 9] * fArr3[2]) + (fArr[i + 8] * fArr3[3]) + (fArr[i + 7] * fArr3[4]) + (fArr[i + 6] * fArr3[5]) + (fArr[i + 5] * fArr3[6]) + (fArr[i + 4] * fArr3[7]) + (fArr[i + 3] * fArr3[8]) + (fArr[i + 2] * fArr3[9]) + (fArr[i + 1] * fArr3[10]) + (fArr[i] * fArr3[11]) + (fArr[i + 15] * fArr3[12]) + (fArr[i + 14] * fArr3[13]) + (fArr[i + 13] * fArr3[14]) + (fArr[i + 12] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples12(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 12] * fArr3[0]) + (fArr[i + 11] * fArr3[1]) + (fArr[i + 10] * fArr3[2]) + (fArr[i + 9] * fArr3[3]) + (fArr[i + 8] * fArr3[4]) + (fArr[i + 7] * fArr3[5]) + (fArr[i + 6] * fArr3[6]) + (fArr[i + 5] * fArr3[7]) + (fArr[i + 4] * fArr3[8]) + (fArr[i + 3] * fArr3[9]) + (fArr[i + 2] * fArr3[10]) + (fArr[i + 1] * fArr3[11]) + (fArr[i] * fArr3[12]) + (fArr[i + 15] * fArr3[13]) + (fArr[i + 14] * fArr3[14]) + (fArr[i + 13] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples13(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 13] * fArr3[0]) + (fArr[i + 12] * fArr3[1]) + (fArr[i + 11] * fArr3[2]) + (fArr[i + 10] * fArr3[3]) + (fArr[i + 9] * fArr3[4]) + (fArr[i + 8] * fArr3[5]) + (fArr[i + 7] * fArr3[6]) + (fArr[i + 6] * fArr3[7]) + (fArr[i + 5] * fArr3[8]) + (fArr[i + 4] * fArr3[9]) + (fArr[i + 3] * fArr3[10]) + (fArr[i + 2] * fArr3[11]) + (fArr[i + 1] * fArr3[12]) + (fArr[i] * fArr3[13]) + (fArr[i + 15] * fArr3[14]) + (fArr[i + 14] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples14(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 14] * fArr3[0]) + (fArr[i + 13] * fArr3[1]) + (fArr[i + 12] * fArr3[2]) + (fArr[i + 11] * fArr3[3]) + (fArr[i + 10] * fArr3[4]) + (fArr[i + 9] * fArr3[5]) + (fArr[i + 8] * fArr3[6]) + (fArr[i + 7] * fArr3[7]) + (fArr[i + 6] * fArr3[8]) + (fArr[i + 5] * fArr3[9]) + (fArr[i + 4] * fArr3[10]) + (fArr[i + 3] * fArr3[11]) + (fArr[i + 2] * fArr3[12]) + (fArr[i + 1] * fArr3[13]) + (fArr[i] * fArr3[14]) + (fArr[i + 15] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples15(Obuffer obuffer) {
        float[] fArr = this.actual_v;
        float[] fArr2 = this._tmpOut;
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            float[] fArr3 = d16[i2];
            fArr2[i2] = ((fArr[i + 15] * fArr3[0]) + (fArr[i + 14] * fArr3[1]) + (fArr[i + 13] * fArr3[2]) + (fArr[i + 12] * fArr3[3]) + (fArr[i + 11] * fArr3[4]) + (fArr[i + 10] * fArr3[5]) + (fArr[i + 9] * fArr3[6]) + (fArr[i + 8] * fArr3[7]) + (fArr[i + 7] * fArr3[8]) + (fArr[i + 6] * fArr3[9]) + (fArr[i + 5] * fArr3[10]) + (fArr[i + 4] * fArr3[11]) + (fArr[i + 3] * fArr3[12]) + (fArr[i + 2] * fArr3[13]) + (fArr[i + 1] * fArr3[14]) + (fArr[i] * fArr3[15])) * this.scalefactor;
            i += 16;
        }
    }

    private void compute_pcm_samples(Obuffer obuffer) {
        switch (this.actual_write_pos) {
            case 0:
                compute_pcm_samples0(obuffer);
                break;
            case 1:
                compute_pcm_samples1(obuffer);
                break;
            case 2:
                compute_pcm_samples2(obuffer);
                break;
            case 3:
                compute_pcm_samples3(obuffer);
                break;
            case 4:
                compute_pcm_samples4(obuffer);
                break;
            case 5:
                compute_pcm_samples5(obuffer);
                break;
            case 6:
                compute_pcm_samples6(obuffer);
                break;
            case 7:
                compute_pcm_samples7(obuffer);
                break;
            case 8:
                compute_pcm_samples8(obuffer);
                break;
            case 9:
                compute_pcm_samples9(obuffer);
                break;
            case 10:
                compute_pcm_samples10(obuffer);
                break;
            case 11:
                compute_pcm_samples11(obuffer);
                break;
            case 12:
                compute_pcm_samples12(obuffer);
                break;
            case 13:
                compute_pcm_samples13(obuffer);
                break;
            case 14:
                compute_pcm_samples14(obuffer);
                break;
            case 15:
                compute_pcm_samples15(obuffer);
                break;
        }
        if (obuffer != null) {
            obuffer.appendSamples(this.channel, this._tmpOut);
        }
    }

    public void calculate_pcm_samples(Obuffer obuffer) {
        compute_new_v();
        compute_pcm_samples(obuffer);
        this.actual_write_pos = (this.actual_write_pos + 1) & 15;
        float[] fArr = this.actual_v;
        float[] fArr2 = this.v1;
        if (fArr == fArr2) {
            fArr2 = this.v2;
        }
        this.actual_v = fArr2;
        for (int i = 0; i < 32; i++) {
            this.samples[i] = 0.0f;
        }
    }

    static {
    }

    private static float[] load_d() {
        try {
            return (float[]) JavaLayerUtils.deserializeArrayResource("sfd.ser", Float.TYPE, 512);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static float[][] splitArray(float[] fArr, int i) {
        int length = fArr.length / i;
        float[][] fArr2 = new float[length][];
        for (int i2 = 0; i2 < length; i2++) {
            fArr2[i2] = subArray(fArr, i2 * i, i);
        }
        return fArr2;
    }

    private static float[] subArray(float[] fArr, int i, int i2) {
        if (i + i2 > fArr.length) {
            i2 = fArr.length - i;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        float[] fArr2 = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr2[i3] = fArr[i + i3];
        }
        return fArr2;
    }
}
