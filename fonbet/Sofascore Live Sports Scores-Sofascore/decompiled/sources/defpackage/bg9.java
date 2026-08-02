package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bg9 {
    public final x52 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public v79[] e = new v79[8];
    public int f = 7;

    public bg9(x52 x52Var) {
        this.a = x52Var;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                v79 v79Var = this.e[length];
                v79Var.getClass();
                i -= v79Var.c;
                int i4 = this.h;
                v79 v79Var2 = this.e[length];
                v79Var2.getClass();
                this.h = i4 - v79Var2.c;
                this.g--;
                i3++;
                length--;
            }
            v79[] v79VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(v79VarArr, i5, v79VarArr, i5 + i3, this.g);
            v79[] v79VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(v79VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(v79 v79Var) {
        int i = v79Var.c;
        int i2 = this.d;
        if (i > i2) {
            v79[] v79VarArr = this.e;
            mh0.m(0, v79VarArr.length, null, v79VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        v79[] v79VarArr2 = this.e;
        if (i3 > v79VarArr2.length) {
            v79[] v79VarArr3 = new v79[v79VarArr2.length * 2];
            System.arraycopy(v79VarArr2, 0, v79VarArr3, v79VarArr2.length, v79VarArr2.length);
            this.f = this.e.length - 1;
            this.e = v79VarArr3;
            v79VarArr2 = v79VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        v79VarArr2[i4] = v79Var;
        this.g++;
        this.h += i;
    }

    public final void c(gc2 gc2Var) {
        gc2Var.getClass();
        int[] iArr = ol9.a;
        int h = gc2Var.h();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < h; i++) {
            byte m = gc2Var.m(i);
            byte[] bArr = wol.a;
            j2 += ol9.b[m & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int h2 = gc2Var.h();
        x52 x52Var = this.a;
        if (i2 >= h2) {
            e(gc2Var.h(), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0);
            x52Var.X0(gc2Var);
            return;
        }
        x52 x52Var2 = new x52();
        int[] iArr2 = ol9.a;
        int h3 = gc2Var.h();
        int i3 = 0;
        for (int i4 = 0; i4 < h3; i4++) {
            byte m2 = gc2Var.m(i4);
            byte[] bArr2 = wol.a;
            int i5 = m2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i6 = ol9.a[i5];
            byte b = ol9.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                x52Var2.Y0((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            x52Var2.Y0((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        gc2 l0 = x52Var2.l0(x52Var2.b);
        e(l0.h(), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
        x52Var.X0(l0);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            v79 v79Var = (v79) arrayList.get(i4);
            gc2 u = v79Var.a.u();
            gc2 gc2Var = v79Var.b;
            Integer num = (Integer) cg9.b.get(u);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    v79[] v79VarArr = cg9.a;
                    if (Intrinsics.c(v79VarArr[intValue].b, gc2Var)) {
                        i = i2;
                    } else if (Intrinsics.c(v79VarArr[i2].b, gc2Var)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    v79 v79Var2 = this.e[i5];
                    v79Var2.getClass();
                    if (Intrinsics.c(v79Var2.a, u)) {
                        v79 v79Var3 = this.e[i5];
                        v79Var3.getClass();
                        if (Intrinsics.c(v79Var3.b, gc2Var)) {
                            i2 = cg9.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + cg9.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 128);
            } else if (i == -1) {
                this.a.Y0(64);
                c(u);
                c(gc2Var);
                b(v79Var);
            } else {
                gc2 gc2Var2 = v79.d;
                u.getClass();
                gc2Var2.getClass();
                if (!u.q(gc2Var2, 0, gc2Var2.h()) || Intrinsics.c(v79.i, u)) {
                    e(i, 63, 64);
                    c(gc2Var);
                    b(v79Var);
                } else {
                    e(i, 15, 0);
                    c(gc2Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        x52 x52Var = this.a;
        if (i < i2) {
            x52Var.Y0(i | i3);
            return;
        }
        x52Var.Y0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            x52Var.Y0(128 | (i4 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE));
            i4 >>>= 7;
        }
        x52Var.Y0(i4);
    }
}
