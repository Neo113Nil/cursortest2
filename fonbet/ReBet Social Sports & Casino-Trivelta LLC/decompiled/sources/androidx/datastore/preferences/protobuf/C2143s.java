package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143s {

    /* renamed from: d, reason: collision with root package name */
    public static final C2143s f19612d = new C2143s(true);

    /* renamed from: a, reason: collision with root package name */
    public final i0 f19613a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19614b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19615c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[r0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[r0.b.f19582c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19583d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19584e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19585f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19586g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19587h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19588i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19589j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19591l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19592m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19590k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19593n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19594o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19596q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19597r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19598s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19599t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19595p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        r0.b getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public C2143s() {
        this.f19613a = i0.q();
    }

    public static int b(r0.b bVar, int i10, Object obj) {
        int O10 = AbstractC2135j.O(i10);
        if (bVar == r0.b.f19591l) {
            O10 *= 2;
        }
        return O10 + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return AbstractC2135j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC2135j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC2135j.x(((Long) obj).longValue());
            case 4:
                return AbstractC2135j.S(((Long) obj).longValue());
            case 5:
                return AbstractC2135j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC2135j.o(((Long) obj).longValue());
            case 7:
                return AbstractC2135j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC2135j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC2135j.s((P) obj);
            case 10:
                return AbstractC2135j.A((P) obj);
            case 11:
                return obj instanceof AbstractC2132g ? AbstractC2135j.g((AbstractC2132g) obj) : AbstractC2135j.N((String) obj);
            case 12:
                return obj instanceof AbstractC2132g ? AbstractC2135j.g((AbstractC2132g) obj) : AbstractC2135j.e((byte[]) obj);
            case 13:
                return AbstractC2135j.Q(((Integer) obj).intValue());
            case 14:
                return AbstractC2135j.F(((Integer) obj).intValue());
            case 15:
                return AbstractC2135j.H(((Long) obj).longValue());
            case 16:
                return AbstractC2135j.J(((Integer) obj).intValue());
            case 17:
                return AbstractC2135j.L(((Long) obj).longValue());
            case 18:
                return AbstractC2135j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            return b(liteType, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.isPacked()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += b(liteType, number, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += c(liteType, list.get(i10));
            i10++;
        }
        return AbstractC2135j.O(number) + i12 + AbstractC2135j.Q(i12);
    }

    public static int i(r0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b bVar, Object obj) {
        AbstractC2149y.a(obj);
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[bVar.a().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC2132g) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof P)) {
                }
                break;
        }
        return false;
    }

    public static C2143s r() {
        return new C2143s();
    }

    public static void u(AbstractC2135j abstractC2135j, r0.b bVar, int i10, Object obj) {
        if (bVar == r0.b.f19591l) {
            abstractC2135j.q0(i10, (P) obj);
        } else {
            abstractC2135j.M0(i10, i(bVar, false));
            v(abstractC2135j, bVar, obj);
        }
    }

    public static void v(AbstractC2135j abstractC2135j, r0.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                abstractC2135j.h0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC2135j.p0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC2135j.x0(((Long) obj).longValue());
                break;
            case 4:
                abstractC2135j.Q0(((Long) obj).longValue());
                break;
            case 5:
                abstractC2135j.v0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC2135j.n0(((Long) obj).longValue());
                break;
            case 7:
                abstractC2135j.l0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC2135j.b0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC2135j.s0((P) obj);
                break;
            case 10:
                abstractC2135j.z0((P) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC2132g)) {
                    abstractC2135j.L0((String) obj);
                    break;
                } else {
                    abstractC2135j.f0((AbstractC2132g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC2132g)) {
                    abstractC2135j.c0((byte[]) obj);
                    break;
                } else {
                    abstractC2135j.f0((AbstractC2132g) obj);
                    break;
                }
            case 13:
                abstractC2135j.O0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC2135j.D0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC2135j.F0(((Long) obj).longValue());
                break;
            case 16:
                abstractC2135j.H0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC2135j.J0(((Long) obj).longValue());
                break;
            case 18:
                abstractC2135j.j0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2143s clone() {
        C2143s r10 = r();
        int k10 = this.f19613a.k();
        for (int i10 = 0; i10 < k10; i10++) {
            Map.Entry j10 = this.f19613a.j(i10);
            android.support.v4.media.session.b.a(j10.getKey());
            r10.s(null, j10.getValue());
        }
        for (Map.Entry entry : this.f19613a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            r10.s(null, entry.getValue());
        }
        r10.f19615c = this.f19615c;
        return r10;
    }

    public Iterator e() {
        return j() ? Collections.emptyIterator() : this.f19615c ? new B(this.f19613a.h().iterator()) : this.f19613a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2143s) {
            return this.f19613a.equals(((C2143s) obj).f19613a);
        }
        return false;
    }

    public int f() {
        int k10 = this.f19613a.k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += g(this.f19613a.j(i11));
        }
        Iterator it = this.f19613a.m().iterator();
        while (it.hasNext()) {
            i10 += g((Map.Entry) it.next());
        }
        return i10;
    }

    public final int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int k10 = this.f19613a.k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            Map.Entry j10 = this.f19613a.j(i11);
            android.support.v4.media.session.b.a(j10.getKey());
            i10 += d(null, j10.getValue());
        }
        for (Map.Entry entry : this.f19613a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i10 += d(null, entry.getValue());
        }
        return i10;
    }

    public int hashCode() {
        return this.f19613a.hashCode();
    }

    public boolean j() {
        return this.f19613a.isEmpty();
    }

    public boolean k() {
        int k10 = this.f19613a.k();
        for (int i10 = 0; i10 < k10; i10++) {
            if (!l(this.f19613a.j(i10))) {
                return false;
            }
        }
        Iterator it = this.f19613a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f19615c ? new B(this.f19613a.entrySet().iterator()) : this.f19613a.entrySet().iterator();
    }

    public void o() {
        if (this.f19614b) {
            return;
        }
        int k10 = this.f19613a.k();
        for (int i10 = 0; i10 < k10; i10++) {
            Map.Entry j10 = this.f19613a.j(i10);
            if (j10.getValue() instanceof AbstractC2147w) {
                ((AbstractC2147w) j10.getValue()).z();
            }
        }
        this.f19613a.p();
        this.f19614b = true;
    }

    public void p(C2143s c2143s) {
        int k10 = c2143s.f19613a.k();
        for (int i10 = 0; i10 < k10; i10++) {
            q(c2143s.f19613a.j(i10));
        }
        Iterator it = c2143s.f19613a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.isRepeated()) {
            t(bVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar, it.next());
            }
            obj = arrayList;
        }
        this.f19613a.r(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.getNumber()), bVar.getLiteType().a(), obj.getClass().getName()));
        }
    }

    public C2143s(boolean z10) {
        this(i0.q());
        o();
    }

    public C2143s(i0 i0Var) {
        this.f19613a = i0Var;
        o();
    }
}
