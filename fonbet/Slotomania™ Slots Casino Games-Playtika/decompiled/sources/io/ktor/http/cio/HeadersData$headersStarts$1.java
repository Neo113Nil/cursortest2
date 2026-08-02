package io.ktor.http.cio;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: HttpHeadersMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.HeadersData$headersStarts$1", f = "HttpHeadersMap.kt", i = {0, 0, 0, 0}, l = {264}, m = "invokeSuspend", n = {"$this$sequence", "arr", "joinedIndex", "localIndex"}, s = {"L$0", "L$2", "I$0", "I$1"})
/* loaded from: classes8.dex */
final class HeadersData$headersStarts$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HeadersData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HeadersData$headersStarts$1(HeadersData headersData, Continuation<? super HeadersData$headersStarts$1> continuation) {
        super(2, continuation);
        this.this$0 = headersData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HeadersData$headersStarts$1 headersData$headersStarts$1 = new HeadersData$headersStarts$1(this.this$0, continuation);
        headersData$headersStarts$1.L$0 = obj;
        return headersData$headersStarts$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
        return ((HeadersData$headersStarts$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0054 -> B:6:0x007a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0070 -> B:5:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0040 -> B:7:0x004a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SequenceScope sequenceScope;
        List list;
        Iterator it;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            sequenceScope = (SequenceScope) this.L$0;
            list = this.this$0.arrays;
            it = list.iterator();
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$1;
            int i4 = this.I$0;
            int[] iArr = (int[]) this.L$2;
            Iterator it2 = (Iterator) this.L$1;
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            int[] iArr2 = iArr;
            int i5 = i4;
            Iterator it3 = it2;
            int[] iArr3 = iArr2;
            sequenceScope = sequenceScope2;
            i3 += 6;
            i5 += 6;
            if (i3 < iArr3.length) {
                it = it3;
                i = i5;
                if (!it.hasNext()) {
                    iArr3 = (int[]) it.next();
                    i5 = i;
                    it3 = it;
                    i3 = 0;
                    if (i3 < iArr3.length) {
                        if (this.this$0.at(i5) != -1) {
                            this.L$0 = sequenceScope;
                            this.L$1 = it3;
                            this.L$2 = iArr3;
                            this.I$0 = i5;
                            this.I$1 = i3;
                            this.label = 1;
                            if (sequenceScope.yield(Boxing.boxInt(i5), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            int[] iArr4 = iArr3;
                            it2 = it3;
                            i4 = i5;
                            iArr = iArr4;
                            sequenceScope2 = sequenceScope;
                            int[] iArr22 = iArr;
                            int i52 = i4;
                            Iterator it32 = it2;
                            int[] iArr32 = iArr22;
                            sequenceScope = sequenceScope2;
                        }
                        i3 += 6;
                        i52 += 6;
                        if (i3 < iArr32.length) {
                        }
                    }
                } else {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
