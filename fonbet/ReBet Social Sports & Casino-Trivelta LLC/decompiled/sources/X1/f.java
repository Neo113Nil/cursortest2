package X1;

import e1.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends X1.b {

    /* renamed from: a, reason: collision with root package name */
    public final List f13402a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13403a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13404b;

        public b(int i10, long j10) {
            this.f13403a = i10;
            this.f13404b = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f13405a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13406b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13407c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f13408d;

        /* renamed from: e, reason: collision with root package name */
        public final long f13409e;

        /* renamed from: f, reason: collision with root package name */
        public final List f13410f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f13411g;

        /* renamed from: h, reason: collision with root package name */
        public final long f13412h;

        /* renamed from: i, reason: collision with root package name */
        public final int f13413i;

        /* renamed from: j, reason: collision with root package name */
        public final int f13414j;

        /* renamed from: k, reason: collision with root package name */
        public final int f13415k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f13405a = j10;
            this.f13406b = z10;
            this.f13407c = z11;
            this.f13408d = z12;
            this.f13410f = Collections.unmodifiableList(list);
            this.f13409e = j11;
            this.f13411g = z13;
            this.f13412h = j12;
            this.f13413i = i10;
            this.f13414j = i11;
            this.f13415k = i12;
        }

        public static c b(J j10) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j11;
            boolean z13;
            long j12;
            int i10;
            int i11;
            int i12;
            boolean z14;
            long j13;
            long O10 = j10.O();
            boolean z15 = true;
            if ((j10.M() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j11 = -9223372036854775807L;
                z13 = false;
                j12 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                int M10 = j10.M();
                boolean z16 = (M10 & 128) != 0 ? z10 : false;
                boolean z17 = (M10 & 64) != 0 ? z10 : false;
                boolean z18 = (M10 & 32) != 0 ? z10 : false;
                long O11 = z17 ? j10.O() : -9223372036854775807L;
                if (!z17) {
                    int M11 = j10.M();
                    ArrayList arrayList3 = new ArrayList(M11);
                    int i13 = 0;
                    while (i13 < M11) {
                        arrayList3.add(new b(j10.M(), j10.O()));
                        i13++;
                        M11 = M11;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long M12 = j10.M();
                    boolean z19 = (128 & M12) != 0;
                    j13 = ((((M12 & 1) << 32) | j10.O()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    j13 = -9223372036854775807L;
                }
                int U10 = j10.U();
                int M13 = j10.M();
                boolean z20 = z16;
                z13 = z14;
                z11 = z20;
                i12 = j10.M();
                long j14 = O11;
                i10 = U10;
                i11 = M13;
                long j15 = j13;
                arrayList = arrayList2;
                z12 = z17;
                j11 = j14;
                j12 = j15;
            }
            return new c(O10, z15, z11, z12, arrayList, j11, z13, j12, i10, i11, i12);
        }
    }

    public f(List list) {
        this.f13402a = Collections.unmodifiableList(list);
    }

    public static f d(J j10) {
        int M10 = j10.M();
        ArrayList arrayList = new ArrayList(M10);
        for (int i10 = 0; i10 < M10; i10++) {
            arrayList.add(c.b(j10));
        }
        return new f(arrayList);
    }
}
