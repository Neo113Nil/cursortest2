package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.databinding.ItemImageBinding;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.adapter.ImageViewHolder;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsItemBinding;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.ItemVI;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable.ScrollableItemViewHolder;
import ru.ozon.composer.ui.widget.k;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/scrollable/ScrollableItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "backgroundColor", "", "setBackgroundColorInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)V", "item", "bindImage", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsItemBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "csmaImageDelegate", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/adapter/ImageViewHolder;", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollableItemViewHolder extends k<ItemVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationReasonsItemBinding binding;

    @NotNull
    private final ImageViewHolder csmaImageDelegate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int ROUND_RADIUS = UiExtKt.toPx(24);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/scrollable/ScrollableItemViewHolder$Companion;", "", "<init>", "()V", "ROUND_RADIUS", "", "getROUND_RADIUS", "()I", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getROUND_RADIUS() {
            return ScrollableItemViewHolder.ROUND_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ScrollableItemViewHolder(@NotNull ReturnCreationReasonsItemBinding binding, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ScrollableItemViewHolder$actionHandler$1(oneTimePostRefreshHandler)).buildHandler();
        this.actionHandler = buildHandler;
        ItemImageBinding csmaImage = binding.csmaImage;
        Intrinsics.checkNotNullExpressionValue(csmaImage, "csmaImage");
        this.csmaImageDelegate = new ImageViewHolder(csmaImage, buildHandler);
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        AppTokensProvider appTokensProvider = AppTokensProvider.INSTANCE;
        Context context = constraintLayout2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (appTokensProvider.isSelect(context)) {
            return;
        }
        constraintLayout2.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.scrollable.ScrollableItemViewHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ScrollableItemViewHolder.Companion companion;
                ScrollableItemViewHolder.Companion companion2;
                Intrinsics.checkNotNullParameter(view, "view");
                if (outline != null) {
                    companion = ScrollableItemViewHolder.Companion;
                    int round_radius = 0 - companion.getROUND_RADIUS();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    companion2 = ScrollableItemViewHolder.Companion;
                    outline.setRoundRect(0, round_radius, width, height, companion2.getROUND_RADIUS());
                }
            }
        });
        constraintLayout2.setClipToOutline(true);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ItemVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
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
