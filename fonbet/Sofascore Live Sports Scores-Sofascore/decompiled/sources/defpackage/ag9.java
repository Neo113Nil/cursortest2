package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ag9 {
    public final lof b;
    public final ArrayList a = new ArrayList();
    public x79[] e = new x79[8];
    public int f = 7;
    public int g = 0;
    public int h = 0;
    public int c = 4096;
    public int d = 4096;

    public ag9(ng9 ng9Var) {
        this.b = new lof(ng9Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.e[length].c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            x79[] x79VarArr = this.e;
            System.arraycopy(x79VarArr, i2 + 1, x79VarArr, i2 + 1 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final gc2 b(int i) {
        if (i >= 0) {
            x79[] x79VarArr = dg9.b;
            if (i <= x79VarArr.length - 1) {
                return x79VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - dg9.b.length);
        if (length >= 0) {
            x79[] x79VarArr2 = this.e;
            if (length < x79VarArr2.length) {
                return x79VarArr2[length].a;
            }
        }
        ilg.l(i + 1, "Header index too large ");
        return null;
    }

    public final void c(x79 x79Var) {
        this.a.add(x79Var);
        int i = x79Var.c;
        int i2 = this.d;
        if (i > i2) {
            Arrays.fill(this.e, (Object) null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        x79[] x79VarArr = this.e;
        if (i3 > x79VarArr.length) {
            x79[] x79VarArr2 = new x79[x79VarArr.length * 2];
            System.arraycopy(x79VarArr, 0, x79VarArr2, x79VarArr.length, x79VarArr.length);
            this.f = this.e.length - 1;
            this.e = x79VarArr2;
            x79VarArr = x79VarArr2;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        x79VarArr[i4] = x79Var;
        this.g++;
        this.h += i;
    }

    public final gc2 d() {
        lof lofVar = this.b;
        byte readByte = lofVar.readByte();
        int i = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        boolean z = (readByte & 128) == 128;
        int e = e(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        if (!z) {
            return lofVar.l0(e);
        }
        pl9 pl9Var = pl9.d;
        long j = e;
        lofVar.o(j);
        byte[] j0 = lofVar.b.j0(j);
        pl9Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        und undVar = pl9Var.a;
        und undVar2 = undVar;
        int i2 = 0;
        int i3 = 0;
        for (byte b : j0) {
            i2 = (i2 << 8) | (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            i3 += 8;
            while (i3 >= 8) {
                undVar2 = ((und[]) undVar2.d)[(i2 >>> (i3 - 8)) & 255];
                if (((und[]) undVar2.d) == null) {
                    byteArrayOutputStream.write(undVar2.b);
                    i3 -= undVar2.c;
                    undVar2 = undVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            und undVar3 = ((und[]) undVar2.d)[(i2 << (8 - i3)) & 255];
            und[] undVarArr = (und[]) undVar3.d;
            int i4 = undVar3.c;
            if (undVarArr != null || i4 > i3) {
                break;
            }
            byteArrayOutputStream.write(undVar3.b);
            i3 -= i4;
            undVar2 = undVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        gc2 gc2Var = gc2.d;
        return q1f.r(byteArray);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.b.readByte();
            int i5 = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
