package ru.ozon.app.android.returns.creation.widgets.total.presentation.viewHolder;

import EX.c;
import Hj.C3143a;
import Vg.d;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationTotalBinding;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewHolder.ReturnCreationTotalViewHolder;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewObject.Header;
import ru.ozon.app.android.returns.creation.widgets.total.presentation.viewObject.TotalVO;
import ru.ozon.app.android.returns.ui.databinding.ReturnBalanceTotalRowBinding;
import ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView.ReturnBalanceTotalRowsListAdapter;
import ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView.ReturnCreationTotalRowViewHolder;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceDetailsBlock;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRowItem;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u0011*\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010!R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020+0*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00110.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewHolder/ReturnCreationTotalViewHolder;", "Ld20/a;", "Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/TotalVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationTotalBinding;", "binding", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationTotalBinding;Ll10/i;LVg/d;Ld20/e;)V", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;", "refundDetailsBlock", "", "bindRefundDetailsBlock", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationTotalBinding;Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceDetailsBlock;)V", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettings", "withCommon", "(Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "item", "bind", "(Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewObject/TotalVO;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationTotalBinding;", "getBinding", "()Lru/ozon/app/android/returns/creation/databinding/ReturnCreationTotalBinding;", "Ll10/i;", "getContainer", "()Ll10/i;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "customActionHandlers", "Ljava/util/Set;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter;", "adapter", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter;", "refundDetailsAdapter", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;", "totalRowVH", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;", "expandRowsItemVH", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "refundDetailsGroupBackgroundDrawable", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationTotalViewHolder extends AbstractC6064a<TotalVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnBalanceTotalRowsListAdapter adapter;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final ReturnCreationTotalBinding binding;

    @NotNull
    private final i container;

    @NotNull
    private final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    @NotNull
    private final ReturnCreationTotalRowViewHolder expandRowsItemVH;

    @NotNull
    private final ReturnBalanceTotalRowsListAdapter refundDetailsAdapter;

    @NotNull
    private final GradientDrawable refundDetailsGroupBackgroundDrawable;

    @NotNull
    private final ReturnCreationTotalRowViewHolder totalRowVH;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float TOP_CORNER_RADIUS = ResourceExtKt.toPxF(CornerRadius.RADIUS_600.getPx());
    private static final float BOTTOM_CORNER_RADIUS = ResourceExtKt.toPxF(CornerRadius.NO_RADIUS.getPx());

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/total/presentation/viewHolder/ReturnCreationTotalViewHolder$Companion;", "", "<init>", "()V", "", "TOP_CORNER_RADIUS", "F", "getTOP_CORNER_RADIUS", "()F", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getTOP_CORNER_RADIUS() {
            return ReturnCreationTotalViewHolder.TOP_CORNER_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCreationTotalViewHolder(@NotNull ReturnCreationTotalBinding binding, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.container = container;
        Class[] elements = {ComposerActionWithActionHandler.class, ComposerActionAndRedirectActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.customActionHandlers = C7705l.j0(elements);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ReturnCreationTotalViewHolder$actionHandler$1(customActionHandlersStoreFactory, this)).buildHandler();
        this.actionHandler = buildHandler;
        ReturnBalanceTotalRowsListAdapter returnBalanceTotalRowsListAdapter = new ReturnBalanceTotalRowsListAdapter(buildHandler);
        this.adapter = returnBalanceTotalRowsListAdapter;
        ReturnBalanceTotalRowsListAdapter returnBalanceTotalRowsListAdapter2 = new ReturnBalanceTotalRowsListAdapter(buildHandler);
        this.refundDetailsAdapter = returnBalanceTotalRowsListAdapter2;
        ReturnBalanceTotalRowBinding totalRow = binding.totalRow;
        Intrinsics.checkNotNullExpressionValue(totalRow, "totalRow");
        this.totalRowVH = new ReturnCreationTotalRowViewHolder(totalRow, buildHandler);
        ReturnBalanceTotalRowBinding expandRowsItem = binding.expandRowsItem;
        Intrinsics.checkNotNullExpressionValue(expandRowsItem, "expandRowsItem");
        this.expandRowsItemVH = new ReturnCreationTotalRowViewHolder(expandRowsItem, buildHandler);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f7 = TOP_CORNER_RADIUS;
        float f11 = BOTTOM_CORNER_RADIUS;
        gradientDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, f11, f11, f11, f11});
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        AppTokensProvider.CornerRadius cornerRadius = AppTokensProvider.CornerRadius.INSTANCE;
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        gradientDrawable2.setCornerRadius(cornerRadius.average(L11));
        this.refundDetailsGroupBackgroundDrawable = gradientDrawable2;
        binding.rowsRv.setAdapter(returnBalanceTotalRowsListAdapter);
        binding.refundDetailsRowsRv.setAdapter(returnBalanceTotalRowsListAdapter2);
        binding.headerContainerLl.setOnClickListener(new c(this, 9));
        binding.returnCreationTotalLl.setBackground(gradientDrawable);
        binding.refundDetailsGroupLl.setBackground(gradientDrawable2);
    }

    private final void bindButton(ButtonV3DTO button) {
        ButtonV3View buttonV3View = this.binding.buttonBv;
        Intrinsics.f(buttonV3View);
        ButtonV3HolderKt.bind(buttonV3View, button, this.actionHandler);
        buttonV3View.setEnabled(Intrinsics.d(button.isDisabled(), Boolean.FALSE));
    }

    private final void bindRefundDetailsBlock(ReturnCreationTotalBinding returnCreationTotalBinding, BalanceDetailsBlock balanceDetailsBlock) {
        List<BalanceRow> rows;
        if (balanceDetailsBlock == null || (rows = balanceDetailsBlock.getRows()) == null || !(!rows.isEmpty())) {
            LinearLayout refundDetailsGroupLl = returnCreationTotalBinding.refundDetailsGroupLl;
            Intrinsics.checkNotNullExpressionValue(refundDetailsGroupLl, "refundDetailsGroupLl");
            ViewExtKt.gone(refundDetailsGroupLl);
            return;
        }
        LinearLayout refundDetailsGroupLl2 = returnCreationTotalBinding.refundDetailsGroupLl;
        Intrinsics.checkNotNullExpressionValue(refundDetailsGroupLl2, "refundDetailsGroupLl");
        ViewExtKt.show(refundDetailsGroupLl2);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        Integer parseColor = styleParser.parseColor(L11, balanceDetailsBlock.getBackgroundColor());
        if (parseColor != null) {
            this.refundDetailsGroupBackgroundDrawable.setColor(parseColor.intValue());
        }
        TextAtomV2View refundDetailsTitleTav = returnCreationTotalBinding.refundDetailsTitleTav;
        Intrinsics.checkNotNullExpressionValue(refundDetailsTitleTav, "refundDetailsTitleTav");
        TextHolderKt.bindOrGone(refundDetailsTitleTav, balanceDetailsBlock.getTitle(), this.actionHandler);
        this.refundDetailsAdapter.submitList(balanceDetailsBlock.getRows());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$4$lambda$3(ReturnCreationTotalViewHolder returnCreationTotalViewHolder, View view) {
        Header header;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        TotalVO totalVO = (TotalVO) returnCreationTotalViewHolder.getBoundData();
        if (totalVO == null || (header = totalVO.getHeader()) == null || (common = header.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        returnCreationTotalViewHolder.actionHandler.invoke(atomAction);
    }

    private final BalanceRow withCommon(BalanceRow balanceRow, CommonControlSettings commonControlSettings) {
        BalanceRow balanceRow2 = balanceRow.getLeftItem().getCommon() != null ? balanceRow : null;
        return balanceRow2 == null ? BalanceRow.copy$default(balanceRow, 0L, BalanceRowItem.copy$default(balanceRow.getLeftItem(), null, null, null, commonControlSettings, 7, null), null, 5, null) : balanceRow2;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(this.container.Y());
        composerBottomContainer.setElevation(ResourceExtKt.toPxF(16));
        composerBottomContainer.setBackgroundColor(composerBottomContainer.getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        composerBottomContainer.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.creation.widgets.total.presentation.viewHolder.ReturnCreationTotalViewHolder$onWidgetCreated$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ReturnCreationTotalViewHolder.Companion companion;
                ReturnCreationTotalViewHolder.Companion companion2;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                companion = ReturnCreationTotalViewHolder.Companion;
                int top_corner_radius = height + ((int) companion.getTOP_CORNER_RADIUS());
                companion2 = ReturnCreationTotalViewHolder.Companion;
                outline.setRoundRect(0, 0, f7, top_corner_radius, companion2.getTOP_CORNER_RADIUS());
            }
        });
        composerBottomContainer.setClipToOutline(true);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        LinearLayout composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(this.container.Y());
        composerBottomContainer.setElevation(0.0f);
        composerBottomContainer.setBackgroundColor(composerBottomContainer.getContext().getColor(UniColors.WHITE_TRANSPARENT_0.getResId()));
        composerBottomContainer.setOutlineProvider(null);
        composerBottomContainer.setClipToOutline(false);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TotalVO item) {
        BalanceRow expandRow;
        BalanceRow totalRow;
        Intrinsics.checkNotNullParameter(item, "item");
        ReturnCreationTotalBinding returnCreationTotalBinding = this.binding;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        Integer parseColor = styleParser.parseColor(L11, item.getBackgroundColor());
        if (parseColor != null) {
            this.backgroundDrawable.setColor(parseColor.intValue());
        }
        ReturnCreationTotalRowViewHolder returnCreationTotalRowViewHolder = this.totalRowVH;
        Header header = item.getHeader();
        BalanceRow balanceRow = null;
        returnCreationTotalRowViewHolder.bindOrGone((header == null || (totalRow = header.getTotalRow()) == null) ? null : withCommon(totalRow, item.getHeader().getCommon()));
        ReturnCreationTotalRowViewHolder returnCreationTotalRowViewHolder2 = this.expandRowsItemVH;
        Header header2 = item.getHeader();
        if (header2 != null && (expandRow = header2.getExpandRow()) != null) {
            balanceRow = withCommon(expandRow, item.getHeader().getCommon());
        }
        returnCreationTotalRowViewHolder2.bindOrGone(balanceRow);
        bindRefundDetailsBlock(returnCreationTotalBinding, item.getRefundDetailsBlock());
        RecyclerView rowsRv = returnCreationTotalBinding.rowsRv;
        Intrinsics.checkNotNullExpressionValue(rowsRv, "rowsRv");
        boolean z11 = false;
        if (item.getRows() != null && (!r2.isEmpty())) {
            z11 = true;
        }
        ViewExtKt.showOrGone(rowsRv, Boolean.valueOf(z11));
        this.adapter.submitList(item.getRows());
        bindButton(item.getButton());
        TextAtomV2View descriptionTav = returnCreationTotalBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        TextHolderKt.bindOrGone(descriptionTav, item.getDescription(), this.actionHandler);
    }
}
