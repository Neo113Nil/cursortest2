package expo.modules.webview;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DomWebView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.webview.DomWebView$evalSync$1", f = "DomWebView.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class DomWebView$evalSync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ int $deferredId;
    final /* synthetic */ String $source;
    int label;
    final /* synthetic */ DomWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DomWebView$evalSync$1(DomWebView domWebView, int i, String str, Continuation<? super DomWebView$evalSync$1> continuation) {
        super(2, continuation);
        this.this$0 = domWebView;
        this.$deferredId = i;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DomWebView$evalSync$1(this.this$0, this.$deferredId, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DomWebView$evalSync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object nativeJsiEvalSync;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DomWebView domWebView = this.this$0;
        int i2 = this.$deferredId;
        String str = this.$source;
        Intrinsics.checkNotNull(str);
        this.label = 1;
        nativeJsiEvalSync = domWebView.nativeJsiEvalSync(i2, str, this);
        return nativeJsiEvalSync == coroutine_suspended ? coroutine_suspended : nativeJsiEvalSync;
    }
}
