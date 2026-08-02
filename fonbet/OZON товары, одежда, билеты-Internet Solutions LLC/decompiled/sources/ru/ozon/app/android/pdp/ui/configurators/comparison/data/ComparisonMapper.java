package ru.ozon.app.android.pdp.ui.configurators.comparison.data;

import Lm0.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonMapper;", "", "<init>", "()V", "mapParams", "", "", "", "params", "mapRemoveParams", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/comparison/data/ComparisonMapper$Companion;", "", "<init>", "()V", "SKU", "", "QUANTITY", "DIFF", "EMPTY_STRING", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final Map<String, Long> mapParams(@NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        String str = params.get("sku");
        Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        return valueOf != null ? U.i(new Pair("sku", valueOf)) : U.c();
    }

    @NotNull
    public final String mapRemoveParams(@NotNull String params) {
        Intrinsics.checkNotNullParameter(params, "params");
        JSONObject jSONObject = new JSONObject(params);
        try {
            Object obj = jSONObject.get("sku");
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
            jSONObject.put("sku", Long.parseLong((String) obj));
            Object obj2 = jSONObject.get("quantity");
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
            jSONObject.put("quantity", Integer.parseInt((String) obj2));
            Object obj3 = jSONObject.get("diff");
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
            jSONObject.put("diff", Integer.parseInt((String) obj3));
            return jSONObject.toString();
        } catch (JSONException e11) {
            a.f17149a.d(e11);
            return "";
        }
    }
}
