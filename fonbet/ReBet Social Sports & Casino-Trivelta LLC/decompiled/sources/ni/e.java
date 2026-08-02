package ni;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.l;
import net.time4j.format.m;
import net.time4j.format.s;
import net.time4j.format.t;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.o;
import oi.q;
import oi.v;

/* loaded from: classes5.dex */
public abstract class e extends d implements l, t {
    private static final long serialVersionUID = -2452569351302286113L;

    /* renamed from: d, reason: collision with root package name */
    public final transient Class f58570d;

    /* renamed from: e, reason: collision with root package name */
    public final transient String f58571e;

    /* renamed from: f, reason: collision with root package name */
    public final transient v f58572f;

    /* renamed from: g, reason: collision with root package name */
    public final transient v f58573g;

    public e(String str, Class cls, Class cls2, char c10) {
        super(str, cls, c10, F(c10));
        this.f58570d = cls2;
        this.f58571e = z(cls);
        this.f58572f = null;
        this.f58573g = null;
    }

    public static boolean F(char c10) {
        return c10 == 'E';
    }

    public static String z(Class cls) {
        net.time4j.format.c cVar = (net.time4j.format.c) cls.getAnnotation(net.time4j.format.c.class);
        return cVar == null ? "iso8601" : cVar.value();
    }

    public String A(InterfaceC5908d interfaceC5908d) {
        return (D() || C()) ? (String) interfaceC5908d.b(net.time4j.format.a.f57803b, this.f58571e) : E() ? "iso8601" : this.f58571e;
    }

    public boolean B(o oVar) {
        return false;
    }

    public boolean C() {
        return a() == 'G';
    }

    public boolean D() {
        return a() == 'M';
    }

    public boolean E() {
        return F(a());
    }

    public abstract int G(Enum r12);

    @Override // net.time4j.format.t
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Enum a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        int index = parsePosition.getIndex();
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57809h;
        m mVar = m.FORMAT;
        m mVar2 = (m) interfaceC5908d.b(interfaceC5907c, mVar);
        Enum d10 = y(interfaceC5908d, mVar2, false).d(charSequence, parsePosition, getType(), interfaceC5908d);
        if (d10 == null && D()) {
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            d10 = y(interfaceC5908d, mVar2, true).d(charSequence, parsePosition, getType(), interfaceC5908d);
        }
        if (d10 != null || !((Boolean) interfaceC5908d.b(net.time4j.format.a.f57812k, Boolean.TRUE)).booleanValue()) {
            return d10;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        if (mVar2 == mVar) {
            mVar = m.STANDALONE;
        }
        Enum d11 = y(interfaceC5908d, mVar, false).d(charSequence, parsePosition, getType(), interfaceC5908d);
        if (d11 != null || !D()) {
            return d11;
        }
        parsePosition.setErrorIndex(-1);
        parsePosition.setIndex(index);
        return y(interfaceC5908d, mVar, true).d(charSequence, parsePosition, getType(), interfaceC5908d);
    }

    @Override // net.time4j.format.l
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public int j(Enum r12, o oVar, InterfaceC5908d interfaceC5908d) {
        return G(r12);
    }

    @Override // net.time4j.format.l
    public boolean N(q qVar, int i10) {
        for (Enum r42 : (Enum[]) getType().getEnumConstants()) {
            if (G(r42) == i10) {
                qVar.y(this, r42);
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.t
    public void Z(o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(y(interfaceC5908d, (m) interfaceC5908d.b(net.time4j.format.a.f57809h, m.FORMAT), B(oVar)).f((Enum) oVar.j(this)));
    }

    @Override // oi.p
    public Class getType() {
        return this.f58570d;
    }

    public s y(InterfaceC5908d interfaceC5908d, m mVar, boolean z10) {
        Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        net.time4j.format.v vVar = (net.time4j.format.v) interfaceC5908d.b(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
        net.time4j.format.b c10 = net.time4j.format.b.c(A(interfaceC5908d), locale);
        return D() ? z10 ? c10.g(vVar, mVar) : c10.l(vVar, mVar) : E() ? c10.p(vVar, mVar) : C() ? c10.b(vVar) : c10.n(name(), this.f58570d, new String[0]);
    }
}
