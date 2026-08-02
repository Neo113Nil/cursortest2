package W1;

import W1.c;
import b1.C2334C;
import com.google.common.collect.AbstractC3436p;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f12968a;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator f12969d = new Comparator() { // from class: W1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10;
                i10 = AbstractC3436p.j().e(r1.f12970a, r2.f12970a).e(r1.f12971b, r2.f12971b).d(((c.a) obj).f12972c, ((c.a) obj2).f12972c).i();
                return i10;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f12970a;

        /* renamed from: b, reason: collision with root package name */
        public final long f12971b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12972c;

        public a(long j10, long j11, int i10) {
            AbstractC4134a.a(j10 < j11);
            this.f12970a = j10;
            this.f12971b = j11;
            this.f12972c = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f12970a == aVar.f12970a && this.f12971b == aVar.f12971b && this.f12972c == aVar.f12972c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f12970a), Long.valueOf(this.f12971b), Integer.valueOf(this.f12972c));
        }

        public String toString() {
            return Z.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f12970a), Long.valueOf(this.f12971b), Integer.valueOf(this.f12972c));
        }
    }

    public c(List list) {
        this.f12968a = list;
        AbstractC4134a.a(!d(list));
    }

    public static boolean d(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = ((a) list.get(0)).f12971b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (((a) list.get(i10)).f12970a < j10) {
                return true;
            }
            j10 = ((a) list.get(i10)).f12971b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f12968a.equals(((c) obj).f12968a);
    }

    public int hashCode() {
        return this.f12968a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f12968a;
    }
}
