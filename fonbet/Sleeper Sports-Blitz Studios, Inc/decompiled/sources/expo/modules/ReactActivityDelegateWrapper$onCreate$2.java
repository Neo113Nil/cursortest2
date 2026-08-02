package expo.modules;

import android.os.Build;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactDelegate;
import expo.modules.core.interfaces.ReactActivityHandler;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.objectweb.asm.Opcodes;

/* compiled from: ReactActivityDelegateWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.ReactActivityDelegateWrapper$onCreate$2", f = "ReactActivityDelegateWrapper.kt", i = {}, l = {145, Opcodes.IF_ICMPLE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class ReactActivityDelegateWrapper$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ReactActivityDelegateWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactActivityDelegateWrapper$onCreate$2(ReactActivityDelegateWrapper reactActivityDelegateWrapper, Continuation<? super ReactActivityDelegateWrapper$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = reactActivityDelegateWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReactActivityDelegateWrapper$onCreate$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReactActivityDelegateWrapper$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (r8 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReactActivityHandler.DelayLoadAppHandler delayLoadAppHandler;
        Object awaitDelayLoadAppWhenReady;
        CompletableDeferred completableDeferred;
        Object loadAppImpl;
        ReactActivity reactActivity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ReactActivityDelegateWrapper reactActivityDelegateWrapper = this.this$0;
            delayLoadAppHandler = reactActivityDelegateWrapper.getDelayLoadAppHandler();
            this.label = 1;
            awaitDelayLoadAppWhenReady = reactActivityDelegateWrapper.awaitDelayLoadAppWhenReady(delayLoadAppHandler, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        completableDeferred = this.this$0.loadAppReady;
        completableDeferred.complete(Unit.INSTANCE);
        if (Build.VERSION.SDK_INT >= 26 && this.this$0.isWideColorGamutEnabled()) {
            reactActivity = this.this$0.activity;
            reactActivity.getWindow().setColorMode(1);
        }
        ReactDelegate reactDelegate = new ReactDelegate(this.this$0.getPlainActivity(), this.this$0.getReactHost(), this.this$0.getMainComponentName(), this.this$0.composeLaunchOptions());
        Field declaredField = ReactActivityDelegate.class.getDeclaredField("mReactDelegate");
        declaredField.setAccessible(true);
        declaredField.set(this.this$0.getDelegate(), reactDelegate);
        if (this.this$0.getMainComponentName() != null) {
            ReactActivityDelegateWrapper reactActivityDelegateWrapper2 = this.this$0;
            this.label = 2;
            loadAppImpl = reactActivityDelegateWrapper2.loadAppImpl(reactActivityDelegateWrapper2.getMainComponentName(), false, this);
        }
        return Unit.INSTANCE;
    }
}
