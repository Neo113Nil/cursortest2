package com.google.android.gms.internal.pal;

import defpackage.jwo;
import defpackage.mwo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlo extends zzpa {
    public zzlo() {
        super(zzrv.class, new jwo(zzjt.class));
    }

    public static zzoy d(int i, int i2, int i3) {
        zzsd j = zzse.j();
        zzsg j2 = zzsh.j();
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        ((zzsh) j2.b).zze = 16;
        zzsh zzshVar = (zzsh) j2.f();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzse) j.b).zze = zzshVar;
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzse) j.b).zzf = i;
        zzse zzseVar = (zzse) j.f();
        zzur j3 = zzus.j();
        zzuu j4 = zzuv.j();
        if (j4.c) {
            j4.j();
            j4.c = false;
        }
        zzuv.o((zzuv) j4.b, 5);
        if (j4.c) {
            j4.j();
            j4.c = false;
        }
        ((zzuv) j4.b).zzf = i2;
        zzuv zzuvVar = (zzuv) j4.f();
        if (j3.c) {
            j3.j();
            j3.c = false;
        }
        ((zzus) j3.b).zze = zzuvVar;
        if (j3.c) {
            j3.j();
            j3.c = false;
        }
        ((zzus) j3.b).zzf = 32;
        zzus zzusVar = (zzus) j3.f();
        zzrx j5 = zzry.j();
        if (j5.c) {
            j5.j();
            j5.c = false;
        }
        ((zzry) j5.b).zze = zzseVar;
        if (j5.c) {
            j5.j();
            j5.c = false;
        }
        ((zzry) j5.b).zzf = zzusVar;
        return new zzoy((zzry) j5.f(), i3);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(0, zzry.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int c() {
        return 2;
    }
}
