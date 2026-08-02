package b1;

import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.Z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: e, reason: collision with root package name */
    public static final String f24393e = Z.K0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final String f24394f = Z.K0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f24395a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24396b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24397c;

    /* renamed from: d, reason: collision with root package name */
    public int f24398d;
    private final androidx.media3.common.a[] formats;

    public P(androidx.media3.common.a... aVarArr) {
        this("", aVarArr);
    }

    public static void c(String str, String str2, String str3, int i10) {
        AbstractC4156x.e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int e(int i10) {
        return i10 | 16384;
    }

    public androidx.media3.common.a a(int i10) {
        return this.formats[i10];
    }

    public int b(androidx.media3.common.a aVar) {
        int i10 = 0;
        while (true) {
            androidx.media3.common.a[] aVarArr = this.formats;
            if (i10 >= aVarArr.length) {
                return -1;
            }
            if (aVar == aVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class == obj.getClass()) {
            P p10 = (P) obj;
            if (this.f24396b.equals(p10.f24396b) && Arrays.equals(this.formats, p10.formats)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        String d10 = d(this.formats[0].f20532d);
        int e10 = e(this.formats[0].f20534f);
        int i10 = 1;
        while (true) {
            androidx.media3.common.a[] aVarArr = this.formats;
            if (i10 >= aVarArr.length) {
                return;
            }
            if (!d10.equals(d(aVarArr[i10].f20532d))) {
                androidx.media3.common.a[] aVarArr2 = this.formats;
                c("languages", aVarArr2[0].f20532d, aVarArr2[i10].f20532d, i10);
                return;
            } else {
                if (e10 != e(this.formats[i10].f20534f)) {
                    c("role flags", Integer.toBinaryString(this.formats[0].f20534f), Integer.toBinaryString(this.formats[i10].f20534f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public int hashCode() {
        if (this.f24398d == 0) {
            this.f24398d = ((527 + this.f24396b.hashCode()) * 31) + Arrays.hashCode(this.formats);
        }
        return this.f24398d;
    }

    public String toString() {
        return this.f24396b + ": " + Arrays.toString(this.formats);
    }

    public P(String str, androidx.media3.common.a... aVarArr) {
        AbstractC4134a.a(aVarArr.length > 0);
        this.f24396b = str;
        this.formats = aVarArr;
        this.f24395a = aVarArr.length;
        int k10 = AbstractC2335D.k(aVarArr[0].f20543o);
        this.f24397c = k10 == -1 ? AbstractC2335D.k(aVarArr[0].f20542n) : k10;
        f();
    }
}
