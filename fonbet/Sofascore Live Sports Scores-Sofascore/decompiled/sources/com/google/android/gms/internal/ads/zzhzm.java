package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzm implements zzhfo {
    public final zzhfo a;
    public final byte[] b;
    public final byte[] c;

    public zzhzm(zzhfo zzhfoVar, byte[] bArr, byte[] bArr2) {
        this.a = zzhfoVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzhfo zzhfoVar = this.a;
        byte[] bArr4 = this.c;
        if (length == 0 && bArr4.length == 0) {
            zzhfoVar.c(bArr, bArr2);
        } else {
            if (!zzhpd.c(bArr3, bArr)) {
                defpackage.zzl.x("Invalid signature (output prefix mismatch)");
                return;
            }
            if (bArr4.length != 0) {
                bArr2 = zziat.a(bArr2, bArr4);
            }
            zzhfoVar.c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
