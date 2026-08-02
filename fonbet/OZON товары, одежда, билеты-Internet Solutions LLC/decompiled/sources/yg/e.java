package yg;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f106605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final byte[] f106606b;

    static {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = "\r\n".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f106605a = bytes;
        byte[] bytes2 = "--".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        f106606b = bytes2;
    }

    public static final void a(String str, StringBuilder sb2) {
        sb2.append('\"');
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\"' || charAt == '\\' || charAt == '\r') {
                for (int i12 = 0; i12 < str.length(); i12++) {
                    char charAt2 = str.charAt(i12);
                    if (charAt2 == '\"' || charAt2 == '\\' || charAt2 == '\r') {
                        sb2.append('\\');
                    }
                    sb2.append(charAt2);
                }
                sb2.append('\"');
            }
        }
        sb2.append(str);
        sb2.append('\"');
    }

    public static final int d(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            i11 += charAt <= 127 ? 1 : charAt <= 2047 ? 2 : 3;
        }
        return i11;
    }

    public static final void e(OutputStream outputStream, String str) {
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt <= 2047) {
                outputStream.write((charAt >> 6) | 192);
                outputStream.write((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            } else {
                outputStream.write((charAt >> '\f') | 224);
                outputStream.write(((charAt >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                outputStream.write((charAt & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
            }
        }
    }
}
