package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.List;

/* renamed from: k5.o0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7548o0 extends F0<String> {
    @Override // k5.D0
    @NonNull
    protected final Serializable s() throws D1 {
        List<InterfaceC7496b0> B11 = B();
        if (B11.isEmpty()) {
            throw new C7571u0("Could not get the cell ID of the network");
        }
        return String.valueOf(B11.get(0).o());
    }
}
