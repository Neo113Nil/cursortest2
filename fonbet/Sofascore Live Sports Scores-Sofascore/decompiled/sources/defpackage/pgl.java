package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pgl implements eil {
    public final int a;
    public final String b;

    public pgl(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgl)) {
            return false;
        }
        pgl pglVar = (pgl) obj;
        return this.a == pglVar.a && this.b.equals(pglVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return i.g(this.a, "OnNewsArticleClick(newsId=", ", provider=", this.b, ")");
    }
}
