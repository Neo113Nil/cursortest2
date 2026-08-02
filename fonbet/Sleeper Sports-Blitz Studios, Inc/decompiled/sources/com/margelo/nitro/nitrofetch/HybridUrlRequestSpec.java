package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridUrlRequestSpec.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00102\u00020\u0001:\u0002\u000f\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u0007\u001a\u00020\u0005H'J\b\u0010\b\u001a\u00020\u0005H'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014¨\u0006\u0011"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "start", "", "followRedirect", "read", "cancel", "isDone", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "createCxxPart", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec$CxxPart;", "CxxPart", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridUrlRequestSpec extends HybridObject {
    protected static final String TAG = "HybridUrlRequestSpec";

    public abstract void cancel();

    public abstract void followRedirect();

    public abstract boolean isDone();

    public abstract void read();

    public abstract void start();

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject UrlRequest]";
    }

    /* compiled from: HybridUrlRequestSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;", "<init>", "(Lcom/margelo/nitro/nitrofetch/HybridUrlRequestSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridUrlRequestSpec javaPart) {
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
