package com.unity3d.services.ads.offerwall;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER, 83}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ boolean $placementAvailable;
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z, OfferwallAdapterBridge offerwallAdapterBridge, String str, rq3<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$1> rq3Var) {
        super(2, rq3Var);
        this.$placementAvailable = z;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r13.emit(r5, r12) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r13.emit(r5, r12) == r0) goto L28;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HashMap hashMap;
        b1d b1dVar;
        b1d b1dVar2;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            boolean z = this.$placementAvailable;
            OfferwallAdapterBridge offerwallAdapterBridge = this.this$0;
            if (z) {
                b1dVar2 = offerwallAdapterBridge._offerwallEventFlow;
                OfferwallEvent offerwallEvent = OfferwallEvent.REQUEST_SUCCESS;
                String str = this.$placementName;
                OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str == null ? "" : str, null, null, 12, null);
                this.label = 1;
            } else {
                hashMap = offerwallAdapterBridge.placementsMap;
                String str2 = this.$placementName;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.remove(str2);
                b1dVar = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent2 = OfferwallEvent.REQUEST_FAILED;
                String str3 = this.$placementName;
                OfferwallEventData offerwallEventData2 = new OfferwallEventData(offerwallEvent2, str3 == null ? "" : str3, null, null, 12, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
