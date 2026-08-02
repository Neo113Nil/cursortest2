package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame;
import defpackage.bf3;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajp extends zzajz {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public zzajp(String str, String str2, int i, byte[] bArr) {
        super(ApicFrame.ID);
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        zzamVar.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajp.class != obj.getClass()) {
            return false;
        }
        zzajp zzajpVar = (zzajp) obj;
        return this.d == zzajpVar.d && this.b.equals(zzajpVar.b) && Objects.equals(this.c, zzajpVar.c) && Arrays.equals(this.e, zzajpVar.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.c;
        return Arrays.hashCode(this.e) + ((((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode) * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        int length2 = str2.length();
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        bf3.v(sb, str, ": mimeType=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
