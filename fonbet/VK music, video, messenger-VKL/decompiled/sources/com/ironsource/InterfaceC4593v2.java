package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4593v2 {
    static /* synthetic */ void a(InterfaceC4593v2 interfaceC4593v2, List list, Map map, String str, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionSuccess");
        }
        interfaceC4593v2.a(list, map, str, c4504q2, jSONObject, jSONObject2, i, j, i2, str2, (i3 & 1024) != 0 ? null : b);
    }

    void a(int i, String str);

    void a(int i, String str, int i2, String str2, long j, B b);

    void a(List<C4504q2> list, Map<String, I> map, String str, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b);

    static /* synthetic */ void a(InterfaceC4593v2 interfaceC4593v2, int i, String str, int i2, String str2, long j, B b, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuctionFailed");
        }
        interfaceC4593v2.a(i, str, i2, str2, j, (i3 & 32) != 0 ? null : b);
    }
}
