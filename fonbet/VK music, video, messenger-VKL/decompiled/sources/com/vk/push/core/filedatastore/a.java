package com.vk.push.core.filedatastore;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: JsonSerializableFileDataStoreImpl.kt */
@b6l(c = "com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl", f = "JsonSerializableFileDataStoreImpl.kt", l = {100}, m = "readUnsafe-IoAF18A")
/* loaded from: classes.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonSerializableFileDataStoreImpl<JsonSerializer> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JsonSerializableFileDataStoreImpl<JsonSerializer> jsonSerializableFileDataStoreImpl, spj<? super a> spjVar) {
        super(spjVar);
        this.this$0 = jsonSerializableFileDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m101access$readUnsafeIoAF18A = JsonSerializableFileDataStoreImpl.m101access$readUnsafeIoAF18A(this.this$0, this);
        return m101access$readUnsafeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m101access$readUnsafeIoAF18A : new Result(m101access$readUnsafeIoAF18A);
    }
}
