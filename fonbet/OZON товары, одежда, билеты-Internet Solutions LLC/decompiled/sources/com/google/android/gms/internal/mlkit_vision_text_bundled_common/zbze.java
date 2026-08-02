package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* loaded from: classes9.dex */
public final class zbze extends zbuf implements zbvn {
    private static final zbze zbb;
    private int zbd;
    private String zbe = "";
    private String zbf = "";
    private String zbg = "";
    private int zbh;
    private int zbi;
    private zbyg zbj;
    private boolean zbk;
    private int zbl;
    private boolean zbm;
    private boolean zbn;
    private boolean zbo;
    private long zbp;

    static {
        zbze zbzeVar = new zbze();
        zbb = zbzeVar;
        zbuf.zbD(zbze.class, zbzeVar);
    }

    private zbze() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
    protected final Object zbb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zbuf.zbA(zbb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\b᠌\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဂ\u000b", new Object[]{"zbd", "zbe", "zbf", "zbg", "zbh", zbzh.zba, "zbi", "zbj", "zbk", "zbl", zbzi.zba, "zbm", "zbn", "zbo", "zbp"});
        }
        if (i12 == 3) {
            return new zbze();
        }
        zbwz zbwzVar = null;
        if (i12 == 4) {
            return new zbzd(zbwzVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zbb;
    }
}
