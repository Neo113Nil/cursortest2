package X1;

import e1.J;
import e1.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends X1.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f13386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13388c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13389d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13390e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13391f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13392g;

    /* renamed from: h, reason: collision with root package name */
    public final List f13393h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f13394i;

    /* renamed from: j, reason: collision with root package name */
    public final long f13395j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13396k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13397l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13398m;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13399a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13400b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13401c;

        public b(int i10, long j10, long j11) {
            this.f13399a = i10;
            this.f13400b = j10;
            this.f13401c = j11;
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f13386a = j10;
        this.f13387b = z10;
        this.f13388c = z11;
        this.f13389d = z12;
        this.f13390e = z13;
        this.f13391f = j11;
        this.f13392g = j12;
        this.f13393h = Collections.unmodifiableList(list);
        this.f13394i = z14;
        this.f13395j = j13;
        this.f13396k = i10;
        this.f13397l = i11;
        this.f13398m = i12;
    }

    public static d d(J j10, long j11, Q q10) {
        List list;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        boolean z14;
        int i13;
        long j13;
        long O10 = j10.O();
        boolean z15 = (j10.M() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j14 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j12 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            i11 = 0;
            i12 = 0;
        } else {
            int M10 = j10.M();
            boolean z16 = (M10 & 128) != 0;
            boolean z17 = (M10 & 64) != 0;
            boolean z18 = (M10 & 32) != 0;
            boolean z19 = (M10 & 16) != 0;
            long e10 = (!z17 || z19) ? -9223372036854775807L : g.e(j10, j11);
            if (!z17) {
                int M11 = j10.M();
                ArrayList arrayList = new ArrayList(M11);
                int i14 = 0;
                while (i14 < M11) {
                    int M12 = j10.M();
                    if (z19) {
                        i13 = M11;
                        j13 = -9223372036854775807L;
                    } else {
                        i13 = M11;
                        j13 = g.e(j10, j11);
                    }
                    arrayList.add(new b(M12, j13, q10.b(j13)));
                    i14++;
                    M11 = i13;
                }
                list2 = arrayList;
            }
            if (z18) {
                long M13 = j10.M();
                boolean z20 = (128 & M13) != 0;
                j14 = ((((M13 & 1) << 32) | j10.O()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int U10 = j10.U();
            long j15 = e10;
            j12 = j14;
            j14 = j15;
            i11 = j10.M();
            i12 = j10.M();
            i10 = U10;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(O10, z15, z10, z11, z12, j14, q10.b(j14), list, z13, j12, i10, i11, i12);
    }

    @Override // X1.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f13391f + ", programSplicePlaybackPositionUs= " + this.f13392g + " }";
    }
}
