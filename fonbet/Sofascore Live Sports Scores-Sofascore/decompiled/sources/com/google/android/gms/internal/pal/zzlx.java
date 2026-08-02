package com.google.android.gms.internal.pal;

import defpackage.jwo;
import defpackage.mwo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlx extends zzpa {
    public zzlx() {
        super(zzst.class, new jwo(zzjt.class));
    }

    public static zzoy d(int i, int i2) {
        zzsv j = zzsw.j();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzsw) j.b).zze = i;
        return new zzoy((zzsw) j.f(), i2);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(3, zzsw.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int c() {
        return 2;
    }
}
