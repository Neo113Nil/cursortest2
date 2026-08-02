package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridNitroFetchClientSpec.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "request", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/nitrofetch/NitroResponse;", "req", "Lcom/margelo/nitro/nitrofetch/NitroRequest;", "prefetch", "", "requestSync", "cancelRequest", "requestId", "", InAppPurchaseConstants.METHOD_TO_STRING, "createCxxPart", "Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec$CxxPart;", "CxxPart", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridNitroFetchClientSpec extends HybridObject {
    protected static final String TAG = "HybridNitroFetchClientSpec";

    public abstract void cancelRequest(String requestId);

    public abstract Promise<Unit> prefetch(NitroRequest req);

    public abstract Promise<NitroResponse> request(NitroRequest req);

    public abstract NitroResponse requestSync(NitroRequest req);

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject NitroFetchClient]";
    }

    /* compiled from: HybridNitroFetchClientSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec;", "<init>", "(Lcom/margelo/nitro/nitrofetch/HybridNitroFetchClientSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridNitroFetchClientSpec javaPart) {
            super(javaPart);
            Intrinsics.checkNotNullParameter(javaPart, "javaPart");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.margelo.nitro.core.HybridObject
    public CxxPart createCxxPart() {
        return new CxxPart(this);
    }
}
