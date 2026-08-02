package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import Vg.c;
import WZ.l;
import android.content.Context;
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
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001b0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2BaseWidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "actionHandlersStore", "<init>", "(Landroid/view/View;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Landroidx/fragment/app/r;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2OnBoardingViewModel;LWZ/l;LVg/c;)V", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationSliderV2VO;Ll20/d;)V", "", "position", "getOnboardingView", "(I)Landroid/view/View;", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationBlockV2Adapter;", "blockAdapter", "Lru/ozon/app/android/storefront/widgets/navigationSliderV2/presentation/NavigationBlockV2Adapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationSliderV2WidgetViewHolder extends NavigationSliderV2BaseWidgetViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NavigationBlockV2Adapter blockAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationSliderV2WidgetViewHolder(@NotNull View containerView, @NotNull AdultHandler adultHandler, @NotNull r activity, @NotNull FeatureChecker featureChecker, @NotNull ComposerReferences composerReferences, @NotNull NavigationSliderV2OnBoardingViewModel onBoardingViewModel, @NotNull l tokenizedAnalytics, @NotNull c actionHandlersStore) {
        super(containerView, adultHandler, activity, composerReferences, onBoardingViewModel, tokenizedAnalytics);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandlersStore, "actionHandlersStore");
        NavigationBlockV2Adapter navigationBlockV2Adapter = new NavigationBlockV2Adapter(adultHandler, featureChecker, getAdapterCallback(), this, false);
        this.blockAdapter = navigationBlockV2Adapter;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new NavigationSliderV2WidgetViewHolder$actionHandler$1(actionHandlersStore)).buildHandler();
        RecyclerView recyclerView = getBinding().itemsRv;
        recyclerView.setAdapter(navigationBlockV2Adapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setLayoutManager(new StaticLinearLayoutManager(context, 0, false));
        setRecyclerViewSettings(recyclerView);
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
        TextView titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, item.getTitle());
        this.blockAdapter.setItemWidth(Integer.valueOf(item.getItemWidth()));
        this.blockAdapter.bind(item.getItems());
        restoreScroll();
    }
}
