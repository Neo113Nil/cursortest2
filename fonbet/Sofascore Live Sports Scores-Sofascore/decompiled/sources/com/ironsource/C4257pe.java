package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4257pe extends IllegalArgumentException {

    @NotNull
    private final IronSourceError a;
    private final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4257pe(@NotNull IronSourceError ironSourceError) {
        super(ironSourceError.getErrorMessage());
        ironSourceError.getClass();
        this.a = ironSourceError;
        this.b = ironSourceError.getErrorCode();
    }

    @NotNull
    public final IronSourceError a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }
}
