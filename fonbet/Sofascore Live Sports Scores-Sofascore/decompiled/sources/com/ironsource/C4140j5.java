package com.ironsource;

import com.ironsource.mediationsdk.d;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4140j5 implements Hb<String, d.a> {
    @Override // com.ironsource.Hb
    @NotNull
    public d.a a(@NotNull String str) {
        str.getClass();
        d.a a = com.ironsource.mediationsdk.d.b().a(new JSONObject(str));
        a.getClass();
        return a;
    }
}
