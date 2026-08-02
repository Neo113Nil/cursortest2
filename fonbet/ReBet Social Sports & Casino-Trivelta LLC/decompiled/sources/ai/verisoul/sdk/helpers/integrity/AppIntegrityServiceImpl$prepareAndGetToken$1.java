package ai.verisoul.sdk.helpers.integrity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl", f = "AppIntegrityServiceImpl.kt", i = {0}, l = {52, 55}, m = "prepareAndGetToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AppIntegrityServiceImpl$prepareAndGetToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppIntegrityServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntegrityServiceImpl$prepareAndGetToken$1(AppIntegrityServiceImpl appIntegrityServiceImpl, Continuation<? super AppIntegrityServiceImpl$prepareAndGetToken$1> continuation) {
        super(continuation);
        this.this$0 = appIntegrityServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object prepareAndGetToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prepareAndGetToken = this.this$0.prepareAndGetToken(this);
        return prepareAndGetToken;
    }
}
