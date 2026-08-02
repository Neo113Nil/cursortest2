package ai.verisoul.sdk.helpers.sensor;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\u001e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "", "beginSession", "", "sessionId", "", "projectId", "checkIfAccelerometerDataShouldBeSend", "endSession", "onUserTouchedScreen", "motionEvent", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "sendInitialAccelerometerData", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface GatherUserEventsHelper {
    void beginSession(@NotNull String sessionId, @NotNull String projectId);

    void checkIfAccelerometerDataShouldBeSend(@NotNull String sessionId);

    void endSession();

    @Nullable
    Object onUserTouchedScreen(@NotNull MotionEvent motionEvent, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    void reset();

    void sendInitialAccelerometerData(@NotNull String sessionId);
}
