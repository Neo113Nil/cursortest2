package com.ironsource;

import defpackage.a70;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4316t2 {
    static /* synthetic */ void a(InterfaceC4316t2 interfaceC4316t2, List list, Map map, String str, C4227o2 c4227o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b, int i3, Object obj) {
        if (obj == null) {
            interfaceC4316t2.a(list, map, str, c4227o2, jSONObject, jSONObject2, i, j, i2, str2, (i3 & 1024) != 0 ? null : b);
        } else {
            a70.m("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
        }
    }

    void a(int i, @NotNull String str);

    void a(int i, @Nullable String str, int i2, @NotNull String str2, long j, @Nullable B b);

    void a(@NotNull List<C4227o2> list, @NotNull Map<String, I> map, @NotNull String str, @Nullable C4227o2 c4227o2, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, int i, long j, int i2, @Nullable String str2, @Nullable B b);

    static /* synthetic */ void a(InterfaceC4316t2 interfaceC4316t2, int i, String str, int i2, String str2, long j, B b, int i3, Object obj) {
        if (obj == null) {
            interfaceC4316t2.a(i, str, i2, str2, j, (i3 & 32) != 0 ? null : b);
        } else {
            a70.m("Super calls with default arguments not supported in this target, function: onAuctionFailed");
        }
    }
}
