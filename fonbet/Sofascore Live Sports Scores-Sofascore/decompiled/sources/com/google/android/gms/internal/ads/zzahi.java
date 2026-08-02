package com.google.android.gms.internal.ads;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzahi {
    public final zzahl a;
    public final zzahl b;

    public zzahi(zzahl zzahlVar, zzahl zzahlVar2) {
        this.a = zzahlVar;
        this.b = zzahlVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzahi.class != obj.getClass()) {
            return false;
        }
        zzahi zzahiVar = (zzahi) obj;
        return this.a.equals(zzahiVar.a) && this.b.equals(zzahiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        zzahl zzahlVar = this.a;
        String zzahlVar2 = zzahlVar.toString();
        zzahl zzahlVar3 = this.b;
        String concat = zzahlVar.equals(zzahlVar3) ? "" : ", ".concat(zzahlVar3.toString());
        return fc6.o(new StringBuilder(mz1.d(zzahlVar2.length() + 1, 1, concat)), U3.j.d, zzahlVar2, concat, U3.j.e);
    }
}
