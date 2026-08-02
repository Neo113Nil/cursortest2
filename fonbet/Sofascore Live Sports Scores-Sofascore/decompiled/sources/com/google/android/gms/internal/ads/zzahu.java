package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahu {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(zzagi zzagiVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        zzagiVar.h(0, 10, bArr);
        zzagiVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }

    public final void b(zzaht zzahtVar, long j, int i, int i2, int i3, zzahs zzahsVar) {
        zzguk.g("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                c(zzahtVar, zzahsVar);
            }
        }
    }

    public final void c(zzaht zzahtVar, zzahs zzahsVar) {
        if (this.c > 0) {
            zzahtVar.f(this.d, this.e, this.f, this.g, zzahsVar);
            this.c = 0;
        }
    }
}
