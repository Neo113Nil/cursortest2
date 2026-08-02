package defpackage;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.zzet;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kwk {
    public final int[] a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public int[] f;
    public int g;
    public int h;
    public Rect i;
    public int j;
    public int k;

    public kwk(int i) {
        switch (i) {
            case 1:
                this.b = C.TIME_UNSET;
                this.c = C.TIME_UNSET;
                this.a = new int[4];
                this.j = -1;
                this.k = -1;
                break;
            default:
                this.b = C.TIME_UNSET;
                this.c = C.TIME_UNSET;
                this.a = new int[4];
                this.j = -1;
                this.k = -1;
                break;
        }
    }

    public static int a(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    public static int c(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public static int d(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    public void b(nm2 nm2Var, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int width = rect.width();
        int height = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * width;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (nm2Var.b() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | nm2Var.i(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.a[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            nm2Var.c();
        }
    }

    public void e(zzet zzetVar, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int width = rect.width();
        int i4 = i3 * width;
        int height = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 0;
                for (int i7 = 1; i6 < i7 && i7 <= 64; i7 <<= 2) {
                    if (zzetVar.b() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    }
                    i6 = (i6 << 4) | zzetVar.h(4);
                }
                i = i6 & 3;
                i2 = i6 < 4 ? width : i6 >> 2;
                int min = Math.min(i2, width - i5);
                if (min > 0) {
                    int i8 = i4 + min;
                    Arrays.fill(iArr, i4, i8, this.a[i]);
                    i5 += min;
                    i4 = i8;
                }
            } while (i5 < width);
            i3 += 2;
            if (i3 >= height) {
                return;
            }
            i4 = i3 * width;
            zzetVar.k();
        }
    }
}
