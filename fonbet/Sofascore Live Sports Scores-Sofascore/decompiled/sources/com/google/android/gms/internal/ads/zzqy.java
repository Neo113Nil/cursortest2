package com.google.android.gms.internal.ads;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqy extends Exception {
    public final int a;
    public final boolean b;

    public zzqy(int i, boolean z) {
        super(me4.g(i, "AudioOutput write failed: ", new StringBuilder(String.valueOf(i).length() + 26)));
        this.b = z;
        this.a = i;
    }
}
