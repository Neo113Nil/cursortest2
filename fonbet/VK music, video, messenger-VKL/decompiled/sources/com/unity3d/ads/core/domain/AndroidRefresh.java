package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.myc0;
import xsna.ovj;
import xsna.spj;

/* compiled from: AndroidRefresh.kt */
/* loaded from: classes14.dex */
public final class AndroidRefresh implements Refresh {
    private final ovj defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(ovj ovjVar, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        this.defaultDispatcher = ovjVar;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.Refresh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(ByteString byteString, ByteString byteString2, spj<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> spjVar) {
        AndroidRefresh$invoke$1 androidRefresh$invoke$1;
        int i;
        if (spjVar instanceof AndroidRefresh$invoke$1) {
            androidRefresh$invoke$1 = (AndroidRefresh$invoke$1) spjVar;
            int i2 = androidRefresh$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidRefresh$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidRefresh$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidRefresh$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj ovjVar = this.defaultDispatcher;
                    AndroidRefresh$invoke$2 androidRefresh$invoke$2 = new AndroidRefresh$invoke$2(this, byteString2, byteString, null);
                    androidRefresh$invoke$1.label = 1;
                    obj = myc0.k(ovjVar, androidRefresh$invoke$2, androidRefresh$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return obj;
            }
        }
        androidRefresh$invoke$1 = new AndroidRefresh$invoke$1(this, spjVar);
        Object obj2 = androidRefresh$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidRefresh$invoke$1.label;
        if (i != 0) {
        }
        return obj2;
    }
}
