package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3160v0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f32590a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3158u0 f32591b;

    public C3160v0(AbstractC3158u0 abstractC3158u0) {
        this.f32591b = abstractC3158u0;
    }

    public final void a(Context context) {
        this.f32590a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f32590a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f32590a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f32591b.a();
            b();
        }
    }
}
