package com.google.android.gms.internal.ads;

import defpackage.v4n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzicq extends zzico {
    public final zzide a;

    public zzicq() {
        v4n v4nVar = zzide.i;
        this.a = new zzide(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzicq) && ((zzicq) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final zzico m(String str) {
        return (zzico) this.a.get(str);
    }
}
