package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class R0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T0 f32389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(T0 t02, Looper looper) {
        super(looper);
        this.f32389a = t02;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        T0 t02;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        com.google.android.gms.common.api.h hVar = (com.google.android.gms.common.api.h) message.obj;
        obj = this.f32389a.f32394c;
        synchronized (obj) {
            try {
                t02 = this.f32389a.f32392a;
                T0 t03 = (T0) AbstractC3191o.m(t02);
                if (hVar == null) {
                    t03.h(new Status(13, "Transform returned null"));
                } else {
                    t03.g(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
