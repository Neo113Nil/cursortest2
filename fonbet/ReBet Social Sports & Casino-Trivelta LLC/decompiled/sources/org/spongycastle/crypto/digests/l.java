package org.spongycastle.crypto.digests;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class l extends e {

    /* renamed from: X, reason: collision with root package name */
    private int[] f62363X;

    /* renamed from: c, reason: collision with root package name */
    public int f62364c;

    /* renamed from: d, reason: collision with root package name */
    public int f62365d;

    /* renamed from: e, reason: collision with root package name */
    public int f62366e;

    /* renamed from: f, reason: collision with root package name */
    public int f62367f;

    /* renamed from: g, reason: collision with root package name */
    public int f62368g;

    /* renamed from: h, reason: collision with root package name */
    public int f62369h;

    public l() {
        this.f62363X = new int[16];
        reset();
    }

    private int g(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    private int i(int i10, int i11, int i12) {
        return (i10 ^ i11) ^ i12;
    }

    private int j(int i10, int i11, int i12) {
        return ((~i10) & i12) | (i11 & i10);
    }

    private int k(int i10, int i11, int i12) {
        return (i10 | (~i11)) ^ i12;
    }

    private int l(int i10, int i11, int i12) {
        return (i10 & i12) | (i11 & (~i12));
    }

    private void n(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    @Override // Aj.d
    public void a(Aj.d dVar) {
        h((l) dVar);
    }

    @Override // Aj.d
    public Aj.d copy() {
        return new l(this);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void d() {
        int i10 = this.f62364c;
        int i11 = this.f62365d;
        int i12 = this.f62366e;
        int i13 = this.f62367f;
        int i14 = this.f62368g;
        int g10 = g(i(i11, i12, i13) + i10 + this.f62363X[0], 11) + i14;
        int g11 = g(i12, 10);
        int g12 = g(i(g10, i11, g11) + i14 + this.f62363X[1], 14) + i13;
        int g13 = g(i11, 10);
        int g14 = g(i(g12, g10, g13) + i13 + this.f62363X[2], 15) + g11;
        int g15 = g(g10, 10);
        int g16 = g(g11 + i(g14, g12, g15) + this.f62363X[3], 12) + g13;
        int g17 = g(g12, 10);
        int g18 = g(g13 + i(g16, g14, g17) + this.f62363X[4], 5) + g15;
        int g19 = g(g14, 10);
        int g20 = g(g15 + i(g18, g16, g19) + this.f62363X[5], 8) + g17;
        int g21 = g(g16, 10);
        int g22 = g(g17 + i(g20, g18, g21) + this.f62363X[6], 7) + g19;
        int g23 = g(g18, 10);
        int g24 = g(g19 + i(g22, g20, g23) + this.f62363X[7], 9) + g21;
        int g25 = g(g20, 10);
        int g26 = g(g21 + i(g24, g22, g25) + this.f62363X[8], 11) + g23;
        int g27 = g(g22, 10);
        int g28 = g(g23 + i(g26, g24, g27) + this.f62363X[9], 13) + g25;
        int g29 = g(g24, 10);
        int g30 = g(g25 + i(g28, g26, g29) + this.f62363X[10], 14) + g27;
        int g31 = g(g26, 10);
        int g32 = g(g27 + i(g30, g28, g31) + this.f62363X[11], 15) + g29;
        int g33 = g(g28, 10);
        int g34 = g(g29 + i(g32, g30, g33) + this.f62363X[12], 6) + g31;
        int g35 = g(g30, 10);
        int g36 = g(g31 + i(g34, g32, g35) + this.f62363X[13], 7) + g33;
        int g37 = g(g32, 10);
        int g38 = g(g33 + i(g36, g34, g37) + this.f62363X[14], 9) + g35;
        int g39 = g(g34, 10);
        int g40 = g(g35 + i(g38, g36, g39) + this.f62363X[15], 8) + g37;
        int g41 = g(g36, 10);
        int g42 = g(i10 + m(i11, i12, i13) + this.f62363X[5] + 1352829926, 8) + i14;
        int g43 = g(i12, 10);
        int g44 = g(i14 + m(g42, i11, g43) + this.f62363X[14] + 1352829926, 9) + i13;
        int g45 = g(i11, 10);
        int g46 = g(i13 + m(g44, g42, g45) + this.f62363X[7] + 1352829926, 9) + g43;
        int g47 = g(g42, 10);
        int g48 = g(g43 + m(g46, g44, g47) + this.f62363X[0] + 1352829926, 11) + g45;
        int g49 = g(g44, 10);
        int g50 = g(g45 + m(g48, g46, g49) + this.f62363X[9] + 1352829926, 13) + g47;
        int g51 = g(g46, 10);
        int g52 = g(g47 + m(g50, g48, g51) + this.f62363X[2] + 1352829926, 15) + g49;
        int g53 = g(g48, 10);
        int g54 = g(g49 + m(g52, g50, g53) + this.f62363X[11] + 1352829926, 15) + g51;
        int g55 = g(g50, 10);
        int g56 = g(g51 + m(g54, g52, g55) + this.f62363X[4] + 1352829926, 5) + g53;
        int g57 = g(g52, 10);
        int g58 = g(g53 + m(g56, g54, g57) + this.f62363X[13] + 1352829926, 7) + g55;
        int g59 = g(g54, 10);
        int g60 = g(g55 + m(g58, g56, g59) + this.f62363X[6] + 1352829926, 7) + g57;
        int g61 = g(g56, 10);
        int g62 = g(g57 + m(g60, g58, g61) + this.f62363X[15] + 1352829926, 8) + g59;
        int g63 = g(g58, 10);
        int g64 = g(g59 + m(g62, g60, g63) + this.f62363X[8] + 1352829926, 11) + g61;
        int g65 = g(g60, 10);
        int g66 = g(g61 + m(g64, g62, g65) + this.f62363X[1] + 1352829926, 14) + g63;
        int g67 = g(g62, 10);
        int g68 = g(g63 + m(g66, g64, g67) + this.f62363X[10] + 1352829926, 14) + g65;
        int g69 = g(g64, 10);
        int g70 = g(g65 + m(g68, g66, g69) + this.f62363X[3] + 1352829926, 12) + g67;
        int g71 = g(g66, 10);
        int g72 = g(g67 + m(g70, g68, g71) + this.f62363X[12] + 1352829926, 6) + g69;
        int g73 = g(g68, 10);
        int g74 = g(g37 + j(g40, g38, g41) + this.f62363X[7] + 1518500249, 7) + g39;
        int g75 = g(g38, 10);
        int g76 = g(g39 + j(g74, g40, g75) + this.f62363X[4] + 1518500249, 6) + g41;
        int g77 = g(g40, 10);
        int g78 = g(g41 + j(g76, g74, g77) + this.f62363X[13] + 1518500249, 8) + g75;
        int g79 = g(g74, 10);
        int g80 = g(g75 + j(g78, g76, g79) + this.f62363X[1] + 1518500249, 13) + g77;
        int g81 = g(g76, 10);
        int g82 = g(g77 + j(g80, g78, g81) + this.f62363X[10] + 1518500249, 11) + g79;
        int g83 = g(g78, 10);
        int g84 = g(g79 + j(g82, g80, g83) + this.f62363X[6] + 1518500249, 9) + g81;
        int g85 = g(g80, 10);
        int g86 = g(g81 + j(g84, g82, g85) + this.f62363X[15] + 1518500249, 7) + g83;
        int g87 = g(g82, 10);
        int g88 = g(g83 + j(g86, g84, g87) + this.f62363X[3] + 1518500249, 15) + g85;
        int g89 = g(g84, 10);
        int g90 = g(g85 + j(g88, g86, g89) + this.f62363X[12] + 1518500249, 7) + g87;
        int g91 = g(g86, 10);
        int g92 = g(g87 + j(g90, g88, g91) + this.f62363X[0] + 1518500249, 12) + g89;
        int g93 = g(g88, 10);
        int g94 = g(g89 + j(g92, g90, g93) + this.f62363X[9] + 1518500249, 15) + g91;
        int g95 = g(g90, 10);
        int g96 = g(g91 + j(g94, g92, g95) + this.f62363X[5] + 1518500249, 9) + g93;
        int g97 = g(g92, 10);
        int g98 = g(g93 + j(g96, g94, g97) + this.f62363X[2] + 1518500249, 11) + g95;
        int g99 = g(g94, 10);
        int g100 = g(g95 + j(g98, g96, g99) + this.f62363X[14] + 1518500249, 7) + g97;
        int g101 = g(g96, 10);
        int g102 = g(g97 + j(g100, g98, g101) + this.f62363X[11] + 1518500249, 13) + g99;
        int g103 = g(g98, 10);
        int g104 = g(g99 + j(g102, g100, g103) + this.f62363X[8] + 1518500249, 12) + g101;
        int g105 = g(g100, 10);
        int g106 = g(g69 + l(g72, g70, g73) + this.f62363X[6] + 1548603684, 9) + g71;
        int g107 = g(g70, 10);
        int g108 = g(g71 + l(g106, g72, g107) + this.f62363X[11] + 1548603684, 13) + g73;
        int g109 = g(g72, 10);
        int g110 = g(g73 + l(g108, g106, g109) + this.f62363X[3] + 1548603684, 15) + g107;
        int g111 = g(g106, 10);
        int g112 = g(g107 + l(g110, g108, g111) + this.f62363X[7] + 1548603684, 7) + g109;
        int g113 = g(g108, 10);
        int g114 = g(g109 + l(g112, g110, g113) + this.f62363X[0] + 1548603684, 12) + g111;
        int g115 = g(g110, 10);
        int g116 = g(g111 + l(g114, g112, g115) + this.f62363X[13] + 1548603684, 8) + g113;
        int g117 = g(g112, 10);
        int g118 = g(g113 + l(g116, g114, g117) + this.f62363X[5] + 1548603684, 9) + g115;
        int g119 = g(g114, 10);
        int g120 = g(g115 + l(g118, g116, g119) + this.f62363X[10] + 1548603684, 11) + g117;
        int g121 = g(g116, 10);
        int g122 = g(g117 + l(g120, g118, g121) + this.f62363X[14] + 1548603684, 7) + g119;
        int g123 = g(g118, 10);
        int g124 = g(g119 + l(g122, g120, g123) + this.f62363X[15] + 1548603684, 7) + g121;
        int g125 = g(g120, 10);
        int g126 = g(g121 + l(g124, g122, g125) + this.f62363X[8] + 1548603684, 12) + g123;
        int g127 = g(g122, 10);
        int g128 = g(g123 + l(g126, g124, g127) + this.f62363X[12] + 1548603684, 7) + g125;
        int g129 = g(g124, 10);
        int g130 = g(g125 + l(g128, g126, g129) + this.f62363X[4] + 1548603684, 6) + g127;
        int g131 = g(g126, 10);
        int g132 = g(g127 + l(g130, g128, g131) + this.f62363X[9] + 1548603684, 15) + g129;
        int g133 = g(g128, 10);
        int g134 = g(g129 + l(g132, g130, g133) + this.f62363X[1] + 1548603684, 13) + g131;
        int g135 = g(g130, 10);
        int g136 = g(g131 + l(g134, g132, g135) + this.f62363X[2] + 1548603684, 11) + g133;
        int g137 = g(g132, 10);
        int g138 = g(g101 + k(g104, g102, g105) + this.f62363X[3] + 1859775393, 11) + g103;
        int g139 = g(g102, 10);
        int g140 = g(g103 + k(g138, g104, g139) + this.f62363X[10] + 1859775393, 13) + g105;
        int g141 = g(g104, 10);
        int g142 = g(g105 + k(g140, g138, g141) + this.f62363X[14] + 1859775393, 6) + g139;
        int g143 = g(g138, 10);
        int g144 = g(g139 + k(g142, g140, g143) + this.f62363X[4] + 1859775393, 7) + g141;
        int g145 = g(g140, 10);
        int g146 = g(g141 + k(g144, g142, g145) + this.f62363X[9] + 1859775393, 14) + g143;
        int g147 = g(g142, 10);
        int g148 = g(g143 + k(g146, g144, g147) + this.f62363X[15] + 1859775393, 9) + g145;
        int g149 = g(g144, 10);
        int g150 = g(g145 + k(g148, g146, g149) + this.f62363X[8] + 1859775393, 13) + g147;
        int g151 = g(g146, 10);
        int g152 = g(g147 + k(g150, g148, g151) + this.f62363X[1] + 1859775393, 15) + g149;
        int g153 = g(g148, 10);
        int g154 = g(g149 + k(g152, g150, g153) + this.f62363X[2] + 1859775393, 14) + g151;
        int g155 = g(g150, 10);
        int g156 = g(g151 + k(g154, g152, g155) + this.f62363X[7] + 1859775393, 8) + g153;
        int g157 = g(g152, 10);
        int g158 = g(g153 + k(g156, g154, g157) + this.f62363X[0] + 1859775393, 13) + g155;
        int g159 = g(g154, 10);
        int g160 = g(g155 + k(g158, g156, g159) + this.f62363X[6] + 1859775393, 6) + g157;
        int g161 = g(g156, 10);
        int g162 = g(g157 + k(g160, g158, g161) + this.f62363X[13] + 1859775393, 5) + g159;
        int g163 = g(g158, 10);
        int g164 = g(g159 + k(g162, g160, g163) + this.f62363X[11] + 1859775393, 12) + g161;
        int g165 = g(g160, 10);
        int g166 = g(g161 + k(g164, g162, g165) + this.f62363X[5] + 1859775393, 7) + g163;
        int g167 = g(g162, 10);
        int g168 = g(g163 + k(g166, g164, g167) + this.f62363X[12] + 1859775393, 5) + g165;
        int g169 = g(g164, 10);
        int g170 = g(g133 + k(g136, g134, g137) + this.f62363X[15] + 1836072691, 9) + g135;
        int g171 = g(g134, 10);
        int g172 = g(g135 + k(g170, g136, g171) + this.f62363X[5] + 1836072691, 7) + g137;
        int g173 = g(g136, 10);
        int g174 = g(g137 + k(g172, g170, g173) + this.f62363X[1] + 1836072691, 15) + g171;
        int g175 = g(g170, 10);
        int g176 = g(g171 + k(g174, g172, g175) + this.f62363X[3] + 1836072691, 11) + g173;
        int g177 = g(g172, 10);
        int g178 = g(g173 + k(g176, g174, g177) + this.f62363X[7] + 1836072691, 8) + g175;
        int g179 = g(g174, 10);
        int g180 = g(g175 + k(g178, g176, g179) + this.f62363X[14] + 1836072691, 6) + g177;
        int g181 = g(g176, 10);
        int g182 = g(g177 + k(g180, g178, g181) + this.f62363X[6] + 1836072691, 6) + g179;
        int g183 = g(g178, 10);
        int g184 = g(g179 + k(g182, g180, g183) + this.f62363X[9] + 1836072691, 14) + g181;
        int g185 = g(g180, 10);
        int g186 = g(g181 + k(g184, g182, g185) + this.f62363X[11] + 1836072691, 12) + g183;
        int g187 = g(g182, 10);
        int g188 = g(g183 + k(g186, g184, g187) + this.f62363X[8] + 1836072691, 13) + g185;
        int g189 = g(g184, 10);
        int g190 = g(g185 + k(g188, g186, g189) + this.f62363X[12] + 1836072691, 5) + g187;
        int g191 = g(g186, 10);
        int g192 = g(g187 + k(g190, g188, g191) + this.f62363X[2] + 1836072691, 14) + g189;
        int g193 = g(g188, 10);
        int g194 = g(g189 + k(g192, g190, g193) + this.f62363X[10] + 1836072691, 13) + g191;
        int g195 = g(g190, 10);
        int g196 = g(g191 + k(g194, g192, g195) + this.f62363X[0] + 1836072691, 13) + g193;
        int g197 = g(g192, 10);
        int g198 = g(g193 + k(g196, g194, g197) + this.f62363X[4] + 1836072691, 7) + g195;
        int g199 = g(g194, 10);
        int g200 = g(g195 + k(g198, g196, g199) + this.f62363X[13] + 1836072691, 5) + g197;
        int g201 = g(g196, 10);
        int g202 = g(((g165 + l(g168, g166, g169)) + this.f62363X[1]) - 1894007588, 11) + g167;
        int g203 = g(g166, 10);
        int g204 = g(((g167 + l(g202, g168, g203)) + this.f62363X[9]) - 1894007588, 12) + g169;
        int g205 = g(g168, 10);
        int g206 = g(((g169 + l(g204, g202, g205)) + this.f62363X[11]) - 1894007588, 14) + g203;
        int g207 = g(g202, 10);
        int g208 = g(((g203 + l(g206, g204, g207)) + this.f62363X[10]) - 1894007588, 15) + g205;
        int g209 = g(g204, 10);
        int g210 = g(((g205 + l(g208, g206, g209)) + this.f62363X[0]) - 1894007588, 14) + g207;
        int g211 = g(g206, 10);
        int g212 = g(((g207 + l(g210, g208, g211)) + this.f62363X[8]) - 1894007588, 15) + g209;
        int g213 = g(g208, 10);
        int g214 = g(((g209 + l(g212, g210, g213)) + this.f62363X[12]) - 1894007588, 9) + g211;
        int g215 = g(g210, 10);
        int g216 = g(((g211 + l(g214, g212, g215)) + this.f62363X[4]) - 1894007588, 8) + g213;
        int g217 = g(g212, 10);
        int g218 = g(((g213 + l(g216, g214, g217)) + this.f62363X[13]) - 1894007588, 9) + g215;
        int g219 = g(g214, 10);
        int g220 = g(((g215 + l(g218, g216, g219)) + this.f62363X[3]) - 1894007588, 14) + g217;
        int g221 = g(g216, 10);
        int g222 = g(((g217 + l(g220, g218, g221)) + this.f62363X[7]) - 1894007588, 5) + g219;
        int g223 = g(g218, 10);
        int g224 = g(((g219 + l(g222, g220, g223)) + this.f62363X[15]) - 1894007588, 6) + g221;
        int g225 = g(g220, 10);
        int g226 = g(((g221 + l(g224, g222, g225)) + this.f62363X[14]) - 1894007588, 8) + g223;
        int g227 = g(g222, 10);
        int g228 = g(((g223 + l(g226, g224, g227)) + this.f62363X[5]) - 1894007588, 6) + g225;
        int g229 = g(g224, 10);
        int g230 = g(((g225 + l(g228, g226, g229)) + this.f62363X[6]) - 1894007588, 5) + g227;
        int g231 = g(g226, 10);
        int g232 = g(((g227 + l(g230, g228, g231)) + this.f62363X[2]) - 1894007588, 12) + g229;
        int g233 = g(g228, 10);
        int g234 = g(g197 + j(g200, g198, g201) + this.f62363X[8] + 2053994217, 15) + g199;
        int g235 = g(g198, 10);
        int g236 = g(g199 + j(g234, g200, g235) + this.f62363X[6] + 2053994217, 5) + g201;
        int g237 = g(g200, 10);
        int g238 = g(g201 + j(g236, g234, g237) + this.f62363X[4] + 2053994217, 8) + g235;
        int g239 = g(g234, 10);
        int g240 = g(g235 + j(g238, g236, g239) + this.f62363X[1] + 2053994217, 11) + g237;
        int g241 = g(g236, 10);
        int g242 = g(g237 + j(g240, g238, g241) + this.f62363X[3] + 2053994217, 14) + g239;
        int g243 = g(g238, 10);
        int g244 = g(g239 + j(g242, g240, g243) + this.f62363X[11] + 2053994217, 14) + g241;
        int g245 = g(g240, 10);
        int g246 = g(g241 + j(g244, g242, g245) + this.f62363X[15] + 2053994217, 6) + g243;
        int g247 = g(g242, 10);
        int g248 = g(g243 + j(g246, g244, g247) + this.f62363X[0] + 2053994217, 14) + g245;
        int g249 = g(g244, 10);
        int g250 = g(g245 + j(g248, g246, g249) + this.f62363X[5] + 2053994217, 6) + g247;
        int g251 = g(g246, 10);
        int g252 = g(g247 + j(g250, g248, g251) + this.f62363X[12] + 2053994217, 9) + g249;
        int g253 = g(g248, 10);
        int g254 = g(g249 + j(g252, g250, g253) + this.f62363X[2] + 2053994217, 12) + g251;
        int g255 = g(g250, 10);
        int g256 = g(g251 + j(g254, g252, g255) + this.f62363X[13] + 2053994217, 9) + g253;
        int g257 = g(g252, 10);
        int g258 = g(g253 + j(g256, g254, g257) + this.f62363X[9] + 2053994217, 12) + g255;
        int g259 = g(g254, 10);
        int g260 = g(g255 + j(g258, g256, g259) + this.f62363X[7] + 2053994217, 5) + g257;
        int g261 = g(g256, 10);
        int g262 = g(g257 + j(g260, g258, g261) + this.f62363X[10] + 2053994217, 15) + g259;
        int g263 = g(g258, 10);
        int g264 = g(g259 + j(g262, g260, g263) + this.f62363X[14] + 2053994217, 8) + g261;
        int g265 = g(g260, 10);
        int g266 = g(((g229 + m(g232, g230, g233)) + this.f62363X[4]) - 1454113458, 9) + g231;
        int g267 = g(g230, 10);
        int g268 = g(((g231 + m(g266, g232, g267)) + this.f62363X[0]) - 1454113458, 15) + g233;
        int g269 = g(g232, 10);
        int g270 = g(((g233 + m(g268, g266, g269)) + this.f62363X[5]) - 1454113458, 5) + g267;
        int g271 = g(g266, 10);
        int g272 = g(((g267 + m(g270, g268, g271)) + this.f62363X[9]) - 1454113458, 11) + g269;
        int g273 = g(g268, 10);
        int g274 = g(((g269 + m(g272, g270, g273)) + this.f62363X[7]) - 1454113458, 6) + g271;
        int g275 = g(g270, 10);
        int g276 = g(((g271 + m(g274, g272, g275)) + this.f62363X[12]) - 1454113458, 8) + g273;
        int g277 = g(g272, 10);
        int g278 = g(((g273 + m(g276, g274, g277)) + this.f62363X[2]) - 1454113458, 13) + g275;
        int g279 = g(g274, 10);
        int g280 = g(((g275 + m(g278, g276, g279)) + this.f62363X[10]) - 1454113458, 12) + g277;
        int g281 = g(g276, 10);
        int g282 = g(((g277 + m(g280, g278, g281)) + this.f62363X[14]) - 1454113458, 5) + g279;
        int g283 = g(g278, 10);
        int g284 = g(((g279 + m(g282, g280, g283)) + this.f62363X[1]) - 1454113458, 12) + g281;
        int g285 = g(g280, 10);
        int g286 = g(((g281 + m(g284, g282, g285)) + this.f62363X[3]) - 1454113458, 13) + g283;
        int g287 = g(g282, 10);
        int g288 = g(((g283 + m(g286, g284, g287)) + this.f62363X[8]) - 1454113458, 14) + g285;
        int g289 = g(g284, 10);
        int g290 = g(((g285 + m(g288, g286, g289)) + this.f62363X[11]) - 1454113458, 11) + g287;
        int g291 = g(g286, 10);
        int g292 = g(((g287 + m(g290, g288, g291)) + this.f62363X[6]) - 1454113458, 8) + g289;
        int g293 = g(g288, 10);
        int g294 = g(((g289 + m(g292, g290, g293)) + this.f62363X[15]) - 1454113458, 5) + g291;
        int g295 = g(g290, 10);
        int g296 = g(((g291 + m(g294, g292, g295)) + this.f62363X[13]) - 1454113458, 6) + g293;
        int g297 = g(g292, 10);
        int g298 = g(g261 + i(g264, g262, g265) + this.f62363X[12], 8) + g263;
        int g299 = g(g262, 10);
        int g300 = g(g263 + i(g298, g264, g299) + this.f62363X[15], 5) + g265;
        int g301 = g(g264, 10);
        int g302 = g(g265 + i(g300, g298, g301) + this.f62363X[10], 12) + g299;
        int g303 = g(g298, 10);
        int g304 = g(g299 + i(g302, g300, g303) + this.f62363X[4], 9) + g301;
        int g305 = g(g300, 10);
        int g306 = g(g301 + i(g304, g302, g305) + this.f62363X[1], 12) + g303;
        int g307 = g(g302, 10);
        int g308 = g(g303 + i(g306, g304, g307) + this.f62363X[5], 5) + g305;
        int g309 = g(g304, 10);
        int g310 = g(g305 + i(g308, g306, g309) + this.f62363X[8], 14) + g307;
        int g311 = g(g306, 10);
        int g312 = g(g307 + i(g310, g308, g311) + this.f62363X[7], 6) + g309;
        int g313 = g(g308, 10);
        int g314 = g(g309 + i(g312, g310, g313) + this.f62363X[6], 8) + g311;
        int g315 = g(g310, 10);
        int g316 = g(g311 + i(g314, g312, g315) + this.f62363X[2], 13) + g313;
        int g317 = g(g312, 10);
        int g318 = g(g313 + i(g316, g314, g317) + this.f62363X[13], 6) + g315;
        int g319 = g(g314, 10);
        int g320 = g(g315 + i(g318, g316, g319) + this.f62363X[14], 5) + g317;
        int g321 = g(g316, 10);
        int g322 = g(g317 + i(g320, g318, g321) + this.f62363X[0], 15) + g319;
        int g323 = g(g318, 10);
        int g324 = g(g319 + i(g322, g320, g323) + this.f62363X[3], 13) + g321;
        int g325 = g(g320, 10);
        int g326 = g(g321 + i(g324, g322, g325) + this.f62363X[9], 11) + g323;
        int g327 = g(g322, 10);
        int g328 = g(g323 + i(g326, g324, g327) + this.f62363X[11], 11) + g325;
        int g329 = g(g324, 10) + g294 + this.f62365d;
        this.f62365d = this.f62366e + g297 + g327;
        this.f62366e = this.f62367f + g295 + g325;
        this.f62367f = this.f62368g + g293 + g328;
        this.f62368g = this.f62364c + g296 + g326;
        this.f62364c = g329;
        this.f62369h = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f62363X;
            if (i15 == iArr.length) {
                return;
            }
            iArr[i15] = 0;
            i15++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public int doFinal(byte[] bArr, int i10) {
        c();
        n(this.f62364c, bArr, i10);
        n(this.f62365d, bArr, i10 + 4);
        n(this.f62366e, bArr, i10 + 8);
        n(this.f62367f, bArr, i10 + 12);
        n(this.f62368g, bArr, i10 + 16);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.digests.e
    public void e(long j10) {
        if (this.f62369h > 14) {
            d();
        }
        int[] iArr = this.f62363X;
        iArr[14] = (int) j10;
        iArr[15] = (int) (j10 >>> 32);
    }

    @Override // org.spongycastle.crypto.digests.e
    public void f(byte[] bArr, int i10) {
        int[] iArr = this.f62363X;
        int i11 = this.f62369h;
        int i12 = i11 + 1;
        this.f62369h = i12;
        iArr[i11] = ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        if (i12 == 16) {
            d();
        }
    }

    @Override // org.spongycastle.crypto.o
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.spongycastle.crypto.o
    public int getDigestSize() {
        return 20;
    }

    public final void h(l lVar) {
        super.b(lVar);
        this.f62364c = lVar.f62364c;
        this.f62365d = lVar.f62365d;
        this.f62366e = lVar.f62366e;
        this.f62367f = lVar.f62367f;
        this.f62368g = lVar.f62368g;
        int[] iArr = lVar.f62363X;
        System.arraycopy(iArr, 0, this.f62363X, 0, iArr.length);
        this.f62369h = lVar.f62369h;
    }

    public final int m(int i10, int i11, int i12) {
        return i10 ^ (i11 | (~i12));
    }

    @Override // org.spongycastle.crypto.digests.e, org.spongycastle.crypto.o
    public void reset() {
        super.reset();
        this.f62364c = 1732584193;
        this.f62365d = -271733879;
        this.f62366e = -1732584194;
        this.f62367f = 271733878;
        this.f62368g = -1009589776;
        this.f62369h = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f62363X;
            if (i10 == iArr.length) {
                return;
            }
            iArr[i10] = 0;
            i10++;
        }
    }

    public l(l lVar) {
        super(lVar);
        this.f62363X = new int[16];
        h(lVar);
    }
}
