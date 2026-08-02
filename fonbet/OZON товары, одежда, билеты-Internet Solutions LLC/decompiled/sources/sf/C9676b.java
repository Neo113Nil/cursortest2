package sf;

import C.C2702w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import tf.C9870b;

/* renamed from: sf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9676b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9681g.a f98693a = new C9681g.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f98694b = -1234567890;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f98695c = 0;

    public static final boolean a(int i11, int i12, int i13, @NotNull byte[] a11, @NotNull byte[] b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        for (int i14 = 0; i14 < i13; i14++) {
            if (a11[i14 + i11] != b11[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            StringBuilder d11 = C2702w.d(j11, "size=", " offset=");
            d11.append(j12);
            d11.append(" byteCount=");
            d11.append(j13);
            throw new ArrayIndexOutOfBoundsException(d11.toString());
        }
    }

    public static final int c() {
        return f98694b;
    }

    @NotNull
    public static final C9681g.a d() {
        return f98693a;
    }

    public static final int e(int i11, @NotNull C9684j c9684j) {
        Intrinsics.checkNotNullParameter(c9684j, "<this>");
        return i11 == f98694b ? c9684j.g() : i11;
    }

    public static final int f(int i11, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i11 == f98694b ? bArr.length : i11;
    }

    @NotNull
    public static final C9681g.a g(@NotNull C9681g.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f98693a ? new C9681g.a() : unsafeCursor;
    }

    public static final int h(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    @NotNull
    public static final String i(byte b11) {
        char[] cArr = {C9870b.b()[(b11 >> 4) & 15], C9870b.b()[b11 & 15]};
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }
}
