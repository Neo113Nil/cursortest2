package com.vk.push.core.utils;

import android.os.Handler;
import android.os.Looper;
import xsna.gzs;
import xsna.m67;
import xsna.s3q0;

/* compiled from: IdleHandler.kt */
/* loaded from: classes5.dex */
public final class IdleHandler {
    public static final IdleHandler INSTANCE = new IdleHandler();

    public final void post(gzs<s3q0> gzsVar) {
        new Handler(Looper.getMainLooper()).post(new m67(gzsVar, 5));
    }
}
