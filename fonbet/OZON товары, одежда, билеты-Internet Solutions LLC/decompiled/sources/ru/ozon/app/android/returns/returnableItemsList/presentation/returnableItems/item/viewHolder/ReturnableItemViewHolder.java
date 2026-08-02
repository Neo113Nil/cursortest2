package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewHolder;

import AI.a;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject.Caption;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject.ReturnableItemVO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.QuantitySelector;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import y7.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemView;", "returnableItemView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;)V", "", "image", "", "bindImage", "(Ljava/lang/String;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "item", "bindCaption", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;)V", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "checkbox", "bindCheckbox", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;)V", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "bindQuantityButtonOrGone", "(Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;)V", "", "enabled", "setEnabled", "(Z)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;Ll20/d;)V", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "returnableItem", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "textsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroid/view/View$OnClickListener;", "actionSelectClickListener", "Landroid/view/View$OnClickListener;", "Companion", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemViewHolder extends k<ReturnableItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View.OnClickListener actionSelectClickListener;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final ComposerReferences refs;
    private ReturnableItemVO returnableItem;

    @NotNull
    private final ReturnableItemView returnableItemView;

    @NotNull
    private final AtomsAdapter textsAdapter;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int IMAGE_CORNER_RADIUS = ResourceExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/ReturnableItemViewHolder$Companion;", "", "<init>", "()V", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnableItemViewHolder(@NotNull ReturnableItemView returnableItemView, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler) {
        super(returnableItemView);
        Intrinsics.checkNotNullParameter(returnableItemView, "returnableItemView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        this.returnableItemView = returnableItemView;
        this.refs = refs;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReturnableItemViewHolder$actionHandler$1(oneTimePostRefreshHandler)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.textsAdapter = atomsAdapter;
        a aVar = new a(this, 14);
        this.actionSelectClickListener = aVar;
        returnableItemView.getSubtitleItemsVal().setAdapter(atomsAdapter);
        ShapeableImageView itemImageIv = returnableItemView.getItemImageIv();
        y7.k shapeAppearanceModel = returnableItemView.getItemImageIv().getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        k.a aVar2 = new k.a(shapeAppearanceModel);
        aVar2.e(IMAGE_CORNER_RADIUS);
        itemImageIv.setShapeAppearanceModel(aVar2.a());
        ShapeableImageView itemImageIv2 = returnableItemView.getItemImageIv();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        itemImageIv2.setBackground(shapeDrawable);
        returnableItemView.getItemImageIv().setClipToOutline(true);
        returnableItemView.setOnClickListener(aVar);
        CheckBoxView checkbox = returnableItemView.getCheckbox();
        checkbox.setClickable(false);
        checkbox.setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void actionSelectClickListener$lambda$1(ReturnableItemViewHolder returnableItemViewHolder, View view) {
        AtomAction action;
        ReturnableItemVO returnableItemVO = returnableItemViewHolder.returnableItem;
        if (returnableItemVO == null || (action = returnableItemVO.getAction()) == null) {
            return;
        }
        returnableItemViewHolder.actionHandler.invoke(action);
    }

    private final void bindCaption(Caption item) {
        TextAtom text;
        ReturnableItemView returnableItemView = this.returnableItemView;
        String str = null;
        TextAtomHolderKt.bindOrGone$default(returnableItemView.getCaptionTv(), item != null ? item.getText() : null, null, 2, null);
        ImageViewExtKt.loadImageOrGone(returnableItemView.getCaptionIconIv(), item != null ? item.getIcon() : null);
        AppCompatImageView captionIconIv = returnableItemView.getCaptionIconIv();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = returnableItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (item != null && (text = item.getText()) != null) {
            str = text.getTextColor();
        }
        ThemeExtKt.tint(captionIconIv, styleParser.parseColor(context, str));
    }

    private final void bindCheckbox(RmsCheckbox checkbox) {
        CheckBoxView checkbox2 = this.returnableItemView.getCheckbox();
        Boolean disabled = checkbox.getDisabled();
        Boolean bool = Boolean.TRUE;
        checkbox2.setEnabled(!Intrinsics.d(disabled, bool));
        checkbox2.setChecked(Intrinsics.d(checkbox.getChecked(), bool));
    }

    private final void bindImage(String image) {
        ShapeableImageView itemImageIv = this.returnableItemView.getItemImageIv();
        if (image == null) {
            ViewExtKt.gone(itemImageIv);
        } else {
            ViewExtKt.show(itemImageIv);
            ImageViewExtKt.load$default(itemImageIv, image, C7714v.a0(new ImageTransformation.RoundedCorners(IMAGE_CORNER_RADIUS, ImageTransformation.RoundedCorners.CornerType.ALL)), null, null, null, false, null, 124, null);
        }
    }

    private final void bindQuantityButtonOrGone(QuantitySelector item) {
        if (item == null) {
            this.returnableItemView.changeQuantitySelectorVisibility(false);
            return;
        }
        ReturnableItemView returnableItemView = this.returnableItemView;
        returnableItemView.changeQuantitySelectorVisibility(true);
        WrappedIconButtonHolderKt.bind(returnableItemView.getDecreaseSibv(), item.getDecrease(), this.actionHandler);
        TextAtomHolderKt.bind$default(returnableItemView.getQuantitySelectorTv(), item.getQuantity(), null, 2, null);
        WrappedIconButtonHolderKt.bind(returnableItemView.getIncreaseSibv(), item.getIncrease(), this.actionHandler);
    }

    private final void setEnabled(boolean enabled) {
        ReturnableItemView returnableItemView = this.returnableItemView;
        float f7 = enabled ? 1.0f : 0.45f;
        returnableItemView.getItemImageIv().setAlpha(f7);
        returnableItemView.getTitleItemTv().setAlpha(f7);
        returnableItemView.getSubtitleItemsVal().setAlpha(f7);
        returnableItemView.getPriceView().setAlpha(f7);
        returnableItemView.getQuantityTv().setAlpha(f7);
        returnableItemView.getDecreaseSibv().setAlpha(f7);
        returnableItemView.getQuantitySelectorTv().setAlpha(f7);
        returnableItemView.getIncreaseSibv().setAlpha(f7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnableItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.returnableItem = item;
        ReturnableItemView returnableItemView = this.returnableItemView;
        bindCheckbox(item.getCheckbox());
        TextAtomHolderKt.bind$default(returnableItemView.getTitleItemTv(), item.getTitle(), null, 2, null);
        bindImage(item.getImage());
        TextAtomHolderKt.bindOrGone$default(returnableItemView.getQuantityTv(), item.getQuantity(), null, 2, null);
        PriceHolderKt.bind$default(returnableItemView.getPriceView(), item.getPrice(), null, 2, null);
        bindCaption(item.getCaption());
        WrappedBorderlessButtonHolderKt.bindOrGone(returnableItemView.getItemActionSbbv(), item.getItemAction(), this.actionHandler);
        bindQuantityButtonOrGone(item.getQuantitySelector());
        AtomsAdapter atomsAdapter = this.textsAdapter;
        Context context = returnableItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getAttributes());
        setEnabled(!Intrinsics.d(item.getIsDisabled(), Boolean.TRUE));
    }
}
