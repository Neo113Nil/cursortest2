package c4;

import j3.t;

/* loaded from: classes8.dex */
public final class c implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f56490a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56491b;

    public c(float f7, int i11) {
        this.f56490a = f7;
        this.f56491b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f56490a == cVar.f56490a && this.f56491b == cVar.f56491b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f56490a).hashCode() + 527) * 31) + this.f56491b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f56490a + ", svcTemporalLayerCount=" + this.f56491b;
    }
}
