package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = yk4.class)
/* loaded from: classes7.dex */
public final class mk4 extends kk4 {

    @NotNull
    public static final lk4 Companion = new lk4();
    public final int b;

    public mk4(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        ogj.h(lnb.k(i, "Unit duration must be positive, but was ", " days."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mk4) {
            return this.b == ((mk4) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public final String toString() {
        int i = this.b;
        return i % 7 == 0 ? rk4.a(i / 7, "WEEK") : rk4.a(i, "DAY");
    }
}
