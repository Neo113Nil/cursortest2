package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.QueryPurchasesParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;
import xsna.zr;

/* compiled from: QueryPurchasesParamsBridge.kt */
/* loaded from: classes14.dex */
public final class QueryPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryPurchasesParamsBridgeInternalInstance;

    /* compiled from: QueryPurchasesParamsBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final Object callNonVoidStaticMethod(String str) {
            Object invoke = getClassForParams().getMethod(str, null).invoke(null, null);
            if (invoke != null) {
                return invoke;
            }
            throw new IllegalStateException(zr.a("Static method ", str, " returned null"));
        }

        public final Class<?> getClassForParams() {
            return QueryPurchasesParams.class;
        }

        public final QueryPurchasesParamsBuilderBridge newBuilder() {
            return new QueryPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryPurchasesParamsBridge(Object obj) {
        super(pn00.i(new Pair("newBuilder", new Class[0])));
        this.queryPurchasesParamsBridgeInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryPurchasesParams";
    }

    public final Object getQueryPurchasesParamsBridgeInternalInstance() {
        return this.queryPurchasesParamsBridgeInternalInstance;
    }
}
