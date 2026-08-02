package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rco implements Comparable {
    public final Runnable a;
    public final long b;

    public rco(long j, Runnable runnable) {
        this.a = runnable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.b, ((rco) obj).b);
    }
}
