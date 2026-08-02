package L6;

import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.UnsupportedEncodingException;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f7071a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f7072b = e();

    /* renamed from: c, reason: collision with root package name */
    public static b f7073c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f7074d = false;
    private static final byte[] WEBP_RIFF_BYTES = a("RIFF");
    private static final byte[] WEBP_NAME_BYTES = a("WEBP");
    private static final byte[] WEBP_VP8_BYTES = a("VP8 ");
    private static final byte[] WEBP_VP8L_BYTES = a("VP8L");
    private static final byte[] WEBP_VP8X_BYTES = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, WEBP_VP8X_BYTES) && ((bArr[i10 + 20] & 2) == 2);
    }

    public static boolean c(byte[] bArr, int i10, int i11) {
        return i11 >= 21 && j(bArr, i10 + 12, WEBP_VP8X_BYTES);
    }

    public static boolean d(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, WEBP_VP8X_BYTES) && ((bArr[i10 + 20] & Tnaf.POW_2_WIDTH) == 16);
    }

    public static boolean e() {
        return true;
    }

    public static boolean f(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, WEBP_VP8L_BYTES);
    }

    public static boolean g(byte[] bArr, int i10) {
        return j(bArr, i10 + 12, WEBP_VP8_BYTES);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return i11 >= 20 && j(bArr, i10, WEBP_RIFF_BYTES) && j(bArr, i10 + 8, WEBP_NAME_BYTES);
    }

    public static b i() {
        b bVar;
        if (f7074d) {
            return f7073c;
        }
        try {
            bVar = (b) WebpBitmapFactoryImpl.class.newInstance();
        } catch (Throwable unused) {
            bVar = null;
        }
        f7074d = true;
        return bVar;
    }

    public static boolean j(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
