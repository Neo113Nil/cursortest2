package j3;

import N3.C3660k;
import java.util.Arrays;

/* renamed from: j3.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7253I {

    /* renamed from: a, reason: collision with root package name */
    public final int f68962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68964c;

    /* renamed from: d, reason: collision with root package name */
    private final C7272n[] f68965d;

    /* renamed from: e, reason: collision with root package name */
    private int f68966e;

    static {
        m3.N.L(0);
        m3.N.L(1);
    }

    public C7253I(String str, C7272n... c7272nArr) {
        G10.a.c(c7272nArr.length > 0);
        this.f68963b = str;
        this.f68965d = c7272nArr;
        this.f68962a = c7272nArr.length;
        int h11 = u.h(c7272nArr[0].f69127o);
        this.f68964c = h11 == -1 ? u.h(c7272nArr[0].f69126n) : h11;
        String str2 = c7272nArr[0].f69116d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i11 = c7272nArr[0].f69118f | 16384;
        for (int i12 = 1; i12 < c7272nArr.length; i12++) {
            String str3 = c7272nArr[i12].f69116d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c(i12, "languages", c7272nArr[0].f69116d, c7272nArr[i12].f69116d);
                return;
            } else {
                if (i11 != (c7272nArr[i12].f69118f | 16384)) {
                    c(i12, "role flags", Integer.toBinaryString(c7272nArr[0].f69118f), Integer.toBinaryString(c7272nArr[i12].f69118f));
                    return;
                }
            }
        }
    }

    private static void c(int i11, String str, String str2, String str3) {
        StringBuilder d11 = C3660k.d("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        d11.append(str3);
        d11.append("' (track ");
        d11.append(i11);
        d11.append(")");
        m3.s.d("TrackGroup", "", new IllegalStateException(d11.toString()));
    }

    public final C7272n a(int i11) {
        return this.f68965d[i11];
    }

    public final int b(C7272n c7272n) {
        int i11 = 0;
        while (true) {
            C7272n[] c7272nArr = this.f68965d;
            if (i11 >= c7272nArr.length) {
                return -1;
            }
            if (c7272n == c7272nArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7253I.class == obj.getClass()) {
            C7253I c7253i = (C7253I) obj;
            if (this.f68963b.equals(c7253i.f68963b) && Arrays.equals(this.f68965d, c7253i.f68965d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f68966e == 0) {
            this.f68966e = Arrays.hashCode(this.f68965d) + G.g.a(527, 31, this.f68963b);
        }
        return this.f68966e;
    }

    public final String toString() {
        return this.f68963b + ": " + Arrays.toString(this.f68965d);
    }
}
