package l1;

import Bl0.C2656q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I0 {
    @NotNull
    public static final H0 a(@NotNull H0 h02, @NotNull H0 h03, float f7) {
        long g10 = C7811b0.g(h02.c(), h03.c(), f7);
        long d11 = h02.d();
        long d12 = h03.d();
        float b11 = C2656q.b(Float.intBitsToFloat((int) (d11 >> 32)), Float.intBitsToFloat((int) (d12 >> 32)), f7);
        float b12 = C2656q.b(Float.intBitsToFloat((int) (d11 & 4294967295L)), Float.intBitsToFloat((int) (d12 & 4294967295L)), f7);
        return new H0(g10, (Float.floatToRawIntBits(b11) << 32) | (Float.floatToRawIntBits(b12) & 4294967295L), C2656q.b(h02.b(), h03.b(), f7));
    }
}
