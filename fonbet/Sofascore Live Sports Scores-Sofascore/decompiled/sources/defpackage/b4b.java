package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b4b implements c4b {
    public final y3b a;

    public b4b(y3b y3bVar) {
        this.a = y3bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4b) && this.a == ((b4b) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TransactionTypeSelected(transactionType=" + this.a + ")";
    }
}
