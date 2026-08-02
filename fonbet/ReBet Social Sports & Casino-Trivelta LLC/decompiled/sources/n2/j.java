package n2;

import d1.C3985a;
import e1.AbstractC4134a;
import e1.Z;
import e2.InterfaceC4169k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements InterfaceC4169k {

    /* renamed from: a, reason: collision with root package name */
    public final List f57000a;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public j(List list) {
        this.f57000a = Collections.unmodifiableList(new ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i11] = dVar.f56971b;
            jArr[i11 + 1] = dVar.f56972c;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // e2.InterfaceC4169k
    public int a(long j10) {
        int d10 = Z.d(this.sortedCueTimesUs, j10, false, false);
        if (d10 < this.sortedCueTimesUs.length) {
            return d10;
        }
        return -1;
    }

    @Override // e2.InterfaceC4169k
    public List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f57000a.size(); i10++) {
            long[] jArr = this.cueTimesUs;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = (d) this.f57000a.get(i10);
                C3985a c3985a = dVar.f56970a;
                if (c3985a.f44861e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c3985a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: n2.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Long.compare(((d) obj).f56971b, ((d) obj2).f56971b);
                return compare;
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f56970a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // e2.InterfaceC4169k
    public long c(int i10) {
        AbstractC4134a.a(i10 >= 0);
        AbstractC4134a.a(i10 < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i10];
    }

    @Override // e2.InterfaceC4169k
    public int d() {
        return this.sortedCueTimesUs.length;
    }
}
