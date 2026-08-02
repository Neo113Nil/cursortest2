package ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.presentation;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.databinding.WidgetBuyersContactsBinding;
import ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.presentation.decorator.BuyersContactsTextAtomsDecorator;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/presentation/BuyersContactsWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/presentation/BuyersContactsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/buyersContacts/presentation/BuyersContactsVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetBuyersContactsBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetBuyersContactsBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "", "defaultSpacing", "I", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BuyersContactsWidgetViewHolder extends k<BuyersContactsVO> {

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetBuyersContactsBinding binding;

    @NotNull
    private final View containerView;
    private final int defaultSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyersContactsWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetBuyersContactsBinding bind = WidgetBuyersContactsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        this.defaultSpacing = ResourceExtKt.toPx(4, getContext());
        VerticalAtomsLayout verticalAtomsLayout = bind.buyersContactsTextAtomsVAL;
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new BuyersContactsTextAtomsDecorator(context));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        InfoBadgeView infoBadgeView = bind.buyersContactsBadgeIBV;
        Context context2 = infoBadgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(12, context2);
        Context context3 = infoBadgeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(12, context3);
        infoBadgeView.setIconSize(24);
        infoBadgeView.setTextStartMargin(12);
        infoBadgeView.setPadding(px2, px, px2, px);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BuyersContactsVO item, @NotNull d info) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView buyersContactsHeaderTV = this.binding.buyersContactsHeaderTV;
        Intrinsics.checkNotNullExpressionValue(buyersContactsHeaderTV, "buyersContactsHeaderTV");
        TextAtomHolderKt.bindOrGone$default(buyersContactsHeaderTV, item.getHeader(), null, 2, null);
        VerticalAtomsLayout verticalAtomsLayout = this.binding.buyersContactsTextAtomsVAL;
        VerticalAtomsDecorator decorator = verticalAtomsLayout.getDecorator();
        Intrinsics.g(decorator, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.order.widgets.buyersContacts.presentation.decorator.BuyersContactsTextAtomsDecorator");
        BuyersContactsTextAtomsDecorator buyersContactsTextAtomsDecorator = (BuyersContactsTextAtomsDecorator) decorator;
        if (item.getAtomSpacing() != null) {
            int intValue = item.getAtomSpacing().intValue();
            Context context = verticalAtomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i11 = ResourceExtKt.toPx(intValue, context);
        } else {
            i11 = this.defaultSpacing;
        }
        buyersContactsTextAtomsDecorator.setTopTextMargin(i11);
        this.atomsAdapter.bind(getContext(), item.getTextAtoms());
        InfoBadgeView.bindOrGone$default(this.binding.buyersContactsBadgeIBV, item.getInfoBadge(), null, 2, null);
    }
}
