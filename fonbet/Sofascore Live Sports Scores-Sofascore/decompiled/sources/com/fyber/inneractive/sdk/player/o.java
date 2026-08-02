package com.fyber.inneractive.sdk.player;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        a = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
