package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class I6 implements InterfaceC3408z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f33466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V6 f33467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S6 f33468c;

    public I6(S6 s62, String str, V6 v62) {
        this.f33466a = str;
        this.f33467b = v62;
        Objects.requireNonNull(s62);
        this.f33468c = s62;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3408z2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f33468c.v(this.f33466a, i10, th2, bArr, this.f33467b);
    }
}
