package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2637re extends IllegalArgumentException {
    private final IronSourceError a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2637re(IronSourceError error) {
        super(error.getErrorMessage());
        Intrinsics.checkNotNullParameter(error, "error");
        this.a = error;
        this.b = error.getErrorCode();
    }

    public final IronSourceError a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
