package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f6f {
    public static final f6f c = new f6f(e6f.a, 0);
    public static final f6f d = new f6f(e6f.f, 1);
    public final e6f a;
    public final int b;

    public f6f(e6f e6fVar, int i) {
        this.a = e6fVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f6f.class != obj.getClass()) {
            return false;
        }
        f6f f6fVar = (f6f) obj;
        return this.a == f6fVar.a && this.b == f6fVar.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
