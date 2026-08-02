package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kg3 implements a5h {
    public final vvf a;
    public long b;

    public kg3(List list, List list2) {
        zu9 s = hv9.s();
        z1a.s(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            s.c(new jg3((a5h) list.get(i), (List) list2.get(i)));
        }
        this.a = s.g();
        this.b = C.TIME_UNSET;
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                vvf vvfVar = this.a;
                if (i >= vvfVar.d) {
                    break;
                }
                long nextLoadPositionUs2 = ((jg3) vvfVar.get(i)).a.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= mgbVar.a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= ((jg3) vvfVar.get(i)).a.g(mgbVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            vvf vvfVar = this.a;
            if (i >= vvfVar.d) {
                break;
            }
            jg3 jg3Var = (jg3) vvfVar.get(i);
            long bufferedPositionUs = jg3Var.a.getBufferedPositionUs();
            hv9 hv9Var = jg3Var.b;
            if ((hv9Var.contains(1) || hv9Var.contains(2) || hv9Var.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, bufferedPositionUs);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != C.TIME_UNSET ? j3 : j2;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            vvf vvfVar = this.a;
            if (i >= vvfVar.d) {
                break;
            }
            long nextLoadPositionUs = ((jg3) vvfVar.get(i)).a.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            vvf vvfVar = this.a;
            if (i >= vvfVar.d) {
                return false;
            }
            if (((jg3) vvfVar.get(i)).a.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        int i = 0;
        while (true) {
            vvf vvfVar = this.a;
            if (i >= vvfVar.d) {
                return;
            }
            ((jg3) vvfVar.get(i)).reevaluateBuffer(j);
            i++;
        }
    }
}
