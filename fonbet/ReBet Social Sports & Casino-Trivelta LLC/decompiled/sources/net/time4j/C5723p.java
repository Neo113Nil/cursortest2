package net.time4j;

import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.Locale;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* renamed from: net.time4j.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5723p extends AbstractC5701a implements C, net.time4j.format.l, pi.e {
    private static final long serialVersionUID = 2055272540517425102L;

    /* renamed from: d, reason: collision with root package name */
    public final transient Class f58305d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Enum f58306e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Enum f58307f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f58308g;

    /* renamed from: h, reason: collision with root package name */
    public final transient char f58309h;

    public C5723p(String str, Class cls, Enum r32, Enum r42, int i10, char c10) {
        super(str);
        this.f58305d = cls;
        this.f58306e = r32;
        this.f58307f = r42;
        this.f58308g = i10;
        this.f58309h = c10;
    }

    private Object readResolve() {
        Object z02 = F.z0(name());
        if (z02 != null) {
            return z02;
        }
        throw new InvalidObjectException(name());
    }

    @Override // oi.p
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Enum d0() {
        return this.f58306e;
    }

    public int B() {
        return this.f58308g;
    }

    public int C(Enum r12) {
        return r12.ordinal() + 1;
    }

    @Override // pi.e
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Enum k(CharSequence charSequence, ParsePosition parsePosition, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar, net.time4j.format.g gVar) {
        int index = parsePosition.getIndex();
        Enum c10 = y(locale, vVar, mVar).c(charSequence, parsePosition, getType(), gVar);
        if (c10 != null || gVar.c()) {
            return c10;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        net.time4j.format.m mVar2 = net.time4j.format.m.FORMAT;
        if (mVar == mVar2) {
            mVar2 = net.time4j.format.m.STANDALONE;
        }
        return y(locale, vVar, mVar2).c(charSequence, parsePosition, getType(), gVar);
    }

    @Override // net.time4j.format.t
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Enum a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        int index = parsePosition.getIndex();
        Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        net.time4j.format.v vVar = (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57809h;
        net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
        net.time4j.format.m mVar2 = (net.time4j.format.m) interfaceC5908d.b(interfaceC5907c, mVar);
        Enum d10 = y(locale, vVar, mVar2).d(charSequence, parsePosition, getType(), interfaceC5908d);
        if (d10 != null || !((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
            return d10;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = net.time4j.format.m.STANDALONE;
        }
        return y(locale, vVar, mVar).d(charSequence, parsePosition, getType(), interfaceC5908d);
    }

    @Override // net.time4j.format.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public int j(Enum r12, oi.o oVar, InterfaceC5908d interfaceC5908d) {
        return r12.ordinal() + 1;
    }

    @Override // net.time4j.format.l
    public boolean N(oi.q qVar, int i10) {
        for (Enum r42 : (Enum[]) getType().getEnumConstants()) {
            if (C(r42) == i10) {
                qVar.y(this, r42);
                return true;
            }
        }
        return false;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(y((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE), (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT)).f((Enum) oVar.j(this)));
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return this.f58309h;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // pi.e
    public void f(oi.o oVar, Appendable appendable, Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        appendable.append(y(locale, vVar, mVar).f((Enum) oVar.j(this)));
    }

    @Override // oi.p
    public Class getType() {
        return this.f58305d;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    public final net.time4j.format.s y(Locale locale, net.time4j.format.v vVar, net.time4j.format.m mVar) {
        switch (this.f58308g) {
            case 101:
                return net.time4j.format.b.d(locale).l(vVar, mVar);
            case 102:
                return net.time4j.format.b.d(locale).p(vVar, mVar);
            case 103:
                return net.time4j.format.b.d(locale).k(vVar, mVar);
            default:
                throw new UnsupportedOperationException(name());
        }
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Enum c() {
        return this.f58307f;
    }
}
