package b1;

import android.net.Uri;
import b1.z;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;
import java.util.Objects;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: b1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2348b {

    /* renamed from: f, reason: collision with root package name */
    public static final C2348b f24539f = new C2348b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f24540g = new a(0).h(0);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24541h = Z.K0(1);

    /* renamed from: i, reason: collision with root package name */
    public static final String f24542i = Z.K0(2);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24543j = Z.K0(3);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24544k = Z.K0(4);

    /* renamed from: a, reason: collision with root package name */
    public final Object f24545a;
    private final a[] adGroups;

    /* renamed from: b, reason: collision with root package name */
    public final int f24546b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24549e;

    /* renamed from: b1.b$a */
    public static final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final String f24550g = Z.K0(0);

        /* renamed from: h, reason: collision with root package name */
        public static final String f24551h = Z.K0(1);

        /* renamed from: i, reason: collision with root package name */
        public static final String f24552i = Z.K0(2);

        /* renamed from: j, reason: collision with root package name */
        public static final String f24553j = Z.K0(3);

        /* renamed from: k, reason: collision with root package name */
        public static final String f24554k = Z.K0(4);

        /* renamed from: l, reason: collision with root package name */
        public static final String f24555l = Z.K0(5);

        /* renamed from: m, reason: collision with root package name */
        public static final String f24556m = Z.K0(6);

        /* renamed from: n, reason: collision with root package name */
        public static final String f24557n = Z.K0(7);

        /* renamed from: o, reason: collision with root package name */
        public static final String f24558o = Z.K0(8);

        /* renamed from: p, reason: collision with root package name */
        public static final String f24559p = Z.K0(9);

        /* renamed from: q, reason: collision with root package name */
        public static final String f24560q = Z.K0(10);

        /* renamed from: a, reason: collision with root package name */
        public final long f24561a;

        /* renamed from: b, reason: collision with root package name */
        public final int f24562b;

        /* renamed from: c, reason: collision with root package name */
        public final int f24563c;

        /* renamed from: d, reason: collision with root package name */
        public final long f24564d;
        public final long[] durationsUs;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f24565e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f24566f;
        public final String[] ids;
        public final z[] mediaItems;
        public final int[] states;

        @Deprecated
        public final Uri[] uris;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new z[0], new long[0], 0L, false, new String[0], false);
        }

        public static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i12 >= iArr.length || this.f24565e || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            if (this.f24562b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f24562b; i10++) {
                int i11 = this.states[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f24561a == aVar.f24561a && this.f24562b == aVar.f24562b && this.f24563c == aVar.f24563c && Arrays.equals(this.mediaItems, aVar.mediaItems) && Arrays.equals(this.states, aVar.states) && Arrays.equals(this.durationsUs, aVar.durationsUs) && this.f24564d == aVar.f24564d && this.f24565e == aVar.f24565e && Arrays.equals(this.ids, aVar.ids) && this.f24566f == aVar.f24566f) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f24566f && this.f24561a == Long.MIN_VALUE && this.f24562b == -1;
        }

        public boolean g() {
            return this.f24562b == -1 || c() < this.f24562b;
        }

        public a h(int i10) {
            int[] b10 = b(this.states, i10);
            long[] a10 = a(this.durationsUs, i10);
            return new a(this.f24561a, i10, this.f24563c, b10, (z[]) Arrays.copyOf(this.mediaItems, i10), a10, this.f24564d, this.f24565e, (String[]) Arrays.copyOf(this.ids, i10), this.f24566f);
        }

        public int hashCode() {
            int i10 = ((this.f24562b * 31) + this.f24563c) * 31;
            long j10 = this.f24561a;
            int hashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.mediaItems)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs)) * 31;
            long j11 = this.f24564d;
            return ((((((hashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f24565e ? 1 : 0)) * 31) + Arrays.hashCode(this.ids)) * 31) + (this.f24566f ? 1 : 0);
        }

        public a(long j10, int i10, int i11, int[] iArr, z[] zVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            AbstractC4134a.a(iArr.length == zVarArr.length);
            this.f24561a = j10;
            this.f24562b = i10;
            this.f24563c = i11;
            this.states = iArr;
            this.mediaItems = zVarArr;
            this.durationsUs = jArr;
            this.f24564d = j11;
            this.f24565e = z10;
            this.uris = new Uri[zVarArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i12 >= uriArr.length) {
                    this.ids = strArr;
                    this.f24566f = z11;
                    return;
                } else {
                    z zVar = zVarArr[i12];
                    uriArr[i12] = zVar == null ? null : ((z.h) AbstractC4134a.e(zVar.f24655b)).f24749a;
                    i12++;
                }
            }
        }
    }

    public C2348b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f24545a = obj;
        this.f24547c = j10;
        this.f24548d = j11;
        this.f24546b = aVarArr.length + i10;
        this.adGroups = aVarArr;
        this.f24549e = i10;
    }

    public a a(int i10) {
        int i11 = this.f24549e;
        return i10 < i11 ? f24540g : this.adGroups[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f24549e;
            while (i10 < this.f24546b && ((a(i10).f24561a != Long.MIN_VALUE && a(i10).f24561a <= j10) || !a(i10).g())) {
                i10++;
            }
            if (i10 < this.f24546b && (j11 == -9223372036854775807L || a(i10).f24561a <= j11)) {
                return i10;
            }
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f24546b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!e(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !a(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f24546b - 1 && a(i10).f();
    }

    public final boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a a10 = a(i10);
        long j12 = a10.f24561a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || a10.f() || j10 < j11 : j10 < j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2348b.class == obj.getClass()) {
            C2348b c2348b = (C2348b) obj;
            if (Objects.equals(this.f24545a, c2348b.f24545a) && this.f24546b == c2348b.f24546b && this.f24547c == c2348b.f24547c && this.f24548d == c2348b.f24548d && this.f24549e == c2348b.f24549e && Arrays.equals(this.adGroups, c2348b.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f24546b * 31;
        Object obj = this.f24545a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f24547c)) * 31) + ((int) this.f24548d)) * 31) + this.f24549e) * 31) + Arrays.hashCode(this.adGroups);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f24545a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f24547c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.adGroups.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.adGroups[i10].f24561a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.adGroups[i10].states.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.adGroups[i10].states[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append(Matrix.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.adGroups[i10].durationsUs[i11]);
                sb2.append(')');
                if (i11 < this.adGroups[i10].states.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.adGroups.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
