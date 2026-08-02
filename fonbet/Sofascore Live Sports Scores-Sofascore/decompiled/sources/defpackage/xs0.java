package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xs0 extends vw3 {
    public final int a;

    public xs0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw3) {
            if (this.a == ((xs0) ((vw3) obj)).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return fc6.h(this.a, "}", new StringBuilder("ProfilingTrigger{trigger="));
    }
}
