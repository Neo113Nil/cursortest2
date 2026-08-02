package ai.verisoul.sdk.helpers.integrity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp", f = "AppIntegrityHelper.kt", i = {0, 0}, l = {38}, m = "syncAppIntegrityData", n = {"this", "integrityCheckStartTimestamp"}, s = {"L$0", "J$0"})
/* loaded from: classes.dex */
public final class AppIntegrityHelperImp$syncAppIntegrityData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppIntegrityHelperImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntegrityHelperImp$syncAppIntegrityData$1(AppIntegrityHelperImp appIntegrityHelperImp, Continuation<? super AppIntegrityHelperImp$syncAppIntegrityData$1> continuation) {
        super(continuation);
        this.this$0 = appIntegrityHelperImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.syncAppIntegrityData(this);
    }
}
