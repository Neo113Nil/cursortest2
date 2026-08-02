package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;
import java.util.List;

/* loaded from: classes9.dex */
public final class M0 extends zbuf implements zbvn {
    private static final M0 zbb;
    private int zbd;
    private int zbe;
    private String zbf = "";
    private zbun zbg = zbuf.zby();

    static {
        M0 m02 = new M0();
        zbb = m02;
        zbuf.zbD(M0.class, m02);
    }

    private M0() {
    }

    public static M0 c(byte[] bArr, zbtp zbtpVar) throws zbuq {
        return (M0) zbuf.zbu(zbb, bArr, zbtpVar);
    }

    public final int a() {
        return this.zbe;
    }

    public final String d() {
        return this.zbf;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"zbd", "zbe", "zbf", "zbg", C6828d.class});
        }
        if (i12 == 3) {
            return new M0();
        }
        if (i12 == 4) {
            return new L0();
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }

    public final List zbf() {
        return this.zbg;
    }
}
