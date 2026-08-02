package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.N0;
import com.plaid.internal.Q0;
import com.plaid.link.result.LinkExit;
import ei.AbstractC4212b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@SourceDebugExtension({"SMAP\nEmbeddedWebviewUrlParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddedWebviewUrlParser.kt\ncom/plaid/internal/url/EmbeddedWebviewUrlParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1271#2,2:93\n1285#2,4:95\n*S KotlinDebug\n*F\n+ 1 EmbeddedWebviewUrlParser.kt\ncom/plaid/internal/url/EmbeddedWebviewUrlParser\n*L\n82#1:93,2\n82#1:95,4\n*E\n"})
/* loaded from: classes3.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Q0.a f39605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbstractC4212b f39606b;

    public S0(@NotNull Q0.a listener, @NotNull AbstractC4212b json) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f39605a = listener;
        this.f39606b = json;
    }

    public final boolean a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("start_link")) {
                if (!jSONObject.has("open_url")) {
                    return false;
                }
                String string = jSONObject.getString("open_url");
                Q0.a aVar = this.f39605a;
                Intrinsics.checkNotNull(string);
                aVar.a(string);
                return true;
            }
            String jSONObject2 = jSONObject.getJSONObject("start_link").toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
            try {
                AbstractC4212b abstractC4212b = this.f39606b;
                N0.b.a();
                M0 a10 = ((N0) abstractC4212b.d(N0.a.f39384a, jSONObject2)).a();
                C3556a6.a.a(C3556a6.f39823a, "embeddedLinkSessionInfo: " + a10);
                this.f39605a.a(a10);
                return true;
            } catch (Zh.o e10) {
                C3556a6.a.b(C3556a6.f39823a, "Unable to parse start_link message: " + jSONObject2 + " " + e10.getMessage());
                return false;
            }
        } catch (JSONException e11) {
            C3556a6.a.b(C3556a6.f39823a, "Unable to parse internal event: " + str + ", error: " + e11.getMessage());
            return false;
        }
    }

    public final void b(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(StringsKt.replace$default(url, "plaidlink://", "https://", false, 4, (Object) null));
        String host = httpUrl.host();
        Set<String> queryParameterNames = httpUrl.queryParameterNames();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames, 10)), 16));
        Iterator<T> it = queryParameterNames.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String queryParameter = httpUrl.queryParameter((String) next);
            if (queryParameter != null) {
                str = queryParameter;
            }
            linkedHashMap.put(next, str);
        }
        String str2 = (String) linkedHashMap.get("event");
        if (Intrinsics.areEqual(host, "internal-event") && str2 != null) {
            if (a(str2)) {
                return;
            }
            C3556a6.a.b(C3556a6.f39823a, "failed to handle internal event: " + str2);
            return;
        }
        if (!Intrinsics.areEqual(host, "exit")) {
            C3556a6.a.b(C3556a6.f39823a, "unknown action: " + host + ", parsedUri: " + httpUrl);
            return;
        }
        Set<String> queryParameterNames2 = httpUrl.queryParameterNames();
        LinkedHashMap linkData = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(queryParameterNames2, 10)), 16));
        for (Object obj : queryParameterNames2) {
            String queryParameter2 = httpUrl.queryParameter((String) obj);
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            linkData.put(obj, queryParameter2);
        }
        try {
            Q0.a aVar = this.f39605a;
            Intrinsics.checkNotNullParameter(linkData, "linkData");
            aVar.a(LinkExit.INSTANCE.fromMap$link_sdk_release(linkData));
        } catch (NoSuchElementException unused) {
            this.f39605a.a(L2.b(new C3551a1("Failed to parse exit"), null));
        }
    }
}
