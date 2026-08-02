package com.ironsource;

import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2727we {
    private final Ve a;
    private final Fd b;
    private final Jd c;
    private final O3 d;
    private final L5 e;

    public C2727we(Ve fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.a = fullResponse;
        JSONObject optJSONObject = fullResponse.j().optJSONObject(C2745xe.a);
        this.b = new Fd(optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject);
        JSONObject optJSONObject2 = fullResponse.j().optJSONObject(C2745xe.b);
        this.c = new Jd(optJSONObject2 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject2);
        JSONObject optJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.d = new O3(optJSONObject3 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject3);
        JSONObject optJSONObject4 = fullResponse.j().optJSONObject(C2745xe.d);
        this.e = new L5(optJSONObject4 == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject4);
    }

    public final O3 a() {
        return this.d;
    }

    public final L5 b() {
        return this.e;
    }

    public final Ve c() {
        return this.a;
    }

    public final Fd d() {
        return this.b;
    }

    public final Jd e() {
        return this.c;
    }
}
