package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Map;

/* loaded from: classes2.dex */
public final class A2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3408z2 f33269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33270b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f33271c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33272d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f33273e;
    private final byte[] zzd;

    public /* synthetic */ A2(String str, InterfaceC3408z2 interfaceC3408z2, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        AbstractC3191o.m(interfaceC3408z2);
        this.f33269a = interfaceC3408z2;
        this.f33270b = i10;
        this.f33271c = th2;
        this.zzd = bArr;
        this.f33272d = str;
        this.f33273e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33269a.a(this.f33272d, this.f33270b, this.f33271c, this.zzd, this.f33273e);
    }
}
