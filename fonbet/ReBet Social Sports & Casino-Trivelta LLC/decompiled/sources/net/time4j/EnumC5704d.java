package net.time4j;

import java.text.ParsePosition;
import java.util.Locale;
import oi.InterfaceC5908d;

/* renamed from: net.time4j.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC5704d implements d0, pi.e {
    AM_PM_OF_DAY;

    private net.time4j.format.s b(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        return net.time4j.format.b.d(locale).h(vVar, mVar);
    }

    public static EnumC5732z p(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int i10 = index + 2;
        if (charSequence.length() < i10) {
            return null;
        }
        char charAt = charSequence.charAt(index + 1);
        if (charAt != 'M' && charAt != 'm') {
            return null;
        }
        char charAt2 = charSequence.charAt(index);
        if (charAt2 == 'A' || charAt2 == 'a') {
            parsePosition.setIndex(i10);
            return EnumC5732z.AM;
        }
        if (charAt2 != 'P' && charAt2 != 'p') {
            return null;
        }
        parsePosition.setIndex(i10);
        return EnumC5732z.PM;
    }

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(d(interfaceC5908d).f((Enum) oVar.j(this)));
    }

    @Override // oi.p
    public char a() {
        return 'a';
    }

    public final net.time4j.format.s d(InterfaceC5908d interfaceC5908d) {
        return net.time4j.format.b.d((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)).h((net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE), (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT));
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        return ((EnumC5732z) oVar.j(this)).compareTo((EnumC5732z) oVar2.j(this));
    }

    @Override // oi.p
    public boolean e0() {
        return true;
    }

    @Override // pi.e
    public void f(oi.o oVar, Appendable appendable, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        appendable.append(b(locale, vVar, mVar).f((Enum) oVar.j(this)));
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return EnumC5732z.class;
    }

    @Override // oi.p
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public EnumC5732z c() {
        return EnumC5732z.PM;
    }

    @Override // oi.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public EnumC5732z d0() {
        return EnumC5732z.AM;
    }

    @Override // pi.e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public EnumC5732z k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        EnumC5732z p10 = p(charSequence, parsePosition);
        return p10 == null ? (EnumC5732z) b(locale, vVar, mVar).c(charSequence, parsePosition, getType(), gVar) : p10;
    }

    @Override // net.time4j.format.t
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public EnumC5732z a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        EnumC5732z p10 = p(charSequence, parsePosition);
        return p10 == null ? (EnumC5732z) d(interfaceC5908d).d(charSequence, parsePosition, getType(), interfaceC5908d) : p10;
    }
}
