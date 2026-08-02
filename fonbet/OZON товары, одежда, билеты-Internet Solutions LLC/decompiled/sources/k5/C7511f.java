package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7511f extends F0<String> {
    @Override // k5.D0
    @NonNull
    protected final Serializable s() throws D1 {
        List<InterfaceC7496b0> B11 = B();
        if (B11.isEmpty()) {
            throw new C7571u0(C7563s0.a(new byte[]{-47, -8, 20, 123, 74, -56, -55, Byte.MAX_VALUE, -18, -115, 29, -99, 108, 110, 15, -121, 3, -27, 56, 123, 84, 107, -31, -123, -123, -32, 69, 2, -85, -49, -49, -63, 69, 93, -20, 68, 43, 49, -60, 7, -78, 125, 110, -103, 70, 126, -78, -40, 63, -97, 103, 87, -20, 82, 5, 2, 122, -118, 119, 116, 110, -46, 42, 104}));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator<InterfaceC7496b0> it = B11.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().q());
            sb2.append(C7563s0.a(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34}));
        }
        return sb2.toString().trim();
    }
}
