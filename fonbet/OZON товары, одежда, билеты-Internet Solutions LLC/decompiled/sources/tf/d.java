package tf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.J;

/* loaded from: classes6.dex */
public final class d {
    public static final int a(@NotNull J j11, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(j11, "<this>");
        int[] J11 = j11.J();
        int i13 = i11 + 1;
        int length = j11.K().length;
        Intrinsics.checkNotNullParameter(J11, "<this>");
        int i14 = length - 1;
        int i15 = 0;
        while (true) {
            if (i15 <= i14) {
                i12 = (i15 + i14) >>> 1;
                int i16 = J11[i12];
                if (i16 >= i13) {
                    if (i16 <= i13) {
                        break;
                    }
                    i14 = i12 - 1;
                } else {
                    i15 = i12 + 1;
                }
            } else {
                i12 = (-i15) - 1;
                break;
            }
        }
        return i12 >= 0 ? i12 : ~i12;
    }
}
