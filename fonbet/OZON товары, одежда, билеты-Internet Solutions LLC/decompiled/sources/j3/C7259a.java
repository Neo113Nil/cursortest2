package j3;

import android.net.Uri;
import j3.C7275q;
import java.util.Arrays;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7259a {

    /* renamed from: c, reason: collision with root package name */
    public static final C7259a f69046c = new C7259a(new C1129a[0]);

    /* renamed from: d, reason: collision with root package name */
    private static final C1129a f69047d = new C1129a().b();

    /* renamed from: a, reason: collision with root package name */
    public final int f69048a;

    /* renamed from: b, reason: collision with root package name */
    private final C1129a[] f69049b;

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    public static final class C1129a {

        /* renamed from: a, reason: collision with root package name */
        public final int f69050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f69051b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public final Uri[] f69052c;

        /* renamed from: d, reason: collision with root package name */
        public final C7275q[] f69053d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f69054e;

        /* renamed from: f, reason: collision with root package name */
        public final long[] f69055f;

        /* renamed from: g, reason: collision with root package name */
        public final String[] f69056g;

        static {
            Pk0.h.f(0, 1, 2, 3, 4);
            Pk0.h.f(5, 6, 7, 8, 9);
            m3.N.L(10);
        }

        public C1129a() {
            this(-1, -1, new int[0], new C7275q[0], new long[0], new String[0]);
        }

        public final int a(int i11) {
            int i12;
            int i13 = i11 + 1;
            while (true) {
                int[] iArr = this.f69054e;
                if (i13 >= iArr.length || (i12 = iArr[i13]) == 0 || i12 == 1) {
                    break;
                }
                i13++;
            }
            return i13;
        }

        public final C1129a b() {
            int[] iArr = this.f69054e;
            int length = iArr.length;
            int max = Math.max(0, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] jArr = this.f69055f;
            int length2 = jArr.length;
            int max2 = Math.max(0, length2);
            long[] copyOf2 = Arrays.copyOf(jArr, max2);
            Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
            return new C1129a(0, this.f69051b, copyOf, (C7275q[]) Arrays.copyOf(this.f69053d, 0), copyOf2, (String[]) Arrays.copyOf(this.f69056g, 0));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1129a.class != obj.getClass()) {
                return false;
            }
            C1129a c1129a = (C1129a) obj;
            return this.f69050a == c1129a.f69050a && this.f69051b == c1129a.f69051b && Arrays.equals(this.f69053d, c1129a.f69053d) && Arrays.equals(this.f69054e, c1129a.f69054e) && Arrays.equals(this.f69055f, c1129a.f69055f) && Arrays.equals(this.f69056g, c1129a.f69056g);
        }

        public final int hashCode() {
            int i11 = ((this.f69050a * 31) + this.f69051b) * 31;
            int i12 = (int) 0;
            return (((((Arrays.hashCode(this.f69055f) + ((Arrays.hashCode(this.f69054e) + ((Arrays.hashCode(this.f69053d) + ((i11 + i12) * 31)) * 31)) * 31)) * 31) + i12) * 961) + Arrays.hashCode(this.f69056g)) * 31;
        }

        private C1129a(int i11, int i12, int[] iArr, C7275q[] c7275qArr, long[] jArr, String[] strArr) {
            Uri uri;
            int i13 = 0;
            G10.a.c(iArr.length == c7275qArr.length);
            this.f69050a = i11;
            this.f69051b = i12;
            this.f69054e = iArr;
            this.f69053d = c7275qArr;
            this.f69055f = jArr;
            this.f69052c = new Uri[c7275qArr.length];
            while (true) {
                Uri[] uriArr = this.f69052c;
                if (i13 >= uriArr.length) {
                    this.f69056g = strArr;
                    return;
                }
                C7275q c7275q = c7275qArr[i13];
                if (c7275q == null) {
                    uri = null;
                } else {
                    C7275q.f fVar = c7275q.f69184b;
                    fVar.getClass();
                    uri = fVar.f69240a;
                }
                uriArr[i13] = uri;
                i13++;
            }
        }
    }

    static {
        m3.N.L(1);
        m3.N.L(2);
        m3.N.L(3);
        m3.N.L(4);
    }

    private C7259a(C1129a[] c1129aArr) {
        this.f69048a = c1129aArr.length;
        this.f69049b = c1129aArr;
    }

    public final C1129a a(int i11) {
        return i11 < 0 ? f69047d : this.f69049b[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7259a.class != obj.getClass()) {
            return false;
        }
        C7259a c7259a = (C7259a) obj;
        return this.f69048a == c7259a.f69048a && Arrays.equals(this.f69049b, c7259a.f69049b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69049b) + (((((this.f69048a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i11 = 0;
        while (true) {
            C1129a[] c1129aArr = this.f69049b;
            if (i11 >= c1129aArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=0, ads=[");
            c1129aArr[i11].getClass();
            for (int i12 = 0; i12 < c1129aArr[i11].f69054e.length; i12++) {
                sb2.append("ad(state=");
                int i13 = c1129aArr[i11].f69054e[i12];
                if (i13 == 0) {
                    sb2.append('_');
                } else if (i13 == 1) {
                    sb2.append('R');
                } else if (i13 == 2) {
                    sb2.append('S');
                } else if (i13 == 3) {
                    sb2.append('P');
                } else if (i13 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(c1129aArr[i11].f69055f[i12]);
                sb2.append(')');
                if (i12 < c1129aArr[i11].f69054e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i11 < c1129aArr.length - 1) {
                sb2.append(", ");
            }
            i11++;
        }
    }
}
