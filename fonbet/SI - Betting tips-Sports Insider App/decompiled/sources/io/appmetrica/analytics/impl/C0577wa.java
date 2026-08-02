package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577wa implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f14834a;

    /* renamed from: b, reason: collision with root package name */
    public final Td f14835b;

    public C0577wa(@NotNull Ze ze2, @NotNull Td td2) {
        this.f14834a = ze2;
        this.f14835b = td2;
    }

    @NotNull
    public final Td a() {
        return this.f14835b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f14834a.a(this.f14835b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f14834a.a(this.f14835b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.f14834a.b(this.f14835b, j).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i5) {
        this.f14834a.b(this.f14835b, i5).b();
    }
}
