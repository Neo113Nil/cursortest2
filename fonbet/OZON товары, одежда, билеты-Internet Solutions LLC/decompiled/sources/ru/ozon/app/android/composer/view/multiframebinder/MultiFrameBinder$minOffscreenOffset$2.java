package ru.ozon.app.android.composer.view.multiframebinder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.view.multiframebinder.flags.MultiFrameMinOffscreenOffsetPercentFlag;
import ru.ozon.app.android.network.abtool.FeatureService;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MultiFrameBinder$minOffscreenOffset$2 extends AbstractC7737t implements Function0<Float> {
    final /* synthetic */ MultiFrameBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiFrameBinder$minOffscreenOffset$2(MultiFrameBinder multiFrameBinder) {
        super(0);
        this.this$0 = multiFrameBinder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        FeatureService featureService;
        featureService = this.this$0.featureService;
        return Float.valueOf(featureService.getFloatKey(MultiFrameMinOffscreenOffsetPercentFlag.INSTANCE));
    }
}
