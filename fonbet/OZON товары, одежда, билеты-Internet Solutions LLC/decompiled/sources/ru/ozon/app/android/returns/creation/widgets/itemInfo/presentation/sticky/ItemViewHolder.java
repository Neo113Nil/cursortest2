package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsItemBinding;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemVI;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemViewHolder;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u0011*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/sticky/ItemViewHolder;", "Ld20/d;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "Ll10/i;", "container", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;", "binding", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Ld20/e;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "backgroundColor", "", "setBackgroundColorInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)V", "item", "bindImage", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;)V", "bind", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "csmaImageDelegate", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemViewHolder extends AbstractC6067d<ItemVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationReasonsItemBinding binding;

    @NotNull
    private final ImageViewHolder csmaImageDelegate;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ROUND_RADIUS = UiExtKt.toPx(24);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/sticky/ItemViewHolder$Companion;", "", "<init>", "()V", "ROUND_RADIUS", "", "getROUND_RADIUS", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getROUND_RADIUS() {
            return ItemViewHolder.ROUND_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewHolder(@NotNull i container, @NotNull ReturnCreationReasonsItemBinding binding, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.binding = binding;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(container, new ItemViewHolder$actionHandler$1(this), new ItemViewHolder$actionHandler$2(this), new ItemViewHolder$actionHandler$3(this)).onPreProcess(new ItemViewHolder$actionHandler$4(oneTimePostRefreshHandler)).buildHandler();
        this.actionHandler = buildHandler;
        ItemImageBinding csmaImage = binding.csmaImage;
        Intrinsics.checkNotNullExpressionValue(csmaImage, "csmaImage");
        this.csmaImageDelegate = new ImageViewHolder(csmaImage, buildHandler);
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTokensProvider.isSelect(context)) {
            return;
        }
        constraintLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemViewHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ItemViewHolder.Companion companion;
                ItemViewHolder.Companion companion2;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    companion = ItemViewHolder.Companion;
                    int round_radius = 0 - companion.getROUND_RADIUS();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    companion2 = ItemViewHolder.Companion;
                    outline.setRoundRect(0, round_radius, width, height, companion2.getROUND_RADIUS());
                }
            }
        });
        constraintLayout.setClipToOutline(true);
    }

    private final void bindImage(ItemVI item) {
        ImageVO csmaImage = item.getCsmaImage();
        if (csmaImage != null) {
            this.csmaImageDelegate.bind(csmaImage);
            FrameLayout constraintLayout = this.binding.csmaImage.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.show(constraintLayout);
            IconView imageIv = this.binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
            ViewExtKt.gone(imageIv);
            return;
        }
        IconDTO image = item.getImage();
        if (image != null) {
            IconView imageIv2 = this.binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv2, "imageIv");
            IconHolderKt.bind(imageIv2, image, this.actionHandler);
            FrameLayout constraintLayout2 = this.binding.csmaImage.getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ViewExtKt.gone(constraintLayout2);
            IconView imageIv3 = this.binding.imageIv;
            Intrinsics.checkNotNullExpressionValue(imageIv3, "imageIv");
            ViewExtKt.show(imageIv3);
        }
    }

    private final void setBackgroundColorInternal(ConstraintLayout constraintLayout, String str) {
        int color;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, str);
        if (parseColor != null) {
            color = parseColor.intValue();
        } else {
            Context context2 = constraintLayout.getContext();
            AppTokensProvider.Colors colors = AppTokensProvider.Colors.INSTANCE;
            Context context3 = constraintLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            color = context2.getColor(colors.layerOverlay(context3).getResId());
        }
        constraintLayout.setBackgroundColor(color);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ItemVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ReturnCreationReasonsItemBinding returnCreationReasonsItemBinding = this.binding;
        ConstraintLayout constraintLayout = returnCreationReasonsItemBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        setBackgroundColorInternal(constraintLayout, item.getBackgroundColor());
        bindImage(item);
        PriceAtomView pricePv = returnCreationReasonsItemBinding.pricePv;
        Intrinsics.checkNotNullExpressionValue(pricePv, "pricePv");
        PriceAtomHolderKt.bind(pricePv, item.getPrice(), this.actionHandler);
        TextAtomV2View nameTav = returnCreationReasonsItemBinding.nameTav;
        Intrinsics.checkNotNullExpressionValue(nameTav, "nameTav");
        TextHolderKt.bind(nameTav, item.getName(), this.actionHandler);
        TextAtomV2View descriptionTav = returnCreationReasonsItemBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
        TextHolderKt.bindOrGone(descriptionTav, item.getDescription(), this.actionHandler);
        returnCreationReasonsItemBinding.quantitySelector.bindOrGone(item.getQuantitySelector(), this.actionHandler);
        TextAtomV2View validationTav = returnCreationReasonsItemBinding.validationTav;
        Intrinsics.checkNotNullExpressionValue(validationTav, "validationTav");
        TextHolderKt.bindOrGone(validationTav, item.getValidationText(), this.actionHandler);
        IconButtonV3View deleteButtonIb = returnCreationReasonsItemBinding.deleteButtonIb;
        Intrinsics.checkNotNullExpressionValue(deleteButtonIb, "deleteButtonIb");
        IconButtonV3HolderKt.bindOrGone(deleteButtonIb, item.getDeleteButton(), this.actionHandler);
        DisclaimerContainer disclaimerContainer = returnCreationReasonsItemBinding.disclaimerContainer;
        Intrinsics.checkNotNullExpressionValue(disclaimerContainer, "disclaimerContainer");
        DisclaimerHolderKt.bindOrGone(disclaimerContainer, item.getAnnotation(), this.actionHandler);
    }
}
