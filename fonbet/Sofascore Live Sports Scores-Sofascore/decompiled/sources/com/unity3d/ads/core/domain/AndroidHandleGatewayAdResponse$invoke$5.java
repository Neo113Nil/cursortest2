package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import defpackage.a70;
import defpackage.fsf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.AdResponseOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidHandleGatewayAdResponse$invoke$5 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ fsf $adPlayer;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ AdResponseOuterClass.AdResponse $response;
    final /* synthetic */ CancellationException $t;
    int label;
    final /* synthetic */ AndroidHandleGatewayAdResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleGatewayAdResponse$invoke$5(AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse, CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, fsf fsfVar, rq3<? super AndroidHandleGatewayAdResponse$invoke$5> rq3Var) {
        super(2, rq3Var);
        this.this$0 = androidHandleGatewayAdResponse;
        this.$t = cancellationException;
        this.$opportunityId = byteString;
        this.$response = adResponse;
        this.$adPlayer = fsfVar;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidHandleGatewayAdResponse$invoke$5(this.this$0, this.$t, this.$opportunityId, this.$response, this.$adPlayer, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidHandleGatewayAdResponse$invoke$5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object cleanup;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = this.this$0;
            CancellationException cancellationException = this.$t;
            ByteString byteString = this.$opportunityId;
            AdResponseOuterClass.AdResponse adResponse = this.$response;
            AdPlayer adPlayer = (AdPlayer) this.$adPlayer.a;
            this.label = 1;
            cleanup = androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this);
            if (cleanup == lu3Var) {
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
