package ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder;

import Vg.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler.ButtonsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewHolder.recycler.ButtonsDecoration;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewItem.ButtonsVI;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/ButtonsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewItem/ButtonsVI;Ll20/d;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonsDecoration;", "buttonsDecoration", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonsDecoration;", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonsAdapter;", "buttonsAdapter", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewHolder/recycler/ButtonsAdapter;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsViewHolder extends k<ButtonsVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonsAdapter buttonsAdapter;

    @NotNull
    private final ButtonsDecoration buttonsDecoration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsViewHolder(@NotNull RecyclerView containerView, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).customActionHandlers(new ButtonsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        ButtonsDecoration buttonsDecoration = new ButtonsDecoration();
        this.buttonsDecoration = buttonsDecoration;
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(buildHandler);
        this.buttonsAdapter = buttonsAdapter;
        containerView.setAdapter(buttonsAdapter);
        containerView.addItemDecoration(buttonsDecoration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ButtonsVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.buttonsAdapter.submitList(item.getButtons());
        this.buttonsDecoration.setButtonTopMargin(ResourceExtKt.toPx(item.getButtonTopMargin().getPx(), getContext()));
    }
}
