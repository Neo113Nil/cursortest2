package ng;

import ig.q;
import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ng.f;

/* loaded from: classes10.dex */
final class b extends f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f77108a;

    /* renamed from: b, reason: collision with root package name */
    private final q[] f77109b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f77110c;

    /* renamed from: d, reason: collision with root package name */
    private final ig.g[] f77111d;

    /* renamed from: e, reason: collision with root package name */
    private final q[] f77112e;

    /* renamed from: f, reason: collision with root package name */
    private final e[] f77113f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap f77114g = new ConcurrentHashMap();

    private b(long[] jArr, q[] qVarArr, long[] jArr2, q[] qVarArr2, e[] eVarArr) {
        this.f77108a = jArr;
        this.f77109b = qVarArr;
        this.f77110c = jArr2;
        this.f77112e = qVarArr2;
        this.f77113f = eVarArr;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < jArr2.length) {
            int i12 = i11 + 1;
            d dVar = new d(jArr2[i11], qVarArr2[i11], qVarArr2[i12]);
            if (dVar.h()) {
                arrayList.add(dVar.b());
                arrayList.add(dVar.a());
            } else {
                arrayList.add(dVar.a());
                arrayList.add(dVar.b());
            }
            i11 = i12;
        }
        this.f77111d = (ig.g[]) arrayList.toArray(new ig.g[arrayList.size()]);
    }

    private d[] i(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        ConcurrentHashMap concurrentHashMap = this.f77114g;
        d[] dVarArr = (d[]) concurrentHashMap.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        e[] eVarArr = this.f77113f;
        d[] dVarArr2 = new d[eVarArr.length];
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            dVarArr2[i12] = eVarArr[i12].a(i11);
        }
        if (i11 < 2100) {
            concurrentHashMap.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object j(ig.g gVar) {
        q f7;
        int length = this.f77113f.length;
        int i11 = 0;
        ig.g[] gVarArr = this.f77111d;
        if (length <= 0 || !(gVarArr.length == 0 || gVar.q1(gVarArr[gVarArr.length - 1]))) {
            int binarySearch = Arrays.binarySearch(gVarArr, gVar);
            q[] qVarArr = this.f77112e;
            if (binarySearch == -1) {
                return qVarArr[0];
            }
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            } else if (binarySearch < gVarArr.length - 1) {
                int i12 = binarySearch + 1;
                if (gVarArr[binarySearch].equals(gVarArr[i12])) {
                    binarySearch = i12;
                }
            }
            if ((binarySearch & 1) != 0) {
                return qVarArr[(binarySearch / 2) + 1];
            }
            ig.g gVar2 = gVarArr[binarySearch];
            ig.g gVar3 = gVarArr[binarySearch + 1];
            int i13 = binarySearch / 2;
            q qVar = qVarArr[i13];
            q qVar2 = qVarArr[i13 + 1];
            return qVar2.i() > qVar.i() ? new d(gVar2, qVar, qVar2) : new d(gVar3, qVar, qVar2);
        }
        d[] i14 = i(gVar.n1());
        int length2 = i14.length;
        q qVar3 = null;
        while (i11 < length2) {
            d dVar = i14[i11];
            ig.g b11 = dVar.b();
            if (dVar.h()) {
                if (gVar.t1(b11)) {
                    f7 = dVar.f();
                } else {
                    if (!gVar.t1(dVar.a())) {
                        f7 = dVar.e();
                    }
                    f7 = dVar;
                }
            } else if (gVar.t1(b11)) {
                if (gVar.t1(dVar.a())) {
                    f7 = dVar.f();
                }
                f7 = dVar;
            } else {
                f7 = dVar.e();
            }
            if ((f7 instanceof d) || f7.equals(dVar.f())) {
                return f7;
            }
            i11++;
            qVar3 = f7;
        }
        return qVar3;
    }

    static b l(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            jArr[i11] = C8592a.b(dataInput);
        }
        int i12 = readInt + 1;
        q[] qVarArr = new q[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            qVarArr[i13] = C8592a.e(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i14 = 0; i14 < readInt2; i14++) {
            jArr2[i14] = C8592a.b(dataInput);
        }
        int i15 = readInt2 + 1;
        q[] qVarArr2 = new q[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            qVarArr2[i16] = C8592a.e(dataInput);
        }
        int readByte = dataInput.readByte();
        e[] eVarArr = new e[readByte];
        for (int i17 = 0; i17 < readByte; i17++) {
            eVarArr[i17] = e.b(dataInput);
        }
        return new b(jArr, qVarArr, jArr2, qVarArr2, eVarArr);
    }

    private Object writeReplace() {
        return new C8592a((byte) 1, this);
    }

    @Override // ng.f
    public final q a(ig.e eVar) {
        long L02 = eVar.L0();
        int length = this.f77113f.length;
        q[] qVarArr = this.f77112e;
        long[] jArr = this.f77110c;
        if (length <= 0 || (jArr.length != 0 && L02 <= jArr[jArr.length - 1])) {
            int binarySearch = Arrays.binarySearch(jArr, L02);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return qVarArr[binarySearch + 1];
        }
        d[] i11 = i(ig.f.J1(lg.c.b(qVarArr[qVarArr.length - 1].i() + L02, 86400L)).v1());
        d dVar = null;
        for (int i12 = 0; i12 < i11.length; i12++) {
            dVar = i11[i12];
            if (L02 < dVar.i()) {
                return dVar.f();
            }
        }
        return dVar.e();
    }

    @Override // ng.f
    public final d b(ig.g gVar) {
        Object j11 = j(gVar);
        if (j11 instanceof d) {
            return (d) j11;
        }
        return null;
    }

    @Override // ng.f
    public final List<q> d(ig.g gVar) {
        Object j11 = j(gVar);
        return j11 instanceof d ? ((d) j11).g() : Collections.singletonList((q) j11);
    }

    @Override // ng.f
    public final boolean e(ig.e eVar) {
        int binarySearch = Arrays.binarySearch(this.f77108a, eVar.L0());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return !this.f77109b[binarySearch + 1].equals(a(eVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.f77108a, bVar.f77108a) && Arrays.equals(this.f77109b, bVar.f77109b) && Arrays.equals(this.f77110c, bVar.f77110c) && Arrays.equals(this.f77112e, bVar.f77112e) && Arrays.equals(this.f77113f, bVar.f77113f);
        }
        if ((obj instanceof f.a) && f()) {
            ig.e eVar = ig.e.f66405d;
            if (a(eVar).equals(((f.a) obj).a(eVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // ng.f
    public final boolean f() {
        return this.f77110c.length == 0 && this.f77113f.length == 0 && this.f77112e[0].equals(this.f77109b[0]);
    }

    @Override // ng.f
    public final boolean g(ig.g gVar, q qVar) {
        return d(gVar).contains(qVar);
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.f77108a) ^ Arrays.hashCode(this.f77109b)) ^ Arrays.hashCode(this.f77110c)) ^ Arrays.hashCode(this.f77112e)) ^ Arrays.hashCode(this.f77113f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb2.append(this.f77109b[r1.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f77108a;
        objectOutput.writeInt(jArr.length);
        for (long j11 : jArr) {
            C8592a.f(j11, objectOutput);
        }
        for (q qVar : this.f77109b) {
            C8592a.g(qVar, objectOutput);
        }
        long[] jArr2 = this.f77110c;
        objectOutput.writeInt(jArr2.length);
        for (long j12 : jArr2) {
            C8592a.f(j12, objectOutput);
        }
        for (q qVar2 : this.f77112e) {
            C8592a.g(qVar2, objectOutput);
        }
        e[] eVarArr = this.f77113f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }
}
