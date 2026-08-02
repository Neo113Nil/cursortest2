package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* renamed from: com.google.android.gms.common.api.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC3119a0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3123c0 f32434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3119a0(C3123c0 c3123c0, Looper looper) {
        super(looper);
        this.f32434a = c3123c0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            C3123c0.w(this.f32434a);
            return;
        }
        if (i10 == 2) {
            C3123c0.v(this.f32434a);
            return;
        }
        Log.w("GoogleApiClientImpl", "Unknown message id: " + i10);
    }
}
