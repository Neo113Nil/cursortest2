package mi;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Map;
import net.time4j.B;
import net.time4j.format.t;
import net.time4j.format.v;
import oi.InterfaceC5908d;
import pi.AbstractC6082b;
import pi.InterfaceC6081a;

/* loaded from: classes5.dex */
public class e implements t, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final e f56630a = new e();
    private static final long serialVersionUID = -5874268477318061153L;

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        f fVar = (f) oVar.j(this);
        if (interfaceC5908d.c(InterfaceC6081a.f63225N4)) {
            appendable.append(fVar.b(locale, (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a), interfaceC5908d));
            return;
        }
        v vVar = (v) interfaceC5908d.b(net.time4j.format.a.f57808g, v.WIDE);
        net.time4j.format.m mVar = (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT);
        appendable.append((fVar.c() ? net.time4j.format.b.c("chinese", locale).g(vVar, mVar) : net.time4j.format.b.c("chinese", locale).l(vVar, mVar)).f(B.d(fVar.getNumber())));
    }

    @Override // oi.p
    public char a() {
        return 'M';
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        return ((f) oVar.j(this)).compareTo((f) oVar2.j(this));
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f c() {
        return f.d(12);
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f d0() {
        return f.d(1);
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
        return f.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    @Override // net.time4j.format.t
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        boolean z10;
        f d10;
        boolean z11;
        int i10;
        boolean z12;
        net.time4j.format.j jVar;
        Locale locale = (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        int length = charSequence.length();
        int index = parsePosition.getIndex();
        f fVar = null;
        if (index >= length) {
            parsePosition.setErrorIndex(length);
            return null;
        }
        int i11 = 0;
        if (interfaceC5908d.c(InterfaceC6081a.f63225N4)) {
            Map m10 = net.time4j.format.b.c("generic", locale).m();
            net.time4j.format.j jVar2 = (net.time4j.format.j) interfaceC5908d.b(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
            char charValue = ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, Character.valueOf(jVar2.j().charAt(0)))).charValue();
            boolean booleanValue = ((Boolean) interfaceC5908d.b(f.f56632b, Boolean.valueOf("R".equals(m10.get("leap-alignment"))))).booleanValue();
            char charValue2 = ((Character) interfaceC5908d.b(f.f56631a, Character.valueOf(((String) m10.get("leap-indicator")).charAt(0)))).charValue();
            if (booleanValue || charSequence.charAt(index) != charValue2) {
                i10 = index;
                z12 = false;
            } else {
                i10 = index + 1;
                z12 = true;
            }
            if (jVar2.l()) {
                while (i10 < length && charSequence.charAt(i10) == charValue) {
                    i10++;
                }
            }
            int i12 = 12;
            int i13 = 0;
            for (int i14 = 1; i12 >= i14 && i13 == 0; i14 = 1) {
                String a10 = AbstractC6082b.a(jVar2, charValue, i12);
                f fVar2 = fVar;
                int length2 = a10.length();
                while (true) {
                    int i15 = i10 + i11;
                    if (length > i15) {
                        jVar = jVar2;
                        if (charSequence.charAt(i15) != a10.charAt(i11)) {
                            break;
                        }
                    } else {
                        jVar = jVar2;
                    }
                    i11++;
                    if (i11 == length2) {
                        i10 += length2;
                        i13 = i12;
                        break;
                    }
                    jVar2 = jVar;
                }
                i12--;
                fVar = fVar2;
                jVar2 = jVar;
                i11 = 0;
            }
            f fVar3 = fVar;
            if (i13 == 0) {
                parsePosition.setErrorIndex(index);
                return fVar3;
            }
            if (booleanValue && length > i10 && charSequence.charAt(i10) == charValue2) {
                i10++;
                z11 = true;
            } else {
                z11 = z12;
            }
            d10 = f.d(i13);
            parsePosition.setIndex(i10);
        } else {
            v vVar = (v) interfaceC5908d.b(net.time4j.format.a.f57808g, v.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) interfaceC5908d.b(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT);
            B b10 = (B) net.time4j.format.b.c("chinese", locale).l(vVar, mVar).d(charSequence, parsePosition, B.class, interfaceC5908d);
            if (b10 == null) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                b10 = (B) net.time4j.format.b.c("chinese", locale).g(vVar, mVar).d(charSequence, parsePosition, B.class, interfaceC5908d);
                if (b10 != null) {
                    z10 = true;
                    if (b10 != null) {
                        parsePosition.setErrorIndex(index);
                        return null;
                    }
                    d10 = f.d(b10.b());
                    z11 = z10;
                }
            }
            z10 = false;
            if (b10 != null) {
            }
        }
        return z11 ? d10.e() : d10;
    }

    @Override // oi.p
    public String name() {
        return "MONTH_OF_YEAR";
    }

    public Object readResolve() {
        return f56630a;
    }
}
