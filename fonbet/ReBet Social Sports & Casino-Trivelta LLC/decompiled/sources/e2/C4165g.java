package e2;

import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.I;
import com.google.common.collect.W;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4165g implements InterfaceC4169k {

    /* renamed from: b, reason: collision with root package name */
    public static final W f45598b = W.h().n(new Ra.f() { // from class: e2.f
        @Override // Ra.f
        public final Object apply(Object obj) {
            Comparable valueOf;
            valueOf = Long.valueOf(C4165g.g(((C4163e) obj).f45595b));
            return valueOf;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f45599a;
    private final long[] eventTimesUs;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4165g(List list) {
        if (list.size() == 1) {
            C4163e c4163e = (C4163e) I.i(list);
            long g10 = g(c4163e.f45595b);
            if (c4163e.f45596c == -9223372036854775807L) {
                this.f45599a = AbstractC3445z.u(c4163e.f45594a);
                this.eventTimesUs = new long[]{g10};
                return;
            } else {
                this.f45599a = AbstractC3445z.v(c4163e.f45594a, AbstractC3445z.t());
                this.eventTimesUs = new long[]{g10, c4163e.f45596c + g10};
                return;
            }
        }
        long[] jArr = new long[list.size() * 2];
        this.eventTimesUs = jArr;
        Arrays.fill(jArr, LongCompanionObject.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        AbstractC3445z E10 = AbstractC3445z.E(f45598b, list);
        int i10 = 0;
        for (int i11 = 0; i11 < E10.size(); i11++) {
            C4163e c4163e2 = (C4163e) E10.get(i11);
            long g11 = g(c4163e2.f45595b);
            long j10 = c4163e2.f45596c + g11;
            if (i10 != 0) {
                int i12 = i10 - 1;
                long j11 = this.eventTimesUs[i12];
                if (j11 >= g11) {
                    if (j11 == g11 && ((AbstractC3445z) arrayList.get(i12)).isEmpty()) {
                        arrayList.set(i12, c4163e2.f45594a);
                    } else {
                        AbstractC4156x.i("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                        this.eventTimesUs[i12] = g11;
                        arrayList.set(i12, c4163e2.f45594a);
                    }
                    if (c4163e2.f45596c == -9223372036854775807L) {
                        this.eventTimesUs[i10] = j10;
                        arrayList.add(AbstractC3445z.t());
                        i10++;
                    }
                }
            }
            this.eventTimesUs[i10] = g11;
            arrayList.add(c4163e2.f45594a);
            i10++;
            if (c4163e2.f45596c == -9223372036854775807L) {
            }
        }
        this.f45599a = AbstractC3445z.o(arrayList);
    }

    public static long g(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0L;
        }
        return j10;
    }

    @Override // e2.InterfaceC4169k
    public int a(long j10) {
        int d10 = Z.d(this.eventTimesUs, j10, false, false);
        if (d10 < this.f45599a.size()) {
            return d10;
        }
        return -1;
    }

    @Override // e2.InterfaceC4169k
    public long c(int i10) {
        AbstractC4134a.a(i10 < this.f45599a.size());
        return this.eventTimesUs[i10];
    }

    @Override // e2.InterfaceC4169k
    public int d() {
        return this.f45599a.size();
    }

    @Override // e2.InterfaceC4169k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC3445z b(long j10) {
        int h10 = Z.h(this.eventTimesUs, j10, true, false);
        return h10 == -1 ? AbstractC3445z.t() : (AbstractC3445z) this.f45599a.get(h10);
    }
}
