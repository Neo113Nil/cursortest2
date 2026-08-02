package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mnh implements yd5 {
    public final int a;

    public mnh(int i) {
        this.a = i;
    }

    @Override // defpackage.c80
    public final pmk a(q4k q4kVar) {
        return new zid(this.a, 13);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mnh) && ((mnh) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
