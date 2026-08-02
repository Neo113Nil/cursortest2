package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.ironsource.sdk.utils.SDKUtils;
import defpackage.llf;
import defpackage.v6a;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4358v8 {

    @NotNull
    public static final C4358v8 a = new C4358v8();

    private C4358v8() {
    }

    @Nullable
    public static final String a() {
        JSONObject optJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(U3.a.c);
        Object opt = optJSONObject != null ? optJSONObject.opt(C4427z5.K) : null;
        if (opt == null || !(opt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) opt;
        IntRange j = llf.j(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        v6a it = j.iterator();
        while (it.c) {
            Object opt2 = jSONArray.opt(it.nextInt());
            if (opt2 != null) {
                arrayList.add(opt2);
            }
        }
        return CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
    }
}
