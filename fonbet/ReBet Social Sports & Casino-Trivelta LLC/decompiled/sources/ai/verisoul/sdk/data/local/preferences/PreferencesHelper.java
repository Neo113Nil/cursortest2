package ai.verisoul.sdk.data.local.preferences;

import ai.verisoul.sdk.helpers.session.SessionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lai/verisoul/sdk/data/local/preferences/PreferencesHelper;", "", "clearSession", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSession", "Lai/verisoul/sdk/helpers/session/SessionData;", "saveSession", "sessionData", "(Lai/verisoul/sdk/helpers/session/SessionData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PreferencesHelper {
    @Nullable
    Object clearSession(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getSession(@NotNull Continuation<? super SessionData> continuation);

    @Nullable
    Object saveSession(@NotNull SessionData sessionData, @NotNull Continuation<? super Unit> continuation);
}
