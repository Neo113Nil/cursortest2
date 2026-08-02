package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zyf implements Comparable {
    public long b = C.TIME_UNSET;
    public final ArrayList a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((zyf) obj).b);
    }
}
