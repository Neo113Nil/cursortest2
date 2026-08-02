package z1;

import Pk0.c;
import org.jetbrains.annotations.NotNull;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10972b {

    /* renamed from: a, reason: collision with root package name */
    private final float f106905a;

    /* renamed from: b, reason: collision with root package name */
    private final float f106906b;

    /* renamed from: c, reason: collision with root package name */
    private final long f106907c;

    /* renamed from: d, reason: collision with root package name */
    private final int f106908d;

    public C10972b(float f7, float f11, int i11, long j11) {
        this.f106905a = f7;
        this.f106906b = f11;
        this.f106907c = j11;
        this.f106908d = i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10972b)) {
            return false;
        }
        C10972b c10972b = (C10972b) obj;
        return c10972b.f106905a == this.f106905a && c10972b.f106906b == this.f106906b && c10972b.f106907c == this.f106907c && c10972b.f106908d == this.f106908d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106908d) + c.a(Pk0.b.a(this.f106906b, Float.hashCode(this.f106905a) * 31, 31), 31, this.f106907c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb2.append(this.f106905a);
        sb2.append(",horizontalScrollPixels=");
        sb2.append(this.f106906b);
        sb2.append(",uptimeMillis=");
        sb2.append(this.f106907c);
        sb2.append(",deviceId=");
        return Ek.a.d(sb2, this.f106908d, ')');
    }
}
