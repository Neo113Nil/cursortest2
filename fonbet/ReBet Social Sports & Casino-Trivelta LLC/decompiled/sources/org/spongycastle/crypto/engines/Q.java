package org.spongycastle.crypto.engines;

/* loaded from: classes5.dex */
public class Q implements org.spongycastle.crypto.e {
    private static int[] MOD17;
    private static int[] MOD3;
    private static int[] MOD5;
    private static int[] MOD9;

    /* renamed from: a, reason: collision with root package name */
    public int f62516a;

    /* renamed from: b, reason: collision with root package name */
    public int f62517b;

    /* renamed from: c, reason: collision with root package name */
    public d f62518c;
    private long[] currentBlock;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62519d;
    private long[] kw;

    /* renamed from: t, reason: collision with root package name */
    private long[] f62520t;

    public static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD17;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            int i11 = 9;
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            long j22 = jArr[12];
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            int i12 = 19;
            while (i12 >= i10) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j26 = j10 - jArr3[i15];
                int i16 = i13 + 2;
                long j27 = j11 - jArr3[i16];
                int i17 = i13 + 3;
                long j28 = j12 - jArr3[i17];
                int i18 = i13 + 4;
                long j29 = j13 - jArr3[i18];
                int i19 = i13 + 5;
                int i20 = i10;
                long j30 = j14 - jArr3[i19];
                int i21 = i13 + 6;
                long[] jArr5 = jArr3;
                long j31 = j15 - jArr3[i21];
                int i22 = i13 + 7;
                long[] jArr6 = jArr4;
                long j32 = j16 - jArr5[i22];
                int i23 = i13 + 8;
                int[] iArr3 = iArr2;
                long j33 = j17 - jArr5[i23];
                int i24 = i13 + 9;
                long j34 = j18 - jArr5[i24];
                int i25 = i13 + 10;
                long j35 = j19 - jArr5[i25];
                int i26 = i13 + 11;
                long j36 = j20 - jArr5[i26];
                int i27 = i13 + 12;
                long j37 = j21 - jArr5[i27];
                int i28 = i13 + 13;
                long j38 = j22 - jArr5[i28];
                int i29 = i13 + 14;
                int i30 = i14 + 1;
                long j39 = j23 - (jArr5[i29] + jArr6[i30]);
                int i31 = i13 + 15;
                long j40 = j24 - (jArr5[i31] + jArr6[i14 + 2]);
                long j41 = i12;
                long m10 = Q.m(j25 - ((jArr5[i13 + 16] + j41) + 1), i11, j26);
                long j42 = j26 - m10;
                long m11 = Q.m(j37, 48, j28);
                long j43 = j28 - m11;
                long m12 = Q.m(j39, 35, j32);
                long j44 = j32 - m12;
                long m13 = Q.m(j35, 52, j30);
                long j45 = j30 - m13;
                long m14 = Q.m(j27, 23, j40);
                long j46 = j40 - m14;
                long m15 = Q.m(j31, 31, j34);
                long j47 = j34 - m15;
                long m16 = Q.m(j29, 37, j36);
                long j48 = j36 - m16;
                long m17 = Q.m(j33, 20, j38);
                long j49 = j38 - m17;
                long m18 = Q.m(m17, 31, j42);
                long j50 = j42 - m18;
                long m19 = Q.m(m15, 44, j43);
                long j51 = j43 - m19;
                long m20 = Q.m(m16, 47, j45);
                long j52 = j45 - m20;
                long m21 = Q.m(m14, 46, j44);
                long j53 = j44 - m21;
                long m22 = Q.m(m10, 19, j49);
                long j54 = j49 - m22;
                long m23 = Q.m(m12, 42, j46);
                long j55 = j46 - m23;
                long m24 = Q.m(m11, 44, j47);
                long j56 = j47 - m24;
                long m25 = Q.m(m13, 25, j48);
                long j57 = j48 - m25;
                long m26 = Q.m(m25, 16, j50);
                long j58 = j50 - m26;
                long m27 = Q.m(m23, 34, j51);
                long j59 = j51 - m27;
                long m28 = Q.m(m24, 56, j53);
                long j60 = j53 - m28;
                long m29 = Q.m(m22, 51, j52);
                long j61 = j52 - m29;
                long m30 = Q.m(m18, 4, j57);
                long j62 = j57 - m30;
                long m31 = Q.m(m20, 53, j54);
                long j63 = j54 - m31;
                long m32 = Q.m(m19, 42, j55);
                long j64 = j55 - m32;
                long m33 = Q.m(m21, 41, j56);
                long j65 = j56 - m33;
                long m34 = Q.m(m33, 41, j58);
                long j66 = j58 - m34;
                long m35 = Q.m(m31, 9, j59);
                long m36 = Q.m(m32, 37, j61);
                long j67 = j61 - m36;
                long m37 = Q.m(m30, 31, j60);
                long j68 = j60 - m37;
                long m38 = Q.m(m26, 12, j65);
                long j69 = j65 - m38;
                long m39 = Q.m(m28, 47, j62);
                long j70 = j62 - m39;
                long m40 = Q.m(m27, 44, j63);
                long j71 = j63 - m40;
                long m41 = Q.m(m29, 30, j64);
                long j72 = j64 - m41;
                long j73 = j66 - jArr5[i13];
                long j74 = m34 - jArr5[i15];
                long j75 = (j59 - m35) - jArr5[i16];
                long j76 = m35 - jArr5[i17];
                long j77 = j67 - jArr5[i18];
                long j78 = m36 - jArr5[i19];
                long j79 = j68 - jArr5[i21];
                long j80 = m37 - jArr5[i22];
                long j81 = j69 - jArr5[i23];
                long j82 = m38 - jArr5[i24];
                long j83 = j70 - jArr5[i25];
                long j84 = m39 - jArr5[i26];
                long j85 = j71 - jArr5[i27];
                long j86 = m40 - (jArr5[i28] + jArr6[i14]);
                long j87 = j72 - (jArr5[i29] + jArr6[i30]);
                long m42 = Q.m(m41 - (jArr5[i31] + j41), 5, j73);
                long j88 = j73 - m42;
                long m43 = Q.m(j84, 20, j75);
                long j89 = j75 - m43;
                long m44 = Q.m(j86, 48, j79);
                long j90 = j79 - m44;
                long m45 = Q.m(j82, 41, j77);
                long j91 = j77 - m45;
                long m46 = Q.m(j74, 47, j87);
                long j92 = j87 - m46;
                long m47 = Q.m(j78, 28, j81);
                long j93 = j81 - m47;
                long m48 = Q.m(j76, 16, j83);
                long j94 = j83 - m48;
                long m49 = Q.m(j80, 25, j85);
                long j95 = j85 - m49;
                long m50 = Q.m(m49, 33, j88);
                long j96 = j88 - m50;
                long m51 = Q.m(m47, 4, j89);
                long j97 = j89 - m51;
                long m52 = Q.m(m48, 51, j91);
                long j98 = j91 - m52;
                long m53 = Q.m(m46, 13, j90);
                long j99 = j90 - m53;
                long m54 = Q.m(m42, 34, j95);
                long j100 = j95 - m54;
                long m55 = Q.m(m44, 41, j92);
                long j101 = j92 - m55;
                long m56 = Q.m(m43, 59, j93);
                long j102 = j93 - m56;
                long m57 = Q.m(m45, 17, j94);
                long j103 = j94 - m57;
                long m58 = Q.m(m57, 38, j96);
                long j104 = j96 - m58;
                long m59 = Q.m(m55, 19, j97);
                long j105 = j97 - m59;
                long m60 = Q.m(m56, 10, j99);
                long j106 = j99 - m60;
                long m61 = Q.m(m54, 55, j98);
                long j107 = j98 - m61;
                long m62 = Q.m(m50, 49, j103);
                long j108 = j103 - m62;
                long m63 = Q.m(m52, 18, j100);
                long j109 = j100 - m63;
                long m64 = Q.m(m51, 23, j101);
                long j110 = j101 - m64;
                long m65 = Q.m(m53, 52, j102);
                long j111 = j102 - m65;
                long m66 = Q.m(m65, 24, j104);
                long j112 = j104 - m66;
                long m67 = Q.m(m63, 13, j105);
                j12 = j105 - m67;
                long m68 = Q.m(m64, 8, j107);
                long j113 = j107 - m68;
                long m69 = Q.m(m62, 47, j106);
                long j114 = j106 - m69;
                long m70 = Q.m(m58, 8, j111);
                long j115 = j111 - m70;
                long m71 = Q.m(m60, 17, j108);
                long j116 = j108 - m71;
                long m72 = Q.m(m59, 22, j109);
                j22 = j109 - m72;
                j25 = Q.m(m61, 37, j110);
                j24 = j110 - j25;
                j21 = m71;
                j20 = j116;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j16 = j114;
                j15 = m68;
                j10 = j112;
                i11 = 9;
                j13 = m67;
                j23 = m72;
                j17 = m69;
                i12 -= 2;
                j19 = m70;
                j14 = j113;
                j11 = m66;
                i10 = i20;
                j18 = j115;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i32 = i10;
            long j117 = j10 - jArr7[0];
            long j118 = j11 - jArr7[i32];
            long j119 = j12 - jArr7[2];
            long j120 = j13 - jArr7[3];
            long j121 = j14 - jArr7[4];
            long j122 = j15 - jArr7[5];
            long j123 = j16 - jArr7[6];
            long j124 = j17 - jArr7[7];
            long j125 = j18 - jArr7[8];
            long j126 = j19 - jArr7[9];
            long j127 = j20 - jArr7[10];
            long j128 = j21 - jArr7[11];
            long j129 = j22 - jArr7[12];
            long j130 = j23 - (jArr7[13] + jArr8[0]);
            long j131 = j24 - (jArr7[14] + jArr8[i32]);
            long j132 = j25 - jArr7[15];
            jArr2[0] = j117;
            jArr2[i32] = j118;
            jArr2[2] = j119;
            jArr2[3] = j120;
            jArr2[4] = j121;
            jArr2[5] = j122;
            jArr2[6] = j123;
            jArr2[7] = j124;
            jArr2[8] = j125;
            jArr2[9] = j126;
            jArr2[10] = j127;
            jArr2[11] = j128;
            jArr2[12] = j129;
            jArr2[13] = j130;
            jArr2[14] = j131;
            jArr2[15] = j132;
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD17;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = jArr[8];
            long j19 = jArr[9];
            long j20 = jArr[10];
            long j21 = jArr[11];
            int i10 = 9;
            long j22 = jArr[12];
            int i11 = 12;
            int i12 = 13;
            long j23 = jArr[13];
            long j24 = jArr[14];
            long j25 = jArr[15];
            long j26 = j10 + jArr3[0];
            long j27 = j11 + jArr3[1];
            long j28 = j12 + jArr3[2];
            long j29 = j13 + jArr3[3];
            long j30 = j14 + jArr3[4];
            long j31 = j15 + jArr3[5];
            long j32 = j16 + jArr3[6];
            long j33 = j17 + jArr3[7];
            long j34 = j18 + jArr3[8];
            long j35 = j19 + jArr3[9];
            long j36 = j20 + jArr3[10];
            long j37 = j21 + jArr3[11];
            long j38 = j22 + jArr3[12];
            long j39 = j23 + jArr3[13] + jArr4[0];
            long j40 = j24 + jArr3[14] + jArr4[1];
            long j41 = j31;
            long j42 = j33;
            long j43 = j35;
            long j44 = j37;
            long j45 = j39;
            long j46 = j25 + jArr3[15];
            long j47 = j30;
            long j48 = j26;
            long j49 = j29;
            int i13 = 1;
            while (i13 < 20) {
                int i14 = iArr[i13];
                int i15 = iArr2[i13];
                long j50 = j49;
                long j51 = j48 + j27;
                long i16 = Q.i(j27, 24, j51);
                long j52 = j28 + j50;
                long i17 = Q.i(j50, i12, j52);
                int i18 = i13;
                long j53 = j41;
                long j54 = j47 + j53;
                long i19 = Q.i(j53, 8, j54);
                long[] jArr5 = jArr3;
                long j55 = j42;
                long j56 = j32 + j55;
                long[] jArr6 = jArr4;
                long i20 = Q.i(j55, 47, j56);
                long j57 = j43;
                long j58 = j34 + j57;
                int[] iArr3 = iArr2;
                long i21 = Q.i(j57, 8, j58);
                long j59 = j44;
                long j60 = j36 + j59;
                long i22 = Q.i(j59, 17, j60);
                long j61 = j45;
                long j62 = j38 + j61;
                long i23 = Q.i(j61, 22, j62);
                long j63 = j46;
                long j64 = j40 + j63;
                long i24 = Q.i(j63, 37, j64);
                long j65 = j51 + i21;
                long i25 = Q.i(i21, 38, j65);
                long j66 = j52 + i23;
                long i26 = Q.i(i23, 19, j66);
                long j67 = j56 + i22;
                long i27 = Q.i(i22, 10, j67);
                long j68 = j54 + i24;
                long i28 = Q.i(i24, 55, j68);
                long j69 = j60 + i20;
                long i29 = Q.i(i20, 49, j69);
                long j70 = j62 + i17;
                long i30 = Q.i(i17, 18, j70);
                long j71 = j64 + i19;
                long i31 = Q.i(i19, 23, j71);
                long j72 = j58 + i16;
                long i32 = Q.i(i16, 52, j72);
                long j73 = j65 + i29;
                long i33 = Q.i(i29, 33, j73);
                long j74 = j66 + i31;
                long i34 = Q.i(i31, 4, j74);
                long j75 = j68 + i30;
                long i35 = Q.i(i30, 51, j75);
                long j76 = j67 + i32;
                long i36 = Q.i(i32, 13, j76);
                long j77 = j70 + i28;
                long i37 = Q.i(i28, 34, j77);
                long j78 = j71 + i26;
                long i38 = Q.i(i26, 41, j78);
                long j79 = j72 + i27;
                long i39 = Q.i(i27, 59, j79);
                long j80 = j69 + i25;
                long i40 = Q.i(i25, 17, j80);
                long j81 = j73 + i37;
                long i41 = Q.i(i37, 5, j81);
                long j82 = j74 + i39;
                long i42 = Q.i(i39, 20, j82);
                long j83 = j76 + i38;
                long i43 = Q.i(i38, 48, j83);
                long j84 = j75 + i40;
                long i44 = Q.i(i40, 41, j84);
                long j85 = j78 + i36;
                long i45 = Q.i(i36, 47, j85);
                long j86 = j79 + i34;
                long i46 = Q.i(i34, 28, j86);
                long j87 = j80 + i35;
                long i47 = Q.i(i35, 16, j87);
                long j88 = j77 + i33;
                long i48 = Q.i(i33, 25, j88);
                long j89 = j81 + jArr5[i14];
                int i49 = i14 + 1;
                long j90 = i45 + jArr5[i49];
                int i50 = i14 + 2;
                long j91 = j82 + jArr5[i50];
                int i51 = i14 + 3;
                long j92 = i47 + jArr5[i51];
                int i52 = i14 + 4;
                long j93 = j84 + jArr5[i52];
                int i53 = i14 + 5;
                long j94 = i46 + jArr5[i53];
                int i54 = i14 + 6;
                long j95 = j83 + jArr5[i54];
                int i55 = i14 + 7;
                long j96 = i48 + jArr5[i55];
                int i56 = i14 + 8;
                long j97 = j86 + jArr5[i56];
                int i57 = i14 + 9;
                long j98 = i44 + jArr5[i57];
                int i58 = i14 + 10;
                long j99 = j87 + jArr5[i58];
                int i59 = i14 + 11;
                long j100 = i42 + jArr5[i59];
                int i60 = i14 + 12;
                long j101 = j88 + jArr5[i60];
                int i61 = i14 + 13;
                long j102 = i43 + jArr5[i61] + jArr6[i15];
                int i62 = i14 + 14;
                int i63 = i15 + 1;
                long j103 = j85 + jArr5[i62] + jArr6[i63];
                int i64 = i14 + 15;
                long j104 = i18;
                long j105 = i41 + jArr5[i64] + j104;
                long j106 = j89 + j90;
                long i65 = Q.i(j90, 41, j106);
                long j107 = j91 + j92;
                long i66 = Q.i(j92, i10, j107);
                long j108 = j93 + j94;
                long i67 = Q.i(j94, 37, j108);
                long j109 = j95 + j96;
                long i68 = Q.i(j96, 31, j109);
                long j110 = j97 + j98;
                long i69 = Q.i(j98, i11, j110);
                long j111 = j99 + j100;
                long i70 = Q.i(j100, 47, j111);
                long j112 = j101 + j102;
                long i71 = Q.i(j102, 44, j112);
                long j113 = j103 + j105;
                long i72 = Q.i(j105, 30, j113);
                long j114 = j106 + i69;
                long i73 = Q.i(i69, 16, j114);
                long j115 = j107 + i71;
                long i74 = Q.i(i71, 34, j115);
                long j116 = j109 + i70;
                long i75 = Q.i(i70, 56, j116);
                long j117 = j108 + i72;
                long i76 = Q.i(i72, 51, j117);
                long j118 = j111 + i68;
                long i77 = Q.i(i68, 4, j118);
                long j119 = j112 + i66;
                long i78 = Q.i(i66, 53, j119);
                long j120 = j113 + i67;
                long i79 = Q.i(i67, 42, j120);
                long j121 = j110 + i65;
                long i80 = Q.i(i65, 41, j121);
                long j122 = j114 + i77;
                long i81 = Q.i(i77, 31, j122);
                long j123 = j115 + i79;
                long i82 = Q.i(i79, 44, j123);
                long j124 = j117 + i78;
                long i83 = Q.i(i78, 47, j124);
                long j125 = j116 + i80;
                long i84 = Q.i(i80, 46, j125);
                long j126 = j119 + i76;
                long i85 = Q.i(i76, 19, j126);
                long j127 = j120 + i74;
                long i86 = Q.i(i74, 42, j127);
                long j128 = j121 + i75;
                long i87 = Q.i(i75, 44, j128);
                long j129 = j118 + i73;
                long i88 = Q.i(i73, 25, j129);
                long j130 = j122 + i85;
                long i89 = Q.i(i85, 9, j130);
                long j131 = j123 + i87;
                long i90 = Q.i(i87, 48, j131);
                long j132 = j125 + i86;
                long i91 = Q.i(i86, 35, j132);
                long j133 = j124 + i88;
                long i92 = Q.i(i88, 52, j133);
                long j134 = j127 + i84;
                long i93 = Q.i(i84, 23, j134);
                long j135 = j128 + i82;
                long i94 = Q.i(i82, 31, j135);
                long j136 = j129 + i83;
                long i95 = Q.i(i83, 37, j136);
                long j137 = j126 + i81;
                long i96 = Q.i(i81, 20, j137);
                long j138 = jArr5[i49] + j130;
                long j139 = i93 + jArr5[i50];
                long j140 = j131 + jArr5[i51];
                long j141 = i95 + jArr5[i52];
                long j142 = j133 + jArr5[i53];
                long j143 = i94 + jArr5[i54];
                long j144 = j132 + jArr5[i55];
                long j145 = i96 + jArr5[i56];
                long j146 = j135 + jArr5[i57];
                j43 = i92 + jArr5[i58];
                long j147 = j136 + jArr5[i59];
                long j148 = i90 + jArr5[i60];
                j38 = j137 + jArr5[i61];
                j45 = i91 + jArr5[i62] + jArr6[i63];
                long j149 = j134 + jArr5[i64] + jArr6[i15 + 2];
                j46 = i89 + jArr5[i14 + 16] + j104 + 1;
                j32 = j144;
                j34 = j146;
                j47 = j142;
                j27 = j139;
                j28 = j140;
                i13 = i18 + 2;
                j49 = j141;
                j36 = j147;
                j44 = j148;
                j41 = j143;
                i12 = 13;
                i10 = 9;
                i11 = 12;
                j42 = j145;
                j48 = j138;
                j40 = j149;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j48;
            jArr2[1] = j27;
            jArr2[2] = j28;
            jArr2[3] = j49;
            jArr2[4] = j47;
            jArr2[5] = j41;
            jArr2[6] = j32;
            jArr2[7] = j42;
            jArr2[8] = j34;
            jArr2[9] = j43;
            jArr2[10] = j36;
            jArr2[11] = j44;
            jArr2[12] = j38;
            jArr2[13] = j45;
            jArr2[14] = j40;
            jArr2[15] = j46;
        }
    }

    public static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD5;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            char c10 = 2;
            long j12 = jArr[2];
            long j13 = jArr[3];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j14 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j15 = j11 - (jArr3[i15] + jArr4[i16]);
                int i17 = i12 + 3;
                long j16 = j12 - (jArr3[i17] + jArr4[i13 + 2]);
                int i18 = i10;
                long j17 = i11;
                char c11 = c10;
                long m10 = Q.m(j13 - ((jArr3[i12 + 4] + j17) + 1), 32, j14);
                long j18 = j14 - m10;
                long[] jArr5 = jArr3;
                long m11 = Q.m(j15, 32, j16);
                long j19 = j16 - m11;
                long[] jArr6 = jArr4;
                long m12 = Q.m(m11, 58, j18);
                long j20 = j18 - m12;
                long m13 = Q.m(m10, 22, j19);
                long j21 = j19 - m13;
                long m14 = Q.m(m13, 46, j20);
                long j22 = j20 - m14;
                long m15 = Q.m(m12, 12, j21);
                long j23 = j21 - m15;
                long m16 = Q.m(m15, 25, j22);
                long m17 = Q.m(m14, 33, j23);
                long j24 = (j22 - m16) - jArr5[i12];
                long j25 = m16 - (jArr5[i14] + jArr6[i13]);
                long j26 = (j23 - m17) - (jArr5[i15] + jArr6[i16]);
                long m18 = Q.m(m17 - (jArr5[i17] + j17), 5, j24);
                long j27 = j24 - m18;
                long m19 = Q.m(j25, 37, j26);
                long j28 = j26 - m19;
                long m20 = Q.m(m19, 23, j27);
                long j29 = j27 - m20;
                long m21 = Q.m(m18, 40, j28);
                long j30 = j28 - m21;
                long m22 = Q.m(m21, 52, j29);
                long j31 = j29 - m22;
                long m23 = Q.m(m20, 57, j30);
                long j32 = j30 - m23;
                long m24 = Q.m(m23, 14, j31);
                j13 = Q.m(m22, 16, j32);
                j12 = j32 - j13;
                i11 -= 2;
                j11 = m24;
                i10 = i18;
                jArr3 = jArr5;
                c10 = c11;
                j10 = j31 - m24;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i19 = i10;
            char c12 = c10;
            long j33 = j10 - jArr7[0];
            long j34 = j11 - (jArr7[i19] + jArr8[0]);
            long j35 = j12 - (jArr7[c12] + jArr8[i19]);
            long j36 = j13 - jArr7[3];
            jArr2[0] = j33;
            jArr2[i19] = j34;
            jArr2[c12] = j35;
            jArr2[3] = j36;
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD5;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            boolean z10 = true;
            long j11 = jArr[1];
            long j12 = jArr[2];
            char c10 = 3;
            long j13 = jArr[3];
            long j14 = j10 + jArr3[0];
            long j15 = j11 + jArr3[1] + jArr4[0];
            int i10 = 1;
            long j16 = j12 + jArr3[2] + jArr4[1];
            long j17 = j13 + jArr3[3];
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j18 = j14 + j15;
                boolean z11 = z10;
                long i13 = Q.i(j15, 14, j18);
                long j19 = j16 + j17;
                long i14 = Q.i(j17, 16, j19);
                long[] jArr5 = jArr3;
                long j20 = j18 + i14;
                long i15 = Q.i(i14, 52, j20);
                long j21 = j19 + i13;
                long i16 = Q.i(i13, 57, j21);
                long j22 = j20 + i16;
                long i17 = Q.i(i16, 23, j22);
                long j23 = j21 + i15;
                long i18 = Q.i(i15, 40, j23);
                long j24 = j22 + i18;
                long i19 = Q.i(i18, 5, j24);
                long j25 = j23 + i17;
                long i20 = Q.i(i17, 37, j25);
                long j26 = j24 + jArr5[i11];
                int i21 = i11 + 1;
                long j27 = i20 + jArr5[i21] + jArr4[i12];
                int i22 = i11 + 2;
                int i23 = i12 + 1;
                long j28 = j25 + jArr5[i22] + jArr4[i23];
                int i24 = i11 + 3;
                long j29 = i10;
                long j30 = i19 + jArr5[i24] + j29;
                long j31 = j26 + j27;
                long i25 = Q.i(j27, 25, j31);
                long j32 = j28 + j30;
                long i26 = Q.i(j30, 33, j32);
                long j33 = j31 + i26;
                long i27 = Q.i(i26, 46, j33);
                long j34 = j32 + i25;
                long i28 = Q.i(i25, 12, j34);
                long j35 = j33 + i28;
                long i29 = Q.i(i28, 58, j35);
                long j36 = j34 + i27;
                long i30 = Q.i(i27, 22, j36);
                long j37 = j35 + i30;
                long i31 = Q.i(i30, 32, j37);
                long j38 = j36 + i29;
                long i32 = Q.i(i29, 32, j38);
                long j39 = j37 + jArr5[i21];
                long j40 = i32 + jArr5[i22] + jArr4[i23];
                j16 = j38 + jArr5[i24] + jArr4[i12 + 2];
                j17 = i31 + jArr5[i11 + 4] + j29 + 1;
                i10 += 2;
                j15 = j40;
                z10 = z11;
                c10 = c10;
                j14 = j39;
                jArr3 = jArr5;
            }
            jArr2[0] = j14;
            jArr2[z10 ? 1 : 0] = j15;
            jArr2[2] = j16;
            jArr2[c10] = j17;
        }
    }

    public static final class c extends d {
        public c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD9;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c10 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            int i10 = 1;
            long j11 = jArr[1];
            char c11 = 2;
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            int i11 = 17;
            while (i11 >= i10) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                int i14 = i12 + 1;
                long j18 = j10 - jArr3[i14];
                int i15 = i12 + 2;
                long j19 = j11 - jArr3[i15];
                int i16 = i12 + 3;
                long j20 = j12 - jArr3[i16];
                int i17 = i12 + 4;
                long j21 = j13 - jArr3[i17];
                int i18 = i12 + 5;
                char c12 = c11;
                long j22 = j14 - jArr3[i18];
                int i19 = i12 + 6;
                int i20 = i13 + 1;
                int i21 = i10;
                long j23 = j15 - (jArr3[i19] + jArr4[i20]);
                int i22 = i12 + 7;
                long[] jArr5 = jArr3;
                long j24 = j16 - (jArr3[i22] + jArr4[i13 + 2]);
                long[] jArr6 = jArr4;
                long j25 = i11;
                long j26 = j17 - ((jArr5[i12 + 8] + j25) + 1);
                int[] iArr3 = iArr2;
                long m10 = Q.m(j19, 8, j24);
                long j27 = j24 - m10;
                long m11 = Q.m(j26, 35, j18);
                long j28 = j18 - m11;
                long m12 = Q.m(j23, 56, j20);
                long j29 = j20 - m12;
                long m13 = Q.m(j21, 22, j22);
                long j30 = j22 - m13;
                long m14 = Q.m(m10, 25, j30);
                long j31 = j30 - m14;
                long m15 = Q.m(m13, 29, j27);
                long j32 = j27 - m15;
                long m16 = Q.m(m12, 39, j28);
                long j33 = j28 - m16;
                long m17 = Q.m(m11, 43, j29);
                long j34 = j29 - m17;
                long m18 = Q.m(m14, 13, j34);
                long j35 = j34 - m18;
                long m19 = Q.m(m17, 50, j31);
                long j36 = j31 - m19;
                long m20 = Q.m(m16, 10, j32);
                long j37 = j32 - m20;
                long m21 = Q.m(m15, 17, j33);
                long j38 = j33 - m21;
                long m22 = Q.m(m18, 39, j38);
                long j39 = j38 - m22;
                long m23 = Q.m(m21, 30, j35);
                long m24 = Q.m(m20, 34, j36);
                long m25 = Q.m(m19, 24, j37);
                long j40 = j37 - m25;
                long j41 = j39 - jArr5[i12];
                long j42 = m22 - jArr5[i14];
                long j43 = (j35 - m23) - jArr5[i15];
                long j44 = m23 - jArr5[i16];
                long j45 = (j36 - m24) - jArr5[i17];
                long j46 = m24 - (jArr5[i18] + jArr6[i13]);
                long j47 = j40 - (jArr5[i19] + jArr6[i20]);
                long j48 = m25 - (jArr5[i22] + j25);
                long m26 = Q.m(j42, 44, j47);
                long j49 = j47 - m26;
                long m27 = Q.m(j48, 9, j41);
                long j50 = j41 - m27;
                long m28 = Q.m(j46, 54, j43);
                long j51 = j43 - m28;
                long m29 = Q.m(j44, 56, j45);
                long j52 = j45 - m29;
                long m30 = Q.m(m26, 17, j52);
                long j53 = j52 - m30;
                long m31 = Q.m(m29, 49, j49);
                long j54 = j49 - m31;
                long m32 = Q.m(m28, 36, j50);
                long j55 = j50 - m32;
                long m33 = Q.m(m27, 39, j51);
                long j56 = j51 - m33;
                long m34 = Q.m(m30, 33, j56);
                long j57 = j56 - m34;
                long m35 = Q.m(m33, 27, j53);
                long j58 = j53 - m35;
                long m36 = Q.m(m32, 14, j54);
                long j59 = j54 - m36;
                long m37 = Q.m(m31, 42, j55);
                long j60 = j55 - m37;
                long m38 = Q.m(m34, 46, j60);
                j13 = Q.m(m37, 36, j57);
                j15 = Q.m(m36, 19, j58);
                long j61 = j58 - j15;
                j17 = Q.m(m35, 37, j59);
                j16 = j59 - j17;
                j12 = j57 - j13;
                j11 = m38;
                i11 -= 2;
                j10 = j60 - m38;
                i10 = i21;
                jArr3 = jArr5;
                c10 = c10;
                c11 = c12;
                iArr2 = iArr3;
                j14 = j61;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c13 = c10;
            int i23 = i10;
            char c14 = c11;
            long j62 = j10 - jArr7[0];
            long j63 = j11 - jArr7[i23];
            long j64 = j12 - jArr7[c14];
            long j65 = j13 - jArr7[3];
            long j66 = j14 - jArr7[4];
            long j67 = j15 - (jArr7[c13] + jArr8[0]);
            long j68 = j16 - (jArr7[6] + jArr8[i23]);
            long j69 = j17 - jArr7[7];
            jArr2[0] = j62;
            jArr2[i23] = j63;
            jArr2[c14] = j64;
            jArr2[3] = j65;
            jArr2[4] = j66;
            jArr2[c13] = j67;
            jArr2[6] = j68;
            jArr2[7] = j69;
        }

        @Override // org.spongycastle.crypto.engines.Q.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f62521t;
            int[] iArr = Q.MOD9;
            int[] iArr2 = Q.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j10 = jArr[0];
            long j11 = jArr[1];
            long j12 = jArr[2];
            long j13 = jArr[3];
            long j14 = jArr[4];
            long j15 = jArr[5];
            long j16 = jArr[6];
            long j17 = jArr[7];
            long j18 = j10 + jArr3[0];
            long j19 = j11 + jArr3[1];
            long j20 = j12 + jArr3[2];
            long j21 = j13 + jArr3[3];
            long j22 = j14 + jArr3[4];
            long j23 = j15 + jArr3[5] + jArr4[0];
            long j24 = j16 + jArr3[6] + jArr4[1];
            int i10 = 1;
            long j25 = j18;
            long j26 = j21;
            long j27 = j17 + jArr3[7];
            long j28 = j24;
            long j29 = j20;
            long j30 = j23;
            long j31 = j22;
            while (i10 < 18) {
                int i11 = iArr[i10];
                int i12 = iArr2[i10];
                long j32 = j26;
                long j33 = j25 + j19;
                long i13 = Q.i(j19, 46, j33);
                long[] jArr5 = jArr3;
                long j34 = j29 + j32;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long i14 = Q.i(j32, 36, j34);
                long j35 = j31 + j30;
                long i15 = Q.i(j30, 19, j35);
                long j36 = j28 + j27;
                long i16 = Q.i(j27, 37, j36);
                long j37 = j34 + i13;
                long i17 = Q.i(i13, 33, j37);
                long j38 = j35 + i16;
                long i18 = Q.i(i16, 27, j38);
                long j39 = j36 + i15;
                long i19 = Q.i(i15, 14, j39);
                long j40 = j33 + i14;
                long i20 = Q.i(i14, 42, j40);
                long j41 = j38 + i17;
                long i21 = Q.i(i17, 17, j41);
                long j42 = j39 + i20;
                long i22 = Q.i(i20, 49, j42);
                long j43 = j40 + i19;
                long i23 = Q.i(i19, 36, j43);
                long j44 = j37 + i18;
                long i24 = Q.i(i18, 39, j44);
                int i25 = i10;
                long j45 = j42 + i21;
                long i26 = Q.i(i21, 44, j45);
                long j46 = j43 + i24;
                long i27 = Q.i(i24, 9, j46);
                long j47 = j44 + i23;
                long i28 = Q.i(i23, 54, j47);
                long j48 = j41 + i22;
                long i29 = Q.i(i22, 56, j48);
                long j49 = j46 + jArr5[i11];
                int i30 = i11 + 1;
                long j50 = i26 + jArr5[i30];
                int i31 = i11 + 2;
                long j51 = j47 + jArr5[i31];
                int i32 = i11 + 3;
                long j52 = i29 + jArr5[i32];
                int i33 = i11 + 4;
                long j53 = j48 + jArr5[i33];
                int i34 = i11 + 5;
                long j54 = i28 + jArr5[i34] + jArr6[i12];
                int i35 = i11 + 6;
                int i36 = i12 + 1;
                long j55 = j45 + jArr5[i35] + jArr6[i36];
                int i37 = i11 + 7;
                long j56 = i25;
                long j57 = i27 + jArr5[i37] + j56;
                long j58 = j49 + j50;
                long i38 = Q.i(j50, 39, j58);
                long j59 = j51 + j52;
                long i39 = Q.i(j52, 30, j59);
                long j60 = j53 + j54;
                long i40 = Q.i(j54, 34, j60);
                long j61 = j55 + j57;
                long i41 = Q.i(j57, 24, j61);
                long j62 = j59 + i38;
                long i42 = Q.i(i38, 13, j62);
                long j63 = j60 + i41;
                long i43 = Q.i(i41, 50, j63);
                long j64 = j61 + i40;
                long i44 = Q.i(i40, 10, j64);
                long j65 = j58 + i39;
                long i45 = Q.i(i39, 17, j65);
                long j66 = j63 + i42;
                long i46 = Q.i(i42, 25, j66);
                long j67 = j64 + i45;
                long i47 = Q.i(i45, 29, j67);
                long j68 = j65 + i44;
                long i48 = Q.i(i44, 39, j68);
                long j69 = j62 + i43;
                long i49 = Q.i(i43, 43, j69);
                long j70 = j67 + i46;
                long i50 = Q.i(i46, 8, j70);
                long j71 = j68 + i49;
                long i51 = Q.i(i49, 35, j71);
                long j72 = j69 + i48;
                long i52 = Q.i(i48, 56, j72);
                long j73 = j66 + i47;
                long i53 = Q.i(i47, 22, j73);
                long j74 = j71 + jArr5[i30];
                long j75 = i50 + jArr5[i31];
                long j76 = j72 + jArr5[i32];
                long j77 = i53 + jArr5[i33];
                long j78 = j73 + jArr5[i34];
                long j79 = i52 + jArr5[i35] + jArr6[i36];
                j28 = j70 + jArr5[i37] + jArr6[i12 + 2];
                j29 = j76;
                j25 = j74;
                j31 = j78;
                jArr4 = jArr6;
                iArr = iArr3;
                j19 = j75;
                j30 = j79;
                j27 = jArr5[i11 + 8] + j56 + 1 + i51;
                i10 = i25 + 2;
                iArr2 = iArr4;
                j26 = j77;
                jArr3 = jArr5;
            }
            jArr2[0] = j25;
            jArr2[1] = j19;
            jArr2[2] = j29;
            jArr2[3] = j26;
            jArr2[4] = j31;
            jArr2[5] = j30;
            jArr2[6] = j28;
            jArr2[7] = j27;
        }
    }

    public static abstract class d {
        protected final long[] kw;

        /* renamed from: t, reason: collision with root package name */
        protected final long[] f62521t;

        public d(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f62521t = jArr2;
        }

        public abstract void a(long[] jArr, long[] jArr2);

        public abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i10 >= iArr2.length) {
                return;
            }
            MOD17[i10] = i10 % 17;
            iArr2[i10] = i10 % 9;
            MOD5[i10] = i10 % 5;
            MOD3[i10] = i10 % 3;
            i10++;
        }
    }

    public Q(int i10) {
        long[] jArr = new long[5];
        this.f62520t = jArr;
        int i11 = i10 / 8;
        this.f62516a = i11;
        int i12 = i11 / 8;
        this.f62517b = i12;
        this.currentBlock = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.kw = jArr2;
        if (i10 == 256) {
            this.f62518c = new b(jArr2, jArr);
        } else if (i10 == 512) {
            this.f62518c = new c(jArr2, jArr);
        } else {
            if (i10 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            this.f62518c = new a(jArr2, jArr);
        }
    }

    public static long f(byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static long i(long j10, int i10, long j11) {
        return ((j10 >>> (-i10)) | (j10 << i10)) ^ j11;
    }

    public static void l(long j10, byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
    }

    public static long m(long j10, int i10, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i10)) | (j12 >>> i10);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        long[] jArr;
        if (!(jVar instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + jVar.getClass().getName());
        }
        byte[] a10 = ((org.spongycastle.crypto.params.w) jVar).a();
        if (a10 == null) {
            jArr = null;
        } else {
            if (a10.length != this.f62516a) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f62516a + " bytes)");
            }
            int i10 = this.f62517b;
            jArr = new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = f(a10, i11 * 8);
            }
        }
        g(z10, jArr, null);
    }

    public void g(boolean z10, long[] jArr, long[] jArr2) {
        this.f62519d = z10;
        if (jArr != null) {
            j(jArr);
        }
        if (jArr2 != null) {
            k(jArr2);
        }
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "Threefish-" + (this.f62516a * 8);
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f62516a;
    }

    public int h(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.kw;
        int i10 = this.f62517b;
        if (jArr3[i10] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i10) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        if (jArr2.length != i10) {
            throw new org.spongycastle.crypto.l("Output buffer too short");
        }
        if (this.f62519d) {
            this.f62518c.b(jArr, jArr2);
        } else {
            this.f62518c.a(jArr, jArr2);
        }
        return this.f62517b;
    }

    public final void j(long[] jArr) {
        if (jArr.length != this.f62517b) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f62517b + " words)");
        }
        long j10 = 2004413935125273122L;
        int i10 = 0;
        while (true) {
            int i11 = this.f62517b;
            if (i10 >= i11) {
                long[] jArr2 = this.kw;
                jArr2[i11] = j10;
                System.arraycopy(jArr2, 0, jArr2, i11 + 1, i11);
                return;
            } else {
                long[] jArr3 = this.kw;
                long j11 = jArr[i10];
                jArr3[i10] = j11;
                j10 ^= j11;
                i10++;
            }
        }
    }

    public final void k(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f62520t;
        long j10 = jArr[0];
        jArr2[0] = j10;
        long j11 = jArr[1];
        jArr2[1] = j11;
        jArr2[2] = j10 ^ j11;
        jArr2[3] = j10;
        jArr2[4] = j11;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f62516a;
        if (i11 + i12 > bArr2.length) {
            throw new org.spongycastle.crypto.l("Output buffer too short");
        }
        if (i12 + i10 > bArr.length) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f62516a; i14 += 8) {
            this.currentBlock[i14 >> 3] = f(bArr, i10 + i14);
        }
        long[] jArr = this.currentBlock;
        h(jArr, jArr);
        while (true) {
            int i15 = this.f62516a;
            if (i13 >= i15) {
                return i15;
            }
            l(this.currentBlock[i13 >> 3], bArr2, i11 + i13);
            i13 += 8;
        }
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}
