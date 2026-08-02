package com.vk.push.core.deviceid;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DeviceIdRepositoryImpl.kt */
@b6l(c = "com.vk.push.core.deviceid.DeviceIdRepositoryImpl", f = "DeviceIdRepositoryImpl.kt", l = {88, 92}, m = "saveToLocal")
/* loaded from: classes5.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeviceIdRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeviceIdRepositoryImpl deviceIdRepositoryImpl, spj<? super b> spjVar) {
        super(spjVar);
        this.this$0 = deviceIdRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DeviceIdRepositoryImpl.access$saveToLocal(this.this$0, null, this);
    }
}
