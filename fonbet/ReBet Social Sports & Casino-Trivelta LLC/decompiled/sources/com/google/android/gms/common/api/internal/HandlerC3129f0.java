package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* renamed from: com.google.android.gms.common.api.internal.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC3129f0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3131g0 f32480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3129f0(C3131g0 c3131g0, Looper looper) {
        super(looper);
        this.f32480a = c3131g0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((AbstractC3127e0) message.obj).b(this.f32480a);
        } else {
            if (i10 == 2) {
                throw ((RuntimeException) message.obj);
            }
            Log.w("GACStateManager", "Unknown message id: " + i10);
        }
    }
}
