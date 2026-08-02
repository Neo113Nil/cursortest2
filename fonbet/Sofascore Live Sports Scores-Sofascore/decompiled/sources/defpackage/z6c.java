package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class z6c {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public z6c(z6c z6cVar) {
        this.a = z6cVar.a;
        this.b = z6cVar.b;
        this.c = z6cVar.c;
        this.d = z6cVar.d;
        this.e = z6cVar.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6c)) {
            return false;
        }
        z6c z6cVar = (z6c) obj;
        return this.a.equals(z6cVar.a) && this.b == z6cVar.b && this.c == z6cVar.c && this.d == z6cVar.d && this.e == z6cVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public z6c(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public z6c(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public z6c(Object obj) {
        this(obj, -1L);
    }

    public z6c(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
