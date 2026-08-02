package ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewHolder;

import AU.a;
import Vg.d;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.ui.databinding.OpenCloudWidgetBinding;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewObject.OpenCloudVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00120 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewHolder/OpenCloudViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewObject/OpenCloudVO;", "Lru/ozon/app/android/returns/ui/databinding/OpenCloudWidgetBinding;", "binding", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/ui/databinding/OpenCloudWidgetBinding;LVg/d;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/View;", "view", "", "onClick", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewObject/OpenCloudVO;Ll20/d;)V", "Lru/ozon/app/android/returns/ui/databinding/OpenCloudWidgetBinding;", "LVg/d;", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewHolder/OpenCloudComposerActionWithActionHandler;", "openCloudComposerActionWithActionHandler", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewHolder/OpenCloudComposerActionWithActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OpenCloudViewHolder extends k<OpenCloudVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final OpenCloudWidgetBinding binding;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final OneTimePostRefreshHandler oneTimePostRefreshHandler;

    @NotNull
    private final OpenCloudComposerActionWithActionHandler openCloudComposerActionWithActionHandler;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OpenCloudViewHolder(@NotNull OpenCloudWidgetBinding binding, @NotNull d customActionHandlersStoreFactory, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull ActionV2Repository actionV2Repository, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.oneTimePostRefreshHandler = oneTimePostRefreshHandler;
        OpenCloudComposerActionWithActionHandler openCloudComposerActionWithActionHandler = new OpenCloudComposerActionWithActionHandler(actionV2Repository, refs);
        this.openCloudComposerActionWithActionHandler = openCloudComposerActionWithActionHandler;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new OpenCloudViewHolder$actionHandler$1(openCloudComposerActionWithActionHandler)).customActionHandlers(new OpenCloudViewHolder$actionHandler$2(this)).onPreProcess(new OpenCloudViewHolder$actionHandler$3(oneTimePostRefreshHandler)).buildHandler();
        int i11 = 1;
        binding.getConstraintLayout().setOnClickListener(new a(this, i11));
        binding.textTav.setOnClickListener(new a(this, i11));
        binding.iconIv.setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick(View view) {
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        OpenCloudVO boundData = getBoundData();
        if (boundData == null || (common = boundData.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        this.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OpenCloudVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        OpenCloudWidgetBinding openCloudWidgetBinding = this.binding;
        TextAtomV2View textTav = openCloudWidgetBinding.textTav;
        Intrinsics.checkNotNullExpressionValue(textTav, "textTav");
        TextHolderKt.bind$default(textTav, item.getText(), null, 2, null);
        IconView iconIv = openCloudWidgetBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        IconHolderKt.bind$default(iconIv, item.getIcon(), null, 2, null);
    }
}
