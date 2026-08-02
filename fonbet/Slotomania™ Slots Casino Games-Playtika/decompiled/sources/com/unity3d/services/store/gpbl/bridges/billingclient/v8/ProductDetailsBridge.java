package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ProductDetailsBridge.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\b\u0010\f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "(Ljava/lang/Object;)V", "getClassName", "", "getOriginalJson", "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", ProductDetailsBridge.TO_STRING_METHOD, k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(Object internalRef) {
        super(MapsKt.hashMapOf(TuplesKt.to(TO_STRING_METHOD, new Class[0])));
        Intrinsics.checkNotNullParameter(internalRef, "internalRef");
        this.internalRef = internalRef;
    }

    public String toString() {
        Object callNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        Intrinsics.checkNotNull(callNonVoidMethod, "null cannot be cast to non-null type kotlin.String");
        return (String) callNonVoidMethod;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    public JSONObject getOriginalJson() {
        try {
            String parseOriginalJson = parseOriginalJson(toString());
            return parseOriginalJson != null ? new JSONObject(parseOriginalJson) : new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final String parseOriginalJson(String productDetailsString) {
        try {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) productDetailsString, "jsonString='", 0, false, 6, (Object) null) + 12;
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) productDetailsString, "', parsedJson=", 0, false, 6, (Object) null);
            if (1 <= indexOf$default && indexOf$default < indexOf$default2) {
                String substring = productDetailsString.substring(indexOf$default, indexOf$default2);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringsKt.replace$default(substring, "\\/", "/", false, 4, (Object) null);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
