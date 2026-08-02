package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.iconButton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonWithIconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedSmallButtonWithIconHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonVO;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonVO;Ll20/d;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonWithIconView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDeliveryDetailIconButtonViewHolder extends k<OrderDeliveryDetailIconButtonVO> {
    public static final int $stable = SmallButtonWithIconView.$stable;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SmallButtonWithIconView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDeliveryDetailIconButtonViewHolder(@NotNull SmallButtonWithIconView view, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderDeliveryDetailIconButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WrappedSmallButtonWithIconHolderKt.bindOrGone(this.view, item.getButton(), this.actionHandler);
    }
}
