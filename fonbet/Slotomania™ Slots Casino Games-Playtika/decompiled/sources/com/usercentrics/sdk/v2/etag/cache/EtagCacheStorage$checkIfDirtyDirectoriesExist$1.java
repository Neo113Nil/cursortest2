package com.usercentrics.sdk.v2.etag.cache;

import com.usercentrics.sdk.v2.async.dispatcher.DispatcherScope;
import com.usercentrics.sdk.v2.file.IFileStorage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtagCacheStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/usercentrics/sdk/v2/async/dispatcher/DispatcherScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.etag.cache.EtagCacheStorage$checkIfDirtyDirectoriesExist$1", f = "EtagCacheStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class EtagCacheStorage$checkIfDirtyDirectoriesExist$1 extends SuspendLambda implements Function2<DispatcherScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EtagCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EtagCacheStorage$checkIfDirtyDirectoriesExist$1(EtagCacheStorage etagCacheStorage, Continuation<? super EtagCacheStorage$checkIfDirtyDirectoriesExist$1> continuation) {
        super(2, continuation);
        this.this$0 = etagCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EtagCacheStorage$checkIfDirtyDirectoriesExist$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DispatcherScope dispatcherScope, Continuation<? super Unit> continuation) {
        return ((EtagCacheStorage$checkIfDirtyDirectoriesExist$1) create(dispatcherScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IFileStorage iFileStorage;
        IFileStorage iFileStorage2;
        String defaultEtagPath;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            iFileStorage = this.this$0.fileStorage;
            List<String> ls = iFileStorage.ls("");
            if (ls == null) {
                return null;
            }
            EtagCacheStorage etagCacheStorage = this.this$0;
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj2 : ls) {
                defaultEtagPath = etagCacheStorage.defaultEtagPath();
                if (!Intrinsics.areEqual((String) obj2, defaultEtagPath)) {
                    arrayList.add(obj2);
                }
            }
            EtagCacheStorage etagCacheStorage2 = this.this$0;
            for (String str : arrayList) {
                iFileStorage2 = etagCacheStorage2.fileStorage;
                iFileStorage2.rmdir(str);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
