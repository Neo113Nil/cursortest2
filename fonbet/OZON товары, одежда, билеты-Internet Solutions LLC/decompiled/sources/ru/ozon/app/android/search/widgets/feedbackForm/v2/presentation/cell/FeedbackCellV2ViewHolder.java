package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell;

import Fv.RunnableC3061a;
import Vg.d;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2Model;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2ModelKt;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.FeedbackFormV2ViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;LVg/d;)V", "optional", "", "closeSheetIfNeeded", "(Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;)V", "item", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "getInputSettings", "(Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;)Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "onDetach", "()V", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/FeedbackFormV2ViewModel;", "LVg/d;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackCellV2ViewHolder extends k<FeedbackCellV2VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Handler handler;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final CellView view;

    @NotNull
    private final FeedbackFormV2ViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int HORIZONTAL_MARGIN = ResourceExtKt.toPx(16);
    private static final int verticalPadding = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2ViewHolder$Companion;", "", "<init>", "()V", "HORIZONTAL_MARGIN", "", "getHORIZONTAL_MARGIN", "()I", "verticalPadding", "DEFAULT_DEBOUNCE", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getHORIZONTAL_MARGIN() {
            return FeedbackCellV2ViewHolder.HORIZONTAL_MARGIN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCellV2ViewHolder(@NotNull ComposerReferences refs, @NotNull ComposerNavigator navigator, @NotNull CellView view, @NotNull FeedbackFormV2ViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.refs = refs;
        this.navigator = navigator;
        this.view = view;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.handler = new Handler(Looper.getMainLooper());
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new FeedbackCellV2ViewHolder$actionHandler$1(this)).customActionHandlers(new FeedbackCellV2ViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeSheetIfNeeded(FeedbackCellV2VO optional) {
        if (optional.getOptionType() == FeedbackFormV2DTO.OptionDTO.OptionType.AUTO_DISMISS) {
            this.handler.removeCallbacksAndMessages(null);
            this.handler.postDelayed(new RunnableC3061a(this, 3), 150L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeSheetIfNeeded$lambda$0(FeedbackCellV2ViewHolder feedbackCellV2ViewHolder) {
        feedbackCellV2ViewHolder.navigator.popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputV2Model getInputSettings(FeedbackCellV2VO item) {
        if (!this.viewModel.isCellSelected()) {
            return InputV2ModelKt.createDefaultInput();
        }
        FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings = item.getInputSettings();
        String label = inputSettings != null ? inputSettings.getLabel() : null;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings2 = item.getInputSettings();
        Integer maxLength = inputSettings2 != null ? inputSettings2.getMaxLength() : null;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings3 = item.getInputSettings();
        Integer rows = inputSettings3 != null ? inputSettings3.getRows() : null;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings4 = item.getInputSettings();
        Boolean resize = inputSettings4 != null ? inputSettings4.getResize() : null;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings5 = item.getInputSettings();
        return new InputV2Model(label, maxLength, rows, resize, inputSettings5 != null ? inputSettings5.getScrollBar() : null, FeedbackFormV2DTO.OptionDTO.OptionType.PLAIN);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.handler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackCellV2VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellHolderKt.bindOrGone(this.view, item.getCell(), this.actionHandler);
        this.view.setCellHoverColor(0);
        this.view.setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.bgSecondary));
        this.view.getRightBlock().getIconView().setVisibility(this.viewModel.containsOption(item.getCell()) ? 0 : 8);
        if (item.getIsFirstCell()) {
            CellView cellView = this.view;
            cellView.setPadding(cellView.getPaddingLeft(), verticalPadding, cellView.getPaddingRight(), cellView.getPaddingBottom());
        } else if (item.getIsLastCell()) {
            CellView cellView2 = this.view;
            cellView2.setPadding(cellView2.getPaddingLeft(), cellView2.getPaddingTop(), cellView2.getPaddingRight(), verticalPadding);
        }
    }
}
