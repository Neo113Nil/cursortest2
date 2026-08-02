package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhd extends zzhga {
    public final int a;
    public final zzhhc b;

    public /* synthetic */ zzhhd(int i, zzhhc zzhhcVar) {
        this.a = i;
        this.b = zzhhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.b != zzhhc.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhd)) {
            return false;
        }
        zzhhd zzhhdVar = (zzhhd) obj;
        return zzhhdVar.a == this.a && zzhhdVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(zzhhd.class, Integer.valueOf(this.a), 12, 16, this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(wt3.B(wt3.h(length, 30, length2, 10, length3), 15, String.valueOf(i).length(), 10));
        wt3.t(i, "AesGcm Parameters (variant: ", valueOf, ", 12-byte IV, 16-byte tag, and ", sb);
        sb.append("-byte key)");
        return sb.toString();
    }
}
