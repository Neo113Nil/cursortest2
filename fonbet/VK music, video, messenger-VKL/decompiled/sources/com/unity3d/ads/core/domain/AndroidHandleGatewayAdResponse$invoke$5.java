package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import gatewayprotocol.v1.AdResponseOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHandleGatewayAdResponse.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleGatewayAdResponse$invoke$5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$5(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, spj<? super AndroidHandleGatewayAdResponse$invoke$5> spjVar) {
        super(2, spjVar);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleGatewayAdResponse$invoke$5(this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            CancellationException cancellationException = this.$t;
            ByteString byteString = this.$opportunityId;
            AdResponseOuterClass.AdResponse adResponse = this.$response;
            AdPlayer adPlayer = this.$adPlayer.element;
            this.label = 1;
            cleanup = androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this);
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
        return ((AndroidHandleGatewayAdResponse$invoke$5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
