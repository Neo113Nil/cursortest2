package com.vk.push.core.deviceid;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DeviceIdRepositoryImpl.kt */
@b6l(c = "com.vk.push.core.deviceid.DeviceIdRepositoryImpl", f = "DeviceIdRepositoryImpl.kt", l = {TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "generateDeviceId")
/* loaded from: classes5.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceIdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DeviceIdRepositoryImpl deviceIdRepositoryImpl, spj<? super a> spjVar) {
        super(spjVar);
        this.this$0 = deviceIdRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$generateDeviceId(this.this$0, this);
    }
}
