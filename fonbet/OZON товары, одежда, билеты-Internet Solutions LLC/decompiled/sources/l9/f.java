package l9;

import java.util.Iterator;
import java.util.LinkedList;
import o9.C8659a;

/* loaded from: classes9.dex */
final class f {

    /* renamed from: e, reason: collision with root package name */
    static final f f73126e = new f(g.f73131b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f73127a;

    /* renamed from: b, reason: collision with root package name */
    private final g f73128b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73129c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73130d;

    private f(g gVar, int i11, int i12, int i13) {
        this.f73128b = gVar;
        this.f73127a = i11;
        this.f73129c = i12;
        this.f73130d = i13;
    }

    final f a(int i11) {
        g gVar = this.f73128b;
        int i12 = this.f73127a;
        int i13 = this.f73130d;
        if (i12 == 4 || i12 == 2) {
            int[] iArr = C7900d.f73120c[i12];
            i12 = 0;
            int i14 = iArr[0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar.getClass();
            i13 += i16;
            gVar = new e(gVar, i15, i16);
        }
        int i17 = this.f73129c;
        int i18 = (i17 == 0 || i17 == 31) ? 18 : i17 == 62 ? 9 : 8;
        int i19 = i17 + 1;
        f fVar = new f(gVar, i12, i19, i13 + i18);
        return i19 == 2078 ? fVar.b(i11 + 1) : fVar;
    }

    final f b(int i11) {
        int i12 = this.f73129c;
        if (i12 == 0) {
            return this;
        }
        g gVar = this.f73128b;
        gVar.getClass();
        return new f(new C7898b(gVar, i11 - i12, i12), this.f73127a, 0, this.f73130d);
    }

    final int c() {
        return this.f73129c;
    }

    final int d() {
        return this.f73130d;
    }

    final int e() {
        return this.f73127a;
    }

    final boolean f(f fVar) {
        int i11 = this.f73130d + (C7900d.f73120c[this.f73127a][fVar.f73127a] >> 16);
        int i12 = this.f73129c;
        int i13 = fVar.f73129c;
        if (i12 < i13) {
            int i14 = 20;
            int i15 = i13 > 62 ? 21 : i13 > 31 ? 20 : i13 > 0 ? 10 : 0;
            if (i12 > 62) {
                i14 = 21;
            } else if (i12 <= 31) {
                i14 = i12 > 0 ? 10 : 0;
            }
            i11 += i15 - i14;
        } else if (i12 > i13 && i13 > 0) {
            i11 += 10;
        }
        return i11 <= fVar.f73130d;
    }

    final f g(int i11, int i12) {
        int i13 = this.f73130d;
        g gVar = this.f73128b;
        int i14 = this.f73127a;
        if (i11 != i14) {
            int i15 = C7900d.f73120c[i14][i11];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            gVar.getClass();
            i13 += i17;
            gVar = new e(gVar, i16, i17);
        }
        int i18 = i11 == 2 ? 4 : 5;
        gVar.getClass();
        return new f(new e(gVar, i12, i18), i11, 0, i13 + i18);
    }

    final f h(int i11, int i12) {
        int i13 = this.f73127a;
        int i14 = i13 == 2 ? 4 : 5;
        int i15 = C7900d.f73122e[i13][i11];
        g gVar = this.f73128b;
        gVar.getClass();
        return new f(new e(new e(gVar, i15, i14), i12, 5), i13, 0, this.f73130d + i14 + 5);
    }

    final C8659a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVar = b(bArr.length).f73128b; gVar != null; gVar = gVar.b()) {
            linkedList.addFirst(gVar);
        }
        C8659a c8659a = new C8659a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(c8659a, bArr);
        }
        return c8659a;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", C7900d.f73119b[this.f73127a], Integer.valueOf(this.f73130d), Integer.valueOf(this.f73129c));
    }
}
