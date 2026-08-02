package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModel;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModelKt;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.FeedbackFormViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/android/cell/CellView;", "view", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/android/cell/CellView;Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;)V", "item", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "getInputSettings", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;)Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/cell/CellView;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackCellViewHolder extends k<FeedbackCellVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final CellView view;

    @NotNull
    private final FeedbackFormViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int verticalPadding = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellViewHolder$Companion;", "", "<init>", "()V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCellViewHolder(@NotNull ComposerReferences refs, @NotNull CellView view, @NotNull FeedbackFormViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.refs = refs;
        this.view = view;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new FeedbackCellViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputModel getInputSettings(FeedbackCellVO item) {
        if (!this.viewModel.isCellSelected()) {
            return InputModelKt.createDefaultInput();
        }
        FeedbackFormDTO.OptionDTO.InputDTO inputSettings = item.getInputSettings();
        return new InputModel(inputSettings.getLabel(), inputSettings.getMaxLength(), inputSettings.getRows(), inputSettings.getResize(), inputSettings.getScrollBar(), item.getOptionType());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackCellVO item, @NotNull d info) {
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
