package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p51 implements e0g {
    public final yda a;

    public /* synthetic */ p51(yda ydaVar) {
        this.a = ydaVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p51) {
            return this.a.equals(((p51) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.a + ")";
    }
}
