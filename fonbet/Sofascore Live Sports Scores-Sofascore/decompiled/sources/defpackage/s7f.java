package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s7f extends yxh {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public s7f(long j, long j2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long a(long j, j9e j9eVar) {
        long A = j9eVar.A();
        return (128 & A) != 0 ? 8589934591L & ((((A & 1) << 32) | j9eVar.C()) + j) : C.TIME_UNSET;
    }

    @Override // defpackage.yxh
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return lnb.l(this.c, " }", sb);
            default:
                StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb2.append(this.b);
                sb2.append(", playbackPositionUs= ");
                return lnb.l(this.c, " }", sb2);
        }
    }
}
