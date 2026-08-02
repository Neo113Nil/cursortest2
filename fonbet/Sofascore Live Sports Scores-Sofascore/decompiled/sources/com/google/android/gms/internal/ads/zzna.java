package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzna {
    public final zzmz a;
    public final zzmy b;
    public int c;
    public Object d;
    public final Looper e;
    public boolean f;

    public zzna(zzmy zzmyVar, zzmz zzmzVar, Looper looper) {
        this.b = zzmyVar;
        this.a = zzmzVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }
}
