package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f0 extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f17316c = new f0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.k
    public final l t(int i5) {
        if (i5 == 0) {
            return i0.BEFORE_BE;
        }
        if (i5 == 1) {
            return i0.BE;
        }
        throw new j$.time.b("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.k
    public final String l() {
        return "buddhist";
    }

    @Override // j$.time.chrono.k
    public final b I(int i5, int i10, int i11) {
        return new h0(j$.time.g.Z(i5 - 543, i10, i11));
    }

    @Override // j$.time.chrono.k
    public final b m(int i5, int i10) {
        return new h0(j$.time.g.b0(i5 - 543, i10));
    }

    @Override // j$.time.chrono.k
    public final b h(long j) {
        return new h0(j$.time.g.a0(j));
    }

    @Override // j$.time.chrono.a
    public final b j() {
        return new h0(j$.time.g.R(j$.time.g.Y(j$.com.android.tools.r8.a.Y())));
    }

    @Override // j$.time.chrono.k
    public final b A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof h0) {
            return (h0) temporalAccessor;
        }
        return new h0(j$.time.g.R(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final boolean O(long j) {
        return r.f17346c.O(j - 543);
    }

    @Override // j$.time.chrono.k
    public final int u(l lVar, int i5) {
        if (lVar instanceof i0) {
            return lVar == i0.BE ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    private f0() {
    }

    @Override // j$.time.chrono.k
    public final List s() {
        return j$.com.android.tools.r8.a.O(i0.values());
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s q(j$.time.temporal.a aVar) {
        int i5 = e0.f17313a[aVar.ordinal()];
        if (i5 == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.f17512b;
            return j$.time.temporal.s.f(sVar.f17537a + 6516, sVar.f17540d + 6516);
        }
        if (i5 == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.f17512b;
            return j$.time.temporal.s.g(1L, (-(sVar2.f17537a + 543)) + 1, sVar2.f17540d + 543);
        }
        if (i5 != 3) {
            return aVar.f17512b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.f17512b;
        return j$.time.temporal.s.f(sVar3.f17537a + 543, sVar3.f17540d + 543);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final b K(Map map, j$.time.format.e0 e0Var) {
        return (h0) super.K(map, e0Var);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
