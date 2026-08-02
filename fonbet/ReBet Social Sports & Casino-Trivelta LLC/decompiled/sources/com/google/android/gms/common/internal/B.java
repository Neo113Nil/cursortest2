package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC3138k;

/* loaded from: classes2.dex */
public final class B extends C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f32620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3138k f32621b;

    public B(Intent intent, InterfaceC3138k interfaceC3138k, int i10) {
        this.f32620a = intent;
        this.f32621b = interfaceC3138k;
    }

    @Override // com.google.android.gms.common.internal.C
    public final void a() {
        Intent intent = this.f32620a;
        if (intent != null) {
            this.f32621b.startActivityForResult(intent, 2);
        }
    }
}
