package com.vk.push.core.filedatastore;

import androidx.car.app.hardware.common.CarZone;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
@b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl", f = "JsonSerializableFileDataStoreImpl.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER}, m = "writeUnsafe-gIAlu-s")
/* loaded from: classes.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonSerializableFileDataStoreImpl<JsonSerializer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl, spj<? super b> spjVar) {
        super(spjVar);
        this.this$0 = jsonSerializableFileDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m102access$writeUnsafegIAlus = JsonSerializableFileDataStoreImpl.m102access$writeUnsafegIAlus(this.this$0, null, this);
        return m102access$writeUnsafegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m102access$writeUnsafegIAlus : new Result(m102access$writeUnsafegIAlus);
    }
}
