package com.margelo.nitro.mmkv;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridMMKVPlatformContextSpec.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u000b2\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H'J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0014¨\u0006\f"}, d2 = {"Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "getBaseDirectory", "", "getAppGroupDirectory", InAppPurchaseConstants.METHOD_TO_STRING, "createCxxPart", "Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec$CxxPart;", "CxxPart", "Companion", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridMMKVPlatformContextSpec extends HybridObject {
    protected static final String TAG = "HybridMMKVPlatformContextSpec";

    public abstract String getAppGroupDirectory();

    public abstract String getBaseDirectory();

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject MMKVPlatformContext]";
    }

    /* compiled from: HybridMMKVPlatformContextSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;", "<init>", "(Lcom/margelo/nitro/mmkv/HybridMMKVPlatformContextSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-mmkv_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridMMKVPlatformContextSpec javaPart) {
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
