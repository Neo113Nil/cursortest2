package com.unity3d.services.ads.offerwall;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import java.util.HashMap;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: OfferwallAdapterBridge.kt */
@b6l(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 83}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z, OfferwallAdapterBridge offerwallAdapterBridge, String str, spj<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$1> spjVar) {
        super(2, spjVar);
        this.$placementAvailable = z;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r12.emit(r4, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r12.emit(r3, r11) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        sh50 sh50Var;
        sh50 sh50Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            if (this.$placementAvailable) {
                sh50Var2 = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent = OfferwallEvent.REQUEST_SUCCESS;
                String str = this.$placementName;
                OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str == null ? "" : str, null, null, 12, null);
                this.label = 1;
            } else {
                hashMap = this.this$0.placementsMap;
                String str2 = this.$placementName;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.remove(str2);
                sh50Var = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent2 = OfferwallEvent.REQUEST_FAILED;
                String str3 = this.$placementName;
                if (str3 == null) {
                    str3 = "";
                }
                OfferwallEventData offerwallEventData2 = new OfferwallEventData(offerwallEvent2, str3, null, null, 12, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
