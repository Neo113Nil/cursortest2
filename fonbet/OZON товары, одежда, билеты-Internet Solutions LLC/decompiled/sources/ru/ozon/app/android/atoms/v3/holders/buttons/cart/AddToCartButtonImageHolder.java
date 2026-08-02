package ru.ozon.app.android.atoms.v3.holders.buttons.cart;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonImageView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/cart/AddToCartButtonImageHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonImage;", "Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonImageView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonImageView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onLayoutParamsChanged", "", "lp", "Landroid/view/ViewGroup$MarginLayoutParams;", "onBind", "item", "generateActionParams", "", "action", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$Action;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddToCartButtonImageHolder extends AtomV3<ButtonV3Atom.AddToCartAtom.AddToCartButtonImage, AddToCartButtonImageView> {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.atoms.v3.holders.buttons.cart.AddToCartButtonImageHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Map c11;
            Intrinsics.checkNotNullParameter(it, "it");
            ButtonV3Atom.AddToCartAtom.AddToCartButtonImage addToCartButtonImage = (ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) AddToCartButtonImageHolder.this.getData();
            String str = addToCartButtonImage.isActive() ? "removeFromCart" : "addToCart";
            ButtonV3Atom.AddToCartAtom.Action action = addToCartButtonImage.getAction();
            if (action == null || (c11 = AddToCartButtonImageHolder.this.generateActionParams(action)) == null) {
                c11 = U.c();
            }
            AddToCartButtonImageHolder.this.handleAction(AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, str, c11, 2, null), addToCartButtonImage.getTrackingInfo()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonImageHolder(@NotNull AddToCartButtonImageView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        ViewExtKt.setOnClickListenerThrottle$default(getContainerView(), 0L, new AnonymousClass1(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> generateActionParams(ButtonV3Atom.AddToCartAtom.Action action) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("product_id", action.getId());
        Integer quantity = action.getQuantity();
        linkedHashMap.put("quantity", String.valueOf(quantity != null ? quantity.intValue() : 1));
        return linkedHashMap;
    }

    @Override // ru.ozon.uni.atoms.af.Atom
    public void onLayoutParamsChanged(@NotNull ViewGroup.MarginLayoutParams lp) {
        Intrinsics.checkNotNullParameter(lp, "lp");
        super.onLayoutParamsChanged(lp);
        lp.width = -1;
        lp.height = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonImage item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AddToCartButtonImageHolder) item);
        AddToCartButtonImageView containerView = getContainerView();
        containerView.setState(item.isActive());
        containerView.setSelected(item.isActive());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonImageHolder(@NotNull Context context, String str) {
        this(new AddToCartButtonImageView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
