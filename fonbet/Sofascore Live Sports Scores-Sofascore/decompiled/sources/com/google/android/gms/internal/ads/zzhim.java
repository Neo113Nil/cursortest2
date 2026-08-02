package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.fn0;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhim extends zzhga {
    public final zzhil a;
    public final String b;
    public final zzhik c;
    public final zzhga d;

    public /* synthetic */ zzhim(zzhil zzhilVar, String str, zzhik zzhikVar, zzhga zzhgaVar) {
        this.a = zzhilVar;
        this.b = str;
        this.c = zzhikVar;
        this.d = zzhgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.a != zzhil.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhim)) {
            return false;
        }
        zzhim zzhimVar = (zzhim) obj;
        return zzhimVar.c.equals(this.c) && zzhimVar.d.equals(this.d) && zzhimVar.b.equals(this.b) && zzhimVar.a.equals(this.a);
    }

    public final int hashCode() {
        return Objects.hash(zzhim.class, this.b, this.c, this.d, this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(fn0.b(String.valueOf(str).length(), 64, valueOf.length(), 27, valueOf2.length(), 11, valueOf3.length()) + 1);
        bf3.v(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", valueOf);
        bf3.v(sb, ", dekParametersForNewKeys: ", valueOf2, ", variant: ", valueOf3);
        sb.append(")");
        return sb.toString();
    }
}
