package com.google.android.gms.internal.pal;

import defpackage.jwo;
import defpackage.mwo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzlu extends zzpa {
    public zzlu() {
        super(zzsk.class, new jwo(zzjt.class));
    }

    public static zzoy d(int i, int i2) {
        zzsm j = zzsn.j();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzsn) j.b).zzf = i;
        zzsp j2 = zzsq.j();
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        ((zzsq) j2.b).zze = 16;
        zzsq zzsqVar = (zzsq) j2.f();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzsn) j.b).zze = zzsqVar;
        return new zzoy((zzsn) j.f(), i2);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(2, zzsn.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }
}
