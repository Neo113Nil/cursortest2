package com.google.android.gms.internal.ads;

import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsh extends Exception {
    public final int a;
    public final boolean b;
    public final zzv c;

    public zzsh(int i, zzv zzvVar, boolean z) {
        super(me4.g(i, "AudioTrack write failed: ", new StringBuilder(String.valueOf(i).length() + 25)));
        this.b = z;
        this.a = i;
        this.c = zzvVar;
    }
}
