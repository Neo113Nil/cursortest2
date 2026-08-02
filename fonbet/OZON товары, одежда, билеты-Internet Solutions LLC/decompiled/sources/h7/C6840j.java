package h7;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbafq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbbq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcz;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbhf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbix;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvn;

/* renamed from: h7.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6840j extends zbuf implements zbvn {
    private static final C6840j zbb;
    private int zbd;
    private Object zbf;
    private boolean zbg;
    private zbix zbh;
    private boolean zbi;
    private zbhf zbj;
    private float zbk;
    private boolean zbl;
    private boolean zbm;
    private boolean zbo;
    private float zbp;
    private int zbq;
    private zbbq zbr;
    private int zbe = 0;
    private byte zbs = 2;
    private int zbn = -1;

    static {
        C6840j c6840j = new C6840j();
        zbb = c6840j;
        zbuf.zbD(C6840j.class, c6840j);
    }

    private C6840j() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zbs);
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0004\u000e\u0001\u0001\u0001\u000e\u000e\u0000\u0000\u0001\u0001м\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0006\u0005င\u0007\u0006ဇ\b\u0007ဇ\u0000\bခ\t\tင\n\nဇ\u0002\u000bဉ\u000b\fခ\u0004\rဇ\u0005\u000e<\u0000", new Object[]{"zbf", "zbe", "zbd", zbafq.class, "zbh", "zbj", "zbm", "zbn", "zbo", "zbg", "zbp", "zbq", "zbi", "zbr", "zbk", "zbl", zbcz.class});
        }
        if (i12 == 3) {
            return new C6840j();
        }
        if (i12 == 4) {
            return new C6838i();
        }
        if (i12 == 5) {
            return zbb;
        }
        this.zbs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
