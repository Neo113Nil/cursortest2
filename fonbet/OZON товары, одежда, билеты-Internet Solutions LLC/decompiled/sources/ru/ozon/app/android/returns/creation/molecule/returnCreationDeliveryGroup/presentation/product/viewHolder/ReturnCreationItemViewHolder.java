package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder;

import Am.b;
import LG.a;
import Vg.d;
import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationItemBinding;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewObject.ItemVO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckboxBindingDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.IconButtonView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.button.IconButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewHolder/ReturnCreationItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewObject/ItemVO;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationItemBinding;", "binding", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationItemBinding;LVg/d;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "updateNameTopMargin", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationItemBinding;)V", "", "disabled", "setDisabled", "(Z)V", "initDisablingOverlay", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewObject/ItemVO;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationItemBinding;", "LVg/d;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "checkboxDelegate", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckboxBindingDelegate;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "itemImageDelegate", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "Lkotlin/Function0;", "actionSelect", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View$OnTouchListener;", "actionSelectTouchListener", "Landroid/view/View$OnTouchListener;", "Landroid/view/View$OnClickListener;", "actionSelectClickListener", "Landroid/view/View$OnClickListener;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public final class ReturnCreationItemViewHolder extends k<ItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function0<Unit> actionSelect;

    @NotNull
    private final View.OnClickListener actionSelectClickListener;

    @NotNull
    private final View.OnTouchListener actionSelectTouchListener;

    @NotNull
    private final ReturnCreationItemBinding binding;

    @NotNull
    private final RmsCheckboxBindingDelegate checkboxDelegate;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ImageViewHolder itemImageDelegate;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int WRAPPED_MARGIN = ResourceExtKt.toPx(4);
    private static final int UNWRAPPED_MARGIN = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewHolder/ReturnCreationItemViewHolder$Companion;", "", "<init>", "()V", "", "DISABLED_OPACITY", "F", "", "DISABLED_ALPHA_RGB", "I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReturnCreationItemViewHolder(@NotNull ReturnCreationItemBinding binding, @NotNull d customActionHandlersStoreFactory, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnCreationItemViewHolder$actionHandler$1(this)).onPreProcess(new ReturnCreationItemViewHolder$actionHandler$2(oneTimePostRefreshHandler)).buildHandler();
        this.actionHandler = buildHandler;
        this.checkboxDelegate = new RmsCheckboxBindingDelegate();
        ItemImageBinding itemImage = binding.itemImage;
        Intrinsics.checkNotNullExpressionValue(itemImage, "itemImage");
        this.itemImageDelegate = new ImageViewHolder(itemImage, buildHandler);
        this.actionSelect = new ReturnCreationItemViewHolder$actionSelect$1(this);
        a aVar = new a(this, 0);
        this.actionSelectTouchListener = aVar;
        b bVar = new b(this, 2);
        this.actionSelectClickListener = bVar;
        binding.returnCreationProductCl.setOnClickListener(bVar);
        binding.nameTv.setOnTouchListener(aVar);
        binding.descriptionTv.setOnTouchListener(aVar);
        binding.itemImage.getConstraintLayout().setOnClickListener(null);
        binding.itemImage.getConstraintLayout().setOnTouchListener(aVar);
        binding.itemImage.productMediaPmv.setOnTouchListener(aVar);
        CheckBoxView checkBoxView = binding.checkbox;
        checkBoxView.setClickable(false);
        checkBoxView.setFocusable(false);
        initDisablingOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void actionSelectClickListener$lambda$1(ReturnCreationItemViewHolder returnCreationItemViewHolder, View view) {
        returnCreationItemViewHolder.actionSelect.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean actionSelectTouchListener$lambda$0(ReturnCreationItemViewHolder returnCreationItemViewHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        returnCreationItemViewHolder.actionSelect.invoke();
        return false;
    }

    private final void initDisablingOverlay() {
        ReturnCreationItemBinding returnCreationItemBinding = this.binding;
        returnCreationItemBinding.imageDisablingOverlay.setBackground(new ColorDrawable(c.f(getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()), 153)));
        returnCreationItemBinding.imageDisablingOverlay.bringToFront();
    }

    private final void setDisabled(boolean disabled) {
        ReturnCreationItemBinding returnCreationItemBinding = this.binding;
        if (disabled) {
            View imageDisablingOverlay = returnCreationItemBinding.imageDisablingOverlay;
            Intrinsics.checkNotNullExpressionValue(imageDisablingOverlay, "imageDisablingOverlay");
            ViewExtKt.show(imageDisablingOverlay);
        } else {
            View imageDisablingOverlay2 = returnCreationItemBinding.imageDisablingOverlay;
            Intrinsics.checkNotNullExpressionValue(imageDisablingOverlay2, "imageDisablingOverlay");
            ViewExtKt.gone(imageDisablingOverlay2);
        }
    }

    private final void updateNameTopMargin(final ReturnCreationItemBinding returnCreationItemBinding) {
        Flow priceAndSealBadgeFlow = returnCreationItemBinding.priceAndSealBadgeFlow;
        Intrinsics.checkNotNullExpressionValue(priceAndSealBadgeFlow, "priceAndSealBadgeFlow");
        if (!priceAndSealBadgeFlow.isLaidOut() || priceAndSealBadgeFlow.isLayoutRequested()) {
            priceAndSealBadgeFlow.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewHolder.ReturnCreationItemViewHolder$updateNameTopMargin$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    int i11 = view.getMeasuredHeight() > Math.max(ReturnCreationItemBinding.this.priceView.getMeasuredHeight(), ReturnCreationItemBinding.this.sealBadgeView.getMeasuredHeight()) ? ReturnCreationItemViewHolder.WRAPPED_MARGIN : ReturnCreationItemViewHolder.UNWRAPPED_MARGIN;
                    TextAtomV2View nameTv = ReturnCreationItemBinding.this.nameTv;
                    Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
                    ViewGroup.LayoutParams layoutParams = nameTv.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    bVar.setMargins(0, i11, 0, 0);
                    nameTv.setLayoutParams(bVar);
                }
            });
            return;
        }
        int i11 = priceAndSealBadgeFlow.getMeasuredHeight() > Math.max(returnCreationItemBinding.priceView.getMeasuredHeight(), returnCreationItemBinding.sealBadgeView.getMeasuredHeight()) ? WRAPPED_MARGIN : UNWRAPPED_MARGIN;
        TextAtomV2View nameTv = returnCreationItemBinding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        ViewGroup.LayoutParams layoutParams = nameTv.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.setMargins(0, i11, 0, 0);
        nameTv.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnCreationItemBinding returnCreationItemBinding = this.binding;
        RmsCheckboxBindingDelegate rmsCheckboxBindingDelegate = this.checkboxDelegate;
        CheckBoxView checkbox = returnCreationItemBinding.checkbox;
        Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
        rmsCheckboxBindingDelegate.bind(checkbox, item.getCheckbox());
        PriceAtomView priceView = returnCreationItemBinding.priceView;
        Intrinsics.checkNotNullExpressionValue(priceView, "priceView");
        PriceAtomHolderKt.bind(priceView, item.getPrice(), this.actionHandler);
        TextAtomV2View nameTv = returnCreationItemBinding.nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextHolderKt.bind(nameTv, item.getName(), this.actionHandler);
        TextAtomV2View descriptionTv = returnCreationItemBinding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextHolderKt.bindOrGone(descriptionTv, item.getDescription(), this.actionHandler);
        TextAtomV2View dueDateTv = returnCreationItemBinding.dueDateTv;
        Intrinsics.checkNotNullExpressionValue(dueDateTv, "dueDateTv");
        TextHolderKt.bindOrGone(dueDateTv, item.getDueDate(), this.actionHandler);
        returnCreationItemBinding.quantitySelector.bindOrGone(item.getQuantitySelector(), this.actionHandler);
        BadgeView badgeBv = returnCreationItemBinding.badgeBv;
        Intrinsics.checkNotNullExpressionValue(badgeBv, "badgeBv");
        BadgeHolderKt.bindOrGone(badgeBv, item.getBadge(), this.actionHandler);
        IconButtonView crossIconButton = returnCreationItemBinding.crossIconButton;
        Intrinsics.checkNotNullExpressionValue(crossIconButton, "crossIconButton");
        IconButtonHolderKt.bindOrGone(crossIconButton, item.getCrossButton(), this.actionHandler);
        ButtonV3View buttonView = returnCreationItemBinding.buttonView;
        Intrinsics.checkNotNullExpressionValue(buttonView, "buttonView");
        ButtonV3HolderKt.bindOrGone(buttonView, item.getButton(), this.actionHandler);
        setDisabled(Intrinsics.d(item.getIsDisabled(), Boolean.TRUE));
        this.itemImageDelegate.bind(item.getItemImage());
        BadgeView sealBadgeView = returnCreationItemBinding.sealBadgeView;
        Intrinsics.checkNotNullExpressionValue(sealBadgeView, "sealBadgeView");
        BadgeHolderKt.bindOrGone(sealBadgeView, item.getSealBadge(), this.actionHandler);
        updateNameTopMargin(returnCreationItemBinding);
    }
}
