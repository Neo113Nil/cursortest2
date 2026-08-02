package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class vvk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vvk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(sfb sfbVar) {
        sfbVar.getClass();
        int ordinal = sfbVar.ordinal();
        if (ordinal == 0) {
            a70.p("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (ordinal == 1) {
            return this.a;
        }
        if (ordinal == 2) {
            return this.b;
        }
        zzl.b();
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvk)) {
            return false;
        }
        vvk vvkVar = (vvk) obj;
        return this.a == vvkVar.a && this.b == vvkVar.b && this.c == vvkVar.c && this.d == vvkVar.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
    }
}
