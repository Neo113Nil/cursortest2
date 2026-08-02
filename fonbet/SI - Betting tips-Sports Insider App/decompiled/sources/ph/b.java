package ph;

import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f21890a = ByteString.INSTANCE.encodeUtf8("xn--");

    public static int a(int i5, int i10, boolean z5) {
        int i11 = z5 ? i5 / 700 : i5 / 2;
        int i12 = (i11 / i10) + i11;
        int i13 = 0;
        while (i12 > 455) {
            i12 /= 35;
            i13 += 36;
        }
        return ((i12 * 36) / (i12 + 38)) + i13;
    }

    public static int b(int i5) {
        if (i5 < 26) {
            return i5 + 97;
        }
        if (i5 < 36) {
            return i5 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i5).toString());
    }
}
