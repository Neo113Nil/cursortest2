package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c2l implements Comparable {
    public final int a;
    public final t1l b;

    public c2l(int i, t1l t1lVar) {
        this.a = i;
        this.b = t1lVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((c2l) obj).a);
    }
}
