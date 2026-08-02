package com.reactnativecommunity.asyncstorage.next;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.reactnativecommunity.asyncstorage.next.StorageDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StorageSupplier.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativecommunity.asyncstorage.next.StorageDao$DefaultImpls", f = "StorageSupplier.kt", i = {0, 0}, l = {50, 65}, m = "mergeValues", n = {"$this", RemoteConfigConstants.ResponseFieldKey.ENTRIES}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class StorageDao$mergeValues$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    StorageDao$mergeValues$1(Continuation<? super StorageDao$mergeValues$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StorageDao.DefaultImpls.mergeValues(null, null, this);
    }
}
