package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content;

import WZ.l;
import WZ.t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.AviaDetailedInfoV3ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.AviaDetailedInfoV3Adapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.AviaDetailedInfoV3Decoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "viewModel", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;)V", "", "observeLiveData", "()V", "", "selectedInd", "onTabClick", "(I)V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO;Ll20/d;)V", "Landroidx/recyclerview/widget/RecyclerView;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/AviaDetailedInfoV3ViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Adapter;", "tabsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Adapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Decoration;", "decoration", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3Decoration;", "tabsCount", "I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3WidgetViewHolder extends k<AviaDetailedInfoV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final AviaDetailedInfoV3Decoration decoration;

    @NotNull
    private final AviaDetailedInfoV3Adapter tabsAdapter;
    private int tabsCount;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final AviaDetailedInfoV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3WidgetViewHolder(@NotNull RecyclerView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull AviaDetailedInfoV3ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        AviaDetailedInfoV3Adapter aviaDetailedInfoV3Adapter = new AviaDetailedInfoV3Adapter(refs.getComposerViewPoolProvider().getViewPool(), buildHandler, tokenizedAnalytics);
        this.tabsAdapter = aviaDetailedInfoV3Adapter;
        AviaDetailedInfoV3Decoration aviaDetailedInfoV3Decoration = new AviaDetailedInfoV3Decoration(getContext());
        this.decoration = aviaDetailedInfoV3Decoration;
        containerView.setAdapter(aviaDetailedInfoV3Adapter);
        containerView.addItemDecoration(aviaDetailedInfoV3Decoration);
    }

    private final void observeLiveData() {
        this.viewModel.selectedTabLiveData().observe(this, new AviaDetailedInfoV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new AviaDetailedInfoV3WidgetViewHolder$observeLiveData$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabClick(int selectedInd) {
        List<t> tabsClickTracking;
        t tVar;
        List<AviaDetailedInfoV3TabItemVO> tabsContent;
        AviaDetailedInfoV3TabItemVO aviaDetailedInfoV3TabItemVO;
        if (selectedInd == -1 || selectedInd >= this.tabsCount) {
            return;
        }
        AviaDetailedInfoV3VO boundData = getBoundData();
        List<AviaDetailedInfoV3ListItemVO> content = (boundData == null || (tabsContent = boundData.getTabsContent()) == null || (aviaDetailedInfoV3TabItemVO = (AviaDetailedInfoV3TabItemVO) C7714v.Q(selectedInd, tabsContent)) == null) ? null : aviaDetailedInfoV3TabItemVO.getContent();
        if (content != null) {
            this.tabsAdapter.submitList(content);
        }
        AviaDetailedInfoV3VO boundData2 = getBoundData();
        if (boundData2 == null || (tabsClickTracking = boundData2.getTabsClickTracking()) == null || (tVar = (t) C7714v.Q(selectedInd, tabsClickTracking)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, tVar, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaDetailedInfoV3VO item, @NotNull d info) {
        List<AviaDetailedInfoV3ListItemVO> content;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AviaDetailedInfoV3TabItemVO aviaDetailedInfoV3TabItemVO = (AviaDetailedInfoV3TabItemVO) C7714v.M(item.getTabsContent());
        if (aviaDetailedInfoV3TabItemVO != null && (content = aviaDetailedInfoV3TabItemVO.getContent()) != null) {
            this.tabsAdapter.submitList(content);
        }
        this.tabsCount = item.getTabsContent().size();
        this.decoration.setMargin(UiExtKt.toPx(item.getMarginBetweenFlights(), getContext()));
        this.containerView.invalidateItemDecorations();
    }
}
