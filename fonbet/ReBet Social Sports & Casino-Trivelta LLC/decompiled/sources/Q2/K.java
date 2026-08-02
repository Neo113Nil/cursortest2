package Q2;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: m, reason: collision with root package name */
    public static final a f9221m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final UUID f9222a;

    /* renamed from: b, reason: collision with root package name */
    public final c f9223b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f9224c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.b f9225d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.b f9226e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9227f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9228g;

    /* renamed from: h, reason: collision with root package name */
    public final C1493d f9229h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9230i;

    /* renamed from: j, reason: collision with root package name */
    public final b f9231j;

    /* renamed from: k, reason: collision with root package name */
    public final long f9232k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9233l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f9234a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9235b;

        public b(long j10, long j11) {
            this.f9234a = j10;
            this.f9235b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Intrinsics.areEqual(b.class, obj.getClass())) {
                b bVar = (b) obj;
                if (bVar.f9234a == this.f9234a && bVar.f9235b == this.f9235b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f9234a) * 31) + Long.hashCode(this.f9235b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f9234a + ", flexIntervalMillis=" + this.f9235b + '}';
        }
    }

    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean b() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public K(UUID id2, c state, Set tags, androidx.work.b outputData, androidx.work.b progress, int i10, int i11, C1493d constraints, long j10, b bVar, long j11, int i12) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f9222a = id2;
        this.f9223b = state;
        this.f9224c = tags;
        this.f9225d = outputData;
        this.f9226e = progress;
        this.f9227f = i10;
        this.f9228g = i11;
        this.f9229h = constraints;
        this.f9230i = j10;
        this.f9231j = bVar;
        this.f9232k = j11;
        this.f9233l = i12;
    }

    public final androidx.work.b a() {
        return this.f9225d;
    }

    public final c b() {
        return this.f9223b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(K.class, obj.getClass())) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f9227f == k10.f9227f && this.f9228g == k10.f9228g && Intrinsics.areEqual(this.f9222a, k10.f9222a) && this.f9223b == k10.f9223b && Intrinsics.areEqual(this.f9225d, k10.f9225d) && Intrinsics.areEqual(this.f9229h, k10.f9229h) && this.f9230i == k10.f9230i && Intrinsics.areEqual(this.f9231j, k10.f9231j) && this.f9232k == k10.f9232k && this.f9233l == k10.f9233l && Intrinsics.areEqual(this.f9224c, k10.f9224c)) {
            return Intrinsics.areEqual(this.f9226e, k10.f9226e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f9222a.hashCode() * 31) + this.f9223b.hashCode()) * 31) + this.f9225d.hashCode()) * 31) + this.f9224c.hashCode()) * 31) + this.f9226e.hashCode()) * 31) + this.f9227f) * 31) + this.f9228g) * 31) + this.f9229h.hashCode()) * 31) + Long.hashCode(this.f9230i)) * 31;
        b bVar = this.f9231j;
        return ((((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + Long.hashCode(this.f9232k)) * 31) + Integer.hashCode(this.f9233l);
    }

    public String toString() {
        return "WorkInfo{id='" + this.f9222a + "', state=" + this.f9223b + ", outputData=" + this.f9225d + ", tags=" + this.f9224c + ", progress=" + this.f9226e + ", runAttemptCount=" + this.f9227f + ", generation=" + this.f9228g + ", constraints=" + this.f9229h + ", initialDelayMillis=" + this.f9230i + ", periodicityInfo=" + this.f9231j + ", nextScheduleTimeMillis=" + this.f9232k + "}, stopReason=" + this.f9233l;
    }
}
