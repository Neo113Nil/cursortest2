package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridNativeStorageSpec.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H'J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H'J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014¨\u0006\u0013"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "getString", "", SDKConstants.PARAM_KEY, "setString", "", "value", "removeString", "getSecureString", "setSecureString", "removeSecureString", InAppPurchaseConstants.METHOD_TO_STRING, "createCxxPart", "Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec$CxxPart;", "CxxPart", "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridNativeStorageSpec extends HybridObject {
    protected static final String TAG = "HybridNativeStorageSpec";

    public abstract String getSecureString(String key);

    public abstract String getString(String key);

    public abstract void removeSecureString(String key);

    public abstract void removeString(String key);

    public abstract void setSecureString(String key, String value);

    public abstract void setString(String key, String value);

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject NativeStorage]";
    }

    /* compiled from: HybridNativeStorageSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec;", "<init>", "(Lcom/margelo/nitro/nitrofetch/HybridNativeStorageSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridNativeStorageSpec javaPart) {
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
