package t4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l3.C7855a;
import m3.N;

/* loaded from: classes8.dex */
final class j implements k4.i {

    /* renamed from: a, reason: collision with root package name */
    private final List<d> f99164a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f99165b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f99166c;

    public j(ArrayList arrayList) {
        this.f99164a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f99165b = new long[arrayList.size() * 2];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d dVar = (d) arrayList.get(i11);
            int i12 = i11 * 2;
            long[] jArr = this.f99165b;
            jArr[i12] = dVar.f99135b;
            jArr[i12 + 1] = dVar.f99136c;
        }
        long[] jArr2 = this.f99165b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f99166c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // k4.i
    public final long a(int i11) {
        G10.a.c(i11 >= 0);
        long[] jArr = this.f99166c;
        G10.a.c(i11 < jArr.length);
        return jArr[i11];
    }

    @Override // k4.i
    public final int b() {
        return this.f99166c.length;
    }

    @Override // k4.i
    public final int c(long j11) {
        long[] jArr = this.f99166c;
        int a11 = N.a(jArr, j11, false);
        if (a11 < jArr.length) {
            return a11;
        }
        return -1;
    }

    @Override // k4.i
    public final List<C7855a> d(long j11) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            List<d> list = this.f99164a;
            if (i11 >= list.size()) {
                break;
            }
            int i12 = i11 * 2;
            long[] jArr = this.f99165b;
            if (jArr[i12] <= j11 && j11 < jArr[i12 + 1]) {
                d dVar = list.get(i11);
                C7855a c7855a = dVar.f99134a;
                if (c7855a.f72603e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c7855a);
                }
            }
            i11++;
        }
        Collections.sort(arrayList2, new i());
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            C7855a.C1210a a11 = ((d) arrayList2.get(i13)).f99134a.a();
            a11.h((-1) - i13, 1);
            arrayList.add(a11.a());
        }
        return arrayList;
    }
}
