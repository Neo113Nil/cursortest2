package ai.verisoul.sdk.helpers.integrity;

import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl", f = "AppIntegrityServiceImpl.kt", i = {0, 0, 0}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m = "getToken", n = {"this", "attempts", "maxAttempts"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
public final class AppIntegrityServiceImpl$getToken$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppIntegrityServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntegrityServiceImpl$getToken$1(AppIntegrityServiceImpl appIntegrityServiceImpl, Continuation<? super AppIntegrityServiceImpl$getToken$1> continuation) {
        super(continuation);
        this.this$0 = appIntegrityServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object token;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        token = this.this$0.getToken(this);
        return token;
    }
}
