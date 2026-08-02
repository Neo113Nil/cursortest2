package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.brm0;
import xsna.drm0;
import xsna.pn00;
import xsna.zcl;

/* compiled from: ProductDetailsBridge.kt */
/* loaded from: classes14.dex */
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {
    public static final Companion Companion = new Companion(null);
    private static final String TO_STRING_METHOD = "toString";
    private final Object internalRef;

    /* compiled from: ProductDetailsBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public ProductDetailsBridge(Object obj) {
        super(pn00.i(new Pair(TO_STRING_METHOD, new Class[0])));
        this.internalRef = obj;
    }

    private final String parseOriginalJson(String str) {
        try {
            int K = drm0.K(0, 6, str, "jsonString='", false) + 12;
            int K2 = drm0.K(0, 6, str, "', parsedJson=", false);
            if (1 > K || K >= K2) {
                return null;
            }
            return brm0.y(str.substring(K, K2), "\\/", DomExceptionUtils.SEPARATOR);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
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

    public String toString() {
        return (String) callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
    }
}
