package l10;

import A00.a;
import Ae.InterfaceC2395h;
import Sc.InterfaceC3999a;
import androidx.lifecycle.C5423j;
import i10.h;
import i10.l;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: l10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC7851b {

    /* renamed from: l10.b$a */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(InterfaceC7851b interfaceC7851b, String str, Map map, Map map2, h.b bVar, int i11) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                int i12 = a.u.b.f244j;
                map2 = a.u.b.C0014a.a();
            }
            if ((i11 & 8) != 0) {
                bVar = null;
            }
            interfaceC7851b.b(str, map, map2, bVar);
        }

        public static /* synthetic */ void b(InterfaceC7851b interfaceC7851b, int i11, int i12, boolean z11, int i13) {
            if ((i13 & 2) != 0) {
                i12 = 0;
            }
            if ((i13 & 4) != 0) {
                z11 = false;
            }
            interfaceC7851b.o(i11, i12, z11, true);
        }

        public static /* synthetic */ void c(InterfaceC7851b interfaceC7851b, String str, Integer num, int i11) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            interfaceC7851b.c(str, num, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(InterfaceC7851b interfaceC7851b, String str, Map map, Map map2, int i11) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                map = null;
            }
            if ((i11 & 4) != 0) {
                int i12 = a.u.b.f244j;
                map2 = a.u.b.C0014a.a();
            }
            interfaceC7851b.k(str, map, map2);
        }
    }

    void a();

    void b(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, h.b bVar);

    void c(@NotNull String str, Integer num, boolean z11);

    void d(@NotNull a.J.InterfaceC0007a interfaceC0007a);

    void e(@NotNull l.a aVar);

    void f(boolean z11);

    void g();

    @NotNull
    C5423j getEvents();

    @NotNull
    InterfaceC2395h<A00.a> getEventsFlow();

    void h(@NotNull z00.f fVar);

    void hideLoader();

    void i(int i11, @NotNull String str);

    @InterfaceC3999a
    void j(@NotNull String str, @NotNull String str2, @NotNull a.C.b bVar);

    void k(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2);

    void l(int i11);

    void m(long j11);

    @InterfaceC3999a
    void n(int i11, @NotNull String str, @NotNull String str2);

    void o(int i11, int i12, boolean z11, boolean z12);

    void p(@NotNull String str);

    void update(@NotNull a.J.InterfaceC0007a interfaceC0007a);
}
