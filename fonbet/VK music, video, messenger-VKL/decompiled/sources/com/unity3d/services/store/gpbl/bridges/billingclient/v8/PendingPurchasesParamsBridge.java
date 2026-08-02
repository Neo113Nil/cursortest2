package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.PendingPurchasesParams;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;
import xsna.zr;

/* compiled from: PendingPurchasesParamsBridge.kt */
/* loaded from: classes14.dex */
public final class PendingPurchasesParamsBridge extends GenericBridge {
    public static final Companion Companion = new Companion(null);
    public static final String NEW_BUILDER_METHOD_NAME = "newBuilder";
    private final Object pendingPurchasesParamsInternalInstance;

    /* compiled from: PendingPurchasesParamsBridge.kt */
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
            return PendingPurchasesParams.class;
        }

        public final PendingPurchasesParamsBuilderBridge newBuilder() {
            return new PendingPurchasesParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }

    public PendingPurchasesParamsBridge(Object obj) {
        super(pn00.i(new Pair("newBuilder", new Class[0])));
        this.pendingPurchasesParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PendingPurchasesParams";
    }

    public final Object getInternalClass() {
        return this.pendingPurchasesParamsInternalInstance;
    }
}
