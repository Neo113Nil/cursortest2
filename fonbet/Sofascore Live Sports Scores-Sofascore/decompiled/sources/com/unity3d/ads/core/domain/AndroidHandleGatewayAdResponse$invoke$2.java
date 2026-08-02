package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@il4(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayAdResponse$invoke$2 extends hoi implements Function2<AllowedPiiOuterClass.AllowedPii, rq3<? super Unit>, Object> {
    final /* synthetic */ fsf $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$2(fsf fsfVar, rq3<? super AndroidHandleGatewayAdResponse$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.$adPlayer = fsfVar;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        AndroidHandleGatewayAdResponse$invoke$2 androidHandleGatewayAdResponse$invoke$2 = new AndroidHandleGatewayAdResponse$invoke$2(this.$adPlayer, rq3Var);
        androidHandleGatewayAdResponse$invoke$2.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, rq3<? super Unit> rq3Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$2) create(allowedPii, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
            AdPlayer adPlayer = (AdPlayer) this.$adPlayer.a;
            byte[] byteArray = allowedPii.toByteArray();
            byteArray.getClass();
            this.label = 1;
            if (adPlayer.onAllowedPiiChange(byteArray, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
