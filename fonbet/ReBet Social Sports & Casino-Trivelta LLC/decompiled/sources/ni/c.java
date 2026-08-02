package ni;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.F;
import net.time4j.calendar.KoreanCalendar;
import oi.InterfaceC5908d;
import oi.p;
import oi.q;
import oi.s;

/* loaded from: classes5.dex */
public class c implements s {
    @Override // oi.s
    public boolean a(p pVar) {
        return pVar == KoreanCalendar.f57737i;
    }

    @Override // oi.s
    public boolean b(Class cls) {
        return cls == F.class;
    }

    @Override // oi.s
    public Set c(Locale locale, InterfaceC5908d interfaceC5908d) {
        return Collections.EMPTY_SET;
    }

    @Override // oi.s
    public q d(q qVar, Locale locale, InterfaceC5908d interfaceC5908d) {
        if (!qVar.f(KoreanCalendar.f57737i)) {
            return qVar;
        }
        return qVar.w(F.f57536n, qVar.e(r2) - 2333);
    }
}
