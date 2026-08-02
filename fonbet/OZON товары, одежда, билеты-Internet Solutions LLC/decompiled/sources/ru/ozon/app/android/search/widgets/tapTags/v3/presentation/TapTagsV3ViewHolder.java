package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import A00.a;
import Sc.InterfaceC4008j;
import WZ.e;
import WZ.t;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.W;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.HideKeyboardOnTapTagsV3Click;
import ru.ozon.app.android.search.flags.SearchResultsShimmersEnabled;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.commonTapTags.ApplyTapTagActionHandlerFactory;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SearchSkeleton;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SkeletonElement;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.adapter.TapTagV2Adapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import v10.C10183a;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0014048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020 0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010E¨\u0006G"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/commonTapTags/ApplyTapTagActionHandlerFactory;", "applyTapTagActionHandlerFactory", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;", "tapTagsV3View", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/e;Lru/ozon/app/android/search/widgets/commonTapTags/ApplyTapTagActionHandlerFactory;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "tapTagsVO", "", "updateUIWithModel", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;)V", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "updateFromBind", "()V", "addShimmerElements", "LA00/a;", "event", "busEventHandler", "(LA00/a;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3ViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3View;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "redesignFeatureEnabled$delegate", "LSc/j;", "getRedesignFeatureEnabled", "()Z", "redesignFeatureEnabled", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2Adapter;", "tagsAdapter", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2Adapter;", "Landroidx/lifecycle/W;", "eventHandlerObserver", "Landroidx/lifecycle/W;", "pageWasRestored", "Z", "isSearchTextEmpty", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV3ViewHolder extends k<TapTagsV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final W<A00.a> eventHandlerObserver;

    @NotNull
    private final FeatureChecker featureChecker;
    private boolean isSearchTextEmpty;
    private boolean pageWasRestored;

    /* renamed from: redesignFeatureEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j redesignFeatureEnabled;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TapTagV2Adapter tagsAdapter;

    @NotNull
    private final TapTagsV3View tapTagsV3View;

    @NotNull
    private final TapTagsV3ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapTagsV3ViewHolder(@NotNull ComposerReferences refs, @NotNull e pageIdModifier, @NotNull ApplyTapTagActionHandlerFactory applyTapTagActionHandlerFactory, @NotNull TapTagsV3ViewModel viewModel, @NotNull TapTagsV3View tapTagsV3View, @NotNull FeatureChecker featureChecker) {
        super(tapTagsV3View);
        View view;
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(applyTapTagActionHandlerFactory, "applyTapTagActionHandlerFactory");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tapTagsV3View, "tapTagsV3View");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.refs = refs;
        this.viewModel = viewModel;
        this.tapTagsV3View = tapTagsV3View;
        this.featureChecker = featureChecker;
        Function1<AtomAction, Unit> createActionHandler = applyTapTagActionHandlerFactory.createActionHandler(this, pageIdModifier, new TapTagsV3ViewHolder$actionHandler$1(this), featureChecker.isEnabled(HideKeyboardOnTapTagsV3Click.INSTANCE));
        this.actionHandler = createActionHandler;
        this.redesignFeatureEnabled = Sc.k.b(new TapTagsV3ViewHolder$redesignFeatureEnabled$2(this));
        TapTagV2Adapter tapTagV2Adapter = new TapTagV2Adapter(createActionHandler, getRedesignFeatureEnabled());
        this.tagsAdapter = tapTagV2Adapter;
        this.eventHandlerObserver = new TapTagsV3ViewHolder$eventHandlerObserver$1(this);
        if (getRedesignFeatureEnabled()) {
            tapTagsV3View.setRedesign();
        }
        tapTagsV3View.getTapTagsRV().setAdapter(tapTagV2Adapter);
        addShimmerElements();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return;
        }
        C10183a.e(view).setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor0));
    }

    private final void addShimmerElements() {
        SearchShimmer shimmer = this.tapTagsV3View.getShimmer();
        SearchSkeleton searchSkeleton = new SearchSkeleton(getContext(), null, 0, 0, false, 30, null);
        SkeletonElement.TileGrid2 tileGrid2 = SkeletonElement.TileGrid2.INSTANCE;
        searchSkeleton.addSkeletonElements(C7714v.b0(tileGrid2, tileGrid2, tileGrid2));
        shimmer.addView(searchSkeleton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void busEventHandler(A00.a event) {
        if (this.featureChecker.isEnabled(SearchResultsShimmersEnabled.INSTANCE)) {
            if (event instanceof a.u.b) {
                if (this.pageWasRestored || this.isSearchTextEmpty) {
                    return;
                }
                ViewExtKt.show(this.tapTagsV3View.getShimmer());
                return;
            }
            if (event instanceof a.C2370k) {
                ViewExtKt.gone(this.tapTagsV3View.getShimmer());
            } else if (event instanceof a.B) {
                this.pageWasRestored = true;
            } else if (event instanceof a.o) {
                this.pageWasRestored = false;
            }
        }
    }

    private final boolean getRedesignFeatureEnabled() {
        return ((Boolean) this.redesignFeatureEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        TapTagsV3VO boundData = getBoundData();
        if (boundData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(boundData.getId()), null, 2, null);
    }

    private final void updateFromBind() {
        TapTagsV3VO value = this.viewModel.getTapTags().getValue();
        if (value != null) {
            updateUIWithModel(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUIWithModel(TapTagsV3VO tapTagsVO) {
        ComponentCallbacksC5392m c11;
        View view;
        this.tagsAdapter.submitList(tapTagsVO.getItems());
        this.tapTagsV3View.setMaxLines(tapTagsVO.getMaxRows());
        if (!tapTagsVO.getIsExpressPage() || (c11 = this.refs.getContainer().c()) == null || (view = c11.getView()) == null) {
            return;
        }
        C10183a.e(view).setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.layerFloor1));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.refs.getController().getEvents().observe(this, this.eventHandlerObserver);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.viewModel.getTapTags().observe(lifecycle, new TapTagsV3ViewHolder$sam$androidx_lifecycle_Observer$0(new TapTagsV3ViewHolder$onAttachViewModel$1(this)));
        this.refs.getController().getEvents().observe(this.refs.getContainer().g(), new TapTagsV3ViewHolder$sam$androidx_lifecycle_Observer$0(new TapTagsV3ViewHolder$onAttachViewModel$2(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.refs.getController().getEvents().removeObserver(this.eventHandlerObserver);
        ViewExtKt.gone(this.tapTagsV3View.getShimmer());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TapTagsV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setWidgetInfo(info);
        updateFromBind();
    }
}
