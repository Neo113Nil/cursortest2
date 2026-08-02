package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzri {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzd e;
    public final int f;
    public final int g;

    public /* synthetic */ zzri(zzrh zzrhVar) {
        this.a = zzrhVar.a;
        this.b = zzrhVar.b;
        this.c = zzrhVar.c;
        this.d = zzrhVar.d;
        this.e = zzrhVar.e;
        this.f = zzrhVar.f;
        this.g = zzrhVar.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzri.class == obj.getClass()) {
            zzri zzriVar = (zzri) obj;
            if (this.a == zzriVar.a && this.b == zzriVar.b && this.c == zzriVar.c && this.d == zzriVar.d && this.f == zzriVar.f && this.g == zzriVar.g && this.e.equals(zzriVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.a);
        Integer valueOf2 = Integer.valueOf(this.b);
        Integer valueOf3 = Integer.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), bool, bool);
    }
}
