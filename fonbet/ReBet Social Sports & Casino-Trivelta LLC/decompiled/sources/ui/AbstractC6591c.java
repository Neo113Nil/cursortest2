package ui;

import kotlin.jvm.internal.Intrinsics;
import ti.C6470D;

/* renamed from: ui.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6591c {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(C6470D c6470d, int i10) {
        Intrinsics.checkNotNullParameter(c6470d, "<this>");
        int a10 = a(c6470d.A(), i10 + 1, 0, c6470d.B().length);
        return a10 >= 0 ? a10 : ~a10;
    }
}
