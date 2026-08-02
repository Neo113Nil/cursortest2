package com.google.android.gms.internal.ads;

import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzinx implements zzinw, zzinq {
    public static final zzinx b = new zzinx(null);
    public final Object a;

    public zzinx(Object obj) {
        this.a = obj;
    }

    public static zzinx a(Object obj) {
        if (obj != null) {
            return new zzinx(obj);
        }
        yhk.s("instance cannot be null");
        return null;
    }

    public static zzinx b(Object obj) {
        return obj == null ? b : new zzinx(obj);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        return this.a;
    }
}
