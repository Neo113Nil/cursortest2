package ru.ozon.uni.atoms.v3.holders.buttons.cart;

import DN.b;
import android.content.Context;
import android.view.View;
import gk0.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¨\u0006\u0019"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/cart/AddToCartButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onRecycle", "", "onBind", "item", "generateActionParams", "", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "mapStyle", "Lkotlin/Pair;", "", "style", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartStyle;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddToCartButtonHolder extends AtomV3<ButtonV3Atom.AddToCartAtom.AddToCartButton, AddToCartButtonView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonV3Atom.AddToCartAtom.AddToCartStyle.values().length];
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3Atom.AddToCartAtom.AddToCartStyle.STYLE_TYPE_PRIMARY_FRESH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonHolder(@NotNull AddToCartButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final Map<String, String> generateActionParams(ButtonV3Atom.AddToCartAtom.Action action) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_id", action.getId());
        Integer quantity = action.getQuantity();
        linkedHashMap.put("quantity", String.valueOf(quantity != null ? quantity.intValue() : 1));
        return linkedHashMap;
    }

    private final Pair<Integer, Integer> mapStyle(ButtonV3Atom.AddToCartAtom.AddToCartStyle style) {
        int i11 = style == null ? -1 : WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? new Pair<>(Integer.valueOf(R$style.SmallButton_Primary_Green), Integer.valueOf(R$style.SmallButton_Primary)) : new Pair<>(Integer.valueOf(R$style.SmallButton_Primary_Green), Integer.valueOf(R$style.SmallButton_Primary_Fresh)) : new Pair<>(Integer.valueOf(R$style.SmallButton_Primary_Green), Integer.valueOf(R$style.SmallButton_Express)) : new Pair<>(Integer.valueOf(R$style.SmallButton_Secondary_Green), Integer.valueOf(R$style.SmallButton_Secondary)) : new Pair<>(Integer.valueOf(R$style.SmallButton_Primary_Green), Integer.valueOf(R$style.SmallButton_Primary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onBind$lambda$2$lambda$1(AddToCartButtonHolder addToCartButtonHolder, View view) {
        Map<String, String> c11;
        ButtonV3Atom.AddToCartAtom.AddToCartButton addToCartButton = (ButtonV3Atom.AddToCartAtom.AddToCartButton) addToCartButtonHolder.getData();
        String str = addToCartButton.isActive() ? "removeFromCart" : "addToCart";
        ButtonV3Atom.AddToCartAtom.Action action = addToCartButton.getAction();
        if (action == null || (c11 = addToCartButtonHolder.generateActionParams(action)) == null) {
            c11 = U.c();
        }
        addToCartButtonHolder.handleAction(AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, str, c11, 2, null), addToCartButton.getTrackingInfo()));
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnClickListener(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonHolder(@NotNull Context context, String str) {
        this((AddToCartButtonView) q.f64554a.g(N.b(AddToCartButtonView.class), context), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.AddToCartAtom.AddToCartButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AddToCartButtonHolder) item);
        AddToCartButtonView containerView = getContainerView();
        containerView.setOnClickListener(new b(this, 7));
        containerView.setAtomText(item.getText());
        CharSequence activeText = item.getActiveText();
        if (activeText == null) {
            activeText = item.getText();
        }
        containerView.setActiveText(activeText);
        ButtonV3Atom.AddToCartAtom.AddToCartStyle theme = item.getTheme();
        if (theme == null) {
            theme = item.getStyle();
        }
        containerView.setStyles(mapStyle(theme));
        containerView.setState(item.isActive());
        containerView.setEnabled(item.getAction() != null);
    }
}
