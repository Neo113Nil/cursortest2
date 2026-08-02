package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class syf {
    public static final syf c = new syf(0, false);
    public final int a;
    public final boolean b;

    public syf(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || syf.class != obj.getClass()) {
            return false;
        }
        syf syfVar = (syf) obj;
        return this.a == syfVar.a && this.b == syfVar.b;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
