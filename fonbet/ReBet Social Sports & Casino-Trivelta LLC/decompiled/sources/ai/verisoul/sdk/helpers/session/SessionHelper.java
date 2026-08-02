package ai.verisoul.sdk.helpers.session;

import ai.verisoul.sdk.VerisoulEnvironment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH¦@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\fH¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0004¨\u0006\u0016"}, d2 = {"Lai/verisoul/sdk/helpers/session/SessionHelper;", "", "getSession", "Lai/verisoul/sdk/helpers/session/SessionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "", "initSessionId", "projectId", "env", "Lai/verisoul/sdk/VerisoulEnvironment;", "reinitialize", "", "(Ljava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedToGenerateAnewToken", "isNeedToSubmitDeviceData", "isNeedToSubmitPlayIntegrityData", "isNeedToSubmitTouchData", "", "setDeviceDataCollectionIsDone", "setPlayIntegrityIsDone", "setSubmitTouchDataIsDone", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SessionHelper {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object initSessionId$default(SessionHelper sessionHelper, String str, VerisoulEnvironment verisoulEnvironment, boolean z10, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initSessionId");
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return sessionHelper.initSessionId(str, verisoulEnvironment, z10, continuation);
        }
    }

    @Nullable
    Object getSession(@NotNull Continuation<? super SessionData> continuation);

    @Nullable
    Object getSessionId(@NotNull Continuation<? super String> continuation);

    @Nullable
    Object initSessionId(@NotNull String str, @NotNull VerisoulEnvironment verisoulEnvironment, boolean z10, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object isNeedToGenerateAnewToken(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isNeedToSubmitDeviceData(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isNeedToSubmitPlayIntegrityData(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isNeedToSubmitTouchData(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object reinitialize(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setDeviceDataCollectionIsDone(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPlayIntegrityIsDone(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setSubmitTouchDataIsDone(@NotNull Continuation<? super Unit> continuation);
}
