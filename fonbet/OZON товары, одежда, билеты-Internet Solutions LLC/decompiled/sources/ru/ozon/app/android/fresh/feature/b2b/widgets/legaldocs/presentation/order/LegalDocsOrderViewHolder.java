package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDocsOrderBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.order.LegalDocsOrderVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsOrderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsOrderBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderStatusView;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO$Status;", "status", "", "bindOrGone", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderStatusView;Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO$Status;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/order/LegalDocsOrderVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsOrderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDocsOrderViewHolder extends k<LegalDocsOrderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetLegalDocsOrderBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegalDocsOrderViewHolder(@NotNull WidgetLegalDocsOrderBinding binding, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void bindOrGone(LegalDocsOrderStatusView legalDocsOrderStatusView, LegalDocsOrderVO.Status status) {
        LegalDocsOrderStatusView legalDocsOrderStatusView2;
        if (status == null) {
            legalDocsOrderStatusView.setOnClickListener(null);
            legalDocsOrderStatusView2 = legalDocsOrderStatusView;
        } else {
            legalDocsOrderStatusView.bind(status);
            legalDocsOrderStatusView2 = legalDocsOrderStatusView;
            ViewExtKt.setOnClickListenerThrottle$default(legalDocsOrderStatusView2, 0L, new LegalDocsOrderViewHolder$bindOrGone$1(status, this), 1, null);
        }
        legalDocsOrderStatusView2.setVisibility(status != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalDocsOrderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetLegalDocsOrderBinding widgetLegalDocsOrderBinding = this.binding;
        TextAtomV2View sectionHeaderTAV = widgetLegalDocsOrderBinding.sectionHeaderTAV;
        Intrinsics.checkNotNullExpressionValue(sectionHeaderTAV, "sectionHeaderTAV");
        TextHolderKt.bindOrGone$default(sectionHeaderTAV, item.getSectionTitle(), null, 2, null);
        TextAtomV2View orderTitleTAV = widgetLegalDocsOrderBinding.orderTitleTAV;
        Intrinsics.checkNotNullExpressionValue(orderTitleTAV, "orderTitleTAV");
        TextHolderKt.bind$default(orderTitleTAV, item.getTitle(), null, 2, null);
        TextAtomV2View orderDateTAV = widgetLegalDocsOrderBinding.orderDateTAV;
        Intrinsics.checkNotNullExpressionValue(orderDateTAV, "orderDateTAV");
        TextHolderKt.bind$default(orderDateTAV, item.getDate(), null, 2, null);
        TextAtomV2View orderPriceTAV = widgetLegalDocsOrderBinding.orderPriceTAV;
        Intrinsics.checkNotNullExpressionValue(orderPriceTAV, "orderPriceTAV");
        TextHolderKt.bind$default(orderPriceTAV, item.getPrice(), null, 2, null);
        SmallIconButtonView downloadButtonBV = widgetLegalDocsOrderBinding.downloadButtonBV;
        Intrinsics.checkNotNullExpressionValue(downloadButtonBV, "downloadButtonBV");
        WrappedIconButtonHolderKt.bind(downloadButtonBV, item.getDownloadButton(), this.actionHandler);
        LegalDocsOrderStatusView orderStatusView = widgetLegalDocsOrderBinding.orderStatusView;
        Intrinsics.checkNotNullExpressionValue(orderStatusView, "orderStatusView");
        bindOrGone(orderStatusView, item.getStatus());
    }
}
