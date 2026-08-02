package com.google.android.gms.common;

import android.content.Context;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final String f32245a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32246b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f32247c;

    public /* synthetic */ J(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f32245a = str;
        this.f32246b = z10;
        this.f32247c = z13;
    }

    public final boolean a() {
        return this.f32247c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [N9.b, android.os.IBinder] */
    public final zzp b(Context context) {
        return new zzp(this.f32245a, this.f32246b, false, N9.d.i(context), false, true, false);
    }
}
