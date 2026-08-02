package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di;

import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/core/LotteryOnboardingInfoMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class LotteryOnboardingInfoComponent$mapper$2 extends AbstractC7737t implements Function0<LotteryOnboardingInfoMapper> {
    final /* synthetic */ C7475g $storage;
    final /* synthetic */ LotteryOnboardingInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryOnboardingInfoComponent$mapper$2(C7475g c7475g, LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
        super(0);
        this.$storage = c7475g;
        this.this$0 = lotteryOnboardingInfoComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LotteryOnboardingInfoMapper invoke() {
        ImagePrefetchInfoProviderStorage prefetchProviderStorage;
        Context context = ((ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class)).getContext();
        prefetchProviderStorage = this.this$0.getPrefetchProviderStorage();
        return new LotteryOnboardingInfoMapper(context, prefetchProviderStorage);
    }
}
