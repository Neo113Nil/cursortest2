package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4202md implements D0 {

    @NotNull
    private final String a;

    public C4202md(@NotNull String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.a);
        return hashMap;
    }
}
