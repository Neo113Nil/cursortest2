package C1;

import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.W;
import e1.AbstractC4134a;
import e2.C4163e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final W f1067b = W.h().n(new Ra.f() { // from class: C1.c
        @Override // Ra.f
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((C4163e) obj).f45595b);
            return valueOf;
        }
    }).b(W.h().o().n(new Ra.f() { // from class: C1.d
        @Override // Ra.f
        public final Object apply(Object obj) {
            Long valueOf;
            valueOf = Long.valueOf(((C4163e) obj).f45596c);
            return valueOf;
        }
    }));

    /* renamed from: a, reason: collision with root package name */
    public final List f1068a = new ArrayList();

    @Override // C1.a
    public AbstractC3445z a(long j10) {
        if (!this.f1068a.isEmpty()) {
            if (j10 >= ((C4163e) this.f1068a.get(0)).f45595b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f1068a.size(); i10++) {
                    C4163e c4163e = (C4163e) this.f1068a.get(i10);
                    if (j10 >= c4163e.f45595b && j10 < c4163e.f45597d) {
                        arrayList.add(c4163e);
                    }
                    if (j10 < c4163e.f45595b) {
                        break;
                    }
                }
                AbstractC3445z E10 = AbstractC3445z.E(f1067b, arrayList);
                AbstractC3445z.a k10 = AbstractC3445z.k();
                for (int i11 = 0; i11 < E10.size(); i11++) {
                    k10.k(((C4163e) E10.get(i11)).f45594a);
                }
                return k10.m();
            }
        }
        return AbstractC3445z.t();
    }

    @Override // C1.a
    public boolean b(C4163e c4163e, long j10) {
        AbstractC4134a.a(c4163e.f45595b != -9223372036854775807L);
        AbstractC4134a.a(c4163e.f45596c != -9223372036854775807L);
        boolean z10 = c4163e.f45595b <= j10 && j10 < c4163e.f45597d;
        for (int size = this.f1068a.size() - 1; size >= 0; size--) {
            if (c4163e.f45595b >= ((C4163e) this.f1068a.get(size)).f45595b) {
                this.f1068a.add(size + 1, c4163e);
                return z10;
            }
        }
        this.f1068a.add(0, c4163e);
        return z10;
    }

    @Override // C1.a
    public long c(long j10) {
        if (this.f1068a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((C4163e) this.f1068a.get(0)).f45595b) {
            return -9223372036854775807L;
        }
        long j11 = ((C4163e) this.f1068a.get(0)).f45595b;
        for (int i10 = 0; i10 < this.f1068a.size(); i10++) {
            long j12 = ((C4163e) this.f1068a.get(i10)).f45595b;
            long j13 = ((C4163e) this.f1068a.get(i10)).f45597d;
            if (j13 > j10) {
                if (j12 > j10) {
                    break;
                }
                j11 = Math.max(j11, j12);
            } else {
                j11 = Math.max(j11, j13);
            }
        }
        return j11;
    }

    @Override // C1.a
    public void clear() {
        this.f1068a.clear();
    }

    @Override // C1.a
    public long d(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f1068a.size()) {
                break;
            }
            long j12 = ((C4163e) this.f1068a.get(i10)).f45595b;
            long j13 = ((C4163e) this.f1068a.get(i10)).f45597d;
            if (j10 < j12) {
                j11 = j11 == -9223372036854775807L ? j12 : Math.min(j11, j12);
            } else {
                if (j10 < j13) {
                    j11 = j11 == -9223372036854775807L ? j13 : Math.min(j11, j13);
                }
                i10++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    @Override // C1.a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f1068a.size()) {
            long j11 = ((C4163e) this.f1068a.get(i10)).f45595b;
            if (j10 > j11 && j10 > ((C4163e) this.f1068a.get(i10)).f45597d) {
                this.f1068a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
