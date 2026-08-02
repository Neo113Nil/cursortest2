package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzav {
    public final ArrayList a = new ArrayList();

    public abstract zzao a(String str, zzg zzgVar, ArrayList arrayList);

    public final void b(String str) {
        if (!this.a.contains(zzh.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
