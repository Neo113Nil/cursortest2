package mi;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.format.t;
import oi.InterfaceC5908d;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: mi.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5592c implements t, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C5592c f56617a = new C5592c();
    private static final long serialVersionUID = -4211396220263977858L;

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // net.time4j.format.t
    public void Z(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d) {
        appendable.append(((C5591b) oVar.j(this)).g((Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT)));
    }

    @Override // oi.p
    public char a() {
        return Matrix.MATRIX_TYPE_RANDOM_UT;
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        return ((C5591b) oVar.j(this)).compareTo((m) oVar2.j(this));
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5591b c() {
        return C5591b.n(60);
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C5591b d0() {
        return C5591b.n(1);
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
        return C5591b.class;
    }

    @Override // net.time4j.format.t
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5591b a0(CharSequence charSequence, ParsePosition parsePosition, InterfaceC5908d interfaceC5908d) {
        return C5591b.o(charSequence, parsePosition, (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), !((net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART)).c());
    }

    @Override // oi.p
    public String name() {
        return "CYCLIC_YEAR";
    }

    public Object readResolve() {
        return f56617a;
    }
}
