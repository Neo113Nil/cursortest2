package net.time4j;

import java.util.Locale;
import li.InterfaceC5473g;
import oi.InterfaceC5918n;

/* renamed from: net.time4j.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC5732z implements InterfaceC5918n {
    AM,
    PM;

    public static EnumC5732z c(int i10) {
        if (i10 >= 0 && i10 <= 24) {
            return (i10 < 12 || i10 == 24) ? AM : PM;
        }
        throw new IllegalArgumentException("Hour of day out of range: " + i10);
    }

    public String a(Locale locale) {
        return b(locale, net.time4j.format.v.WIDE, net.time4j.format.m.FORMAT);
    }

    public String b(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).h(vVar, mVar).f(this);
    }

    @Override // oi.InterfaceC5918n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean test(InterfaceC5473g interfaceC5473g) {
        int q10 = interfaceC5473g.q();
        return this == AM ? q10 < 12 || q10 == 24 : q10 >= 12 && q10 < 24;
    }
}
