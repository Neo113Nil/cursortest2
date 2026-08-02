package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabd {
    public final zzbg a;
    public final int[] b;

    public zzabd(zzbg zzbgVar, int[] iArr) {
        if (iArr.length == 0) {
            zzeh.f("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = zzbgVar;
        this.b = iArr;
    }
}
