package c4;

import j3.t;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import m3.N;

/* loaded from: classes8.dex */
public final class b implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f56486a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f56487a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56488b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56489c;

        public a(int i11, long j11, long j12) {
            G10.a.c(j11 < j12);
            this.f56487a = j11;
            this.f56488b = j12;
            this.f56489c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f56487a == aVar.f56487a && this.f56488b == aVar.f56488b && this.f56489c == aVar.f56489c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.f56487a), Long.valueOf(this.f56488b), Integer.valueOf(this.f56489c));
        }

        public final String toString() {
            int i11 = N.f74289a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + this.f56487a + ", endTimeMs=" + this.f56488b + ", speedDivisor=" + this.f56489c;
        }
    }

    public b(ArrayList arrayList) {
        this.f56486a = arrayList;
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            long j11 = ((a) arrayList.get(0)).f56488b;
            int i11 = 1;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (((a) arrayList.get(i11)).f56487a < j11) {
                    z11 = true;
                    break;
                } else {
                    j11 = ((a) arrayList.get(i11)).f56488b;
                    i11++;
                }
            }
        }
        G10.a.c(!z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f56486a.equals(((b) obj).f56486a);
    }

    public final int hashCode() {
        return this.f56486a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f56486a;
    }
}
