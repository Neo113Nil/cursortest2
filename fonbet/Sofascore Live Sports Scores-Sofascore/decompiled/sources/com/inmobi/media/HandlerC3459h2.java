package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class HandlerC3459h2 extends Handler {
    public final InMobiBanner a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HandlerC3459h2(InMobiBanner inMobiBanner) {
        super(r0);
        inMobiBanner.getClass();
        Looper mainLooper = Looper.getMainLooper();
        mainLooper.getClass();
        inMobiBanner.getClass();
        mainLooper.getClass();
        this.a = inMobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        message.getClass();
        if (message.what == 1) {
            this.a.refreshBanner$media_release();
        }
    }
}
