package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: CommonGetTransactionRequest.kt */
/* loaded from: classes14.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, spj<? super TransactionEventRequestOuterClass.TransactionEventRequest> spjVar) {
        CommonGetTransactionRequest$invoke$1 commonGetTransactionRequest$invoke$1;
        int i;
        TransactionEventRequestKt.Dsl _create;
        String str2;
        TransactionEventRequestKt.Dsl dsl;
        Object obj;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        TransactionEventRequestKt.Dsl dsl2;
        if (spjVar instanceof CommonGetTransactionRequest$invoke$1) {
            commonGetTransactionRequest$invoke$1 = (CommonGetTransactionRequest$invoke$1) spjVar;
            int i2 = commonGetTransactionRequest$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGetTransactionRequest$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = commonGetTransactionRequest$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonGetTransactionRequest$invoke$1.label;
                if (i != 0) {
                    a.a(obj2);
                    _create = TransactionEventRequestKt.Dsl.Companion._create(TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder());
                    DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
                    commonGetTransactionRequest$invoke$1.L$0 = list;
                    commonGetTransactionRequest$invoke$1.L$1 = str;
                    commonGetTransactionRequest$invoke$1.L$2 = transactionOrigin;
                    commonGetTransactionRequest$invoke$1.L$3 = _create;
                    commonGetTransactionRequest$invoke$1.L$4 = _create;
                    commonGetTransactionRequest$invoke$1.L$5 = _create;
                    commonGetTransactionRequest$invoke$1.label = 1;
                    Object staticDeviceInfo = deviceInfoRepository.staticDeviceInfo(commonGetTransactionRequest$invoke$1);
                    if (staticDeviceInfo == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                    dsl = _create;
                    obj = staticDeviceInfo;
                    list2 = list;
                    dsl2 = dsl;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl2 = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$5;
                    dsl = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$4;
                    TransactionEventRequestKt.Dsl dsl3 = (TransactionEventRequestKt.Dsl) commonGetTransactionRequest$invoke$1.L$3;
                    TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin2 = (TransactionEventRequestOuterClass.TransactionOrigin) commonGetTransactionRequest$invoke$1.L$2;
                    str2 = (String) commonGetTransactionRequest$invoke$1.L$1;
                    list2 = (List) commonGetTransactionRequest$invoke$1.L$0;
                    a.a(obj2);
                    _create = dsl3;
                    transactionOrigin = transactionOrigin2;
                    obj = obj2;
                }
                dsl2.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
                dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
                dsl.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
                dsl.setGooglePlayBillingLibraryVersion(str2);
                dsl.setOrigin(transactionOrigin);
                dsl.plusAssignAllTransactionData(dsl.getTransactionData(), list2);
                return _create._build();
            }
        }
        commonGetTransactionRequest$invoke$1 = new CommonGetTransactionRequest$invoke$1(this, spjVar);
        Object obj22 = commonGetTransactionRequest$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonGetTransactionRequest$invoke$1.label;
        if (i != 0) {
        }
        dsl2.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl.setGooglePlayBillingLibraryVersion(str2);
        dsl.setOrigin(transactionOrigin);
        dsl.plusAssignAllTransactionData(dsl.getTransactionData(), list2);
        return _create._build();
    }
}
