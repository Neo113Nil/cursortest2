package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4253pa implements Re<JSONObject> {

    @NotNull
    private final Re<String> a;

    public C4253pa(@NotNull Re<String> re) {
        re.getClass();
        this.a = re;
    }

    @Override // com.ironsource.Re
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.a.a());
    }
}
