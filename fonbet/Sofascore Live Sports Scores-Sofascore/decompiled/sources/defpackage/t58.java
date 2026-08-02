package defpackage;

import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t58 {
    public final CountDownLatch a;
    public ew3 b = null;

    public t58(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t58)) {
            return false;
        }
        t58 t58Var = (t58) obj;
        return this.a.equals(t58Var.a) && Intrinsics.c(this.b, t58Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ew3 ew3Var = this.b;
        return hashCode + (ew3Var == null ? 0 : ew3Var.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
