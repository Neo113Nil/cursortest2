package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338mk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f14280a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14281b;

    public C0338mk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f14280a = systemTimeProvider;
        this.f14281b = systemTimeProvider.currentTimeMillis();
    }
}
