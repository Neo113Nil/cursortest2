package ru.ozon.app.android.cart.cartSplitV2;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder;", "", "Landroid/view/ViewGroup;", "container", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "inControlsWidget", "<init>", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Z)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buyOneClickBtn", "bind", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function1;", "Z", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "layoutParams", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buyOneClickButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getBuyOneClickButtonView", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BuyOneClickButtonBinder {

    @NotNull
    private final ButtonV3View buyOneClickButtonView;

    @NotNull
    private final ViewGroup container;
    private final boolean inControlsWidget;

    @NotNull
    private final ConstraintLayout.b layoutParams;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/BuyOneClickButtonBinder$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuyOneClickButtonBinder(@NotNull ViewGroup container, @NotNull Function1<? super AtomAction, Unit> onAction, boolean z11) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.container = container;
        this.onAction = onAction;
        this.inControlsWidget = z11;
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i11 = DP_12;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        bVar.setMarginStart(DP_8);
        bVar.setMarginEnd(DP_16);
        bVar.f41655s = R$id.removeButton;
        if (z11) {
            bVar.f41636i = 0;
        } else {
            bVar.f41638j = R$id.dynamicElementsRv;
        }
        this.layoutParams = bVar;
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        buttonV3View.setLayoutParams(bVar);
        buttonV3View.setId(R$id.buyOneClickButtonView);
        container.addView(buttonV3View);
        this.buyOneClickButtonView = buttonV3View;
    }

    public final void bind(ButtonV3DTO buyOneClickBtn) {
        ButtonV3HolderKt.bindOrGone(this.buyOneClickButtonView, buyOneClickBtn, this.onAction);
    }

    @NotNull
    public final ButtonV3View getBuyOneClickButtonView() {
        return this.buyOneClickButtonView;
    }

    public /* synthetic */ BuyOneClickButtonBinder(ViewGroup viewGroup, Function1 function1, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, function1, (i11 & 4) != 0 ? false : z11);
    }
}
