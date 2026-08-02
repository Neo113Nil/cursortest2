package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tcb {
    public final ci6 a;

    public tcb(ci6 ci6Var) {
        this.a = ci6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tcb) && this.a.equals(((tcb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshCategoryLiveEventsCount(collapsibleCategory=" + this.a + ")";
    }
}
