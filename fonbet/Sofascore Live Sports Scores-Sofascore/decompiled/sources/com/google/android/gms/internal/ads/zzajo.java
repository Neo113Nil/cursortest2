package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.bf3;
import defpackage.wt3;
import defpackage.x5n;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajo implements zzao {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public zzajo(int i, int i2, String str, String str2, String str3, boolean z) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzguk.a(z2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        String str = this.c;
        if (str != null) {
            zzamVar.y = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            zzamVar.x = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajo.class == obj.getClass()) {
            zzajo zzajoVar = (zzajo) obj;
            if (this.a == zzajoVar.a && Objects.equals(this.b, zzajoVar.b) && Objects.equals(this.c, zzajoVar.c) && Objects.equals(this.d, zzajoVar.d) && this.e == zzajoVar.e && this.f == zzajoVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.c;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + hashCode;
        String str3 = this.d;
        return (((((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        int length2 = String.valueOf(str2).length();
        int i = this.a;
        int length3 = String.valueOf(i).length();
        int i2 = this.f;
        StringBuilder sb = new StringBuilder(wt3.h(length, 28, length2, 11, length3) + 19 + String.valueOf(i2).length());
        bf3.v(sb, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return x5n.n(sb, i, "\", bitrate=", i2, ", metadataInterval=");
    }
}
