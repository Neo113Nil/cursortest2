package l1;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.I, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7791I {
    @NotNull
    public static final LinearGradient a(long j11, long j12, @NotNull List list, List list2, int i11) {
        d(list, list2);
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        float g11 = C7459e.g(j12);
        float h12 = C7459e.h(j12);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = C7811b0.i(((C7807Z) list.get(i12)).w());
        }
        return new LinearGradient(g10, h11, g11, h12, iArr, c(list2, list), C7792J.a(i11));
    }

    @NotNull
    public static final RadialGradient b(float f7, long j11, ArrayList arrayList, @NotNull List list) {
        d(list, arrayList);
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        int size = list.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = C7811b0.i(((C7807Z) list.get(i11)).w());
        }
        return new RadialGradient(g10, h11, f7, iArr, c(arrayList, list), C7792J.a(0));
    }

    public static final float[] c(List list, @NotNull List list2) {
        if (list != null) {
            return C7714v.R0(list);
        }
        return null;
    }

    private static final void d(List<C7807Z> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
