package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import Sc.InterfaceC4008j;
import Vg.c;
import WZ.l;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001a0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2ScrollableWidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2BaseWidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "actionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Landroidx/fragment/app/r;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;LWZ/l;LVg/c;)V", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;Ll20/d;)V", "", "position", "getOnboardingView", "(I)Landroid/view/View;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "optimizationFF$delegate", "LSc/j;", "getOptimizationFF", "()Z", "optimizationFF", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationBlockV2Adapter;", "blockAdapter", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationBlockV2Adapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderV2ScrollableWidgetViewHolder extends NavigationSliderV2BaseWidgetViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NavigationBlockV2Adapter blockAdapter;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: optimizationFF$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j optimizationFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV2ScrollableWidgetViewHolder(@NotNull View containerView, @NotNull AdultHandler adultHandler, @NotNull r activity, @NotNull FeatureChecker featureChecker, @NotNull ComposerReferences composerReferences, @NotNull NavigationSliderV2OnBoardingViewModel onBoardingViewModel, @NotNull l tokenizedAnalytics, @NotNull c actionHandlersStore) {
        super(containerView, adultHandler, activity, composerReferences, onBoardingViewModel, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandlersStore, "actionHandlersStore");
        this.featureChecker = featureChecker;
        this.optimizationFF = LazyUtilsKt.unsafeLazy(new NavigationSliderV2ScrollableWidgetViewHolder$optimizationFF$2(this));
        NavigationBlockV2Adapter navigationBlockV2Adapter = new NavigationBlockV2Adapter(adultHandler, featureChecker, getAdapterCallback(), this, getOptimizationFF());
        this.blockAdapter = navigationBlockV2Adapter;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NavigationSliderV2ScrollableWidgetViewHolder$actionHandler$1(actionHandlersStore)).buildHandler();
        RecyclerView recyclerView = getBinding().itemsRv;
        recyclerView.setAdapter(navigationBlockV2Adapter);
        setRecyclerViewSettings(recyclerView);
    }

    private final boolean getOptimizationFF() {
        return ((Boolean) this.optimizationFF.getValue()).booleanValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder
    @NotNull
    public Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @Override // ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation.NavigationSliderV2BaseWidgetViewHolder
    public View getOnboardingView(int position) {
        RecyclerView.o layoutManager = getBinding().itemsRv.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.findViewByPosition(position);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NavigationSliderV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        super.bind(item, info);
        if (getOptimizationFF()) {
            this.blockAdapter.setItemWidth(Integer.valueOf(item.getItemWidth()));
        }
        TextView titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        this.blockAdapter.bind(item.getItems());
        restoreScroll();
    }
}
