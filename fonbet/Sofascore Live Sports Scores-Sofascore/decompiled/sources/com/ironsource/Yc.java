package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yc implements G7 {

    @NotNull
    private final InterfaceC4407y3 a;

    @NotNull
    private ConcurrentHashMap<String, Long> b;

    public Yc(@NotNull InterfaceC4407y3 interfaceC4407y3) {
        interfaceC4407y3.getClass();
        this.a = interfaceC4407y3;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.G7
    @Nullable
    public Long a(@NotNull String str) {
        str.getClass();
        Long l = this.b.get(str);
        if (l != null) {
            return l;
        }
        Long b = this.a.b(str);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(str, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.G7
    public void a(long j, @NotNull String str) {
        str.getClass();
        this.b.put(str, Long.valueOf(j));
        this.a.a(str, j);
    }
}
