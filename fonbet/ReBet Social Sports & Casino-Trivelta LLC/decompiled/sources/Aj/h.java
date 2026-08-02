package Aj;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.EnumC3631g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import kotlin.UByte;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static String f485a;

    public static class a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f485a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f485a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f485a = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) (bArr[i10] & UByte.MAX_VALUE);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char c10;
        int i10;
        byte b10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i13 + 1;
            byte b11 = bArr[i12];
            if ((b11 & 240) == 240) {
                i13 += 2;
                i12 += 4;
            } else {
                i12 = (b11 & 224) == 224 ? i12 + 3 : (b11 & 192) == 192 ? i12 + 2 : i12 + 1;
                i13 = i14;
            }
        }
        char[] cArr = new char[i13];
        int i15 = 0;
        while (i11 < bArr.length) {
            byte b12 = bArr[i11];
            if ((b12 & 240) == 240) {
                int i16 = (((((b12 & 3) << 18) | ((bArr[i11 + 1] & 63) << 12)) | ((bArr[i11 + 2] & 63) << 6)) | (bArr[i11 + 3] & 63)) - PKIFailureInfo.notAuthorized;
                char c11 = (char) ((i16 >> 10) | 55296);
                c10 = (char) ((i16 & 1023) | 56320);
                cArr[i15] = c11;
                i11 += 4;
                i15++;
            } else if ((b12 & 224) == 224) {
                c10 = (char) (((b12 & 15) << 12) | ((bArr[i11 + 1] & 63) << 6) | (bArr[i11 + 2] & 63));
                i11 += 3;
            } else {
                if ((b12 & 208) == 208) {
                    i10 = (b12 & 31) << 6;
                    b10 = bArr[i11 + 1];
                } else if ((b12 & 192) == 192) {
                    i10 = (b12 & 31) << 6;
                    b10 = bArr[i11 + 1];
                } else {
                    c10 = (char) (b12 & UByte.MAX_VALUE);
                    i11++;
                }
                c10 = (char) (i10 | (b10 & 63));
                i11 += 2;
            }
            cArr[i15] = c10;
            i15++;
        }
        return new String(cArr);
    }

    public static String d() {
        return f485a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) str.charAt(i10);
        }
        return bArr;
    }

    public static byte[] f(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 != length; i10++) {
            bArr[i10] = (byte) cArr[i10];
        }
        return bArr;
    }

    public static String g(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i10] = (char) (c10 + ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }

    public static void h(char[] cArr, OutputStream outputStream) {
        int i10 = 0;
        while (i10 < cArr.length) {
            char c10 = cArr[i10];
            if (c10 < 128) {
                outputStream.write(c10);
            } else if (c10 < 2048) {
                outputStream.write((c10 >> 6) | 192);
                outputStream.write((c10 & '?') | 128);
            } else if (c10 < 55296 || c10 > 57343) {
                outputStream.write((c10 >> '\f') | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE);
                outputStream.write(((c10 >> 6) & 63) | 128);
                outputStream.write((c10 & '?') | 128);
            } else {
                i10++;
                if (i10 >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char c11 = cArr[i10];
                if (c10 > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i11 = (((c10 & 1023) << 10) | (c11 & 1023)) + PKIFailureInfo.notAuthorized;
                outputStream.write((i11 >> 18) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                outputStream.write(((i11 >> 12) & 63) | 128);
                outputStream.write(((i11 >> 6) & 63) | 128);
                outputStream.write((i11 & 63) | 128);
            }
            i10++;
        }
    }

    public static byte[] i(String str) {
        return j(str.toCharArray());
    }

    public static byte[] j(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            h(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        boolean z10 = false;
        for (int i10 = 0; i10 != charArray.length; i10++) {
            char c10 = charArray[i10];
            if ('a' <= c10 && 'z' >= c10) {
                charArray[i10] = (char) (c10 - ' ');
                z10 = true;
            }
        }
        return z10 ? new String(charArray) : str;
    }
}
