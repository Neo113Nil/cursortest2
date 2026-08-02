package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vmb implements h0f {
    public final wmb a;
    public int b;
    public Class c;

    public vmb(wmb wmbVar) {
        this.a = wmbVar;
    }

    @Override // defpackage.h0f
    public final void a() {
        this.a.D(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vmb) {
            vmb vmbVar = (vmb) obj;
            if (this.b == vmbVar.b && this.c == vmbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
