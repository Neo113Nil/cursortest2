package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SetPushNotificationSubscriptionStep.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/SetPushNotificationSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "isValid", "", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SetPushNotificationSubscriptionStep extends BaseBrazeActionStep {
    public static final SetPushNotificationSubscriptionStep INSTANCE;
    private static final String TAG;

    private SetPushNotificationSubscriptionStep() {
        super(null);
    }

    static {
        SetPushNotificationSubscriptionStep setPushNotificationSubscriptionStep = new SetPushNotificationSubscriptionStep();
        INSTANCE = setPushNotificationSubscriptionStep;
        TAG = BrazeLogger.INSTANCE.brazeLogTag(setPushNotificationSubscriptionStep);
    }

    public final String getTAG() {
        return TAG;
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return StepData.isArgCountInBounds$default(data, 1, null, 2, null) && data.isArgString(0);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        final NotificationSubscriptionType fromValue = NotificationSubscriptionType.INSTANCE.fromValue(String.valueOf(data.getFirstArg()));
        if (fromValue == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep$run$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Could not parse subscription type from data ", StepData.this);
                }
            }, 3, (Object) null);
        } else {
            BaseBrazeActionStep.INSTANCE.runOnUser$android_sdk_ui_release(Braze.INSTANCE.getInstance(context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep$run$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setPushNotificationSubscriptionType(NotificationSubscriptionType.this);
                }
            });
        }
    }
}
