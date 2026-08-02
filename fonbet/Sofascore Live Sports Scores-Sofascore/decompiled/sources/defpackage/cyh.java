package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cyh extends yxh {
    public final long a;
    public final long b;
    public final List c;

    public cyh(List list, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
    }

    @Override // defpackage.yxh
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return lnb.l(this.b, " }", sb);
    }
}
