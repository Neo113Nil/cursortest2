package k4;

import Bl.C2639a;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.T;
import com.google.common.collect.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.C7855a;
import m3.N;
import m3.s;

/* loaded from: classes8.dex */
final class d implements i {

    /* renamed from: c, reason: collision with root package name */
    private static final T<c> f70455c = T.d().e(new C2639a());

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5880y<AbstractC5880y<C7855a>> f70456a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f70457b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(List<c> list) {
        boolean z11;
        boolean z12 = true;
        int i11 = 0;
        if (list.size() == 1) {
            g0 listIterator = ((AbstractC5880y) list).listIterator(0);
            Object next = listIterator.next();
            if (listIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                while (i11 < 4 && listIterator.hasNext()) {
                    sb2.append(", ");
                    sb2.append(listIterator.next());
                    i11++;
                }
                if (listIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            c cVar = (c) next;
            long j11 = cVar.f70452b;
            long j12 = j11 == -9223372036854775807L ? 0L : j11;
            long j13 = cVar.f70453c;
            AbstractC5880y<C7855a> abstractC5880y = cVar.f70451a;
            if (j13 == -9223372036854775807L) {
                this.f70456a = AbstractC5880y.B(abstractC5880y);
                this.f70457b = new long[]{j12};
                return;
            } else {
                this.f70456a = AbstractC5880y.C(abstractC5880y, AbstractC5880y.v());
                this.f70457b = new long[]{j12, j13 + j12};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.f70457b = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        AbstractC5880y F11 = AbstractC5880y.F(f70455c, list);
        int i12 = 0;
        while (i11 < F11.size()) {
            c cVar2 = (c) F11.get(i11);
            long j14 = cVar2.f70452b;
            j14 = j14 == -9223372036854775807L ? 0L : j14;
            long j15 = cVar2.f70453c;
            long j16 = j14 + j15;
            AbstractC5880y<C7855a> abstractC5880y2 = cVar2.f70451a;
            if (i12 != 0) {
                int i13 = i12 - 1;
                long j17 = this.f70457b[i13];
                if (j17 >= j14) {
                    if (j17 == j14 && ((AbstractC5880y) arrayList.get(i13)).isEmpty()) {
                        arrayList.set(i13, abstractC5880y2);
                        z11 = z12;
                    } else {
                        z11 = z12;
                        s.f("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.f70457b[i13] = j14;
                        arrayList.set(i13, abstractC5880y2);
                    }
                    if (j15 == -9223372036854775807L) {
                        this.f70457b[i12] = j16;
                        arrayList.add(AbstractC5880y.v());
                        i12++;
                    }
                    i11++;
                    z12 = z11;
                }
            }
            z11 = z12;
            this.f70457b[i12] = j14;
            arrayList.add(abstractC5880y2);
            i12++;
            if (j15 == -9223372036854775807L) {
            }
            i11++;
            z12 = z11;
        }
        this.f70456a = AbstractC5880y.n(arrayList);
    }

    @Override // k4.i
    public final long a(int i11) {
        G10.a.c(i11 < this.f70456a.size());
        return this.f70457b[i11];
    }

    @Override // k4.i
    public final int b() {
        return this.f70456a.size();
    }

    @Override // k4.i
    public final int c(long j11) {
        int a11 = N.a(this.f70457b, j11, false);
        if (a11 < this.f70456a.size()) {
            return a11;
        }
        return -1;
    }

    @Override // k4.i
    public final List d(long j11) {
        int e11 = N.e(this.f70457b, j11, false);
        return e11 == -1 ? AbstractC5880y.v() : this.f70456a.get(e11);
    }
}
