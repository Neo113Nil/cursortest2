package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ce0 extends v7a {
    public final /* synthetic */ int h;

    public /* synthetic */ ce0(int i) {
        this.h = i;
    }

    public static s36 K(j9e j9eVar) {
        String v = j9eVar.v();
        v.getClass();
        String v2 = j9eVar.v();
        v2.getClass();
        return new s36(v, v2, j9eVar.u(), j9eVar.u(), Arrays.copyOfRange(j9eVar.a, j9eVar.b, j9eVar.c));
    }

    @Override // defpackage.v7a
    public final ric l(wic wicVar, ByteBuffer byteBuffer) {
        switch (this.h) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                nm2 nm2Var = new nm2(byteBuffer.array(), byteBuffer.limit(), 3, (byte) 0);
                int i = 12;
                nm2Var.t(12);
                int f = (nm2Var.f() + nm2Var.i(12)) - 4;
                nm2Var.t(44);
                nm2Var.u(nm2Var.i(12));
                nm2Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (nm2Var.f() < f) {
                    nm2Var.t(48);
                    int i2 = nm2Var.i(8);
                    nm2Var.t(4);
                    int f2 = nm2Var.f() + nm2Var.i(i);
                    String str = null;
                    String str2 = null;
                    while (nm2Var.f() < f2) {
                        int i3 = nm2Var.i(8);
                        int i4 = nm2Var.i(8);
                        int f3 = nm2Var.f() + i4;
                        if (i3 == 2) {
                            int i5 = nm2Var.i(16);
                            nm2Var.t(8);
                            if (i5 == 3) {
                                while (nm2Var.f() < f3) {
                                    int i6 = nm2Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i6];
                                    nm2Var.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = nm2Var.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        nm2Var.u(nm2Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i4];
                            nm2Var.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        nm2Var.q(f3 * 8);
                    }
                    nm2Var.q(f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new ae0(i2, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ric(arrayList);
            default:
                return new ric(K(new j9e(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
