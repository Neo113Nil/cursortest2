package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$invoke$2 extends SuspendLambda implements wzs<AllowedPiiOuterClass.AllowedPii, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$2(Ref$ObjectRef<AdPlayer> ref$ObjectRef, spj<? super AndroidHandleGatewayAdResponse$invoke$2> spjVar) {
        super(2, spjVar);
        this.$adPlayer = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        AndroidHandleGatewayAdResponse$invoke$2 androidHandleGatewayAdResponse$invoke$2 = new AndroidHandleGatewayAdResponse$invoke$2(this.$adPlayer, spjVar);
        androidHandleGatewayAdResponse$invoke$2.L$0 = obj;
        return androidHandleGatewayAdResponse$invoke$2;
    }

    @Override // xsna.wzs
    public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, spj<? super s3q0> spjVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$2) create(allowedPii, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
            AdPlayer adPlayer = this.$adPlayer.element;
            byte[] byteArray = allowedPii.toByteArray();
            this.label = 1;
            if (adPlayer.onAllowedPiiChange(byteArray, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
