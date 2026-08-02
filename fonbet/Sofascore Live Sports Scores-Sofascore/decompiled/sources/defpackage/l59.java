package defpackage;

import com.google.android.gms.internal.ads.zzaht;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l59 {
    public long a;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public final Object m;

    public void a(int i) {
        long j = this.k;
        if (j != C.TIME_UNSET) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            ((vsj) this.m).a(j, this.l ? 1 : 0, i2, i, null);
        }
    }

    public void b(int i) {
        long j = this.k;
        if (j != C.TIME_UNSET) {
            long j2 = this.a;
            long j3 = this.j;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            ((zzaht) this.m).f(j, this.l ? 1 : 0, i2, i, null);
        }
    }
}
