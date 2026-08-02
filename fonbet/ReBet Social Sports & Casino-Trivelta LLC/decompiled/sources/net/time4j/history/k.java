package net.time4j.history;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.F;
import net.time4j.format.s;
import net.time4j.format.t;
import net.time4j.format.v;
import oi.AbstractC5909e;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.q;
import oi.r;
import oi.x;
import oi.z;

/* loaded from: classes5.dex */
public final class k extends net.time4j.format.d implements t {

    /* renamed from: b, reason: collision with root package name */
    public static final Locale f58219b = new Locale("la");
    private static final long serialVersionUID = 5200533417265981438L;
    private final d history;

    public static class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final d f58220a;

        public a(d dVar) {
            this.f58220a = dVar;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(q qVar) {
            throw new UnsupportedOperationException("Never called.");
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public j e(q qVar) {
            j p10 = p(qVar);
            return p10 == j.BC ? j.AD : p10;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public j i(q qVar) {
            j p10 = p(qVar);
            return p10 == j.AD ? j.BC : p10;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public j p(q qVar) {
            try {
                return this.f58220a.e((F) qVar.j(F.f57535m)).c();
            } catch (IllegalArgumentException e10) {
                throw new r(e10.getMessage(), e10);
            }
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public q q(q qVar, j jVar, boolean z10) {
            if (jVar == null) {
                throw new IllegalArgumentException("Missing era value.");
            }
            if (this.f58220a.e((F) qVar.j(F.f57535m)).c() == jVar) {
                return qVar;
            }
            throw new IllegalArgumentException(jVar.name());
        }

        @Override // oi.z
        public boolean isValid(q qVar, j jVar) {
            if (jVar == null) {
                return false;
            }
            return this.f58220a.e((F) qVar.j(F.f57535m)).c() == jVar;
        }
    }

    public k(d dVar) {
        super("ERA");
        this.history = dVar;
    }

    private Object readResolve() {
        return this.history.i();
    }

    private s x(InterfaceC5908d interfaceC5908d) {
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57808g;
        v vVar = v.WIDE;
        v vVar2 = (v) interfaceC5908d.b(interfaceC5907c, vVar);
        InterfaceC5907c interfaceC5907c2 = net.time4j.history.internal.a.f58203c;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) interfaceC5908d.b(interfaceC5907c2, bool)).booleanValue()) {
            return net.time4j.format.b.c("historic", f58219b).o(this, vVar2 == vVar ? "w" : "a");
        }
        net.time4j.format.b d10 = net.time4j.format.b.d((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT));
        if (((Boolean) interfaceC5908d.b(net.time4j.history.internal.a.f58202b, bool)).booleanValue()) {
            return d10.o(this, vVar2 == vVar ? "w" : "a", "alt");
        }
        return d10.b(vVar2);
    }

    @Override // net.time4j.format.t
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        return (j) x(interfaceC5908d).d(charSequence, parsePosition, getType(), interfaceC5908d);
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(x(interfaceC5908d).f((Enum) oVar.j(this)));
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return 'G';
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return j.class;
    }

    @Override // oi.AbstractC5909e
    public z r(x xVar) {
        if (xVar.x(F.f57535m)) {
            return new a(this.history);
        }
        return null;
    }

    @Override // oi.AbstractC5909e
    public boolean s(AbstractC5909e abstractC5909e) {
        return this.history.equals(((k) abstractC5909e).history);
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public j c() {
        return j.AD;
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public j d0() {
        return j.BC;
    }
}
