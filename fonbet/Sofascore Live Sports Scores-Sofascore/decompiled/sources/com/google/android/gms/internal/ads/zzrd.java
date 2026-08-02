package com.google.android.gms.internal.ads;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrd {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 0;

    public final zzre a() {
        if (this.a || !(this.b || this.c)) {
            return new zzre(this);
        }
        a70.r("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }
}
