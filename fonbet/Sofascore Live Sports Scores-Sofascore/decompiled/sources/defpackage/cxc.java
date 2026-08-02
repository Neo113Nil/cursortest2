package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cxc implements b0h {
    public final long a;
    public final exc[] b;
    public final int c;

    public cxc(long j, exc[] excVarArr, int i) {
        this.a = j;
        this.b = excVarArr;
        this.c = i;
    }

    @Override // defpackage.b0h
    public final long getDurationUs() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // defpackage.b0h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzg getSeekPoints(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        int b;
        exc[] excVarArr = this.b;
        int length = excVarArr.length;
        f0h f0hVar = f0h.c;
        if (length == 0) {
            return new zzg(f0hVar, f0hVar);
        }
        int i2 = this.c;
        if (i2 != -1) {
            xsj xsjVar = excVarArr[i2].b;
            int a = xsjVar.a(j);
            if (a == -1) {
                a = xsjVar.b(j);
            }
            long[] jArr = xsjVar.c;
            long[] jArr2 = xsjVar.f;
            if (a == -1) {
                return new zzg(f0hVar, f0hVar);
            }
            j3 = jArr2[a];
            j2 = jArr[a];
            if (j3 < j && a < xsjVar.b - 1 && (b = xsjVar.b(j)) != -1 && b != a) {
                j5 = jArr2[b];
                j4 = jArr[b];
                long j6 = j2;
                for (i = 0; i < excVarArr.length; i++) {
                    if (i != i2) {
                        xsj xsjVar2 = excVarArr[i].b;
                        long[] jArr3 = xsjVar2.c;
                        int a2 = xsjVar2.a(j3);
                        if (a2 == -1) {
                            a2 = xsjVar2.b(j3);
                        }
                        if (a2 != -1) {
                            j6 = Math.min(jArr3[a2], j6);
                        }
                        if (j5 != C.TIME_UNSET) {
                            int a3 = xsjVar2.a(j5);
                            if (a3 == -1) {
                                a3 = xsjVar2.b(j5);
                            }
                            if (a3 != -1) {
                                j4 = Math.min(jArr3[a3], j4);
                            }
                        }
                    }
                }
                f0h f0hVar2 = new f0h(j3, j6);
                return j5 != C.TIME_UNSET ? new zzg(f0hVar2, f0hVar2) : new zzg(f0hVar2, new f0h(j5, j4));
            }
        } else {
            j2 = Long.MAX_VALUE;
            j3 = j;
        }
        j4 = -1;
        j5 = C.TIME_UNSET;
        long j62 = j2;
        while (i < excVarArr.length) {
        }
        f0h f0hVar22 = new f0h(j3, j62);
        if (j5 != C.TIME_UNSET) {
        }
    }

    @Override // defpackage.b0h
    public final boolean isSeekable() {
        return true;
    }
}
