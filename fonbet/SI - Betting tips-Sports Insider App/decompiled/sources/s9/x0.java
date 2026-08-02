package s9;

import java.nio.charset.Charset;
import java.util.Arrays;
import okio.Utf8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends m4.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23388e;

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // m4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String f(byte[] bArr, int i5, int i10) {
        switch (this.f23388e) {
            case 0:
                if ((i5 | i10 | ((bArr.length - i5) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i10)));
                }
                int i11 = i5 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i5 < i11) {
                    byte b10 = bArr[i5];
                    if (b10 < 0) {
                        while (i5 < i11) {
                            int i13 = i5 + 1;
                            byte b11 = bArr[i5];
                            if (b11 >= 0) {
                                int i14 = i12 + 1;
                                cArr[i12] = (char) b11;
                                while (i13 < i11) {
                                    byte b12 = bArr[i13];
                                    if (b12 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b12;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i5 = i13;
                                    }
                                }
                                i12 = i14;
                                i5 = i13;
                            } else if (b11 < -32) {
                                if (i13 >= i11) {
                                    throw v.a();
                                }
                                i5 += 2;
                                byte b13 = bArr[i13];
                                int i15 = i12 + 1;
                                if (b11 < -62 || k2.x.w(b13)) {
                                    throw v.a();
                                }
                                cArr[i12] = (char) ((b13 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                                i12 = i15;
                            } else if (b11 < -16) {
                                if (i13 >= i11 - 1) {
                                    throw v.a();
                                }
                                int i16 = i5 + 2;
                                byte b14 = bArr[i13];
                                i5 += 3;
                                byte b15 = bArr[i16];
                                int i17 = i12 + 1;
                                if (k2.x.w(b14) || ((b11 == -32 && b14 < -96) || ((b11 == -19 && b14 >= -96) || k2.x.w(b15)))) {
                                    throw v.a();
                                }
                                cArr[i12] = (char) (((b14 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b15 & Utf8.REPLACEMENT_BYTE));
                                i12 = i17;
                            } else {
                                if (i13 >= i11 - 2) {
                                    throw v.a();
                                }
                                byte b16 = bArr[i13];
                                int i18 = i5 + 3;
                                byte b17 = bArr[i5 + 2];
                                i5 += 4;
                                byte b18 = bArr[i18];
                                int i19 = i12 + 1;
                                if (k2.x.w(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || k2.x.w(b17) || k2.x.w(b18)) {
                                    throw v.a();
                                }
                                int i20 = ((b16 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                                cArr[i12] = (char) ((i20 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                cArr[i19] = (char) ((i20 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i5++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                while (i5 < i11) {
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = t.f23375a;
                String str = new String(bArr, i5, i10, charset);
                if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i5, i10 + i5))) {
                    throw v.a();
                }
                return str;
        }
    }
}
