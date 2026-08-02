package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation;

import Vg.c;
import Vg.f;
import Wg0.b;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.f;
import androidx.cardview.widget.CardView;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.common.configurators.legalsResultStateHolder.LegalsResultStateHolder;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bRemoveLegal.B2bRemoveLegalActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetUserLegalEntitiesLayoutBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data.Remove;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.LegalsItemVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/UserLegalEntitiesWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesLayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "legalsResultStateHolder", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;LVg/c;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "confirmation", "Lkotlin/Function0;", "", "successAction", "showRemoveConfirmationDialog", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;Lkotlin/jvm/functions/Function0;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/presentation/LegalsItemVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetUserLegalEntitiesLayoutBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/common/configurators/legalsResultStateHolder/LegalsResultStateHolder;", "LVg/c;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesWidgetViewHolder extends k<LegalsItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final WidgetUserLegalEntitiesLayoutBinding binding;

    @NotNull
    private final c customActionHandlersStore;

    @NotNull
    private final LegalsResultStateHolder legalsResultStateHolder;

    @NotNull
    private final ComposerReferences references;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.UserLegalEntitiesWidgetViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.UserLegalEntitiesWidgetViewHolder$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ AtomActionDTO $action;
            final /* synthetic */ UserLegalEntitiesWidgetViewHolder this$0;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.presentation.UserLegalEntitiesWidgetViewHolder$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C17771 extends AbstractC7737t implements Function0<Unit> {
                final /* synthetic */ UserLegalEntitiesWidgetViewHolder this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C17771(UserLegalEntitiesWidgetViewHolder userLegalEntitiesWidgetViewHolder) {
                    super(0);
                    this.this$0 = userLegalEntitiesWidgetViewHolder;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f71690a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    InterfaceC7851b controller;
                    LegalsResultStateHolder legalsResultStateHolder = this.this$0.legalsResultStateHolder;
                    if (legalsResultStateHolder != null) {
                        legalsResultStateHolder.notifyChangeLegalState();
                    }
                    ComposerReferences composerReferences = this.this$0.references;
                    if (composerReferences == null || (controller = composerReferences.getController()) == null) {
                        return;
                    }
                    InterfaceC7851b.a.a(controller, null, null, null, null, 15);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UserLegalEntitiesWidgetViewHolder userLegalEntitiesWidgetViewHolder, AtomActionDTO atomActionDTO) {
                super(0);
                this.this$0 = userLegalEntitiesWidgetViewHolder;
                this.$action = atomActionDTO;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LegalsItemVO.RemoveVO remove;
                ButtonV3Atom.SmallIconButton button;
                f handler = this.this$0.customActionHandlersStore.getHandler("b2bRemoveLegal");
                Map<String, TokenizedTrackingInfo> map = null;
                B2bRemoveLegalActionHandler b2bRemoveLegalActionHandler = handler instanceof B2bRemoveLegalActionHandler ? (B2bRemoveLegalActionHandler) handler : null;
                if (b2bRemoveLegalActionHandler != null) {
                    b2bRemoveLegalActionHandler.setAdditionalSuccessAction(new C17771(this.this$0));
                }
                Function1 function1 = this.this$0.actionHandler;
                AtomActionDTO atomActionDTO = this.$action;
                LegalsItemVO boundedData = this.this$0.getBoundedData();
                if (boundedData != null && (remove = boundedData.getRemove()) != null && (button = remove.getButton()) != null) {
                    map = button.getTrackingInfo();
                }
                function1.invoke(AtomActionMapperKt.toAtomAction(atomActionDTO, map));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            UserLegalEntitiesWidgetViewHolder userLegalEntitiesWidgetViewHolder;
            LegalsItemVO boundedData;
            LegalsItemVO.RemoveVO remove;
            Remove.Confirmation confirmation;
            Map<String, String> params;
            LegalsItemVO.RemoveVO remove2;
            ButtonV3Atom.SmallIconButton button;
            Intrinsics.checkNotNullParameter(it, "it");
            LegalsItemVO boundedData2 = UserLegalEntitiesWidgetViewHolder.this.getBoundedData();
            String str = null;
            AtomActionDTO action = (boundedData2 == null || (remove2 = boundedData2.getRemove()) == null || (button = remove2.getButton()) == null) ? null : button.getAction();
            if (action != null && (params = action.getParams()) != null) {
                str = params.get("postData");
            }
            if (str == null || (boundedData = (userLegalEntitiesWidgetViewHolder = UserLegalEntitiesWidgetViewHolder.this).getBoundedData()) == null || (remove = boundedData.getRemove()) == null || (confirmation = remove.getConfirmation()) == null) {
                return;
            }
            userLegalEntitiesWidgetViewHolder.showRemoveConfirmationDialog(confirmation, new AnonymousClass1(UserLegalEntitiesWidgetViewHolder.this, action));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserLegalEntitiesWidgetViewHolder(@NotNull WidgetUserLegalEntitiesLayoutBinding binding, @NotNull ComposerReferences references, @NotNull LegalsResultStateHolder legalsResultStateHolder, @NotNull c customActionHandlersStore) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(legalsResultStateHolder, "legalsResultStateHolder");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.legalsResultStateHolder = legalsResultStateHolder;
        this.customActionHandlersStore = customActionHandlersStore;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new UserLegalEntitiesWidgetViewHolder$actionHandler$1(this)).buildHandler();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        atomsAdapter.setOnAction(new ActionHandler.Builder(references, this).buildHandler());
        HorizontalAtomsLayout horizontalAtomsLayout = binding.controlsAtom;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        Context context = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new ControlsDecoration(context));
        View clickableAreaSibv = binding.clickableAreaSibv;
        Intrinsics.checkNotNullExpressionValue(clickableAreaSibv, "clickableAreaSibv");
        ViewExtKt.setOnClickListenerThrottle$default(clickableAreaSibv, 0L, new AnonymousClass2(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveConfirmationDialog(Remove.Confirmation confirmation, final Function0<Unit> successAction) {
        f.a aVar = new f.a(getContext());
        aVar.setTitle(confirmation.getTitle());
        aVar.f(confirmation.getSubtitle());
        aVar.h(confirmation.getCancelButtonText(), new b(1));
        aVar.m(confirmation.getSubmitButtonText(), new DialogInterface.OnClickListener() { // from class: jv.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                Function0.this.invoke();
            }
        });
        aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalsItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomV2View titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        TextAtomV2View paypropsTav = this.binding.paypropsTav;
        Intrinsics.checkNotNullExpressionValue(paypropsTav, "paypropsTav");
        TextHolderKt.bindOrGone$default(paypropsTav, item.getPayprops(), null, 2, null);
        TextAtomV2View addressTav = this.binding.addressTav;
        Intrinsics.checkNotNullExpressionValue(addressTav, "addressTav");
        TextHolderKt.bindOrGone$default(addressTav, item.getAddress(), null, 2, null);
        SmallIconButtonView removeSibv = this.binding.removeSibv;
        Intrinsics.checkNotNullExpressionValue(removeSibv, "removeSibv");
        LegalsItemVO.RemoveVO remove = item.getRemove();
        WrappedIconButtonHolderKt.bindOrGone$default(removeSibv, remove != null ? remove.getButton() : null, null, 2, null);
        AtomsAdapter adapter = this.binding.controlsAtom.getAdapter();
        if (adapter != null) {
            Context context = getContext();
            List<AtomDTO> controls = item.getControls();
            if (controls == null) {
                controls = K.f71697a;
            }
            adapter.bind(context, controls);
        }
    }
}
