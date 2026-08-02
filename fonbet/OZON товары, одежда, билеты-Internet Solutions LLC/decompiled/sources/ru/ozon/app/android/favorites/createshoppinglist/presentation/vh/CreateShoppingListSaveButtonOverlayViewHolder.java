package ru.ozon.app.android.favorites.createshoppinglist.presentation.vh;

import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.ActionDelegate;
import ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.FlowActionDelegate;
import ru.ozon.app.android.favorites.createshoppinglist.actiondelegate.ModalActionDelegate;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSaveButtonVO;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.view.CreateShoppingListSaveButtonView;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListSaveButtonOverlayViewHolder;", "Ld20/a;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonVO;", "Ll10/i;", "container", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "viewModel", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;Lkotlin/jvm/functions/Function1;)V", "item", "", "bind", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSaveButtonVO;)V", "Ll10/i;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/ActionDelegate;", "actionDelegate", "Lru/ozon/app/android/favorites/createshoppinglist/actiondelegate/ActionDelegate;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListSaveButtonOverlayViewHolder extends AbstractC6064a<CreateShoppingListSaveButtonVO> {
    private ActionDelegate actionDelegate;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final CreateShoppingListViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListSaveButtonOverlayViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<CreateShoppingListViewModel.Action, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CreateShoppingListViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CreateShoppingListViewModel.Action action) {
            ActionDelegate actionDelegate = CreateShoppingListSaveButtonOverlayViewHolder.this.actionDelegate;
            if (actionDelegate != null) {
                Intrinsics.f(action);
                actionDelegate.handle(action);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListSaveButtonOverlayViewHolder(@NotNull i container, @NotNull CreateShoppingListViewModel viewModel, @NotNull Function1<? super LinearLayout, ? extends View> viewFactory) {
        super(container, new CreateShoppingListSaveButtonOverlayViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(viewFactory));
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).onClick(new CreateShoppingListSaveButtonOverlayViewHolder$actionHandler$1(viewModel)).onComposerAction(new CreateShoppingListSaveButtonOverlayViewHolder$actionHandler$2(viewModel)).buildHandler();
        viewModel.getAction().observe(container.K().f(), new CreateShoppingListSaveButtonOverlayViewHolder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull CreateShoppingListSaveButtonVO item) {
        ActionDelegate flowActionDelegate;
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.setShoppingListInitTitle(item.getNewListTitle());
        this.viewModel.setTrackingData(getTrackingData());
        if (item.getIsModal()) {
            e V11 = this.container.V();
            Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            flowActionDelegate = new ModalActionDelegate((ComposerReferences) V11, this.container.Z(), item.getId(), getTrackingData());
        } else {
            e V12 = this.container.V();
            Intrinsics.g(V12, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
            flowActionDelegate = new FlowActionDelegate((ComposerReferences) V12, this.container.Z(), item.getId(), getTrackingData());
        }
        this.actionDelegate = flowActionDelegate;
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.favorites.createshoppinglist.presentation.view.CreateShoppingListSaveButtonView");
        LargeButtonHolderKt.bind(((CreateShoppingListSaveButtonView) view).getButton(), item.getSaveButton(), this.actionHandler);
    }
}
