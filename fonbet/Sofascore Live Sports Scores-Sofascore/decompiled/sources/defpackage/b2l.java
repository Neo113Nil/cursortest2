package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b2l implements Comparable {
    public final int a;
    public final s1l b;

    public b2l(int i, s1l s1lVar) {
        this.a = i;
        this.b = s1lVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((b2l) obj).a);
    }
}
