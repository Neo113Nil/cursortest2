package ru.ozon.app.android.cart.totalV3.presentation.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.app.android.cart.totalV3.presentation.ViewExtKt;
import ru.ozon.uni.android.controls.button.DataButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.button.DataButtonHolderKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/adapter/ButtonItemViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalButtonVO;", "container", "Landroid/view/View;", "buttonView", "Lru/ozon/uni/android/controls/button/DataButtonView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Landroid/view/View;Lru/ozon/uni/android/controls/button/DataButtonView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonItemViewHolder extends ItemViewHolder<TotalVO.TotalItemVO.TotalButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final DataButtonView buttonView;

    @NotNull
    private final View container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonItemViewHolder(@NotNull View container, @NotNull DataButtonView buttonView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.container = container;
        this.buttonView = buttonView;
        this.actionHandler = actionHandler;
    }

    public void bind(@NotNull TotalVO.TotalItemVO.TotalButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        DataButtonHolderKt.bindOrGone(this.buttonView, item.getButton(), this.actionHandler);
        ViewExtKt.setupMargins(this.container, item.getMargins());
    }
}
