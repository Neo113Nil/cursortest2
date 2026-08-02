package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ContainerStep.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/actions/brazeactions/steps/ContainerStep;", "Lcom/braze/ui/actions/brazeactions/steps/BaseBrazeActionStep;", "()V", "STEPS", "", "getChildStepIterator", "", "Lorg/json/JSONObject;", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "getChildStepIterator$android_sdk_ui_release", "isValid", "", "run", "", "context", "Landroid/content/Context;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContainerStep extends BaseBrazeActionStep {
    public static final ContainerStep INSTANCE = new ContainerStep();
    public static final String STEPS = "steps";

    private ContainerStep() {
        super(null);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.getSrcJson().has(STEPS);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(data);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(data, (JSONObject) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }

    public final /* synthetic */ Iterator getChildStepIterator$android_sdk_ui_release(StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final JSONArray jSONArray = data.getSrcJson().getJSONArray(STEPS);
        if (jSONArray == null) {
            return CollectionsKt.emptyList().iterator();
        }
        return SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, jSONArray.length())), new Function1<Integer, Boolean>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean invoke(int i) {
                return Boolean.valueOf(jSONArray.opt(i) instanceof JSONObject);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        }), new Function1<Integer, JSONObject>() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final JSONObject invoke(int i) {
                Object obj = jSONArray.get(i);
                if (obj != null) {
                    return (JSONObject) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, org.json.JSONObject] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
                return invoke(num.intValue());
            }
        }).iterator();
    }
}
