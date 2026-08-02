package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzavu implements zzavs {
    public int a = -1;
    public final byte[] b = new byte[8];
    public final zzavw c;

    public zzavu(zzavw zzavwVar) {
        this.c = zzavwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final zzawe a(zzawe zzaweVar, int i, int i2) {
        if (i < 0 || i > i2 || i2 > zzaweVar.a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr[i3] = b(zzaweVar, i);
            i++;
            i3++;
        }
        return zzawe.e(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final byte b(zzawe zzaweVar, int i) {
        int i2 = i >>> 3;
        int i3 = this.a;
        byte[] bArr = this.b;
        if (i2 != i3) {
            this.c.a(i2, bArr);
            this.a = i2;
        }
        return (byte) (((zzaweVar.b(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final /* bridge */ /* synthetic */ zzavs zzc() {
        return new zzavu(this.c);
    }
}
