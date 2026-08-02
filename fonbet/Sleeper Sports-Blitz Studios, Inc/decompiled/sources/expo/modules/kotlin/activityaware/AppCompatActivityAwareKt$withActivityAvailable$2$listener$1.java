package expo.modules.kotlin.activityaware;

import androidx.appcompat.app.AppCompatActivity;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.objectweb.asm.Opcodes;

/* compiled from: AppCompatActivityAware.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"expo/modules/kotlin/activityaware/AppCompatActivityAwareKt$withActivityAvailable$2$listener$1", "Lexpo/modules/kotlin/activityaware/OnActivityAvailableListener;", "onActivityAvailable", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ACTIVITY, "Landroidx/appcompat/app/AppCompatActivity;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = Opcodes.ARETURN)
/* loaded from: classes8.dex */
public final class AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 implements OnActivityAvailableListener {
    final /* synthetic */ CancellableContinuation<R> $continuation;
    final /* synthetic */ Function1<AppCompatActivity, R> $onActivityAvailable;
    final /* synthetic */ AppCompatActivityAware $this_withActivityAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(CancellableContinuation<? super R> cancellableContinuation, AppCompatActivityAware appCompatActivityAware, Function1<? super AppCompatActivity, ? extends R> function1) {
        this.$continuation = cancellableContinuation;
        this.$this_withActivityAvailable = appCompatActivityAware;
        this.$onActivityAvailable = function1;
    }

    @Override // expo.modules.kotlin.activityaware.OnActivityAvailableListener
    public void onActivityAvailable(AppCompatActivity activity) {
        Object m13470constructorimpl;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.$continuation.isActive()) {
            this.$this_withActivityAvailable.removeOnActivityAvailableListener(this);
            Continuation continuation = this.$continuation;
            Function1<AppCompatActivity, R> function1 = this.$onActivityAvailable;
            try {
                Result.Companion companion = Result.INSTANCE;
                AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1 = this;
                m13470constructorimpl = Result.m13470constructorimpl(function1.invoke(activity));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            continuation.resumeWith(m13470constructorimpl);
        }
    }
}
