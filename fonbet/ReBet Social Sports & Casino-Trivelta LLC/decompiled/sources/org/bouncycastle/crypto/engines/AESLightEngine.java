package org.bouncycastle.crypto.engines;

import com.plaid.internal.EnumC3631g;
import java.lang.reflect.Array;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class AESLightEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: m1, reason: collision with root package name */
    private static final int f61591m1 = -2139062144;

    /* renamed from: m2, reason: collision with root package name */
    private static final int f61592m2 = 2139062143;

    /* renamed from: m3, reason: collision with root package name */
    private static final int f61593m3 = 27;

    /* renamed from: m4, reason: collision with root package name */
    private static final int f61594m4 = -1061109568;

    /* renamed from: m5, reason: collision with root package name */
    private static final int f61595m5 = 1061109567;

    /* renamed from: C0, reason: collision with root package name */
    private int f61596C0;

    /* renamed from: C1, reason: collision with root package name */
    private int f61597C1;

    /* renamed from: C2, reason: collision with root package name */
    private int f61598C2;

    /* renamed from: C3, reason: collision with root package name */
    private int f61599C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f61589S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, ByteCompanionObject.MIN_VALUE, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, ByteCompanionObject.MAX_VALUE, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, Base64.padSymbol, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* renamed from: Si, reason: collision with root package name */
    private static final byte[] f61590Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, Base64.padSymbol, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, 63, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, ByteCompanionObject.MIN_VALUE, -20, 95, 96, 81, ByteCompanionObject.MAX_VALUE, -87, 25, -75, 74, 13, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 77, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 47, 94, 188, 99, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 125, 250, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE};

    private static int FFmulX(int i10) {
        return (((i10 & f61591m1) >>> 7) * 27) ^ ((f61592m2 & i10) << 1);
    }

    private static int FFmulX2(int i10) {
        int i11 = (f61595m5 & i10) << 2;
        int i12 = i10 & f61594m4;
        int i13 = i12 ^ (i12 >>> 1);
        return (i13 >>> 5) ^ (i11 ^ (i13 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i10 = this.f61596C0;
        int i11 = this.ROUNDS;
        int[] iArr2 = iArr[i11];
        int i12 = i10 ^ iArr2[0];
        int i13 = this.f61597C1 ^ iArr2[1];
        int i14 = this.f61598C2 ^ iArr2[2];
        int i15 = i11 - 1;
        int i16 = iArr2[3] ^ this.f61599C3;
        while (true) {
            byte[] bArr = f61590Si;
            int i17 = i12 & 255;
            if (i15 <= 1) {
                int inv_mcol = inv_mcol((((bArr[i17] & UByte.MAX_VALUE) ^ ((bArr[(i16 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i13 >> 24) & 255] << 24)) ^ iArr[i15][0];
                int inv_mcol2 = inv_mcol((((bArr[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i16 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i15][1];
                int inv_mcol3 = inv_mcol((((bArr[i14 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i16 >> 24) & 255] << 24)) ^ iArr[i15][2];
                int inv_mcol4 = inv_mcol((bArr[(i12 >> 24) & 255] << 24) ^ (((bArr[i16 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16))) ^ iArr[i15][3];
                int i18 = (((bArr[inv_mcol & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol4 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol3 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol2 >> 24) & 255] << 24);
                int[] iArr3 = iArr[0];
                this.f61596C0 = i18 ^ iArr3[0];
                this.f61597C1 = ((((bArr[inv_mcol2 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol4 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol3 >> 24) & 255] << 24)) ^ iArr3[1];
                this.f61598C2 = ((((bArr[inv_mcol3 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol2 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol4 >> 24) & 255] << 24)) ^ iArr3[2];
                this.f61599C3 = ((((bArr[inv_mcol4 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol3 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol2 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol >> 24) & 255] << 24)) ^ iArr3[3];
                return;
            }
            int inv_mcol5 = inv_mcol((((bArr[i17] & UByte.MAX_VALUE) ^ ((bArr[(i16 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i13 >> 24) & 255] << 24)) ^ iArr[i15][0];
            int inv_mcol6 = inv_mcol((((bArr[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i16 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i15][1];
            int inv_mcol7 = inv_mcol((((bArr[i14 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i16 >> 24) & 255] << 24)) ^ iArr[i15][2];
            int inv_mcol8 = inv_mcol((bArr[(i12 >> 24) & 255] << 24) ^ (((bArr[i16 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16)));
            int i19 = i15 - 1;
            int i20 = inv_mcol8 ^ iArr[i15][3];
            int inv_mcol9 = inv_mcol((((bArr[inv_mcol5 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i20 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol7 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol6 >> 24) & 255] << 24)) ^ iArr[i19][0];
            int inv_mcol10 = inv_mcol((((bArr[inv_mcol6 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol5 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i20 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol7 >> 24) & 255] << 24)) ^ iArr[i19][1];
            int inv_mcol11 = inv_mcol((((bArr[inv_mcol7 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol6 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol5 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i20 >> 24) & 255] << 24)) ^ iArr[i19][2];
            i15 -= 2;
            i16 = iArr[i19][3] ^ inv_mcol((((bArr[i20 & 255] & UByte.MAX_VALUE) ^ ((bArr[(inv_mcol7 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(inv_mcol6 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(inv_mcol5 >> 24) & 255] << 24));
            i12 = inv_mcol9;
            i13 = inv_mcol10;
            i14 = inv_mcol11;
        }
    }

    private void encryptBlock(int[][] iArr) {
        int i10 = this.f61596C0;
        int[] iArr2 = iArr[0];
        int i11 = i10 ^ iArr2[0];
        int i12 = this.f61597C1 ^ iArr2[1];
        int i13 = this.f61598C2 ^ iArr2[2];
        int i14 = iArr2[3] ^ this.f61599C3;
        int i15 = 1;
        while (i15 < this.ROUNDS - 1) {
            byte[] bArr = f61589S;
            int mcol = mcol((((bArr[i11 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i14 >> 24) & 255] << 24)) ^ iArr[i15][0];
            int mcol2 = mcol((((bArr[i12 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i11 >> 24) & 255] << 24)) ^ iArr[i15][1];
            int mcol3 = mcol((((bArr[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i12 >> 24) & 255] << 24)) ^ iArr[i15][2];
            int mcol4 = mcol(((((bArr[(i11 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr[i14 & 255] & UByte.MAX_VALUE)) ^ ((bArr[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i13 >> 24) & 255] << 24));
            int i16 = i15 + 1;
            int i17 = mcol4 ^ iArr[i15][3];
            int mcol5 = mcol((((bArr[mcol & 255] & UByte.MAX_VALUE) ^ ((bArr[(mcol2 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(mcol3 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(i17 >> 24) & 255] << 24)) ^ iArr[i16][0];
            int mcol6 = mcol((((bArr[mcol2 & 255] & UByte.MAX_VALUE) ^ ((bArr[(mcol3 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(i17 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(mcol >> 24) & 255] << 24)) ^ iArr[i16][1];
            int mcol7 = mcol((((bArr[mcol3 & 255] & UByte.MAX_VALUE) ^ ((bArr[(i17 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(mcol >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(mcol2 >> 24) & 255] << 24)) ^ iArr[i16][2];
            i15 += 2;
            i14 = iArr[i16][3] ^ mcol((((bArr[i17 & 255] & UByte.MAX_VALUE) ^ ((bArr[(mcol >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr[(mcol2 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr[(mcol3 >> 24) & 255] << 24));
            i11 = mcol5;
            i12 = mcol6;
            i13 = mcol7;
        }
        byte[] bArr2 = f61589S;
        int mcol8 = mcol((((bArr2[i11 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i12 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i13 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i14 >> 24) & 255] << 24)) ^ iArr[i15][0];
        int mcol9 = mcol((((bArr2[i12 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i13 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i14 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i11 >> 24) & 255] << 24)) ^ iArr[i15][1];
        int mcol10 = mcol((((bArr2[i13 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(i14 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(i11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i12 >> 24) & 255] << 24)) ^ iArr[i15][2];
        int mcol11 = mcol(((((bArr2[(i11 >> 8) & 255] & UByte.MAX_VALUE) << 8) ^ (bArr2[i14 & 255] & UByte.MAX_VALUE)) ^ ((bArr2[(i12 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(i13 >> 24) & 255] << 24)) ^ iArr[i15][3];
        int i18 = (((bArr2[mcol8 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(mcol9 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(mcol10 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(mcol11 >> 24) & 255] << 24);
        int[] iArr3 = iArr[i15 + 1];
        this.f61596C0 = iArr3[0] ^ i18;
        this.f61597C1 = ((((bArr2[mcol9 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(mcol10 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(mcol11 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(mcol8 >> 24) & 255] << 24)) ^ iArr3[1];
        this.f61598C2 = ((((bArr2[mcol10 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(mcol11 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(mcol8 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(mcol9 >> 24) & 255] << 24)) ^ iArr3[2];
        this.f61599C3 = ((((bArr2[mcol11 & 255] & UByte.MAX_VALUE) ^ ((bArr2[(mcol8 >> 8) & 255] & UByte.MAX_VALUE) << 8)) ^ ((bArr2[(mcol9 >> 16) & 255] & UByte.MAX_VALUE) << 16)) ^ (bArr2[(mcol10 >> 24) & 255] << 24)) ^ iArr3[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z10) {
        int i10;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i11 = length >>> 2;
        this.ROUNDS = i11 + 6;
        int i12 = 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11 + 7, 4);
        char c10 = 3;
        if (i11 == 4) {
            i10 = 1;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i13 = 1; i13 <= 10; i13++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i13 - 1];
                int[] iArr2 = iArr[i13];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i11 == 6) {
            i10 = 1;
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            int i14 = 1;
            int i15 = 1;
            while (true) {
                int[] iArr3 = iArr[i14];
                iArr3[0] = littleEndianToInt9;
                iArr3[1] = littleEndianToInt10;
                int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ i15);
                int[] iArr4 = iArr[i14];
                iArr4[2] = subWord;
                int i16 = littleEndianToInt6 ^ subWord;
                iArr4[3] = i16;
                int i17 = littleEndianToInt7 ^ i16;
                int[] iArr5 = iArr[i14 + 1];
                iArr5[0] = i17;
                int i18 = littleEndianToInt8 ^ i17;
                iArr5[1] = i18;
                int i19 = littleEndianToInt9 ^ i18;
                iArr5[2] = i19;
                int i20 = littleEndianToInt10 ^ i19;
                iArr5[3] = i20;
                int subWord2 = subWord(shift(i20, 8)) ^ (i15 << 1);
                i15 <<= 2;
                littleEndianToInt5 = subWord ^ subWord2;
                int[] iArr6 = iArr[i14 + 2];
                iArr6[0] = littleEndianToInt5;
                littleEndianToInt6 = i16 ^ littleEndianToInt5;
                iArr6[1] = littleEndianToInt6;
                littleEndianToInt7 = i17 ^ littleEndianToInt6;
                iArr6[2] = littleEndianToInt7;
                littleEndianToInt8 = i18 ^ littleEndianToInt7;
                iArr6[3] = littleEndianToInt8;
                i14 += 3;
                if (i14 >= 13) {
                    break;
                }
                littleEndianToInt9 = i19 ^ littleEndianToInt8;
                littleEndianToInt10 = i20 ^ littleEndianToInt9;
            }
        } else {
            if (i11 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i21 = 1;
            int i22 = 2;
            while (true) {
                int subWord3 = subWord(shift(littleEndianToInt18, 8)) ^ i21;
                i21 <<= i12;
                littleEndianToInt11 ^= subWord3;
                int[] iArr7 = iArr[i22];
                iArr7[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr7[i12] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr7[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr7[c10] = littleEndianToInt14;
                i10 = i12;
                int i23 = i22 + 1;
                char c11 = c10;
                if (i23 >= 15) {
                    break;
                }
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr8 = iArr[i23];
                iArr8[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr8[i10] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr8[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr8[c11] = littleEndianToInt18;
                i22 += 2;
                i12 = i10;
                c10 = c11;
            }
        }
        if (!z10) {
            for (int i24 = i10; i24 < this.ROUNDS; i24++) {
                for (int i25 = 0; i25 < 4; i25++) {
                    int[] iArr9 = iArr[i24];
                    iArr9[i25] = inv_mcol(iArr9[i25]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i10) {
        int shift = shift(i10, 8) ^ i10;
        int FFmulX = i10 ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private static int mcol(int i10) {
        int shift = shift(i10, 8);
        int i11 = i10 ^ shift;
        return FFmulX(i11) ^ (shift ^ shift(i11, 16));
    }

    private void packBlock(byte[] bArr, int i10) {
        int i11 = this.f61596C0;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
        int i12 = this.f61597C1;
        bArr[i10 + 4] = (byte) i12;
        bArr[i10 + 5] = (byte) (i12 >> 8);
        bArr[i10 + 6] = (byte) (i12 >> 16);
        bArr[i10 + 7] = (byte) (i12 >> 24);
        int i13 = this.f61598C2;
        bArr[i10 + 8] = (byte) i13;
        bArr[i10 + 9] = (byte) (i13 >> 8);
        bArr[i10 + 10] = (byte) (i13 >> 16);
        bArr[i10 + 11] = (byte) (i13 >> 24);
        int i14 = this.f61599C3;
        bArr[i10 + 12] = (byte) i14;
        bArr[i10 + 13] = (byte) (i14 >> 8);
        bArr[i10 + 14] = (byte) (i14 >> 16);
        bArr[i10 + 15] = (byte) (i14 >> 24);
    }

    private static int shift(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private static int subWord(int i10) {
        byte[] bArr = f61589S;
        return (bArr[(i10 >> 24) & 255] << 24) | (bArr[i10 & 255] & UByte.MAX_VALUE) | ((bArr[(i10 >> 8) & 255] & UByte.MAX_VALUE) << 8) | ((bArr[(i10 >> 16) & 255] & UByte.MAX_VALUE) << 16);
    }

    private void unpackBlock(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        this.f61596C0 = i11;
        int i12 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | i11;
        this.f61596C0 = i12;
        int i13 = i12 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
        this.f61596C0 = i13;
        this.f61596C0 = i13 | (bArr[i10 + 3] << 24);
        int i14 = bArr[i10 + 4] & UByte.MAX_VALUE;
        this.f61597C1 = i14;
        int i15 = ((bArr[i10 + 5] & UByte.MAX_VALUE) << 8) | i14;
        this.f61597C1 = i15;
        int i16 = i15 | ((bArr[i10 + 6] & UByte.MAX_VALUE) << 16);
        this.f61597C1 = i16;
        this.f61597C1 = i16 | (bArr[i10 + 7] << 24);
        int i17 = bArr[i10 + 8] & UByte.MAX_VALUE;
        this.f61598C2 = i17;
        int i18 = ((bArr[i10 + 9] & UByte.MAX_VALUE) << 8) | i17;
        this.f61598C2 = i18;
        int i19 = i18 | ((bArr[i10 + 10] & UByte.MAX_VALUE) << 16);
        this.f61598C2 = i19;
        this.f61598C2 = i19 | (bArr[i10 + 11] << 24);
        int i20 = bArr[i10 + 12] & UByte.MAX_VALUE;
        this.f61599C3 = i20;
        int i21 = ((bArr[i10 + 13] & UByte.MAX_VALUE) << 8) | i20;
        this.f61599C3 = i21;
        int i22 = i21 | ((bArr[i10 + 14] & UByte.MAX_VALUE) << 16);
        this.f61599C3 = i22;
        this.f61599C3 = (bArr[i10 + 15] << 24) | i22;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z10);
            this.forEncryption = z10;
        } else {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i10 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i11 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z10 = this.forEncryption;
        unpackBlock(bArr, i10);
        int[][] iArr = this.WorkingKey;
        if (z10) {
            encryptBlock(iArr);
        } else {
            decryptBlock(iArr);
        }
        packBlock(bArr2, i11);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
