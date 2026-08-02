package ru.ozon.app.android.storefront.widgets.naviBlocksV3.core;

import WZ.l;
import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3Layout;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3ViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NaviBlocksV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NaviBlocksV3ViewHolder> {
    final /* synthetic */ NaviBlocksV3ViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.core.NaviBlocksV3ViewMapper$holderProducer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<BaseOnBoardingViewModel.Default> {
        final /* synthetic */ NaviBlocksV3ViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NaviBlocksV3ViewMapper naviBlocksV3ViewMapper) {
            super(0);
            this.this$0 = naviBlocksV3ViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseOnBoardingViewModel.Default invoke() {
            NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent;
            naviBlocksV3WidgetComponent = this.this$0.component;
            return naviBlocksV3WidgetComponent.getOnBoardingViewModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV3ViewMapper$holderProducer$1(NaviBlocksV3ViewMapper naviBlocksV3ViewMapper) {
        super(2);
        this.this$0 = naviBlocksV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NaviBlocksV3ViewHolder invoke(View view, ComposerReferences refs) {
        NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent;
        NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        NaviBlocksV3Layout naviBlocksV3Layout = (NaviBlocksV3Layout) view;
        BaseOnBoardingViewModel baseOnBoardingViewModel = (BaseOnBoardingViewModel) ((w0) j.a(refs.getViewModelOwnerProvider().a(), N.b(BaseOnBoardingViewModel.Default.class), new AnonymousClass1(this.this$0)).getValue());
        naviBlocksV3WidgetComponent = this.this$0.component;
        l tokenizedAnalytics = naviBlocksV3WidgetComponent.getTokenizedAnalytics();
        naviBlocksV3WidgetComponent2 = this.this$0.component;
        return new NaviBlocksV3ViewHolder(naviBlocksV3Layout, refs, baseOnBoardingViewModel, tokenizedAnalytics, naviBlocksV3WidgetComponent2.getOnBoardingDisplayRepository());
    }
}
