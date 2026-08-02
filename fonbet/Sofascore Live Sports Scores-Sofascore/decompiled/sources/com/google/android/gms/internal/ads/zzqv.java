package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqv {
    public boolean a;
    public boolean b;
    public boolean c;

    public final zzqw a() {
        if (this.a || !(this.b || this.c)) {
            return new zzqw(this);
        }
        a70.r("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
