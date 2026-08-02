package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public class W implements oi.s {
    @Override // oi.s
    public boolean a(oi.p pVar) {
        return false;
    }

    @Override // oi.s
    public boolean b(Class cls) {
        return false;
    }

    @Override // oi.s
    public Set c(Locale locale, InterfaceC5908d interfaceC5908d) {
        return locale.getCountry().isEmpty() ? Collections.EMPTY_SET : a0.j(locale).d();
    }

    @Override // oi.s
    public oi.q d(oi.q qVar, Locale locale, InterfaceC5908d interfaceC5908d) {
        return qVar;
    }
}
