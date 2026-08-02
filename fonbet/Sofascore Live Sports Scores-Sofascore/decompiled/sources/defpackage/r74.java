package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r74 implements lli {
    public static final l92 c = new l92(new m72(4), x5d.a);
    public final hv9 a;
    public final long[] b;

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r74(vvf vvfVar) {
        int i = vvfVar.d;
        int i2 = 0;
        if (i == 1) {
            av9 listIterator = vvfVar.listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i2 < 4 && listIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(listIterator.next());
                    i2++;
                }
                if (listIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            q74 q74Var = (q74) next;
            long j = q74Var.b;
            long j2 = q74Var.c;
            long j3 = j == C.TIME_UNSET ? 0L : j;
            hv9 hv9Var = q74Var.a;
            if (j2 == C.TIME_UNSET) {
                this.a = hv9.z(hv9Var);
                this.b = new long[]{j3};
                return;
            } else {
                av9 av9Var = hv9.b;
                this.a = hv9.A(hv9Var, vvf.e);
                this.b = new long[]{j3, j2 + j3};
                return;
            }
        }
        long[] jArr = new long[i * 2];
        this.b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        vvf D = hv9.D(c, vvfVar);
        int i3 = 0;
        while (i2 < D.d) {
            q74 q74Var2 = (q74) D.get(i2);
            long j4 = q74Var2.b;
            long j5 = q74Var2.c;
            hv9 hv9Var2 = q74Var2.a;
            j4 = j4 == C.TIME_UNSET ? 0L : j4;
            long j6 = j4 + j5;
            if (i3 != 0) {
                int i4 = i3 - 1;
                long j7 = this.b[i4];
                if (j7 >= j4) {
                    if (j7 == j4 && ((hv9) arrayList.get(i4)).isEmpty()) {
                        arrayList.set(i4, hv9Var2);
                    } else {
                        tgj.d0("Truncating unsupported overlapping cues.");
                        this.b[i4] = j4;
                        arrayList.set(i4, hv9Var2);
                    }
                    if (j5 == C.TIME_UNSET) {
                        this.b[i3] = j6;
                        arrayList.add(vvf.e);
                        i3++;
                    }
                    i2++;
                }
            }
            this.b[i3] = j4;
            arrayList.add(hv9Var2);
            i3++;
            if (j5 == C.TIME_UNSET) {
            }
            i2++;
        }
        this.a = hv9.v(arrayList);
    }

    @Override // defpackage.lli
    public final List getCues(long j) {
        int f = nik.f(this.b, j, false);
        if (f != -1) {
            return (hv9) this.a.get(f);
        }
        av9 av9Var = hv9.b;
        return vvf.e;
    }

    @Override // defpackage.lli
    public final long getEventTime(int i) {
        z1a.s(i < this.a.size());
        return this.b[i];
    }

    @Override // defpackage.lli
    public final int getEventTimeCount() {
        return this.a.size();
    }

    @Override // defpackage.lli
    public final int getNextEventTimeIndex(long j) {
        int b = nik.b(this.b, j, false);
        if (b < this.a.size()) {
            return b;
        }
        return -1;
    }
}
