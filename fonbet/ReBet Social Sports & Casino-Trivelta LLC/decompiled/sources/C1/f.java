package C1;

import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import e1.AbstractC4134a;
import e2.C4163e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1069a = new ArrayList();

    @Override // C1.a
    public AbstractC3445z a(long j10) {
        int f10 = f(j10);
        if (f10 == 0) {
            return AbstractC3445z.t();
        }
        C4163e c4163e = (C4163e) this.f1069a.get(f10 - 1);
        long j11 = c4163e.f45597d;
        return (j11 == -9223372036854775807L || j10 < j11) ? c4163e.f45594a : AbstractC3445z.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // C1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(C4163e c4163e, long j10) {
        boolean z10;
        int size;
        AbstractC4134a.a(c4163e.f45595b != -9223372036854775807L);
        if (c4163e.f45595b <= j10) {
            long j11 = c4163e.f45597d;
            if (j11 == -9223372036854775807L || j10 < j11) {
                z10 = true;
                for (size = this.f1069a.size() - 1; size >= 0; size--) {
                    if (c4163e.f45595b >= ((C4163e) this.f1069a.get(size)).f45595b) {
                        this.f1069a.add(size + 1, c4163e);
                        return z10;
                    }
                    if (((C4163e) this.f1069a.get(size)).f45595b <= j10) {
                        z10 = false;
                    }
                }
                this.f1069a.add(0, c4163e);
                return z10;
            }
        }
        z10 = false;
        while (size >= 0) {
        }
        this.f1069a.add(0, c4163e);
        return z10;
    }

    @Override // C1.a
    public long c(long j10) {
        if (this.f1069a.isEmpty() || j10 < ((C4163e) this.f1069a.get(0)).f45595b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f1069a.size(); i10++) {
            long j11 = ((C4163e) this.f1069a.get(i10)).f45595b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                C4163e c4163e = (C4163e) this.f1069a.get(i10 - 1);
                long j12 = c4163e.f45597d;
                return (j12 == -9223372036854775807L || j12 > j10) ? c4163e.f45595b : j12;
            }
        }
        C4163e c4163e2 = (C4163e) I.f(this.f1069a);
        long j13 = c4163e2.f45597d;
        return (j13 == -9223372036854775807L || j10 < j13) ? c4163e2.f45595b : j13;
    }

    @Override // C1.a
    public void clear() {
        this.f1069a.clear();
    }

    @Override // C1.a
    public long d(long j10) {
        if (this.f1069a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((C4163e) this.f1069a.get(0)).f45595b) {
            return ((C4163e) this.f1069a.get(0)).f45595b;
        }
        for (int i10 = 1; i10 < this.f1069a.size(); i10++) {
            C4163e c4163e = (C4163e) this.f1069a.get(i10);
            if (j10 < c4163e.f45595b) {
                long j11 = ((C4163e) this.f1069a.get(i10 - 1)).f45597d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= c4163e.f45595b) ? c4163e.f45595b : j11;
            }
        }
        long j12 = ((C4163e) I.f(this.f1069a)).f45597d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // C1.a
    public void e(long j10) {
        int f10 = f(j10);
        if (f10 == 0) {
            return;
        }
        long j11 = ((C4163e) this.f1069a.get(f10 - 1)).f45597d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            f10--;
        }
        this.f1069a.subList(0, f10).clear();
    }

    public final int f(long j10) {
        for (int i10 = 0; i10 < this.f1069a.size(); i10++) {
            if (j10 < ((C4163e) this.f1069a.get(i10)).f45595b) {
                return i10;
            }
        }
        return this.f1069a.size();
    }
}
