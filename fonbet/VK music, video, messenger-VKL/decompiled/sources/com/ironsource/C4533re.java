package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.re, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4533re extends IllegalArgumentException {
    private final IronSourceError a;
    private final int b;

    public C4533re(IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        this.a = ironSourceError;
        this.b = ironSourceError.getErrorCode();
    }

    public final IronSourceError a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
