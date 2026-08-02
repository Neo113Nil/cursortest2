package com.google.android.gms.internal.pal;

import defpackage.jwo;
import defpackage.mwo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzoi extends zzpr {
    public zzoi() {
        super(zzvg.class, new jwo(zzjx.class));
    }

    public static zzoy d(int i, int i2, int i3, int i4) {
        zzvc j = zzvd.j();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzvd) j.b).zze = i - 2;
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzvd) j.b).zzf = i2 - 2;
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zzvd) j.b).zzg = i3 - 2;
        zzvd zzvdVar = (zzvd) j.f();
        zzuz j2 = zzva.j();
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        ((zzva) j2.b).zze = zzvdVar;
        return new zzoy((zzva) j2.f(), i4);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(11, zzva.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }
}
