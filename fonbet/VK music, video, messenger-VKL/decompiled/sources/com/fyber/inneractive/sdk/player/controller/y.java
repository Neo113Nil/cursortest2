package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class y {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[VideoClickOrigin.values().length];
        b = iArr;
        try {
            iArr[VideoClickOrigin.STORE_PROMO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[VideoClickOrigin.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[VideoClickOrigin.APP_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        a = iArr2;
        try {
            iArr2[com.fyber.inneractive.sdk.player.enums.b.Start_in_progress.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Error.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Preparing.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            a[com.fyber.inneractive.sdk.player.enums.b.Seeking.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
