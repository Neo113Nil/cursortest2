package W1;

import b1.C2334C;

/* loaded from: classes.dex */
public final class d implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f12973a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12974b;

    public d(float f10, int i10) {
        this.f12973a = f10;
        this.f12974b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f12973a == dVar.f12973a && this.f12974b == dVar.f12974b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + com.google.common.primitives.c.a(this.f12973a)) * 31) + this.f12974b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f12973a + ", svcTemporalLayerCount=" + this.f12974b;
    }
}
