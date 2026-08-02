package jZ;

import G.g;
import P4.f;
import Pk0.c;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.NetworkConnectionType;

/* renamed from: jZ.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7320a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f69535a;

    /* renamed from: jZ.a$a, reason: collision with other inner class name */
    public static final class C1133a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f69536a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f69537b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final b f69538c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final NetworkConnectionType f69539d;

        public C1133a(@NotNull String popId, @NotNull String fileId, @NotNull b timeMetrics, @NotNull NetworkConnectionType connectionType) {
            Intrinsics.checkNotNullParameter(popId, "popId");
            Intrinsics.checkNotNullParameter(fileId, "fileId");
            Intrinsics.checkNotNullParameter(timeMetrics, "timeMetrics");
            Intrinsics.checkNotNullParameter(connectionType, "connectionType");
            this.f69536a = popId;
            this.f69537b = fileId;
            this.f69538c = timeMetrics;
            this.f69539d = connectionType;
        }

        @NotNull
        public final NetworkConnectionType a() {
            return this.f69539d;
        }

        @NotNull
        public final String b() {
            return this.f69537b;
        }

        @NotNull
        public final String c() {
            return this.f69536a;
        }

        @NotNull
        public final b d() {
            return this.f69538c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1133a)) {
                return false;
            }
            C1133a c1133a = (C1133a) obj;
            return Intrinsics.d(this.f69536a, c1133a.f69536a) && Intrinsics.d(this.f69537b, c1133a.f69537b) && Intrinsics.d(this.f69538c, c1133a.f69538c) && this.f69539d == c1133a.f69539d;
        }

        public final int hashCode() {
            return this.f69539d.hashCode() + ((this.f69538c.hashCode() + g.a(this.f69536a.hashCode() * 31, 31, this.f69537b)) * 31);
        }

        @NotNull
        public final String toString() {
            return "Event(popId=" + this.f69536a + ", fileId=" + this.f69537b + ", timeMetrics=" + this.f69538c + ", connectionType=" + this.f69539d + ")";
        }
    }

    /* renamed from: jZ.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f69540a;

        /* renamed from: b, reason: collision with root package name */
        private final long f69541b;

        /* renamed from: c, reason: collision with root package name */
        private final long f69542c;

        /* renamed from: d, reason: collision with root package name */
        private final long f69543d;

        /* renamed from: e, reason: collision with root package name */
        private final long f69544e;

        public b(long j11, long j12, long j13, long j14, long j15) {
            this.f69540a = j11;
            this.f69541b = j12;
            this.f69542c = j13;
            this.f69543d = j14;
            this.f69544e = j15;
        }

        public final long a() {
            return this.f69540a;
        }

        public final long b() {
            return this.f69541b;
        }

        public final long c() {
            return this.f69542c;
        }

        public final long d() {
            return this.f69543d;
        }

        public final long e() {
            return this.f69544e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f69540a == bVar.f69540a && this.f69541b == bVar.f69541b && this.f69542c == bVar.f69542c && this.f69543d == bVar.f69543d && this.f69544e == bVar.f69544e;
        }

        public final int hashCode() {
            return Long.hashCode(this.f69544e) + c.a(c.a(c.a(Long.hashCode(this.f69540a) * 31, 31, this.f69541b), 31, this.f69542c), 31, this.f69543d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TimeMetrics(dnsNs=");
            sb2.append(this.f69540a);
            sb2.append(", tcpNs=");
            sb2.append(this.f69541b);
            sb2.append(", tlsNs=");
            sb2.append(this.f69542c);
            sb2.append(", ttfbNs=");
            sb2.append(this.f69543d);
            sb2.append(", ttlbNs=");
            return f.a(this.f69544e, ")", sb2);
        }
    }

    public C7320a(@NotNull ArrayList events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f69535a = events;
    }

    @NotNull
    public final List<C1133a> a() {
        return this.f69535a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7320a) && this.f69535a.equals(((C7320a) obj).f69535a);
    }

    public final int hashCode() {
        return this.f69535a.hashCode();
    }

    @NotNull
    public final String toString() {
        return Om.a(")", new StringBuilder("PollResult(events="), this.f69535a);
    }
}
