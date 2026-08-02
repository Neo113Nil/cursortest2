package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a6c implements g6c {
    public final f9g a;

    public a6c(f9g f9gVar) {
        this.a = f9gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6c) && this.a.equals(((a6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RssMediaItem(article=" + this.a + ")";
    }
}
