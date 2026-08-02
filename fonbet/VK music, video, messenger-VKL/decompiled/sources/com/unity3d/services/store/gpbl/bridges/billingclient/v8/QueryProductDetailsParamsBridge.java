package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.QueryProductDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;
import xsna.zr;

/* compiled from: QueryProductDetailsParamsBridge.kt */
/* loaded from: classes14.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    private static final String NEW_BUILDER_METHOD = "newBuilder";
    private final Object queryProductDetailsParamsInternalInstance;

    /* compiled from: QueryProductDetailsParamsBridge.kt */
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
            return QueryProductDetailsParams.class;
        }

        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public QueryProductDetailsParamsBridge(Object obj) {
        super(pn00.i(new Pair("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }
}
