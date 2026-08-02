package b5;

import java.util.List;

/* loaded from: classes2.dex */
public interface b {

    public static final class a {
        public static void a(b bVar) {
            for (InterfaceC2398a interfaceC2398a : bVar.a()) {
                if (interfaceC2398a instanceof c) {
                    ((c) interfaceC2398a).r0();
                }
            }
        }

        public static void b(b bVar) {
            for (InterfaceC2398a interfaceC2398a : bVar.a()) {
                if (interfaceC2398a instanceof c) {
                    ((c) interfaceC2398a).close();
                }
            }
        }
    }

    List a();
}
