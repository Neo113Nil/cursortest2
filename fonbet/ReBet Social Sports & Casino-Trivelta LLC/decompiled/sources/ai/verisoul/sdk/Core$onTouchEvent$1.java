package ai.verisoul.sdk;

import Ph.P;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper;
import ai.verisoul.sdk.logger.Logger;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.Core$onTouchEvent$1", f = "Core.kt", i = {0}, l = {303}, m = "invokeSuspend", n = {"copy"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class Core$onTouchEvent$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    final /* synthetic */ MotionEvent $userMotionEvent;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Core$onTouchEvent$1(MotionEvent motionEvent, String str, Continuation<? super Core$onTouchEvent$1> continuation) {
        super(2, continuation);
        this.$userMotionEvent = motionEvent;
        this.$sessionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Core$onTouchEvent$1(this.$userMotionEvent, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Core$onTouchEvent$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0 != null) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        MotionEvent motionEvent;
        Throwable th2;
        GatherUserEventsHelper userInteractionHelper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MotionEvent motionEvent2 = null;
            try {
                motionEvent2 = MotionEvent.obtain(this.$userMotionEvent);
                userInteractionHelper = Core.INSTANCE.getUserInteractionHelper();
                String str = this.$sessionId;
                this.L$0 = motionEvent2;
                this.label = 1;
                if (userInteractionHelper.onUserTouchedScreen(motionEvent2, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                motionEvent = motionEvent2;
            } catch (Throwable th3) {
                motionEvent = motionEvent2;
                th2 = th3;
                Logger.INSTANCE.error("Verisoul-[Core]", "Error processing touch event: " + th2.getMessage());
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            motionEvent = (MotionEvent) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    Logger.INSTANCE.error("Verisoul-[Core]", "Error processing touch event: " + th2.getMessage());
                } finally {
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                }
            }
        }
    }
}
