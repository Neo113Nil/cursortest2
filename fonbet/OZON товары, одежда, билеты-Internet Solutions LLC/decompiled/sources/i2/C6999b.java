package i2;

import B0.A0;
import N3.C3660k;
import androidx.annotation.NonNull;
import g.C6594f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C6999b extends C7000c {

    /* renamed from: e, reason: collision with root package name */
    ArrayList<C7000c> f65754e;

    public C6999b(char[] cArr) {
        super(cArr);
        this.f65754e = new ArrayList<>();
    }

    public final void A(String str, C7000c c7000c) {
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7001d c7001d = (C7001d) it.next();
            if (c7001d.b().equals(str)) {
                if (c7001d.f65754e.size() > 0) {
                    c7001d.f65754e.set(0, c7000c);
                    return;
                } else {
                    c7001d.f65754e.add(c7000c);
                    return;
                }
            }
        }
        C7001d c7001d2 = new C7001d(str.toCharArray());
        c7001d2.f65756b = 0L;
        c7001d2.h(str.length() - 1);
        if (c7001d2.f65754e.size() > 0) {
            c7001d2.f65754e.set(0, c7000c);
        } else {
            c7001d2.f65754e.add(c7000c);
        }
        this.f65754e.add(c7001d2);
    }

    public final void B(String str, String str2) {
        h hVar = new h(str2.toCharArray());
        hVar.f65756b = 0L;
        hVar.h(str2.length() - 1);
        A(str, hVar);
    }

    public final void clear() {
        this.f65754e.clear();
    }

    @Override // i2.C7000c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6999b) {
            return this.f65754e.equals(((C6999b) obj).f65754e);
        }
        return false;
    }

    public final float getFloat(int i11) throws g {
        C7000c l11 = l(i11);
        if (l11 != null) {
            return l11.c();
        }
        throw new g(Ej.b.a(i11, "no float at index "), this);
    }

    public final int getInt(int i11) throws g {
        C7000c l11 = l(i11);
        if (l11 != null) {
            return l11.e();
        }
        throw new g(Ej.b.a(i11, "no int at index "), this);
    }

    @Override // i2.C7000c
    public int hashCode() {
        return Objects.hash(this.f65754e, Integer.valueOf(super.hashCode()));
    }

    public final void i(C7000c c7000c) {
        this.f65754e.add(c7000c);
    }

    @Override // i2.C7000c
    @NonNull
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C6999b clone() {
        C6999b c6999b = (C6999b) super.a();
        ArrayList<C7000c> arrayList = new ArrayList<>(this.f65754e.size());
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7000c a11 = it.next().a();
            a11.f65758d = c6999b;
            arrayList.add(a11);
        }
        c6999b.f65754e = arrayList;
        return c6999b;
    }

    public final C7000c l(int i11) throws g {
        if (i11 < 0 || i11 >= this.f65754e.size()) {
            throw new g(Ej.b.a(i11, "no element at index "), this);
        }
        return this.f65754e.get(i11);
    }

    public final C7000c m(String str) throws g {
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7001d c7001d = (C7001d) it.next();
            if (c7001d.b().equals(str)) {
                if (c7001d.f65754e.size() > 0) {
                    return c7001d.f65754e.get(0);
                }
                return null;
            }
        }
        throw new g(A0.b("no element for key <", str, ">"), this);
    }

    public final C6998a n() throws g {
        C7000c m11 = m("ids");
        if (m11 instanceof C6998a) {
            return (C6998a) m11;
        }
        throw new g("no array found for key <ids>, found [" + m11.f() + "] : " + m11, this);
    }

    public final float o(String str) throws g {
        C7000c m11 = m(str);
        if (m11 != null) {
            return m11.c();
        }
        StringBuilder b11 = C6594f.b("no float found for key <", str, ">, found [");
        b11.append(m11.f());
        b11.append("] : ");
        b11.append(m11);
        throw new g(b11.toString(), this);
    }

    public final int q(String str) throws g {
        C7000c m11 = m(str);
        if (m11 != null) {
            return m11.e();
        }
        StringBuilder b11 = C6594f.b("no int found for key <", str, ">, found [");
        b11.append(m11.f());
        b11.append("] : ");
        b11.append(m11);
        throw new g(b11.toString(), this);
    }

    public final f r(String str) throws g {
        C7000c m11 = m(str);
        if (m11 instanceof f) {
            return (f) m11;
        }
        StringBuilder b11 = C6594f.b("no object found for key <", str, ">, found [");
        b11.append(m11.f());
        b11.append("] : ");
        b11.append(m11);
        throw new g(b11.toString(), this);
    }

    public final C7000c s(int i11) {
        if (i11 < 0 || i11 >= this.f65754e.size()) {
            return null;
        }
        return this.f65754e.get(i11);
    }

    public final int size() {
        return this.f65754e.size();
    }

    public final C7000c t(String str) {
        Iterator<C7000c> it = this.f65754e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C7001d c7001d = (C7001d) it.next();
            if (c7001d.b().equals(str)) {
                if (c7001d.f65754e.size() > 0) {
                    return c7001d.f65754e.get(0);
                }
            }
        }
        return null;
    }

    @Override // i2.C7000c
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7000c next = it.next();
            if (sb2.length() > 0) {
                sb2.append("; ");
            }
            sb2.append(next);
        }
        return super.toString() + " = <" + ((Object) sb2) + " >";
    }

    public final String u(int i11) throws g {
        C7000c l11 = l(i11);
        if (l11 instanceof h) {
            return l11.b();
        }
        throw new g(Ej.b.a(i11, "no string at index "), this);
    }

    public final String v(String str) throws g {
        C7000c m11 = m(str);
        if (m11 instanceof h) {
            return m11.b();
        }
        StringBuilder d11 = C3660k.d("no string found for key <", str, ">, found [", m11 != null ? m11.f() : null, "] : ");
        d11.append(m11);
        throw new g(d11.toString(), this);
    }

    public final String w(String str) {
        C7000c t2 = t(str);
        if (t2 instanceof h) {
            return t2.b();
        }
        return null;
    }

    public final boolean x(String str) {
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7000c next = it.next();
            if ((next instanceof C7001d) && ((C7001d) next).b().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<String> z() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C7000c> it = this.f65754e.iterator();
        while (it.hasNext()) {
            C7000c next = it.next();
            if (next instanceof C7001d) {
                arrayList.add(((C7001d) next).b());
            }
        }
        return arrayList;
    }
}
