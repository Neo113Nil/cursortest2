package com.braze.ui.inappmessage;

import androidx.activity.F;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/braze/ui/inappmessage/DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1", "Landroidx/activity/F;", "", "handleOnBackPressed", "()V", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 extends F {
    public DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1() {
        super(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleOnBackPressed$lambda$0() {
        return "Fallback Back button intercepted by in-app message";
    }

    @Override // androidx.activity.F
    public void handleOnBackPressed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: k4.H0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleOnBackPressed$lambda$0;
                handleOnBackPressed$lambda$0 = DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1.handleOnBackPressed$lambda$0();
                return handleOnBackPressed$lambda$0;
            }
        }, 7, (Object) null);
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
    }
}
