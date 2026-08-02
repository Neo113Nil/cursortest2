package ru.ozon.app.android.account.orders.datechangedcomplaintform.presentation.reason;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.selection.checkbox.CheckboxTitleSubtitleCellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.selection.CheckboxTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/DeliveryDateChangedComplaintReasonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/DeliveryDateChangedComplaintFormReasonVO;", "Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/SelectReasonDelegate;", "selectReasonDelegate", "<init>", "(Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/SelectReasonDelegate;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/datechangedcomplaintform/presentation/reason/DeliveryDateChangedComplaintFormReasonVO;Ll20/d;)V", "Lru/ozon/uni/android/cell/selection/checkbox/CheckboxTitleSubtitleCellView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeliveryDateChangedComplaintReasonWidgetViewHolder extends k<DeliveryDateChangedComplaintFormReasonVO> {
    public static final int $stable = CheckboxTitleSubtitleCellView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CheckboxTitleSubtitleCellView view;

    public /* synthetic */ DeliveryDateChangedComplaintReasonWidgetViewHolder(CheckboxTitleSubtitleCellView checkboxTitleSubtitleCellView, ComposerReferences composerReferences, SelectReasonDelegate selectReasonDelegate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(checkboxTitleSubtitleCellView, composerReferences, (i11 & 4) != 0 ? new SelectReasonDelegate(composerReferences) : selectReasonDelegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryDateChangedComplaintFormReasonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CheckboxTitleSubtitleCellHolderKt.bind(this.view, item.getReason(), this.actionHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDateChangedComplaintReasonWidgetViewHolder(@NotNull CheckboxTitleSubtitleCellView view, @NotNull ComposerReferences refs, @NotNull SelectReasonDelegate selectReasonDelegate) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(selectReasonDelegate, "selectReasonDelegate");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new DeliveryDateChangedComplaintReasonWidgetViewHolder$actionHandler$1(selectReasonDelegate)).buildHandler();
    }
}
