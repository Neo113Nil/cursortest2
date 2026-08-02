package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class W2 extends C4202md {

    @NotNull
    private final C4243p0 b;

    @NotNull
    private final ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(@NotNull C4243p0 c4243p0, @NotNull ISBannerSize iSBannerSize, @NotNull String str) {
        super(str);
        c4243p0.getClass();
        iSBannerSize.getClass();
        str.getClass();
        this.b = c4243p0;
        this.c = iSBannerSize;
    }

    @Override // com.ironsource.C4202md, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        LinkedHashMap q = tub.q(super.a(b0));
        this.b.a(q, this.c);
        return q;
    }
}
