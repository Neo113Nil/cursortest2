package net.time4j.history;

import com.facebook.hermes.intl.Constants;
import java.io.DataInput;
import java.io.DataOutput;
import net.time4j.F;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f58189d = new g();

    /* renamed from: e, reason: collision with root package name */
    public static final h f58190e = h.g(j.AD, 1, 1, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final h f58191f = h.g(j.BC, 38, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final F f58192g = F.A0(2000, 1);

    /* renamed from: a, reason: collision with root package name */
    public final j f58193a;

    /* renamed from: b, reason: collision with root package name */
    public final F f58194b;

    /* renamed from: c, reason: collision with root package name */
    public final F f58195c;

    public g() {
        this.f58193a = null;
        this.f58194b = (F) F.l0().J();
        this.f58195c = (F) F.l0().I();
    }

    public static g a(F f10, F f11) {
        return new g(j.AB_URBE_CONDITA, f10, f11);
    }

    public static g b(F f10, F f11) {
        return new g(j.BYZANTINE, f10, f11);
    }

    public static g c(F f10) {
        return b((F) F.l0().J(), f10);
    }

    public static g e(F f10, F f11) {
        return new g(j.HISPANIC, f10, f11);
    }

    public static g f(F f10) {
        return e((F) F.l0().J(), f10);
    }

    public static g g(DataInput dataInput) {
        if (dataInput.readByte() != Byte.MAX_VALUE) {
            return f58189d;
        }
        j valueOf = j.valueOf(dataInput.readUTF());
        long readLong = dataInput.readLong();
        long readLong2 = dataInput.readLong();
        F f10 = f58192g;
        EnumC5900A enumC5900A = EnumC5900A.MODIFIED_JULIAN_DATE;
        return new g(valueOf, (F) f10.x(enumC5900A, readLong), (F) f10.x(enumC5900A, readLong2));
    }

    public j d(h hVar, F f10) {
        return (this.f58193a == null || f10.K(this.f58194b) || f10.J(this.f58195c)) ? hVar.compareTo(f58190e) < 0 ? j.BC : j.AD : (this.f58193a != j.HISPANIC || hVar.compareTo(f58191f) >= 0) ? this.f58193a : j.BC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            g gVar2 = f58189d;
            if (this == gVar2) {
                return gVar == gVar2;
            }
            if (this.f58193a == gVar.f58193a && this.f58194b.equals(gVar.f58194b) && this.f58195c.equals(gVar.f58195c)) {
                return true;
            }
        }
        return false;
    }

    public void h(DataOutput dataOutput) {
        if (this == f58189d) {
            dataOutput.writeByte(0);
            return;
        }
        dataOutput.writeByte(127);
        dataOutput.writeUTF(this.f58193a.name());
        F f10 = this.f58194b;
        EnumC5900A enumC5900A = EnumC5900A.MODIFIED_JULIAN_DATE;
        dataOutput.writeLong(((Long) f10.j(enumC5900A)).longValue());
        dataOutput.writeLong(((Long) this.f58195c.j(enumC5900A)).longValue());
    }

    public int hashCode() {
        return (this.f58193a.hashCode() * 17) + (this.f58194b.hashCode() * 31) + (this.f58195c.hashCode() * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this == f58189d) {
            sb2.append(Constants.COLLATION_DEFAULT);
        } else {
            sb2.append("era->");
            sb2.append(this.f58193a);
            sb2.append(",start->");
            sb2.append(this.f58194b);
            sb2.append(",end->");
            sb2.append(this.f58195c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public g(j jVar, F f10, F f11) {
        if (jVar.compareTo(j.AD) > 0) {
            if (!f11.K(f10)) {
                this.f58193a = jVar;
                this.f58194b = f10;
                this.f58195c = f11;
                return;
            } else {
                throw new IllegalArgumentException("End before start: " + f10 + "/" + f11);
            }
        }
        throw new UnsupportedOperationException(jVar.name());
    }
}
