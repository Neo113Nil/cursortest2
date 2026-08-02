package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f17570e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f17571a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f17572b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f17573c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f17574d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f17571a, ((b) obj).f17571a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f17571a = j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
        this.f17572b = localDateTime;
        this.f17573c = zoneOffset;
        this.f17574d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f17571a = j;
        this.f17572b = LocalDateTime.ofEpochSecond(j, 0, zoneOffset);
        this.f17573c = zoneOffset;
        this.f17574d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean i() {
        return this.f17574d.f17297b > this.f17573c.f17297b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f17571a == bVar.f17571a && this.f17573c.equals(bVar.f17573c) && this.f17574d.equals(bVar.f17574d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17572b.hashCode() ^ this.f17573c.f17297b) ^ Integer.rotateLeft(this.f17574d.f17297b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(i() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f17572b);
        sb2.append(this.f17573c);
        sb2.append(" to ");
        sb2.append(this.f17574d);
        sb2.append(']');
        return sb2.toString();
    }
}
