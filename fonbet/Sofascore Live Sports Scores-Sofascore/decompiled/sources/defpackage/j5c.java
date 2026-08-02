package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class j5c implements i72 {
    public static final i3c f;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        new l5c(new i5c());
        f = new i3c(3);
    }

    public j5c(i5c i5cVar) {
        this.a = i5cVar.a;
        this.b = i5cVar.b;
        this.c = i5cVar.c;
        this.d = i5cVar.d;
        this.e = i5cVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5c)) {
            return false;
        }
        j5c j5cVar = (j5c) obj;
        return this.a == j5cVar.a && this.b == j5cVar.b && this.c == j5cVar.c && this.d == j5cVar.d && this.e == j5cVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0);
    }
}
