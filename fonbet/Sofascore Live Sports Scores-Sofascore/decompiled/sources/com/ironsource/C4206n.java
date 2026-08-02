package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4206n extends C5 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    public C4206n(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str) {
        aVar.getClass();
        uuid.getClass();
        str.getClass();
        this.a = aVar;
        this.b = uuid;
        this.c = str;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        return a(new C4100h0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}
