package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cwl implements e0m {
    public final long a;

    public cwl(long j) {
        this.a = j;
    }

    public static cwl copy$default(cwl cwlVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cwlVar.a;
        }
        cwlVar.getClass();
        return new cwl(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwl) && this.a == ((cwl) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fn0.n(new StringBuilder("Forward(accumulatedMs="), this.a, ')');
    }
}
