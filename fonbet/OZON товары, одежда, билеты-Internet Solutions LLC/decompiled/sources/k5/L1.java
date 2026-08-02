package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes8.dex */
public final class L1 extends F0<Om0.c> {
    @Override // k5.D0
    @NonNull
    protected final Serializable s() throws D1 {
        List<InterfaceC7496b0> B11 = B();
        if (B11.isEmpty()) {
            throw new C7571u0("Could not get the cell ID of the network");
        }
        Om0.c cVar = new Om0.c(B11.size());
        for (InterfaceC7496b0 interfaceC7496b0 : B11) {
            Om0.a aVar = new Om0.a();
            aVar.put("type", interfaceC7496b0.c());
            aVar.put("cid", Long.valueOf(interfaceC7496b0.o()));
            aVar.put("lac", Integer.valueOf(interfaceC7496b0.x()));
            String r11 = interfaceC7496b0.r();
            if (r11 != null) {
                aVar.put("mcc", r11);
            }
            String z11 = interfaceC7496b0.z();
            if (z11 != null) {
                aVar.put("mnc", z11);
            }
            aVar.put("time", Long.valueOf(interfaceC7496b0.t()));
            aVar.put("serving", interfaceC7496b0.w());
            aVar.put("level", Integer.valueOf(interfaceC7496b0.k()));
            aVar.put("dbm", Integer.valueOf(interfaceC7496b0.q()));
            cVar.add(aVar);
        }
        return cVar;
    }
}
