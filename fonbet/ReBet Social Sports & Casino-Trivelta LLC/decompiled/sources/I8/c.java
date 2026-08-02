package I8;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5493a = new c();

    public final String a(String str, String str2) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[] bytes = str2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bytes2 = messageDigest.digest(bytes);
        StringBuilder sb2 = new StringBuilder(bytes2.length * 2);
        Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
        for (byte b10 : bytes2) {
            sb2.append("0123456789ABCDEF".charAt((b10 >> 4) & 15));
            sb2.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "result.toString()");
        return sb3;
    }

    public final String b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return a(McElieceCCA2KeyGenParameterSpec.SHA1, input);
    }
}
