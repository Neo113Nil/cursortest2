package io.sentry.android.replay;

import B0.C2454a;
import io.sentry.X2;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t f67555a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final j f67556b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f67557c;

    /* renamed from: d, reason: collision with root package name */
    private final int f67558d;

    /* renamed from: e, reason: collision with root package name */
    private final long f67559e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final X2.b f67560f;

    /* renamed from: g, reason: collision with root package name */
    private final String f67561g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<io.sentry.rrweb.b> f67562h;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull t recorderConfig, @NotNull j cache, @NotNull Date timestamp, int i11, long j11, @NotNull X2.b replayType, String str, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f67555a = recorderConfig;
        this.f67556b = cache;
        this.f67557c = timestamp;
        this.f67558d = i11;
        this.f67559e = j11;
        this.f67560f = replayType;
        this.f67561g = str;
        this.f67562h = events;
    }

    @NotNull
    public final j a() {
        return this.f67556b;
    }

    public final long b() {
        return this.f67559e;
    }

    @NotNull
    public final List<io.sentry.rrweb.b> c() {
        return this.f67562h;
    }

    public final int d() {
        return this.f67558d;
    }

    @NotNull
    public final t e() {
        return this.f67555a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f67555a, eVar.f67555a) && Intrinsics.d(this.f67556b, eVar.f67556b) && Intrinsics.d(this.f67557c, eVar.f67557c) && this.f67558d == eVar.f67558d && this.f67559e == eVar.f67559e && this.f67560f == eVar.f67560f && Intrinsics.d(this.f67561g, eVar.f67561g) && Intrinsics.d(this.f67562h, eVar.f67562h);
    }

    @NotNull
    public final X2.b f() {
        return this.f67560f;
    }

    public final String g() {
        return this.f67561g;
    }

    @NotNull
    public final Date h() {
        return this.f67557c;
    }

    public final int hashCode() {
        int hashCode = (this.f67560f.hashCode() + Pk0.c.a(C2454a.a(this.f67558d, (this.f67557c.hashCode() + ((this.f67556b.hashCode() + (this.f67555a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f67559e)) * 31;
        String str = this.f67561g;
        return this.f67562h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "LastSegmentData(recorderConfig=" + this.f67555a + ", cache=" + this.f67556b + ", timestamp=" + this.f67557c + ", id=" + this.f67558d + ", duration=" + this.f67559e + ", replayType=" + this.f67560f + ", screenAtStart=" + this.f67561g + ", events=" + this.f67562h + ')';
    }
}
