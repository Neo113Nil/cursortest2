package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzme {
    public final long a;
    public final float b;
    public final long c;

    public /* synthetic */ zzme(zzmd zzmdVar) {
        this.a = zzmdVar.a;
        this.b = zzmdVar.b;
        this.c = zzmdVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzme)) {
            return false;
        }
        zzme zzmeVar = (zzme) obj;
        return this.a == zzmeVar.a && this.b == zzmeVar.b && this.c == zzmeVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
