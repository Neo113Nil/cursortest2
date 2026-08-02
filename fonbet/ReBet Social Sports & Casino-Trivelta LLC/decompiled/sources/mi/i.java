package mi;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.EnumC5706f;
import net.time4j.F;
import net.time4j.InterfaceC5705e;
import net.time4j.format.t;
import net.time4j.format.v;
import oi.InterfaceC5908d;
import oi.InterfaceC5913i;
import oi.x;
import oi.z;

/* loaded from: classes5.dex */
public enum i implements InterfaceC5913i {
    DANGI;


    /* renamed from: a, reason: collision with root package name */
    public final transient oi.p f56636a;

    /* renamed from: b, reason: collision with root package name */
    public final transient oi.p f56637b;

    public static class b extends net.time4j.format.d implements t {
        private static final long serialVersionUID = -5179188137244162427L;

        private Object readResolve() {
            return i.DANGI.a();
        }

        @Override // oi.p
        public boolean Y() {
            return true;
        }

        @Override // net.time4j.format.t
        public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
            appendable.append(i.DANGI.b((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), (v) interfaceC5908d.b(net.time4j.format.a.f57808g, v.WIDE)));
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
            return i.class;
        }

        @Override // oi.AbstractC5909e
        public z r(x xVar) {
            if (xVar.x(F.f57535m)) {
                return new c();
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean w() {
            return true;
        }

        @Override // oi.p
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public i c() {
            return i.DANGI;
        }

        @Override // oi.p
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public i d0() {
            return i.DANGI;
        }

        @Override // net.time4j.format.t
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public i a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
            Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
            boolean booleanValue = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue();
            boolean booleanValue2 = ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57811j, Boolean.FALSE)).booleanValue();
            v vVar = (v) interfaceC5908d.b(net.time4j.format.a.f57808g, v.WIDE);
            int index = parsePosition.getIndex();
            i iVar = i.DANGI;
            String b10 = iVar.b(locale, vVar);
            int max = Math.max(Math.min(b10.length() + index, charSequence.length()), index);
            if (max > index) {
                String charSequence2 = charSequence.subSequence(index, max).toString();
                if (booleanValue) {
                    b10 = b10.toLowerCase(locale);
                    charSequence2 = charSequence2.toLowerCase(locale);
                }
                if (b10.equals(charSequence2) || (booleanValue2 && b10.startsWith(charSequence2))) {
                    parsePosition.setIndex(max);
                    return iVar;
                }
            }
            parsePosition.setErrorIndex(index);
            return null;
        }

        public b() {
            super("ERA");
        }
    }

    public static class c implements z {
        public c() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public i e(oi.q qVar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public i i(oi.q qVar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public i p(oi.q qVar) {
            return i.DANGI;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, i iVar, boolean z10) {
            if (isValid(qVar, iVar)) {
                return qVar;
            }
            throw new IllegalArgumentException("Invalid Korean era: " + iVar);
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, i iVar) {
            return iVar == i.DANGI;
        }
    }

    public static class d implements z {
        public d() {
        }

        private int f(oi.q qVar) {
            return ((F) qVar.j(F.f57535m)).n() + 2333;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(oi.q qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(oi.q qVar) {
            throw new AbstractMethodError("Never called.");
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(oi.q qVar) {
            return 1000002332;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(oi.q qVar) {
            return -999997666;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(oi.q qVar) {
            return Integer.valueOf(f(qVar));
        }

        @Override // oi.z
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public oi.q q(oi.q qVar, Integer num, boolean z10) {
            if (num == null) {
                throw new IllegalArgumentException("Missing year of era.");
            }
            if (isValid(qVar, num)) {
                int f10 = f(qVar);
                InterfaceC5705e interfaceC5705e = F.f57535m;
                return qVar.y(interfaceC5705e, (F) ((F) qVar.j(interfaceC5705e)).E(num.intValue() - f10, EnumC5706f.f57794d));
            }
            throw new IllegalArgumentException("Invalid year of era: " + num);
        }

        @Override // oi.z
        public boolean isValid(oi.q qVar, Integer num) {
            if (num == null) {
                return false;
            }
            return num.intValue() >= i(qVar).intValue() && num.intValue() <= e(qVar).intValue();
        }
    }

    public static class e extends net.time4j.format.d {
        private static final long serialVersionUID = -7864513245908399367L;

        private Object readResolve() {
            return i.DANGI.c();
        }

        @Override // oi.p
        public boolean Y() {
            return true;
        }

        @Override // oi.AbstractC5909e, oi.p
        public char a() {
            return 'y';
        }

        @Override // oi.p
        public boolean e0() {
            return false;
        }

        @Override // oi.p
        public Class getType() {
            return Integer.class;
        }

        @Override // oi.AbstractC5909e
        public z r(x xVar) {
            if (xVar.x(F.f57535m)) {
                return new d();
            }
            return null;
        }

        @Override // oi.AbstractC5909e
        public boolean w() {
            return true;
        }

        @Override // oi.p
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Integer c() {
            return 5332;
        }

        @Override // oi.p
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer d0() {
            return 3978;
        }

        public e() {
            super("YEAR_OF_ERA");
        }
    }

    i() {
        this.f56636a = new b();
        this.f56637b = new e();
    }

    public oi.p a() {
        return this.f56636a;
    }

    public String b(Locale locale, v vVar) {
        return net.time4j.format.b.c("dangi", locale).b(vVar).f(this);
    }

    public oi.p c() {
        return this.f56637b;
    }
}
