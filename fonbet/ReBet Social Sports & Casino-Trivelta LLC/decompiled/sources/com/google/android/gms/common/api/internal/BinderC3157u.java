package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC3132h;

/* renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class BinderC3157u extends InterfaceC3132h.a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3126e f32589a;

    public BinderC3157u(InterfaceC3126e interfaceC3126e) {
        this.f32589a = interfaceC3126e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3132h
    public void onResult(Status status) {
        this.f32589a.setResult(status);
    }
}
