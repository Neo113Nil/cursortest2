package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ahh implements w6c {
    public static final qsj c = new qsj(new osj("", chh.j));
    public final long a;
    public final ArrayList b = new ArrayList();

    public ahh(long j) {
        this.a = j;
    }

    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        long k = nik.k(j, 0L, this.a);
        for (int i = 0; i < nh6VarArr.length; i++) {
            jpg jpgVar = jpgVarArr[i];
            ArrayList arrayList = this.b;
            if (jpgVar != null && (nh6VarArr[i] == null || !zArr[i])) {
                arrayList.remove(jpgVar);
                jpgVarArr[i] = null;
            }
            if (jpgVarArr[i] == null && nh6VarArr[i] != null) {
                bhh bhhVar = new bhh(this.a);
                b bVar = chh.j;
                String str = nik.a;
                bhhVar.c = nik.k(4 * nik.b0(k, 44100L, 1000000L, RoundingMode.UP), 0L, bhhVar.a);
                arrayList.add(bhhVar);
                jpgVarArr[i] = bhhVar;
                zArr2[i] = true;
            }
        }
        return k;
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        return nik.k(j, 0L, this.a);
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        u6cVar.d(this);
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        return false;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        return c;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return false;
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        long k = nik.k(j, 0L, this.a);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return k;
            }
            bhh bhhVar = (bhh) arrayList.get(i);
            bhhVar.getClass();
            b bVar = chh.j;
            String str = nik.a;
            bhhVar.c = nik.k(4 * nik.b0(k, 44100L, 1000000L, RoundingMode.UP), 0L, bhhVar.a);
            i++;
        }
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
    }
}
