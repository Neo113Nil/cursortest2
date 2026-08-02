package com.google.zxing.aztec.encoder;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f38373e = new f(g.f38378b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f38374a;

    /* renamed from: b, reason: collision with root package name */
    public final g f38375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38377d;

    public f(g gVar, int i10, int i11, int i12) {
        this.f38375b = gVar;
        this.f38374a = i10;
        this.f38376c = i11;
        this.f38377d = i12;
    }

    public f a(int i10) {
        g gVar = this.f38375b;
        int i11 = this.f38374a;
        int i12 = this.f38377d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f38367a[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f38376c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f38376c == 2078 ? fVar.b(i10 + 1) : fVar;
    }

    public f b(int i10) {
        int i11 = this.f38376c;
        return i11 == 0 ? this : new f(this.f38375b.b(i10 - i11, i11), this.f38374a, 0, this.f38377d);
    }

    public int c() {
        return this.f38376c;
    }

    public int d() {
        return this.f38377d;
    }

    public int e() {
        return this.f38374a;
    }

    public boolean f(f fVar) {
        int i10;
        int i11 = this.f38377d + (d.f38367a[this.f38374a][fVar.f38374a] >> 16);
        int i12 = fVar.f38376c;
        if (i12 > 0 && ((i10 = this.f38376c) == 0 || i10 > i12)) {
            i11 += 10;
        }
        return i11 <= fVar.f38377d;
    }

    public f g(int i10, int i11) {
        int i12 = this.f38377d;
        g gVar = this.f38375b;
        int i13 = this.f38374a;
        if (i10 != i13) {
            int i14 = d.f38367a[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    public f h(int i10, int i11) {
        g gVar = this.f38375b;
        int i12 = this.f38374a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f38369c[i12][i10], i13).a(i11, 5), this.f38374a, 0, this.f38377d + i13 + 5);
    }

    public Lb.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVar = b(bArr.length).f38375b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        Lb.a aVar = new Lb.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.MODE_NAMES[this.f38374a], Integer.valueOf(this.f38377d), Integer.valueOf(this.f38376c));
    }
}
