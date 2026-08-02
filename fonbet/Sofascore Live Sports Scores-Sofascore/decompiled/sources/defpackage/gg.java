package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gg implements i72 {
    public static final hc5 i = new hc5(24);
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    public gg(long j, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        qx9.r(iArr.length == uriArr.length);
        this.a = j;
        this.b = i2;
        this.c = i3;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.g = j2;
        this.h = z;
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gg.class != obj.getClass()) {
            return false;
        }
        gg ggVar = (gg) obj;
        return this.a == ggVar.a && this.b == ggVar.b && this.c == ggVar.c && Arrays.equals(this.d, ggVar.d) && Arrays.equals(this.e, ggVar.e) && Arrays.equals(this.f, ggVar.f) && this.g == ggVar.g && this.h == ggVar.h;
    }

    public final int hashCode() {
        int i2 = ((this.b * 31) + this.c) * 31;
        long j = this.a;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j2 = this.g;
        return ((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.h ? 1 : 0);
    }
}
