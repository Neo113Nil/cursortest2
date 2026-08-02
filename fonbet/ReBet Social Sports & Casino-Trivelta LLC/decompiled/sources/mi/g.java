package mi;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.t;
import oi.InterfaceC5908d;
import oi.z;

/* loaded from: classes5.dex */
public class g implements t, z, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final g f56633a = new g();
    private static final long serialVersionUID = 4572549754637955194L;

    public static g v() {
        return f56633a;
    }

    @Override // oi.z
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public d q(d dVar, n nVar, boolean z10) {
        if (nVar != null) {
            return (d) dVar.z(nVar.k());
        }
        throw new IllegalArgumentException("Missing solar term.");
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(((n) oVar.j(this)).c((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)));
    }

    @Override // oi.p
    public char a() {
        return (char) 0;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return n.class;
    }

    @Override // oi.p
    public String name() {
        return "SOLAR_TERM";
    }

    @Override // java.util.Comparator
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        return ((n) oVar.j(this)).compareTo((n) oVar2.j(this));
    }

    @Override // oi.z
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public oi.p b(d dVar) {
        throw new AbstractMethodError();
    }

    public Object readResolve() {
        return f56633a;
    }

    @Override // oi.z
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public oi.p d(d dVar) {
        throw new AbstractMethodError();
    }

    @Override // oi.p
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public n c() {
        return n.MAJOR_12_DAHAN_300;
    }

    @Override // oi.p
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public n d0() {
        return n.MINOR_01_LICHUN_315;
    }

    @Override // oi.z
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public n e(d dVar) {
        net.time4j.calendar.b O10 = dVar.O();
        return n.h(O10.n(O10.q(dVar.P(), dVar.Z().getNumber()) + dVar.lengthOfYear()));
    }

    @Override // oi.z
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public n i(d dVar) {
        net.time4j.calendar.b O10 = dVar.O();
        return n.h(O10.n(O10.q(dVar.P(), dVar.Z().getNumber()) + 1));
    }

    @Override // oi.z
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public n p(d dVar) {
        return n.h(dVar.O().n(dVar.b() + 1));
    }

    @Override // net.time4j.format.t
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public n a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        int length = charSequence.length();
        if (parsePosition.getIndex() < length) {
            return n.j(charSequence, locale, parsePosition);
        }
        parsePosition.setErrorIndex(length);
        return null;
    }

    @Override // oi.z
    public boolean isValid(d dVar, n nVar) {
        return nVar != null;
    }
}
