package io.ktor.http.cio;

import io.ktor.http.cio.internals.CharsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* compiled from: HttpHeadersMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.HttpHeadersMap$getAll$1", f = "HttpHeadersMap.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$sequence", "headerIndex"}, s = {"L$0", "I$0"})
/* loaded from: classes6.dex */
final class HttpHeadersMap$getAll$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super CharSequence>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $name;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HttpHeadersMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpHeadersMap$getAll$1(HttpHeadersMap httpHeadersMap, String str, Continuation<? super HttpHeadersMap$getAll$1> continuation) {
        super(2, continuation);
        this.this$0 = httpHeadersMap;
        this.$name = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HttpHeadersMap$getAll$1 httpHeadersMap$getAll$1 = new HttpHeadersMap$getAll$1(this.this$0, this.$name, continuation);
        httpHeadersMap$getAll$1.L$0 = obj;
        return httpHeadersMap$getAll$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super CharSequence> sequenceScope, Continuation<? super Unit> continuation) {
        return ((HttpHeadersMap$getAll$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r7.L$0 = r4;
        r7.I$0 = r1;
        r7.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (r4.yield(r7.this$0.valueAtOffset(r5), r7) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0085, code lost:
    
        if (r1 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0094, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:5:0x0077). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        SequenceScope sequenceScope;
        HeadersData headersData;
        boolean headerHasName;
        int i3;
        HeadersData headersData2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceScope sequenceScope2 = (SequenceScope) this.L$0;
            if (this.this$0.getSize() != 0) {
                int abs = Math.abs(CharsKt.hashCodeLowerCase$default(this.$name, 0, 0, 3, null));
                i = this.this$0.headerCapacity;
                i2 = abs % i;
                sequenceScope = sequenceScope2;
                while (true) {
                    headersData = this.this$0.headersData;
                    int i5 = i2 * 6;
                    if (headersData.at(i5) == -1) {
                        break;
                    }
                    headerHasName = this.this$0.headerHasName(this.$name, i5);
                    if (headerHasName) {
                        break;
                    }
                    i3 = this.this$0.headerCapacity;
                    i2 = (i2 + 1) % i3;
                }
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            sequenceScope = (SequenceScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            headersData2 = this.this$0.headersData;
            i2 = headersData2.at((i2 * 6) + 5);
        }
    }
}
