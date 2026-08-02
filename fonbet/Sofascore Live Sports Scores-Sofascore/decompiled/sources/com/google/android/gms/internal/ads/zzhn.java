package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.b1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhn extends zzhk {
    public final b1l e;
    public Uri f;
    public byte[] g;
    public int h;
    public int i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhn(byte[] bArr) {
        super(false);
        b1l b1lVar = new b1l(bArr, 26);
        this.e = b1lVar;
        zzguk.a(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        k(zzhwVar);
        this.f = zzhwVar.a;
        byte[] bArr = (byte[]) this.e.b;
        this.g = bArr;
        long j = zzhwVar.c;
        int length = bArr.length;
        if (j > length) {
            throw new zzht();
        }
        int i = (int) j;
        this.h = i;
        int i2 = length - i;
        this.i = i2;
        long j2 = zzhwVar.d;
        if (j2 != -1) {
            this.i = (int) Math.min(i2, j2);
        }
        this.j = true;
        l(zzhwVar);
        return j2 != -1 ? j2 : this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.h, bArr, i, min);
        this.h += min;
        this.i -= min;
        m(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        if (this.j) {
            this.j = false;
            n();
        }
        this.f = null;
        this.g = null;
    }
}
