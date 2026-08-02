package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzioh {
    public final List a;
    public final List b;

    public zzioh(int i, int i2) {
        this.a = i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
        this.b = i2 == 0 ? Collections.EMPTY_LIST : new ArrayList(i2);
    }

    public final void a(zziof zziofVar) {
        this.a.add(zziofVar);
    }

    public final void b(zziof zziofVar) {
        this.b.add(zziofVar);
    }

    public final zzioi c() {
        return new zzioi(this.a, this.b);
    }
}
