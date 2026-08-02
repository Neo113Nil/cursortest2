package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CIOMultipartDataBase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0, 1, 1}, l = {75, 82}, m = "partToData", n = {"part", "part", "headers"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class CIOMultipartDataBase$partToData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CIOMultipartDataBase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$partToData$1(CIOMultipartDataBase cIOMultipartDataBase, Continuation<? super CIOMultipartDataBase$partToData$1> continuation) {
        super(continuation);
        this.this$0 = cIOMultipartDataBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object partToData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        partToData = this.this$0.partToData(null, this);
        return partToData;
    }
}
