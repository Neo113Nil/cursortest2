package com.braze.ui.actions.brazeactions.steps;

import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseBrazeActionStep.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "()V", k.M, "Lcom/braze/ui/actions/brazeactions/steps/AddToCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/AddToSubscriptionGroupStep;", "Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/LogCustomEventStep;", "Lcom/braze/ui/actions/brazeactions/steps/OpenLinkExternallyStep;", "Lcom/braze/ui/actions/brazeactions/steps/OpenLinkInWebViewStep;", "Lcom/braze/ui/actions/brazeactions/steps/RemoveFromCustomAttributeArrayStep;", "Lcom/braze/ui/actions/brazeactions/steps/RemoveFromSubscriptionGroupStep;", "Lcom/braze/ui/actions/brazeactions/steps/RequestPushPermissionStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetCustomUserAttributeStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetEmailSubscriptionStep;", "Lcom/braze/ui/actions/brazeactions/steps/SetPushNotificationSubscriptionStep;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseBrazeActionStep implements IBrazeActionStep {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BaseBrazeActionStep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: BaseBrazeActionStep.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u0004*\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\u0007H\u0000¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep$Companion;", "", "()V", "runOnUser", "", "Lcom/braze/Braze;", "block", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", "name", "user", "runOnUser$android_sdk_ui_release", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void runOnUser$android_sdk_ui_release(Braze braze, final Function1<? super BrazeUser, Unit> block) {
            Intrinsics.checkNotNullParameter(braze, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            braze.getCurrentUser(new IValueCallback<BrazeUser>() { // from class: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1
                @Override // com.braze.events.IValueCallback
                public void onSuccess(BrazeUser value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    block.invoke(value);
                }

                @Override // com.braze.events.IValueCallback
                public void onError() {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1$onError$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Failed to run on Braze user object";
                        }
                    }, 3, (Object) null);
                }
            });
        }
    }

    private BaseBrazeActionStep() {
    }
}
