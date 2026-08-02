package ru.ozon.app.android.returns.edit.presentation.photo;

import Vg.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.edit.presentation.viewObject.ReturnImageEditBlockVO;
import ru.ozon.app.android.returns.ui.molecules.reason.NestedReasonsAdapter;
import ru.ozon.app.android.returns.ui.molecules.reason.decoration.NestedReasonsDecoration;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnImageEditBlockVO;", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditView;", "returnImageEditView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "inputViewModel", "<init>", "(Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;LVg/d;Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/edit/presentation/viewObject/ReturnImageEditBlockVO;Ll20/d;)V", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/ui/molecules/reason/NestedReasonsAdapter;", "nestedReasonsAdapter", "Lru/ozon/app/android/returns/ui/molecules/reason/NestedReasonsAdapter;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnImageEditViewHolder extends k<ReturnImageEditBlockVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NestedReasonsAdapter nestedReasonsAdapter;

    @NotNull
    private final ReturnImageEditView returnImageEditView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnImageEditViewHolder(@NotNull ReturnImageEditView returnImageEditView, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull d customActionHandlersStoreFactory, @NotNull InputViewModel inputViewModel) {
        super(returnImageEditView);
        Intrinsics.checkNotNullParameter(returnImageEditView, "returnImageEditView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(inputViewModel, "inputViewModel");
        this.returnImageEditView = returnImageEditView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReturnImageEditViewHolder$actionHandler$1(oneTimePostRefreshHandler)).customActionHandlers(new ReturnImageEditViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        NestedReasonsAdapter nestedReasonsAdapter = new NestedReasonsAdapter(refs, inputViewModel, buildHandler, ReturnImageEditViewHolder$nestedReasonsAdapter$1.INSTANCE);
        this.nestedReasonsAdapter = nestedReasonsAdapter;
        RecyclerView photosRecyclerView = returnImageEditView.getPhotosRecyclerView();
        photosRecyclerView.setItemAnimator(null);
        photosRecyclerView.setAdapter(nestedReasonsAdapter);
        photosRecyclerView.addItemDecoration(new NestedReasonsDecoration(ResourceExtKt.toPx(8), ResourceExtKt.toPx(16)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnImageEditBlockVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnImageEditView returnImageEditView = this.returnImageEditView;
        TextHolderKt.bind$default(returnImageEditView.getTitleTAV(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(returnImageEditView.getValidationTAV(), item.getValidationText(), null, 2, null);
        this.nestedReasonsAdapter.submitList(C7714v.a0(item.getPhotoState()));
    }
}
