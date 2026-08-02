package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import M2.c;
import Sc.InterfaceC4008j;
import WZ.e;
import WZ.t;
import WZ.x;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.widgets.commonTapTags.ApplyTapTagActionHandlerFactory;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.adapter.TapTagV2Adapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010(\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00022\n\u0010'\u001a\u00060%j\u0002`&H\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0016048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "pageIdModifier", "Lru/ozon/app/android/search/widgets/commonTapTags/ApplyTapTagActionHandlerFactory;", "applyTapTagActionHandlerFactory", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "activeSearchBarViewModel", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "viewModel", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2View;", "view", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/e;Lru/ozon/app/android/search/widgets/commonTapTags/ApplyTapTagActionHandlerFactory;Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2View;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "tapTagsVO", "", "updateUIWithModel", "(Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;)V", "Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTokenizedEvent", "(Lru/ozon/uni/atoms/af/AtomAction$SendAnalytics;)LWZ/t;", "updateFromBind", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2ViewModel;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2View;", "", "redesignFeatureEnabled$delegate", "LSc/j;", "getRedesignFeatureEnabled", "()Z", "redesignFeatureEnabled", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2Adapter;", "tagsAdapter", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/adapter/TapTagV2Adapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TapTagsV2ViewHolder extends k<TapTagsV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ActiveSearchBarViewModel activeSearchBarViewModel;

    /* renamed from: redesignFeatureEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j redesignFeatureEnabled;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final TapTagV2Adapter tagsAdapter;

    @NotNull
    private final TapTagsV2View view;

    @NotNull
    private final TapTagsV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapTagsV2ViewHolder(@NotNull ComposerReferences refs, @NotNull e pageIdModifier, @NotNull ApplyTapTagActionHandlerFactory applyTapTagActionHandlerFactory, @NotNull ActiveSearchBarViewModel activeSearchBarViewModel, @NotNull TapTagsV2ViewModel viewModel, @NotNull TapTagsV2View view, @NotNull FeatureChecker featureChecker) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(applyTapTagActionHandlerFactory, "applyTapTagActionHandlerFactory");
        Intrinsics.checkNotNullParameter(activeSearchBarViewModel, "activeSearchBarViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.refs = refs;
        this.activeSearchBarViewModel = activeSearchBarViewModel;
        this.viewModel = viewModel;
        this.view = view;
        this.redesignFeatureEnabled = Sc.k.b(new TapTagsV2ViewHolder$redesignFeatureEnabled$2(featureChecker));
        Function1<AtomAction, Unit> createActionHandler$default = ApplyTapTagActionHandlerFactory.createActionHandler$default(applyTapTagActionHandlerFactory, this, pageIdModifier, new TapTagsV2ViewHolder$actionHandler$1(this), false, 8, null);
        this.actionHandler = createActionHandler$default;
        TapTagV2Adapter tapTagV2Adapter = new TapTagV2Adapter(createActionHandler$default, getRedesignFeatureEnabled());
        this.tagsAdapter = tapTagV2Adapter;
        if (getRedesignFeatureEnabled()) {
            view.setRedesign();
        }
        view.getTapTags().setAdapter(tapTagV2Adapter);
    }

    private final boolean getRedesignFeatureEnabled() {
        return ((Boolean) this.redesignFeatureEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getTokenizedEvent(AtomAction.SendAnalytics action) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        TapTagsV2VO boundData = getBoundData();
        if (boundData == null || (trackingInfo = action.getTrackingInfo()) == null) {
            return null;
        }
        Long valueOf = Long.valueOf(boundData.getId());
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        return x.b(trackingInfo, valueOf, null);
    }

    private final void updateFromBind(TapTagsV2VO tapTagsVO) {
        if (this.viewModel.getTapTags().getValue() == null) {
            this.view.post(new c(1, this, tapTagsVO));
            return;
        }
        TapTagsV2VO value = this.viewModel.getTapTags().getValue();
        if (value != null) {
            updateUIWithModel(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFromBind$lambda$0(TapTagsV2ViewHolder tapTagsV2ViewHolder, TapTagsV2VO tapTagsV2VO) {
        tapTagsV2ViewHolder.activeSearchBarViewModel.configureTapTagsRequestBody(tapTagsV2VO.getSearchText(), true, new TapTagsV2ViewHolder$updateFromBind$1$1(tapTagsV2ViewHolder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUIWithModel(TapTagsV2VO tapTagsVO) {
        this.tagsAdapter.submitList(tapTagsVO.getItems());
        this.view.setMaxLines(tapTagsVO.getMaxRows());
        this.view.getIslandSeparator().setVisibility(tapTagsVO.getShowSeparator() && !tapTagsVO.getItems().isEmpty() ? 0 : 8);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.viewModel.getTapTags().observe(this.refs.getContainer().g(), new TapTagsV2ViewHolder$sam$androidx_lifecycle_Observer$0(new TapTagsV2ViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TapTagsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        updateFromBind(item);
    }
}
