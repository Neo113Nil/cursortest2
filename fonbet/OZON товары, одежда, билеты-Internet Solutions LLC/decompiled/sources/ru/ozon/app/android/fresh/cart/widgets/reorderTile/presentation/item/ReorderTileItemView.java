package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item;

import B90.C2618u;
import Nt.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.cart.R$id;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerBinder;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerView;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.presentation.FreshTextPairView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 k2\u00020\u0001:\u0001kB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010\"\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00112\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b\"\u0010#J;\u0010&\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010$2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+JY\u0010/\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010 \u001a\u00020.2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00112\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b/\u00100Jc\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020.2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u00112\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u000f0\fH\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00108J#\u0010=\u001a\u000209*\u0002092\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000fH\u0002¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HR\"\u0010I\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010b\u001a\u0004\bh\u0010i¨\u0006l"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "item", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onClickEvent", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "innerAtoms", "bindInnerAtoms", "(Ljava/util/List;)V", "", "isNeeded", "bindParanja", "(Z)V", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "controller", "processClickEvent", "bindController", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "showUnavailableButton", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "quantity", "showQuantity", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPicker", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;", "showCartPicker", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder$CartPickerActionType;", "getCartPickerActionHandler", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl$AvailableControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function2;", "previousQuantity", "requestedQuantity", "minValue", "normalizeQuantity", "(III)I", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "", "paramKey", "paramValue", "withCustomParam", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/af/AtomAction$Click;", "hideAllControls", "()V", "radius", "colorToken", "bindBackground", "(ILjava/lang/String;)V", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "spacers", "bindSpacers", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;)V", "tileBackgroundColor", "I", "getTileBackgroundColor", "()I", "setTileBackgroundColor", "(I)V", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Landroid/widget/LinearLayout;", "innerAtomsContainer", "Landroid/widget/LinearLayout;", "rightBlockContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "quantityTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "cartPickerView", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable$delegate", "LSc/j;", "getBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "cartPickerBinder$delegate", "getCartPickerBinder", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerBinder;", "cartPickerBinder", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileItemView extends ConstraintLayout {

    /* renamed from: backgroundDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawable;

    @NotNull
    private final ButtonV3View buttonView;

    /* renamed from: cartPickerBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cartPickerBinder;

    @NotNull
    private final CartPickerView cartPickerView;

    @NotNull
    private final Image imageView;

    @NotNull
    private final LinearLayout innerAtomsContainer;

    @NotNull
    private final TextAtomV2View quantityTextView;

    @NotNull
    private final ConstraintLayout rightBlockContainer;
    private int tileBackgroundColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final CornerRadius imageCornerRadius = CornerRadius.RADIUS_500;

    @NotNull
    private static final UniColors defaultImageBackgroundColor = UniColors.BG_LIGHT_KEY;
    private static final int defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getResId();
    private static final int imageSize = UiExtKt.toPx(68);
    private static final int buttonsMargin = UiExtKt.toPx(8);
    private static final int controllerMargin = UiExtKt.toPx(14);
    private static final int betweenMargin = UiExtKt.toPx(2);
    private static final int defaultRightBlockMinWidth = UiExtKt.toPx(48);
    private static final int controlsRightBlockMinWidth = UiExtKt.toPx(96);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemView$Companion;", "", "<init>", "()V", "", "SHRINK_ACTION_VALUE", "Ljava/lang/String;", "ADD_TO_CART_ACTION_ID", "PARAM_QUANTITY", "", "CART_PICKER_WIDTH", "I", "", "PARANJA_ALPHA", "F", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReorderTileItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindBackground(int radius, String colorToken) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.tileBackgroundColor = styleParser.parseColor(context, colorToken, defaultImageBackgroundColor.getResId());
        getBackgroundDrawable().setCornerRadius(UiExtKt.toPxF(radius));
        GradientDrawable backgroundDrawable = getBackgroundDrawable();
        int i11 = this.tileBackgroundColor;
        backgroundDrawable.setColors(new int[]{i11, i11});
        setBackground(getBackgroundDrawable());
    }

    private final void bindController(ReorderTileVO.TileItem item, ReorderTileVO.TileItem.TileControl controller, Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> actionHandler, Function1<? super t, Unit> processClickEvent) {
        if (controller instanceof ReorderTileVO.TileItem.TileControl.AvailableControl) {
            ReorderTileVO.TileItem.TileControl.AvailableControl availableControl = (ReorderTileVO.TileItem.TileControl.AvailableControl) controller;
            if (availableControl.getQuantity() != null) {
                showQuantity(availableControl.getQuantity());
                return;
            } else if (availableControl.getCartPicker() != null) {
                showCartPicker(item, availableControl.getCartPicker(), availableControl, actionHandler, processClickEvent);
                return;
            } else {
                hideAllControls();
                return;
            }
        }
        if (!(controller instanceof ReorderTileVO.TileItem.TileControl.UnavailableControl)) {
            throw new o();
        }
        ReorderTileVO.TileItem.TileControl.UnavailableControl unavailableControl = (ReorderTileVO.TileItem.TileControl.UnavailableControl) controller;
        if (unavailableControl.getQuantity() != null) {
            showQuantity(unavailableControl.getQuantity());
        } else if (unavailableControl.getButton() != null) {
            showUnavailableButton(item, unavailableControl.getButton(), actionHandler);
        } else {
            hideAllControls();
        }
    }

    private final void bindInnerAtoms(List<? extends AtomDTO> innerAtoms) {
        View view;
        this.innerAtomsContainer.removeAllViews();
        Iterator<? extends AtomDTO> it = innerAtoms.iterator();
        while (true) {
            int i11 = 2;
            if (!it.hasNext()) {
                LinearLayout linearLayout = this.innerAtomsContainer;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f41599F = innerAtoms.size() > 2 ? 0.0f : 0.5f;
                linearLayout.setLayoutParams(bVar);
                return;
            }
            AtomDTO next = it.next();
            AttributeSet attributeSet = null;
            boolean z11 = false;
            if (next instanceof TextDTO) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
                TextViewExtKt.setTextCopyable(textAtomV2View, false);
                TextHolderKt.bindOrGone$default(textAtomV2View, (TextDTO) next, null, 2, null);
                view = textAtomV2View;
            } else if (next instanceof FreshTextPairDTO) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                FreshTextPairView freshTextPairView = new FreshTextPairView(context2, attributeSet, i11, z11 ? 1 : 0);
                freshTextPairView.bindOrGone((FreshTextPairDTO) next);
                view = freshTextPairView;
            } else {
                if (!(next instanceof PriceDTO)) {
                    throw new IllegalStateException("Unknown AtomDto type");
                }
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                PriceAtomView priceAtomView = new PriceAtomView(context3, null, 0, 6, null);
                PriceAtomHolderKt.bindOrGone$default(priceAtomView, (PriceDTO) next, null, 2, null);
                view = priceAtomView;
            }
            view.setOnClickListener(new a(this, 0));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (this.innerAtomsContainer.getChildCount() != 0) {
                layoutParams2.topMargin = betweenMargin;
            }
            view.setLayoutParams(layoutParams2);
            this.innerAtomsContainer.addView(view);
        }
    }

    private final void bindParanja(boolean isNeeded) {
        ViewExtKt.alpha(this.imageView, 0.5f, isNeeded);
        int childCount = this.innerAtomsContainer.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            this.innerAtomsContainer.getChildAt(i11).setAlpha(isNeeded ? 0.5f : 1.0f);
        }
    }

    private final void bindSpacers(ReorderTileVO.TileItem.Spacers spacers) {
        setPadding(UiExtKt.toPx(spacers.getHorizontal()), UiExtKt.toPx(spacers.getVertical()), UiExtKt.toPx(spacers.getHorizontal()), UiExtKt.toPx(spacers.getVertical()));
        LinearLayout linearLayout = this.innerAtomsContainer;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = UiExtKt.toPx(spacers.getBetween());
        linearLayout.setLayoutParams(marginLayoutParams);
    }

    private final GradientDrawable getBackgroundDrawable() {
        return (GradientDrawable) this.backgroundDrawable.getValue();
    }

    private final Function2<CartPickerBinder.CartPickerActionType, CartPickerVO, Unit> getCartPickerActionHandler(ReorderTileVO.TileItem item, ReorderTileVO.TileItem.TileControl.AvailableControl controller, Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> actionHandler, Function1<? super t, Unit> processClickEvent) {
        return new ReorderTileItemView$getCartPickerActionHandler$1(item, this, controller, processClickEvent, actionHandler);
    }

    private final CartPickerBinder getCartPickerBinder() {
        return (CartPickerBinder) this.cartPickerBinder.getValue();
    }

    private final void hideAllControls() {
        this.rightBlockContainer.setMinWidth(defaultRightBlockMinWidth);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.buttonView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.quantityTextView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.cartPickerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int normalizeQuantity(int previousQuantity, int requestedQuantity, int minValue) {
        if (minValue > 1 && previousQuantity == 0 && requestedQuantity > 0) {
            return minValue;
        }
        if (minValue <= 1 || previousQuantity != minValue || requestedQuantity >= minValue) {
            return requestedQuantity;
        }
        return 0;
    }

    private final void showCartPicker(ReorderTileVO.TileItem item, CartPickerVO cartPicker, ReorderTileVO.TileItem.TileControl.AvailableControl controller, Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> actionHandler, Function1<? super t, Unit> processClickEvent) {
        this.rightBlockContainer.setMinWidth(controlsRightBlockMinWidth);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.buttonView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.quantityTextView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.show(this.cartPickerView);
        getCartPickerBinder().bind(this.cartPickerView, cartPicker, new ReorderTileItemView$showCartPicker$1(cartPicker, this), getCartPickerActionHandler(item, controller, actionHandler, processClickEvent), true);
    }

    private final void showQuantity(TextDTO quantity) {
        this.rightBlockContainer.setMinWidth(defaultRightBlockMinWidth);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.buttonView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.cartPickerView);
        TextHolderKt.bindOrGone$default(this.quantityTextView, quantity, null, 2, null);
    }

    private final void showUnavailableButton(ReorderTileVO.TileItem item, ButtonV3DTO button, Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> actionHandler) {
        this.rightBlockContainer.setMinWidth(defaultRightBlockMinWidth);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.cartPickerView);
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(this.quantityTextView);
        ButtonV3HolderKt.bindOrGone(this.buttonView, button, new ReorderTileItemView$showUnavailableButton$1(actionHandler, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction.Click withCustomParam(AtomAction.Click click, String str, String str2) {
        Map<String, String> params = click.getParams();
        if (params == null) {
            params = U.c();
        }
        LinkedHashMap u11 = U.u(params);
        u11.put(str, str2);
        return AtomAction.Click.copy$default(click, null, null, null, u11, null, null, 55, null);
    }

    public final void bind(@NotNull final ReorderTileVO.TileItem item, @NotNull final Function1<? super t, Unit> onClickEvent, @NotNull final Function2<? super AtomAction, ? super ReorderTileVO.TileItem, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageHolderKt.bindOrGone$default(this.imageView, new ImageDTO(item.getImage(), defaultImageBackgroundColor.getToken(), null, false, null, null, null, null, imageCornerRadius, null, null, null, null, null, ImageDTO.FitType.FIT_CENTER, null, 48892, null), null, 2, null);
        bindInnerAtoms(item.getInnerAtoms());
        bindController(item, item.getTileControl(), actionHandler, onClickEvent);
        bindParanja(item.getHasParanja());
        bindBackground(item.getRadius(), item.getBackgroundColor());
        bindSpacers(item.getSpacers());
        final t tokenizedEvent = item.getTokenizedEvent();
        final AtomAction action = item.getAction();
        setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileItemView$bind$lambda$18$$inlined$bindClick$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t tVar = t.this;
                if (tVar != null) {
                    onClickEvent.invoke(tVar);
                }
                AtomAction atomAction = action;
                if (atomAction != null) {
                    actionHandler.invoke(atomAction, item);
                }
            }
        });
        this.innerAtomsContainer.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileItemView$bindClick$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReorderTileItemView.this.performClick();
            }
        });
        requestLayout();
        invalidate();
    }

    public final int getTileBackgroundColor() {
        return this.tileBackgroundColor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderTileItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.tileBackgroundColor = androidx.core.content.a.getColor(context, defaultBackgroundColor);
        DefaultConstructorMarker defaultConstructorMarker = null;
        Image image = new Image(context, null, 0, 6, defaultConstructorMarker);
        image.setId(R$id.reorderTileImage);
        int i12 = imageSize;
        ConstraintLayout.b bVar = new ConstraintLayout.b(i12, i12);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41628e = 0;
        image.setLayoutParams(bVar);
        addView(image);
        this.imageView = image;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R$id.reorderTileInnerAtoms);
        linearLayout.setOrientation(1);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41636i = image.getId();
        bVar2.f41642l = image.getId();
        bVar2.f41630f = image.getId();
        bVar2.f41632g = R$id.reorderTileBarrier;
        ((ViewGroup.MarginLayoutParams) bVar2).leftMargin = betweenMargin;
        ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = buttonsMargin;
        linearLayout.setLayoutParams(bVar2);
        addView(linearLayout);
        this.innerAtomsContainer = linearLayout;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R$id.reorderTileBarrier);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41636i = 0;
        bVar3.f41634h = 0;
        bVar3.f41642l = 0;
        constraintLayout.setMinWidth(defaultRightBlockMinWidth);
        constraintLayout.setLayoutParams(bVar3);
        addView(constraintLayout);
        this.rightBlockContainer = constraintLayout;
        int i13 = 6;
        AttributeSet attributeSet2 = null;
        int i14 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i14, i13, defaultConstructorMarker);
        textAtomV2View.setId(R$id.reorderTileQuantityText);
        TextViewExtKt.setTextCopyable(textAtomV2View, false);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41636i = 0;
        bVar4.f41634h = 0;
        bVar4.f41642l = 0;
        textAtomV2View.setLayoutParams(bVar4);
        constraintLayout.addView(textAtomV2View);
        this.quantityTextView = textAtomV2View;
        CartPickerView cartPickerView = new CartPickerView(context, attributeSet2, i14, i13, defaultConstructorMarker);
        cartPickerView.setId(R$id.reorderTileCartPicker);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(UiExtKt.toPx(96), -2);
        bVar5.f41636i = 0;
        bVar5.f41634h = 0;
        ((ViewGroup.MarginLayoutParams) bVar5).topMargin = controllerMargin;
        cartPickerView.setLayoutParams(bVar5);
        constraintLayout.addView(cartPickerView);
        this.cartPickerView = cartPickerView;
        ButtonV3View buttonV3View = new ButtonV3View(context, null, i14, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.reorderTileButton, -2, -2);
        e11.f41636i = 0;
        e11.f41642l = 0;
        e11.f41632g = textAtomV2View.getId();
        buttonV3View.setLayoutParams(e11);
        constraintLayout.addView(buttonV3View);
        this.buttonView = buttonV3View;
        this.backgroundDrawable = k.b(new ReorderTileItemView$backgroundDrawable$2(this));
        this.cartPickerBinder = k.b(ReorderTileItemView$cartPickerBinder$2.INSTANCE);
    }
}
