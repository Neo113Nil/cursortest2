package io.ktor.http.content;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lio/ktor/http/content/PartData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.content.MultipartKt$asFlow$1", f = "Multipart.kt", i = {0, 1}, l = {144, 145}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes.dex */
final class MultipartKt$asFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super PartData>, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiPartData $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultipartKt$asFlow$1(MultiPartData multiPartData, Continuation<? super MultipartKt$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = multiPartData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultipartKt$asFlow$1 multipartKt$asFlow$1 = new MultipartKt$asFlow$1(this.$this_asFlow, continuation);
        multipartKt$asFlow$1.L$0 = obj;
        return multipartKt$asFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super PartData> flowCollector, Continuation<? super Unit> continuation) {
        return ((MultipartKt$asFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:6:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        FlowCollector flowCollector2;
        PartData partData;
        Object readPart;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            this.L$0 = flowCollector;
            this.label = 1;
            readPart = this.$this_asFlow.readPart(this);
            if (readPart != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector2 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector2;
            this.L$0 = flowCollector;
            this.label = 1;
            readPart = this.$this_asFlow.readPart(this);
            if (readPart != coroutine_suspended) {
                flowCollector2 = flowCollector;
                obj = readPart;
                partData = (PartData) obj;
                if (partData != null) {
                    return Unit.INSTANCE;
                }
                this.L$0 = flowCollector2;
                this.label = 2;
            }
            return coroutine_suspended;
        }
        flowCollector2 = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        partData = (PartData) obj;
        if (partData != null) {
        }
    }
}
