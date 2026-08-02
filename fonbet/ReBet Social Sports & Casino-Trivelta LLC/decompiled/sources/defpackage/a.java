package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class a {

    @NotNull
    private static final int[] crcTable;

    static {
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (i11 & 1) != 0 ? (int) ((i11 >>> 1) ^ 3988292384L) : i11 >>> 1;
            }
            iArr[i10] = i11;
        }
        crcTable = iArr;
    }

    public static final int a(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i10 = -1;
        for (byte b10 : buffer) {
            i10 = (i10 >>> 8) ^ crcTable[(b10 ^ i10) & 255];
        }
        return ~i10;
    }
}
