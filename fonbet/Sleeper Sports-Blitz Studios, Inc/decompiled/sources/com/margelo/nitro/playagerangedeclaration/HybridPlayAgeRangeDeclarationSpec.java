package com.margelo.nitro.playagerangedeclaration;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.jni.HybridData;
import com.margelo.nitro.core.HybridObject;
import com.margelo.nitro.core.Promise;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HybridPlayAgeRangeDeclarationSpec.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH'¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0014¨\u0006\u0014"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec;", "Lcom/margelo/nitro/core/HybridObject;", "<init>", "()V", "getPlayAgeRangeDeclaration", "Lcom/margelo/nitro/core/Promise;", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "requestDeclaredAgeRange", "Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "firstThresholdAge", "", "secondThresholdAge", "thirdThresholdAge", "(DLjava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/core/Promise;", InAppPurchaseConstants.METHOD_TO_STRING, "", "createCxxPart", "Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec$CxxPart;", "CxxPart", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HybridPlayAgeRangeDeclarationSpec extends HybridObject {
    protected static final String TAG = "HybridPlayAgeRangeDeclarationSpec";

    public abstract Promise<PlayAgeRangeDeclarationResult> getPlayAgeRangeDeclaration();

    public abstract Promise<DeclaredAgeRangeResult> requestDeclaredAgeRange(double firstThresholdAge, Double secondThresholdAge, Double thirdThresholdAge);

    @Override // com.margelo.nitro.core.HybridObject
    public String toString() {
        return "[HybridObject PlayAgeRangeDeclaration]";
    }

    /* compiled from: HybridPlayAgeRangeDeclarationSpec.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0015\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0007H\u0094 ¨\u0006\b"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec$CxxPart;", "Lcom/margelo/nitro/core/HybridObject$CxxPart;", "javaPart", "Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec;", "<init>", "(Lcom/margelo/nitro/playagerangedeclaration/HybridPlayAgeRangeDeclarationSpec;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static class CxxPart extends HybridObject.CxxPart {
        @Override // com.margelo.nitro.core.HybridObject.CxxPart
        protected native HybridData initHybrid();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CxxPart(HybridPlayAgeRangeDeclarationSpec javaPart) {
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
