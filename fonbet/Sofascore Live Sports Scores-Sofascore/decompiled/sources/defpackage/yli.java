package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yli {
    public static final yli c = new yli(C.TIME_UNSET, false);
    public boolean a;
    public long b;

    public yli(long j, boolean z) {
        this.b = j;
        this.a = z;
    }

    public long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }

    public yli(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
