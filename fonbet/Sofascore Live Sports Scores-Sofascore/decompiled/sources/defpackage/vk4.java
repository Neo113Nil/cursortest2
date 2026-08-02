package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vk4 implements jwk {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;

    public vk4(qg4 qg4Var) {
        this.d = qg4Var;
        String str = qg4Var.a;
        char c = qg4Var.b;
        this.a = StringsKt.O(str, c, 0, 6);
        this.b = StringsKt.S(str, c, 0, 6);
        this.c = qg4Var.c.length();
        this.e = new t9d(this);
    }

    @Override // defpackage.jwk
    public gwj a(q80 q80Var) {
        int length = q80Var.b.length();
        int i = this.c;
        String str = q80Var.b;
        int i2 = 0;
        if (length > i) {
            IntRange j = llf.j(0, i);
            str.getClass();
            j.getClass();
            str = str.substring(j.a, j.b + 1);
        }
        String str2 = "";
        int i3 = 0;
        while (i2 < str.length()) {
            int i4 = i3 + 1;
            str2 = str2 + str.charAt(i2);
            if (i4 == this.a || i3 + 2 == this.b) {
                str2 = str2 + ((qg4) this.d).b;
            }
            i2++;
            i3 = i4;
        }
        return new gwj(new q80(str2), (t9d) this.e);
    }

    public void b(x79 x79Var) {
        int i;
        int i2 = x79Var.c;
        if (i2 > 4096) {
            Arrays.fill((x79[]) this.e, (Object) null);
            this.b = ((x79[]) this.e).length - 1;
            this.a = 0;
            this.c = 0;
            return;
        }
        int i3 = (this.c + i2) - 4096;
        if (i3 > 0) {
            int length = ((x79[]) this.e).length - 1;
            int i4 = 0;
            while (true) {
                i = this.b;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = ((x79[]) this.e)[length].c;
                i3 -= i5;
                this.c -= i5;
                this.a--;
                i4++;
                length--;
            }
            x79[] x79VarArr = (x79[]) this.e;
            int i6 = i + 1;
            System.arraycopy(x79VarArr, i6, x79VarArr, i6 + i4, this.a);
            this.b += i4;
        }
        int i7 = this.a + 1;
        x79[] x79VarArr2 = (x79[]) this.e;
        if (i7 > x79VarArr2.length) {
            x79[] x79VarArr3 = new x79[x79VarArr2.length * 2];
            System.arraycopy(x79VarArr2, 0, x79VarArr3, x79VarArr2.length, x79VarArr2.length);
            this.b = ((x79[]) this.e).length - 1;
            this.e = x79VarArr3;
            x79VarArr2 = x79VarArr3;
        }
        int i8 = this.b;
        this.b = i8 - 1;
        x79VarArr2[i8] = x79Var;
        this.a++;
        this.c += i2;
    }

    public void c(gc2 gc2Var) {
        d(gc2Var.h(), Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 0);
        ((x52) this.d).X0(gc2Var);
    }

    public void d(int i, int i2, int i3) {
        x52 x52Var = (x52) this.d;
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

    public vk4(x52 x52Var) {
        this.e = new x79[8];
        this.b = 7;
        this.d = x52Var;
    }
}
