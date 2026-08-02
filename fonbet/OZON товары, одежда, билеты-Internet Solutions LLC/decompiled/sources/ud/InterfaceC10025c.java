package ud;

import java.util.Map;
import je.N;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.d0;

/* renamed from: ud.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10025c {

    /* renamed from: ud.c$a */
    /* loaded from: classes10.dex */
    public static final class a {
        public static Sd.c a(@NotNull InterfaceC10025c interfaceC10025c) {
            InterfaceC9839e d11 = Zd.e.d(interfaceC10025c);
            if (d11 != null) {
                if (le.l.k(d11)) {
                    d11 = null;
                }
                if (d11 != null) {
                    return Zd.e.c(d11);
                }
            }
            return null;
        }
    }

    @NotNull
    Map<Sd.f, Xd.g<?>> b();

    Sd.c c();

    @NotNull
    d0 e();

    @NotNull
    N getType();
}
