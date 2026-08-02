package e2;

import B1.U;
import j2.C7241a;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6265i {
    public static final void a(@NotNull C6253A c6253a, @NotNull List<? extends U> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            U u11 = list.get(i11);
            Object a11 = androidx.compose.ui.layout.a.a(u11);
            if (a11 == null && (a11 = C6268l.a(u11)) == null) {
                a11 = new F2.c();
            }
            C7241a c11 = c6253a.c(a11.toString());
            if (c11 != null) {
                c11.B(u11);
            }
            Object m11 = u11.m();
            InterfaceC6269m interfaceC6269m = m11 instanceof InterfaceC6269m ? (InterfaceC6269m) m11 : null;
            String a12 = interfaceC6269m != null ? interfaceC6269m.a() : null;
            if (a12 != null && (a11 instanceof String)) {
                c6253a.n((String) a11, a12);
            }
        }
    }
}
