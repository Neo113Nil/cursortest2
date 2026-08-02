package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class s1 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final s1 f23689a = new s1();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23690b = new y0("kotlin.uuid.Uuid", qg.e.f22164m);

    @Override // og.a
    public final Object a(rg.b decoder) {
        String sb2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String hexString = decoder.s();
        Intrinsics.checkNotNullParameter(hexString, "uuidString");
        int length = hexString.length();
        if (length == 32) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            long b10 = kotlin.text.d.b(0, 16, hexString);
            long b11 = kotlin.text.d.b(16, 32, hexString);
            if (b10 != 0 || b11 != 0) {
                return new dg.b(b10, b11);
            }
        } else {
            if (length != 36) {
                StringBuilder sb3 = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (hexString.length() <= 64) {
                    sb2 = hexString;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    Intrinsics.checkNotNull(hexString, "null cannot be cast to non-null type java.lang.String");
                    String substring = hexString.substring(0, 64);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    sb4.append(substring);
                    sb4.append("...");
                    sb2 = sb4.toString();
                }
                sb3.append(sb2);
                sb3.append("\" of length ");
                sb3.append(hexString.length());
                throw new IllegalArgumentException(sb3.toString());
            }
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            Intrinsics.checkNotNullParameter(hexString, "hexDashString");
            long b12 = kotlin.text.d.b(0, 8, hexString);
            h8.b.f(8, hexString);
            long b13 = kotlin.text.d.b(9, 13, hexString);
            h8.b.f(13, hexString);
            long b14 = kotlin.text.d.b(14, 18, hexString);
            h8.b.f(18, hexString);
            long b15 = kotlin.text.d.b(19, 23, hexString);
            h8.b.f(23, hexString);
            long j = (b13 << 16) | (b12 << 32) | b14;
            long b16 = kotlin.text.d.b(24, 36, hexString) | (b15 << 48);
            if (j != 0 || b16 != 0) {
                return new dg.b(j, b16);
            }
        }
        return dg.b.f8375d;
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        dg.b value = (dg.b) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.r(value.toString());
    }

    @Override // og.a
    public final qg.g d() {
        return f23690b;
    }
}
