package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final void a(int i) {
        zzguk.f(!this.b);
        this.a.append(i, true);
    }

    public final zzs b() {
        zzguk.f(!this.b);
        this.b = true;
        return new zzs(this.a);
    }
}
