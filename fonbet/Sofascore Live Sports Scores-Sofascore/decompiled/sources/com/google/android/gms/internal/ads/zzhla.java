package com.google.android.gms.internal.ads;

import defpackage.a70;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhla implements zzhek {
    public final zzhek a;
    public final byte[] b;

    public zzhla(zzhek zzhekVar, byte[] bArr) {
        this.a = zzhekVar;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.b = bArr;
        } else {
            a70.p("identifier has an invalid length");
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzhek zzhekVar = this.a;
        if (length == 0) {
            return zzhekVar.c(bArr, bArr2);
        }
        if (zzhpd.c(bArr3, bArr)) {
            return zzhekVar.c(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        defpackage.zzl.x("wrong prefix");
        return null;
    }
}
