package com.plaid.internal;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final I5 f39288a;

    @Inject
    public I(@NotNull I5 sdkVersionDetails) {
        Intrinsics.checkNotNullParameter(sdkVersionDetails, "sdkVersionDetails");
        this.f39288a = sdkVersionDetails;
    }
}
