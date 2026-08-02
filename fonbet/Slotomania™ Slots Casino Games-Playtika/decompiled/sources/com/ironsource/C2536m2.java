package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.m2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2536m2 {
    public static final b h = new b(null);
    private final String a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final C2608q2 c;
    private final JSONObject d;
    private final JSONObject e;
    private final C2429g2 f;
    private final C2625r2 g;

    /* renamed from: com.ironsource.m2$a */
    public static final class a {
        private final JSONObject a;
        private final String b;
        private final String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final C2608q2 e;
        private final JSONObject f;
        private final JSONObject g;
        private final C2429g2 h;
        private final C2625r2 i;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.a = auctionData;
            this.b = instanceId;
            JSONObject a = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a2 = a(auctionData, a);
            this.d = a2;
            this.e = c(a);
            this.f = d(a);
            this.g = b(a);
            this.h = a(a2, instanceId);
            this.i = b(a2, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C2536m2 a() {
            return new C2536m2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final JSONObject b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C2608q2 c(JSONObject jSONObject) {
            return new C2608q2(jSONObject);
        }

        private final C2625r2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C2608q2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            String k = a.k();
            Intrinsics.checkNotNullExpressionValue(k, "it.serverData");
            return new C2625r2(k);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? IronSourceNetworkBridge.jsonObjectInit() : optJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                IntRange until = RangesKt.until(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    C2608q2 c2608q2 = new C2608q2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c2608q2.n()) {
                        c2608q2 = null;
                    }
                    if (c2608q2 != null) {
                        arrayList2.add(c2608q2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C0216a(arrayList);
        }

        private final C2429g2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C2608q2 a = aVar.a(str);
            if (a == null) {
                return null;
            }
            C2429g2 c2429g2 = new C2429g2();
            c2429g2.a(a.b());
            c2429g2.c(a.h());
            c2429g2.b(a.g());
            return c2429g2;
        }
    }

    /* renamed from: com.ironsource.m2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C2536m2 c2536m2, String str) {
            String b = c2536m2.b();
            if (b != null && b.length() != 0) {
                if (c2536m2.i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.f())));
                }
                C2608q2 a = c2536m2.a(str);
                if (a == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.j())));
                }
                String k = a.k();
                if (k != null && k.length() != 0) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m11180constructorimpl(c2536m2);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.e())));
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m11180constructorimpl(ResultKt.createFailure(new C2327a8(C2682u5.a.i())));
        }
    }

    public C2536m2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C2608q2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C2429g2 c2429g2, C2625r2 c2625r2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c2429g2;
        this.g = c2625r2;
    }

    public final String a() {
        C2625r2 c2625r2 = this.g;
        if (c2625r2 != null) {
            return c2625r2.d();
        }
        return null;
    }

    public final String b() {
        return this.a;
    }

    public final C2429g2 c() {
        return this.f;
    }

    public final JSONObject d() {
        return this.e;
    }

    public final C2608q2 e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.d;
    }

    public final C2625r2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final C2608q2 a(String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final C2608q2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
