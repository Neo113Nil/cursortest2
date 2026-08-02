package com.google.android.gms.internal.pal;

import defpackage.a70;
import defpackage.jwo;
import defpackage.mwo;
import defpackage.r7n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznk extends zzpr {
    public static final byte[] c = new byte[0];

    public zznk() {
        super(zzuc.class, new jwo(zzjx.class));
    }

    public static zzoy d(int i, zzkk zzkkVar, byte[] bArr, int i2) {
        byte[] bArr2;
        int i3;
        zztv j = zztw.j();
        zzuh j2 = zzui.j();
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        zzui.o((zzui) j2.b);
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        zzui.p((zzui) j2.b);
        r7n u = zzaby.u(0, bArr.length, bArr);
        if (j2.c) {
            j2.j();
            j2.c = false;
        }
        ((zzui) j2.b).zzg = u;
        zzui zzuiVar = (zzui) j2.f();
        zzvs j3 = zzvt.j();
        zzvt zzvtVar = zzkkVar.a;
        String o = zzvtVar.o();
        if (j3.c) {
            j3.j();
            j3.c = false;
        }
        zzvt.p((zzvt) j3.b, o);
        zzaby m = zzvtVar.m();
        int m2 = m.m();
        if (m2 == 0) {
            bArr2 = zzadg.b;
        } else {
            byte[] bArr3 = new byte[m2];
            m.n(m2, bArr3);
            bArr2 = bArr3;
        }
        r7n u2 = zzaby.u(0, bArr2.length, bArr2);
        if (j3.c) {
            j3.j();
            j3.c = false;
        }
        ((zzvt) j3.b).zzf = u2;
        int r = zzvtVar.r() - 2;
        if (r == 1) {
            i3 = 1;
        } else if (r == 2) {
            i3 = 2;
        } else if (r == 3) {
            i3 = 3;
        } else {
            if (r != 4) {
                a70.p("Unknown output prefix type");
                return null;
            }
            i3 = 4;
        }
        int i4 = i3 - 1;
        int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 6 : 5 : 4 : 3;
        if (j3.c) {
            j3.j();
            j3.c = false;
        }
        ((zzvt) j3.b).zzg = zzwu.a(i5);
        zzvt zzvtVar2 = (zzvt) j3.f();
        zzts j4 = zztt.j();
        if (j4.c) {
            j4.j();
            j4.c = false;
        }
        ((zztt) j4.b).zze = zzvtVar2;
        zztt zzttVar = (zztt) j4.f();
        zzty j5 = zztz.j();
        if (j5.c) {
            j5.j();
            j5.c = false;
        }
        ((zztz) j5.b).zze = zzuiVar;
        if (j5.c) {
            j5.j();
            j5.c = false;
        }
        ((zztz) j5.b).zzf = zzttVar;
        if (j5.c) {
            j5.j();
            j5.c = false;
        }
        zztz.p((zztz) j5.b, i);
        zztz zztzVar = (zztz) j5.f();
        if (j.c) {
            j.j();
            j.c = false;
        }
        ((zztw) j.b).zze = zztzVar;
        return new zzoy((zztw) j.f(), i2);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final zzoz a() {
        return new mwo(10, zztw.class);
    }

    @Override // com.google.android.gms.internal.pal.zzpa
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }
}
