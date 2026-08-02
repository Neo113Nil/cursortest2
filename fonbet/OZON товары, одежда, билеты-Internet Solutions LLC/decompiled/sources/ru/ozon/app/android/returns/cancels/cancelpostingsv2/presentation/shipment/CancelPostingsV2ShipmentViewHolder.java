package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.shipment;

import FG.a;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.RefreshWithSelectedIdsHandler;
import ru.ozon.app.android.returns.cancels.databinding.WidgetCancelPostingsV2ShipmentBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/shipment/CancelPostingsV2ShipmentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/shipment/ShipmentVO;", "Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2ShipmentBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "refreshWithSelectedIdsHandler", "<init>", "(Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2ShipmentBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/shipment/ShipmentVO;Ll20/d;)V", "Lru/ozon/app/android/returns/cancels/databinding/WidgetCancelPostingsV2ShipmentBinding;", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CancelPostingsV2ShipmentViewHolder extends k<ShipmentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCancelPostingsV2ShipmentBinding binding;

    @NotNull
    private final RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CancelPostingsV2ShipmentViewHolder(@NotNull WidgetCancelPostingsV2ShipmentBinding binding, @NotNull ComposerReferences refs, @NotNull RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(refreshWithSelectedIdsHandler, "refreshWithSelectedIdsHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refreshWithSelectedIdsHandler = refreshWithSelectedIdsHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new CancelPostingsV2ShipmentViewHolder$actionHandler$1(this)).buildHandler();
        binding.getConstraintLayout().setOnClickListener(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CancelPostingsV2ShipmentViewHolder cancelPostingsV2ShipmentViewHolder, View view) {
        AtomAction action;
        ShipmentVO boundedData = cancelPostingsV2ShipmentViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        cancelPostingsV2ShipmentViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ShipmentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.checkboxV.setSelected(item.getIsSelected());
        this.binding.titleTv.setText(item.getTitle());
        this.binding.subtitleTv.setText(item.getSubtitle());
    }
}
