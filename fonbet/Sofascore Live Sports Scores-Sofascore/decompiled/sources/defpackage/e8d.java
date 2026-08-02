package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e8d {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public e8d(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e8d.class == obj.getClass()) {
            e8d e8dVar = (e8d) obj;
            return this.c == e8dVar.c && this.d == e8dVar.d && this.b == e8dVar.b && this.a == e8dVar.a && this.e == e8dVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + wv8.a(this.a, fc6.a(this.b, fc6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEvent(touchX=");
        sb.append(this.c);
        sb.append(", touchY=");
        sb.append(this.d);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", swipeEdge=");
        sb.append(this.a);
        sb.append(", frameTimeMillis=");
        return fn0.n(sb, this.e, ')');
    }
}
