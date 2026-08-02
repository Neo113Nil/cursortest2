package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.android.billingclient.api.QueryProductDetailsParams;
import com.unity3d.services.core.reflection.GenericBridge;
import defpackage.a70;
import defpackage.lnb;
import defpackage.tub;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "queryProductDetailsParamsInternalInstance", "", "<init>", "(Ljava/lang/Object;)V", "getQueryProductDetailsParamsInternalInstance", "()Ljava/lang/Object;", "getClassName", "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QueryProductDetailsParamsBridge extends GenericBridge {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String NEW_BUILDER_METHOD = "newBuilder";

    @Nullable
    private final Object queryProductDetailsParamsInternalInstance;

    public QueryProductDetailsParamsBridge(@Nullable Object obj) {
        super(tub.f(new Pair("newBuilder", new Class[0])));
        this.queryProductDetailsParamsInternalInstance = obj;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.QueryProductDetailsParams";
    }

    @Nullable
    public final Object getQueryProductDetailsParamsInternalInstance() {
        return this.queryProductDetailsParamsInternalInstance;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBridge$Companion;", "", "<init>", "()V", "getClassForParams", "Ljava/lang/Class;", "NEW_BUILDER_METHOD", "", "newBuilder", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/QueryProductDetailsParamsBuilderBridge;", "callNonVoidStaticMethod", "methodName", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object callNonVoidStaticMethod(String methodName) {
            Object invoke = getClassForParams().getMethod(methodName, null).invoke(null, null);
            if (invoke != null) {
                return invoke;
            }
            a70.r(lnb.o("Static method ", methodName, " returned null"));
            return null;
        }

        @NotNull
        public final Class<?> getClassForParams() {
            return QueryProductDetailsParams.class;
        }

        @NotNull
        public final QueryProductDetailsParamsBuilderBridge newBuilder() {
            return new QueryProductDetailsParamsBuilderBridge(callNonVoidStaticMethod("newBuilder"));
        }

        private Companion() {
        }
    }
}
