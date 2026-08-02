package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L implements JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final Y f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final X f15314b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(@NotNull JSONObject jSONObject) {
        N n9;
        P p10;
        Q q;
        boolean extractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC0680o.f15387a);
        Y y5 = this.f15313a;
        X x10 = this.f15314b;
        x10.getClass();
        JSONObject optJSONObject = jSONObject.optJSONObject("screenshot");
        if (optJSONObject == null) {
            q = new Q();
            q.f15326a = new N();
            q.f15327b = new P();
            O o3 = new O();
            o3.f15321c = AbstractC0680o.f15388b;
            q.f15328c = o3;
        } else {
            Q q3 = new Q();
            x10.f15336a.getClass();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("api_captor_config");
            O o4 = null;
            if (optJSONObject2 == null) {
                n9 = null;
            } else {
                n9 = new N();
                Boolean optBooleanOrNull = JsonUtils.optBooleanOrNull(optJSONObject2, "enabled");
                if (optBooleanOrNull != null) {
                    n9.f15317a = optBooleanOrNull.booleanValue();
                }
            }
            if (n9 != null) {
                q3.f15326a = n9;
            }
            x10.f15337b.getClass();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("service_captor_config");
            if (optJSONObject3 == null) {
                p10 = null;
            } else {
                p10 = new P();
                Boolean optBooleanOrNull2 = JsonUtils.optBooleanOrNull(optJSONObject3, "enabled");
                if (optBooleanOrNull2 != null) {
                    p10.f15323a = optBooleanOrNull2.booleanValue();
                }
                Long optLongOrNull = JsonUtils.optLongOrNull(optJSONObject3, "delay_seconds");
                if (optLongOrNull != null) {
                    p10.f15324b = optLongOrNull.longValue();
                }
            }
            if (p10 != null) {
                q3.f15327b = p10;
            }
            x10.f15338c.getClass();
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("content_observer_captor_config");
            if (optJSONObject4 != null) {
                o4 = new O();
                Boolean optBooleanOrNull3 = JsonUtils.optBooleanOrNull(optJSONObject4, "enabled");
                if (optBooleanOrNull3 != null) {
                    o4.f15319a = optBooleanOrNull3.booleanValue();
                }
                JSONArray optJSONArray = optJSONObject4.optJSONArray("media_store_column_names");
                if (optJSONArray != null) {
                    IntRange d10 = zf.j.d(0, optJSONArray.length());
                    ArrayList arrayList = new ArrayList(kotlin.collections.v.k(d10, 10));
                    Iterator it = d10.iterator();
                    while (((zf.b) it).f25972c) {
                        arrayList.add(optJSONArray.getString(((kotlin.collections.i0) it).nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o4.f15321c = (String[]) array;
                }
                Long optLongOrNull2 = JsonUtils.optLongOrNull(optJSONObject4, "detect_window_seconds");
                if (optLongOrNull2 != null) {
                    o4.f15320b = optLongOrNull2.longValue();
                }
            }
            if (o4 != null) {
                q3.f15328c = o4;
            }
            q = q3;
        }
        return new J(extractFeature, y5.toModel(q));
    }

    @Nullable
    public final J b(@NotNull JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(@NotNull Y y5, @NotNull X x10) {
        this.f15313a = y5;
        this.f15314b = x10;
    }

    public /* synthetic */ L(Y y5, X x10, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new Y(null, null, null, 7, null) : y5, (i5 & 2) != 0 ? new X() : x10);
    }
}
