package ai.verisoul.sdk.helpers.integrity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityService;", "", "checkAppIntegrity", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult;", "", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityError;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppIntegrityService {
    @Nullable
    Object checkAppIntegrity(@NotNull Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation);
}
