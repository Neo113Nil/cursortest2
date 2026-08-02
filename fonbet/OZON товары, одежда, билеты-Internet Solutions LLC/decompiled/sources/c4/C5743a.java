package c4;

import com.google.common.primitives.d;
import j3.t;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5743a implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f56481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56482b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56483c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56484d;

    /* renamed from: e, reason: collision with root package name */
    public final long f56485e;

    public C5743a(long j11, long j12, long j13, long j14, long j15) {
        this.f56481a = j11;
        this.f56482b = j12;
        this.f56483c = j13;
        this.f56484d = j14;
        this.f56485e = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5743a.class == obj.getClass()) {
            C5743a c5743a = (C5743a) obj;
            if (this.f56481a == c5743a.f56481a && this.f56482b == c5743a.f56482b && this.f56483c == c5743a.f56483c && this.f56484d == c5743a.f56484d && this.f56485e == c5743a.f56485e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return d.b(this.f56485e) + ((d.b(this.f56484d) + ((d.b(this.f56483c) + ((d.b(this.f56482b) + ((d.b(this.f56481a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f56481a + ", photoSize=" + this.f56482b + ", photoPresentationTimestampUs=" + this.f56483c + ", videoStartPosition=" + this.f56484d + ", videoSize=" + this.f56485e;
    }
}
