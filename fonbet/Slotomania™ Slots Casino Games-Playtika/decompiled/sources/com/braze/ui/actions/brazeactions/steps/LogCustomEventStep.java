package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.Braze;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: LogCustomEventStep.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/LogCustomEventStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "()V", "isValid", "", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogCustomEventStep extends BaseBrazeActionStep {
    public static final LogCustomEventStep INSTANCE = new LogCustomEventStep();

    private LogCustomEventStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return StepData.isArgCountInBounds$default(data, 0, new IntRange(1, 2), 1, null) && data.isArgString(0) && data.isArgOptionalJsonObject(1);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Braze.INSTANCE.getInstance(context).logCustomEvent(String.valueOf(data.getFirstArg()), data.coerceArgToPropertiesOrNull(1));
    }
}
