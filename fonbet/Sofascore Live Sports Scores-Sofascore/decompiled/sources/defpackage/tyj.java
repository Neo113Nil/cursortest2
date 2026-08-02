package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tyj implements uyj {
    public final int a;

    public tyj(int i) {
        this.a = i;
    }

    @Override // defpackage.zyj
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyj) && this.a == ((tyj) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "PlaceholderLargeGridTile(slotKey=", ")");
    }
}
