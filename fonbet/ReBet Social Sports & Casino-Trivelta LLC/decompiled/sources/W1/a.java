package W1;

import b1.C2334C;
import com.google.common.primitives.h;

/* loaded from: classes.dex */
public final class a implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f12963a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12964b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12965c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12966d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12967e;

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f12963a = j10;
        this.f12964b = j11;
        this.f12965c = j12;
        this.f12966d = j13;
        this.f12967e = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12963a == aVar.f12963a && this.f12964b == aVar.f12964b && this.f12965c == aVar.f12965c && this.f12966d == aVar.f12966d && this.f12967e == aVar.f12967e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.c(this.f12963a)) * 31) + h.c(this.f12964b)) * 31) + h.c(this.f12965c)) * 31) + h.c(this.f12966d)) * 31) + h.c(this.f12967e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f12963a + ", photoSize=" + this.f12964b + ", photoPresentationTimestampUs=" + this.f12965c + ", videoStartPosition=" + this.f12966d + ", videoSize=" + this.f12967e;
    }
}
