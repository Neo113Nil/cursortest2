package com.google.android.gms.internal.auth;

import android.net.Uri;
import defpackage.a70;
import defpackage.swn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcz {
    public final Uri a;
    public final String b = "";
    public final boolean c;

    public zzcz(Uri uri, boolean z, boolean z2) {
        this.a = uri;
        this.c = z2;
    }

    public final zzcz a() {
        if (this.b.isEmpty()) {
            return new zzcz(this.a, true, this.c);
        }
        a70.r("Cannot set GServices prefix and skip GServices");
        return null;
    }

    public final void b(long j) {
        new swn(this, Long.valueOf(j));
    }

    public final void c(boolean z) {
        new swn(this, Boolean.valueOf(z));
    }
}
