package com.google.android.gms.internal.wearable;

import defpackage.lvn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcs {
    public static final zzcs b = new zzcs(0);
    public final Map a;

    public zzcs() {
        this.a = new HashMap();
    }

    public final zzdf a(int i, zzel zzelVar) {
        return (zzdf) this.a.get(new lvn(i, zzelVar));
    }

    public zzcs(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
