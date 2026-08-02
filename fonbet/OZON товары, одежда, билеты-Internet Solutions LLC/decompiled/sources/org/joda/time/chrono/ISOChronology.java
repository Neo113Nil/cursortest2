package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.AssembledChronology;

/* loaded from: classes6.dex */
public final class ISOChronology extends AssembledChronology {

    /* renamed from: K, reason: collision with root package name */
    private static final ISOChronology f79164K;

    /* renamed from: L, reason: collision with root package name */
    private static final ConcurrentHashMap<DateTimeZone, ISOChronology> f79165L;
    private static final long serialVersionUID = -6212696554273812441L;

    /* loaded from: classes10.dex */
    private static final class Stub implements Serializable {
        private static final long serialVersionUID = -6212696554273812441L;

        /* renamed from: a, reason: collision with root package name */
        private transient DateTimeZone f79166a;

        Stub(DateTimeZone dateTimeZone) {
            this.f79166a = dateTimeZone;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            this.f79166a = (DateTimeZone) objectInputStream.readObject();
        }

        private Object readResolve() {
            return ISOChronology.h0(this.f79166a);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeObject(this.f79166a);
        }
    }

    static {
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = new ConcurrentHashMap<>();
        f79165L = concurrentHashMap;
        ISOChronology iSOChronology = new ISOChronology(GregorianChronology.L0(), null);
        f79164K = iSOChronology;
        concurrentHashMap.put(DateTimeZone.f78989a, iSOChronology);
    }

    public static ISOChronology g0() {
        return h0(DateTimeZone.g());
    }

    public static ISOChronology h0(DateTimeZone dateTimeZone) {
        ISOChronology putIfAbsent;
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        ConcurrentHashMap<DateTimeZone, ISOChronology> concurrentHashMap = f79165L;
        ISOChronology iSOChronology = concurrentHashMap.get(dateTimeZone);
        return (iSOChronology != null || (putIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZone, (iSOChronology = new ISOChronology(ZonedChronology.i0(f79164K, dateTimeZone), null)))) == null) ? iSOChronology : putIfAbsent;
    }

    public static ISOChronology i0() {
        return f79164K;
    }

    private Object writeReplace() {
        return new Stub(y());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.a
    public final org.joda.time.a W() {
        return f79164K;
    }

    @Override // org.joda.time.a
    public final org.joda.time.a X(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.g();
        }
        return dateTimeZone == y() ? this : h0(dateTimeZone);
    }

    @Override // org.joda.time.chrono.AssembledChronology
    protected final void c0(AssembledChronology.a aVar) {
        if (d0().y() == DateTimeZone.f78989a) {
            org.joda.time.b bVar = m.f79209c;
            DateTimeFieldType G11 = DateTimeFieldType.G();
            org.joda.time.field.c cVar = new org.joda.time.field.c((org.joda.time.field.b) bVar, bVar.B(), G11);
            aVar.f79096H = cVar;
            aVar.f79108k = cVar.n();
            aVar.f79095G = new org.joda.time.field.g((org.joda.time.field.c) aVar.f79096H, DateTimeFieldType.f0());
            aVar.f79091C = new org.joda.time.field.g((org.joda.time.field.c) aVar.f79096H, aVar.f79105h, DateTimeFieldType.d0());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ISOChronology) {
            return y().equals(((ISOChronology) obj).y());
        }
        return false;
    }

    public final int hashCode() {
        return y().hashCode() + 800855;
    }

    @Override // org.joda.time.a
    public final String toString() {
        DateTimeZone y11 = y();
        if (y11 == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + y11.h() + ']';
    }
}
