package com.braze.ui.inappmessage;

import android.app.Activity;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppMessageBackEventHandler.kt */
@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/braze/ui/inappmessage/InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1", "Landroid/window/OnBackAnimationCallback;", "onBackInvoked", "", "onBackStarted", "backEvent", "Landroid/window/BackEvent;", "onBackProgressed", "onBackCancelled", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1 implements OnBackAnimationCallback {
    final /* synthetic */ Activity $it;
    final /* synthetic */ InAppMessageBackEventHandler this$0;

    InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1(Activity activity, InAppMessageBackEventHandler inAppMessageBackEventHandler) {
        this.$it = activity;
        this.this$0 = inAppMessageBackEventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackInvoked$lambda$0() {
        return "Back button intercepted by in-app message back animation callback, closing in-app message.";
    }

    public void onBackInvoked() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackInvoked$lambda$0;
                onBackInvoked$lambda$0 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackInvoked$lambda$0();
                return onBackInvoked$lambda$0;
            }
        }, 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        onBackInvokedDispatcher = this.$it.getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(ComponentDialog$$ExternalSyntheticApiModelOutline0.m13m((Object) this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackStarted$lambda$1() {
        return "Back button intercepted by in-app message back animation callback, back event started.";
    }

    public void onBackStarted(BackEvent backEvent) {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackStarted$lambda$1;
                onBackStarted$lambda$1 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackStarted$lambda$1();
                return onBackStarted$lambda$1;
            }
        }, 7, (Object) null);
        super.onBackStarted(backEvent);
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackStarted(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackProgressed$lambda$2() {
        return "Back button intercepted by in-app message back animation callback, back event in progress.";
    }

    public void onBackProgressed(BackEvent backEvent) {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackProgressed$lambda$2;
                onBackProgressed$lambda$2 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackProgressed$lambda$2();
                return onBackProgressed$lambda$2;
            }
        }, 7, (Object) null);
        super.onBackProgressed(backEvent);
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackProgressed(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBackCancelled$lambda$3() {
        return "Back button intercepted by in-app message back animation callback, back event cancelled.";
    }

    public void onBackCancelled() {
        IInAppMessageBackEventListener iInAppMessageBackEventListener;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackCancelled$lambda$3;
                onBackCancelled$lambda$3 = InAppMessageBackEventHandler$1$inAppMessageBackAnimationCallback$1.onBackCancelled$lambda$3();
                return onBackCancelled$lambda$3;
            }
        }, 7, (Object) null);
        super.onBackCancelled();
        iInAppMessageBackEventListener = this.this$0.inAppMessageView;
        if (iInAppMessageBackEventListener != null) {
            iInAppMessageBackEventListener.onBackCancelled();
        }
    }
}
