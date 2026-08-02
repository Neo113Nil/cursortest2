package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fna implements l1c {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1c b;
    public final /* synthetic */ kna c;
    public final /* synthetic */ int d;
    public final /* synthetic */ l1c e;

    public /* synthetic */ fna(l1c l1cVar, kna knaVar, int i, l1c l1cVar2, int i2) {
        this.a = i2;
        this.c = knaVar;
        this.d = i;
        this.e = l1cVar2;
        this.b = l1cVar;
    }

    @Override // defpackage.l1c
    public final Map a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.l1c
    public final void b() {
        int i;
        int i2 = this.a;
        l1c l1cVar = this.e;
        int i3 = this.d;
        kna knaVar = this.c;
        switch (i2) {
            case 0:
                knaVar.e = i3;
                l1cVar.b();
                i1d i1dVar = knaVar.m;
                x0d x0dVar = knaVar.l;
                long[] jArr = x0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = x0dVar.b[i8];
                                    vji vjiVar = (vji) x0dVar.c[i8];
                                    int p = i1dVar.p(obj);
                                    if (p < 0 || p >= knaVar.e) {
                                        if (p >= 0) {
                                            Object obj2 = rz8.k;
                                            i = i5;
                                            Object[] objArr = i1dVar.a;
                                            Object obj3 = objArr[p];
                                            objArr[p] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (knaVar.j.b(obj)) {
                                            vjiVar.d();
                                        }
                                        x0dVar.l(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                knaVar.g(knaVar.d);
                break;
            default:
                knaVar.d = i3;
                l1cVar.b();
                if (knaVar.a.h == null) {
                    knaVar.g(knaVar.d);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.l1c
    public final Function1 c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.l1c
    public final int getHeight() {
        switch (this.a) {
        }
        return this.b.getHeight();
    }

    @Override // defpackage.l1c
    public final int getWidth() {
        switch (this.a) {
        }
        return this.b.getWidth();
    }
}
