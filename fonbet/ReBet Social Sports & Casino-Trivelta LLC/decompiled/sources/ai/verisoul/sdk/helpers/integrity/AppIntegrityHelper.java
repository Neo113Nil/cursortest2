package ai.verisoul.sdk.helpers.integrity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "", "syncAppIntegrityData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AppIntegrityHelper {
    @Nullable
    Object syncAppIntegrityData(@NotNull Continuation<? super Unit> continuation);
}
