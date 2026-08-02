package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import defpackage.joa;
import defpackage.xqm;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3632nk {
    public static final joa a = ypa.b(new xqm(0));

    public static final void a(Runnable runnable) {
        runnable.getClass();
        ((Handler) a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
