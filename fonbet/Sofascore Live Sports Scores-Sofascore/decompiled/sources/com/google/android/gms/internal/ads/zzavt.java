package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavt implements zzavs {
    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzawe a(zzawe zzaweVar, int i, int i2) {
        byte[] bArr;
        int length;
        byte[] bArr2;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzaweVar.a).length) || i > i2 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        if (i3 == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i, bArr3, 0, i3);
            bArr2 = bArr3;
        }
        return new zzawe(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final byte b(zzawe zzaweVar, int i) {
        return zzaweVar.b(i);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzavs zzc() {
        return new zzavt();
    }
}
