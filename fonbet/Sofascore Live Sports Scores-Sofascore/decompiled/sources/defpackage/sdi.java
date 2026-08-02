package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class sdi {
    public long a;
    public sdi b;

    public sdi(long j) {
        this.a = j;
    }

    public abstract void a(sdi sdiVar);

    public abstract sdi b();

    public sdi c(long j) {
        sdi b = b();
        b.a = j;
        return b;
    }
}
