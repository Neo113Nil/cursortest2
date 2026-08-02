package ti;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ti.C6478h;
import ui.AbstractC6590b;

/* renamed from: ti.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6475e {

    /* renamed from: a, reason: collision with root package name */
    public static final C6478h.a f65851a = new C6478h.a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f65852b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f65852b;
    }

    public static final C6478h.a d() {
        return f65851a;
    }

    public static final int e(k kVar, int i10) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return i10 == f65852b ? kVar.u() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i10 == f65852b ? bArr.length : i10;
    }

    public static final C6478h.a g(C6478h.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f65851a ? new C6478h.a() : unsafeCursor;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short i(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String j(byte b10) {
        return StringsKt.concatToString(new char[]{AbstractC6590b.f()[(b10 >> 4) & 15], AbstractC6590b.f()[b10 & 15]});
    }

    public static final String k(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {AbstractC6590b.f()[(i10 >> 28) & 15], AbstractC6590b.f()[(i10 >> 24) & 15], AbstractC6590b.f()[(i10 >> 20) & 15], AbstractC6590b.f()[(i10 >> 16) & 15], AbstractC6590b.f()[(i10 >> 12) & 15], AbstractC6590b.f()[(i10 >> 8) & 15], AbstractC6590b.f()[(i10 >> 4) & 15], AbstractC6590b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return StringsKt.concatToString(cArr, i11, 8);
    }
}
