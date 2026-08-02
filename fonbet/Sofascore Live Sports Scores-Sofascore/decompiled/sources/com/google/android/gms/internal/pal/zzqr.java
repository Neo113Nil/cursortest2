package com.google.android.gms.internal.pal;

import defpackage.jwo;
import defpackage.mwo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqr extends zzpa {
    public zzqr() {
        super(zzup.class, new jwo(zzkq.class));
    }

    public static zzoy d(int i, int i2, int i3, int i4) {
        zzur j = zzus.j();
        zzuu j2 = zzuv.j();
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        zzuv.o((zzuv) j2.b, i3);
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        ((zzuv) j2.b).zzf = i2;
        zzuv zzuvVar = (zzuv) j2.f();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzus) j.b).zze = zzuvVar;
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzus) j.b).zzf = i;
        return new zzoy((zzus) j.f(), i4);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(13, zzus.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final int c() {
        return 2;
    }
}
