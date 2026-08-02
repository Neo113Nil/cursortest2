package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import gatewayprotocol.v1.AdResponseOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$invoke$3 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
    final /* synthetic */ LoadEvent $loadEvent;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$3(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, spj<? super AndroidHandleGatewayAdResponse$invoke$3> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$loadEvent = loadEvent;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleGatewayAdResponse$invoke$3(this.this$0, this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
            ByteString byteString = this.$opportunityId;
            AdResponseOuterClass.AdResponse adResponse = this.$response;
            AdPlayer adPlayer = this.$adPlayer.element;
            this.label = 1;
            cleanup = androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this);
            if (cleanup == coroutineSingletons) {
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

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidHandleGatewayAdResponse$invoke$3) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
