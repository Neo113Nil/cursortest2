package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q74 {
    public final hv9 a;
    public final long b;
    public final long c;
    public final long d;

    public q74(List list, long j, long j2) {
        this.a = hv9.v(list);
        this.b = j;
        this.c = j2;
        long j3 = C.TIME_UNSET;
        if (j != C.TIME_UNSET && j2 != C.TIME_UNSET) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
