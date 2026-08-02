package io.sentry.android.replay;

import io.sentry.G3;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s f51594a;

    /* renamed from: b, reason: collision with root package name */
    public final i f51595b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f51596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51597d;

    /* renamed from: e, reason: collision with root package name */
    public final long f51598e;

    /* renamed from: f, reason: collision with root package name */
    public final G3.b f51599f;

    /* renamed from: g, reason: collision with root package name */
    public final String f51600g;

    /* renamed from: h, reason: collision with root package name */
    public final List f51601h;

    public d(s recorderConfig, i cache, Date timestamp, int i10, long j10, G3.b replayType, String str, List events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f51594a = recorderConfig;
        this.f51595b = cache;
        this.f51596c = timestamp;
        this.f51597d = i10;
        this.f51598e = j10;
        this.f51599f = replayType;
        this.f51600g = str;
        this.f51601h = events;
    }

    public final i a() {
        return this.f51595b;
    }

    public final long b() {
        return this.f51598e;
    }

    public final List c() {
        return this.f51601h;
    }

    public final int d() {
        return this.f51597d;
    }

    public final s e() {
        return this.f51594a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f51594a, dVar.f51594a) && Intrinsics.areEqual(this.f51595b, dVar.f51595b) && Intrinsics.areEqual(this.f51596c, dVar.f51596c) && this.f51597d == dVar.f51597d && this.f51598e == dVar.f51598e && this.f51599f == dVar.f51599f && Intrinsics.areEqual(this.f51600g, dVar.f51600g) && Intrinsics.areEqual(this.f51601h, dVar.f51601h);
    }

    public final G3.b f() {
        return this.f51599f;
    }

    public final String g() {
        return this.f51600g;
    }

    public final Date h() {
        return this.f51596c;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f51594a.hashCode() * 31) + this.f51595b.hashCode()) * 31) + this.f51596c.hashCode()) * 31) + Integer.hashCode(this.f51597d)) * 31) + Long.hashCode(this.f51598e)) * 31) + this.f51599f.hashCode()) * 31;
        String str = this.f51600g;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f51601h.hashCode();
    }

    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.f51594a + ", cache=" + this.f51595b + ", timestamp=" + this.f51596c + ", id=" + this.f51597d + ", duration=" + this.f51598e + ", replayType=" + this.f51599f + ", screenAtStart=" + this.f51600g + ", events=" + this.f51601h + ')';
    }
}
