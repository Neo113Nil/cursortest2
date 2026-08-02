package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zf9 {
    public long c;
    public final lof d;
    public int g;
    public int h;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public v79[] e = new v79[8];
    public int f = 7;

    public zf9(dh9 dh9Var) {
        this.d = new lof(dh9Var);
    }

    public final void a(v79 v79Var) {
        this.b.add(v79Var);
        long h = this.c + v79Var.b.h() + v79Var.a.h();
        this.c = h;
        if (h <= 262144) {
            return;
        }
        is8.e("header byte count limit of 262144 exceeded");
    }

    public final int b(int i) {
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
                v79 v79Var = this.e[length];
                v79Var.getClass();
                int i4 = v79Var.c;
                i -= i4;
                this.h -= i4;
                this.g--;
                i3++;
            }
            v79[] v79VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(v79VarArr, i5, v79VarArr, i5 + i3, this.g);
            this.f += i3;
        }
        return i3;
    }

    public final gc2 c(int i) {
        if (i >= 0) {
            v79[] v79VarArr = cg9.a;
            if (i <= v79VarArr.length - 1) {
                return v79VarArr[i].a;
            }
        }
        int length = this.f + 1 + (i - cg9.a.length);
        if (length >= 0) {
            v79[] v79VarArr2 = this.e;
            if (length < v79VarArr2.length) {
                v79 v79Var = v79VarArr2[length];
                v79Var.getClass();
                return v79Var.a;
            }
        }
        ilg.l(i + 1, "Header index too large ");
        return null;
    }

    public final void d(v79 v79Var) {
        a(v79Var);
        int i = v79Var.c;
        int i2 = this.a;
        if (i > i2) {
            v79[] v79VarArr = this.e;
            mh0.m(0, v79VarArr.length, null, v79VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        b((this.h + i) - i2);
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

    public final gc2 e() {
        lof lofVar = this.d;
        byte readByte = lofVar.readByte();
        byte[] bArr = wol.a;
        int i = readByte & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long f = f(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        if (this.c + f > 262144) {
            is8.e("header byte count limit of 262144 exceeded");
            return null;
        }
        if (!z) {
            return lofVar.l0(f);
        }
        x52 x52Var = new x52();
        und undVar = ol9.c;
        und undVar2 = undVar;
        int i3 = 0;
        for (long j = 0; j < f; j++) {
            byte readByte2 = lofVar.readByte();
            byte[] bArr2 = wol.a;
            i2 = (i2 << 8) | (readByte2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            i3 += 8;
            while (i3 >= 8) {
                und[] undVarArr = (und[]) undVar2.d;
                undVarArr.getClass();
                undVar2 = undVarArr[(i2 >>> (i3 - 8)) & 255];
                undVar2.getClass();
                if (((und[]) undVar2.d) == null) {
                    x52Var.Y0(undVar2.b);
                    i3 -= undVar2.c;
                    undVar2 = undVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            und[] undVarArr2 = (und[]) undVar2.d;
            undVarArr2.getClass();
            und undVar3 = undVarArr2[(i2 << (8 - i3)) & 255];
            undVar3.getClass();
            und[] undVarArr3 = (und[]) undVar3.d;
            int i4 = undVar3.c;
            if (undVarArr3 != null || i4 > i3) {
                break;
            }
            x52Var.Y0(undVar3.b);
            i3 -= i4;
            undVar2 = undVar;
        }
        return x52Var.l0(x52Var.b);
    }

    public final int f(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        long j = i2;
        int i4 = 0;
        int i5 = 0;
        while (i4 != 5) {
            byte readByte = this.d.readByte();
            byte[] bArr = wol.a;
            i4++;
            long j2 = (readByte & Byte.MAX_VALUE) << i5;
            if (j2 > 2147483647L - j) {
                is8.e("HPACK integer overflow");
                return 0;
            }
            j += j2;
            if ((readByte & 128) == 0) {
                return (int) j;
            }
            i5 += 7;
        }
        is8.e("HPACK integer overflow");
        return 0;
    }
}
