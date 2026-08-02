package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public final class n implements o, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Map f58400c = new HashMap();
    private static final long serialVersionUID = 1790434289322009750L;

    /* renamed from: a, reason: collision with root package name */
    public final transient b f58401a;

    /* renamed from: b, reason: collision with root package name */
    public final transient g f58402b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$tz$GapResolver;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$net$time4j$tz$GapResolver = iArr;
            try {
                iArr[b.PUSH_FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$tz$GapResolver[b.NEXT_VALID_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$tz$GapResolver[b.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        for (b bVar : b.values()) {
            for (g gVar : g.values()) {
                f58400c.put(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()), new n(bVar, gVar));
            }
        }
    }

    public n(b bVar, g gVar) {
        this.f58401a = bVar;
        this.f58402b = gVar;
    }

    public static n d(b bVar, g gVar) {
        return (n) f58400c.get(Integer.valueOf((bVar.ordinal() * 2) + gVar.ordinal()));
    }

    public static void e(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g, l lVar) {
        throw new IllegalArgumentException("Invalid local timestamp due to timezone transition: local-date=" + interfaceC5467a + ", local-time=" + interfaceC5473g + " [" + lVar.z().a() + "]");
    }

    public static long f(int i10, int i11, int i12, int i13, int i14, int i15) {
        return AbstractC5469c.i(AbstractC5469c.m(AbstractC5468b.i(i10, i11, i12), 40587L), 86400L) + (i13 * 3600) + (i14 * 60) + i15;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 13);
    }

    @Override // net.time4j.tz.o
    public o a(g gVar) {
        return gVar == this.f58402b ? this : this.f58401a.a(gVar);
    }

    @Override // net.time4j.tz.o
    public long b(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g, l lVar) {
        int i10;
        int i11;
        long f10;
        int j10;
        long f11;
        int i12;
        b bVar;
        int n10 = interfaceC5467a.n();
        int o10 = interfaceC5467a.o();
        int p10 = interfaceC5467a.p();
        int q10 = interfaceC5473g.q();
        int l10 = interfaceC5473g.l();
        int i13 = interfaceC5473g.i();
        m y10 = lVar.y();
        if (y10 == null && this.f58402b == g.LATER_OFFSET && ((bVar = this.f58401a) == b.PUSH_FORWARD || bVar == b.ABORT)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(lVar.z().a()));
            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(n10, o10 - 1, p10, q10, l10, i13);
            int i14 = gregorianCalendar.get(1);
            int i15 = gregorianCalendar.get(2) + 1;
            int i16 = gregorianCalendar.get(5);
            int i17 = gregorianCalendar.get(11);
            int i18 = gregorianCalendar.get(12);
            int i19 = gregorianCalendar.get(13);
            if (this.f58401a == b.ABORT && (n10 != i14 || o10 != i15 || p10 != i16 || q10 != i17 || l10 != i18 || i13 != i19)) {
                e(interfaceC5467a, interfaceC5473g, lVar);
            }
            f10 = f(i14, i15, i16, i17, i18, i19);
            j10 = lVar.A(interfaceC5467a, interfaceC5473g).j();
        } else {
            if (y10 == null) {
                throw new UnsupportedOperationException("Timezone provider does not expose its transition history.");
            }
            q a10 = y10.a(interfaceC5467a, interfaceC5473g);
            if (a10 != null) {
                if (a10.j()) {
                    int i20 = a.$SwitchMap$net$time4j$tz$GapResolver[this.f58401a.ordinal()];
                    if (i20 == 1) {
                        f11 = f(n10, o10, p10, q10, l10, i13) + a10.g();
                        i12 = a10.i();
                    } else {
                        if (i20 == 2) {
                            return a10.e();
                        }
                        if (i20 != 3) {
                            throw new UnsupportedOperationException(this.f58401a.name());
                        }
                        e(interfaceC5467a, interfaceC5473g, lVar);
                    }
                } else {
                    i10 = q10;
                    i11 = o10;
                    if (a10.k()) {
                        f11 = f(n10, i11, p10, i10, l10, i13);
                        i12 = a10.i();
                        if (this.f58402b == g.EARLIER_OFFSET) {
                            i12 = a10.f();
                        }
                    }
                    f10 = f(n10, i11, p10, i10, l10, i13);
                    j10 = ((p) y10.c(interfaceC5467a, interfaceC5473g).get(0)).j();
                }
                return f11 - i12;
            }
            i10 = q10;
            i11 = o10;
            f10 = f(n10, i11, p10, i10, l10, i13);
            j10 = ((p) y10.c(interfaceC5467a, interfaceC5473g).get(0)).j();
        }
        return f10 - j10;
    }

    public int c() {
        return (this.f58401a.ordinal() * 2) + this.f58402b.ordinal();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(n.class.getName());
        sb2.append(":[gap=");
        sb2.append(this.f58401a);
        sb2.append(",overlap=");
        sb2.append(this.f58402b);
        sb2.append(']');
        return sb2.toString();
    }
}
