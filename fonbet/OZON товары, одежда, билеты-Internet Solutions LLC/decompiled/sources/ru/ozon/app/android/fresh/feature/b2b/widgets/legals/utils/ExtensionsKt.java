package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.utils;

import We.C;
import We.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "postData", "LWe/C;", "contentType", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "", "customDataCallback", "LWe/K;", "jsonToRequestBody", "(Ljava/lang/String;LWe/C;Lkotlin/jvm/functions/Function1;)LWe/K;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExtensionsKt {
    @NotNull
    public static final K jsonToRequestBody(@NotNull String postData, C c11, Function1<? super JSONObject, Unit> function1) {
        Intrinsics.checkNotNullParameter(postData, "postData");
        K.Companion companion = K.INSTANCE;
        JSONObject jSONObject = new JSONObject(postData);
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        companion.getClass();
        return K.Companion.b(jSONObject2, c11);
    }

    public static /* synthetic */ K jsonToRequestBody$default(String str, C c11, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            C.f33536g.getClass();
            c11 = C.a.b("application/json");
        }
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return jsonToRequestBody(str, c11, function1);
    }
}
