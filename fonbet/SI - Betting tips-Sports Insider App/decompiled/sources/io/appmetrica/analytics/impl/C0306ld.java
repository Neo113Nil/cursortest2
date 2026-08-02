package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306ld extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0356nd f14194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14195b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f14196c;

    public C0306ld(C0356nd c0356nd, String str, byte[] bArr) {
        this.f14194a = c0356nd;
        this.f14195b = str;
        this.f14196c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0356nd.a(this.f14194a).setSessionExtra(this.f14195b, this.f14196c);
    }
}
