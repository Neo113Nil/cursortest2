package com.google.android.gms.cast.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp {
    public final int a;

    public zzp(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        return (this.a & i) == i;
    }

    public final boolean b() {
        return !(!a(32) || a(64) || a(128)) || a(64);
    }

    public final boolean c() {
        return b() || a(128);
    }
}
