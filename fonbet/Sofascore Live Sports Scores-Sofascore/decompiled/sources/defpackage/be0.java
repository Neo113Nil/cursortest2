package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class be0 extends g7a {
    @Override // defpackage.g7a
    public final Metadata s(vic vicVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        nm2 nm2Var = new nm2(byteBuffer.array(), byteBuffer.limit(), 2, (byte) 0);
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
                            Charset charset = xp2.a;
                            byte[] bArr = new byte[i6];
                            nm2Var.l(i6, bArr);
                            str = new String(bArr, charset);
                            int i7 = nm2Var.i(8);
                            for (int i8 = 0; i8 < i7; i8++) {
                                nm2Var.u(nm2Var.i(8));
                            }
                        }
                    }
                } else if (i3 == 21) {
                    Charset charset2 = xp2.a;
                    byte[] bArr2 = new byte[i4];
                    nm2Var.l(i4, bArr2);
                    str2 = new String(bArr2, charset2);
                }
                nm2Var.q(f3 * 8);
            }
            nm2Var.q(f2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(i2, str.concat(str2)));
            }
            i = 12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
