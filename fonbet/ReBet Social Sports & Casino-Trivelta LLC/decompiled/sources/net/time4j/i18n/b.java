package net.time4j.i18n;

import java.util.Locale;
import java.util.Set;
import net.time4j.F;
import net.time4j.history.j;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.p;
import oi.q;
import oi.s;

/* loaded from: classes5.dex */
public class b implements s {
    public static net.time4j.history.d e(Locale locale, InterfaceC5908d interfaceC5908d) {
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57803b;
        if (((String) interfaceC5908d.b(interfaceC5907c, "iso8601")).equals("julian")) {
            return net.time4j.history.d.f58162r;
        }
        InterfaceC5907c interfaceC5907c2 = net.time4j.history.internal.a.f58201a;
        if (interfaceC5908d.c(interfaceC5907c2)) {
            return (net.time4j.history.d) interfaceC5908d.a(interfaceC5907c2);
        }
        if (((String) interfaceC5908d.b(interfaceC5907c, "iso8601")).equals("historic")) {
            InterfaceC5907c interfaceC5907c3 = net.time4j.format.a.f57821t;
            if (interfaceC5908d.c(interfaceC5907c3)) {
                return net.time4j.history.d.j((String) interfaceC5908d.a(interfaceC5907c3));
            }
        }
        return net.time4j.history.d.C(locale);
    }

    @Override // oi.s
    public boolean a(p pVar) {
        return pVar instanceof net.time4j.history.internal.c;
    }

    @Override // oi.s
    public boolean b(Class cls) {
        return cls == F.class;
    }

    @Override // oi.s
    public Set c(Locale locale, InterfaceC5908d interfaceC5908d) {
        return e(locale, interfaceC5908d).n();
    }

    @Override // oi.s
    public q d(q qVar, Locale locale, InterfaceC5908d interfaceC5908d) {
        return f(qVar, e(locale, interfaceC5908d), interfaceC5908d);
    }

    public q f(q qVar, net.time4j.history.d dVar, InterfaceC5908d interfaceC5908d) {
        j jVar;
        j jVar2;
        if (qVar.f(dVar.i())) {
            jVar2 = (j) qVar.j(dVar.i());
        } else {
            if (!((net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART)).a()) {
                jVar = null;
                if (jVar == null && qVar.f(dVar.K())) {
                    int e10 = qVar.e(dVar.K());
                    if (qVar.f(dVar.B()) && qVar.f(dVar.g())) {
                        F d10 = dVar.d(net.time4j.history.h.h(jVar, e10, qVar.e(dVar.B()), qVar.e(dVar.g()), (net.time4j.history.p) interfaceC5908d.b(net.time4j.history.d.f58160p, net.time4j.history.p.DUAL_DATING), dVar.v()));
                        qVar.y(dVar.i(), null);
                        qVar.y(dVar.K(), null);
                        qVar.y(dVar.B(), null);
                        qVar.y(dVar.g(), null);
                        return qVar.y(F.f57535m, d10);
                    }
                    if (!qVar.f(dVar.h())) {
                        return qVar;
                    }
                    int e11 = qVar.e(dVar.h());
                    p pVar = net.time4j.history.internal.c.f58210e;
                    if (qVar.f(pVar)) {
                        e10 = qVar.e(pVar);
                    }
                    return qVar.y(F.f57535m, (F) dVar.d(dVar.m(jVar, e10)).w(dVar.h(), e11));
                }
            }
            jVar2 = j.AD;
        }
        jVar = jVar2;
        return jVar == null ? qVar : qVar;
    }
}
