package com.google.android.gms.internal.ads;

import defpackage.mz1;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzald implements zzao {
    public final float a;
    public final zzalc b;
    public final zzalc c;

    public zzald(float f, zzalc zzalcVar, zzalc zzalcVar2) {
        this.a = f;
        this.b = zzalcVar;
        this.c = zzalcVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzald)) {
            return false;
        }
        zzald zzaldVar = (zzald) obj;
        return Float.compare(this.a, zzaldVar.a) == 0 && Objects.equals(this.b, zzaldVar.b) && Objects.equals(this.c, zzaldVar.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        zzalc zzalcVar = this.b;
        int hashCode2 = (hashCode + (zzalcVar != null ? zzalcVar.hashCode() : 0)) * 31;
        zzalc zzalcVar2 = this.c;
        return hashCode2 + (zzalcVar2 != null ? zzalcVar2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        float f = this.a;
        int length = String.valueOf(f).length();
        StringBuilder sb = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb.append("ReplayGain Xing/Info: peak=");
        sb.append(f);
        sb.append(", field 1=");
        sb.append(valueOf);
        return mz1.o(sb, ", field 2=", valueOf2);
    }
}
