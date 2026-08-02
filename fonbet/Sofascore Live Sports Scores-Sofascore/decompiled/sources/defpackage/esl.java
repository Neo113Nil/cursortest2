package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class esl implements e0m {
    public final long a;

    public esl(long j) {
        this.a = j;
    }

    public static esl copy$default(esl eslVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eslVar.a;
        }
        eslVar.getClass();
        return new esl(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esl) && this.a == ((esl) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fn0.n(new StringBuilder("Backward(accumulatedMs="), this.a, ')');
    }
}
