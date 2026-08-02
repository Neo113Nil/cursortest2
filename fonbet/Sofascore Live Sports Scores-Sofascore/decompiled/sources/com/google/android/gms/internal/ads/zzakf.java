package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzakf extends zzajz {
    public final String b;
    public final String c;

    public zzakf(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzakf.class != obj.getClass()) {
            return false;
        }
        zzakf zzakfVar = (zzakf) obj;
        return this.a.equals(zzakfVar.a) && Objects.equals(this.b, zzakfVar.b) && this.c.equals(zzakfVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.b;
        return this.c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String str = this.a;
        int length = str.length() + 6;
        String str2 = this.c;
        return wt3.m(str, ": url=", new StringBuilder(str2.length() + length), str2);
    }
}
