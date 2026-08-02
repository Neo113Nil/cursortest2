package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.sf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4311sf implements N8 {

    @NotNull
    private final InterfaceC4407y3 a;

    @NotNull
    private ConcurrentHashMap<String, Integer> b;

    @NotNull
    private ConcurrentHashMap<String, Long> c;

    public C4311sf(@NotNull InterfaceC4407y3 interfaceC4407y3) {
        interfaceC4407y3.getClass();
        this.a = interfaceC4407y3;
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.N8
    public int a(@NotNull String str) {
        str.getClass();
        Integer num = this.b.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer c = this.a.c(str);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.b;
        if (c == null) {
            concurrentHashMap.put(str, 0);
            return 0;
        }
        int intValue = c.intValue();
        concurrentHashMap.put(str, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.ironsource.N8
    @Nullable
    public Long b(@NotNull String str) {
        str.getClass();
        Long l = this.c.get(str);
        if (l != null) {
            return l;
        }
        Long a = this.a.a(str);
        if (a == null) {
            return null;
        }
        long longValue = a.longValue();
        this.c.put(str, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.N8
    public void a(int i, @NotNull String str) {
        str.getClass();
        this.b.put(str, Integer.valueOf(i));
        this.a.a(str, i);
    }

    @Override // com.ironsource.N8
    public void a(long j, @NotNull String str) {
        str.getClass();
        this.c.put(str, Long.valueOf(j));
        this.a.b(str, j);
    }
}
