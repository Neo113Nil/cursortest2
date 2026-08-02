package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznl {
    public static final zznl b = new zznl(new zznk());
    public final zzgxw a;

    public zznl(zznk zznkVar) {
        this.a = zznkVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zznl) && this.a.equals(((zznl) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
