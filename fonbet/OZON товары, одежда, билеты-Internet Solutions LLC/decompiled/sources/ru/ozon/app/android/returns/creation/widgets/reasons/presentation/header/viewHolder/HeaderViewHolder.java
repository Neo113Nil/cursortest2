package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewHolder;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsHeaderBinding;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewItem.HeaderVI;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewHolder/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewItem/HeaderVI;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsHeaderBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsHeaderBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewItem/HeaderVI;Ll20/d;)V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsHeaderBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderViewHolder extends k<HeaderVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationReasonsHeaderBinding binding;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HeaderViewHolder(@NotNull ReturnCreationReasonsHeaderBinding binding, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onPreProcess(new HeaderViewHolder$actionHandler$1(oneTimePostRefreshHandler)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVI item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnCreationReasonsHeaderBinding returnCreationReasonsHeaderBinding = this.binding;
        TextAtomV2View titleTav = returnCreationReasonsHeaderBinding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind(titleTav, item.getTitle(), this.actionHandler);
        TextAtomV2View subtitleTav = returnCreationReasonsHeaderBinding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        TextHolderKt.bind(subtitleTav, item.getSubtitle(), this.actionHandler);
    }
}
