package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjf {
    public final String a;
    public final zzv b;
    public final zzv c;
    public final int d;
    public final int e;

    public zzjf(String str, zzv zzvVar, zzv zzvVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            i2 = i2 == 0 ? 0 : i2;
            zzguk.a(z);
            zzguk.a(true ^ TextUtils.isEmpty(str));
            this.a = str;
            this.b = zzvVar;
            zzvVar2.getClass();
            this.c = zzvVar2;
            this.d = i;
            this.e = i2;
        }
        z = true;
        zzguk.a(z);
        zzguk.a(true ^ TextUtils.isEmpty(str));
        this.a = str;
        this.b = zzvVar;
        zzvVar2.getClass();
        this.c = zzvVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzjf.class == obj.getClass()) {
            zzjf zzjfVar = (zzjf) obj;
            if (this.d == zzjfVar.d && this.e == zzjfVar.e && this.a.equals(zzjfVar.a) && this.b.equals(zzjfVar.b) && this.c.equals(zzjfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + ((((this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.e) * 31)) * 31)) * 31);
    }
}
