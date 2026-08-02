package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pih implements b0h {
    @Override // defpackage.b0h
    public final long getDurationUs() {
        return C.TIME_UNSET;
    }

    @Override // defpackage.b0h
    public final zzg getSeekPoints(long j) {
        f0h f0hVar = new f0h(j, 0L);
        return new zzg(f0hVar, f0hVar);
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
