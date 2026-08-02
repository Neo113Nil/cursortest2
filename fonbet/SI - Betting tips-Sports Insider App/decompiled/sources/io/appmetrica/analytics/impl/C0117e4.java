package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117e4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f13637a;

    public C0117e4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f13637a.elapsedRealtime();
    }

    public C0117e4(SystemTimeProvider systemTimeProvider) {
        this.f13637a = systemTimeProvider;
    }
}
