package io.sentry.android.replay;

import androidx.appcompat.widget.c1;
import io.sentry.c6;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final v f16028a;

    /* renamed from: b, reason: collision with root package name */
    public final j f16029b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f16030c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16031d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16032e;

    /* renamed from: f, reason: collision with root package name */
    public final c6 f16033f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16034g;

    /* renamed from: h, reason: collision with root package name */
    public final List f16035h;

    public f(v recorderConfig, j cache, Date timestamp, int i5, long j, c6 replayType, String str, List events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f16028a = recorderConfig;
        this.f16029b = cache;
        this.f16030c = timestamp;
        this.f16031d = i5;
        this.f16032e = j;
        this.f16033f = replayType;
        this.f16034g = str;
        this.f16035h = events;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f16028a, fVar.f16028a) && Intrinsics.areEqual(this.f16029b, fVar.f16029b) && Intrinsics.areEqual(this.f16030c, fVar.f16030c) && this.f16031d == fVar.f16031d && this.f16032e == fVar.f16032e && this.f16033f == fVar.f16033f && Intrinsics.areEqual(this.f16034g, fVar.f16034g) && Intrinsics.areEqual(this.f16035h, fVar.f16035h);
    }

    public final int hashCode() {
        int hashCode = (((this.f16030c.hashCode() + ((this.f16029b.hashCode() + (this.f16028a.hashCode() * 31)) * 31)) * 31) + this.f16031d) * 31;
        long j = this.f16032e;
        int hashCode2 = (this.f16033f.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        String str = this.f16034g;
        return this.f16035h.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LastSegmentData(recorderConfig=");
        sb2.append(this.f16028a);
        sb2.append(", cache=");
        sb2.append(this.f16029b);
        sb2.append(", timestamp=");
        sb2.append(this.f16030c);
        sb2.append(", id=");
        sb2.append(this.f16031d);
        sb2.append(", duration=");
        sb2.append(this.f16032e);
        sb2.append(", replayType=");
        sb2.append(this.f16033f);
        sb2.append(", screenAtStart=");
        sb2.append(this.f16034g);
        sb2.append(", events=");
        return c1.p(sb2, this.f16035h, ')');
    }
}
