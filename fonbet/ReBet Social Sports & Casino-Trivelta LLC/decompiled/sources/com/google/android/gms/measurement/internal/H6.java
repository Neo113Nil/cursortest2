package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class H6 implements InterfaceC3408z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f33446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S6 f33447c;

    public H6(S6 s62, String str, List list) {
        this.f33445a = str;
        this.f33446b = list;
        Objects.requireNonNull(s62);
        this.f33447c = s62;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3408z2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f33447c.A(true, i10, th2, bArr, this.f33445a, this.f33446b);
    }
}
