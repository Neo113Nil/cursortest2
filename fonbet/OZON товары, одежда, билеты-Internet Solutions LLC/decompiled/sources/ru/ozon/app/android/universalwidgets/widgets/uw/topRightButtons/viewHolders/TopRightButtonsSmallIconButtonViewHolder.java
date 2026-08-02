package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.viewHolders;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.storefrontcommonwidgets.databinding.ProductItemSmallIconAtomBinding;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/viewHolders/TopRightButtonsSmallIconButtonViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "atom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lkotlin/jvm/functions/Function1;)V", "", "dp8", "I", "dp4", "Lru/ozon/app/android/storefrontcommonwidgets/databinding/ProductItemSmallIconAtomBinding;", "binding", "Lru/ozon/app/android/storefrontcommonwidgets/databinding/ProductItemSmallIconAtomBinding;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsSmallIconButtonViewHolder extends j {

    @NotNull
    private final ProductItemSmallIconAtomBinding binding;
    private final int dp4;
    private final int dp8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRightButtonsSmallIconButtonViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp4 = ResourceExtKt.toPx(4);
        ProductItemSmallIconAtomBinding bind = ProductItemSmallIconAtomBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    public final void bind(@NotNull ButtonV3Atom.SmallIconButton atom, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        SmallIconButtonView smallIconButtonView = this.binding.trSmallIconButton;
        Intrinsics.f(smallIconButtonView);
        WrappedIconButtonHolderKt.bindOrGone(smallIconButtonView, atom, actionHandler);
        int i11 = this.dp8;
        int i12 = this.dp4;
        smallIconButtonView.setPadding(i11, i12, i11, i12);
    }
}
