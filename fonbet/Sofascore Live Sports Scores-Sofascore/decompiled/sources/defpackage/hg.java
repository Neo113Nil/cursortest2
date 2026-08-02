package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hg {
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final h6c[] e;
    public final int[] f;
    public final long[] g;
    public final String[] h;
    public final ig[] i;

    static {
        wt3.s(0, 1, 2, 3, 4);
        wt3.s(5, 6, 7, 8, 9);
        nik.N(10);
        nik.N(11);
    }

    public hg(long j, int i, int i2, int[] iArr, h6c[] h6cVarArr, long[] jArr, String[] strArr, ig[] igVarArr) {
        Uri uri;
        int i3 = 0;
        z1a.s(iArr.length == h6cVarArr.length);
        z1a.s(iArr.length == igVarArr.length);
        this.a = j;
        this.b = i;
        this.c = i2;
        this.f = iArr;
        this.e = h6cVarArr;
        this.g = jArr;
        this.d = new Uri[h6cVarArr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i3 >= uriArr.length) {
                this.h = strArr;
                this.i = igVarArr;
                return;
            }
            h6c h6cVar = h6cVarArr[i3];
            if (h6cVar == null) {
                uri = null;
            } else {
                v5c v5cVar = h6cVar.b;
                v5cVar.getClass();
                uri = v5cVar.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public static long[] a(long[] jArr, int i) {
        int length = jArr.length;
        int max = Math.max(i, length);
        long[] copyOf = Arrays.copyOf(jArr, max);
        Arrays.fill(copyOf, length, max, C.TIME_UNSET);
        return copyOf;
    }

    public final int b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final hg c(int i) {
        int[] iArr = this.f;
        int length = iArr.length;
        int max = Math.max(i, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] a = a(this.g, i);
        h6c[] h6cVarArr = (h6c[]) Arrays.copyOf(this.e, i);
        String[] strArr = (String[]) Arrays.copyOf(this.h, i);
        ig[] igVarArr = this.i;
        return new hg(this.a, i, this.c, copyOf, h6cVarArr, a, strArr, (ig[]) Arrays.copyOf(igVarArr, Math.max(i, igVarArr.length)));
    }

    public final hg d(int i, int i2) {
        int i3 = this.b;
        z1a.s(i3 == -1 || i2 < i3);
        int[] iArr = this.f;
        int length = iArr.length;
        int max = Math.max(i2 + 1, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        int i4 = copyOf[i2];
        z1a.s(i4 == 0 || i4 == 1 || i4 == i);
        long[] jArr = this.g;
        if (jArr.length != copyOf.length) {
            jArr = a(jArr, copyOf.length);
        }
        long[] jArr2 = jArr;
        h6c[] h6cVarArr = this.e;
        if (h6cVarArr.length != copyOf.length) {
            h6cVarArr = (h6c[]) Arrays.copyOf(h6cVarArr, copyOf.length);
        }
        h6c[] h6cVarArr2 = h6cVarArr;
        String[] strArr = this.h;
        if (strArr.length != copyOf.length) {
            strArr = (String[]) Arrays.copyOf(strArr, copyOf.length);
        }
        String[] strArr2 = strArr;
        copyOf[i2] = i;
        ig[] igVarArr = this.i;
        if (igVarArr.length != copyOf.length) {
            igVarArr = (ig[]) Arrays.copyOf(igVarArr, Math.max(copyOf.length, igVarArr.length));
        }
        return new hg(this.a, this.b, this.c, copyOf, h6cVarArr2, jArr2, strArr2, igVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hg.class != obj.getClass()) {
            return false;
        }
        hg hgVar = (hg) obj;
        return this.a == hgVar.a && this.b == hgVar.b && this.c == hgVar.c && Arrays.equals(this.e, hgVar.e) && Arrays.equals(this.f, hgVar.f) && Arrays.equals(this.g, hgVar.g) && Arrays.equals(this.h, hgVar.h) && Arrays.equals(this.i, hgVar.i);
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        return (Arrays.hashCode(this.i) + ((((Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.h)) * 31)) * 31;
    }

    public hg(long j) {
        this(j, -1, -1, new int[0], new h6c[0], new long[0], new String[0], new ig[0]);
    }
}
