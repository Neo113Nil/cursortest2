package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzari implements zzarw {
    public final zzarh a;
    public final zzeu b = new zzeu(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public zzari(zzarh zzarhVar) {
        this.a = zzarhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void a(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.a.a(zzfjVar, zzagkVar, zzarvVar);
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void b(int i, zzeu zzeuVar) {
        int i2 = i & 1;
        int I = i2 != 0 ? zzeuVar.b + zzeuVar.I() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            zzeuVar.D(I);
            this.d = 0;
        }
        while (zzeuVar.B() > 0) {
            int i3 = this.d;
            zzeu zzeuVar2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int I2 = zzeuVar.I();
                    zzeuVar.D(zzeuVar.b - 1);
                    if (I2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(zzeuVar.B(), 3 - this.d);
                zzeuVar.F(this.d, min, zzeuVar2.a);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    zzeuVar2.D(0);
                    zzeuVar2.C(3);
                    zzeuVar2.E(1);
                    int I3 = zzeuVar2.I();
                    boolean z = (I3 & 128) != 0;
                    int I4 = zzeuVar2.I();
                    this.e = z;
                    int i5 = (((I3 & 15) << 8) | I4) + 3;
                    this.c = i5;
                    byte[] bArr = zzeuVar2.a;
                    if (bArr.length < i5) {
                        int length = bArr.length;
                        zzeuVar2.A(Math.min(4098, Math.max(i5, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(zzeuVar.B(), this.c - this.d);
                zzeuVar.F(this.d, min2, zzeuVar2.a);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        zzeuVar2.C(i7);
                    } else {
                        if (zzfm.h(0, i7, -1, zzeuVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        zzeuVar2.C(this.c - 4);
                    }
                    zzeuVar2.D(0);
                    this.a.i(zzeuVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.f = true;
    }
}
