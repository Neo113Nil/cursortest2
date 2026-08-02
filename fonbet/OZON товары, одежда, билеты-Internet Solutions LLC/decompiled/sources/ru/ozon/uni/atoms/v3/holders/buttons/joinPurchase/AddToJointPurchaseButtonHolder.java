package ru.ozon.uni.atoms.v3.holders.buttons.joinPurchase;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.appearance.StyleAppearance;
import ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase.JointPurchaseButtonWithQuantityView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.extensions.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/buttons/joinPurchase/AddToJointPurchaseButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToJointPurchaseButton;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/jointpurchase/JointPurchaseButtonWithQuantityView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/jointpurchase/JointPurchaseButtonWithQuantityView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "createAction", "Lru/ozon/uni/atoms/af/AtomAction;", "id", "data", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddToJointPurchaseButtonHolder extends AtomV3<ButtonV3Atom.AddToJointPurchaseButton, JointPurchaseButtonWithQuantityView> {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/android/uikit/view/atoms/buttons/jointpurchase/JointPurchaseButtonWithQuantityView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.atoms.v3.holders.buttons.joinPurchase.AddToJointPurchaseButtonHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<JointPurchaseButtonWithQuantityView, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView) {
            invoke2(jointPurchaseButtonWithQuantityView);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JointPurchaseButtonWithQuantityView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction createAction = AddToJointPurchaseButtonHolder.this.createAction("plusButtonClick", (ButtonV3Atom.AddToJointPurchaseButton) AddToJointPurchaseButtonHolder.this.getData());
            if (createAction != null) {
                AddToJointPurchaseButtonHolder.this.handleAction(createAction);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/android/uikit/view/atoms/buttons/jointpurchase/JointPurchaseButtonWithQuantityView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.atoms.v3.holders.buttons.joinPurchase.AddToJointPurchaseButtonHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<JointPurchaseButtonWithQuantityView, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView) {
            invoke2(jointPurchaseButtonWithQuantityView);
            return Unit.f71690a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(JointPurchaseButtonWithQuantityView it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction createAction = AddToJointPurchaseButtonHolder.this.createAction("minusButtonClick", (ButtonV3Atom.AddToJointPurchaseButton) AddToJointPurchaseButtonHolder.this.getData());
            if (createAction != null) {
                AddToJointPurchaseButtonHolder.this.handleAction(createAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToJointPurchaseButtonHolder(@NotNull JointPurchaseButtonWithQuantityView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnPlusClick(new AnonymousClass1());
        getContainerView().setOnMinusClick(new AnonymousClass2());
        WrappedButtonHolderKt.bind$default(getContainerView().getAtomButton(), new ButtonV3Atom.SmallButton(OzonSpannableStringKt.toOzonSpannableString(""), null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null), null, null, null, 116, null), null, 2, null);
        getContainerView().setupClick();
        StyleAppearance ofText$default = StyleAppearance.Companion.ofText$default(StyleAppearance.INSTANCE, null, 1, null);
        ofText$default.read(getContext(), R$style.JoinPurchaseButton);
        ofText$default.apply(getContainerView().getAtomButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction createAction(String id2, ButtonV3Atom.AddToJointPurchaseButton data) {
        if (data.getAction() == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, id2, U.j(new Pair("product_id", data.getAction().getProductId()), new Pair("purchase_id", data.getAction().getJointPurchaseId()), new Pair("count", String.valueOf(getContainerView().getCount())), new Pair("minCount", String.valueOf(getContainerView().getMinCount()))), 2, null), data.getTrackingInfo());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.AddToJointPurchaseButton item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AddToJointPurchaseButtonHolder) item);
        JointPurchaseButtonWithQuantityView containerView = getContainerView();
        containerView.setMinCount(1);
        containerView.setAvailableCount(item.getAvailableQtyInStock());
        containerView.setCount(item.getCurrentQty());
        containerView.getAtomButton().setText(item.getText());
        containerView.onBindComplete();
        if (item.getAction() != null) {
            ViewExtKt.enable(containerView);
        } else {
            ViewExtKt.disable(containerView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddToJointPurchaseButtonHolder(@NotNull Context context, String str) {
        this(new JointPurchaseButtonWithQuantityView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
