package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import AW.b;
import ED.a;
import WZ.t;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryCellDefaultBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryCellWithIconBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryFooterBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryMainHeaderBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryPickupBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliverySectionHeaderBinding;
import ru.ozon.app.android.pdp.databinding.PdpItemDeliveryVerticalSpaceBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Placeholder", "Separator", "VerticalSpace", "MainHeader", "SectionHeader", "CellDefault", "CellWithIcon", "Footer", "Pickup", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$CellDefault;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$CellWithIcon;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Footer;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$MainHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Placeholder;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Separator;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$VerticalSpace;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class DeliveryAdapterViewHolder extends j {

    @NotNull
    private final View containerView;

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J6\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$CellDefault;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "cell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryCellDefaultBinding;", "bind", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellDefault;", "bindText", "textView", "Landroid/widget/TextView;", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "textColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "colorDisabledAsEnabled", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CellDefault extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliveryCellDefaultBinding binding;
        private CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefault(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            PdpItemDeliveryCellDefaultBinding bind = PdpItemDeliveryCellDefaultBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            containerView.setOnClickListener(new b(this, onAction));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(CellDefault cellDefault, Function1 function1, View view) {
            AtomActionDTO action;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault = cellDefault.cell;
            if (cellWithSubtitleDefault == null || (action = cellWithSubtitleDefault.getAction()) == null) {
                return;
            }
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault2 = cellDefault.cell;
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, cellWithSubtitleDefault2 != null ? cellWithSubtitleDefault2.getTrackingInfo() : null);
            if (atomAction != null) {
                function1.invoke(atomAction);
            }
        }

        private final void bindText(TextView textView, OzonSpannableString text, String textColor, AtomActionDTO action, boolean colorDisabledAsEnabled) {
            if (text == null) {
                ViewExtKt.gone(textView);
                return;
            }
            ViewExtKt.show(textView);
            textView.setText(text);
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            if (!OzonSpannableStringKt.hasClickableSpan(text)) {
                linkMovementMethod = null;
            }
            textView.setMovementMethod(linkMovementMethod);
            if (action != null || colorDisabledAsEnabled) {
                Context context = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textView.setLinkTextColor(ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
                StyleParser styleParser = StyleParser.INSTANCE;
                Context context2 = getContainerView().getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                textView.setTextColor(styleParser.parseColor(context2, textColor, UniColors.TEXT_PRIMARY.getResId()));
            }
        }

        public final void bind(@NotNull DeliveryAdapterItem.CellDefault item) {
            Intrinsics.checkNotNullParameter(item, "item");
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cell = item.getCell();
            this.cell = cell;
            PdpItemDeliveryCellDefaultBinding pdpItemDeliveryCellDefaultBinding = this.binding;
            TextAtomV2View deliveryTitleTav = pdpItemDeliveryCellDefaultBinding.deliveryTitleTav;
            Intrinsics.checkNotNullExpressionValue(deliveryTitleTav, "deliveryTitleTav");
            bindText(deliveryTitleTav, cell.getTitle(), cell.getTitleColor(), cell.getAction(), cell.getColorDisabledAsEnabled());
            TextAtomV2View deliverySubtitleTav = pdpItemDeliveryCellDefaultBinding.deliverySubtitleTav;
            Intrinsics.checkNotNullExpressionValue(deliverySubtitleTav, "deliverySubtitleTav");
            bindText(deliverySubtitleTav, cell.getSubtitle(), cell.getSubtitleColor(), cell.getAction(), cell.getColorDisabledAsEnabled());
            ImageView disclosureIv = pdpItemDeliveryCellDefaultBinding.disclosureIv;
            Intrinsics.checkNotNullExpressionValue(disclosureIv, "disclosureIv");
            disclosureIv.setVisibility(cell.getHideDisclosure() ? 8 : 0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$CellWithIcon;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryCellWithIconBinding;", "bind", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$CellSingleAtom;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CellWithIcon extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliveryCellWithIconBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellWithIcon(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            PdpItemDeliveryCellWithIconBinding bind = PdpItemDeliveryCellWithIconBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            bind.cellSa.setOnAction(onAction);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        
            if (r9 != (r1 != null ? r1.bottomMargin : 0)) goto L39;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void bind(@NotNull DeliveryAdapterItem.CellSingleAtom item) {
            Intrinsics.checkNotNullParameter(item, "item");
            PdpItemDeliveryCellWithIconBinding pdpItemDeliveryCellWithIconBinding = this.binding;
            boolean z11 = item.getCell() instanceof BadgeTitleSubtitleCellDTO;
            SingleAtom cellSa = pdpItemDeliveryCellWithIconBinding.cellSa;
            Intrinsics.checkNotNullExpressionValue(cellSa, "cellSa");
            ViewGroup.LayoutParams layoutParams = cellSa.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i11 = marginLayoutParams.leftMargin;
                int i12 = marginLayoutParams.topMargin;
                int i13 = marginLayoutParams.rightMargin;
                int i14 = marginLayoutParams.bottomMargin;
                int dp_52 = z11 ? Dimens.INSTANCE.getDP_52() : 0;
                marginLayoutParams.leftMargin = dp_52;
                if (i11 == dp_52) {
                    ViewGroup.LayoutParams layoutParams2 = cellSa.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams3 = cellSa.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                            ViewGroup.LayoutParams layoutParams4 = cellSa.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        }
                    }
                }
                cellSa.setLayoutParams(marginLayoutParams);
            }
            SingleAtom.bind$default(pdpItemDeliveryCellWithIconBinding.cellSa, item.getCell(), false, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Footer;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryFooterBinding;", "bind", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Footer;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Footer extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliveryFooterBinding binding;

        @NotNull
        private final Function1<AtomAction, Unit> onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Footer(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            this.onAction = onAction;
            PdpItemDeliveryFooterBinding bind = PdpItemDeliveryFooterBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull DeliveryAdapterItem.Footer item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SmallBorderlessButtonView moreInfoBtn = this.binding.moreInfoBtn;
            Intrinsics.checkNotNullExpressionValue(moreInfoBtn, "moreInfoBtn");
            WrappedBorderlessButtonHolderKt.bind(moreInfoBtn, item.getFooter().getMoreInfoButton(), this.onAction);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$MainHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryMainHeaderBinding;", "bind", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$MainHeader;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MainHeader extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliveryMainHeaderBinding binding;

        @NotNull
        private final Function1<AtomAction, Unit> onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MainHeader(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            this.onAction = onAction;
            PdpItemDeliveryMainHeaderBinding bind = PdpItemDeliveryMainHeaderBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull DeliveryAdapterItem.MainHeader item) {
            Intrinsics.checkNotNullParameter(item, "item");
            DeliveryHeader header = item.getHeader();
            PdpItemDeliveryMainHeaderBinding pdpItemDeliveryMainHeaderBinding = this.binding;
            TextAtomV2View titleTAV = pdpItemDeliveryMainHeaderBinding.titleTAV;
            Intrinsics.checkNotNullExpressionValue(titleTAV, "titleTAV");
            TextHolderKt.bindOrGone$default(titleTAV, header.getTitle(), null, 2, null);
            SmallBorderlessButtonView anotherSellerBtn = pdpItemDeliveryMainHeaderBinding.anotherSellerBtn;
            Intrinsics.checkNotNullExpressionValue(anotherSellerBtn, "anotherSellerBtn");
            WrappedBorderlessButtonHolderKt.bindOrGone(anotherSellerBtn, header.getButton(), this.onAction);
            SmallBorderlessButtonView anotherSellerBtn2 = pdpItemDeliveryMainHeaderBinding.anotherSellerBtn;
            Intrinsics.checkNotNullExpressionValue(anotherSellerBtn2, "anotherSellerBtn");
            anotherSellerBtn2.setPadding(anotherSellerBtn2.getPaddingLeft(), 0, anotherSellerBtn2.getPaddingRight(), 0);
            DisclaimerContainer annotationAtom = pdpItemDeliveryMainHeaderBinding.annotationAtom;
            Intrinsics.checkNotNullExpressionValue(annotationAtom, "annotationAtom");
            DisclaimerHolderKt.bindOrGone(annotationAtom, header.getAnnotation(), this.onAction);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Pickup;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$Pickup;)V", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "tokenizedEvent", "LWZ/t;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "pickupButtonVo", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonVo;", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryPickupBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryPickupBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pickup extends DeliveryAdapterViewHolder {
        private AtomAction action;

        @NotNull
        private final PdpItemDeliveryPickupBinding binding;
        private PickupButtonVo pickupButtonVo;
        private t tokenizedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pickup(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> onAction) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            Intrinsics.checkNotNullParameter(onAction, "onAction");
            PdpItemDeliveryPickupBinding bind = PdpItemDeliveryPickupBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            bind.pickupBtnCardView.setOnClickListener(new a(0, this, onAction));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Pickup pickup, Function1 function1, View view) {
            AtomAction atomAction = pickup.action;
            if (atomAction != null) {
                function1.invoke(atomAction);
            }
        }

        public final void bind(@NotNull DeliveryAdapterItem.Pickup item) {
            Intrinsics.checkNotNullParameter(item, "item");
            PickupButtonWrapper pickupButtonWrapper = item.getPickupButtonWrapper();
            this.binding.pickupBtnCardView.bind(pickupButtonWrapper.getPickupButtonVo());
            this.pickupButtonVo = pickupButtonWrapper.getPickupButtonVo();
            this.tokenizedEvent = pickupButtonWrapper.getTokenizedEvent();
            this.action = pickupButtonWrapper.getAction();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Placeholder;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Placeholder extends DeliveryAdapterViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Placeholder(@NotNull View containerView) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$SectionHeader;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliverySectionHeaderBinding;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$SectionHeader;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SectionHeader extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliverySectionHeaderBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionHeader(@NotNull View containerView) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            PdpItemDeliverySectionHeaderBinding bind = PdpItemDeliverySectionHeaderBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull DeliveryAdapterItem.SectionHeader item) {
            Intrinsics.checkNotNullParameter(item, "item");
            PdpItemDeliverySectionHeaderBinding pdpItemDeliverySectionHeaderBinding = this.binding;
            TextAtomV2View deliveryVariantTav = pdpItemDeliverySectionHeaderBinding.deliveryVariantTav;
            Intrinsics.checkNotNullExpressionValue(deliveryVariantTav, "deliveryVariantTav");
            TextHolderKt.bindOrGone$default(deliveryVariantTav, item.getText(), null, 2, null);
            String icon = item.getIcon();
            if (icon != null) {
                ImageView deliveryVariantIconIv = pdpItemDeliverySectionHeaderBinding.deliveryVariantIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryVariantIconIv, "deliveryVariantIconIv");
                ViewExtKt.show(deliveryVariantIconIv);
                ImageView deliveryVariantIconIv2 = pdpItemDeliverySectionHeaderBinding.deliveryVariantIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryVariantIconIv2, "deliveryVariantIconIv");
                ImageViewExtKt.load$default(deliveryVariantIconIv2, icon, null, null, null, null, false, null, 126, null);
            } else {
                ImageView deliveryVariantIconIv3 = pdpItemDeliverySectionHeaderBinding.deliveryVariantIconIv;
                Intrinsics.checkNotNullExpressionValue(deliveryVariantIconIv3, "deliveryVariantIconIv");
                ViewExtKt.invisible(deliveryVariantIconIv3);
            }
            String iconTint = item.getIconTint();
            if (iconTint == null) {
                pdpItemDeliverySectionHeaderBinding.deliveryVariantIconIv.clearColorFilter();
                return;
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContainerView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, iconTint);
            ImageView deliveryVariantIconIv4 = pdpItemDeliverySectionHeaderBinding.deliveryVariantIconIv;
            Intrinsics.checkNotNullExpressionValue(deliveryVariantIconIv4, "deliveryVariantIconIv");
            ThemeExtKt.tint(deliveryVariantIconIv4, parseColor);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$Separator;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Separator extends DeliveryAdapterViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Separator(@NotNull View containerView) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder$VerticalSpace;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterViewHolder;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/pdp/databinding/PdpItemDeliveryVerticalSpaceBinding;", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem$VerticalSpace;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VerticalSpace extends DeliveryAdapterViewHolder {

        @NotNull
        private final PdpItemDeliveryVerticalSpaceBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalSpace(@NotNull View containerView) {
            super(containerView, null);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            PdpItemDeliveryVerticalSpaceBinding bind = PdpItemDeliveryVerticalSpaceBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull DeliveryAdapterItem.VerticalSpace item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Space verticalSpace = this.binding.verticalSpace;
            Intrinsics.checkNotNullExpressionValue(verticalSpace, "verticalSpace");
            ViewGroup.LayoutParams layoutParams = verticalSpace.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = item.getHeightPx();
            verticalSpace.setLayoutParams(layoutParams);
        }
    }

    public /* synthetic */ DeliveryAdapterViewHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    @NotNull
    public final View getContainerView() {
        return this.containerView;
    }

    private DeliveryAdapterViewHolder(View view) {
        super(view);
        this.containerView = view;
    }
}
