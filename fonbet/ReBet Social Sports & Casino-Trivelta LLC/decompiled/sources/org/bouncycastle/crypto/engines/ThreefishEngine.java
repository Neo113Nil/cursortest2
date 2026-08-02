package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;

/* loaded from: classes5.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;
    private long[] kw;

    /* renamed from: t, reason: collision with root package name */
    private long[] f61655t;

    public static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long xorRotr = ThreefishEngine.xorRotr(j25 - ((jArr5[i13 + 16] + j41) + 1), i11, j26);
                long j42 = j26 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j37, 48, j28);
                long j43 = j28 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j39, 35, j32);
                long j44 = j32 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j35, 52, j30);
                long j45 = j30 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(j27, 23, j40);
                long j46 = j40 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(j31, 31, j34);
                long j47 = j34 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(j29, 37, j36);
                long j48 = j36 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(j33, 20, j38);
                long j49 = j38 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8, 31, j42);
                long j50 = j42 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr6, 44, j43);
                long j51 = j43 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 47, j45);
                long j52 = j45 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr5, 46, j44);
                long j53 = j44 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr, 19, j49);
                long j54 = j49 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr3, 42, j46);
                long j55 = j46 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr2, 44, j47);
                long j56 = j47 - xorRotr15;
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr4, 25, j48);
                long j57 = j48 - xorRotr16;
                long xorRotr17 = ThreefishEngine.xorRotr(xorRotr16, 16, j50);
                long j58 = j50 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(xorRotr14, 34, j51);
                long j59 = j51 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15, 56, j53);
                long j60 = j53 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(xorRotr13, 51, j52);
                long j61 = j52 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr9, 4, j57);
                long j62 = j57 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr11, 53, j54);
                long j63 = j54 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr10, 42, j55);
                long j64 = j55 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr12, 41, j56);
                long j65 = j56 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr24, 41, j58);
                long j66 = j58 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr22, 9, j59);
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 37, j61);
                long j67 = j61 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr21, 31, j60);
                long j68 = j60 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr17, 12, j65);
                long j69 = j65 - xorRotr29;
                long xorRotr30 = ThreefishEngine.xorRotr(xorRotr19, 47, j62);
                long j70 = j62 - xorRotr30;
                long xorRotr31 = ThreefishEngine.xorRotr(xorRotr18, 44, j63);
                long j71 = j63 - xorRotr31;
                long xorRotr32 = ThreefishEngine.xorRotr(xorRotr20, 30, j64);
                long j72 = j64 - xorRotr32;
                long j73 = j66 - jArr5[i13];
                long j74 = xorRotr25 - jArr5[i15];
                long j75 = (j59 - xorRotr26) - jArr5[i16];
                long j76 = xorRotr26 - jArr5[i17];
                long j77 = j67 - jArr5[i18];
                long j78 = xorRotr27 - jArr5[i19];
                long j79 = j68 - jArr5[i21];
                long j80 = xorRotr28 - jArr5[i22];
                long j81 = j69 - jArr5[i23];
                long j82 = xorRotr29 - jArr5[i24];
                long j83 = j70 - jArr5[i25];
                long j84 = xorRotr30 - jArr5[i26];
                long j85 = j71 - jArr5[i27];
                long j86 = xorRotr31 - (jArr5[i28] + jArr6[i14]);
                long j87 = j72 - (jArr5[i29] + jArr6[i30]);
                long xorRotr33 = ThreefishEngine.xorRotr(xorRotr32 - (jArr5[i31] + j41), 5, j73);
                long j88 = j73 - xorRotr33;
                long xorRotr34 = ThreefishEngine.xorRotr(j84, 20, j75);
                long j89 = j75 - xorRotr34;
                long xorRotr35 = ThreefishEngine.xorRotr(j86, 48, j79);
                long j90 = j79 - xorRotr35;
                long xorRotr36 = ThreefishEngine.xorRotr(j82, 41, j77);
                long j91 = j77 - xorRotr36;
                long xorRotr37 = ThreefishEngine.xorRotr(j74, 47, j87);
                long j92 = j87 - xorRotr37;
                long xorRotr38 = ThreefishEngine.xorRotr(j78, 28, j81);
                long j93 = j81 - xorRotr38;
                long xorRotr39 = ThreefishEngine.xorRotr(j76, 16, j83);
                long j94 = j83 - xorRotr39;
                long xorRotr40 = ThreefishEngine.xorRotr(j80, 25, j85);
                long j95 = j85 - xorRotr40;
                long xorRotr41 = ThreefishEngine.xorRotr(xorRotr40, 33, j88);
                long j96 = j88 - xorRotr41;
                long xorRotr42 = ThreefishEngine.xorRotr(xorRotr38, 4, j89);
                long j97 = j89 - xorRotr42;
                long xorRotr43 = ThreefishEngine.xorRotr(xorRotr39, 51, j91);
                long j98 = j91 - xorRotr43;
                long xorRotr44 = ThreefishEngine.xorRotr(xorRotr37, 13, j90);
                long j99 = j90 - xorRotr44;
                long xorRotr45 = ThreefishEngine.xorRotr(xorRotr33, 34, j95);
                long j100 = j95 - xorRotr45;
                long xorRotr46 = ThreefishEngine.xorRotr(xorRotr35, 41, j92);
                long j101 = j92 - xorRotr46;
                long xorRotr47 = ThreefishEngine.xorRotr(xorRotr34, 59, j93);
                long j102 = j93 - xorRotr47;
                long xorRotr48 = ThreefishEngine.xorRotr(xorRotr36, 17, j94);
                long j103 = j94 - xorRotr48;
                long xorRotr49 = ThreefishEngine.xorRotr(xorRotr48, 38, j96);
                long j104 = j96 - xorRotr49;
                long xorRotr50 = ThreefishEngine.xorRotr(xorRotr46, 19, j97);
                long j105 = j97 - xorRotr50;
                long xorRotr51 = ThreefishEngine.xorRotr(xorRotr47, 10, j99);
                long j106 = j99 - xorRotr51;
                long xorRotr52 = ThreefishEngine.xorRotr(xorRotr45, 55, j98);
                long j107 = j98 - xorRotr52;
                long xorRotr53 = ThreefishEngine.xorRotr(xorRotr41, 49, j103);
                long j108 = j103 - xorRotr53;
                long xorRotr54 = ThreefishEngine.xorRotr(xorRotr43, 18, j100);
                long j109 = j100 - xorRotr54;
                long xorRotr55 = ThreefishEngine.xorRotr(xorRotr42, 23, j101);
                long j110 = j101 - xorRotr55;
                long xorRotr56 = ThreefishEngine.xorRotr(xorRotr44, 52, j102);
                long j111 = j102 - xorRotr56;
                long xorRotr57 = ThreefishEngine.xorRotr(xorRotr56, 24, j104);
                long j112 = j104 - xorRotr57;
                long xorRotr58 = ThreefishEngine.xorRotr(xorRotr54, 13, j105);
                j12 = j105 - xorRotr58;
                long xorRotr59 = ThreefishEngine.xorRotr(xorRotr55, 8, j107);
                long j113 = j107 - xorRotr59;
                long xorRotr60 = ThreefishEngine.xorRotr(xorRotr53, 47, j106);
                long j114 = j106 - xorRotr60;
                long xorRotr61 = ThreefishEngine.xorRotr(xorRotr49, 8, j111);
                long j115 = j111 - xorRotr61;
                long xorRotr62 = ThreefishEngine.xorRotr(xorRotr51, 17, j108);
                long j116 = j108 - xorRotr62;
                long xorRotr63 = ThreefishEngine.xorRotr(xorRotr50, 22, j109);
                j22 = j109 - xorRotr63;
                j25 = ThreefishEngine.xorRotr(xorRotr52, 37, j110);
                j24 = j110 - j25;
                j21 = xorRotr62;
                j20 = j116;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j16 = j114;
                j15 = xorRotr59;
                j10 = j112;
                i11 = 9;
                j13 = xorRotr58;
                j23 = xorRotr63;
                j17 = xorRotr60;
                i12 -= 2;
                j19 = xorRotr61;
                j14 = j113;
                j11 = xorRotr57;
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

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long rotlXor = ThreefishEngine.rotlXor(j27, 24, j51);
                long j52 = j28 + j50;
                long rotlXor2 = ThreefishEngine.rotlXor(j50, i12, j52);
                int i16 = i13;
                long j53 = j41;
                long j54 = j47 + j53;
                long rotlXor3 = ThreefishEngine.rotlXor(j53, 8, j54);
                long[] jArr5 = jArr3;
                long j55 = j42;
                long j56 = j32 + j55;
                long[] jArr6 = jArr4;
                long rotlXor4 = ThreefishEngine.rotlXor(j55, 47, j56);
                long j57 = j43;
                long j58 = j34 + j57;
                int[] iArr3 = iArr2;
                long rotlXor5 = ThreefishEngine.rotlXor(j57, 8, j58);
                long j59 = j44;
                long j60 = j36 + j59;
                long rotlXor6 = ThreefishEngine.rotlXor(j59, 17, j60);
                long j61 = j45;
                long j62 = j38 + j61;
                long rotlXor7 = ThreefishEngine.rotlXor(j61, 22, j62);
                long j63 = j46;
                long j64 = j40 + j63;
                long rotlXor8 = ThreefishEngine.rotlXor(j63, 37, j64);
                long j65 = j51 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 38, j65);
                long j66 = j52 + rotlXor7;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor7, 19, j66);
                long j67 = j56 + rotlXor6;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor6, 10, j67);
                long j68 = j54 + rotlXor8;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor8, 55, j68);
                long j69 = j60 + rotlXor4;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor4, 49, j69);
                long j70 = j62 + rotlXor2;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor2, 18, j70);
                long j71 = j64 + rotlXor3;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor3, 23, j71);
                long j72 = j58 + rotlXor;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor, 52, j72);
                long j73 = j65 + rotlXor13;
                long rotlXor17 = ThreefishEngine.rotlXor(rotlXor13, 33, j73);
                long j74 = j66 + rotlXor15;
                long rotlXor18 = ThreefishEngine.rotlXor(rotlXor15, 4, j74);
                long j75 = j68 + rotlXor14;
                long rotlXor19 = ThreefishEngine.rotlXor(rotlXor14, 51, j75);
                long j76 = j67 + rotlXor16;
                long rotlXor20 = ThreefishEngine.rotlXor(rotlXor16, 13, j76);
                long j77 = j70 + rotlXor12;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor12, 34, j77);
                long j78 = j71 + rotlXor10;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor10, 41, j78);
                long j79 = j72 + rotlXor11;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor11, 59, j79);
                long j80 = j69 + rotlXor9;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor9, 17, j80);
                long j81 = j73 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 5, j81);
                long j82 = j74 + rotlXor23;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor23, 20, j82);
                long j83 = j76 + rotlXor22;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor22, 48, j83);
                long j84 = j75 + rotlXor24;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor24, 41, j84);
                long j85 = j78 + rotlXor20;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor20, 47, j85);
                long j86 = j79 + rotlXor18;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor18, 28, j86);
                long j87 = j80 + rotlXor19;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor19, 16, j87);
                long j88 = j77 + rotlXor17;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor17, 25, j88);
                long j89 = j81 + jArr5[i14];
                int i17 = i14 + 1;
                long j90 = rotlXor29 + jArr5[i17];
                int i18 = i14 + 2;
                long j91 = j82 + jArr5[i18];
                int i19 = i14 + 3;
                long j92 = rotlXor31 + jArr5[i19];
                int i20 = i14 + 4;
                long j93 = j84 + jArr5[i20];
                int i21 = i14 + 5;
                long j94 = rotlXor30 + jArr5[i21];
                int i22 = i14 + 6;
                long j95 = j83 + jArr5[i22];
                int i23 = i14 + 7;
                long j96 = rotlXor32 + jArr5[i23];
                int i24 = i14 + 8;
                long j97 = j86 + jArr5[i24];
                int i25 = i14 + 9;
                long j98 = rotlXor28 + jArr5[i25];
                int i26 = i14 + 10;
                long j99 = j87 + jArr5[i26];
                int i27 = i14 + 11;
                long j100 = rotlXor26 + jArr5[i27];
                int i28 = i14 + 12;
                long j101 = j88 + jArr5[i28];
                int i29 = i14 + 13;
                long j102 = rotlXor27 + jArr5[i29] + jArr6[i15];
                int i30 = i14 + 14;
                int i31 = i15 + 1;
                long j103 = j85 + jArr5[i30] + jArr6[i31];
                int i32 = i14 + 15;
                long j104 = i16;
                long j105 = rotlXor25 + jArr5[i32] + j104;
                long j106 = j89 + j90;
                long rotlXor33 = ThreefishEngine.rotlXor(j90, 41, j106);
                long j107 = j91 + j92;
                long rotlXor34 = ThreefishEngine.rotlXor(j92, i10, j107);
                long j108 = j93 + j94;
                long rotlXor35 = ThreefishEngine.rotlXor(j94, 37, j108);
                long j109 = j95 + j96;
                long rotlXor36 = ThreefishEngine.rotlXor(j96, 31, j109);
                long j110 = j97 + j98;
                long rotlXor37 = ThreefishEngine.rotlXor(j98, i11, j110);
                long j111 = j99 + j100;
                long rotlXor38 = ThreefishEngine.rotlXor(j100, 47, j111);
                long j112 = j101 + j102;
                long rotlXor39 = ThreefishEngine.rotlXor(j102, 44, j112);
                long j113 = j103 + j105;
                long rotlXor40 = ThreefishEngine.rotlXor(j105, 30, j113);
                long j114 = j106 + rotlXor37;
                long rotlXor41 = ThreefishEngine.rotlXor(rotlXor37, 16, j114);
                long j115 = j107 + rotlXor39;
                long rotlXor42 = ThreefishEngine.rotlXor(rotlXor39, 34, j115);
                long j116 = j109 + rotlXor38;
                long rotlXor43 = ThreefishEngine.rotlXor(rotlXor38, 56, j116);
                long j117 = j108 + rotlXor40;
                long rotlXor44 = ThreefishEngine.rotlXor(rotlXor40, 51, j117);
                long j118 = j111 + rotlXor36;
                long rotlXor45 = ThreefishEngine.rotlXor(rotlXor36, 4, j118);
                long j119 = j112 + rotlXor34;
                long rotlXor46 = ThreefishEngine.rotlXor(rotlXor34, 53, j119);
                long j120 = j113 + rotlXor35;
                long rotlXor47 = ThreefishEngine.rotlXor(rotlXor35, 42, j120);
                long j121 = j110 + rotlXor33;
                long rotlXor48 = ThreefishEngine.rotlXor(rotlXor33, 41, j121);
                long j122 = j114 + rotlXor45;
                long rotlXor49 = ThreefishEngine.rotlXor(rotlXor45, 31, j122);
                long j123 = j115 + rotlXor47;
                long rotlXor50 = ThreefishEngine.rotlXor(rotlXor47, 44, j123);
                long j124 = j117 + rotlXor46;
                long rotlXor51 = ThreefishEngine.rotlXor(rotlXor46, 47, j124);
                long j125 = j116 + rotlXor48;
                long rotlXor52 = ThreefishEngine.rotlXor(rotlXor48, 46, j125);
                long j126 = j119 + rotlXor44;
                long rotlXor53 = ThreefishEngine.rotlXor(rotlXor44, 19, j126);
                long j127 = j120 + rotlXor42;
                long rotlXor54 = ThreefishEngine.rotlXor(rotlXor42, 42, j127);
                long j128 = j121 + rotlXor43;
                long rotlXor55 = ThreefishEngine.rotlXor(rotlXor43, 44, j128);
                long j129 = j118 + rotlXor41;
                long rotlXor56 = ThreefishEngine.rotlXor(rotlXor41, 25, j129);
                long j130 = j122 + rotlXor53;
                long rotlXor57 = ThreefishEngine.rotlXor(rotlXor53, 9, j130);
                long j131 = j123 + rotlXor55;
                long rotlXor58 = ThreefishEngine.rotlXor(rotlXor55, 48, j131);
                long j132 = j125 + rotlXor54;
                long rotlXor59 = ThreefishEngine.rotlXor(rotlXor54, 35, j132);
                long j133 = j124 + rotlXor56;
                long rotlXor60 = ThreefishEngine.rotlXor(rotlXor56, 52, j133);
                long j134 = j127 + rotlXor52;
                long rotlXor61 = ThreefishEngine.rotlXor(rotlXor52, 23, j134);
                long j135 = j128 + rotlXor50;
                long rotlXor62 = ThreefishEngine.rotlXor(rotlXor50, 31, j135);
                long j136 = j129 + rotlXor51;
                long rotlXor63 = ThreefishEngine.rotlXor(rotlXor51, 37, j136);
                long j137 = j126 + rotlXor49;
                long rotlXor64 = ThreefishEngine.rotlXor(rotlXor49, 20, j137);
                long j138 = jArr5[i17] + j130;
                long j139 = rotlXor61 + jArr5[i18];
                long j140 = j131 + jArr5[i19];
                long j141 = rotlXor63 + jArr5[i20];
                long j142 = j133 + jArr5[i21];
                long j143 = rotlXor62 + jArr5[i22];
                long j144 = j132 + jArr5[i23];
                long j145 = rotlXor64 + jArr5[i24];
                long j146 = j135 + jArr5[i25];
                j43 = rotlXor60 + jArr5[i26];
                long j147 = j136 + jArr5[i27];
                long j148 = rotlXor58 + jArr5[i28];
                j38 = j137 + jArr5[i29];
                j45 = rotlXor59 + jArr5[i30] + jArr6[i31];
                long j149 = j134 + jArr5[i32] + jArr6[i15 + 2];
                j46 = rotlXor57 + jArr5[i14 + 16] + j104 + 1;
                j32 = j144;
                j34 = j146;
                j47 = j142;
                j27 = j139;
                j28 = j140;
                i13 = i16 + 2;
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

    public static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long xorRotr = ThreefishEngine.xorRotr(j13 - ((jArr3[i12 + 4] + j17) + 1), 32, j14);
                long j18 = j14 - xorRotr;
                long[] jArr5 = jArr3;
                long xorRotr2 = ThreefishEngine.xorRotr(j15, 32, j16);
                long j19 = j16 - xorRotr2;
                long[] jArr6 = jArr4;
                long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j18);
                long j20 = j18 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j19);
                long j21 = j19 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j20);
                long j22 = j20 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j21);
                long j23 = j21 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j22);
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j23);
                long j24 = (j22 - xorRotr7) - jArr5[i12];
                long j25 = xorRotr7 - (jArr5[i14] + jArr6[i13]);
                long j26 = (j23 - xorRotr8) - (jArr5[i15] + jArr6[i16]);
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr5[i17] + j17), 5, j24);
                long j27 = j24 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(j25, 37, j26);
                long j28 = j26 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j27);
                long j29 = j27 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j28);
                long j30 = j28 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j29);
                long j31 = j29 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j30);
                long j32 = j30 - xorRotr14;
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr14, 14, j31);
                j13 = ThreefishEngine.xorRotr(xorRotr13, 16, j32);
                j12 = j32 - j13;
                i11 -= 2;
                j11 = xorRotr15;
                i10 = i18;
                jArr3 = jArr5;
                c10 = c11;
                j10 = j31 - xorRotr15;
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

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long rotlXor = ThreefishEngine.rotlXor(j15, 14, j18);
                long j19 = j16 + j17;
                long rotlXor2 = ThreefishEngine.rotlXor(j17, 16, j19);
                long[] jArr5 = jArr3;
                long j20 = j18 + rotlXor2;
                long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j20);
                long j21 = j19 + rotlXor;
                long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j21);
                long j22 = j20 + rotlXor4;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j22);
                long j23 = j21 + rotlXor3;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j23);
                long j24 = j22 + rotlXor6;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j24);
                long j25 = j23 + rotlXor5;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j25);
                long j26 = j24 + jArr5[i11];
                int i13 = i11 + 1;
                long j27 = rotlXor8 + jArr5[i13] + jArr4[i12];
                int i14 = i11 + 2;
                int i15 = i12 + 1;
                long j28 = j25 + jArr5[i14] + jArr4[i15];
                int i16 = i11 + 3;
                long j29 = i10;
                long j30 = rotlXor7 + jArr5[i16] + j29;
                long j31 = j26 + j27;
                long rotlXor9 = ThreefishEngine.rotlXor(j27, 25, j31);
                long j32 = j28 + j30;
                long rotlXor10 = ThreefishEngine.rotlXor(j30, 33, j32);
                long j33 = j31 + rotlXor10;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j33);
                long j34 = j32 + rotlXor9;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j34);
                long j35 = j33 + rotlXor12;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j35);
                long j36 = j34 + rotlXor11;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j36);
                long j37 = j35 + rotlXor14;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j37);
                long j38 = j36 + rotlXor13;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j38);
                long j39 = j37 + jArr5[i13];
                long j40 = rotlXor16 + jArr5[i14] + jArr4[i15];
                j16 = j38 + jArr5[i16] + jArr4[i12 + 2];
                j17 = rotlXor15 + jArr5[i11 + 4] + j29 + 1;
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

    public static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        public Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long xorRotr = ThreefishEngine.xorRotr(j19, 8, j24);
                long j27 = j24 - xorRotr;
                long xorRotr2 = ThreefishEngine.xorRotr(j26, 35, j18);
                long j28 = j18 - xorRotr2;
                long xorRotr3 = ThreefishEngine.xorRotr(j23, 56, j20);
                long j29 = j20 - xorRotr3;
                long xorRotr4 = ThreefishEngine.xorRotr(j21, 22, j22);
                long j30 = j22 - xorRotr4;
                long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j30);
                long j31 = j30 - xorRotr5;
                long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j27);
                long j32 = j27 - xorRotr6;
                long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j28);
                long j33 = j28 - xorRotr7;
                long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j29);
                long j34 = j29 - xorRotr8;
                long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j34);
                long j35 = j34 - xorRotr9;
                long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j31);
                long j36 = j31 - xorRotr10;
                long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j32);
                long j37 = j32 - xorRotr11;
                long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j33);
                long j38 = j33 - xorRotr12;
                long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j38);
                long j39 = j38 - xorRotr13;
                long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j35);
                long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j36);
                long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j37);
                long j40 = j37 - xorRotr16;
                long j41 = j39 - jArr5[i12];
                long j42 = xorRotr13 - jArr5[i14];
                long j43 = (j35 - xorRotr14) - jArr5[i15];
                long j44 = xorRotr14 - jArr5[i16];
                long j45 = (j36 - xorRotr15) - jArr5[i17];
                long j46 = xorRotr15 - (jArr5[i18] + jArr6[i13]);
                long j47 = j40 - (jArr5[i19] + jArr6[i20]);
                long j48 = xorRotr16 - (jArr5[i22] + j25);
                long xorRotr17 = ThreefishEngine.xorRotr(j42, 44, j47);
                long j49 = j47 - xorRotr17;
                long xorRotr18 = ThreefishEngine.xorRotr(j48, 9, j41);
                long j50 = j41 - xorRotr18;
                long xorRotr19 = ThreefishEngine.xorRotr(j46, 54, j43);
                long j51 = j43 - xorRotr19;
                long xorRotr20 = ThreefishEngine.xorRotr(j44, 56, j45);
                long j52 = j45 - xorRotr20;
                long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j52);
                long j53 = j52 - xorRotr21;
                long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, 49, j49);
                long j54 = j49 - xorRotr22;
                long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j50);
                long j55 = j50 - xorRotr23;
                long xorRotr24 = ThreefishEngine.xorRotr(xorRotr18, 39, j51);
                long j56 = j51 - xorRotr24;
                long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j56);
                long j57 = j56 - xorRotr25;
                long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j53);
                long j58 = j53 - xorRotr26;
                long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j54);
                long j59 = j54 - xorRotr27;
                long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j55);
                long j60 = j55 - xorRotr28;
                long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j60);
                j13 = ThreefishEngine.xorRotr(xorRotr28, 36, j57);
                j15 = ThreefishEngine.xorRotr(xorRotr27, 19, j58);
                long j61 = j58 - j15;
                j17 = ThreefishEngine.xorRotr(xorRotr26, 37, j59);
                j16 = j59 - j17;
                j12 = j57 - j13;
                j11 = xorRotr29;
                i11 -= 2;
                j10 = j60 - xorRotr29;
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

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.kw;
            long[] jArr4 = this.f61656t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
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
                long rotlXor = ThreefishEngine.rotlXor(j19, 46, j33);
                long[] jArr5 = jArr3;
                long j34 = j29 + j32;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long rotlXor2 = ThreefishEngine.rotlXor(j32, 36, j34);
                long j35 = j31 + j30;
                long rotlXor3 = ThreefishEngine.rotlXor(j30, 19, j35);
                long j36 = j28 + j27;
                long rotlXor4 = ThreefishEngine.rotlXor(j27, 37, j36);
                long j37 = j34 + rotlXor;
                long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j37);
                long j38 = j35 + rotlXor4;
                long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j38);
                long j39 = j36 + rotlXor3;
                long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j39);
                long j40 = j33 + rotlXor2;
                long rotlXor8 = ThreefishEngine.rotlXor(rotlXor2, 42, j40);
                long j41 = j38 + rotlXor5;
                long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j41);
                long j42 = j39 + rotlXor8;
                long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, 49, j42);
                long j43 = j40 + rotlXor7;
                long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j43);
                long j44 = j37 + rotlXor6;
                long rotlXor12 = ThreefishEngine.rotlXor(rotlXor6, 39, j44);
                int i13 = i10;
                long j45 = j42 + rotlXor9;
                long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j45);
                long j46 = j43 + rotlXor12;
                long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j46);
                long j47 = j44 + rotlXor11;
                long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j47);
                long j48 = j41 + rotlXor10;
                long rotlXor16 = ThreefishEngine.rotlXor(rotlXor10, 56, j48);
                long j49 = j46 + jArr5[i11];
                int i14 = i11 + 1;
                long j50 = rotlXor13 + jArr5[i14];
                int i15 = i11 + 2;
                long j51 = j47 + jArr5[i15];
                int i16 = i11 + 3;
                long j52 = rotlXor16 + jArr5[i16];
                int i17 = i11 + 4;
                long j53 = j48 + jArr5[i17];
                int i18 = i11 + 5;
                long j54 = rotlXor15 + jArr5[i18] + jArr6[i12];
                int i19 = i11 + 6;
                int i20 = i12 + 1;
                long j55 = j45 + jArr5[i19] + jArr6[i20];
                int i21 = i11 + 7;
                long j56 = i13;
                long j57 = rotlXor14 + jArr5[i21] + j56;
                long j58 = j49 + j50;
                long rotlXor17 = ThreefishEngine.rotlXor(j50, 39, j58);
                long j59 = j51 + j52;
                long rotlXor18 = ThreefishEngine.rotlXor(j52, 30, j59);
                long j60 = j53 + j54;
                long rotlXor19 = ThreefishEngine.rotlXor(j54, 34, j60);
                long j61 = j55 + j57;
                long rotlXor20 = ThreefishEngine.rotlXor(j57, 24, j61);
                long j62 = j59 + rotlXor17;
                long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j62);
                long j63 = j60 + rotlXor20;
                long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j63);
                long j64 = j61 + rotlXor19;
                long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j64);
                long j65 = j58 + rotlXor18;
                long rotlXor24 = ThreefishEngine.rotlXor(rotlXor18, 17, j65);
                long j66 = j63 + rotlXor21;
                long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j66);
                long j67 = j64 + rotlXor24;
                long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j67);
                long j68 = j65 + rotlXor23;
                long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j68);
                long j69 = j62 + rotlXor22;
                long rotlXor28 = ThreefishEngine.rotlXor(rotlXor22, 43, j69);
                long j70 = j67 + rotlXor25;
                long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j70);
                long j71 = j68 + rotlXor28;
                long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j71);
                long j72 = j69 + rotlXor27;
                long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j72);
                long j73 = j66 + rotlXor26;
                long rotlXor32 = ThreefishEngine.rotlXor(rotlXor26, 22, j73);
                long j74 = j71 + jArr5[i14];
                long j75 = rotlXor29 + jArr5[i15];
                long j76 = j72 + jArr5[i16];
                long j77 = rotlXor32 + jArr5[i17];
                long j78 = j73 + jArr5[i18];
                long j79 = rotlXor31 + jArr5[i19] + jArr6[i20];
                j28 = j70 + jArr5[i21] + jArr6[i12 + 2];
                j29 = j76;
                j25 = j74;
                j31 = j78;
                jArr4 = jArr6;
                iArr = iArr3;
                j19 = j75;
                j30 = j79;
                j27 = jArr5[i11 + 8] + j56 + 1 + rotlXor30;
                i10 = i13 + 2;
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

    public static abstract class ThreefishCipher {
        protected final long[] kw;

        /* renamed from: t, reason: collision with root package name */
        protected final long[] f61656t;

        public ThreefishCipher(long[] jArr, long[] jArr2) {
            this.kw = jArr;
            this.f61656t = jArr2;
        }

        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        public abstract void encryptBlock(long[] jArr, long[] jArr2);
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

    public ThreefishEngine(int i10) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f61655t = jArr;
        int i11 = i10 / 8;
        this.blocksizeBytes = i11;
        int i12 = i11 / 8;
        this.blocksizeWords = i12;
        this.currentBlock = new long[i12];
        long[] jArr2 = new long[(i12 * 2) + 1];
        this.kw = jArr2;
        if (i10 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i10 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i10 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i10) {
        if (i10 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static long rotlXor(long j10, int i10, long j11) {
        return ((j10 >>> (-i10)) | (j10 << i10)) ^ j11;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j10 = C_240;
        int i10 = 0;
        while (true) {
            int i11 = this.blocksizeWords;
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

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f61655t;
        long j10 = jArr[0];
        jArr2[0] = j10;
        long j11 = jArr[1];
        jArr2[1] = j11;
        jArr2[2] = j10 ^ j11;
        jArr2[3] = j10;
        jArr2[4] = j11;
    }

    public static void wordToBytes(long j10, byte[] bArr, int i10) {
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

    public static long xorRotr(long j10, int i10, long j11) {
        long j12 = j10 ^ j11;
        return (j12 << (-i10)) | (j12 >>> i10);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
            }
            int i10 = this.blocksizeWords;
            jArr = new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = bytesToWord(key, i11 * 8);
            }
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(bArr, 0), bytesToWord(bArr, 8)};
        }
        init(z10, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.blocksizeBytes;
        if (i10 + i12 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.blocksizeBytes; i14 += 8) {
            this.currentBlock[i14 >> 3] = bytesToWord(bArr, i10 + i14);
        }
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        while (true) {
            int i15 = this.blocksizeBytes;
            if (i13 >= i15) {
                return i15;
            }
            wordToBytes(this.currentBlock[i13 >> 3], bArr2, i11 + i13);
            i13 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void init(boolean z10, long[] jArr, long[] jArr2) {
        this.forEncryption = z10;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.kw;
        int i10 = this.blocksizeWords;
        if (jArr3[i10] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i10) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i10) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }
}
