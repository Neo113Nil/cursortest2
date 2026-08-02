package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h12 {
    public long a;
    public long b;

    public h12(int i) {
        switch (i) {
            case 4:
                this.a = C.TIME_UNSET;
                this.b = C.TIME_UNSET;
                break;
            default:
                this.a = 60L;
                this.b = 43200L;
                break;
        }
    }

    public /* synthetic */ h12(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public h12(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
    }
}
