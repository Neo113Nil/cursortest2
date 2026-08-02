package com.braze.ui.inappmessage.views;

import android.window.BackEvent;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IInAppMessageBackEventListener.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/inappmessage/views/IInAppMessageBackEventListener;", "", "onBackStarted", "", "backEvent", "Landroid/window/BackEvent;", "onBackProgressed", "onBackCancelled", "onBackInvoked", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IInAppMessageBackEventListener {
    void onBackProgressed(BackEvent backEvent);

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackStarted$lambda$0() {
        return "IInAppMessageBackEventListener: onBackStarted() called.";
    }

    default void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.IInAppMessageBackEventListener$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackStarted$lambda$0;
                onBackStarted$lambda$0 = IInAppMessageBackEventListener.onBackStarted$lambda$0();
                return onBackStarted$lambda$0;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackCancelled$lambda$1() {
        return "IInAppMessageBackEventListener: onBackCancelled() called.";
    }

    default void onBackCancelled() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.IInAppMessageBackEventListener$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackCancelled$lambda$1;
                onBackCancelled$lambda$1 = IInAppMessageBackEventListener.onBackCancelled$lambda$1();
                return onBackCancelled$lambda$1;
            }
        }, 6, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static String onBackInvoked$lambda$2() {
        return "IInAppMessageBackEventListener: onBackInvoked() called.";
    }

    default void onBackInvoked() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.inappmessage.views.IInAppMessageBackEventListener$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onBackInvoked$lambda$2;
                onBackInvoked$lambda$2 = IInAppMessageBackEventListener.onBackInvoked$lambda$2();
                return onBackInvoked$lambda$2;
            }
        }, 6, (Object) null);
    }
}
