package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes2.dex */
public final class p extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleApiAvailability f32786b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f32786b = googleApiAvailability;
        this.f32785a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.f32786b;
        int i11 = googleApiAvailability.i(this.f32785a);
        if (googleApiAvailability.m(i11)) {
            this.f32786b.u(this.f32785a, i11);
        }
    }
}
