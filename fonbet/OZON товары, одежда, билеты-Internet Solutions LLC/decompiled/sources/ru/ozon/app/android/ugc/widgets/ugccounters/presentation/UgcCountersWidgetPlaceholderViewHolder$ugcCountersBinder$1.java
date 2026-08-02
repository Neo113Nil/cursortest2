package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import Sc.InterfaceC4008j;
import WZ.l;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersRvBinder;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersWidgetPlaceholderViewHolder$ugcCountersBinder$1 extends AbstractC7737t implements Function0<BaseWidgetPlaceholderBinder<UgcCountersVO>> {
    final /* synthetic */ UgcCountersImagesPreCreationConfig $imagesPreCreationConfig;
    final /* synthetic */ PlayerPreloader $playerPreloader;
    final /* synthetic */ UgcCountersWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersWidgetPlaceholderViewHolder$ugcCountersBinder$1(UgcCountersWidgetPlaceholderViewHolder ugcCountersWidgetPlaceholderViewHolder, PlayerPreloader playerPreloader, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig) {
        super(0);
        this.this$0 = ugcCountersWidgetPlaceholderViewHolder;
        this.$playerPreloader = playerPreloader;
        this.$imagesPreCreationConfig = ugcCountersImagesPreCreationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseWidgetPlaceholderBinder<UgcCountersVO> invoke() {
        boolean z11;
        InterfaceC4008j interfaceC4008j;
        ComposerReferences composerReferences;
        l lVar;
        UgcCountersOnboardingViewModel ugcCountersOnboardingViewModel;
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;
        InterfaceC4008j interfaceC4008j2;
        ComposerReferences composerReferences2;
        UgcCountersOnboardingViewModel ugcCountersOnboardingViewModel2;
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter2;
        z11 = this.this$0.hasExpandingBlock;
        if (z11) {
            interfaceC4008j2 = this.this$0.mainView;
            Object value = interfaceC4008j2.getValue();
            Intrinsics.g(value, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) value;
            composerReferences2 = this.this$0.refs;
            ugcCountersOnboardingViewModel2 = this.this$0.onboardingViewModel;
            PlayerPreloader playerPreloader = this.$playerPreloader;
            UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig = this.$imagesPreCreationConfig;
            UgcCountersWidgetPlaceholderViewHolder ugcCountersWidgetPlaceholderViewHolder = this.this$0;
            widgetImagePlaceholderAdapter2 = ugcCountersWidgetPlaceholderViewHolder.widgetImagePlaceholderAdapter;
            return new UgcCountersLlBinder(linearLayout, composerReferences2, ugcCountersOnboardingViewModel2, playerPreloader, ugcCountersImagesPreCreationConfig, ugcCountersWidgetPlaceholderViewHolder, widgetImagePlaceholderAdapter2);
        }
        interfaceC4008j = this.this$0.mainView;
        Object value2 = interfaceC4008j.getValue();
        Intrinsics.g(value2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) value2;
        composerReferences = this.this$0.refs;
        lVar = this.this$0.tokenizedAnalytics;
        ugcCountersOnboardingViewModel = this.this$0.onboardingViewModel;
        PlayerPreloader playerPreloader2 = this.$playerPreloader;
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig2 = this.$imagesPreCreationConfig;
        UgcCountersWidgetPlaceholderViewHolder ugcCountersWidgetPlaceholderViewHolder2 = this.this$0;
        widgetImagePlaceholderAdapter = ugcCountersWidgetPlaceholderViewHolder2.widgetImagePlaceholderAdapter;
        return new UgcCountersRvBinder(recyclerView, composerReferences, lVar, ugcCountersOnboardingViewModel, playerPreloader2, ugcCountersImagesPreCreationConfig2, ugcCountersWidgetPlaceholderViewHolder2, widgetImagePlaceholderAdapter);
    }
}
