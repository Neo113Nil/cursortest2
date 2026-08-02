package com.google.android.gms.common.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn {
    public final String a;
    public final String b;
    public final boolean c;

    public zzn(String str, String str2, boolean z) {
        Preconditions.f(str);
        this.a = str;
        Preconditions.f(str2);
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.a(this.a, zznVar.a) && Objects.a(this.b, zznVar.b) && Objects.a(null, null) && this.c == zznVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        Preconditions.i(null);
        throw null;
    }
}
