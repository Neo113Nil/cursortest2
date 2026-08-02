package ru.ozon.app.android.travel.feature.general.common.widgets.travelFiltersButton.presentation;

import WZ.l;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.travel.feature.general.common.databinding.WidgetTravelFiltersButtonBinding;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelFiltersButton/presentation/TravelFiltersButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelFiltersButton/presentation/TravelFiltersButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "", "processFiltersAction", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelFiltersButton/presentation/TravelFiltersButtonVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelFiltersButtonBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/common/databinding/WidgetTravelFiltersButtonBinding;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelFiltersButtonWidgetViewHolder extends k<TravelFiltersButtonVO> {

    @NotNull
    private final WidgetTravelFiltersButtonBinding binding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelFiltersButtonWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelFiltersButtonBinding bind = WidgetTravelFiltersButtonBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFiltersAction(AtomAction atomAction, t clickEvent) {
        String link;
        AtomAction.OpenComposerNestedPage openComposerNestedPage = atomAction instanceof AtomAction.OpenComposerNestedPage ? (AtomAction.OpenComposerNestedPage) atomAction : null;
        if (openComposerNestedPage == null || (link = openComposerNestedPage.getLink()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(this.references.getNavigator(), link, link, 9001, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
        if (clickEvent != null) {
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(this.tokenizedAnalytics, clickEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelFiltersButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.travelFiltersButtonTfbv.bind(item.getTravelFiltersButton(), new TravelFiltersButtonWidgetViewHolder$bind$1(this));
    }
}
