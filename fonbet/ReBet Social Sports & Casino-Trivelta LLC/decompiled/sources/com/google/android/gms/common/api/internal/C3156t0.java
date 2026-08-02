package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.common.api.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3156t0 extends G {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.e f32586c;

    public C3156t0(com.google.android.gms.common.api.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f32586c = eVar;
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC3124d g(AbstractC3124d abstractC3124d) {
        return this.f32586c.doRead((com.google.android.gms.common.api.e) abstractC3124d);
    }

    @Override // com.google.android.gms.common.api.f
    public final AbstractC3124d h(AbstractC3124d abstractC3124d) {
        return this.f32586c.doWrite((com.google.android.gms.common.api.e) abstractC3124d);
    }

    @Override // com.google.android.gms.common.api.f
    public final Context k() {
        return this.f32586c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper l() {
        return this.f32586c.getLooper();
    }
}
